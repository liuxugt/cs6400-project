# cs6400-project

## to run the backend
First run the following command, it will load the docker container containing the data in the database
### docker-compose up

Then in another terminal, run the following command:
### ./gradlew build && java -jar ./build/libs/backend-0.0.1-SNAPSHOT.jar

Then you could get access to the backend API by sending request to 127.0.0.1:8080/api/

The test api is 127.0.0.1:8080/api/movies, it will return 10 movies information from the database.
