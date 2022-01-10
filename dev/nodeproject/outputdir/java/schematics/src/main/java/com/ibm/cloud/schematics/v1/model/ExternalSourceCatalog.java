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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The connection details to the IBM Cloud Catalog source.
 */
public class ExternalSourceCatalog extends GenericModel {

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

    private Builder(ExternalSourceCatalog externalSourceCatalog) {
      this.catalogName = externalSourceCatalog.catalogName;
      this.offeringName = externalSourceCatalog.offeringName;
      this.offeringVersion = externalSourceCatalog.offeringVersion;
      this.offeringKind = externalSourceCatalog.offeringKind;
      this.offeringId = externalSourceCatalog.offeringId;
      this.offeringVersionId = externalSourceCatalog.offeringVersionId;
      this.offeringRepoUrl = externalSourceCatalog.offeringRepoUrl;
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
  }

  protected ExternalSourceCatalog(Builder builder) {
    catalogName = builder.catalogName;
    offeringName = builder.offeringName;
    offeringVersion = builder.offeringVersion;
    offeringKind = builder.offeringKind;
    offeringId = builder.offeringId;
    offeringVersionId = builder.offeringVersionId;
    offeringRepoUrl = builder.offeringRepoUrl;
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
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the offeringName.
   *
   * The name of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringName
   */
  public String offeringName() {
    return offeringName;
  }

  /**
   * Gets the offeringVersion.
   *
   * The version string of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringVersion
   */
  public String offeringVersion() {
    return offeringVersion;
  }

  /**
   * Gets the offeringKind.
   *
   * The type of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringKind
   */
  public String offeringKind() {
    return offeringKind;
  }

  /**
   * Gets the offeringId.
   *
   * The ID of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringId
   */
  public String offeringId() {
    return offeringId;
  }

  /**
   * Gets the offeringVersionId.
   *
   * The ID of an offering version the IBM Cloud Catalog.
   *
   * @return the offeringVersionId
   */
  public String offeringVersionId() {
    return offeringVersionId;
  }

  /**
   * Gets the offeringRepoUrl.
   *
   * The repository URL of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringRepoUrl
   */
  public String offeringRepoUrl() {
    return offeringRepoUrl;
  }
}

