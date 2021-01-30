# Projeto GitHub
> Projeto visando o consumo da Api do GitHub em uma interface com cadastro de usuários e Login.

![](header.png)

## Tecnologias Envolvidas

O projeto faz uso do framework **Spring MVC** em conjunto com o **Spring Boot**, no front end também foi usado o **Thymeleaf** de forma básica, a parte de login faz uso do **Spring Security** que garante a segurança das rotas, e do acesso através de interceptors, além dos dados cadastrados e consultados do usuário serem criptografados no banco , o Fork do **MySql** chamado **Maria DB** foi usado como banco de dados.

## O consumo da API Rest do GitHub

O projeto consome Api do Git Hub para apresentar em uma home Page, uma lista de usuários ativos e engajados na plataforma, *o critério na consulta para o engajamento na plataforma é feito pelo numero de seguidores onde entra na lista somente usuários globais com mais de 2000 seguidores*, segue abaixo o endpoint usado.
```https://api.github.com/search/users q=repos:followers:>2000&language:java&page=1&per_page=500```

_For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

Describe how to install all development dependencies and how to run an automated test-suite of some kind. Potentially do this for multiple platforms.

sh
make install
npm test
```

## Release History

* 0.2.1
    * CHANGE: Update docs (module code remains unchanged)
* 0.2.0
    * CHANGE: Remove `setDefaultXYZ()`
    * ADD: Add `init()`
* 0.1.1
    * FIX: Crash when calling `baz()` (Thanks @GenerousContributorName!)
* 0.1.0
    * The first proper release
    * CHANGE: Rename `foo()` to `bar()`
* 0.0.1
    * Work in progress

## Meta

Your Name – [@YourTwitter](https://twitter.com/dbader_org) – YourEmail@example.com

Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/yourname/github-link](https://github.com/dbader/)

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
