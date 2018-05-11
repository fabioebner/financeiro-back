package br.com.lumera.financeiroback.repository;

import br.com.lumera.financeiroback.entity.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
}
