package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.entity.privado.CustasAnteriorVO;
import br.com.lumera.financeiroback.entity.privado.Movimentacao;
import br.com.lumera.financeiroback.entity.privado.MovimentacaoPedidoProtocolo;
import br.com.lumera.financeiroback.repository.privado.CustasAnteriorRepository;
import br.com.lumera.financeiroback.repository.privado.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;
    @Autowired
    private CustasAnteriorRepository custasAnteriorRepository;
    @Autowired
    private ProtocoloDepositoPrevioService protocoloDepositoPrevioService;

    private HashMap<String, BigDecimal> recupeDepositoPrevio(Movimentacao movimentacao){
        HashMap<String, BigDecimal> retorno = new HashMap<>();
        for(MovimentacaoPedidoProtocolo movimentacaoPedidoProtocolo: movimentacao.getPedidoProtocolo()){
            retorno.put(movimentacaoPedidoProtocolo.getProtocolo().getId(), movimentacaoPedidoProtocolo.getVlTotalCustasProtocoloMovimentacao());
        }
        return retorno;
    }

    public Movimentacao save(Movimentacao movimentacao){
        this.movimentacaoRepository.save(movimentacao);
        for (Map.Entry<String, BigDecimal> entry : recupeDepositoPrevio(movimentacao).entrySet()) {
            String protocolo = entry.getKey();
            BigDecimal valor = entry.getValue();
            protocoloDepositoPrevioService.addDepositoPrevio(protocolo, valor, movimentacao.getId());
        }

        return movimentacao;
    }

    @Transactional(readOnly = true)
    public CustasAnteriorVO findCustasAnteriorByProtocolo(String id) {
        return custasAnteriorRepository.findCustasAnteriorByProtocolo(id);
    }
}
