# CreditFlow - Sistema de Propostas de Crédito

O **CreditFlow** é uma aplicação Java moderna projetada para gerenciar solicitações de crédito empresarial. O projeto foca em simplicidade, robustez e segue os princípios de **Clean Code**.

## 🚀 Tecnologias Utilizadas

- **Java 21**: Versão de suporte de longo prazo (LTS).
- **Spring Boot 3.2.5**: Framework base para a aplicação.
- **PrimeFaces / JSF (JoinFaces)**: Interface web rica e responsiva.
- **Spring Data JPA**: Abstração da camada de persistência.
- **PostgreSQL**: Banco de dados relacional (via Docker).
- **Maven**: Gerenciamento de dependências e build.

## 🏗️ Arquitetura e Clean Code

O projeto foi refatorado para garantir clareza e facilidade de manutenção:
- **Sem Lombok**: Uso de Java nativo para evitar conflitos de compilação e manter o código explícito.
- **Injeção de Dependência por Construtor**: Maior testabilidade e transparência nas dependências.
- **Código Autodocumentado**: Nomes de métodos e variáveis que revelam sua intenção, eliminando a necessidade de comentários ruidosos.

## 🛠️ Como Executar o Projeto

### Pré-requisitos
- Docker e Docker Compose instalados.
- JDK 21 instalado (se for rodar fora do Docker).

### 1. Iniciar o Banco de Dados
O banco de dados roda em um container Docker. Para iniciá-lo:
```bash
docker-compose up -d db
```

### 2. Rodar a Aplicação
Você pode iniciar a aplicação usando o Maven Wrapper incluído no projeto:
```bash
# No Windows
.\mvnw.cmd spring-boot:run
```

### 3. Acessar o Sistema
Após o log indicar que o Spring iniciou com sucesso, acesse:
[http://localhost:8080/proposta.xhtml](http://localhost:8080/proposta.xhtml)

## 📁 Estrutura de Pastas Principal

- `src/main/java/com/creditflow/domain`: Entidades de negócio.
- `src/main/java/com/creditflow/controller`: Controladores JSF (Managed Beans).
- `src/main/java/com/creditflow/service`: Regras de negócio da aplicação.
- `src/main/resources/META-INF/resources`: Arquivos XHTML (Interface).
- `pgdata`: Volume persistente para os dados do PostgreSQL.

## 📜 Licença
Este projeto foi desenvolvido para fins de demonstração técnica e estudos de fluxos de crédito empresarial.
