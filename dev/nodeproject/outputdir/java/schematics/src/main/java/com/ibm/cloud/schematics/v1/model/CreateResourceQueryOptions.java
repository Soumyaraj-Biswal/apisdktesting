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
 * The createResourceQuery options.
 */
public class CreateResourceQueryOptions extends GenericModel {

  /**
   * Resource type (cluster, vsi, icd, vpc).
   */
  public interface Type {
    /** vsi. */
    String VSI = "vsi";
  }

  protected String type;
  protected String name;
  protected List<ResourceQuery> queries;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private List<ResourceQuery> queries;

    private Builder(CreateResourceQueryOptions createResourceQueryOptions) {
      this.type = createResourceQueryOptions.type;
      this.name = createResourceQueryOptions.name;
      this.queries = createResourceQueryOptions.queries;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateResourceQueryOptions.
     *
     * @return the new CreateResourceQueryOptions instance
     */
    public CreateResourceQueryOptions build() {
      return new CreateResourceQueryOptions(this);
    }

    /**
     * Adds an queries to queries.
     *
     * @param queries the new queries
     * @return the CreateResourceQueryOptions builder
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
     * @return the CreateResourceQueryOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateResourceQueryOptions builder
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
     * @return the CreateResourceQueryOptions builder
     */
    public Builder queries(List<ResourceQuery> queries) {
      this.queries = queries;
      return this;
    }
  }

  protected CreateResourceQueryOptions(Builder builder) {
    type = builder.type;
    name = builder.name;
    queries = builder.queries;
  }

  /**
   * New builder.
   *
   * @return a CreateResourceQueryOptions builder
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

