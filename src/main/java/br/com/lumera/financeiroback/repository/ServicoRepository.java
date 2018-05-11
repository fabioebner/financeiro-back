package br.com.lumera.financeiroback.repository;

import br.com.lumera.financeiroback.entity.Servico;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    List<Servico> findByCartorioNatureza(Long cartorioNatureza, Pageable page);
}
