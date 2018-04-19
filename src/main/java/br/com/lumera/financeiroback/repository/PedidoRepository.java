package br.com.lumera.financeiroback.repository;

import br.com.lumera.financeiroback.entity.privado.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository  extends JpaRepository<Pedido, Long> {
}
