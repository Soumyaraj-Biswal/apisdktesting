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
 * Catalog offering of environment kind.
 */
public class EnvironmentCatalogOfferingItem extends GenericModel {

  protected String name;
  protected String label;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("short_description")
  protected String shortDescription;
  protected String crn;
  @SerializedName("offering_url")
  protected String offeringUrl;
  protected List<EnvironmentCatalogOfferingItemVersions> versions;

  /**
   * Gets the name.
   *
   * Catalog offering item name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the label.
   *
   * Catalog offering item label name.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the offeringId.
   *
   * Offering Id.
   *
   * @return the offeringId
   */
  public String getOfferingId() {
    return offeringId;
  }

  /**
   * Gets the shortDescription.
   *
   * @return the shortDescription
   */
  public String getShortDescription() {
    return shortDescription;
  }

  /**
   * Gets the crn.
   *
   * CRN of the catalog item.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the offeringUrl.
   *
   * Offering url.
   *
   * @return the offeringUrl
   */
  public String getOfferingUrl() {
    return offeringUrl;
  }

  /**
   * Gets the versions.
   *
   * Offering version.
   *
   * @return the versions
   */
  public List<EnvironmentCatalogOfferingItemVersions> getVersions() {
    return versions;
  }
}

