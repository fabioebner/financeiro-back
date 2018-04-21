CREATE TABLE tb_servico
(
  id SERIAL PRIMARY KEY,
  nome character varying(250) NOT NULL,
  tabela_custa character varying(10) NOT NULL,
  deposito_previo boolean NOT NULL,
  certidao boolean NOT NULL,
  categoria character varying(250) NOT NULL,
  cd_cartorio_natureza bigint NOT NULL
);