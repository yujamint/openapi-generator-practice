# io.swagger.server - Kotlin Server library for 열심히해보자

뭐지

Generated by Swagger Codegen 3.0.47 (2023-10-07T17:58:37.400728+09:00[Asia/Seoul]).

## Requires

* Kotlin 1.2.10
* Gradle 4.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/kotlin-server.jar`.

You may also run in docker:

```
docker build -t kotlin-server .
docker run -p 8080:8080 kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**announcementsAnnouncementIdGet**](docs/DefaultApi.md#announcementsannouncementidget) | **GET** /announcements/{announcementId} | 공지 단건 조회
*DefaultApi* | [**announcementsGet**](docs/DefaultApi.md#announcementsget) | **GET** /announcements | 공지 전체 조회
*DefaultApi* | [**announcementsPost**](docs/DefaultApi.md#announcementspost) | **POST** /announcements | 공지 작성

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.server.models.AnnouncementCreateRequest](docs/AnnouncementCreateRequest.md)
 - [io.swagger.server.models.AnnouncementResponse](docs/AnnouncementResponse.md)
 - [io.swagger.server.models.Writer](docs/Writer.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
