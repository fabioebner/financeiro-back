package br.com.lumera.financeiroback.repository.privado;

import br.com.lumera.financeiroback.entity.privado.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
