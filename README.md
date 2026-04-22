# Desafio Backend Frameworks

## Objetivo
Esse projeto foi feito para praticar a arquitetura em camadas (MVC) utilizando dois frameworks diferentes: Node.js com Express e Java com Spring Boot.

## Node.js com Express

No projeto em Node.js, organizei o código seguindo o padrão MVC:

- Models: representam os dados da aplicação (ex: UserModel)
- Controllers: onde fica a lógica (ex: UserController)
- Routes: responsáveis pelas rotas da API

## Java com Spring Boot

No Spring Boot, a estrutura já vem mais organizada por padrão, mas a ideia continua parecida, separando responsabilidades em camadas.

## Comparação entre os frameworks

- O Node.js com Express é mais simples de configurar e mais rápido de começar
- O Spring Boot é mais completo, mas também mais detalhado e verboso
- Express dá mais liberdade, enquanto o Spring já vem mais estruturado

## Arquitetura (MVC)

Nesse padrão:

- O Controller recebe a requisição
- O Model representa os dados
- A resposta é retornada para o cliente

## Estrutura do projeto

/java-springboot  
/node-express  
  ├── controllers  
  ├── models  
  ├── routes  
  ├── app.js  

## Conclusão

Com esse projeto, consegui entender melhor como funciona a separação de responsabilidades no backend e as diferenças entre os frameworks.
