package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.config.MvcConfig;
import br.com.lumera.financeiroback.entity.privado.Pedido;
import br.com.lumera.financeiroback.service.PedidoService;
import br.com.lumera.financeiroback.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {


    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/")
    public List<Pedido> findAll(){
        logger.info("Usuario recuperado do token: " + tokenUtil.recuperarVariavelToken("usuarioId"));
        return pedidoService.findAll();
    }
}
