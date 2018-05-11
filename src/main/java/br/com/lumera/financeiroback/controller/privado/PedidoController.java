package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.controller.exceptions.NotFoundException;
import br.com.lumera.financeiroback.entity.privado.Pedido;
import br.com.lumera.financeiroback.entity.privado.ViewPedido;
import br.com.lumera.financeiroback.service.privado.PedidoService;
import br.com.lumera.financeiroback.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoController {


    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    private PedidoService pedidoService;
    //        logger.info("Usuario recuperado do token: " + tokenUtil.recuperarVariavelToken("usuarioId"));

    @GetMapping("/")
    public List<ViewPedido> findAll(){
        return pedidoService.findAll();
    }
    @GetMapping("/{id}")
    public Pedido findBydId(@PathVariable Long id){
        return  pedidoService.findById(id);
    }
}
