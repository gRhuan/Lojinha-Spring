# Lojinha Web 📦

Bem-vindo ao projeto **Lojinha Web**! Este é um projeto de loja online simples, desenvolvido com **Spring Boot** como prática de Programação Orientada a Objetos (POO). A aplicação gerencia informações de produtos, clientes e funcionários em um banco de dados e utiliza controladores para gerenciar as ações.

## 🔧 Tecnologias Utilizadas

- **Java** - Linguagem principal para o backend
- **Spring Boot** - Framework para construção da aplicação
- **Thymeleaf** - Motor de templates para as páginas web
- **Banco de Dados** - Para armazenar produtos, clientes e funcionários
- **Maven** - Para gerenciamento de dependências

## 🗃️ Banco de Dados

O projeto utiliza o banco de dados **H2** por ser uma solução embutida, facilitando os testes e o desenvolvimento local. As configurações do banco de dados estão disponíveis no arquivo `application.properties`, onde você pode definir detalhes como o modo de criação e o URL de acesso ao console do H2.

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **src/main/java**: Código-fonte do projeto.
  - `controller` - Controladores que gerenciam as requisições, como `ProdutosController`, `ClientesController`, `FuncionariosController` e `HomeController`
  - `model` - Modelos de dados para as entidades Produto, Cliente e Funcionário
  - `repository` - Repositórios para acesso ao banco de dados
  - `dto` - Objetos de Transferência de Dados (DTOs), utilizados para trafegar dados entre camadas de maneira segura e eficiente

- **src/main/resources**:
  - `templates/` - Páginas HTML da aplicação, projetadas para facilitar a navegação
  - `application.properties` - Configurações da aplicação (porta do servidor, dados do banco, etc.)

## 🌟 Funcionalidades

Aqui estão algumas das principais funcionalidades do projeto:

- **Cadastro de Produtos, Clientes e Funcionários**: Adicione novos registros na loja.
- **Listagem de Produtos, Clientes e Funcionários**: Visualize todos os registros disponíveis.
- **Atualização de Produtos, Clientes e Funcionários**: Atualize informações de qualquer registro.
- **Remoção de Produtos, Clientes e Funcionários**: Exclua registros da loja.

## 🚀 Como Executar

Para rodar a aplicação localmente, siga os passos:


# Clone o repositório para o seu computador:
```
git clone https://github.com/grhuan/Loja-Spring.git
```
# Navegue até a pasta do projeto:
```
cd Loja-Spring
```
# Execute o projeto com o Maven:
```
./mvnw spring-boot:run
```

Depois, acesse a aplicação no navegador pelo endereço [http://localhost:8080](http://localhost:8080).

## 🌐 Endpoints Principais

Aqui estão alguns dos principais endpoints da aplicação:

# Produtos
- **GET /produtos**: Exibe todos os produtos
- **POST /produtos/adicionar**: Cadastra um novo produto
- **PUT /produtos/{id}**: Atualiza um produto existente
- **DELETE /produtos/{id}**: Remove um produto

# Clientes
- **GET /clientes**: Exibe todos os clientes
- **POST /clientes/adicionar**: Cadastra um novo cliente
- **PUT /clientes/{id}**: Atualiza um cliente existente
- **DELETE /clientes/{id}** Remove um cliente

# Funcionários
- **GET /funcionarios**: Exibe todos os funcionários
- **POST /funcionarios/adicionar**: Cadastra um novo funcionário
- **PUT /funcionarios/{id}**: Atualiza um funcionário existente
- **DELETE /funcionarios/{id}**: Remove um funcionário

## 💬 Contribuindo

Este projeto foi criado para fins de aprendizado. Se você tiver sugestões ou melhorias, sinta-se à vontade para contribuir!

## 📞 Contato

Caso tenha dúvidas ou sugestões, entre em contato por [gladysonfonseca@unifucamp.edu.br](mailto:gladysonfonseca@unifucamp.edu.br).
