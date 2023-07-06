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

## Task 2

Task: Create a REST API endpoint to retrieve a list of products

### Use Case: 
The goal of this task is to develop functionality that allows fetching all products from a database and returning them as a JSON response. This will enable users of the API to access and retrieve information about all available products.

### Explanation: To accomplish this task, you need to follow these steps:

Design the API Endpoint:

* Determine the appropriate URL for the endpoint. In this case, the URL could be "/products".
Decide on the HTTP method to use. Since we want to retrieve data, the GET method is suitable for this task.
Set up the Controller:

* Create a controller class (e.g., "ProductController") responsible for handling incoming requests and defining the API endpoint.
Inside the controller, map the appropriate URL and HTTP method to a method (e.g., "getAllProducts") that will handle the request.
Implement the Service:

* Create a service class (e.g., "ProductService") to handle the business logic related to retrieving products.
Inside the service class, implement the "getAllProducts" method.
Within this method, interact with the database (e.g., using a repository) to fetch all products.
Configure the Repository:

* Set up a repository (e.g., "ProductRepository") that provides an interface to communicate with the database.
Implement the necessary methods in the repository to fetch all products.
Return the Response:

* Once the products are fetched from the database, convert the list of products into a JSON response.
Ensure the response is formatted correctly and includes the necessary information, such as product details (e.g., name, price, description).
Test the API Endpoint:

* Verify the functionality of the API endpoint by sending a GET request to the specified URL ("/products").
Check if the response received contains the expected JSON data, including the list of products.

## Task 3

### Use Case: 
The use case for this task is to fetch a specific product by providing its ID and return the product details as a JSON response. 

### Task Description: 
In this task, you are required to implement a REST API endpoint that allows users to retrieve a product based on its ID. The endpoint should be accessible via a GET request to the /products/{id} URL, where {id} represents the product ID.

### Implementation Details: 
To accomplish this task, you will need to create the following components:

###ProductController: 
This is a Spring Boot controller class responsible for handling incoming HTTP requests. It should contain a method that maps to the /products/{id} endpoint and handles GET requests. The method should take the {id} parameter and delegate the processing to the ProductService.

### ProductService: 
This class acts as an intermediary between the controller and the repository. It should contain a method, let's call it getProductById, which accepts the product ID as a parameter. Inside this method, you will retrieve the product from the ProductRepository based on the provided ID.

### ProductRepository: 
This is a component that interacts with the data source, such as a database, to retrieve and persist product data. In this task, you will use the ProductRepository to query for the product by its ID.

### Functionality Flow: 
When a GET request is made to the /products/{id} endpoint, the ProductController's corresponding method is invoked. The {id} parameter is extracted from the request URL and passed to the ProductService's getProductById method. The ProductService then utilizes the ProductRepository to retrieve the product with the given ID.

If the product exists in the repository, it is returned as a JSON response. However, if the product is not found, a 404 response is returned to indicate that the requested resource (product) was not found.

## Task 4

### Task: 
The objective is to build an endpoint that retrieves all products from the database and returns them as a JSON response, sorted by price in ascending order. 

### Use Case: 
The use case for this task involves fetching product data from the database and presenting it to the user in a sorted manner, specifically by price in ascending order. This allows for easy navigation and comparison of product prices. 

### Components Involved: 
To complete this task, you would typically work with the following components:

### REST API: 
You'll create an endpoint that handles the incoming HTTP GET request to retrieve the sorted products. 

### ProductController: 
This component handles the request and delegates the task to the ProductService.

### ProductService: 
The ProductService interacts with the ProductRepository to fetch all products and perform the sorting based on price.

### ProductRepository: 
The repository is responsible for querying the database and retrieving all product records.

### Approach: 
Here's a high-level approach to implementing the task:
* Define an appropriate endpoint in the REST API, such as "/products/sorted," which will trigger the desired functionality.
* In the ProductController, map the GET request to the defined endpoint and invoke the corresponding method in the ProductService.
* Inside the ProductService, use the ProductRepository to retrieve all product records from the database.
* Sort the products by price in ascending order using a suitable sorting algorithm or database query.
* Return the sorted products as a JSON response to the client.

### Expected Outcome: 
After completing this task, you should have a functional REST API endpoint that, when accessed, retrieves all product data from the database and returns it as a JSON response. The products will be sorted by price in ascending order, allowing clients to easily access and utilize the data.

## Task 5

### Task: 
Create a REST API endpoint to filter products by price range. 

### Use Case: 
The goal of this task is to develop functionality that allows users to fetch products from a database that fall within a specified price range. The retrieved products should be returned as a JSON response.

### Explanation: 
To implement this task, you need to create a REST API endpoint in both the Spring Boot and .NET frameworks. The endpoint should accept two parameters: minPrice and maxPrice, which represent the minimum and maximum values of the desired price range.

### In the Spring Boot framework:

* Define a ProductController class that handles HTTP requests and contains the endpoint mapping.
* The endpoint should be mapped to a GET request at the path '/products/filter'.
* Implement a method within the ProductController that accepts the minPrice and maxPrice parameters as request parameters.
* In the ProductService class, create a method called filterProductsByPriceRange. This method should utilize the ProductRepository to query the database and retrieve products that fall within the specified price range.
* The filtered products should be returned as a JSON response.

### Return the filtered products as a JSON response.
By implementing this functionality, users will be able to make requests to the specified endpoint and receive a JSON response containing the products that meet the price range criteria.

## Task 6

### Task: 
Create a REST API endpoint to retrieve the count of products

### Use Case: 
In this task, your goal is to create a REST API endpoint that retrieves the total count of products stored in the database. The count will be returned as a JSON response.

