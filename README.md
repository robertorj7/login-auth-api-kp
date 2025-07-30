# Login Auth API KP

Este repositório contém uma aplicação desenvolvida com **Spring Security** para gerenciar autenticação e autorização de usuários. A API é responsável por realizar o login dos usuários e proteger os recursos da aplicação com base nas permissões configuradas.

## Como funciona?

O backend deste repositório foi desenvolvido para fornecer um serviço de autenticação robusto e seguro. Ele utiliza **JWT (JSON Web Tokens)** para autenticar requisições e garantir que apenas usuários autorizados tenham acesso aos recursos.

### Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Security**
- **JWT**

## Repositório Frontend

O frontend da aplicação está disponível neste repositório: [login-page-web-kp](https://github.com/robertorj7/login-page-web-kp). Ele fornece uma interface amigável para os usuários interagirem com o sistema de autenticação.

## Executando a Aplicação

1. Clone este repositório:
   ```bash
   git clone https://github.com/robertorj7/login-auth-api-kp.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd login-auth-api-kp
   ```

3. Configure o arquivo `application.properties` com suas credenciais e configurações específicas.

4. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

5. A API estará disponível em `http://localhost:8080`.
