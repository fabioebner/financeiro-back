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

INSERT INTO tb_servico (nome, tabela_custa, deposito_previo, certidao, categoria, cd_cartorio_natureza) VALUES ('Compra e Venda', '1A',true, false, 'Escritura', 3);
INSERT INTO tb_servico (nome, tabela_custa, deposito_previo, certidao, categoria, cd_cartorio_natureza) VALUES ('Compra e Venda 2', '3',true, false, 'Escritura', 1);