# Gym Status Backend

## Overview

The Gym Status Backend is a Spring Boot application designed to manage gym member entries and exits. It provides a RESTful API for authentication and tracking the number of members currently in the gym. The application uses JWT (JSON Web Tokens) for secure authentication and authorization.

## Features

- User authentication with JWT
- Admin access control
- Member entry and exit tracking
- CORS configuration for cross-origin requests
- Built with Spring Boot and Maven

## Technologies Used

- Java 17
- Spring Boot 3.5.3
- Maven
- JWT (Java JSON Web Token)
- Lombok for reducing boilerplate code

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.3.2 or higher
- Docker (optional, for containerization)

### Clone the Repository

```bash
git clone https://github.com/62arondsouza/gym-status-backend.git
cd gym-status-backend
```
### Build the Project

You can build the project using Maven. Run the following command in the project root directory:

```bash
./mvnw clean package
```

### Running the Application

You can run the application using the following command:

```bash
./mvnw spring-boot:run
```

Alternatively, if you prefer to run it as a Docker container, you can build the Docker image and run it:

```bash
docker build -t gym-status-backend .
docker run -p 8080:8080 gym-status-backend
```
### API Endpoints

- Authentication
    - `POST /auth/login`: Authenticate a user and receive a JWT token.

- Admin Access
    - `GET /admin`: Access the admin page (requires a valid JWT token in the Authorization header).

- Gym Operations
    - `GET /count`: Get the current number of members in the gym.
    - `POST /entry`: Increment the member count (member entry).
    - `POST /exit`: Decrement the member count (member exit).
    - `GET /ping`: Simple endpoint to check if the server is running.

### Configuration

You can configure the application by modifying the `src/main/resources/application.properties` file. The default admin username and password hash are set in this file.