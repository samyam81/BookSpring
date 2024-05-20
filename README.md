# BookSpring

BookSpring is a Spring Boot project aimed at managing book-related information. This project encompasses four main repositories: Model, Repo, Service, and Resource. Each repository serves a specific purpose within the project structure.

## Repositories:

### 1. Model
   The Model repository contains the following entities:
   - Book
   - Library
   - LibraryHall
   - ShowSeat
   - Reading

### 2. Repo
   The Repo repository manages data access and persistence logic.

### 3. Service
   The Service repository implements various business logic and functionalities, including:
   - Reverse seat
   - Show details
   - Search book

### 4. Resource
   The Resource repository handles HTTP requests and responses, serving as the interface between the backend logic and the frontend clients.

## Project Structure:

- **Model**: Contains entity classes representing various aspects of the application domain.
- **Repo**: Manages data access and persistence logic using Spring Data JPA.
- **Service**: Implements business logic and functionalities.
- **Resource**: Handles HTTP requests and responses, serving as the REST API interface.
- **pom.xml**: Maven project configuration file specifying dependencies and build settings.

## Getting Started:

To run the BookSpring project locally, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/samyam81/BookSpring.git
    ```

2. Navigate to the project directory:

    ```bash
    cd BookSpring
    ```

3. Ensure you have JDK 21 and Maven installed on your system.

4. Build the project:

    ```bash
    mvn clean install
    ```

5. Start the Spring Boot application:

    ```bash
    java -jar target/readbook-0.0.1-SNAPSHOT.jar
    ```

## Technologies Used:

- **Spring Boot**: Framework for building Java applications quickly and with minimal configuration.
- **Spring Data JPA**: Simplifies data access and persistence using JPA.
- **H2 Database**: In-memory database for development and testing purposes.
- **Maven**: Build automation tool and dependency management.

## Dependencies:

- `spring-boot-starter-actuator`: Provides production-ready features to monitor and manage the application.
- `spring-boot-starter-jdbc`: Starter for JDBC (Java Database Connectivity) support.
- `h2`: Embedded in-memory database for development and testing.
- `spring-boot-starter-test`: Starter for testing Spring Boot applications.


## Support:

For support, please create an issue on the [GitHub repository](https://github.com/samyam81/BookSpring/issues).
