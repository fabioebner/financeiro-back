package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.FormaPagamento;
import br.com.lumera.financeiroback.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> findAll(){
        return formaPagamentoRepository.findAll(Sort.by("nome"));
    }
}