###Explanation: 
To accomplish this task, you need to follow the steps below:

### Define the API Endpoint: 
Create a REST API endpoint in your Spring Boot application to handle GET requests for retrieving the product count. The endpoint URL should be "/products/count" or a similar meaningful URL.

### Implement the ProductController: 
In your application's controller class (ProductController), map the endpoint URL ("/products/count") to a specific method. This method will be responsible for handling the incoming request and returning the product count as a JSON response.

###Create the ProductService: 
In your application's service layer (ProductService), implement the logic for fetching the product count. The ProductService will interact with the ProductRepository (data access layer) to retrieve the count from the database.

### Utilize the ProductRepository: 
Within the ProductService, use the appropriate method from the ProductRepository to retrieve the total count of products stored in the database.

### Return the JSON Response: 
Once the product count is obtained, format it as a JSON response. This can be achieved by returning a JSON object or using a framework-specific mechanism to convert the count into a JSON representation.

### Test the API Endpoint: 
To ensure your implementation is working correctly, test the API endpoint by making a GET request to "/products/count" using a tool like cURL, Postman, or your web browser. Verify that the response contains the expected product count in JSON format.

## Task 7

### Task: 
Create a REST API endpoint to search for products by name

### Use Case: 
The objective of this task is to develop a RESTful API endpoint that allows users to search for products based on their name. The API should accept a search query as a request parameter, perform a search operation using the provided name, and return the search results in JSON format.

### Explanation: 
To implement this functionality, you need to follow these steps:

### Define the API Endpoint: 
Create a new endpoint in your application to handle the product search functionality. For example, you can use the endpoint /products/search. This endpoint should be configured to accept GET requests.

### Handle the Request: 
In your controller class (e.g., ProductController), create a method that maps to the /products/search endpoint and handles the GET request. This method should accept the search query as a request parameter, typically named name.

### Implement the Search Logic: 
Inside the method, delegate the search functionality to the service layer (e.g., ProductService). The searchProductsByName method in the service class should take the provided name as input and use it to search for products.

### Perform the Search: 
In the service class, utilize the product repository (e.g., ProductRepository) to execute the search operation. You can use a case-insensitive search to find products whose names contain the provided search query.

### Retrieve the Search Results: 
Once the search operation is executed, retrieve the search results from the repository. These results should include all the products that match the search criteria.

### Format the Response: 
Convert the search results into JSON format. You can use libraries or frameworks (e.g., Jackson) to serialize the search results into JSON.
 
### Return the Response: 
Return the JSON response containing the search results back to the API caller. Ensure the response includes the appropriate HTTP status code (e.g., 200 for a successful search) and any necessary headers.

By following these steps, you will have implemented a RESTful API endpoint that enables users to search for products by name. Users can make GET requests to /products/search with the name parameter to retrieve JSON responses containing the search results.

## Task 8

Create a REST API endpoint to update an existing product.

### Task: 
The objective of this task is to create a REST API endpoint that allows updating an existing product in the database. The API should accept the updated product details and the ID of the product to be updated in the request payload, and return the updated product as a JSON response.

### Implementation Details:
Endpoint: Create a PUT endpoint /products/{id} where {id} represents the ID of the product to be updated. This endpoint will be handled by the ProductController.

### Request Payload: 
The updated product details should be provided in the request body as JSON. The payload will contain the properties of the product that need to be updated.

### Controller Handling: 
In the ProductController class, implement a method that handles the PUT request for updating the product. This method will have the @PutMapping annotation with the appropriate URL mapping.

### Service Logic: 
Inside the ProductService class, implement the updateProduct method. This method should take the product ID and updated product details as parameters. It will retrieve the existing product from the ProductRepository based on the provided ID.

### Update Product: 
Once the existing product is retrieved, update its properties with the provided details. You can use setters or other appropriate methods to update the specific properties of the product object.

### Save to Database: 
After updating the product, save it back to the database using the ProductRepository. This ensures that the changes are persisted.

### Response: 
Return the updated product as a JSON response. You can use the appropriate response status code (e.g., 200 - OK) to indicate a successful update.

### Handling Non-existent Products: 
If the product with the provided ID does not exist in the database, return a 404 response to indicate that the product was not found.

By following these implementation steps, you will have a functioning REST API endpoint that allows updating existing products. The endpoint will accept the updated product details and the ID of the product to be updated, update the product in the database, and return the updated product as a JSON response.

## Task 9

### Task: 
Create a REST API endpoint to delete a product by its ID.

### Use Case: 
Delete the product with the provided ID from the database.

### Endpoint: 
The ProductController is responsible for handling requests related to product operations. In this task, you need to add a DELETE endpoint at /products/{id}. Here, {id} represents the ID of the product to be deleted. This endpoint will be used to trigger the deletion of the specified product.

### ProductService: 
The ProductService is a service class that contains the business logic for managing products. Within this class, you need to implement the deleteProduct method. This method will handle the deletion of a product by its ID.

### Deletion Process: 
Inside the deleteProduct method, you first need to check if the product with the provided ID exists in the database. This can be done by utilizing the ProductRepository, which interacts with the database. If the product is found, it proceeds with the deletion process. Otherwise, if the product does not exist, a 404 response is returned, indicating that the product could not be found.

### ProductRepository: 
The ProductRepository is responsible for database operations related to products. In this task, the repository will be used to delete the product with the specified ID from the database.

### Response: 
If the deletion process is successful, the deleteProduct method returns a 204 (No Content) response. This signifies that the operation was completed successfully, and there is no content to return. If the product does not exist in the database, a 404 response is returned to indicate that the requested resource (product) could not be found.

By completing this task, you will have a fully functional REST API endpoint that allows users to delete a product by its ID.

