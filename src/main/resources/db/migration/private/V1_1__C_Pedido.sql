CREATE TABLE tb_pedido(
  id SERIAL PRIMARY KEY,
  usuario_id BIGINT  REFERENCES public.tb_usuario (id),
  criado TIMESTAMP without time zone,
  identificacao VARCHAR(250),
  apresentante  VARCHAR(250),
  apresentante_documento VARCHAR(250),
  cliente_id BIGINT REFERENCES tb_pedido(id)
);