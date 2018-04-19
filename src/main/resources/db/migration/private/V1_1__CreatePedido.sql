CREATE TABLE tb_pedido(
  id SERIAL PRIMARY KEY,
  instituicao_id BIGINT REFERENCES public.tb_instituicao (id),
  usuario_id BIGINT  REFERENCES public.tb_usuario (id),
  criacao TIMESTAMP without time zone
);