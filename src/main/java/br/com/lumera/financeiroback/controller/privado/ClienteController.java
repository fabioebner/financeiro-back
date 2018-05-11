package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.entity.privado.Cliente;
import br.com.lumera.financeiroback.service.privado.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired private ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> finAll(){
        return clienteService.findAll();
    }


    @GetMapping("/")///?nome=C&page=1&size=5&sort=id,desc
    public Page<Cliente> findByNome(@PathParam(value = "nome") String nome, @PageableDefault(sort = { "nome"}, direction = Sort.Direction.ASC)  Pageable pagina){
        return clienteService.findByNomeStartingWithIgnoreCase(nome, pagina);
    }
}
