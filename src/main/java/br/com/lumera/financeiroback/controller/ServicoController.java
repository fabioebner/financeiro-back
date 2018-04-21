package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.Servico;
import br.com.lumera.financeiroback.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {
    @Autowired private ServicoService servicoService;

    @PutMapping("/")
    public Servico save(@RequestBody @Valid  Servico servico){
        return servicoService.save(servico);
    }
    @GetMapping("/")
    public List<Servico> findAll(){
        return servicoService.findAll();
    }
}
