package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.entity.privado.Cliente;
import br.com.lumera.financeiroback.service.privado.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired private ClienteService clienteService;

    @GetMapping("/")
    public List<Cliente> finAll(){
        return clienteService.findAll();
    }
}
