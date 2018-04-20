package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.Usuario;
import br.com.lumera.financeiroback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }

}
