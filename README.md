# Rassandra

Application that demonstrates how Cassandra reactive repositories work along with WebFlux.

## Requirements

* Java 10
* Docker

## Setup

Docker images for Cassandra and the application itself are provided at the `src/main/docker` directory, as well as the necessary bash scripts to initialize the containers at `src/main/bash`.

1. Build Java artifact

   ```shell
   $ ./gradlew clean build -x test
   ```

2. Create Docker images

   ```shell
   $ docker-compose build
   ```

3. Start up the containers

   ```shell
   $ docker-compose up
   ```

4. In order to build the images and start up the containers in the same command, type

   ```shell
   $ docker-compose up --build
   ```

## Testing

The `RassandraApplication` class has some statements that insert data into Cassandra.

Once the containers have started, go to http://localhost:3000/people

## Author

* **Jovanny Cruz** -- [jovannypcg](https://github.com/jovannypcg)

