# 🗳️ Polling Application (Spring Boot + Angular + MySQL)

A simple **Polling/Voting Application** that allows users to create polls and vote for their preferred options.  
Built with **Spring Boot** for the backend, **Angular** for the frontend, and **MySQL** as the database.

---

## 📚 Table of Contents

1. [🚀 Features](#-features)  
2. [🛠️ Tech Stack](#️-tech-stack)  
3. [⚙️ Backend Setup (Spring Boot)](#️-backend-setup-spring-boot)  
   - [📁 Dependencies Used](#-dependencies-used)  
   - [🧩 Steps to Run Backend](#-steps-to-run-backend)  
4. [💻 Frontend Setup (Angular)](#-frontend-setup-angular)  
   - [Steps to Run Frontend](#steps-to-run-frontend)  
5. [📸 Screenshots](#-screenshots)  
6. [🧑‍💻 Author](#-author)

---

## 🚀 Features

- Create new polls with multiple options  
- Vote for a single option per poll  
- View real-time voting results  
- RESTful API backend with Spring Boot  
- Frontend developed using Angular  
- Data persistence with MySQL and Spring Data JPA  
- Lombok used for clean and concise entity models  

---

## 🛠️ Tech Stack

| Layer        | Technology         |
|---------------|-------------------|
| **Frontend**  | Angular           |
| **Backend**   | Spring Boot (Spring Web, Data JPA) |
| **Database**  | MySQL             |
| **ORM**       | Hibernate (via JPA) |
| **Utilities** | Lombok            |
| **Build Tool**| Maven             |

---

## ⚙️ Backend Setup (Spring Boot)

### 📁 Dependencies Used
- Spring Web  
- Spring Data JPA  
- MySQL Driver  
- Lombok  

### 🧩 Steps to Run Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/jainam-04/Voting-App.git
   cd Voting-App-Server
   ```
2. Configure your database in application.properties:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/<db-name>
   spring.datasource.username=<Your username>
   spring.datasource.password=<Your password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. The backend will start on:
   ```bash
   http://localhost:8080
   ```

---

## 💻 Frontend Setup (Angular)

### Steps to Run Frontend
1. Navigate to the Angular project:
   ```bash
   cd Voting-App-Frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the Angular app:
   ```bash
   ng serve
   ```
4. The frontend will start on:
   ```bash
   http://localhost:4200
   ```

---

## 📸 Screenshots

<img width="1918" height="875" alt="image" src="https://github.com/user-attachments/assets/09447474-5ff3-4934-9885-91c1d0cde2d0" />

---

## 🧑‍💻 Author

Jainam Rupani 📧 jainamrupani04@gmail.com 🌐 [GitHub Profile](https://github.com/jainam-04)
