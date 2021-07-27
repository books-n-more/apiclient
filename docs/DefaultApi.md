# DefaultApi

All URIs are relative to *http://api.home:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdminGetAuthKey**](DefaultApi.md#getAdminGetAuthKey) | **GET** admin/getAuthKey | Your GET endpoint
[**getErrorToStrings**](DefaultApi.md#getErrorToStrings) | **GET** errorToStrings | Your GET endpoint
[**getGetAuthKey**](DefaultApi.md#getGetAuthKey) | **GET** getAuthKey | Your GET endpoint
[**getGetPlanTypes**](DefaultApi.md#getGetPlanTypes) | **GET** getPlanTypes | 
[**postAdminAllDelivered**](DefaultApi.md#postAdminAllDelivered) | **POST** admin/allDelivered | 
[**postAdminBookById**](DefaultApi.md#postAdminBookById) | **POST** admin/bookById | 
[**postAdminCreatePlan**](DefaultApi.md#postAdminCreatePlan) | **POST** admin/createPlan | 
[**postAdminDeletePlan**](DefaultApi.md#postAdminDeletePlan) | **POST** admin/deletePlan | 
[**postAdminDelivered**](DefaultApi.md#postAdminDelivered) | **POST** admin/delivered | 
[**postAdminDeliveryFailed**](DefaultApi.md#postAdminDeliveryFailed) | **POST** admin/deliveryFailed | 
[**postAdminEditBookById**](DefaultApi.md#postAdminEditBookById) | **POST** admin/editBookById | 
[**postAdminFound**](DefaultApi.md#postAdminFound) | **POST** admin/found | 
[**postAdminGetBooks**](DefaultApi.md#postAdminGetBooks) | **POST** admin/getBooks | 
[**postAdminLogin**](DefaultApi.md#postAdminLogin) | **POST** admin/login | 
[**postAdminManifest**](DefaultApi.md#postAdminManifest) | **POST** admin/manifest | 
[**postAdminModifyPlan**](DefaultApi.md#postAdminModifyPlan) | **POST** admin/modifyPlan | 
[**postAdminPickupFailed**](DefaultApi.md#postAdminPickupFailed) | **POST** admin/pickupFailed | 
[**postAdminReadyToDispatchBooks**](DefaultApi.md#postAdminReadyToDispatchBooks) | **POST** admin/readyToDispatchBooks | 
[**postAdminReadyToReturn**](DefaultApi.md#postAdminReadyToReturn) | **POST** admin/readyToReturnBooks | 
[**postAdminReservedBooks**](DefaultApi.md#postAdminReservedBooks) | **POST** admin/reservedBooks | 
[**postAdminReturned**](DefaultApi.md#postAdminReturned) | **POST** admin/returned | 
[**postAdminRevivePlan**](DefaultApi.md#postAdminRevivePlan) | **POST** admin/revivePlan | 
[**postAdminSubstitute**](DefaultApi.md#postAdminSubstitute) | **POST** admin/substitute | 
[**postAdminSuspendPlan**](DefaultApi.md#postAdminSuspendPlan) | **POST** admin/suspendPlan | 
[**postAdminVerifyKey**](DefaultApi.md#postAdminVerifyKey) | **POST** admin/verifyKey | 
[**postCancelReadyToReturnBook**](DefaultApi.md#postCancelReadyToReturnBook) | **POST** cancelReadyToReturnBook | 
[**postCancelReserveBook**](DefaultApi.md#postCancelReserveBook) | **POST** cancelReserveBook | 
[**postCreateMember**](DefaultApi.md#postCreateMember) | **POST** createMember | 
[**postCreatePlan**](DefaultApi.md#postCreatePlan) | **POST** createPlan | 
[**postDeletePlan**](DefaultApi.md#postDeletePlan) | **POST** deletePlan | 
[**postGetHotBooks**](DefaultApi.md#postGetHotBooks) | **POST** getHotBooks | 
[**postGetMember**](DefaultApi.md#postGetMember) | **POST** getMember | 
[**postLogin**](DefaultApi.md#postLogin) | **POST** login | 
[**postModifyPlan**](DefaultApi.md#postModifyPlan) | **POST** modifyPlan | 
[**postReadyToReturnBook**](DefaultApi.md#postReadyToReturnBook) | **POST** readyToReturnBook | 
[**postReserveBook**](DefaultApi.md#postReserveBook) | **POST** reserveBook | 
[**postRevivePlan**](DefaultApi.md#postRevivePlan) | **POST** revivePlan | 
[**postSearch**](DefaultApi.md#postSearch) | **POST** search | 
[**postSuspendPlan**](DefaultApi.md#postSuspendPlan) | **POST** suspendPlan | 
[**postVerifyKey**](DefaultApi.md#postVerifyKey) | **POST** verifyKey | 



## getAdminGetAuthKey

> GetAuthKeyRespone getAdminGetAuthKey()

Your GET endpoint

get an auth key (Admin version)

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GetAuthKeyRespone result = apiInstance.getAdminGetAuthKey();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAdminGetAuthKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetAuthKeyRespone**](GetAuthKeyRespone.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getErrorToStrings

> ErrorData getErrorToStrings()

Your GET endpoint

Error codes to string mappper

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ErrorData result = apiInstance.getErrorToStrings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getErrorToStrings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ErrorData**](ErrorData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGetAuthKey

> GetAuthKeyRespone getGetAuthKey()

Your GET endpoint

get an auth key

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GetAuthKeyRespone result = apiInstance.getGetAuthKey();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getGetAuthKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetAuthKeyRespone**](GetAuthKeyRespone.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGetPlanTypes

> PlanInfo getGetPlanTypes()



### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            PlanInfo result = apiInstance.getGetPlanTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getGetPlanTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PlanInfo**](PlanInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminAllDelivered

> BaseError postAdminAllDelivered(verifyKeyBody)



All books delivered

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            BaseError result = apiInstance.postAdminAllDelivered(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminAllDelivered");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminBookById

> AdminBookByIdData postAdminBookById(memberActionInput)



get a book by id

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MemberActionInput memberActionInput = new MemberActionInput(); // MemberActionInput | 
        try {
            AdminBookByIdData result = apiInstance.postAdminBookById(memberActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminBookById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberActionInput** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**AdminBookByIdData**](AdminBookByIdData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminCreatePlan

> postAdminCreatePlan(planActionInput)



Admin Create Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            apiInstance.postAdminCreatePlan(planActionInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminCreatePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |


## postAdminDeletePlan

> BaseError postAdminDeletePlan(planActionInput)



Admin delete plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postAdminDeletePlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminDeletePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |


## postAdminDelivered

> BaseError postAdminDelivered(adminActionInput)



Delivered a book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminActionInput adminActionInput = new AdminActionInput(); // AdminActionInput | 
        try {
            BaseError result = apiInstance.postAdminDelivered(adminActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminDelivered");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminActionInput** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminDeliveryFailed

> BaseError postAdminDeliveryFailed(adminActionInput)



Delivery failed for a book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminActionInput adminActionInput = new AdminActionInput(); // AdminActionInput | 
        try {
            BaseError result = apiInstance.postAdminDeliveryFailed(adminActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminDeliveryFailed");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminActionInput** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminEditBookById

> BaseError postAdminEditBookById(adminEditBookByIdBody)



edit a book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminEditBookByIdBody adminEditBookByIdBody = new AdminEditBookByIdBody(); // AdminEditBookByIdBody | 
        try {
            BaseError result = apiInstance.postAdminEditBookById(adminEditBookByIdBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminEditBookById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminEditBookByIdBody** | [**AdminEditBookByIdBody**](AdminEditBookByIdBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminFound

> BaseError postAdminFound(adminActionInput)



Book found 

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminActionInput adminActionInput = new AdminActionInput(); // AdminActionInput | 
        try {
            BaseError result = apiInstance.postAdminFound(adminActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminFound");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminActionInput** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminGetBooks

> AdminBookListData postAdminGetBooks(bookListBody)



Get Books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BookListBody bookListBody = new BookListBody(); // BookListBody | 
        try {
            AdminBookListData result = apiInstance.postAdminGetBooks(bookListBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminGetBooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookListBody** | [**BookListBody**](BookListBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminLogin

> BaseError postAdminLogin(adminLoginBody)



login as an admin

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminLoginBody adminLoginBody = new AdminLoginBody(); // AdminLoginBody | 
        try {
            BaseError result = apiInstance.postAdminLogin(adminLoginBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminLogin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminLoginBody** | [**AdminLoginBody**](AdminLoginBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminManifest

> ManifestData postAdminManifest(verifyKeyBody)



Generate Manifest

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            ManifestData result = apiInstance.postAdminManifest(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminManifest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**ManifestData**](ManifestData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminModifyPlan

> BaseError postAdminModifyPlan(planActionInput)



Admin Modify Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postAdminModifyPlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminModifyPlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminPickupFailed

> BaseError postAdminPickupFailed(adminActionInput)



Pickup Failed for a book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminActionInput adminActionInput = new AdminActionInput(); // AdminActionInput | 
        try {
            BaseError result = apiInstance.postAdminPickupFailed(adminActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminPickupFailed");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminActionInput** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminReadyToDispatchBooks

> AdminBookListData postAdminReadyToDispatchBooks(verifyKeyBody)



Admin Ready to dispatch books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            AdminBookListData result = apiInstance.postAdminReadyToDispatchBooks(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminReadyToDispatchBooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminReadyToReturn

> AdminBookListData postAdminReadyToReturn(verifyKeyBody)



List of ready to return books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            AdminBookListData result = apiInstance.postAdminReadyToReturn(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminReadyToReturn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminReservedBooks

> AdminBookListData postAdminReservedBooks(verifyKeyBody)



Admin Reserved Books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            AdminBookListData result = apiInstance.postAdminReservedBooks(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminReservedBooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminReturned

> BaseError postAdminReturned(adminActionInput)



Book returned by Member

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdminActionInput adminActionInput = new AdminActionInput(); // AdminActionInput | 
        try {
            BaseError result = apiInstance.postAdminReturned(adminActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminReturned");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminActionInput** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminRevivePlan

> BaseError postAdminRevivePlan(planActionInput)



Admin Revive Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postAdminRevivePlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminRevivePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminSubstitute

> BaseError postAdminSubstitute(substituteBookData)



Substitute Books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SubstituteBookData substituteBookData = new SubstituteBookData(); // SubstituteBookData | 
        try {
            BaseError result = apiInstance.postAdminSubstitute(substituteBookData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminSubstitute");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substituteBookData** | [**SubstituteBookData**](SubstituteBookData.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminSuspendPlan

> BaseError postAdminSuspendPlan(planActionInput)



Admin Suspend Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postAdminSuspendPlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminSuspendPlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postAdminVerifyKey

> BaseError postAdminVerifyKey(verifyKeyBody)



verify an admin auth key

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            BaseError result = apiInstance.postAdminVerifyKey(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postAdminVerifyKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCancelReadyToReturnBook

> MemberAction postCancelReadyToReturnBook(memberActionInput)



cacnels a request for ready to return book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MemberActionInput memberActionInput = new MemberActionInput(); // MemberActionInput | 
        try {
            MemberAction result = apiInstance.postCancelReadyToReturnBook(memberActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postCancelReadyToReturnBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberActionInput** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberAction**](MemberAction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCancelReserveBook

> MemberAction postCancelReserveBook(memberActionInput)



cancels a reservation

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MemberActionInput memberActionInput = new MemberActionInput(); // MemberActionInput | 
        try {
            MemberAction result = apiInstance.postCancelReserveBook(memberActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postCancelReserveBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberActionInput** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberAction**](MemberAction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCreateMember

> BaseError postCreateMember(createMemberInput)



create a new member

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateMemberInput createMemberInput = new CreateMemberInput(); // CreateMemberInput | 
        try {
            BaseError result = apiInstance.postCreateMember(createMemberInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postCreateMember");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMemberInput** | [**CreateMemberInput**](CreateMemberInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCreatePlan

> BaseError postCreatePlan(planActionInput)



creates a plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postCreatePlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postCreatePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postDeletePlan

> BaseError postDeletePlan(planActionInput)



Delete Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postDeletePlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postDeletePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postGetHotBooks

> InlineResponse200 postGetHotBooks(verifyKeyBody)



get hot books

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            InlineResponse200 result = apiInstance.postGetHotBooks(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postGetHotBooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postGetMember

> User postGetMember(verifyKeyBody)



get data for home screen

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            User result = apiInstance.postGetMember(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postGetMember");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postLogin

> BaseError postLogin(userLoginBody)



Login

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UserLoginBody userLoginBody = new UserLoginBody(); // UserLoginBody | 
        try {
            BaseError result = apiInstance.postLogin(userLoginBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postLogin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLoginBody** | [**UserLoginBody**](UserLoginBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postModifyPlan

> BaseError postModifyPlan(planActionInput)



Modify Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postModifyPlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postModifyPlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postReadyToReturnBook

> MemberAction postReadyToReturnBook(memberActionInput)



marks a book as ready to return

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MemberActionInput memberActionInput = new MemberActionInput(); // MemberActionInput | 
        try {
            MemberAction result = apiInstance.postReadyToReturnBook(memberActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postReadyToReturnBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberActionInput** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberAction**](MemberAction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postReserveBook

> MemberAction postReserveBook(memberActionInput)



reserves a book

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MemberActionInput memberActionInput = new MemberActionInput(); // MemberActionInput | 
        try {
            MemberAction result = apiInstance.postReserveBook(memberActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postReserveBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberActionInput** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberAction**](MemberAction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postRevivePlan

> BaseError postRevivePlan(planActionInput)



Revive Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postRevivePlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postRevivePlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postSearch

> SearchData postSearch(searchBody)



search

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SearchBody searchBody = new SearchBody(); // SearchBody | 
        try {
            SearchData result = apiInstance.postSearch(searchBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchBody** | [**SearchBody**](SearchBody.md)|  | [optional]

### Return type

[**SearchData**](SearchData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postSuspendPlan

> BaseError postSuspendPlan(planActionInput)



Suspend Plan

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PlanActionInput planActionInput = new PlanActionInput(); // PlanActionInput | 
        try {
            BaseError result = apiInstance.postSuspendPlan(planActionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postSuspendPlan");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planActionInput** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postVerifyKey

> BaseError postVerifyKey(verifyKeyBody)



verify an auth key

### Example

```java
// Import classes:
import in.co.booksnmore.api.ApiClient;
import in.co.booksnmore.api.ApiException;
import in.co.booksnmore.api.Configuration;
import in.co.booksnmore.api.models.*;
import in.co.booksnmore.apiClient.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.home:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        VerifyKeyBody verifyKeyBody = new VerifyKeyBody(); // VerifyKeyBody | 
        try {
            BaseError result = apiInstance.postVerifyKey(verifyKeyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postVerifyKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyKeyBody** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

