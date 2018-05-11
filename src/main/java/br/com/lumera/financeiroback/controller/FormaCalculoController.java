package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.service.TabelaCustaService;
import br.com.lumera.financeiroback.vo.FormaCalculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formacalculo")
public class FormaCalculoController {
    @Autowired private TabelaCustaService tabelaCustaService;

    @GetMapping("/")
    public List<FormaCalculo> findAll() throws Exception {
        return tabelaCustaService.getFormaCalculo();
    }

}
