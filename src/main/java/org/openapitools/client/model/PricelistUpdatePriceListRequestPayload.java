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
import org.openapitools.client.model.PricelistCurrency;
import org.openapitools.client.model.PricelistPriceListType;

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
 * PricelistUpdatePriceListRequestPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:16:38.230943551Z[Etc/UTC]")
public class PricelistUpdatePriceListRequestPayload {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private PricelistCurrency currency = PricelistCurrency.XXX;

  public static final String SERIALIZED_NAME_VAT_INCLUDED = "vatIncluded";
  @SerializedName(SERIALIZED_NAME_VAT_INCLUDED)
  private Boolean vatIncluded;

  public static final String SERIALIZED_NAME_DELIVERED_DUTY_PAID = "deliveredDutyPaid";
  @SerializedName(SERIALIZED_NAME_DELIVERED_DUTY_PAID)
  private Boolean deliveredDutyPaid;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private List<String> segments;

  public static final String SERIALIZED_NAME_MARKETS = "markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<String> markets;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<String> channels;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PricelistPriceListType type = PricelistPriceListType.UNKNOWN;

  public static final String SERIALIZED_NAME_IS_SYSTEM = "isSystem";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM)
  private Boolean isSystem;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public PricelistUpdatePriceListRequestPayload() {
  }

  public PricelistUpdatePriceListRequestPayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PricelistUpdatePriceListRequestPayload isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public PricelistUpdatePriceListRequestPayload currency(PricelistCurrency currency) {
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


  public PricelistUpdatePriceListRequestPayload vatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
    return this;
  }

   /**
   * Get vatIncluded
   * @return vatIncluded
  **/
  @javax.annotation.Nullable
  public Boolean getVatIncluded() {
    return vatIncluded;
  }

  public void setVatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
  }


  public PricelistUpdatePriceListRequestPayload deliveredDutyPaid(Boolean deliveredDutyPaid) {
    this.deliveredDutyPaid = deliveredDutyPaid;
    return this;
  }

   /**
   * Get deliveredDutyPaid
   * @return deliveredDutyPaid
  **/
  @javax.annotation.Nullable
  public Boolean getDeliveredDutyPaid() {
    return deliveredDutyPaid;
  }

  public void setDeliveredDutyPaid(Boolean deliveredDutyPaid) {
    this.deliveredDutyPaid = deliveredDutyPaid;
  }


  public PricelistUpdatePriceListRequestPayload segments(List<String> segments) {
    this.segments = segments;
    return this;
  }

  public PricelistUpdatePriceListRequestPayload addSegmentsItem(String segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @javax.annotation.Nullable
  public List<String> getSegments() {
    return segments;
  }

  public void setSegments(List<String> segments) {
    this.segments = segments;
  }


  public PricelistUpdatePriceListRequestPayload markets(List<String> markets) {
    this.markets = markets;
    return this;
  }

  public PricelistUpdatePriceListRequestPayload addMarketsItem(String marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nullable
  public List<String> getMarkets() {
    return markets;
  }

  public void setMarkets(List<String> markets) {
    this.markets = markets;
  }


  public PricelistUpdatePriceListRequestPayload channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public PricelistUpdatePriceListRequestPayload addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  public PricelistUpdatePriceListRequestPayload type(PricelistPriceListType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public PricelistPriceListType getType() {
    return type;
  }

  public void setType(PricelistPriceListType type) {
    this.type = type;
  }


  public PricelistUpdatePriceListRequestPayload isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
  }

   /**
   * Get isSystem
   * @return isSystem
  **/
  @javax.annotation.Nullable
  public Boolean getIsSystem() {
    return isSystem;
  }

  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }


  public PricelistUpdatePriceListRequestPayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PricelistUpdatePriceListRequestPayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricelistUpdatePriceListRequestPayload pricelistUpdatePriceListRequestPayload = (PricelistUpdatePriceListRequestPayload) o;
    return Objects.equals(this.isActive, pricelistUpdatePriceListRequestPayload.isActive) &&
        Objects.equals(this.isDefault, pricelistUpdatePriceListRequestPayload.isDefault) &&
        Objects.equals(this.currency, pricelistUpdatePriceListRequestPayload.currency) &&
        Objects.equals(this.vatIncluded, pricelistUpdatePriceListRequestPayload.vatIncluded) &&
        Objects.equals(this.deliveredDutyPaid, pricelistUpdatePriceListRequestPayload.deliveredDutyPaid) &&
        Objects.equals(this.segments, pricelistUpdatePriceListRequestPayload.segments) &&
        Objects.equals(this.markets, pricelistUpdatePriceListRequestPayload.markets) &&
        Objects.equals(this.channels, pricelistUpdatePriceListRequestPayload.channels) &&
        Objects.equals(this.type, pricelistUpdatePriceListRequestPayload.type) &&
        Objects.equals(this.isSystem, pricelistUpdatePriceListRequestPayload.isSystem) &&
        Objects.equals(this.name, pricelistUpdatePriceListRequestPayload.name) &&
        Objects.equals(this.description, pricelistUpdatePriceListRequestPayload.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, isDefault, currency, vatIncluded, deliveredDutyPaid, segments, markets, channels, type, isSystem, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricelistUpdatePriceListRequestPayload {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vatIncluded: ").append(toIndentedString(vatIncluded)).append("\n");
    sb.append("    deliveredDutyPaid: ").append(toIndentedString(deliveredDutyPaid)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("isActive");
    openapiFields.add("isDefault");
    openapiFields.add("currency");
    openapiFields.add("vatIncluded");
    openapiFields.add("deliveredDutyPaid");
    openapiFields.add("segments");
    openapiFields.add("markets");
    openapiFields.add("channels");
    openapiFields.add("type");
    openapiFields.add("isSystem");
    openapiFields.add("name");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PricelistUpdatePriceListRequestPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricelistUpdatePriceListRequestPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricelistUpdatePriceListRequestPayload is not found in the empty JSON string", PricelistUpdatePriceListRequestPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricelistUpdatePriceListRequestPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricelistUpdatePriceListRequestPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        PricelistCurrency.validateJsonElement(jsonObj.get("currency"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("segments") != null && !jsonObj.get("segments").isJsonNull() && !jsonObj.get("segments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `segments` to be an array in the JSON string but got `%s`", jsonObj.get("segments").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("markets") != null && !jsonObj.get("markets").isJsonNull() && !jsonObj.get("markets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `markets` to be an array in the JSON string but got `%s`", jsonObj.get("markets").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonNull() && !jsonObj.get("channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        PricelistPriceListType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricelistUpdatePriceListRequestPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricelistUpdatePriceListRequestPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricelistUpdatePriceListRequestPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricelistUpdatePriceListRequestPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<PricelistUpdatePriceListRequestPayload>() {
           @Override
           public void write(JsonWriter out, PricelistUpdatePriceListRequestPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricelistUpdatePriceListRequestPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricelistUpdatePriceListRequestPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricelistUpdatePriceListRequestPayload
  * @throws IOException if the JSON string is invalid with respect to PricelistUpdatePriceListRequestPayload
  */
  public static PricelistUpdatePriceListRequestPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricelistUpdatePriceListRequestPayload.class);
  }

 /**
  * Convert an instance of PricelistUpdatePriceListRequestPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
