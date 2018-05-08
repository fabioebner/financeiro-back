package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.controller.exceptions.InternalServerError;
import br.com.lumera.financeiroback.entity.FormaPagamento;
import br.com.lumera.financeiroback.entity.Usuario;
import br.com.lumera.financeiroback.entity.privado.*;
import br.com.lumera.financeiroback.service.FormaPagamentoService;
import br.com.lumera.financeiroback.service.privado.MovimentacaoService;
import br.com.lumera.financeiroback.service.privado.PedidoService;
import br.com.lumera.financeiroback.util.TokenUtil;
import br.com.lumera.financeiroback.vo.privado.MovimentacaoVo;
import br.com.lumera.financeiroback.vo.privado.PagamentoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    private MovimentacaoService movimentacaoService;
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @PostMapping("/")
    public Long save(@RequestBody MovimentacaoVo movimentacao){
        Long usuarioId =  new Long((Integer) tokenUtil.recuperarVariavelToken("usuarioId"));
        Cliente cliente = null;
        if(movimentacao.getRecibo().getClienteId() != null){
            cliente = new Cliente();
            cliente.setId(movimentacao.getRecibo().getClienteId());
        }
        Set<MovimentacaoPagamento> pagamentos = new HashSet<>();
        for(PagamentoVO pagamento: movimentacao.getPagamentos()){//
            FormaPagamento formaPagamento = formaPagamentoService.findOne(pagamento.getId());
            if(formaPagamento == null){
                throw new InternalServerError("Forma de pagamento "+ pagamento.getId()+ " não encontrado");
            }
            pagamentos.add(new MovimentacaoPagamento(formaPagamento, pagamento.getValorInformado()));
        }

        Set<MovimentacaoPedidoProtocolo> pedidoProtocolos = new HashSet<>();
        for(Long pedidoId : movimentacao.getPedidos()){
            Pedido pedidoSelecionado  = pedidoService.findById(pedidoId);
            if(pedidoSelecionado == null){
                throw new InternalServerError("Pedido "+ pedidoId + " não encontrado");
            }
            for(Protocolo protocolo : pedidoSelecionado.getProtocolos()){
                Set<MovimentacaoProtocoloServico> movimentacaoProtocoloServicos = new HashSet<>();
                for(ProtocoloServico protocoloServico : protocolo.getServicos()){
                    Set<MovimentacaoProtocoloServicoCustas> movimentacaoProtocoloServicoCustas = new HashSet<>();
                    for(ProtocoloServicoCustas servicoCustas : protocoloServico.getCustas()){
                        movimentacaoProtocoloServicoCustas.add(MovimentacaoProtocoloServicoCustas.cloneFromPrototocoloServicoCustas(servicoCustas));
                    }
                    movimentacaoProtocoloServicos.add(MovimentacaoProtocoloServico.cloneFromProtocoloServico(protocoloServico, movimentacaoProtocoloServicoCustas, protocolo.getId()));
                }
                pedidoProtocolos.add(new MovimentacaoPedidoProtocolo(pedidoSelecionado, protocolo, movimentacaoProtocoloServicos));
            }
        }

        Movimentacao novaMovimentacao = new Movimentacao(LocalDateTime.now(),cliente, movimentacao.getRecibo().getNome(), movimentacao.getRecibo().getDocumento(), BigDecimal.ZERO
                , BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO
                , BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
                new Usuario(usuarioId), pedidoProtocolos, pagamentos);

        movimentacaoService.save(novaMovimentacao);
        return  novaMovimentacao.getId();
    }
}
