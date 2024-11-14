# # PricelistGetPriceListByCodeResponse


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id**| **String** |   | [optional]
**grn**| **String** |   | [optional]
**code**| **String** |   | [optional]
**name**| **String** |   | [optional]
**description**| **String** |   | [optional]
**isActive**| **Boolean** |   | [optional]
**isDefault**| **Boolean** |   | [optional]
**currency**| [**PricelistCurrency**](PricelistCurrency.md) |  for more information please, see Model/PricelistCurrency.php  | [optional] [default to PricelistCurrency.XXX]
**vatIncluded**| **Boolean** |   | [optional]
**deliveredDutyPaid**| **Boolean** |   | [optional]
**segments**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**markets**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**channels**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**type**| [**PricelistPriceListType**](PricelistPriceListType.md) |  for more information please, see Model/PricelistPriceListType.php  | [optional] [default to PricelistPriceListType.UNKNOWN]
**isSystem**| **Boolean** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

