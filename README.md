## About
I developed a microservices-based application to perform fraud checks on customers and maintain a history of fraud checks. 
The application consists of two microservices, Customer and Fraud, which communicate with each other over HTTP. 

### Customer microservice
Customer microservice handles customer registration and performs a fraud check by communicating with another microservice using HTTP. 
It utilizes Spring Boot for dependency injection, Spring Data JPA for database interactions, and RestTemplate for making HTTP requests.

### Fraud microservice
Fraud microservice performs fraud checks on customers and maintains a history of these checks. 
When a request is made to the microservice, it stores the result of the fraud check in its history (in this practice, I assumed no fraud initially). 
The microservice then responds with the outcome, indicating whether the customer is flagged as a fraudster or not.

![Screen Shot 2023-07-30 at 12 45 49 PM](https://github.com/Mina314/Customer-Fraud-Microservices/assets/64227723/780bdb15-c667-4c67-9246-fa5679bf62f2)


Technologies Used:
* Java
* Spring Boot
* Spring Cloud
* Maven
* PostgreSQL
* Docker
* Lombok
* RESTful API

Initialize Steps Guide:

1. Install Maven:
Make sure you have Maven installed on your system. If not, you can install it using Homebrew (for macOS) with the following commands:
```
brew install maven
mvn --version

```

2. Create a new Maven Project:
Run the Maven archetype:generate command to create a new Maven project with the appropriate structure for your Customer Fraud Microservices project.
you can replace the placeholders com.mycompany.app and my-app with your desired values for the project's Group ID and Artifact ID.
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

```

3. Navigate to Project Directory:
Change the current working directory to the newly created project directory:
```
cd my-app

```

4. Verify Project Structure:
After navigating to the project directory, you can verify the Maven file structure by listing the contents of the directory:
```
ls

```

5. Optional: Install tree (for better directory visualization):
If you want a more organized and visual representation of the project directory structure, you can install the "tree" command using Homebrew:
```
tree

```

6. Set Up Docker Containers:
If your microservices use Docker containers for deployment, you can start the containers using Docker Compose. Ensure you have Docker and Docker Compose installed on your system.
```

docker-compose up -d

```

7. Stop Docker Containers (if needed):
To stop and remove the Docker containers associated with the project, run:
```
docker-compose down

```

8. View Running Docker Containers:
To check if the Docker containers are running, use the following command:
```
docker ps

```









