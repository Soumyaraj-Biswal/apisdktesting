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
 * The deleteResourcesQuery options.
 */
public class DeleteResourcesQueryOptions extends GenericModel {

  protected String queryId;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryId;
    private Boolean force;
    private Boolean propagate;

    private Builder(DeleteResourcesQueryOptions deleteResourcesQueryOptions) {
      this.queryId = deleteResourcesQueryOptions.queryId;
      this.force = deleteResourcesQueryOptions.force;
      this.propagate = deleteResourcesQueryOptions.propagate;
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
     * Builds a DeleteResourcesQueryOptions.
     *
     * @return the new DeleteResourcesQueryOptions instance
     */
    public DeleteResourcesQueryOptions build() {
      return new DeleteResourcesQueryOptions(this);
    }

    /**
     * Set the queryId.
     *
     * @param queryId the queryId
     * @return the DeleteResourcesQueryOptions builder
     */
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteResourcesQueryOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteResourcesQueryOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteResourcesQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryId,
      "queryId cannot be empty");
    queryId = builder.queryId;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteResourcesQueryOptions builder
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
   * Gets the force.
   *
   * Equivalent to -force options in the command line.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the propagate.
   *
   * Auto propagate the chaange or deletion to the dependent resources.
   *
   * @return the propagate
   */
  public Boolean propagate() {
    return propagate;
  }
}

