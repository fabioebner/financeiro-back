package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.Servico;
import br.com.lumera.financeiroback.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{cartorioNatureza}/")
    public Page<Servico> findByCartorioNatureza(@PathVariable Long cartorioNatureza, @PageableDefault(sort = { "nome"}, direction = Sort.Direction.ASC) Pageable page){
        return servicoService.findByCartorioNatureza(cartorioNatureza, page);
    }
}
