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
 * The updateCartOrder options.
 */
public class UpdateCartOrderOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String orderId;
  protected UpdateCartOrder updateCartOrder;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private UpdateCartOrder updateCartOrder;
    private String profile;

    private Builder(UpdateCartOrderOptions updateCartOrderOptions) {
      this.orderId = updateCartOrderOptions.orderId;
      this.updateCartOrder = updateCartOrderOptions.updateCartOrder;
      this.profile = updateCartOrderOptions.profile;
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
     * @param updateCartOrder the updateCartOrder
     */
    public Builder(String orderId, UpdateCartOrder updateCartOrder) {
      this.orderId = orderId;
      this.updateCartOrder = updateCartOrder;
    }

    /**
     * Builds a UpdateCartOrderOptions.
     *
     * @return the new UpdateCartOrderOptions instance
     */
    public UpdateCartOrderOptions build() {
      return new UpdateCartOrderOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the UpdateCartOrderOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * Set the updateCartOrder.
     *
     * @param updateCartOrder the updateCartOrder
     * @return the UpdateCartOrderOptions builder
     */
    public Builder updateCartOrder(UpdateCartOrder updateCartOrder) {
      this.updateCartOrder = updateCartOrder;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the UpdateCartOrderOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected UpdateCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.updateCartOrder,
      "updateCartOrder cannot be null");
    orderId = builder.orderId;
    updateCartOrder = builder.updateCartOrder;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a UpdateCartOrderOptions builder
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
   * Gets the updateCartOrder.
   *
   * Update the fulfilment job order.
   *
   * @return the updateCartOrder
   */
  public UpdateCartOrder updateCartOrder() {
    return updateCartOrder;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

