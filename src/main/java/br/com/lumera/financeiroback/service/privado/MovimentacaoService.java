package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.entity.privado.CustasAnteriorVO;
import br.com.lumera.financeiroback.entity.privado.Movimentacao;
import br.com.lumera.financeiroback.repository.privado.CustasAnteriorRepository;
import br.com.lumera.financeiroback.repository.privado.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;
    @Autowired
    private CustasAnteriorRepository custasAnteriorRepository;

    public Movimentacao save(Movimentacao movimentacao){
        return this.movimentacaoRepository.save(movimentacao);
    }

    public CustasAnteriorVO findCustasAnteriorByProtocolo(String id) {
        return custasAnteriorRepository.findCustasAnteriorByProtocolo(id);
    }
}
