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
 * Describe resource query definition.
 */
public class ResourceQueryDefinition extends DynamicModel<Object> {

  /**
   * Resource type (cluster, vsi, icd, vpc).
   */
  public interface Type {
    /** vsi. */
    String VSI = "vsi";
  }

  @SerializedName("type")
  protected String type;
  @SerializedName("name")
  protected String name;
  @SerializedName("queries")
  protected List<ResourceQuery> queries;

  public ResourceQueryDefinition() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private List<ResourceQuery> queries;
    private Map<String, Object> dynamicProperties;

    private Builder(ResourceQueryDefinition resourceQueryDefinition) {
      this.type = resourceQueryDefinition.type;
      this.name = resourceQueryDefinition.name;
      this.queries = resourceQueryDefinition.queries;
      this.dynamicProperties = resourceQueryDefinition.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceQueryDefinition.
     *
     * @return the new ResourceQueryDefinition instance
     */
    public ResourceQueryDefinition build() {
      return new ResourceQueryDefinition(this);
    }

    /**
     * Adds an queries to queries.
     *
     * @param queries the new queries
     * @return the ResourceQueryDefinition builder
     */
    public Builder addQueries(ResourceQuery queries) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(queries,
        "queries cannot be null");
      if (this.queries == null) {
        this.queries = new ArrayList<ResourceQuery>();
      }
      this.queries.add(queries);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ResourceQueryDefinition builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ResourceQueryDefinition builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the queries.
     * Existing queries will be replaced.
     *
     * @param queries the queries
     * @return the ResourceQueryDefinition builder
     */
    public Builder queries(List<ResourceQuery> queries) {
      this.queries = queries;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ResourceQueryDefinition builder
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

  protected ResourceQueryDefinition(Builder builder) {
    super(new TypeToken<Object>() { });
    type = builder.type;
    name = builder.name;
    queries = builder.queries;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ResourceQueryDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Resource type (cluster, vsi, icd, vpc).
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the name.
   *
   * Resource query name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the queries.
   *
   * @return the queries
   */
  public List<ResourceQuery> getQueries() {
    return this.queries;
  }

  /**
   * Sets the queries.
   *
   * @param queries the new queries
   */
  public void setQueries(final List<ResourceQuery> queries) {
    this.queries = queries;
  }
}
