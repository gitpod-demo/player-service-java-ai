## Player service

Player service is a spring boot based microservice which serves the contents of `Player.csv` through a REST API. 
This service also integrates with a traditional AI model which is located in `/player-service-model` folder.

APIs implemented:

- `GET /v1/players` - returns the list of all players.
- `GET /v1/players/{playerID}` - returns a single player by ID.
- `GET /v1/players/country/{countryName}` - returns the list of all players by *countryName*
- `POST /v1/model/generate` - Endpoint to generate team using the player-service-model

Player service makes CRUD operations & finder methods with Spring Data JPA’s JpaRepository.

The database connected to this service is `in-memory H2 Database`.

### Technology

- Java 17
- Maven
- Spring Boot 3.3.4 (with Spring Web MVC, Spring Data JPA)
- H2 Database

### Overview

- `Player` data model class corresponds to entity and table `PLAYERS`.
- `PlayerRepository` is an interface that extends JpaRepository for CRUD methods and custom finder methods. It will be autowired in `PlayerServiceImpl` class.
- `PlayerController` is a RestController which has request mapping methods for RESTful requests - *getPlayers, getPlayerById and getPlayerByBirthCountry*
- Configuration for Spring Datasource, JPA & Hibernate in `application.yml`.
- `pom.xml` contains dependencies for Spring Boot and H2 Database.
- `/collection` folder contains sample requests for player service.