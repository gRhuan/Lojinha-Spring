-- Inserindo dados na tabela produtos
INSERT INTO produtos (nome, descricao, estoque, valor) VALUES 
('Smartphone', 'Celular com 128GB de armazenamento', 50, 1500.00),
('Notebook', 'Notebook 15 polegadas com 8GB RAM', 30, 3500.00),
('Fone de Ouvido', 'Fone de ouvido sem fio Bluetooth', 100, 250.00),
('Monitor', 'Monitor LED 24 polegadas', 20, 800.00),
('Teclado Mecânico', 'Teclado mecânico com iluminação RGB', 70, 200.00);

-- Inserindo dados na tabela funcionarios
INSERT INTO funcionarios (nome, cpf, salario, email, cargo, codigo) VALUES
('João Silva', '12345678900', 2500.00, 'joao@empresa.com', 'Vendedor', 101),
('Maria Souza', '98765432100', 3000.00, 'maria@empresa.com', 'Gerente', 102),
('Carlos Pereira', '55555555555', 2200.00, 'carlos@empresa.com', 'Assistente', 103);

-- Inserindo dados na tabela clientes
INSERT INTO clientes (nome, cpf, email, endereco, celular) VALUES
('Ana Costa', '33333333333', 'ana@exemplo.com', 'Rua 1', '11987654321'),
('Bruno Lima', '44444444444', 'bruno@exemplo.com', 'Rua 2', '11912345678'),
('Carla Mendes', '55555555555', 'carla@exemplo.com', 'Rua 3', '11999998888');
