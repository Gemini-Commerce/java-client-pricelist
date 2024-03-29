/*
 * PriceList Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PricelistCurrency;
import org.openapitools.client.model.PricelistGetFullPriceItemPrice;
import org.openapitools.client.model.PricelistMoney;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Pricelist.JSON;

/**
 * PricelistGetFullPriceItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T16:31:03.730775696Z[Etc/UTC]")
public class PricelistGetFullPriceItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_ITEM_GRN = "itemGrn";
  @SerializedName(SERIALIZED_NAME_ITEM_GRN)
  private String itemGrn;

  public static final String SERIALIZED_NAME_BASE_PRICE = "basePrice";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private PricelistMoney basePrice;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private PricelistCurrency currency = PricelistCurrency.XXX;

  public static final String SERIALIZED_NAME_PRICES = "prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  private List<PricelistGetFullPriceItemPrice> prices;

  public static final String SERIALIZED_NAME_HAS_TIER_PRICES = "hasTierPrices";
  @SerializedName(SERIALIZED_NAME_HAS_TIER_PRICES)
  private Boolean hasTierPrices;

  public PricelistGetFullPriceItem() {
  }

  public PricelistGetFullPriceItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public PricelistGetFullPriceItem grn(String grn) {
    this.grn = grn;
    return this;
  }

   /**
   * Get grn
   * @return grn
  **/
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public PricelistGetFullPriceItem itemGrn(String itemGrn) {
    this.itemGrn = itemGrn;
    return this;
  }

   /**
   * Get itemGrn
   * @return itemGrn
  **/
  @javax.annotation.Nullable
  public String getItemGrn() {
    return itemGrn;
  }

  public void setItemGrn(String itemGrn) {
    this.itemGrn = itemGrn;
  }


  public PricelistGetFullPriceItem basePrice(PricelistMoney basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @javax.annotation.Nullable
  public PricelistMoney getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(PricelistMoney basePrice) {
    this.basePrice = basePrice;
  }


  public PricelistGetFullPriceItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PricelistGetFullPriceItem updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PricelistGetFullPriceItem currency(PricelistCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public PricelistCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(PricelistCurrency currency) {
    this.currency = currency;
  }


  public PricelistGetFullPriceItem prices(List<PricelistGetFullPriceItemPrice> prices) {
    this.prices = prices;
    return this;
  }

  public PricelistGetFullPriceItem addPricesItem(PricelistGetFullPriceItemPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @javax.annotation.Nullable
  public List<PricelistGetFullPriceItemPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<PricelistGetFullPriceItemPrice> prices) {
    this.prices = prices;
  }


  public PricelistGetFullPriceItem hasTierPrices(Boolean hasTierPrices) {
    this.hasTierPrices = hasTierPrices;
    return this;
  }

   /**
   * Get hasTierPrices
   * @return hasTierPrices
  **/
  @javax.annotation.Nullable
  public Boolean getHasTierPrices() {
    return hasTierPrices;
  }

  public void setHasTierPrices(Boolean hasTierPrices) {
    this.hasTierPrices = hasTierPrices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricelistGetFullPriceItem pricelistGetFullPriceItem = (PricelistGetFullPriceItem) o;
    return Objects.equals(this.id, pricelistGetFullPriceItem.id) &&
        Objects.equals(this.grn, pricelistGetFullPriceItem.grn) &&
        Objects.equals(this.itemGrn, pricelistGetFullPriceItem.itemGrn) &&
        Objects.equals(this.basePrice, pricelistGetFullPriceItem.basePrice) &&
        Objects.equals(this.createdAt, pricelistGetFullPriceItem.createdAt) &&
        Objects.equals(this.updatedAt, pricelistGetFullPriceItem.updatedAt) &&
        Objects.equals(this.currency, pricelistGetFullPriceItem.currency) &&
        Objects.equals(this.prices, pricelistGetFullPriceItem.prices) &&
        Objects.equals(this.hasTierPrices, pricelistGetFullPriceItem.hasTierPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, itemGrn, basePrice, createdAt, updatedAt, currency, prices, hasTierPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricelistGetFullPriceItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    itemGrn: ").append(toIndentedString(itemGrn)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    hasTierPrices: ").append(toIndentedString(hasTierPrices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("grn");
    openapiFields.add("itemGrn");
    openapiFields.add("basePrice");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("currency");
    openapiFields.add("prices");
    openapiFields.add("hasTierPrices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PricelistGetFullPriceItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricelistGetFullPriceItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricelistGetFullPriceItem is not found in the empty JSON string", PricelistGetFullPriceItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricelistGetFullPriceItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricelistGetFullPriceItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("itemGrn") != null && !jsonObj.get("itemGrn").isJsonNull()) && !jsonObj.get("itemGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemGrn").toString()));
      }
      // validate the optional field `basePrice`
      if (jsonObj.get("basePrice") != null && !jsonObj.get("basePrice").isJsonNull()) {
        PricelistMoney.validateJsonElement(jsonObj.get("basePrice"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        PricelistCurrency.validateJsonElement(jsonObj.get("currency"));
      }
      if (jsonObj.get("prices") != null && !jsonObj.get("prices").isJsonNull()) {
        JsonArray jsonArrayprices = jsonObj.getAsJsonArray("prices");
        if (jsonArrayprices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("prices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `prices` to be an array in the JSON string but got `%s`", jsonObj.get("prices").toString()));
          }

          // validate the optional field `prices` (array)
          for (int i = 0; i < jsonArrayprices.size(); i++) {
            PricelistGetFullPriceItemPrice.validateJsonElement(jsonArrayprices.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricelistGetFullPriceItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricelistGetFullPriceItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricelistGetFullPriceItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricelistGetFullPriceItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PricelistGetFullPriceItem>() {
           @Override
           public void write(JsonWriter out, PricelistGetFullPriceItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricelistGetFullPriceItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricelistGetFullPriceItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricelistGetFullPriceItem
  * @throws IOException if the JSON string is invalid with respect to PricelistGetFullPriceItem
  */
  public static PricelistGetFullPriceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricelistGetFullPriceItem.class);
  }

 /**
  * Convert an instance of PricelistGetFullPriceItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

