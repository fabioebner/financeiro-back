package br.com.lumera.financeiroback.repository.privado;

import br.com.lumera.financeiroback.entity.privado.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
