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
 * Stands for Albania, not all ;-)
 */
@JsonAdapter(PricelistCurrency.Adapter.class)
public enum PricelistCurrency {
  
  XXX("XXX"),
  
  ALL("ALL"),
  
  DZD("DZD"),
  
  ARS("ARS"),
  
  AUD("AUD"),
  
  BSD("BSD"),
  
  BHD("BHD"),
  
  BDT("BDT"),
  
  AMD("AMD"),
  
  BBD("BBD"),
  
  BMD("BMD"),
  
  BTN("BTN"),
  
  BOB("BOB"),
  
  BWP("BWP"),
  
  BZD("BZD"),
  
  SBD("SBD"),
  
  BND("BND"),
  
  MMK("MMK"),
  
  BIF("BIF"),
  
  KHR("KHR"),
  
  CAD("CAD"),
  
  CVE("CVE"),
  
  KYD("KYD"),
  
  LKR("LKR"),
  
  CLP("CLP"),
  
  CNY("CNY"),
  
  COP("COP"),
  
  KMF("KMF"),
  
  CRC("CRC"),
  
  HRK("HRK"),
  
  CUP("CUP"),
  
  CZK("CZK"),
  
  DKK("DKK"),
  
  DOP("DOP"),
  
  SVC("SVC"),
  
  ETB("ETB"),
  
  ERN("ERN"),
  
  FKP("FKP"),
  
  FJD("FJD"),
  
  DJF("DJF"),
  
  GMD("GMD"),
  
  GIP("GIP"),
  
  GTQ("GTQ"),
  
  GNF("GNF"),
  
  GYD("GYD"),
  
  HTG("HTG"),
  
  HNL("HNL"),
  
  HKD("HKD"),
  
  HUF("HUF"),
  
  ISK("ISK"),
  
  INR("INR"),
  
  IDR("IDR"),
  
  IRR("IRR"),
  
  IQD("IQD"),
  
  ILS("ILS"),
  
  JMD("JMD"),
  
  JPY("JPY"),
  
  KZT("KZT"),
  
  JOD("JOD"),
  
  KES("KES"),
  
  KPW("KPW"),
  
  KRW("KRW"),
  
  KWD("KWD"),
  
  KGS("KGS"),
  
  LAK("LAK"),
  
  LBP("LBP"),
  
  LSL("LSL"),
  
  LRD("LRD"),
  
  LYD("LYD"),
  
  LTL("LTL"),
  
  MOP("MOP"),
  
  MWK("MWK"),
  
  MYR("MYR"),
  
  MVR("MVR"),
  
  MRO("MRO"),
  
  MUR("MUR"),
  
  MXN("MXN"),
  
  MNT("MNT"),
  
  MDL("MDL"),
  
  MAD("MAD"),
  
  OMR("OMR"),
  
  NAD("NAD"),
  
  NPR("NPR"),
  
  ANG("ANG"),
  
  AWG("AWG"),
  
  VUV("VUV"),
  
  NZD("NZD"),
  
  NIO("NIO"),
  
  NGN("NGN"),
  
  NOK("NOK"),
  
  PKR("PKR"),
  
  PAB("PAB"),
  
  PGK("PGK"),
  
  PYG("PYG"),
  
  PEN("PEN"),
  
  PHP("PHP"),
  
  QAR("QAR"),
  
  RUB("RUB"),
  
  RWF("RWF"),
  
  SHP("SHP"),
  
  STD("STD"),
  
  SAR("SAR"),
  
  SCR("SCR"),
  
  SLL("SLL"),
  
  SGD("SGD"),
  
  VND("VND"),
  
  SOS("SOS"),
  
  ZAR("ZAR"),
  
  SSP("SSP"),
  
  SZL("SZL"),
  
  SEK("SEK"),
  
  CHF("CHF"),
  
  SYP("SYP"),
  
  THB("THB"),
  
  TOP("TOP"),
  
  TTD("TTD"),
  
  AED("AED"),
  
  TND("TND"),
  
  UGX("UGX"),
  
  MKD("MKD"),
  
  EGP("EGP"),
  
  GBP("GBP"),
  
  TZS("TZS"),
  
  USD("USD"),
  
  UYU("UYU"),
  
  UZS("UZS"),
  
  WST("WST"),
  
  YER("YER"),
  
  TWD("TWD"),
  
  CUC("CUC"),
  
  ZWL("ZWL"),
  
  TMT("TMT"),
  
  GHS("GHS"),
  
  VEF("VEF"),
  
  SDG("SDG"),
  
  UYI("UYI"),
  
  RSD("RSD"),
  
  MZN("MZN"),
  
  AZN("AZN"),
  
  RON("RON"),
  
  CHE("CHE"),
  
  CHW("CHW"),
  
  TRY("TRY"),
  
  XAF("XAF"),
  
  XCD("XCD"),
  
  XOF("XOF"),
  
  XPF("XPF"),
  
  XBA("XBA"),
  
  XBB("XBB"),
  
  XBC("XBC"),
  
  XBD("XBD"),
  
  XAU("XAU"),
  
  XDR("XDR"),
  
  XAG("XAG"),
  
  XPT("XPT"),
  
  XPD("XPD"),
  
  XUA("XUA"),
  
  ZMW("ZMW"),
  
  SRD("SRD"),
  
  MGA("MGA"),
  
  COU("COU"),
  
  AFN("AFN"),
  
  TJS("TJS"),
  
  AOA("AOA"),
  
  BYR("BYR"),
  
  BGN("BGN"),
  
  CDF("CDF"),
  
  BAM("BAM"),
  
  EUR("EUR"),
  
  MXV("MXV"),
  
  UAH("UAH"),
  
  GEL("GEL"),
  
  BOV("BOV"),
  
  PLN("PLN"),
  
  BRL("BRL"),
  
  CLF("CLF"),
  
  XSU("XSU"),
  
  USN("USN");

  private String value;

  PricelistCurrency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricelistCurrency fromValue(String value) {
    for (PricelistCurrency b : PricelistCurrency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricelistCurrency> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricelistCurrency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricelistCurrency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricelistCurrency.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PricelistCurrency.fromValue(value);
  }
}

