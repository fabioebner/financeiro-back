package br.com.lumera.financeiroback.repository.privado;

import br.com.lumera.financeiroback.entity.privado.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Page<Cliente> findByNomeStartingWithIgnoreCase(String nome, Pageable pagina);
}
