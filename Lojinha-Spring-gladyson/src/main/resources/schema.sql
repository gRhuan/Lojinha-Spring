CREATE TABLE IF NOT EXISTS produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    estoque INT,
    valor DECIMAL(10, 2)
);

-- Tabela para Clientes
CREATE TABLE IF NOT EXISTS clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(40),
    endereco VARCHAR(40),
    celular VARCHAR(13)
);

CREATE TABLE IF NOT EXISTS funcionarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    salario DECIMAL(10, 2) NOT NULL,
    email VARCHAR(40),
    cargo VARCHAR(25),
    senha Varchar(40)
);