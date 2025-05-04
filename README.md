#  Project Title: Product and Category Management System

#  Description

This project is a Spring Boot-based web application  that performs  CRUD operations on Product and Category entities. It demonstrates the use of a One-to-Many relationship, RESTful APIs, pagination, and data validation using Spring Data JPA and Hibernate.


#   Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database (as configured)
- Maven
- Postman (for API testing)


#  Project Structure

```
src/
├── main/
│   ├── java/com/example/project/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── Entity/
│   │   └── ExceptionHandling/
│   └── resources/
│       ├── application.properties
└── test/


---

# Features

- Add, update, delete, and retrieve categories
- Add, update, delete, and retrieve products
- One-to-Many relationship 
- Pagination support in  endpoints
- Validation of inputs
- RESTful API structure

---

#  API Endpoints

#  Category

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| GET    | `/categories`        | Get all categories    |
| POST   | `/categories`        | Add new category      |
| PUT    | `/categories/{id}`   | Update category       |
| DELETE | `/categories/{id}`   | Delete category       |

#  Product

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| GET    | `/products`          | Get all products      |
| POST   | `/products`          | Add new product       |
| PUT    | `/products/{id}`     | Update product        |
| DELETE | `/products/{id}`     | Delete product        |

 testing  all endpoints using Postman.


#   Objective

This project fulfills the following assignment requirements:

- Create Spring Boot application with Category and Product entities
- Implement One-to-Many relationship
- Perform CRUD operations via REST APIs
- Follow clean code and layer separation
- Use pagination and validation


### Student  Info

Name: Mahesh Rohidas Awari
Email: maheshawari2002@gmail.com
Contact: +91-8390393205
GitHub: github.com/MaheshAwari2002
