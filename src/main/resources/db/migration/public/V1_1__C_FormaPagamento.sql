CREATE TABLE tb_forma_pagamento(
  id SERIAL PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  credito BOOLEAN NOT NULL DEFAULT TRUE
);

INSERT INTO tb_forma_pagamento (nome, credito) VALUES ('DINHEIRO', true);
INSERT INTO tb_forma_pagamento (nome, credito) VALUES ('CHEQUE', true);
INSERT INTO tb_forma_pagamento (nome, credito) VALUES ('CARTÃO DEBITO', true);
INSERT INTO tb_forma_pagamento (nome, credito) VALUES ('CARTÃO CREDITO', true);

INSERT INTO tb_forma_pagamento (nome, credito) VALUES ('DINHEIRO', false);