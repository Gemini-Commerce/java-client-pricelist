/*
 * pricelist/service.proto
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: version not set
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PricelistGetFullPriceItem;

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
 * PricelistGetFullPriceItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:16:38.230943551Z[Etc/UTC]")
public class PricelistGetFullPriceItemsResponse {
  public static final String SERIALIZED_NAME_PRICE_ITEMS = "priceItems";
  @SerializedName(SERIALIZED_NAME_PRICE_ITEMS)
  private List<PricelistGetFullPriceItem> priceItems;

  public PricelistGetFullPriceItemsResponse() {
  }

  public PricelistGetFullPriceItemsResponse priceItems(List<PricelistGetFullPriceItem> priceItems) {
    this.priceItems = priceItems;
    return this;
  }

  public PricelistGetFullPriceItemsResponse addPriceItemsItem(PricelistGetFullPriceItem priceItemsItem) {
    if (this.priceItems == null) {
      this.priceItems = new ArrayList<>();
    }
    this.priceItems.add(priceItemsItem);
    return this;
  }

   /**
   * Get priceItems
   * @return priceItems
  **/
  @javax.annotation.Nullable
  public List<PricelistGetFullPriceItem> getPriceItems() {
    return priceItems;
  }

  public void setPriceItems(List<PricelistGetFullPriceItem> priceItems) {
    this.priceItems = priceItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricelistGetFullPriceItemsResponse pricelistGetFullPriceItemsResponse = (PricelistGetFullPriceItemsResponse) o;
    return Objects.equals(this.priceItems, pricelistGetFullPriceItemsResponse.priceItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricelistGetFullPriceItemsResponse {\n");
    sb.append("    priceItems: ").append(toIndentedString(priceItems)).append("\n");
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
    openapiFields.add("priceItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PricelistGetFullPriceItemsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricelistGetFullPriceItemsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricelistGetFullPriceItemsResponse is not found in the empty JSON string", PricelistGetFullPriceItemsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricelistGetFullPriceItemsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricelistGetFullPriceItemsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("priceItems") != null && !jsonObj.get("priceItems").isJsonNull()) {
        JsonArray jsonArraypriceItems = jsonObj.getAsJsonArray("priceItems");
        if (jsonArraypriceItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priceItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priceItems` to be an array in the JSON string but got `%s`", jsonObj.get("priceItems").toString()));
          }

          // validate the optional field `priceItems` (array)
          for (int i = 0; i < jsonArraypriceItems.size(); i++) {
            PricelistGetFullPriceItem.validateJsonElement(jsonArraypriceItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricelistGetFullPriceItemsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricelistGetFullPriceItemsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricelistGetFullPriceItemsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricelistGetFullPriceItemsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PricelistGetFullPriceItemsResponse>() {
           @Override
           public void write(JsonWriter out, PricelistGetFullPriceItemsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricelistGetFullPriceItemsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricelistGetFullPriceItemsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricelistGetFullPriceItemsResponse
  * @throws IOException if the JSON string is invalid with respect to PricelistGetFullPriceItemsResponse
  */
  public static PricelistGetFullPriceItemsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricelistGetFullPriceItemsResponse.class);
  }

 /**
  * Convert an instance of PricelistGetFullPriceItemsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

