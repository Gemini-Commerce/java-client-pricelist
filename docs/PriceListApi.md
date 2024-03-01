# PriceListApi

All URIs are relative to *https://pricelist.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPriceList**](PriceListApi.md#createPriceList) | **POST** /pricelist.PriceList/CreatePriceList | Create new list |
| [**deletePriceListItems**](PriceListApi.md#deletePriceListItems) | **POST** /pricelist.PriceList/DeletePriceListItems | Get prices for items |
| [**getFullPriceItemsByPricelistId**](PriceListApi.md#getFullPriceItemsByPricelistId) | **POST** /pricelist.PriceList/GetFullPriceItemsByPricelistId | List detailed items |
| [**getPriceList**](PriceListApi.md#getPriceList) | **POST** /pricelist.PriceList/GetPriceList | Get specific list |
| [**getPriceListByCode**](PriceListApi.md#getPriceListByCode) | **POST** /pricelist.PriceList/GetPriceListByCode | Get list by code |
| [**getPriceListItems**](PriceListApi.md#getPriceListItems) | **POST** /pricelist.PriceList/GetPriceListItems | Get items in list |
| [**getPricesItems**](PriceListApi.md#getPricesItems) | **POST** /pricelist.PriceList/GetPricesItems | Get detailed items |
| [**listFullPriceItemsByPricelistId**](PriceListApi.md#listFullPriceItemsByPricelistId) | **POST** /pricelist.PriceList/ListFullPriceItemsByPricelistId | List detailed price items for a specific price list |
| [**listPriceLists**](PriceListApi.md#listPriceLists) | **POST** /pricelist.PriceList/ListPriceLists | List all price lists |
| [**priceListGetPriceItemsByPriceListItemIds**](PriceListApi.md#priceListGetPriceItemsByPriceListItemIds) | **POST** /pricelist.PriceList/GetPriceItemsByPriceListItemIds |  |
| [**setPriceListItems**](PriceListApi.md#setPriceListItems) | **POST** /pricelist.PriceList/SetPriceListItems | Set items in list |
| [**updatePriceList**](PriceListApi.md#updatePriceList) | **POST** /pricelist.PriceList/UpdatePriceList | Update list |


<a id="createPriceList"></a>
# **createPriceList**
> PricelistCreatePriceListResponse createPriceList(body)

Create new list

Allows the creation of a new price list with specified details such as code, name, currency, and type.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistCreatePriceListRequest body = new PricelistCreatePriceListRequest(); // PricelistCreatePriceListRequest | 
    try {
      PricelistCreatePriceListResponse result = apiInstance.createPriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#createPriceList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="deletePriceListItems"></a>
# **deletePriceListItems**
> Object deletePriceListItems(body)

Get prices for items

Deletes specified items from a price list based on their unique identifiers.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistDeletePriceListItemsRequest body = new PricelistDeletePriceListItemsRequest(); // PricelistDeletePriceListItemsRequest | 
    try {
      Object result = apiInstance.deletePriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#deletePriceListItems");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getFullPriceItemsByPricelistId"></a>
# **getFullPriceItemsByPricelistId**
> PricelistGetFullPriceItemsResponse getFullPriceItemsByPricelistId(body)

List detailed items

Fetches detailed information about items, including historical price data, for a specific price list.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetFullPriceItemsRequest body = new PricelistGetFullPriceItemsRequest(); // PricelistGetFullPriceItemsRequest | 
    try {
      PricelistGetFullPriceItemsResponse result = apiInstance.getFullPriceItemsByPricelistId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#getFullPriceItemsByPricelistId");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPriceList"></a>
# **getPriceList**
> PricelistGetPriceListResponse getPriceList(body)

Get specific list

Returns information about a particular price list identified by tenant ID and price list ID. The response includes details such as code, name, currency, and type.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListRequest body = new PricelistGetPriceListRequest(); // PricelistGetPriceListRequest | 
    try {
      PricelistGetPriceListResponse result = apiInstance.getPriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#getPriceList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPriceListByCode"></a>
# **getPriceListByCode**
> PricelistGetPriceListByCodeResponse getPriceListByCode(body)

Get list by code

Retrieves information about a specific price list using the unique code associated with it. The response includes details such as code, name, currency, and type.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListByCodeRequest body = new PricelistGetPriceListByCodeRequest(); // PricelistGetPriceListByCodeRequest | 
    try {
      PricelistGetPriceListByCodeResponse result = apiInstance.getPriceListByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#getPriceListByCode");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPriceListItems"></a>
# **getPriceListItems**
> PricelistGetPriceListItemsResponse getPriceListItems(body)

Get items in list

Fetches a paginated list of items associated with a particular price list.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPriceListItemsRequest body = new PricelistGetPriceListItemsRequest(); // PricelistGetPriceListItemsRequest | 
    try {
      PricelistGetPriceListItemsResponse result = apiInstance.getPriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#getPriceListItems");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPricesItems"></a>
# **getPricesItems**
> PricelistGetPricesResponse getPricesItems(body)

Get detailed items

Retrieves the current prices of specified items considering the provided context, such as currency and market.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistGetPricesRequest body = new PricelistGetPricesRequest(); // PricelistGetPricesRequest | 
    try {
      PricelistGetPricesResponse result = apiInstance.getPricesItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#getPricesItems");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listFullPriceItemsByPricelistId"></a>
# **listFullPriceItemsByPricelistId**
> PricelistListFullPriceItemsResponse listFullPriceItemsByPricelistId(body)

List detailed price items for a specific price list

Retrieves a paginated list of detailed price items, including historical data, for a specific price list.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistListFullPriceItemsRequest body = new PricelistListFullPriceItemsRequest(); // PricelistListFullPriceItemsRequest | 
    try {
      PricelistListFullPriceItemsResponse result = apiInstance.listFullPriceItemsByPricelistId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#listFullPriceItemsByPricelistId");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listPriceLists"></a>
# **listPriceLists**
> PricelistListPriceListsResponse listPriceLists(body)

List all price lists

Retrieves a list of price lists based on optional filters such as name, code, and other attributes. The response includes details such as code, name, currency, and type.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistListPriceListsRequest body = new PricelistListPriceListsRequest(); // PricelistListPriceListsRequest | 
    try {
      PricelistListPriceListsResponse result = apiInstance.listPriceLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#listPriceLists");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
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
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="setPriceListItems"></a>
# **setPriceListItems**
> PricelistSetPriceListItemsResponse setPriceListItems(body)

Set items in list

Updates or creates items for a given price list, allowing bulk modifications.

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistSetPriceListItemsRequest body = new PricelistSetPriceListItemsRequest(); // PricelistSetPriceListItemsRequest | 
    try {
      PricelistSetPriceListItemsResponse result = apiInstance.setPriceListItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#setPriceListItems");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updatePriceList"></a>
# **updatePriceList**
> Object updatePriceList(body)

Update list

Modifies the attributes of an existing price list based on the provided payload and field mask. The field mask is used to specify which attributes of the price list are to be updated. The field mask is a comma-separated list of fully qualified names of fields. Example: &#x60;code,name,currency,type&#x60;

### Example
```java
// Import classes:
import GeminiCommerce_Pricelist.ApiClient;
import GeminiCommerce_Pricelist.ApiException;
import GeminiCommerce_Pricelist.Configuration;
import GeminiCommerce_Pricelist.auth.*;
import GeminiCommerce_Pricelist.models.*;
import org.openapitools.client.api.PriceListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pricelist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PriceListApi apiInstance = new PriceListApi(defaultClient);
    PricelistUpdatePriceListRequest body = new PricelistUpdatePriceListRequest(); // PricelistUpdatePriceListRequest | 
    try {
      Object result = apiInstance.updatePriceList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListApi#updatePriceList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

