package br.com.lumera.financeiroback.repository.privado;

import br.com.lumera.financeiroback.entity.privado.CustasAnteriorVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface CustasAnteriorRepository extends JpaRepository<CustasAnteriorVO, Long> {
    @Query(nativeQuery = true, value = "SELECT 1 as id, coalesce(sum(custas1),0) as custas1, \n" +
            "             coalesce(sum(custas2),0) as custas2, \n" +
            "             coalesce(sum(custas3),0) as custas3, \n" +
            "             coalesce(sum(custas4),0) as custas4, \n" +
            "             coalesce(sum(custas5),0) as custas5, \n" +
            "             coalesce(sum(custas6),0) as custas6, \n" +
            "             coalesce(sum(custas7),0) as custas7, \n" +
            "             coalesce(sum(custas8),0) as custas8, \n" +
            "             coalesce(sum(custas9),0) as custas9, \n" +
            "             coalesce(sum(custas10),0) as custas10 \n" +
            "              FROM tb_movimentacao_protocolo_servico_custas mpsc  \n" +
            "             JOIN tb_movimentacao_protocolo_servico mps ON mpsc.movimentacao_protocolo_servico_id = mps.id \n" +
            "             JOIN tb_movimentacao_pedido_protocolo mp ON mps.movimentacao_pedido_protocolo_id = mp.id \n" +
            "             WHERE movimentacao_id = (SELECT movimentacao_id FROM tb_movimentacao_pedido_protocolo WHERE protocolo_id = ?1 order by movimentacao_id desc limit 1)"
    )
    CustasAnteriorVO findCustasAnteriorByProtocolo(String id);
}
