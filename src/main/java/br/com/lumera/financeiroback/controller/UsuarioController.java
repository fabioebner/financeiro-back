package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.Usuario;
import br.com.lumera.financeiroback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/")
    public Usuario vai(){
        return usuarioRepository.findAll().get(0);
    }
}