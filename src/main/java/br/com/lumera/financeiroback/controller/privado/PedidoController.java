package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.entity.privado.*;
import br.com.lumera.financeiroback.enuns.Natureza;
import br.com.lumera.financeiroback.repository.privado.PedidoRepository;
import br.com.lumera.financeiroback.service.ServicoService;
import br.com.lumera.financeiroback.service.privado.ClienteService;
import br.com.lumera.financeiroback.service.privado.PedidoService;
import br.com.lumera.financeiroback.service.privado.ProtocoloService;
import br.com.lumera.financeiroback.util.TokenUtil;
import br.com.lumera.financeiroback.vo.CalculoTabela;
import br.com.lumera.financeiroback.vo.PedidoVO;
import br.com.lumera.financeiroback.vo.RetornoCalculoTabela;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")
public class PedidoController {


    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ProtocoloService protocoloService;
    @Autowired
    private ServicoService servicoService;
    @Autowired
    private ClienteService clienteService;

    //        logger.info("Usuario recuperado do token: " + tokenUtil.recuperarVariavelToken("usuarioId"));

    @GetMapping("/")
    public List<ViewPedido> findAll(){
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Pedido findBydId(@PathVariable Long id){
        return  pedidoService.findById(id);
    }

    @PostMapping("/")
    public Long criarPedido(@RequestBody  @Valid  PedidoVO pedidoVo){

        Cliente cliente = null;
        if(pedidoVo.getClienteId() != null)
            cliente = clienteService.findById(pedidoVo.getClienteId());

        Long numeroProtocoloAusente = null;
        synchronized (this){
            numeroProtocoloAusente = Calendar.getInstance().getTimeInMillis();
        }
        HashMap<String, Protocolo> novosProtocolos = new HashMap<>();
        for(RetornoCalculoTabela servico : pedidoVo.getServicos()){
            if(servico.getNumeroProtocolo() == null)
                servico.setNumeroProtocolo(numeroProtocoloAusente);
            String protocoloId = protocoloService.gerarProtocolo(Natureza.findByNome(servico.getNatureza()), servico.getNumeroProtocolo(), servico.isCertidao());
            servico.setProtocoloId(protocoloId);
            if(!novosProtocolos.containsKey(protocoloId)){
                novosProtocolos.put(protocoloId, new Protocolo(
                        protocoloId,
                        servico.getNatureza(),
                        servico.getNumeroProtocolo(),
                        null
                ));
            }
        }

        Set<Protocolo> pedidoProtocolos = new HashSet<>();
        for (Map.Entry<String, Protocolo> entry : novosProtocolos.entrySet()) {
            String protocoloId = entry.getKey();
            Protocolo protocolo = entry.getValue();
            List<RetornoCalculoTabela> servicosProtocolo = pedidoVo.getServicos().stream().filter(servico -> servico.getProtocoloId().equals(protocoloId)).collect(Collectors.toList());
            Set<ProtocoloServico> protocoloServicos = new HashSet<>();
            for(RetornoCalculoTabela retornoCalculoTabela : servicosProtocolo){
                Set<ProtocoloServicoCustas> servicoCustas = new HashSet<>();
                for(CalculoTabela calculoTabela : retornoCalculoTabela.getCalculoTabela()){
                    ProtocoloServicoCustas servicoCusta = new ProtocoloServicoCustas(
                            calculoTabela.getVlBase(),
                            calculoTabela.getNmTabela(),
                            calculoTabela.getQtd(),
                            calculoTabela.getCustas1(),
                            calculoTabela.getCustas2(),
                            calculoTabela.getCustas3(),
                            calculoTabela.getCustas4(),
                            calculoTabela.getCustas5(),
                            calculoTabela.getCustas6(),
                            calculoTabela.getCustas7(),
                            calculoTabela.getCustas8(),
                            calculoTabela.getCustas9(),
                            calculoTabela.getCustas10()
                            );

                    servicoCustas.add(servicoCusta);

                }
                protocoloServicos.add(
                        new ProtocoloServico(
                            retornoCalculoTabela.getValor(),
                            retornoCalculoTabela.getCdFormaCalculo(),
                            servicoService.findById(retornoCalculoTabela.getServicoId()),
                            servicoCustas
                        )
                );
            }
            protocolo.setServicos(protocoloServicos);
            pedidoProtocolos.add(protocolo);
        }




        Pedido pedido = new Pedido(
                new Long((Integer) tokenUtil.recuperarVariavelToken("usuarioId")),
                pedidoVo.getIdentificador(),
                pedidoVo.getApresentante(),
                pedidoVo.getApresentanteDocumento(),
                pedidoProtocolos,
                cliente
        );


        Pedido retorno = pedidoService.save(pedido);
        return retorno.getId();
    }

}
