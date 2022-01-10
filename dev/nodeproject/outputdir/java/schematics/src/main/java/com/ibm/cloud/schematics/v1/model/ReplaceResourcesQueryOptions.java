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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceResourcesQuery options.
 */
public class ReplaceResourcesQueryOptions extends GenericModel {

  /**
   * Resource type (cluster, vsi, icd, vpc).
   */
  public interface Type {
    /** vsi. */
    String VSI = "vsi";
  }

  protected String queryId;
  protected String type;
  protected String name;
  protected List<ResourceQuery> queries;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryId;
    private String type;
    private String name;
    private List<ResourceQuery> queries;

    private Builder(ReplaceResourcesQueryOptions replaceResourcesQueryOptions) {
      this.queryId = replaceResourcesQueryOptions.queryId;
      this.type = replaceResourcesQueryOptions.type;
      this.name = replaceResourcesQueryOptions.name;
      this.queries = replaceResourcesQueryOptions.queries;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param queryId the queryId
     */
    public Builder(String queryId) {
      this.queryId = queryId;
    }

    /**
     * Builds a ReplaceResourcesQueryOptions.
     *
     * @return the new ReplaceResourcesQueryOptions instance
     */
    public ReplaceResourcesQueryOptions build() {
      return new ReplaceResourcesQueryOptions(this);
    }

    /**
     * Adds an queries to queries.
     *
     * @param queries the new queries
     * @return the ReplaceResourcesQueryOptions builder
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
     * Set the queryId.
     *
     * @param queryId the queryId
     * @return the ReplaceResourcesQueryOptions builder
     */
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ReplaceResourcesQueryOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceResourcesQueryOptions builder
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
     * @return the ReplaceResourcesQueryOptions builder
     */
    public Builder queries(List<ResourceQuery> queries) {
      this.queries = queries;
      return this;
    }
  }

  protected ReplaceResourcesQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryId,
      "queryId cannot be empty");
    queryId = builder.queryId;
    type = builder.type;
    name = builder.name;
    queries = builder.queries;
  }

  /**
   * New builder.
   *
   * @return a ReplaceResourcesQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the queryId.
   *
   * Resource query Id.  Use GET /resource_query API to look up the Resource query definition Ids  in your IBM Cloud
   * account.
   *
   * @return the queryId
   */
  public String queryId() {
    return queryId;
  }

  /**
   * Gets the type.
   *
   * Resource type (cluster, vsi, icd, vpc).
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Resource query name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the queries.
   *
   * @return the queries
   */
  public List<ResourceQuery> queries() {
    return queries;
  }
}

