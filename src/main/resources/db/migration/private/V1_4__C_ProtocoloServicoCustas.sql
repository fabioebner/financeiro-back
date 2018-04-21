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