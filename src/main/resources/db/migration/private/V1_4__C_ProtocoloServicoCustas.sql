CREATE TABLE tb_protocolo_servico_custas
(
  id SERIAL PRIMARY KEY,
  protocolo_servico_id BIGINT REFERENCES tb_protocolo_servico(id),
  valor_base numeric(15,2),
  tabela_custa character varying(250) NOT NULL,
  quantidade bigint DEFAULT 0,
  custas1 numeric(15,2),
  custas2 numeric(15,2),
  custas3 numeric(15,2),
  custas4 numeric(15,2),
  custas5 numeric(15,2),
  custas6 numeric(15,2),
  custas7 numeric(15,2),
  custas8 numeric(15,2),
  custas9 numeric(15,2),
  custas10 numeric(15,2)
);

INSERT INTO tb_pedido (usuario_id, criado, identificacao, apresentante, apresentante_documento) VALUES (1, '2018-01-01 12:12:22', 'identificacao', 'apresentante', 'doc');
INSERT INTO tb_protocolo(id,pedido_id, natureza, codigo, usuario_id, criado) VALUES ('TN-123', 1, 'Notas', 123,1, now());
INSERT INTO tb_protocolo_servico(protocolo_id,valor_base, forma_calculo_id,servico_id) VALUES ('TN-123', 1, 1,1);
INSERT INTO tb_protocolo_servico_custas(protocolo_servico_id, valor_base, tabela_custa, quantidade, custas1,custas2, custas3, custas4, custas5, custas6, custas7, custas8, custas9, custas10) VALUES (1,1,'1A',1,1,1,1,1,1,0,0,0,0,0);