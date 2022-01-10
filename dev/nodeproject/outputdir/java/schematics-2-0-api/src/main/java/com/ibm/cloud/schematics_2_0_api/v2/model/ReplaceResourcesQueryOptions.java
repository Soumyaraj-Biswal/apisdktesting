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
 * The replaceResourcesQuery options.
 */
public class ReplaceResourcesQueryOptions extends GenericModel {

  protected String queryId;
  protected ResourceQueryDefinition resourceQueryDefinition;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryId;
    private ResourceQueryDefinition resourceQueryDefinition;

    private Builder(ReplaceResourcesQueryOptions replaceResourcesQueryOptions) {
      this.queryId = replaceResourcesQueryOptions.queryId;
      this.resourceQueryDefinition = replaceResourcesQueryOptions.resourceQueryDefinition;
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
     * @param resourceQueryDefinition the resourceQueryDefinition
     */
    public Builder(String queryId, ResourceQueryDefinition resourceQueryDefinition) {
      this.queryId = queryId;
      this.resourceQueryDefinition = resourceQueryDefinition;
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
     * Set the resourceQueryDefinition.
     *
     * @param resourceQueryDefinition the resourceQueryDefinition
     * @return the ReplaceResourcesQueryOptions builder
     */
    public Builder resourceQueryDefinition(ResourceQueryDefinition resourceQueryDefinition) {
      this.resourceQueryDefinition = resourceQueryDefinition;
      return this;
    }
  }

  protected ReplaceResourcesQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryId,
      "queryId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceQueryDefinition,
      "resourceQueryDefinition cannot be null");
    queryId = builder.queryId;
    resourceQueryDefinition = builder.resourceQueryDefinition;
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
   * Gets the resourceQueryDefinition.
   *
   * Replace the resources query definition.
   *
   * @return the resourceQueryDefinition
   */
  public ResourceQueryDefinition resourceQueryDefinition() {
    return resourceQueryDefinition;
  }
}

