# **Application for reserving project topics**

_Systemy informatyczne w zarządzaniu 2020_

Application based on common client - server architecture, in
repository you can find out:
- topicsapp (backend/server) - listening on port **8900**,
- topicsweb (frontend/client) - listening on port **8080**.

The comunnication between those two uses REST API with /api as
servlet path.
After run the topicsapp, check out Swagger on URL:
http://localhost:8900/api/swagger-ui.html

All API endpoints require JWT Authentication except:
- POST /login,
- POST /users.

Moreover, validation for user roles is also configured. Default role for new user is STUDENT.
Flyway script creates default admin account (admin/admin123) with role TEACHER.

#### Stack for backend:
- Spring Boot 2.2.6.RELEASE
- Spring Security 5.1.6.RELEASE
- jsonwebtoken 0.9.1
- Postgresql database
- Flyway for migration
- Swagger docs v3
- Lombok 

#### Stack for fronted:
- Spring Boot 2.2.6.RELEASE
- Spring RestTemplate for API communication
- Vaadin framework for fronted components

###### Both backend and fronted use JDK 1.8.

To run the application:
1) git clone
2) make sure you have node-js library installed on your PC
3) create postgresql database topics with owner topic/topic  (port 5432)
4) run mvn clean&install which produces 2 .jar files
5) run both applications

_Backend team:_
- Marcin Piwko (main architect), 
- Jakub Patecki

_Frontend team:_
- Ambroży Pala,
- Alek Nosal

