package br.com.lumera.financeiroback.repository;

import br.com.lumera.financeiroback.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {
}
