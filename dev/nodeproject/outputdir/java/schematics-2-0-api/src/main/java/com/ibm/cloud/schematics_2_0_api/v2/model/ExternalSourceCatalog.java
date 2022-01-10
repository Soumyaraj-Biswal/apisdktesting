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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * The connection details to the IBM Cloud Catalog source.
 */
public class ExternalSourceCatalog extends DynamicModel<Object> {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("offering_name")
  protected String offeringName;
  @SerializedName("offering_version")
  protected String offeringVersion;
  @SerializedName("offering_kind")
  protected String offeringKind;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("offering_version_id")
  protected String offeringVersionId;
  @SerializedName("offering_repo_url")
  protected String offeringRepoUrl;

  public ExternalSourceCatalog() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String offeringName;
    private String offeringVersion;
    private String offeringKind;
    private String offeringId;
    private String offeringVersionId;
    private String offeringRepoUrl;
    private Map<String, Object> dynamicProperties;

    private Builder(ExternalSourceCatalog externalSourceCatalog) {
      this.catalogName = externalSourceCatalog.catalogName;
      this.offeringName = externalSourceCatalog.offeringName;
      this.offeringVersion = externalSourceCatalog.offeringVersion;
      this.offeringKind = externalSourceCatalog.offeringKind;
      this.offeringId = externalSourceCatalog.offeringId;
      this.offeringVersionId = externalSourceCatalog.offeringVersionId;
      this.offeringRepoUrl = externalSourceCatalog.offeringRepoUrl;
      this.dynamicProperties = externalSourceCatalog.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExternalSourceCatalog.
     *
     * @return the new ExternalSourceCatalog instance
     */
    public ExternalSourceCatalog build() {
      return new ExternalSourceCatalog(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ExternalSourceCatalog builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the offeringName.
     *
     * @param offeringName the offeringName
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringName(String offeringName) {
      this.offeringName = offeringName;
      return this;
    }

    /**
     * Set the offeringVersion.
     *
     * @param offeringVersion the offeringVersion
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringVersion(String offeringVersion) {
      this.offeringVersion = offeringVersion;
      return this;
    }

    /**
     * Set the offeringKind.
     *
     * @param offeringKind the offeringKind
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringKind(String offeringKind) {
      this.offeringKind = offeringKind;
      return this;
    }

    /**
     * Set the offeringId.
     *
     * @param offeringId the offeringId
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringId(String offeringId) {
      this.offeringId = offeringId;
      return this;
    }

    /**
     * Set the offeringVersionId.
     *
     * @param offeringVersionId the offeringVersionId
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringVersionId(String offeringVersionId) {
      this.offeringVersionId = offeringVersionId;
      return this;
    }

    /**
     * Set the offeringRepoUrl.
     *
     * @param offeringRepoUrl the offeringRepoUrl
     * @return the ExternalSourceCatalog builder
     */
    public Builder offeringRepoUrl(String offeringRepoUrl) {
      this.offeringRepoUrl = offeringRepoUrl;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ExternalSourceCatalog builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected ExternalSourceCatalog(Builder builder) {
    super(new TypeToken<Object>() { });
    catalogName = builder.catalogName;
    offeringName = builder.offeringName;
    offeringVersion = builder.offeringVersion;
    offeringKind = builder.offeringKind;
    offeringId = builder.offeringId;
    offeringVersionId = builder.offeringVersionId;
    offeringRepoUrl = builder.offeringRepoUrl;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ExternalSourceCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * The name of the private catalog.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return this.catalogName;
  }

  /**
   * Sets the catalogName.
   *
   * @param catalogName the new catalogName
   */
  public void setCatalogName(final String catalogName) {
    this.catalogName = catalogName;
  }

  /**
   * Gets the offeringName.
   *
   * The name of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringName
   */
  public String getOfferingName() {
    return this.offeringName;
  }

  /**
   * Sets the offeringName.
   *
   * @param offeringName the new offeringName
   */
  public void setOfferingName(final String offeringName) {
    this.offeringName = offeringName;
  }

  /**
   * Gets the offeringVersion.
   *
   * The version string of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringVersion
   */
  public String getOfferingVersion() {
    return this.offeringVersion;
  }

  /**
   * Sets the offeringVersion.
   *
   * @param offeringVersion the new offeringVersion
   */
  public void setOfferingVersion(final String offeringVersion) {
    this.offeringVersion = offeringVersion;
  }

  /**
   * Gets the offeringKind.
   *
   * The type of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringKind
   */
  public String getOfferingKind() {
    return this.offeringKind;
  }

  /**
   * Sets the offeringKind.
   *
   * @param offeringKind the new offeringKind
   */
  public void setOfferingKind(final String offeringKind) {
    this.offeringKind = offeringKind;
  }

  /**
   * Gets the offeringId.
   *
   * The ID of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringId
   */
  public String getOfferingId() {
    return this.offeringId;
  }

  /**
   * Sets the offeringId.
   *
   * @param offeringId the new offeringId
   */
  public void setOfferingId(final String offeringId) {
    this.offeringId = offeringId;
  }

  /**
   * Gets the offeringVersionId.
   *
   * The ID of an offering version the IBM Cloud Catalog.
   *
   * @return the offeringVersionId
   */
  public String getOfferingVersionId() {
    return this.offeringVersionId;
  }

  /**
   * Sets the offeringVersionId.
   *
   * @param offeringVersionId the new offeringVersionId
   */
  public void setOfferingVersionId(final String offeringVersionId) {
    this.offeringVersionId = offeringVersionId;
  }

  /**
   * Gets the offeringRepoUrl.
   *
   * The repository URL of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringRepoUrl
   */
  public String getOfferingRepoUrl() {
    return this.offeringRepoUrl;
  }

  /**
   * Sets the offeringRepoUrl.
   *
   * @param offeringRepoUrl the new offeringRepoUrl
   */
  public void setOfferingRepoUrl(final String offeringRepoUrl) {
    this.offeringRepoUrl = offeringRepoUrl;
  }
}
