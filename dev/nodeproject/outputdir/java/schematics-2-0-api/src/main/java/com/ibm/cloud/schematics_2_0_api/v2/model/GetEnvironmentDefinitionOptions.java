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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getEnvironmentDefinition options.
 */
public class GetEnvironmentDefinitionOptions extends GenericModel {

  protected String offeringId;
  protected String catalogId;
  protected String catalogName;
  protected String offeringName;
  protected String offeringVersion;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String offeringId;
    private String catalogId;
    private String catalogName;
    private String offeringName;
    private String offeringVersion;
    private Long offset;
    private Long limit;

    private Builder(GetEnvironmentDefinitionOptions getEnvironmentDefinitionOptions) {
      this.offeringId = getEnvironmentDefinitionOptions.offeringId;
      this.catalogId = getEnvironmentDefinitionOptions.catalogId;
      this.catalogName = getEnvironmentDefinitionOptions.catalogName;
      this.offeringName = getEnvironmentDefinitionOptions.offeringName;
      this.offeringVersion = getEnvironmentDefinitionOptions.offeringVersion;
      this.offset = getEnvironmentDefinitionOptions.offset;
      this.limit = getEnvironmentDefinitionOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param offeringId the offeringId
     */
    public Builder(String offeringId) {
      this.offeringId = offeringId;
    }

    /**
     * Builds a GetEnvironmentDefinitionOptions.
     *
     * @return the new GetEnvironmentDefinitionOptions instance
     */
    public GetEnvironmentDefinitionOptions build() {
      return new GetEnvironmentDefinitionOptions(this);
    }

    /**
     * Set the offeringId.
     *
     * @param offeringId the offeringId
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder offeringId(String offeringId) {
      this.offeringId = offeringId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the offeringName.
     *
     * @param offeringName the offeringName
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder offeringName(String offeringName) {
      this.offeringName = offeringName;
      return this;
    }

    /**
     * Set the offeringVersion.
     *
     * @param offeringVersion the offeringVersion
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder offeringVersion(String offeringVersion) {
      this.offeringVersion = offeringVersion;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetEnvironmentDefinitionOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetEnvironmentDefinitionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.offeringId,
      "offeringId cannot be empty");
    offeringId = builder.offeringId;
    catalogId = builder.catalogId;
    catalogName = builder.catalogName;
    offeringName = builder.offeringName;
    offeringVersion = builder.offeringVersion;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetEnvironmentDefinitionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offeringId.
   *
   * Catalog ID to get the list of environments defined as part of offerings.
   *
   * @return the offeringId
   */
  public String offeringId() {
    return offeringId;
  }

  /**
   * Gets the catalogId.
   *
   * Catalog ID to get the list of environments defined as part of offerings.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog Name to get the list of environments defined as part of offerings.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the offeringName.
   *
   * Offering Name to get the list of environments defined as part of offerings.
   *
   * @return the offeringName
   */
  public String offeringName() {
    return offeringName;
  }

  /**
   * Gets the offeringVersion.
   *
   * Version of the offering.
   *
   * @return the offeringVersion
   */
  public String offeringVersion() {
    return offeringVersion;
  }

  /**
   * Gets the offset.
   *
   * The starting position of the item in the list of items. For example, if you have three workspaces in your account,
   * the first workspace is assigned position number 0, the second workspace is assigned position number 1, and so
   * forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit the number
   * of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative numbers are not
   * supported and are ignored.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000. If no
   * value is provided, 100 is used by default.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

