package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.FormaPagamento;
import br.com.lumera.financeiroback.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> findAll(){
        return formaPagamentoRepository.findAll(Sort.by("nome"));
    }

    public FormaPagamento findOne(Long id) {
        Optional<FormaPagamento> retorno = formaPagamentoRepository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }
}
