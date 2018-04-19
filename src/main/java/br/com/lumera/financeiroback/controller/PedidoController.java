package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.privado.Pedido;
import br.com.lumera.financeiroback.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/")
    public List<Pedido> findAll(){
        return pedidoService.findAll();
    }
}
