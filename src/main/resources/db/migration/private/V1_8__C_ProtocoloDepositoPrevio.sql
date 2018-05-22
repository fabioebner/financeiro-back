CREATE TABLE tb_protocolo_deposito_previo(
  id SERIAL PRIMARY KEY,
  protocolo_id VARCHAR(250) NOT NULL REFERENCES tb_protocolo(id),
  dia TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  valor NUMERIC(13,2) NOT NULL,
  movimentacao_id BIGINT REFERENCES tb_movimentacao(id) NOT NULL
);