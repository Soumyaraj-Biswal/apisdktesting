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
 * Catalog offering of environment kind.
 */
public class EnvironmentCatalogOfferingItem extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("label")
  protected String label;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("short_description")
  protected String shortDescription;
  @SerializedName("crn")
  protected String crn;
  @SerializedName("offering_url")
  protected String offeringUrl;
  @SerializedName("versions")
  protected List<EnvironmentCatalogOfferingItemVersions> versions;

  public EnvironmentCatalogOfferingItem() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the name.
   *
   * Catalog offering item name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the label.
   *
   * Catalog offering item label name.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Gets the offeringId.
   *
   * Offering Id.
   *
   * @return the offeringId
   */
  public String getOfferingId() {
    return this.offeringId;
  }

  /**
   * Gets the shortDescription.
   *
   * @return the shortDescription
   */
  public String getShortDescription() {
    return this.shortDescription;
  }

  /**
   * Gets the crn.
   *
   * CRN of the catalog item.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Gets the offeringUrl.
   *
   * Offering url.
   *
   * @return the offeringUrl
   */
  public String getOfferingUrl() {
    return this.offeringUrl;
  }

  /**
   * Gets the versions.
   *
   * Offering version.
   *
   * @return the versions
   */
  public List<EnvironmentCatalogOfferingItemVersions> getVersions() {
    return this.versions;
  }
}
