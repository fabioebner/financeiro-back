CREATE OR REPLACE VIEW view_pedido as
SELECT ped.id,
    ped.usuario_id,
    ped.criado,
    ped.identificacao,
    ped.apresentante,
    ped.apresentante_documento,
    ped.cliente_id,
    COALESCE(( SELECT sum(COALESCE(psc.custas1, 0::numeric) + COALESCE(psc.custas2, 0::numeric) + COALESCE(psc.custas3, 0::numeric) + COALESCE(psc.custas4, 0::numeric) + COALESCE(psc.custas5, 0::numeric) + COALESCE(psc.custas6, 0::numeric) + COALESCE(psc.custas7, 0::numeric) + COALESCE(psc.custas8, 0::numeric) + COALESCE(psc.custas9, 0::numeric) + COALESCE(psc.custas10, 0::numeric)) AS sum
           FROM tb_protocolo_servico ps
             JOIN tb_protocolo_servico_custas psc ON psc.protocolo_servico_id = ps.id
          WHERE ps.protocolo_id::text = prot.id::text), 0::numeric
    ) AS valor,

    COALESCE(
	(SELECT sum(COALESCE(mpsc.custas1, 0::numeric) + COALESCE(mpsc.custas2, 0::numeric) +
		COALESCE(mpsc.custas3, 0::numeric) + COALESCE(mpsc.custas4, 0::numeric) + COALESCE(mpsc.custas5, 0::numeric) +
		COALESCE(mpsc.custas6, 0::numeric) + COALESCE(mpsc.custas7, 0::numeric) + COALESCE(mpsc.custas8, 0::numeric) +
		COALESCE(mpsc.custas9, 0::numeric) + COALESCE(mpsc.custas10, 0::numeric)
	) AS sum
	FROM tb_movimentacao_protocolo_servico mps
	JOIN tb_movimentacao_protocolo_servico_custas mpsc ON mpsc.movimentacao_protocolo_servico_id = mps.id
	JOIN tb_movimentacao_pedido_protocolo tmpp ON mps.movimentacao_pedido_protocolo_id = tmpp.id
	AND tmpp.movimentacao_id = (SELECT movimentacao_id
	FROM tb_movimentacao_pedido_protocolo mps
	JOIN tb_movimentacao m ON mps.movimentacao_id = m.id
	WHERE mps.protocolo_id::text = prot.id order by criado desc limit 1)) ,0
    ) AS pago_anteriormente
   FROM tb_pedido ped
     JOIN tb_protocolo prot ON prot.pedido_id = ped.id
   WHERE
    (
     COALESCE(( SELECT sum(COALESCE(psc.custas1, 0::numeric) + COALESCE(psc.custas2, 0::numeric) + COALESCE(psc.custas3, 0::numeric) + COALESCE(psc.custas4, 0::numeric) + COALESCE(psc.custas5, 0::numeric) + COALESCE(psc.custas6, 0::numeric) + COALESCE(psc.custas7, 0::numeric) + COALESCE(psc.custas8, 0::numeric) + COALESCE(psc.custas9, 0::numeric) + COALESCE(psc.custas10, 0::numeric)) AS sum
	   FROM tb_protocolo_servico ps
	     JOIN tb_protocolo_servico_custas psc ON psc.protocolo_servico_id = ps.id
	  WHERE ps.protocolo_id::text = prot.id::text), 0::numeric
    ) -
    COALESCE(
	(SELECT sum(COALESCE(mpsc.custas1, 0::numeric) + COALESCE(mpsc.custas2, 0::numeric) +
		COALESCE(mpsc.custas3, 0::numeric) + COALESCE(mpsc.custas4, 0::numeric) + COALESCE(mpsc.custas5, 0::numeric) +
		COALESCE(mpsc.custas6, 0::numeric) + COALESCE(mpsc.custas7, 0::numeric) + COALESCE(mpsc.custas8, 0::numeric) +
		COALESCE(mpsc.custas9, 0::numeric) + COALESCE(mpsc.custas10, 0::numeric)
	) AS sum
	FROM tb_movimentacao_protocolo_servico mps
	JOIN tb_movimentacao_protocolo_servico_custas mpsc ON mpsc.movimentacao_protocolo_servico_id = mps.id
	JOIN tb_movimentacao_pedido_protocolo tmpp ON mps.movimentacao_pedido_protocolo_id = tmpp.id
	AND tmpp.movimentacao_id = (SELECT movimentacao_id
	FROM tb_movimentacao_pedido_protocolo mps
	JOIN tb_movimentacao m ON mps.movimentacao_id = m.id
	WHERE mps.protocolo_id::text = prot.id order by criado desc limit 1)) ,0
    )  ) != 0
     group by  prot.id, ped.id
     order by ped.id desc
