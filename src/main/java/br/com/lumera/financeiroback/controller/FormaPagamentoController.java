package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.FormaPagamento;
import br.com.lumera.financeiroback.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formapagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @GetMapping(value = "/")
    public List<FormaPagamento> findAll(){
        return this.formaPagamentoService.findAll();
    }
}
