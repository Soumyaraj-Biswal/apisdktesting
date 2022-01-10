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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getCartOrderJobLog options.
 */
public class GetCartOrderJobLogOptions extends GenericModel {

  protected String orderId;
  protected String jobId;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String jobId;
    private Long offset;
    private Long limit;

    private Builder(GetCartOrderJobLogOptions getCartOrderJobLogOptions) {
      this.orderId = getCartOrderJobLogOptions.orderId;
      this.jobId = getCartOrderJobLogOptions.jobId;
      this.offset = getCartOrderJobLogOptions.offset;
      this.limit = getCartOrderJobLogOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param orderId the orderId
     * @param jobId the jobId
     */
    public Builder(String orderId, String jobId) {
      this.orderId = orderId;
      this.jobId = jobId;
    }

    /**
     * Builds a GetCartOrderJobLogOptions.
     *
     * @return the new GetCartOrderJobLogOptions instance
     */
    public GetCartOrderJobLogOptions build() {
      return new GetCartOrderJobLogOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the GetCartOrderJobLogOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetCartOrderJobLogOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetCartOrderJobLogOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetCartOrderJobLogOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetCartOrderJobLogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    orderId = builder.orderId;
    jobId = builder.jobId;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetCartOrderJobLogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderId.
   *
   * Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account.
   *
   * @return the orderId
   */
  public String orderId() {
    return orderId;
  }

  /**
   * Gets the jobId.
   *
   * Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
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

