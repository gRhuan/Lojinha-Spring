-- Inserindo dados na tabela produtos
INSERT INTO produtos (nome, descricao, estoque, valor) VALUES 
('Smartphone', 'Celular com 128GB de armazenamento', 50, 1500.00),
('Notebook', 'Notebook 15 polegadas com 8GB RAM', 30, 3500.00),
('Fone de Ouvido', 'Fone de ouvido sem fio Bluetooth', 100, 250.00),
('Monitor', 'Monitor LED 24 polegadas', 20, 800.00),
('Teclado Mecânico', 'Teclado mecânico com iluminação RGB', 70, 200.00),
('Tablet', 'Tablet com tela de 10 polegadas e 64GB', 40, 900.00),
('Impressora', 'Impressora a laser multifuncional', 15, 1200.00),
('Câmera Digital', 'Câmera digital com 20MP', 25, 1800.00),
('Mouse Gamer', 'Mouse com sensor de alta precisão', 150, 150.00),
('Caixa de Som Bluetooth', 'Caixa de som portátil com Bluetooth', 80, 300.00);

-- Inserindo dados na tabela funcionarios
INSERT INTO funcionarios (nome, cpf, salario, email, cargo, senha) VALUES
('João Silva', '12345678900', 2500.00, 'joao@empresa.com', 'Vendedor', '123');

-- Inserindo dados na tabela clientes
INSERT INTO clientes (nome, cpf, email, endereco, celular) VALUES
('Ana Costa', '33333333333', 'ana@exemplo.com', 'Rua 1', '11987654321'),
('Bruno Lima', '44444444444', 'bruno@exemplo.com', 'Rua 2', '11912345678'),
('Carla Mendes', '55555555555', 'carla@exemplo.com', 'Rua 3', '11999998888'),
('Marcos Silva', '66666666666', 'marcos@exemplo.com', 'Rua 4', '11955554444'),
('Clara Santos', '77777777777', 'clara@exemplo.com', 'Rua 5', '11933332222'),
('Luciana Pereira', '88888888888', 'luciana@exemplo.com', 'Rua 6', '11922221111'),
('Felipe Andrade', '99999999999', 'felipe@exemplo.com', 'Rua 7', '11911110000'),
('Vanessa Lopes', '00000000000', 'vanessa@exemplo.com', 'Rua 8', '11900009999');
