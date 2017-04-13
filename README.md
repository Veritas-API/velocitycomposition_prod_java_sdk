# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CreateSandboxApi;

import java.io.File;
import java.util.*;

public class CreateSandboxApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer.setApiKeyPrefix("Token");

        CreateSandboxApi apiInstance = new CreateSandboxApi();
        String velocityToken = "velocityToken_example"; // String | Token received from Velocity Oauth API call
        ComposedObject body = new ComposedObject(); // ComposedObject | ComposedObject
        try {
            Sandbox result = apiInstance.createSandbox(velocityToken, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateSandboxApi#createSandbox");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://veritas-prod-prod.apigee.net/velocity-sandbox/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CreateSandboxApi* | [**createSandbox**](docs/CreateSandboxApi.md#createSandbox) | **POST** /oraclesandbox | 


## Documentation for Models

 - [ApplianceDetails](docs/ApplianceDetails.md)
 - [ApplicationHostInfo](docs/ApplicationHostInfo.md)
 - [ApplicationInstance](docs/ApplicationInstance.md)
 - [ComposedObject](docs/ComposedObject.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [HashMapstringobject](docs/HashMapstringobject.md)
 - [Mount](docs/Mount.md)
 - [OracleConfig](docs/OracleConfig.md)
 - [OracleInstance](docs/OracleInstance.md)
 - [Sandbox](docs/Sandbox.md)
 - [SandboxConfig](docs/SandboxConfig.md)
 - [ShareLocation](docs/ShareLocation.md)
 - [StatusInfo](docs/StatusInfo.md)
 - [StatusInfoParameter](docs/StatusInfoParameter.md)
 - [User](docs/User.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

alay.vakil@veritas.com

