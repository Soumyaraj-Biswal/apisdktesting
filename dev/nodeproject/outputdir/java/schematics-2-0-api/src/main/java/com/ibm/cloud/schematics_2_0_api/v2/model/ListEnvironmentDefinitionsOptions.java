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
 * The listEnvironmentDefinitions options.
 */
public class ListEnvironmentDefinitionsOptions extends GenericModel {

  protected Long offset;
  protected Long limit;
  protected String catalogId;
  protected String catalogName;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String catalogId;
    private String catalogName;

    private Builder(ListEnvironmentDefinitionsOptions listEnvironmentDefinitionsOptions) {
      this.offset = listEnvironmentDefinitionsOptions.offset;
      this.limit = listEnvironmentDefinitionsOptions.limit;
      this.catalogId = listEnvironmentDefinitionsOptions.catalogId;
      this.catalogName = listEnvironmentDefinitionsOptions.catalogName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListEnvironmentDefinitionsOptions.
     *
     * @return the new ListEnvironmentDefinitionsOptions instance
     */
    public ListEnvironmentDefinitionsOptions build() {
      return new ListEnvironmentDefinitionsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListEnvironmentDefinitionsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListEnvironmentDefinitionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ListEnvironmentDefinitionsOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListEnvironmentDefinitionsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }
  }

  protected ListEnvironmentDefinitionsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    catalogId = builder.catalogId;
    catalogName = builder.catalogName;
  }

  /**
   * New builder.
   *
   * @return a ListEnvironmentDefinitionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

