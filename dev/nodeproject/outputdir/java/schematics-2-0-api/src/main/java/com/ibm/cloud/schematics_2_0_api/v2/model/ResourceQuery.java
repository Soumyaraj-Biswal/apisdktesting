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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Describe resource query.
 */
public class ResourceQuery extends DynamicModel<Object> {

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

  public ResourceQuery() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String queryType;
    private List<ResourceQueryParam> queryCondition;
    private List<String> querySelect;
    private Map<String, Object> dynamicProperties;

    private Builder(ResourceQuery resourceQuery) {
      this.queryType = resourceQuery.queryType;
      this.queryCondition = resourceQuery.queryCondition;
      this.querySelect = resourceQuery.querySelect;
      this.dynamicProperties = resourceQuery.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ResourceQuery builder
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

  protected ResourceQuery(Builder builder) {
    super(new TypeToken<Object>() { });
    queryType = builder.queryType;
    queryCondition = builder.queryCondition;
    querySelect = builder.querySelect;
    this.setProperties(builder.dynamicProperties);
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
  public String getQueryType() {
    return this.queryType;
  }

  /**
   * Sets the queryType.
   *
   * @param queryType the new queryType
   */
  public void setQueryType(final String queryType) {
    this.queryType = queryType;
  }

  /**
   * Gets the queryCondition.
   *
   * @return the queryCondition
   */
  public List<ResourceQueryParam> getQueryCondition() {
    return this.queryCondition;
  }

  /**
   * Sets the queryCondition.
   *
   * @param queryCondition the new queryCondition
   */
  public void setQueryCondition(final List<ResourceQueryParam> queryCondition) {
    this.queryCondition = queryCondition;
  }

  /**
   * Gets the querySelect.
   *
   * List of query selection parameters.
   *
   * @return the querySelect
   */
  public List<String> getQuerySelect() {
    return this.querySelect;
  }

  /**
   * Sets the querySelect.
   *
   * @param querySelect the new querySelect
   */
  public void setQuerySelect(final List<String> querySelect) {
    this.querySelect = querySelect;
  }
}
