CREATE OR REPLACE VIEW view_pedido as
SELECT ped.*,
    coalesce((SELECT sum(coalesce(custas1,0)+
        coalesce(custas2,0)+
        coalesce(custas3,0)+
        coalesce(custas4,0)+
        coalesce(custas5,0)+
        coalesce(custas6,0)+
        coalesce(custas7,0)+
        coalesce(custas8,0)+
        coalesce(custas9,0)+
        coalesce(custas10,0)) FROM tb_protocolo_servico ps
    JOIN tb_protocolo_servico_custas psc ON psc.protocolo_servico_id = ps.id
    WHERE protocolo_id = prot.id
    ),0) as valor,
    coalesce((
    SELECT
    (
      SELECT  sum(coalesce(custas1,0)+
        coalesce(custas2,0)+
        coalesce(custas3,0)+
        coalesce(custas4,0)+
        coalesce(custas5,0)+
        coalesce(custas6,0)+
        coalesce(custas7,0)+
        coalesce(custas8,0)+
        coalesce(custas9,0)+
        coalesce(custas10,0)) FROM tb_movimentacao_protocolo_servico mps
      JOIN tb_movimentacao_protocolo_servico_custas mpsc ON mpsc.movimentacao_protocolo_servico_id = mps.id
	and mps.protocolo_id = mpp.protocolo_id
    ) as pago
     FROM tb_movimentacao_pedido_protocolo mpp
    WHERE protocolo_id = prot.id
    ),0) as pago_anteriormente
FROM tb_pedido ped
JOIN tb_protocolo prot ON prot.pedido_id = ped.id
WHERE
    (coalesce((SELECT sum(coalesce(custas1,0)+
        coalesce(custas2,0)+
        coalesce(custas3,0)+
        coalesce(custas4,0)+
        coalesce(custas5,0)+
        coalesce(custas6,0)+
        coalesce(custas7,0)+
        coalesce(custas8,0)+
        coalesce(custas9,0)+
        coalesce(custas10,0)) FROM tb_protocolo_servico ps
    JOIN tb_protocolo_servico_custas psc ON psc.protocolo_servico_id = ps.id
    WHERE protocolo_id = prot.id
    ),0)
    -
    coalesce((
    SELECT
    (
      SELECT  sum(coalesce(custas1,0)+
        coalesce(custas2,0)+
        coalesce(custas3,0)+
        coalesce(custas4,0)+
        coalesce(custas5,0)+
        coalesce(custas6,0)+
        coalesce(custas7,0)+
        coalesce(custas8,0)+
        coalesce(custas9,0)+
        coalesce(custas10,0)) FROM tb_movimentacao_protocolo_servico mps
      JOIN tb_movimentacao_protocolo_servico_custas mpsc ON mpsc.movimentacao_protocolo_servico_id = mps.id
	and mps.protocolo_id = mpp.protocolo_id
    ) as pago
     FROM tb_movimentacao_pedido_protocolo mpp
    WHERE protocolo_id = prot.id
    ),0)) != 0