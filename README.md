# Book Microservice
Spring Boot Maven CRUD REST API for Book data.

Run in STS:
File -> Import -> Maven -> Existing Maven Projects
Run BookMicroserviceApplication as Spring Boot App.

Base URL: http://localhost:8081

POST /books
{
  "title":"Java Basics",
  "author":"James",
  "isbn":"9781234567890"
}

GET /books
GET /books/1

PUT /books/1
{
  "title":"Advanced Java",
  "author":"James",
  "isbn":"9781234567890"
}

DELETE /books/1

H2 database is separate for this service.
H2 console: http://localhost:8081/h2-console
JDBC URL: jdbc:h2:file:./data/bookdb
User: sa
Password: blank

Validation rejects blank title, author and ISBN.
