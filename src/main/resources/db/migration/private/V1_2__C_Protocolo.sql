CREATE TABLE tb_protocolo(
    id VARCHAR(250) NOT NULL PRIMARY KEY,
    pedido_id BIGINT REFERENCES tb_pedido(id),
    natureza VARCHAR(250) NOT NULL,
    codigo BIGINT NOT NULL,
    usuario_id BIGINT  REFERENCES public.tb_usuario (id),
    criado TIMESTAMP without time zone NOT NULL,
    concluido TIMESTAMP without time zone,
    devolvido TIMESTAMP without time zone,
    finalizado TIMESTAMP without time zone,
    valor_finalizado NUMERIC(12,2)
);
