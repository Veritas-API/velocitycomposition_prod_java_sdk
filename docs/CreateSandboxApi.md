# CreateSandboxApi

All URIs are relative to *https://veritas-prod-prod.apigee.net/velocity-sandbox/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSandbox**](CreateSandboxApi.md#createSandbox) | **POST** /oraclesandbox | 


<a name="createSandbox"></a>
# **createSandbox**
> Sandbox createSandbox(velocityToken, body)



Create Velocity Template , PointinTime and  Sandbox

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateSandboxApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **velocityToken** | **String**| Token received from Velocity Oauth API call |
 **body** | [**ComposedObject**](ComposedObject.md)| ComposedObject |

### Return type

[**Sandbox**](Sandbox.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

