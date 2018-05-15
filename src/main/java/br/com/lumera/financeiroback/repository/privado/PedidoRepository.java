package br.com.lumera.financeiroback.repository.privado;

import br.com.lumera.financeiroback.entity.privado.Pedido;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface PedidoRepository  extends JpaRepository<Pedido, Long> {


    @EntityGraph(value = "Pedido.protocolos", type = EntityGraph.EntityGraphType.LOAD)
//    @EntityGraph(value = "GroupInfo.detailWith", type = EntityGraph.EntityGraphType.LOAD)
    @Override
    Optional<Pedido> findById(Long aLong);
}
