CREATE TABLE tb_forma_pagamento(
  id SERIAL PRIMARY KEY,
  nome VARCHAR(250) NOT NULL
);

INSERT INTO tb_forma_pagamento (nome) VALUES ('DINHEIRO');
INSERT INTO tb_forma_pagamento (nome) VALUES ('CHEQUE');
INSERT INTO tb_forma_pagamento (nome) VALUES ('CARTÃO CREDITO');
