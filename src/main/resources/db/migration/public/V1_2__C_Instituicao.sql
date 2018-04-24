CREATE TABLE tb_instituicao(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    cep VARCHAR(250) NOT NULL,
    logradouro VARCHAR(250) NOT NULL,
    numero VARCHAR(250) NOT NULL,
    complemento VARCHAR(250),
    bairro VARCHAR(250) NOT NULL,
    cidade VARCHAR(250) NOT NULL,
    estado VARCHAR(250) NOT NULL,
    cadastro TIMESTAMP WITHOUT TIME ZONE  NOT NULL,
    nome_schema VARCHAR(250) NOT NULL,
    nr_cnpj VARCHAR(250) NOT NULL,
    nm_tabeliao VARCHAR(250) NOT NULL,
    pc_desconto_custa1 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa2 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa3 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa4 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa5 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa6 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa7 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa8 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa9 NUMERIC(12,2) NOT NULL DEFAULT 0,
    pc_desconto_custa10 NUMERIC(12,2) NOT NULL DEFAULT 0

);

CREATE SCHEMA db_1;
CREATE SCHEMA db_2;
CREATE SCHEMA db_3;

INSERT INTO tb_instituicao( nome, cadastro, nome_schema, cep, logradouro, numero, bairro, cidade, estado, nr_cnpj,
nm_tabeliao) VALUES ('Cartorio 1',now(), 'db_1','111380-100','logradouro 1','2','bairro','cidade', 'SP', '12.323.2323/12313-01', 'tabeliao 1');
INSERT INTO tb_instituicao( nome, cadastro, nome_schema, cep, logradouro, numero, bairro, cidade, estado, nr_cnpj,
nm_tabeliao) VALUES ('Cartorio 2', now(), 'db_2','111380-100','logradouro 2','3','bairro','cidade', 'SP', '12.323.2323/12313-01', 'tabeliao 2');
INSERT INTO tb_instituicao( nome, cadastro, nome_schema, cep, logradouro, numero, bairro, cidade, estado, nr_cnpj,
nm_tabeliao) VALUES ('Cartorio 3 ', now(), 'db_3','111380-100','logradouro 3','4','bairro','cidade', 'SP', '12.323.2323/12313-01', 'tabeliao 3');