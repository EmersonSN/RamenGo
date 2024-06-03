# Tecnologias Utilizadas :computer:

- Java 17: Linguagem de programação utilizada para desenvolver a aplicação.
- Spring Boot 3.1.3: Framework que simplifica a criação de aplicações stand-alone e de produção.
- Spring Data JPA: Utilizado para abstração de banco de dados e manipulação de dados.
- H2 Database 2.1.214: Banco de dados em memória utilizado para desenvolvimento e testes.
- Lombok 1.18.24: Biblioteca que reduz a verbosidade do código, gerando automaticamente getters, setters, construtores e outros métodos.
- Spring Cloud OpenFeign: Cliente HTTP declarativo utilizado para simplificar a comunicação com serviços externos.

# Por que Feign? :notebook:

O Feign é usado para facilitar a comunicação com serviços externos através de uma abordagem declarativa. Ele permite definir interfaces que representam os endpoints dos serviços externos, simplificando a lógica de chamada e processamento de respostas HTTP. No caso da RamenGo API, o Feign é utilizado para gerar IDs de pedidos chamando um serviço externo.

# Como Executar a Aplicação :arrow_forward:

## Pré-requisitos

- JDK 17 ou superior
- Maven instalado e configurado

## Passos para Executar

### Clone o repositório:
- git clone https://github.com/seu-usuario/ramengo-api.git 
- cd ramengo-api

### Compile e execute a aplicação:
- mvn clean install
- mvn spring-boot:run

### A aplicação estará disponível em http://localhost:8080.

# Endpoints :cd:
## Listar Caldos
- URL: /broths
- Método: GET
- Resposta:
```json
[
  {
    "id": "1",
    "imageInactive": "https://tech.redventures.com.br/icons/salt/inactive.svg",
    "imageActive": "https://tech.redventures.com.br/icons/salt/active.svg",
    "name": "Salt",
    "description": "Simple like the seawater, nothing more",
    "price": 10
  }
]
```
## Listar Proteínas
- URL: /proteins
- Método: GET
- Resposta:
```json
[
  {
    "id": "1",
    "imageInactive": "https://tech.redventures.com.br/icons/pork/inactive.svg",
    "imageActive": "https://tech.redventures.com.br/icons/pork/active.svg",
    "name": "Chasu",
    "description": "A sliced flavourful pork meat with a selection of season vegetables.",
    "price": 10
  }
]
```
## Fazer Pedido
- URL: /orders
- Método: POST
- Requisição:
```json
{
  "brothId": "1",
  "proteinId": "1"
}
```
- Resposta:
```json
{
  "id": "12345",
  "description": "Salt and Chasu Ramen",
  "image": "https://tech.redventures.com.br/icons/ramen/ramenChasu.png"
}
```
# Estrutura do Projeto
```bash
src
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── client
│   │           │   └── OrderClient.java
│   │           ├── config
│   │           │   └── FeignConfig.java
│   │           ├── controller
│   │           │   └── OrderController.java
│   │           ├── dto
│   │           │   ├── OrderIdResponse.java
│   │           │   ├── OrderRequest.java
│   │           │   ├── OrderResponse.java
│   │           ├── model
│   │           │   ├── Broth.java
│   │           │   ├── Pedido.java
│   │           │   ├── Protein.java
│   │           ├── repository
│   │           │   ├── BrothRepository.java
│   │           │   ├── OrderRepository.java
│   │           │   ├── ProteinRepository.java
│   │           └── service
│   │               └── OrderService.java
│   └── resources
│       ├── application.properties
│       ├── data.sql
│       └── schema.sql
└── test
    └── java
        └── org
            └── example
                └── OrderServiceTests.java
