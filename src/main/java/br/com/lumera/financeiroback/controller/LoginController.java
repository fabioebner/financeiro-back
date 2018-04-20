package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.Usuario;
import br.com.lumera.financeiroback.service.UsuarioService;
import br.com.lumera.financeiroback.util.TokenUtil;
import br.com.lumera.financeiroback.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    TokenUtil tokenUtil;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String login(){
        return "foi Login";
    }

    @PostMapping("/")
    public boolean login(String username, String password){
        return true;
    }

    @JsonView(View.Bootstrap.class)
    @GetMapping("/bootstrap/")
    public Usuario bootstrapApplicacao(){
        Long usuarioId = Long.parseLong(tokenUtil.recuperarVariavelToken("usuarioId").toString());
        return usuarioService.findById(usuarioId);
    }

}