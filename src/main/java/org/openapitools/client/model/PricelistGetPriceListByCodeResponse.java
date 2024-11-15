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
 * PricelistGetPriceListByCodeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T16:07:56.394094327Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PricelistGetPriceListByCodeResponse {
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

  public PricelistGetPriceListByCodeResponse() {
  }

  public PricelistGetPriceListByCodeResponse id(String id) {
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


  public PricelistGetPriceListByCodeResponse grn(String grn) {
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


  public PricelistGetPriceListByCodeResponse code(String code) {
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


  public PricelistGetPriceListByCodeResponse name(String name) {
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


  public PricelistGetPriceListByCodeResponse description(String description) {
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


  public PricelistGetPriceListByCodeResponse isActive(Boolean isActive) {
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


  public PricelistGetPriceListByCodeResponse isDefault(Boolean isDefault) {
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


  public PricelistGetPriceListByCodeResponse currency(PricelistCurrency currency) {
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


  public PricelistGetPriceListByCodeResponse vatIncluded(Boolean vatIncluded) {
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


  public PricelistGetPriceListByCodeResponse deliveredDutyPaid(Boolean deliveredDutyPaid) {
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


  public PricelistGetPriceListByCodeResponse segments(List<String> segments) {
    this.segments = segments;
    return this;
  }

  public PricelistGetPriceListByCodeResponse addSegmentsItem(String segmentsItem) {
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


  public PricelistGetPriceListByCodeResponse markets(List<String> markets) {
    this.markets = markets;
    return this;
  }

  public PricelistGetPriceListByCodeResponse addMarketsItem(String marketsItem) {
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


  public PricelistGetPriceListByCodeResponse channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public PricelistGetPriceListByCodeResponse addChannelsItem(String channelsItem) {
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


  public PricelistGetPriceListByCodeResponse createdAt(OffsetDateTime createdAt) {
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


  public PricelistGetPriceListByCodeResponse updatedAt(OffsetDateTime updatedAt) {
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


  public PricelistGetPriceListByCodeResponse type(PricelistPriceListType type) {
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


  public PricelistGetPriceListByCodeResponse isSystem(Boolean isSystem) {
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
   * @return the PricelistGetPriceListByCodeResponse instance itself
   */
  public PricelistGetPriceListByCodeResponse putAdditionalProperty(String key, Object value) {
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
    PricelistGetPriceListByCodeResponse pricelistGetPriceListByCodeResponse = (PricelistGetPriceListByCodeResponse) o;
    return Objects.equals(this.id, pricelistGetPriceListByCodeResponse.id) &&
        Objects.equals(this.grn, pricelistGetPriceListByCodeResponse.grn) &&
        Objects.equals(this.code, pricelistGetPriceListByCodeResponse.code) &&
        Objects.equals(this.name, pricelistGetPriceListByCodeResponse.name) &&
        Objects.equals(this.description, pricelistGetPriceListByCodeResponse.description) &&
        Objects.equals(this.isActive, pricelistGetPriceListByCodeResponse.isActive) &&
        Objects.equals(this.isDefault, pricelistGetPriceListByCodeResponse.isDefault) &&
        Objects.equals(this.currency, pricelistGetPriceListByCodeResponse.currency) &&
        Objects.equals(this.vatIncluded, pricelistGetPriceListByCodeResponse.vatIncluded) &&
        Objects.equals(this.deliveredDutyPaid, pricelistGetPriceListByCodeResponse.deliveredDutyPaid) &&
        Objects.equals(this.segments, pricelistGetPriceListByCodeResponse.segments) &&
        Objects.equals(this.markets, pricelistGetPriceListByCodeResponse.markets) &&
        Objects.equals(this.channels, pricelistGetPriceListByCodeResponse.channels) &&
        Objects.equals(this.createdAt, pricelistGetPriceListByCodeResponse.createdAt) &&
        Objects.equals(this.updatedAt, pricelistGetPriceListByCodeResponse.updatedAt) &&
        Objects.equals(this.type, pricelistGetPriceListByCodeResponse.type) &&
        Objects.equals(this.isSystem, pricelistGetPriceListByCodeResponse.isSystem)&&
        Objects.equals(this.additionalProperties, pricelistGetPriceListByCodeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, code, name, description, isActive, isDefault, currency, vatIncluded, deliveredDutyPaid, segments, markets, channels, createdAt, updatedAt, type, isSystem, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricelistGetPriceListByCodeResponse {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to PricelistGetPriceListByCodeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricelistGetPriceListByCodeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricelistGetPriceListByCodeResponse is not found in the empty JSON string", PricelistGetPriceListByCodeResponse.openapiRequiredFields.toString()));
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
       if (!PricelistGetPriceListByCodeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricelistGetPriceListByCodeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricelistGetPriceListByCodeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricelistGetPriceListByCodeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PricelistGetPriceListByCodeResponse>() {
           @Override
           public void write(JsonWriter out, PricelistGetPriceListByCodeResponse value) throws IOException {
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
           public PricelistGetPriceListByCodeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PricelistGetPriceListByCodeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of PricelistGetPriceListByCodeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PricelistGetPriceListByCodeResponse
   * @throws IOException if the JSON string is invalid with respect to PricelistGetPriceListByCodeResponse
   */
  public static PricelistGetPriceListByCodeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricelistGetPriceListByCodeResponse.class);
  }

  /**
   * Convert an instance of PricelistGetPriceListByCodeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

