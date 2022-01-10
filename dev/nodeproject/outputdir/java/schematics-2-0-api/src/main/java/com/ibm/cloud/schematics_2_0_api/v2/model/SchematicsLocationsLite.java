/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.schematics_2_0_api.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * individual location details.
 */
public class SchematicsLocationsLite extends DynamicModel<Object> {

  @SerializedName("region")
  protected String region;
  @SerializedName("metro")
  protected String metro;
  @SerializedName("geography_code")
  protected String geographyCode;
  @SerializedName("geography")
  protected String geography;
  @SerializedName("country")
  protected String country;
  @SerializedName("kind")
  protected String kind;
  @SerializedName("paired_region")
  protected List<String> pairedRegion;
  @SerializedName("restricted")
  protected Boolean restricted;

  public SchematicsLocationsLite() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the region.
   *
   * Geographical Region code having the data centres of IBM Cloud Schematics service.
   *
   * @return the region
   */
  public String getRegion() {
    return this.region;
  }

  /**
   * Gets the metro.
   *
   * Geographical city locations having the data centres of IBM Cloud Schematics service.
   *
   * @return the metro
   */
  public String getMetro() {
    return this.metro;
  }

  /**
   * Gets the geographyCode.
   *
   * Geographical continent locations code having the data centres of IBM Cloud Schematics service.
   *
   * @return the geographyCode
   */
  public String getGeographyCode() {
    return this.geographyCode;
  }

  /**
   * Gets the geography.
   *
   * Geographical continent locations having the data centres of IBM Cloud Schematics service.
   *
   * @return the geography
   */
  public String getGeography() {
    return this.geography;
  }

  /**
   * Gets the country.
   *
   * Country locations having the data centres of IBM Cloud Schematics service.
   *
   * @return the country
   */
  public String getCountry() {
    return this.country;
  }

  /**
   * Gets the kind.
   *
   * The kind of location.
   *
   * @return the kind
   */
  public String getKind() {
    return this.kind;
  }

  /**
   * Gets the pairedRegion.
   *
   * List of paired regions used by Schematics.
   *
   * @return the pairedRegion
   */
  public List<String> getPairedRegion() {
    return this.pairedRegion;
  }

  /**
   * Gets the restricted.
   *
   * Restricted Region.
   *
   * @return the restricted
   */
  public Boolean isRestricted() {
    return this.restricted;
  }
}
