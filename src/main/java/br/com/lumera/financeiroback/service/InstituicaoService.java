package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.Instituicao;
import br.com.lumera.financeiroback.repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituicaoService {
    @Autowired private InstituicaoRepository instituicaoRepository;

    public Instituicao findById(Long id){
        return instituicaoRepository.findById(id).get();
    }
}
