# CodeQuest 🎮☕

A Java and Spring Boot–based backend application for a coding game platform.  
This project demonstrates clean backend architecture using Spring Boot, JPA, and repository-based data access.
About the story of the game, The main character is a programmer who suddenly dies one day only to be reincarnated into a different world.
Now he is gonna use his knowlegde of problem solving to help the people of a kingdom on the brink to femine and despair.
You play as him and solve various programming problems to overcome the kingdoms hurdles and save as many people as you can.

---

## 📌 Overview

**CodeQuest2** is a backend application built with **Spring Boot** that powers a coding game system.  
It focuses on practicing Java backend development concepts such as:

- Spring Boot auto-configuration
- JPA entity management
- Repository-based data access
- Clean package structure
- Scalable backend design

This repository is suitable for learning, experimentation, and future expansion into a full-stack coding game.

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Maven**
- **REST APIs**

---

## 📂 Project Structure

```

src/main/java/com/example/demo
│
├── CodeQuest2Application.java   # Application entry point
├── model/                       # JPA entities
├── repository/                  # JPA repositories
├── service/                     # Business logic
└── controller/                  # REST controllers

````

---

## 🚀 Application Entry Point

```java
@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")
@EntityScan(basePackages = "com.example.demo.model")
public class CodeQuest2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CodeQuest2Application.class, args);
    }
}
````

### Key Responsibilities

* Bootstraps the Spring Boot application
* Enables JPA repository scanning
* Scans entity packages for Hibernate
* Supports servlet-based deployment

---

## ⚙️ How to Run the Project

### Prerequisites

* Java 8 or higher
* Maven
* IDE (IntelliJ IDEA / Eclipse recommended)

### Steps

```bash
git clone https://github.com/Saksham-Bansal-3110/CodeQuest-A-Coding-Java-Game-.git
cd CodeQuest2
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 🧪 Testing

You can test the APIs using:

* Postman
* Browser (GET endpoints)
* cURL

---

## 🎯 Project Goals

* Learn Spring Boot fundamentals
* Practice JPA and repository patterns
* Build a scalable backend structure
* Prepare for real-world Java backend projects

---

## 🚧 Future Enhancements

* Authentication and authorization
* Swagger / OpenAPI documentation
* Leaderboards and user progress tracking
* Frontend integration
* Improved validation and exception handling

---

## 👨‍💻 Author

**Saksham Bansal**
GitHub: [https://github.com/Saksham-Bansal-3110](https://github.com/Saksham-Bansal-3110)

---

⭐ If you find this project useful, consider giving it a star!

```
