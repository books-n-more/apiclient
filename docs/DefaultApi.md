# DefaultApi

All URIs are relative to *http://{host}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdminGetAuthKey**](DefaultApi.md#getAdminGetAuthKey) | **GET** admin/getAuthKey | Your GET endpoint
[**getErrorToStrings**](DefaultApi.md#getErrorToStrings) | **GET** errorToStrings | Your GET endpoint
[**getGetAuthKey**](DefaultApi.md#getGetAuthKey) | **GET** getAuthKey | Your GET endpoint
[**getGetPlanTypes**](DefaultApi.md#getGetPlanTypes) | **GET** getPlanTypes | 
[**postAddDelivery**](DefaultApi.md#postAddDelivery) | **POST** addDelivery | 
[**postAdminAddDelivery**](DefaultApi.md#postAdminAddDelivery) | **POST** admin/addDelivery | 
[**postAdminAllDelivered**](DefaultApi.md#postAdminAllDelivered) | **POST** admin/allDelivered | 
[**postAdminBookById**](DefaultApi.md#postAdminBookById) | **POST** admin/bookById | 
[**postAdminBorrow**](DefaultApi.md#postAdminBorrow) | **POST** admin/borrow | 
[**postAdminCash**](DefaultApi.md#postAdminCash) | **POST** admin/cash | 
[**postAdminCreateBook**](DefaultApi.md#postAdminCreateBook) | **POST** admin/createBook | 
[**postAdminCreateMember**](DefaultApi.md#postAdminCreateMember) | **POST** admin/createMember | 
[**postAdminCreatePlan**](DefaultApi.md#postAdminCreatePlan) | **POST** admin/createPlan | 
[**postAdminDeletePlan**](DefaultApi.md#postAdminDeletePlan) | **POST** admin/deletePlan | 
[**postAdminDelivered**](DefaultApi.md#postAdminDelivered) | **POST** admin/delivered | 
[**postAdminDeliveryFailed**](DefaultApi.md#postAdminDeliveryFailed) | **POST** admin/deliveryFailed | 
[**postAdminEditBookById**](DefaultApi.md#postAdminEditBookById) | **POST** admin/editBookById | 
[**postAdminEditMember**](DefaultApi.md#postAdminEditMember) | **POST** admin/editMember | 
[**postAdminFound**](DefaultApi.md#postAdminFound) | **POST** admin/found | 
[**postAdminGetBooks**](DefaultApi.md#postAdminGetBooks) | **POST** admin/getBooks | 
[**postAdminGetDeliveryCost**](DefaultApi.md#postAdminGetDeliveryCost) | **POST** admin/getDeliveryCost | 
[**postAdminGetMember**](DefaultApi.md#postAdminGetMember) | **POST** admin/getMember | 
[**postAdminGetMemberDues**](DefaultApi.md#postAdminGetMemberDues) | **POST** admin/getMemberDues | 
[**postAdminLogin**](DefaultApi.md#postAdminLogin) | **POST** admin/login | 
[**postAdminLogout**](DefaultApi.md#postAdminLogout) | **POST** admin/logout | 
[**postAdminManifest**](DefaultApi.md#postAdminManifest) | **POST** admin/manifest | 
[**postAdminModifyPlan**](DefaultApi.md#postAdminModifyPlan) | **POST** admin/modifyPlan | 
[**postAdminPickupFailed**](DefaultApi.md#postAdminPickupFailed) | **POST** admin/pickupFailed | 
[**postAdminReadyToDispatchBooks**](DefaultApi.md#postAdminReadyToDispatchBooks) | **POST** admin/readyToDispatchBooks | 
[**postAdminReadyToReturn**](DefaultApi.md#postAdminReadyToReturn) | **POST** admin/readyToReturnBooks | 
[**postAdminReservedBooks**](DefaultApi.md#postAdminReservedBooks) | **POST** admin/reservedBooks | 
[**postAdminReturn**](DefaultApi.md#postAdminReturn) | **POST** admin/return | 
[**postAdminReturned**](DefaultApi.md#postAdminReturned) | **POST** admin/returned | 
[**postAdminRevivePlan**](DefaultApi.md#postAdminRevivePlan) | **POST** admin/revivePlan | 
[**postAdminSubstitute**](DefaultApi.md#postAdminSubstitute) | **POST** admin/substitute | 
[**postAdminSuspendPlan**](DefaultApi.md#postAdminSuspendPlan) | **POST** admin/suspendPlan | 
[**postAdminTransactionReport**](DefaultApi.md#postAdminTransactionReport) | **POST** admin/transactionReport | 
[**postAdminUpdatePassword**](DefaultApi.md#postAdminUpdatePassword) | **POST** admin/updatePassword | 
[**postAdminVerifyKey**](DefaultApi.md#postAdminVerifyKey) | **POST** admin/verifyKey | 
[**postBrowseLibrary**](DefaultApi.md#postBrowseLibrary) | **POST** browseLibrary | 
[**postCancelReadyToReturnBook**](DefaultApi.md#postCancelReadyToReturnBook) | **POST** cancelReadyToReturnBook | 
[**postCancelReserveBook**](DefaultApi.md#postCancelReserveBook) | **POST** cancelReserveBook | 
[**postCreateMember**](DefaultApi.md#postCreateMember) | **POST** createMember | 
[**postCreatePlan**](DefaultApi.md#postCreatePlan) | **POST** createPlan | 
[**postDeletePlan**](DefaultApi.md#postDeletePlan) | **POST** deletePlan | 
[**postEditMember**](DefaultApi.md#postEditMember) | **POST** editMember | 
[**postGetDeliveryCost**](DefaultApi.md#postGetDeliveryCost) | **POST** getDeliveryCost | 
[**postGetHotBooks**](DefaultApi.md#postGetHotBooks) | **POST** getHotBooks | 
[**postGetMember**](DefaultApi.md#postGetMember) | **POST** getMember | 
[**postGetMemberDues**](DefaultApi.md#postGetMemberDues) | **POST** getMemberDues | 
[**postLogin**](DefaultApi.md#postLogin) | **POST** login | 
[**postLogout**](DefaultApi.md#postLogout) | **POST** logout | 
[**postModifyPlan**](DefaultApi.md#postModifyPlan) | **POST** modifyPlan | 
[**postReadyToReturnBook**](DefaultApi.md#postReadyToReturnBook) | **POST** readyToReturnBook | 
[**postReserveBook**](DefaultApi.md#postReserveBook) | **POST** reserveBook | 
[**postRevivePlan**](DefaultApi.md#postRevivePlan) | **POST** revivePlan | 
[**postSearch**](DefaultApi.md#postSearch) | **POST** search | 
[**postSuspendPlan**](DefaultApi.md#postSuspendPlan) | **POST** suspendPlan | 
[**postUpdatePassword**](DefaultApi.md#postUpdatePassword) | **POST** updatePassword | 
[**postVerifyKey**](DefaultApi.md#postVerifyKey) | **POST** verifyKey | 

<a name="getAdminGetAuthKey"></a>
# **getAdminGetAuthKey**
> GetAuthKeyRespone getAdminGetAuthKey()

Your GET endpoint

get an auth key (Admin version)

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    GetAuthKeyRespone result = apiInstance.getAdminGetAuthKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAdminGetAuthKey");
    e.printStackTrace();
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

<a name="getErrorToStrings"></a>
# **getErrorToStrings**
> ErrorData getErrorToStrings()

Your GET endpoint

Error codes to string mappper

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ErrorData result = apiInstance.getErrorToStrings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getErrorToStrings");
    e.printStackTrace();
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

<a name="getGetAuthKey"></a>
# **getGetAuthKey**
> GetAuthKeyRespone getGetAuthKey()

Your GET endpoint

get an auth key

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    GetAuthKeyRespone result = apiInstance.getGetAuthKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getGetAuthKey");
    e.printStackTrace();
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

<a name="getGetPlanTypes"></a>
# **getGetPlanTypes**
> PlanInfo getGetPlanTypes()



### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PlanInfo result = apiInstance.getGetPlanTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getGetPlanTypes");
    e.printStackTrace();
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

<a name="postAddDelivery"></a>
# **postAddDelivery**
> Void postAddDelivery(body)



Add Delivery

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    Void result = apiInstance.postAddDelivery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAddDelivery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="postAdminAddDelivery"></a>
# **postAdminAddDelivery**
> MemberData postAdminAddDelivery(body)



Admin Add delivery

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminMemberInput body = new AdminMemberInput(); // AdminMemberInput | 
try {
    MemberData result = apiInstance.postAdminAddDelivery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminAddDelivery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminMemberInput**](AdminMemberInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminAllDelivered"></a>
# **postAdminAllDelivered**
> BaseError postAdminAllDelivered(body)



All books delivered

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BaseError result = apiInstance.postAdminAllDelivered(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminAllDelivered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminBookById"></a>
# **postAdminBookById**
> AdminBookByIdData postAdminBookById(body)



get a book by id

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberActionInput body = new MemberActionInput(); // MemberActionInput | 
try {
    AdminBookByIdData result = apiInstance.postAdminBookById(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminBookById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**AdminBookByIdData**](AdminBookByIdData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminBorrow"></a>
# **postAdminBorrow**
> MemberData postAdminBorrow(body)



Admin Borrow

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    MemberData result = apiInstance.postAdminBorrow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminBorrow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, multipart/form-data
 - **Accept**: application/json

<a name="postAdminBorrow"></a>
# **postAdminBorrow**
> MemberData postAdminBorrow(body)



Admin Borrow

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    MemberData result = apiInstance.postAdminBorrow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminBorrow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, multipart/form-data
 - **Accept**: application/json

<a name="postAdminCash"></a>
# **postAdminCash**
> MemberData postAdminCash(body)



Admin Cash In

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
CashInput body = new CashInput(); // CashInput | 
try {
    MemberData result = apiInstance.postAdminCash(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CashInput**](CashInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminCreateBook"></a>
# **postAdminCreateBook**
> AdminBookByIdData postAdminCreateBook(body)



Create Book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminEditBookByIdBody body = new AdminEditBookByIdBody(); // AdminEditBookByIdBody | 
try {
    AdminBookByIdData result = apiInstance.postAdminCreateBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCreateBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminEditBookByIdBody**](AdminEditBookByIdBody.md)|  | [optional]

### Return type

[**AdminBookByIdData**](AdminBookByIdData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="postAdminCreateBook"></a>
# **postAdminCreateBook**
> AdminBookByIdData postAdminCreateBook(body)



Create Book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminEditBookByIdBody body = new AdminEditBookByIdBody(); // AdminEditBookByIdBody | 
try {
    AdminBookByIdData result = apiInstance.postAdminCreateBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCreateBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminEditBookByIdBody**](AdminEditBookByIdBody.md)|  | [optional]

### Return type

[**AdminBookByIdData**](AdminBookByIdData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="postAdminCreateMember"></a>
# **postAdminCreateMember**
> MemberData postAdminCreateMember(body)



Admin Create Member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberDetailsInput body = new MemberDetailsInput(); // MemberDetailsInput | 
try {
    MemberData result = apiInstance.postAdminCreateMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCreateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberDetailsInput**](MemberDetailsInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminCreatePlan"></a>
# **postAdminCreatePlan**
> MemberData postAdminCreatePlan(body)



Admin Create Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminCreatePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCreatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="postAdminCreatePlan"></a>
# **postAdminCreatePlan**
> MemberData postAdminCreatePlan(body)



Admin Create Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminCreatePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminCreatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="postAdminDeletePlan"></a>
# **postAdminDeletePlan**
> MemberData postAdminDeletePlan(body)



Admin delete plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminDeletePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminDeletePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminDelivered"></a>
# **postAdminDelivered**
> BaseError postAdminDelivered(body)



Delivered a book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    BaseError result = apiInstance.postAdminDelivered(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminDelivered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminDeliveryFailed"></a>
# **postAdminDeliveryFailed**
> BaseError postAdminDeliveryFailed(body)



Delivery failed for a book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    BaseError result = apiInstance.postAdminDeliveryFailed(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminDeliveryFailed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminEditBookById"></a>
# **postAdminEditBookById**
> AdminBookByIdData postAdminEditBookById(body)



edit a book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminEditBookByIdBody body = new AdminEditBookByIdBody(); // AdminEditBookByIdBody | 
try {
    AdminBookByIdData result = apiInstance.postAdminEditBookById(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminEditBookById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminEditBookByIdBody**](AdminEditBookByIdBody.md)|  | [optional]

### Return type

[**AdminBookByIdData**](AdminBookByIdData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminEditMember"></a>
# **postAdminEditMember**
> MemberData postAdminEditMember(body)



Admin Edit Member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberDetailsInput body = new MemberDetailsInput(); // MemberDetailsInput | 
try {
    MemberData result = apiInstance.postAdminEditMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminEditMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberDetailsInput**](MemberDetailsInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminFound"></a>
# **postAdminFound**
> BaseError postAdminFound(body)



Book found 

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    BaseError result = apiInstance.postAdminFound(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminFound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminGetBooks"></a>
# **postAdminGetBooks**
> AdminBookListData postAdminGetBooks(body)



Get Books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
BookListBody body = new BookListBody(); // BookListBody | 
try {
    AdminBookListData result = apiInstance.postAdminGetBooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminGetBooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BookListBody**](BookListBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminGetDeliveryCost"></a>
# **postAdminGetDeliveryCost**
> DeliveryCostData postAdminGetDeliveryCost(body)



Admin Get Delivery Cost

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AddressInput body = new AddressInput(); // AddressInput | 
try {
    DeliveryCostData result = apiInstance.postAdminGetDeliveryCost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminGetDeliveryCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressInput**](AddressInput.md)|  | [optional]

### Return type

[**DeliveryCostData**](DeliveryCostData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminGetMember"></a>
# **postAdminGetMember**
> MemberData postAdminGetMember(body)



Admin Get Member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminMemberInput body = new AdminMemberInput(); // AdminMemberInput | 
try {
    MemberData result = apiInstance.postAdminGetMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminGetMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminMemberInput**](AdminMemberInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminGetMemberDues"></a>
# **postAdminGetMemberDues**
> BalanceDueData postAdminGetMemberDues(body)



Admin Get Member Dues

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminMemberInput body = new AdminMemberInput(); // AdminMemberInput | 
try {
    BalanceDueData result = apiInstance.postAdminGetMemberDues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminGetMemberDues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminMemberInput**](AdminMemberInput.md)|  | [optional]

### Return type

[**BalanceDueData**](BalanceDueData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminLogin"></a>
# **postAdminLogin**
> BaseError postAdminLogin(body)



login as an admin

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminLoginBody body = new AdminLoginBody(); // AdminLoginBody | 
try {
    BaseError result = apiInstance.postAdminLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminLoginBody**](AdminLoginBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminLogout"></a>
# **postAdminLogout**
> BaseError postAdminLogout(body)



Admin logout

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BaseError result = apiInstance.postAdminLogout(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminManifest"></a>
# **postAdminManifest**
> ManifestData postAdminManifest(body)



Generate Manifest

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    ManifestData result = apiInstance.postAdminManifest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminManifest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**ManifestData**](ManifestData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminModifyPlan"></a>
# **postAdminModifyPlan**
> MemberData postAdminModifyPlan(body)



Admin Modify Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminModifyPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminModifyPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminPickupFailed"></a>
# **postAdminPickupFailed**
> BaseError postAdminPickupFailed(body)



Pickup Failed for a book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    BaseError result = apiInstance.postAdminPickupFailed(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminPickupFailed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminReadyToDispatchBooks"></a>
# **postAdminReadyToDispatchBooks**
> AdminBookListData postAdminReadyToDispatchBooks(body)



Admin Ready to dispatch books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    AdminBookListData result = apiInstance.postAdminReadyToDispatchBooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminReadyToDispatchBooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminReadyToReturn"></a>
# **postAdminReadyToReturn**
> AdminBookListData postAdminReadyToReturn(body)



List of ready to return books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    AdminBookListData result = apiInstance.postAdminReadyToReturn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminReadyToReturn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminReservedBooks"></a>
# **postAdminReservedBooks**
> AdminBookListData postAdminReservedBooks(body)



Admin Reserved Books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    AdminBookListData result = apiInstance.postAdminReservedBooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminReservedBooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**AdminBookListData**](AdminBookListData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminReturn"></a>
# **postAdminReturn**
> MemberData postAdminReturn(body)



Admin Return

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    MemberData result = apiInstance.postAdminReturn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminReturn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminReturned"></a>
# **postAdminReturned**
> BaseError postAdminReturned(body)



Book returned by Member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AdminActionInput body = new AdminActionInput(); // AdminActionInput | 
try {
    BaseError result = apiInstance.postAdminReturned(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminReturned");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminActionInput**](AdminActionInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminRevivePlan"></a>
# **postAdminRevivePlan**
> MemberData postAdminRevivePlan(body)



Admin Revive Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminRevivePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminRevivePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminSubstitute"></a>
# **postAdminSubstitute**
> BaseError postAdminSubstitute(body)



Substitute Books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
SubstituteBookData body = new SubstituteBookData(); // SubstituteBookData | 
try {
    BaseError result = apiInstance.postAdminSubstitute(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminSubstitute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubstituteBookData**](SubstituteBookData.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminSuspendPlan"></a>
# **postAdminSuspendPlan**
> MemberData postAdminSuspendPlan(body)



Admin Suspend Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postAdminSuspendPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminSuspendPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminTransactionReport"></a>
# **postAdminTransactionReport**
> TransactionReport postAdminTransactionReport(body)



Admin Transaction Report

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ReportInput body = new ReportInput(); // ReportInput | 
try {
    TransactionReport result = apiInstance.postAdminTransactionReport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminTransactionReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportInput**](ReportInput.md)|  | [optional]

### Return type

[**TransactionReport**](TransactionReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminUpdatePassword"></a>
# **postAdminUpdatePassword**
> BaseError postAdminUpdatePassword(body)



Admin Update Password

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PasswordUpdateInput body = new PasswordUpdateInput(); // PasswordUpdateInput | 
try {
    BaseError result = apiInstance.postAdminUpdatePassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminUpdatePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordUpdateInput**](PasswordUpdateInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAdminVerifyKey"></a>
# **postAdminVerifyKey**
> BaseError postAdminVerifyKey(body)



verify an admin auth key

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BaseError result = apiInstance.postAdminVerifyKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAdminVerifyKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBrowseLibrary"></a>
# **postBrowseLibrary**
> CategoriesData postBrowseLibrary(body)



Browse Library

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    CategoriesData result = apiInstance.postBrowseLibrary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postBrowseLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**CategoriesData**](CategoriesData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCancelReadyToReturnBook"></a>
# **postCancelReadyToReturnBook**
> MemberData postCancelReadyToReturnBook(body)



cacnels a request for ready to return book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberActionInput body = new MemberActionInput(); // MemberActionInput | 
try {
    MemberData result = apiInstance.postCancelReadyToReturnBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postCancelReadyToReturnBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCancelReserveBook"></a>
# **postCancelReserveBook**
> MemberData postCancelReserveBook(body)



cancels a reservation

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberActionInput body = new MemberActionInput(); // MemberActionInput | 
try {
    MemberData result = apiInstance.postCancelReserveBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postCancelReserveBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreateMember"></a>
# **postCreateMember**
> MemberData postCreateMember(body)



create a new member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberDetailsInput body = new MemberDetailsInput(); // MemberDetailsInput | 
try {
    MemberData result = apiInstance.postCreateMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postCreateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberDetailsInput**](MemberDetailsInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreatePlan"></a>
# **postCreatePlan**
> MemberData postCreatePlan(body)



creates a plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postCreatePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postCreatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDeletePlan"></a>
# **postDeletePlan**
> MemberData postDeletePlan(body)



Delete Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postDeletePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postDeletePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEditMember"></a>
# **postEditMember**
> MemberData postEditMember(body)



Edit Member

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberDetailsInput body = new MemberDetailsInput(); // MemberDetailsInput | 
try {
    MemberData result = apiInstance.postEditMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postEditMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberDetailsInput**](MemberDetailsInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDeliveryCost"></a>
# **postGetDeliveryCost**
> DeliveryCostData postGetDeliveryCost(body)



Get Delivery Cost

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AddressInput body = new AddressInput(); // AddressInput | 
try {
    DeliveryCostData result = apiInstance.postGetDeliveryCost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postGetDeliveryCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressInput**](AddressInput.md)|  | [optional]

### Return type

[**DeliveryCostData**](DeliveryCostData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetHotBooks"></a>
# **postGetHotBooks**
> InlineResponse200 postGetHotBooks(body)



get hot books

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    InlineResponse200 result = apiInstance.postGetHotBooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postGetHotBooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetMember"></a>
# **postGetMember**
> MemberData postGetMember(body)



get data for home screen

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    MemberData result = apiInstance.postGetMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postGetMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetMemberDues"></a>
# **postGetMemberDues**
> BalanceDueData postGetMemberDues(body)



Get Member Dues

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BalanceDueData result = apiInstance.postGetMemberDues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postGetMemberDues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BalanceDueData**](BalanceDueData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLogin"></a>
# **postLogin**
> BaseError postLogin(body)



Login

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UserLoginBody body = new UserLoginBody(); // UserLoginBody | 
try {
    BaseError result = apiInstance.postLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserLoginBody**](UserLoginBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLogout"></a>
# **postLogout**
> BaseError postLogout(body)



Logout

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BaseError result = apiInstance.postLogout(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModifyPlan"></a>
# **postModifyPlan**
> MemberData postModifyPlan(body)



Modify Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postModifyPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postModifyPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReadyToReturnBook"></a>
# **postReadyToReturnBook**
> MemberData postReadyToReturnBook(body)



marks a book as ready to return

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberActionInput body = new MemberActionInput(); // MemberActionInput | 
try {
    MemberData result = apiInstance.postReadyToReturnBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postReadyToReturnBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReserveBook"></a>
# **postReserveBook**
> MemberData postReserveBook(body)



reserves a book

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MemberActionInput body = new MemberActionInput(); // MemberActionInput | 
try {
    MemberData result = apiInstance.postReserveBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postReserveBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MemberActionInput**](MemberActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRevivePlan"></a>
# **postRevivePlan**
> MemberData postRevivePlan(body)



Revive Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postRevivePlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postRevivePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch"></a>
# **postSearch**
> SearchData postSearch(body)



search

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
SearchBody body = new SearchBody(); // SearchBody | 
try {
    SearchData result = apiInstance.postSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchBody**](SearchBody.md)|  | [optional]

### Return type

[**SearchData**](SearchData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSuspendPlan"></a>
# **postSuspendPlan**
> MemberData postSuspendPlan(body)



Suspend Plan

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PlanActionInput body = new PlanActionInput(); // PlanActionInput | 
try {
    MemberData result = apiInstance.postSuspendPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postSuspendPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlanActionInput**](PlanActionInput.md)|  | [optional]

### Return type

[**MemberData**](MemberData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUpdatePassword"></a>
# **postUpdatePassword**
> BaseError postUpdatePassword(body)



Update Password

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PasswordUpdateInput body = new PasswordUpdateInput(); // PasswordUpdateInput | 
try {
    BaseError result = apiInstance.postUpdatePassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postUpdatePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordUpdateInput**](PasswordUpdateInput.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postVerifyKey"></a>
# **postVerifyKey**
> BaseError postVerifyKey(body)



verify an auth key

### Example
```java
// Import classes:
//import in.co.booksnmore.api.ApiException;
//import in.co.booksnmore.apiClient.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
VerifyKeyBody body = new VerifyKeyBody(); // VerifyKeyBody | 
try {
    BaseError result = apiInstance.postVerifyKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postVerifyKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyKeyBody**](VerifyKeyBody.md)|  | [optional]

### Return type

[**BaseError**](BaseError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

