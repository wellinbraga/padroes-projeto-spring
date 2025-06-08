# Padrões de Projeto com Spring

Este projeto demonstra a implementação de padrões de projeto utilizando o framework Spring. O objetivo é fornecer exemplos práticos de como aplicar padrões de projeto em aplicações Spring Boot, facilitando o aprendizado e a implementação desses padrões em projetos reais.

## Descrição

O projeto serve como base para exemplificar a implementação de diversos padrões de projeto no ecossistema Spring, incluindo padrões criacionais, estruturais e comportamentais. A estrutura foi organizada para facilitar a compreensão e o estudo dos padrões, com exemplos claros e documentados.

## Tecnologias Utilizadas

* **Spring Boot** (v2.5.4) - Framework para criação de aplicações Java
* **Spring Data JPA** - Facilita o acesso a dados com JPA
* **Spring Web** - Para desenvolvimento de aplicações web e RESTful APIs
* **H2 Database** - Banco de dados em memória para desenvolvimento e testes
* **OpenFeign** (v1.5.10) - Cliente HTTP declarativo para integração com APIs externas
* **Spring Cloud** (v2020.0.3) - Ferramentas para desenvolvimento de sistemas distribuídos

## Padrões de Projeto Implementados

O projeto está estruturado para demonstrar os seguintes padrões de projeto (a serem implementados):

### Padrões Criacionais
* Singleton
* Factory Method
* Abstract Factory
* Builder
* Prototype

### Padrões Estruturais
* Adapter
* Bridge
* Composite
* Decorator
* Facade
* Proxy

### Padrões Comportamentais
* Strategy
* Observer
* Command
* Template Method
* Iterator
* State

## Estrutura do Projeto

```
src/main/java/br/com/stackmob/padroes_projeto_spring/
├── controller/     # Controladores REST
├── model/          # Entidades e modelos de dados
├── service/        # Camada de serviços
└── Application.java # Classe principal da aplicação
```

## Pré-requisitos

Para executar este projeto, você precisará:

* Java 11 ou superior
* Maven ou Gradle (o projeto usa Maven por padrão)
* IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/wellinbraga/padroes-projeto-spring.git
cd padroes-projeto-spring
```

2. Compile e execute o projeto:
```bash
# Usando Maven
./mvnw spring-boot:run

# Ou usando Gradle
./gradlew bootRun
```

3. A aplicação estará disponível em `http://localhost:8080`

## Documentação da API

A documentação da API será disponibilizada através do Swagger UI, acessível em `http://localhost:8080/swagger-ui.html` após iniciar a aplicação.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias, correções ou novos exemplos de padrões de projeto.

## Autor

* **Wellington Braga** - [wellinbraga](https://github.com/wellinbraga)

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para detalhes.

## Referências

* [Padrões de Projeto - Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides](https://www.amazon.com.br/Padr%C3%B5es-Projetos-Solu%C3%A7%C3%B5es-Reutiliz%C3%A1veis-Orientados/dp/8573076100)
* [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/)
* [Baeldung - Design Patterns](https://www.baeldung.com/design-patterns)
