package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.util.TokenUtil;
import br.com.lumera.financeiroback.vo.privado.MovimentacaoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    TokenUtil tokenUtil;

    @PostMapping("/")
    public void save(@RequestBody MovimentacaoVo movimentacao){
        Long usuarioId =  new Long((Integer) tokenUtil.recuperarVariavelToken("usuarioId"));

        logger.info(movimentacao.toString());
    }
}
