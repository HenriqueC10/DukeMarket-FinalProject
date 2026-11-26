/* Comando para criar a tabela Produto */

create table produto (
id INT auto_increment primary key,
codBarras varchar(15),
descricao varchar(30) NOT NULL,
qtd decimal(10,2) default 0,
valorCompra decimal(10,2) default 0,
valorVenda decimal(10,2) default 0,
dataCadastro datetime default current_timestamp);
show tables;
describe produto;

insert into produto(
codBarras, descricao,
qtd, valorCompra, valorVenda)

values ("7891112223332", "Computador DELL OptiPlex 3080",
5.00, 3480.00, 5000.00);

USE henrique_estoque;

SELECT * FROM produto;


/* Comando para criar a tabela Cliente */

USE henrique_estoque;
CREATE TABLE IF NOT EXISTS clientes (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  cpf VARCHAR(15) NOT NULL,
  endereco VARCHAR(255),
  cidade VARCHAR(255),
  uf VARCHAR(2),
  dataCadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

USE henrique_estoque;
SELECT * FROM cliente;
