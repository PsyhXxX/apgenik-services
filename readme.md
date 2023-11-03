
`http://localhost:8080/greeting`

`{"id":1,"content":"Hello, World!"}`

`http://localhost:8080/greeting?name=User`

`{"id":2,"content":"Hello, User!"}`


### Создание docker image

`docker build -f docker/Dockerfile -t apgenik-services:latest .`

`docker run --name apgenik-services -d -p 8080:8080 -t apgenik-services:latest`

`docker run --name apgenik-services -d -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" -t apgenik-services:latest`