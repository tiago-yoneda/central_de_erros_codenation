# Projeto Final Codenation - Central de Erros

# Sumário

- [Integrantes](#integrantes)
- [Rotas da API](#rotas-da-api)   
  - [/users](#/users)
  - [/events](#/events)
## Integrantes
  - Adriano Forcellini Pedretti
  - Enio Nical
  - Felipe Santiago
  - Jederson Macedo
  - Johne Alves
  - Layo Kaminski
  - Marcus Witthoeft
  - Tiago Yoneda
  - Uilton Rocha

## Rotas da API

### /users
  - rota para fazer o cadastro - `POST name, email, password` 
  - rota para fazer o login - `POST email, password` *precisa retornar um token
  - decidir se vamos usar `role` ou não
  
### /events 
  ** necessário usar token
  - rota para ler todos os evento - `GET` *não mostrar log
  - rota para ler um evento - `GET - event_id` *não mostrar log
  - rota para cadastrar evento - `POST level, description, log, origem ,createdAt, user_id`
  - rota para atualizar evento - `PUT + dados`
  - rota para apagar evento - `DELETE - evento_id`
