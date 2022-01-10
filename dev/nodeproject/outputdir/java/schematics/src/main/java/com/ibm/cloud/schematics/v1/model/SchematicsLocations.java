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
package com.ibm.cloud.schematics.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the location.
 */
public class SchematicsLocations extends GenericModel {

  protected String name;
  protected String id;
  protected String country;
  protected String geography;
  @SerializedName("geography_code")
  protected String geographyCode;
  protected String metro;
  @SerializedName("multizone_metro")
  protected String multizoneMetro;
  protected String kind;
  @SerializedName("paired_region")
  protected List<String> pairedRegion;
  protected Boolean restricted;

  /**
   * Gets the name.
   *
   * The name of the location.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the id.
   *
   * The ID of the location.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the country.
   *
   * The country where the location is located.
   *
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Gets the geography.
   *
   * The geography that the location belongs to.
   *
   * @return the geography
   */
  public String getGeography() {
    return geography;
  }

  /**
   * Gets the geographyCode.
   *
   * Geographical continent locations code having the data centres of IBM Cloud Schematics service.
   *
   * @return the geographyCode
   */
  public String getGeographyCode() {
    return geographyCode;
  }

  /**
   * Gets the metro.
   *
   * The metro area that the location belongs to.
   *
   * @return the metro
   */
  public String getMetro() {
    return metro;
  }

  /**
   * Gets the multizoneMetro.
   *
   * The multizone metro area that the location belongs to.
   *
   * @return the multizoneMetro
   */
  public String getMultizoneMetro() {
    return multizoneMetro;
  }

  /**
   * Gets the kind.
   *
   * The kind of location.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the pairedRegion.
   *
   * List of paired regions used by Schematics.
   *
   * @return the pairedRegion
   */
  public List<String> getPairedRegion() {
    return pairedRegion;
  }

  /**
   * Gets the restricted.
   *
   * Restricted Region.
   *
   * @return the restricted
   */
  public Boolean isRestricted() {
    return restricted;
  }
}

