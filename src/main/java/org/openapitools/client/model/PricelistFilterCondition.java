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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets pricelistFilterCondition
 */
@JsonAdapter(PricelistFilterCondition.Adapter.class)
public enum PricelistFilterCondition {
  
  IN("IN"),
  
  NOT_IN("NOT_IN");

  private String value;

  PricelistFilterCondition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricelistFilterCondition fromValue(String value) {
    for (PricelistFilterCondition b : PricelistFilterCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricelistFilterCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricelistFilterCondition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricelistFilterCondition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricelistFilterCondition.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PricelistFilterCondition.fromValue(value);
  }
}

