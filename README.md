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

src/
├── main/
|   ├── java/com/example/project/
|   │   ├── controller/           → Contains all controller classes (e.g., CategoryController, ProductController)
│   ├── service/              → Contains service layer classes
|   │   ├── repository/           → Contains repository interfaces (e.g., JpaRepository)
|   │   ├── entity/               → Contains JPA entity classes (e.g., Category, Product)
|   │   └── exceptionhandling/    → Contains custom exceptions and global handlers
|   └── resources/
|       └── application.properties  → Contains all hibernate conection and information

#  Important thing when use post method 

When inserting a product into a specific category, do not pass only the category ID as a separate value
(e.g., "categoryId": 1). Instead, pass the category as an object containing the ID, like this:
{
  "name": "School bag",
  "description": "Rough and stylish bag",
  "price": 850,
  "category": {
    "id": 1
  }
}


# avoid (don't like)
{
  "name": "School bag",
  "description": "Rough and stylish bag",
  "price": 850,
  "category":  1
  
}**
This is necessary because in the Product entity, the category field is a private object of type Category, 
and cannot directly access a primitive ID value. 
Passing it as an object ensures proper mapping and association by the ORM (e.g., Hibernate in Spring Boot).**
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

Category Endpoints
   GET /categories — Get all categories
   POST /categories — Add new category
   PUT /categories/{id} — Update category
   DELETE /categories/{id} — Delete category

# Product Endpoints
    GET /products — Get all products
    POST /products — Add new product
    PUT /products/{id} — Update product
    DELETE /products/{id} — Delete product


 testing  all endpoints using Postman.


#   Objective

This project fulfills the following assignment requirements:

- Create Spring Boot application with Category and Product entities
- Implement One-to-Many relationship
- Perform CRUD operations via REST APIs
- Follow clean code and layer separation
- Use pagination and validation
- 
# output images screenshot 
![Screenshot (17)](https://github.com/user-attachments/assets/df9d389e-76c7-40d7-afc4-a226caf2f7ef)
![Screenshot 2025-05-14 195209](https://github.com/user-attachments/assets/315dc860-3593-44cf-b12f-99a35ccbbe8c)
![Screenshot 2025-05-14 195404](https://github.com/user-attachments/assets/a590e3e0-192c-48b2-92b8-d299ba982492)

![Screenshot 2025-05-14 195252](https://github.com/user-attachments/assets/65ba46b3-a4ae-4448-a0cf-a1c90b03326d)
![Screenshot 2025-05-14 195615](https://github.com/user-attachments/assets/0fb593d7-3d02-4017-b794-53e5b4e52899)

![Screenshot 2025-05-14 195708](https://github.com/user-attachments/assets/ecf2a2fc-b0d7-428b-94b3-6576cef71582)


### Student  Info

Name: Mahesh Rohidas Awari
Email: awarimahesh2002@gmail.com
Contact: +91-8390393205
GitHub: github.com/MaheshAwari2002
