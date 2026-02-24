# Desk-implements

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-f5f5f5?style=for-the-badge&logo=junit5&logoColor=dc524a)

This project is a Test-Driven Development (TDD) initiative built with **Java Spring Boot, JUnit 5 and H2 Console** focusing on department processes and employee management.

The project ensures that all core functionalities developed and validated through automated tests before implementation.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Tests](#tests)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Amannu1/desk-implements
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080
3. Right click test directory
4. Run all tests

## API Endpoints
The API provides the following endpoints:

```markdown
GET /departments - Retrieve a list of all departments.

GET /employees - Retrieve a list of all employees.

POST /employees - Register a new employer
```

## Tests

The tests cover the following scenarios:

### Department

- findAll should return all resources sorted by name

### Employer

- findAll should return paged resources sorted by name
- insert should insert resource
