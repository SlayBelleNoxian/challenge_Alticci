# Starting the api
To start the api you need to be inside the API folder. You have 2 options to start:

## Using docker:

> **_NOTE:_**  Quarkus ships a Dev UI, which is available in dev mode, in which building a container is not builded in dev mode.

This creates the docker image with the default name of alticci/api:
```
./mvnw package 
```

This starts the docker container with the docker image created:
```
docker run -d -p 8080:8080 --name api_alticci alticci/api
```

To remove the docker container you need do this:
```
docker rm -f api_alticci
```

To remove the docker image you need do this:
```
docker rmi -f alticci/api
```

## Using command line / Terminal:

This is the command that starts the server on dev mode, does not create a docker this way.
```
./mvnw compile quarkus:dev
```

> **_NOTE:_**  When you start the api the terminal/cmd, will not be able to be used until you stop it (using CTRL + C).

# Accessing swagger

To access swagger you need to run the api in dev mode. The path to the swagger is ```localhost:8080/swagger```