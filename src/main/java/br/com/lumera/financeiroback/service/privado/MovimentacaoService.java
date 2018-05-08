package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.entity.privado.Movimentacao;
import br.com.lumera.financeiroback.repository.privado.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Movimentacao save(Movimentacao movimentacao){
        return this.movimentacaoRepository.save(movimentacao);
    }
}
