CREATE TABLE tb_cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    documento VARCHAR(250) NOT NULL,
    email VARCHAR(250)
);

INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 1','82.248.048/0001-88');
INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 2','34.564.596/0001-74');
INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 3','12.428.457/0001-80');
INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 4','642.377.344-04');
INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 5','357.368.153-03');
INSERT INTO tb_cliente(nome, documento) VALUES ('cliente 6','074.314.229-20');