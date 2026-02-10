# Spring Boot API Documentation

## Project Description
This project is a Spring Boot application designed to provide a robust and scalable API for managing resources. It showcases the use of Spring Boot's features to create an efficient RESTful service.

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone https://github.com/aarhone/api_sb.git
   cd api_sb
   ```

2. **Requirements**:
   - JDK 11 or later
   - Maven 3.6 or later

3. **Build the project**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:
   The application will be available at `http://localhost:8080`.

## API Endpoints
- **GET /api/resources**
  - Description: Retrieve all resources.
  - Response: List of resources.

- **GET /api/resources/{id}**
  - Description: Retrieve a resource by its ID.
  - Parameters:
    - `id`: Resource ID
  - Response: Resource object.

- **POST /api/resources**
  - Description: Create a new resource.
  - Request Body: Resource object.
  - Response: Created resource object.

- **PUT /api/resources/{id}**
  - Description: Update an existing resource.
  - Parameters:
    - `id`: Resource ID
  - Request Body: Updated resource object.
  - Response: Updated resource object.

- **DELETE /api/resources/{id}**
  - Description: Delete a resource by its ID.
  - Parameters:
    - `id`: Resource ID
  - Response: Success message.

## Usage Examples
### Retrieve all resources
```bash
curl -X GET http://localhost:8080/api/resources
```

### Create a new resource
```bash
curl -X POST http://localhost:8080/api/resources -H 'Content-Type: application/json' -d '{"name":"New Resource"}'
```

### Update a resource
```bash
curl -X PUT http://localhost:8080/api/resources/1 -H 'Content-Type: application/json' -d '{"name":"Updated Resource"}'
```

### Delete a resource
```bash
curl -X DELETE http://localhost:8080/api/resources/1
```

## Conclusion
This README provides a comprehensive guide to the Spring Boot API project. Please feel free to contribute improvements or suggest changes.