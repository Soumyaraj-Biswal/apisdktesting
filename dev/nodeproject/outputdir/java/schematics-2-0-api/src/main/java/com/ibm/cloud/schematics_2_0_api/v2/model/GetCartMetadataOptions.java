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
 * The getCartMetadata options.
 */
public class GetCartMetadataOptions extends GenericModel {

  protected String orderId;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;

    private Builder(GetCartMetadataOptions getCartMetadataOptions) {
      this.orderId = getCartMetadataOptions.orderId;
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
     */
    public Builder(String orderId) {
      this.orderId = orderId;
    }

    /**
     * Builds a GetCartMetadataOptions.
     *
     * @return the new GetCartMetadataOptions instance
     */
    public GetCartMetadataOptions build() {
      return new GetCartMetadataOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the GetCartMetadataOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }
  }

  protected GetCartMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    orderId = builder.orderId;
  }

  /**
   * New builder.
   *
   * @return a GetCartMetadataOptions builder
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
}

