## **Teste de aplicação de API**

A API conta com quatro funcionalidades, sendo uma de autenticação e liberação para os demais endpoints; e as outras três de consulta de informações sendo: detalhamento de todos os pedidos por usuário logado; total de vendas do usuário logado; total de vendas por cliente do usuário logado

**Endpoints:**

_/login_

_/order/list_

_/total_

_/total-by-client_

### Instruções para requisições:

**/login (POST)**

payload:

`{
"email": "String",
"password": "String"
}`

Ex.:
`{
"email": "amarildo@nexfar.com.br",
"password": "123456"
}`

Em caso de autenticação positiva é retornado o token para autenticação nos demais endpoints.
Ex.: `{"token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbWFyaWxkb0BuZXhmYXIuY29tLmJyIiwiZXhwIjoxNjI0NzkyNjc4fQ.XOAFDIlzUJH7VHwdby8vzDoxm86l_uY8aUQeRP9NtBMhL_kHBE6tEwNkuItZX2bt0l8Xotj-2WQuiHwp3uP7xw"}
`

**/order/list (GET)**
Exemplo da autenticação:
header = `{'TOKEN': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbWFyaWxkb0BuZXhmYXIuY29tLmJyIiwiZXhwIjoxNjI0NzkyNjc4fQ.XOAFDIlzUJH7VHwdby8vzDoxm86l_uY8aUQeRP9NtBMhL_kHBE6tEwNkuItZX2bt0l8Xotj-2WQuiHwp3uP7xw'}`

No retorno há uma lista com todo o detalhamento de vendas do usuário


**/total (GET)**
Exemplo da autenticação:
header = `{'TOKEN': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbWFyaWxkb0BuZXhmYXIuY29tLmJyIiwiZXhwIjoxNjI0NzkyNjc4fQ.XOAFDIlzUJH7VHwdby8vzDoxm86l_uY8aUQeRP9NtBMhL_kHBE6tEwNkuItZX2bt0l8Xotj-2WQuiHwp3uP7xw'}`

No retorno há a totalização de vendas do usuário

Ex.:
`{
"total": 300
}`

**/total-by-client (GET)**
Exemplo da autenticação:
header = `{'TOKEN': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbWFyaWxkb0BuZXhmYXIuY29tLmJyIiwiZXhwIjoxNjI0NzkyNjc4fQ.XOAFDIlzUJH7VHwdby8vzDoxm86l_uY8aUQeRP9NtBMhL_kHBE6tEwNkuItZX2bt0l8Xotj-2WQuiHwp3uP7xw'}`

No retorno há uma lista com totalizador de vendas por cliente, tal qual exemplo
Modelo:

`[
{
"clientID": Int
},
{
"clientID": Int
},
{
"clientID": Int
},
{
"clientID": Int
},
{
"clientID": Int
}
]`

Ex.:
`[
{
"57722": 2
},
{
"59672": 4
},
{
"62323": 5
},
{
"57433": 7
},
{
"60460": 6
}
]
`

### Instruções para instanciar o Docker

`docker-compose up` na pasta raiz.
