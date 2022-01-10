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
 * The getResourcesQuery options.
 */
public class GetResourcesQueryOptions extends GenericModel {

  protected String queryId;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryId;

    private Builder(GetResourcesQueryOptions getResourcesQueryOptions) {
      this.queryId = getResourcesQueryOptions.queryId;
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
     * Builds a GetResourcesQueryOptions.
     *
     * @return the new GetResourcesQueryOptions instance
     */
    public GetResourcesQueryOptions build() {
      return new GetResourcesQueryOptions(this);
    }

    /**
     * Set the queryId.
     *
     * @param queryId the queryId
     * @return the GetResourcesQueryOptions builder
     */
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      return this;
    }
  }

  protected GetResourcesQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryId,
      "queryId cannot be empty");
    queryId = builder.queryId;
  }

  /**
   * New builder.
   *
   * @return a GetResourcesQueryOptions builder
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
}

