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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Describe resource query.
 */
public class ResourceQuery extends GenericModel {

  /**
   * Type of the query(workspaces).
   */
  public interface QueryType {
    /** workspaces. */
    String WORKSPACES = "workspaces";
  }

  @SerializedName("query_type")
  protected String queryType;
  @SerializedName("query_condition")
  protected List<ResourceQueryParam> queryCondition;
  @SerializedName("query_select")
  protected List<String> querySelect;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryType;
    private List<ResourceQueryParam> queryCondition;
    private List<String> querySelect;

    private Builder(ResourceQuery resourceQuery) {
      this.queryType = resourceQuery.queryType;
      this.queryCondition = resourceQuery.queryCondition;
      this.querySelect = resourceQuery.querySelect;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceQuery.
     *
     * @return the new ResourceQuery instance
     */
    public ResourceQuery build() {
      return new ResourceQuery(this);
    }

    /**
     * Adds an queryCondition to queryCondition.
     *
     * @param queryCondition the new queryCondition
     * @return the ResourceQuery builder
     */
    public Builder addQueryCondition(ResourceQueryParam queryCondition) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(queryCondition,
        "queryCondition cannot be null");
      if (this.queryCondition == null) {
        this.queryCondition = new ArrayList<ResourceQueryParam>();
      }
      this.queryCondition.add(queryCondition);
      return this;
    }

    /**
     * Adds an querySelect to querySelect.
     *
     * @param querySelect the new querySelect
     * @return the ResourceQuery builder
     */
    public Builder addQuerySelect(String querySelect) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(querySelect,
        "querySelect cannot be null");
      if (this.querySelect == null) {
        this.querySelect = new ArrayList<String>();
      }
      this.querySelect.add(querySelect);
      return this;
    }

    /**
     * Set the queryType.
     *
     * @param queryType the queryType
     * @return the ResourceQuery builder
     */
    public Builder queryType(String queryType) {
      this.queryType = queryType;
      return this;
    }

    /**
     * Set the queryCondition.
     * Existing queryCondition will be replaced.
     *
     * @param queryCondition the queryCondition
     * @return the ResourceQuery builder
     */
    public Builder queryCondition(List<ResourceQueryParam> queryCondition) {
      this.queryCondition = queryCondition;
      return this;
    }

    /**
     * Set the querySelect.
     * Existing querySelect will be replaced.
     *
     * @param querySelect the querySelect
     * @return the ResourceQuery builder
     */
    public Builder querySelect(List<String> querySelect) {
      this.querySelect = querySelect;
      return this;
    }
  }

  protected ResourceQuery(Builder builder) {
    queryType = builder.queryType;
    queryCondition = builder.queryCondition;
    querySelect = builder.querySelect;
  }

  /**
   * New builder.
   *
   * @return a ResourceQuery builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the queryType.
   *
   * Type of the query(workspaces).
   *
   * @return the queryType
   */
  public String queryType() {
    return queryType;
  }

  /**
   * Gets the queryCondition.
   *
   * @return the queryCondition
   */
  public List<ResourceQueryParam> queryCondition() {
    return queryCondition;
  }

  /**
   * Gets the querySelect.
   *
   * List of query selection parameters.
   *
   * @return the querySelect
   */
  public List<String> querySelect() {
    return querySelect;
  }
}

