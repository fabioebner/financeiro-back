CREATE TABLE tb_movimentacao(
    id SERIAL PRIMARY KEY,
    criado TIMESTAMP without time zone NOT NULL,
    apresentante character varying(250),
    apresentante_documento character varying(250),
    vl_troco numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa1 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa2 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa3 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa4 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa5 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa6 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa7 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa8 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa9 numeric(15,2) NOT NULL DEFAULT 0,
    vl_devolucao_custa10 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa1 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa2 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa3 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa4 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa5 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa6 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa7 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa8 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa9 numeric(15,2) NOT NULL DEFAULT 0,
    vl_desconto_custa10 numeric(15,2) NOT NULL DEFAULT 0,
    cliente_id BIGINT REFERENCES tb_cliente(id),
    usuario_id BIGINT REFERENCES public.tb_usuario(id) NOT NULL
);


CREATE TABLE tb_movimentacao_pedido_protocolo(
    id SERIAL PRIMARY KEY,
    movimentacao_id BIGINT REFERENCES tb_movimentacao(id) NOT NULL,
    pedido_id BIGINT REFERENCES tb_pedido(id),
    protocolo_id VARCHAR(250) REFERENCES tb_protocolo(id) NOT NULL
);

CREATE TABLE tb_movimentacao_protocolo_servico
(
  id SERIAL PRIMARY KEY,
  movimentacao_pedido_protocolo_id BIGINT REFERENCES tb_movimentacao_pedido_protocolo(id) NOT NULL,
  protocolo_id VARCHAR(250) REFERENCES tb_protocolo(id),
  valor_base numeric(15,2) NOT NULL DEFAULT 0,
  forma_calculo_id bigint NOT NULL,
  servico_id BIGINT REFERENCES public.tb_servico(id)
);

CREATE TABLE tb_movimentacao_protocolo_servico_custas
(
  id SERIAL PRIMARY KEY,
  movimentacao_protocolo_servico_id BIGINT REFERENCES tb_movimentacao_protocolo_servico(id) NOT NULL,
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

CREATE TABLE tb_movimentacao_pagamento(
  id SERIAL PRIMARY KEY,
  movimentacao_id BIGINT REFERENCES tb_movimentacao(id) NOT NULL,
  valor NUMERIC(13,2) NOT NULL,
  forma_pagamento_id BIGINT REFERENCES public.tb_forma_pagamento(id) NOT NULL
)

