# POC_cloudblog

// TODO: Explain the purpose of the project

// TODO: Explain mongo 
```
docker exec -i -t cloudblog-mongo mongo
```

## Prerequisite

* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven 3.3](https://maven.apache.org/)
* [Docker](https://www.docker.com/)
* [Your favorite IDE](https://www.jetbrains.com/idea/download/)

## Deployment 
// In progress
```
docker-compose up -d
```

```
mvn clean spring-boot:run 
```
ou
```
java -jar target/poc-cloudblog-1.0-SNAPSHOT.jar
```

> SwaggerUI [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## Technical stack
// In progress
* [Docker](https://www.docker.com/)
* [MongoDB](https://www.mongodb.com/)
* [SpringBoot](https://projects.spring.io/spring-boot/)
* [Swagger](https://swagger.io/)
* [Lombok](https://projectlombok.org/)
* [SpringSecurity]() // TODO

## Tips

> Bash Git prompt: [https://github.com/magicmonty/bash-git-prompt](https://github.com/magicmonty/bash-git-prompt)

> Get container id: docker ps -aqf "name=cloudblog-mongo"

> Get container ip: docker inspect [CONTAINTER_ID]

> Get container ip from container name: docker inspect --format="{{.NetworkSettings.Networks.poccloudblog_default.IPAddress}}" cloudblog-mongo
 
