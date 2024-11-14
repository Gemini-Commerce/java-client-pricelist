# # PricelistGetFullPriceItem


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id**| **String** |   | [optional]
**grn**| **String** |   | [optional]
**itemGrn**| **String** |   | [optional]
**basePrice**| [**PricelistMoney**](PricelistMoney.md) |   | [optional]
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**currency**| [**PricelistCurrency**](PricelistCurrency.md) |  for more information please, see Model/PricelistCurrency.php  | [optional] [default to PricelistCurrency.XXX]
**prices**| [**List<PricelistGetFullPriceItemPrice>**](PricelistGetFullPriceItemPrice.md) |   | [optional] [default to new ArrayList<>()]
**hasTierPrices**| **Boolean** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

