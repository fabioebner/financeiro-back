package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.entity.privado.Cliente;
import br.com.lumera.financeiroback.repository.privado.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Page<Cliente> findByNomeStartingWithIgnoreCase(String nome, Pageable pagina) {
        return clienteRepository.findByNomeStartingWithIgnoreCase(nome, pagina);
    }
}
