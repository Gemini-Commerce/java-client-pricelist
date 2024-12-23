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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Pricelist.JSON;

/**
 * PricelistGetPriceListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T17:03:48.620595403Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PricelistGetPriceListResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

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
  private List<String> segments = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKETS = "markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<String> markets = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<String> channels = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PricelistPriceListType type = PricelistPriceListType.UNKNOWN;

  public static final String SERIALIZED_NAME_IS_SYSTEM = "isSystem";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM)
  private Boolean isSystem;

  public PricelistGetPriceListResponse() {
  }

  public PricelistGetPriceListResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public PricelistGetPriceListResponse grn(String grn) {
    this.grn = grn;
    return this;
  }

  /**
   * Get grn
   * @return grn
   */
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public PricelistGetPriceListResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public PricelistGetPriceListResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PricelistGetPriceListResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PricelistGetPriceListResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PricelistGetPriceListResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public PricelistGetPriceListResponse currency(PricelistCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public PricelistCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(PricelistCurrency currency) {
    this.currency = currency;
  }


  public PricelistGetPriceListResponse vatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
    return this;
  }

  /**
   * Get vatIncluded
   * @return vatIncluded
   */
  @javax.annotation.Nullable
  public Boolean getVatIncluded() {
    return vatIncluded;
  }

  public void setVatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
  }


  public PricelistGetPriceListResponse deliveredDutyPaid(Boolean deliveredDutyPaid) {
    this.deliveredDutyPaid = deliveredDutyPaid;
    return this;
  }

  /**
   * Get deliveredDutyPaid
   * @return deliveredDutyPaid
   */
  @javax.annotation.Nullable
  public Boolean getDeliveredDutyPaid() {
    return deliveredDutyPaid;
  }

  public void setDeliveredDutyPaid(Boolean deliveredDutyPaid) {
    this.deliveredDutyPaid = deliveredDutyPaid;
  }


  public PricelistGetPriceListResponse segments(List<String> segments) {
    this.segments = segments;
    return this;
  }

  public PricelistGetPriceListResponse addSegmentsItem(String segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Get segments
   * @return segments
   */
  @javax.annotation.Nullable
  public List<String> getSegments() {
    return segments;
  }

  public void setSegments(List<String> segments) {
    this.segments = segments;
  }


  public PricelistGetPriceListResponse markets(List<String> markets) {
    this.markets = markets;
    return this;
  }

  public PricelistGetPriceListResponse addMarketsItem(String marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

  /**
   * Get markets
   * @return markets
   */
  @javax.annotation.Nullable
  public List<String> getMarkets() {
    return markets;
  }

  public void setMarkets(List<String> markets) {
    this.markets = markets;
  }


  public PricelistGetPriceListResponse channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public PricelistGetPriceListResponse addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * Get channels
   * @return channels
   */
  @javax.annotation.Nullable
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  public PricelistGetPriceListResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PricelistGetPriceListResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PricelistGetPriceListResponse type(PricelistPriceListType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public PricelistPriceListType getType() {
    return type;
  }

  public void setType(PricelistPriceListType type) {
    this.type = type;
  }


  public PricelistGetPriceListResponse isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
  }

  /**
   * Get isSystem
   * @return isSystem
   */
  @javax.annotation.Nullable
  public Boolean getIsSystem() {
    return isSystem;
  }

  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PricelistGetPriceListResponse instance itself
   */
  public PricelistGetPriceListResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricelistGetPriceListResponse pricelistGetPriceListResponse = (PricelistGetPriceListResponse) o;
    return Objects.equals(this.id, pricelistGetPriceListResponse.id) &&
        Objects.equals(this.grn, pricelistGetPriceListResponse.grn) &&
        Objects.equals(this.code, pricelistGetPriceListResponse.code) &&
        Objects.equals(this.name, pricelistGetPriceListResponse.name) &&
        Objects.equals(this.description, pricelistGetPriceListResponse.description) &&
        Objects.equals(this.isActive, pricelistGetPriceListResponse.isActive) &&
        Objects.equals(this.isDefault, pricelistGetPriceListResponse.isDefault) &&
        Objects.equals(this.currency, pricelistGetPriceListResponse.currency) &&
        Objects.equals(this.vatIncluded, pricelistGetPriceListResponse.vatIncluded) &&
        Objects.equals(this.deliveredDutyPaid, pricelistGetPriceListResponse.deliveredDutyPaid) &&
        Objects.equals(this.segments, pricelistGetPriceListResponse.segments) &&
        Objects.equals(this.markets, pricelistGetPriceListResponse.markets) &&
        Objects.equals(this.channels, pricelistGetPriceListResponse.channels) &&
        Objects.equals(this.createdAt, pricelistGetPriceListResponse.createdAt) &&
        Objects.equals(this.updatedAt, pricelistGetPriceListResponse.updatedAt) &&
        Objects.equals(this.type, pricelistGetPriceListResponse.type) &&
        Objects.equals(this.isSystem, pricelistGetPriceListResponse.isSystem)&&
        Objects.equals(this.additionalProperties, pricelistGetPriceListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, code, name, description, isActive, isDefault, currency, vatIncluded, deliveredDutyPaid, segments, markets, channels, createdAt, updatedAt, type, isSystem, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricelistGetPriceListResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vatIncluded: ").append(toIndentedString(vatIncluded)).append("\n");
    sb.append("    deliveredDutyPaid: ").append(toIndentedString(deliveredDutyPaid)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("isActive");
    openapiFields.add("isDefault");
    openapiFields.add("currency");
    openapiFields.add("vatIncluded");
    openapiFields.add("deliveredDutyPaid");
    openapiFields.add("segments");
    openapiFields.add("markets");
    openapiFields.add("channels");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("type");
    openapiFields.add("isSystem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PricelistGetPriceListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricelistGetPriceListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricelistGetPriceListResponse is not found in the empty JSON string", PricelistGetPriceListResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricelistGetPriceListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricelistGetPriceListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricelistGetPriceListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricelistGetPriceListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PricelistGetPriceListResponse>() {
           @Override
           public void write(JsonWriter out, PricelistGetPriceListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PricelistGetPriceListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PricelistGetPriceListResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PricelistGetPriceListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PricelistGetPriceListResponse
   * @throws IOException if the JSON string is invalid with respect to PricelistGetPriceListResponse
   */
  public static PricelistGetPriceListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricelistGetPriceListResponse.class);
  }

  /**
   * Convert an instance of PricelistGetPriceListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

