# SpringTasks

## Task 1

Create a REST API endpoint to create a new product. 

### Use Case: 
* Accept product details in the request payload, create a new product in the database, and return the created product as a JSON response. 

This task allows you to create a new product. The ProductController exposes a POST endpoint at /products where the product details are provided in the request body as JSON. The createProduct method in the ProductService saves the product using the ProductRepository and returns the created product as a JSON response with a status code of 201 (Created).

Entity Details: 

        private Long id;
        private String name;
        private double price;
        private String description; 

"Generate API and add product details to the API"
