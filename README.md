# Lojinha Web 📦

Bem-vindo ao projeto **Lojinha Web**! Este é um projeto de loja online simples, desenvolvido com **Spring Boot** como prática de Programação Orientada a Objetos (POO). A aplicação gerencia informações de produtos, clientes e funcionários em um banco de dados e utiliza controladores para gerenciar as ações.

## 🔧 Tecnologias Utilizadas

- **Java** - Linguagem principal para o backend
- **Spring Boot** - Framework para construção da aplicação
- **Thymeleaf** - Motor de templates para as páginas web
- **Banco de Dados** - Para armazenar produtos, clientes e funcionários
- **Maven** - Para gerenciamento de dependências

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **src/main/java**: Código-fonte do projeto.
  - `controller` - Controladores que gerenciam as requisições, como `ProdutosController`, `ClientesController` e `FuncionariosController`
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

## 💬 Contribuindo

Este projeto foi criado para fins de aprendizado. Se você tiver sugestões ou melhorias, sinta-se à vontade para contribuir!

## 📞 Contato

Caso tenha dúvidas ou sugestões, entre em contato por [gladysonfonseca@unifucamp.edu.br](mailto:gladysonfonseca@unifucamp.edu.br).
