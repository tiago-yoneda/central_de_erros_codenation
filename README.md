# Projeto Final Codenation - Central de Erros

- atualizado em 26/10/2021 - 11:19 - Yoneda
- atualizado em 27/10/2021 - 16:08 - Forcellini
- atualizado em 27/10/2021 - 17:52 - group coding
- atualizado em 31/10/2021 - 13:00 - Forcellini


# Sumário

- [Integrantes](#integrantes)
- [Rotas da API](#rotas-da-api)
  - [`/users`](#users)
  - [`/events`](#events)
- [Database](#database)
- [Dependências](#dependências)
- [Andamento](#andamento)
  - [Falta fazer](#falta-fazer)

## Integrantes

- Adriano Forcellini Pedretti
- Enio Nical
- Felipe Santiago
- Johne Alves
- Layo Kaminski
- Tiago Yoneda
- Uilton Rocha

## Rotas da API

### users

O endpoint deve ser acessível através do caminho `/users`

- rota para fazer o cadastro - `POST name, email, password`
- rota para fazer o login - `POST email, password` \*precisa retornar um token
- decidir se vamos usar `role` ou não

### events

O endpoint deve ser acessível através do caminho `/events`
\*\* necessário usar token

- rota para ler todos os evento - `GET` \*não mostrar log
- rota para ler um evento - `GET - event_id` \*não mostrar log
- rota para cadastrar evento - `POST level, description, log, origem ,createdAt, user_id`
- rota para atualizar evento - `PUT + dados`
- rota para apagar evento - `DELETE - evento_id`

## Database

![Esquema de database](./public/schema_database.png)

## Dependências

- Spring Data JPA
- Spring Security
- OAuth2 Client
- Lombok
- H2Database ou PostgreSQL Driver
- Spring Web

## Andamento
  
  ### O que está feito
  - configurada a conexão com o db - postgresql (verificar usando pgadmin) - utilizando user/password postgres
    - é crida a entidade User no database
    - é crida a entidade Event no database
  - a aplicação roda e persiste no endereço `localhost:8080`
    - existem algumas rotas
    - é possível fazer o login como admin/admin usando o `insomnia`

    http://localhost:8080/oauth/token - `Form URL Encoded` grant_type = password, username/password = admin - Basic Auth admin/admin
    - verificar se é possivel consultar o db utilizando o token
    - criar endpoints de crud relacionados a entidade eventos


  ### Falta fazer
  - criar um endpoint de login para recuperar um token valido, fazendo a verificacao do usuario no db
