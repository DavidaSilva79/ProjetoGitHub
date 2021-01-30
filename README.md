# Projeto GitHub
> Projeto visando o consumo da Api do GitHub em uma interface com cadastro de usuários e Login.

![](header.png)

## Tecnologias Envolvidas

O projeto faz uso do framework **Spring MVC** em conjunto com o **Spring Boot**, no front end também foi usado o **Thymeleaf** de forma básica, a parte de login faz uso do **Spring Security** que garante a segurança das rotas, e do acesso através de interceptors, além dos dados cadastrados e consultados do usuário serem criptografados no banco , o Fork do **MySql** chamado **Maria DB** foi usado como banco de dados.

## O consumo da API Rest do GitHub

O projeto consome Api do Git Hub para apresentar em uma home Page, **uma lista de 500 usuários ativos** e engajados na plataforma, **o critério na consulta para o engajamento na plataforma é feito pelo numero de seguidores onde entra na lista somente usuários globais que desenvolvem em java com mais de 2000 seguidores**, segue abaixo o endpoint usado.


```https://api.github.com/search/users q=repos:followers:>2000&language:java&page=1&per_page=500```


## Preparando o Ambiente e Subindo a Aplicação 

Para usar aplicação é necessário ter  alguns componentes instalados na maquina,
**Java na Versão 8** e o banco de dados  **Maria DB 10.5**, basta criar um banco de dados 
E **colocar a senha o nome do banco e o usuário no arquivo de configurações application.propertie**s em “projetosocin\src\main\resources” como o Spring Boot
se encarrega do servidor de aplicações, para subir a aplicação no http://localhost:8080
**Inicie o método o método main da Classe ProjetosocinApplication** em projetosocin\src\main\java\br\com\socin\projetosocin

## Usando a Aplicação

Depois da Aplicação ter subido com sucesso basta acessar **localhost:8080/cadastro**
Criar um usuário e senha  e para Logar basta clicar no canto superior esquerdo em Login em seguida o usuário seja direcionado direto para a home que traz a **listagem de usuários do GitHub com seu Login e endereço do GitHub e Avatar.**

![Test Image 1](https://ibb.co/f9sh4kd)


https://ibb.co/vknZzPW
https://ibb.co/yYB6kqr
https://ibb.co/cCRjczC



