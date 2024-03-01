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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets pricelistPriceListType
 */
@JsonAdapter(PricelistPriceListType.Adapter.class)
public enum PricelistPriceListType {
  
  UNKNOWN("UNKNOWN"),
  
  BASE("BASE"),
  
  CATALOG_PROMOTION("CATALOG_PROMOTION");

  private String value;

  PricelistPriceListType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricelistPriceListType fromValue(String value) {
    for (PricelistPriceListType b : PricelistPriceListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricelistPriceListType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricelistPriceListType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricelistPriceListType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricelistPriceListType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PricelistPriceListType.fromValue(value);
  }
}

