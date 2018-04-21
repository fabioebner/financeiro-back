CREATE TABLE tb_protocolo_servico
(
  id SERIAL PRIMARY KEY,
  protocolo_id VARCHAR(250) REFERENCES tb_protocolo(id),
  valor_base numeric(15,2) NOT NULL DEFAULT 0,
  forma_calculo_id bigint NOT NULL,
  servico_id BIGINT REFERENCES public.tb_servico(id)
);