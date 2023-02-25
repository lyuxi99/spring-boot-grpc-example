# Spring Boot gRPC Server Example Project

This is a sample Java / Gradle / Spring Boot application running a gRPC server with H2 Database as storage.

## Project Structure

```
.
├─grpc-lib                          # Contains the raw protobuf files and generates the java model and service classes.
│  ├─build
│  └─src
│      ├─generated                  # Contains the generated gRPC service definition and protobuf types.
│      └─main
│          ├─java
│          │  └─com.xi.grpclib      # Contains the status codes for the `statusCode` field in RPC responses
│          └─proto                  # The proto file for the gRPC service.
└─grpc-server                       # Contains the actual implementation of the gRPC server and uses the `grpc-lib` module as dependency.
    ├─build
    └─src
        ├─main
        │  ├─java
        │  │  └─com.xi.grpcserver   # Contains the actual implementation of the gRPC server.
        │  │     ├─controller       # Contains the implementation of gRPC service who routes RPC requests to business logic
        │  │     ├─service          # Contains the implementation of business logic.
        │  │     ├─repository       # Contains repositories of entity beans
        │  │     └─entity           # Contains the definitions of entities.
        │  └─resources              # Contains the application configuration, including gRPC configuration and database configuration.
        └─test                      # Contains test cases for gRPC service.
```

## References

* [gRPC-Spring-Boot-Starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/)
* [Java | gRPC](https://grpc.io/docs/languages/java/)
