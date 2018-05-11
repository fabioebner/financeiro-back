package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.Servico;
import br.com.lumera.financeiroback.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {
    @Autowired private ServicoRepository servicoRepository;

    public Servico save(Servico servico){
        return servicoRepository.save(servico);
    }

    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    public List<Servico> findByCartorioNatureza(Long cartorioNatureza, Pageable page) {
        return servicoRepository.findByCartorioNatureza(cartorioNatureza, page);
    }
}
