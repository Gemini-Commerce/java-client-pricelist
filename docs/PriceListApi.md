# PriceListApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**priceListCreatePriceList**](PriceListApi.md#priceListCreatePriceList) | **POST** /pricelist.PriceList/CreatePriceList |  |
| [**priceListDeletePriceListItems**](PriceListApi.md#priceListDeletePriceListItems) | **POST** /pricelist.PriceList/DeletePriceListItems |  |
| [**priceListGetFullPriceItemsByPricelistId**](PriceListApi.md#priceListGetFullPriceItemsByPricelistId) | **POST** /pricelist.PriceList/GetFullPriceItemsByPricelistId |  |
| [**priceListGetPriceItemsByPriceListItemIds**](PriceListApi.md#priceListGetPriceItemsByPriceListItemIds) | **POST** /pricelist.PriceList/GetPriceItemsByPriceListItemIds |  |
| [**priceListGetPriceList**](PriceListApi.md#priceListGetPriceList) | **POST** /pricelist.PriceList/GetPriceList |  |
| [**priceListGetPriceListByCode**](PriceListApi.md#priceListGetPriceListByCode) | **POST** /pricelist.PriceList/GetPriceListByCode |  |
| [**priceListGetPriceListItems**](PriceListApi.md#priceListGetPriceListItems) | **POST** /pricelist.PriceList/GetPriceListItems |  |
| [**priceListGetPricesItems**](PriceListApi.md#priceListGetPricesItems) | **POST** /pricelist.PriceList/GetPricesItems |  |
| [**priceListListFullPriceItemsByPricelistId**](PriceListApi.md#priceListListFullPriceItemsByPricelistId) | **POST** /pricelist.PriceList/ListFullPriceItemsByPricelistId |  |
| [**priceListListPriceLists**](PriceListApi.md#priceListListPriceLists) | **POST** /pricelist.PriceList/ListPriceLists |  |
| [**priceListSetPriceListItems**](PriceListApi.md#priceListSetPriceListItems) | **POST** /pricelist.PriceList/SetPriceListItems |  |
| [**priceListUpdatePriceList**](PriceListApi.md#priceListUpdatePriceList) | **POST** /pricelist.PriceList/UpdatePriceList |  |


<a id="priceListCreatePriceList"></a>
# **priceListCreatePriceList**
> PricelistCreatePriceListResponse priceListCreatePriceList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistCreatePriceListRequest body = new PricelistCreatePriceListRequest(); // PricelistCreatePriceListRequest | 
    try {
      PricelistCreatePriceListResponse result = apiInstance.priceListCreatePriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListCreatePriceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistCreatePriceListRequest**](PricelistCreatePriceListRequest.md)|  | |

### Return type

[**PricelistCreatePriceListResponse**](PricelistCreatePriceListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListDeletePriceListItems"></a>
# **priceListDeletePriceListItems**
> Object priceListDeletePriceListItems(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistDeletePriceListItemsRequest body = new PricelistDeletePriceListItemsRequest(); // PricelistDeletePriceListItemsRequest | 
    try {
      Object result = apiInstance.priceListDeletePriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListDeletePriceListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistDeletePriceListItemsRequest**](PricelistDeletePriceListItemsRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetFullPriceItemsByPricelistId"></a>
# **priceListGetFullPriceItemsByPricelistId**
> PricelistGetFullPriceItemsResponse priceListGetFullPriceItemsByPricelistId(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetFullPriceItemsRequest body = new PricelistGetFullPriceItemsRequest(); // PricelistGetFullPriceItemsRequest | 
    try {
      PricelistGetFullPriceItemsResponse result = apiInstance.priceListGetFullPriceItemsByPricelistId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetFullPriceItemsByPricelistId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetFullPriceItemsRequest**](PricelistGetFullPriceItemsRequest.md)|  | |

### Return type

[**PricelistGetFullPriceItemsResponse**](PricelistGetFullPriceItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetPriceItemsByPriceListItemIds"></a>
# **priceListGetPriceItemsByPriceListItemIds**
> PricelistGetPriceItemsByPriceListItemIdsResponse priceListGetPriceItemsByPriceListItemIds(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceItemsByPriceListItemIdsRequest body = new PricelistGetPriceItemsByPriceListItemIdsRequest(); // PricelistGetPriceItemsByPriceListItemIdsRequest | 
    try {
      PricelistGetPriceItemsByPriceListItemIdsResponse result = apiInstance.priceListGetPriceItemsByPriceListItemIds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetPriceItemsByPriceListItemIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetPriceItemsByPriceListItemIdsRequest**](PricelistGetPriceItemsByPriceListItemIdsRequest.md)|  | |

### Return type

[**PricelistGetPriceItemsByPriceListItemIdsResponse**](PricelistGetPriceItemsByPriceListItemIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetPriceList"></a>
# **priceListGetPriceList**
> PricelistGetPriceListResponse priceListGetPriceList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListRequest body = new PricelistGetPriceListRequest(); // PricelistGetPriceListRequest | 
    try {
      PricelistGetPriceListResponse result = apiInstance.priceListGetPriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetPriceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetPriceListRequest**](PricelistGetPriceListRequest.md)|  | |

### Return type

[**PricelistGetPriceListResponse**](PricelistGetPriceListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetPriceListByCode"></a>
# **priceListGetPriceListByCode**
> PricelistGetPriceListByCodeResponse priceListGetPriceListByCode(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListByCodeRequest body = new PricelistGetPriceListByCodeRequest(); // PricelistGetPriceListByCodeRequest | 
    try {
      PricelistGetPriceListByCodeResponse result = apiInstance.priceListGetPriceListByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetPriceListByCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetPriceListByCodeRequest**](PricelistGetPriceListByCodeRequest.md)|  | |

### Return type

[**PricelistGetPriceListByCodeResponse**](PricelistGetPriceListByCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetPriceListItems"></a>
# **priceListGetPriceListItems**
> PricelistGetPriceListItemsResponse priceListGetPriceListItems(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListItemsRequest body = new PricelistGetPriceListItemsRequest(); // PricelistGetPriceListItemsRequest | 
    try {
      PricelistGetPriceListItemsResponse result = apiInstance.priceListGetPriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetPriceListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetPriceListItemsRequest**](PricelistGetPriceListItemsRequest.md)|  | |

### Return type

[**PricelistGetPriceListItemsResponse**](PricelistGetPriceListItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListGetPricesItems"></a>
# **priceListGetPricesItems**
> PricelistGetPricesResponse priceListGetPricesItems(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPricesRequest body = new PricelistGetPricesRequest(); // PricelistGetPricesRequest | 
    try {
      PricelistGetPricesResponse result = apiInstance.priceListGetPricesItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListGetPricesItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistGetPricesRequest**](PricelistGetPricesRequest.md)|  | |

### Return type

[**PricelistGetPricesResponse**](PricelistGetPricesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListListFullPriceItemsByPricelistId"></a>
# **priceListListFullPriceItemsByPricelistId**
> PricelistListFullPriceItemsResponse priceListListFullPriceItemsByPricelistId(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistListFullPriceItemsRequest body = new PricelistListFullPriceItemsRequest(); // PricelistListFullPriceItemsRequest | 
    try {
      PricelistListFullPriceItemsResponse result = apiInstance.priceListListFullPriceItemsByPricelistId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListListFullPriceItemsByPricelistId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistListFullPriceItemsRequest**](PricelistListFullPriceItemsRequest.md)|  | |

### Return type

[**PricelistListFullPriceItemsResponse**](PricelistListFullPriceItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListListPriceLists"></a>
# **priceListListPriceLists**
> PricelistListPriceListsResponse priceListListPriceLists(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistListPriceListsRequest body = new PricelistListPriceListsRequest(); // PricelistListPriceListsRequest | 
    try {
      PricelistListPriceListsResponse result = apiInstance.priceListListPriceLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListListPriceLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistListPriceListsRequest**](PricelistListPriceListsRequest.md)|  | |

### Return type

[**PricelistListPriceListsResponse**](PricelistListPriceListsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListSetPriceListItems"></a>
# **priceListSetPriceListItems**
> PricelistSetPriceListItemsResponse priceListSetPriceListItems(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistSetPriceListItemsRequest body = new PricelistSetPriceListItemsRequest(); // PricelistSetPriceListItemsRequest | 
    try {
      PricelistSetPriceListItemsResponse result = apiInstance.priceListSetPriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListSetPriceListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistSetPriceListItemsRequest**](PricelistSetPriceListItemsRequest.md)|  | |

### Return type

[**PricelistSetPriceListItemsResponse**](PricelistSetPriceListItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="priceListUpdatePriceList"></a>
# **priceListUpdatePriceList**
> Object priceListUpdatePriceList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistUpdatePriceListRequest body = new PricelistUpdatePriceListRequest(); // PricelistUpdatePriceListRequest | 
    try {
      Object result = apiInstance.priceListUpdatePriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#priceListUpdatePriceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**PricelistUpdatePriceListRequest**](PricelistUpdatePriceListRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

