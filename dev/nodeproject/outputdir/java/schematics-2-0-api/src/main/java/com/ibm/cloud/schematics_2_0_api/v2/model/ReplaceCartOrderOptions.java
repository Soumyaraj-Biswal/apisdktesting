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
 * The replaceCartOrder options.
 */
public class ReplaceCartOrderOptions extends GenericModel {

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
  protected String operation;
  protected CartOrder cartOrder;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String operation;
    private CartOrder cartOrder;
    private String profile;

    private Builder(ReplaceCartOrderOptions replaceCartOrderOptions) {
      this.orderId = replaceCartOrderOptions.orderId;
      this.operation = replaceCartOrderOptions.operation;
      this.cartOrder = replaceCartOrderOptions.cartOrder;
      this.profile = replaceCartOrderOptions.profile;
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
     * @param operation the operation
     * @param cartOrder the cartOrder
     */
    public Builder(String orderId, String operation, CartOrder cartOrder) {
      this.orderId = orderId;
      this.operation = operation;
      this.cartOrder = cartOrder;
    }

    /**
     * Builds a ReplaceCartOrderOptions.
     *
     * @return the new ReplaceCartOrderOptions instance
     */
    public ReplaceCartOrderOptions build() {
      return new ReplaceCartOrderOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the cartOrder.
     *
     * @param cartOrder the cartOrder
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder cartOrder(CartOrder cartOrder) {
      this.cartOrder = cartOrder;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ReplaceCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cartOrder,
      "cartOrder cannot be null");
    orderId = builder.orderId;
    operation = builder.operation;
    cartOrder = builder.cartOrder;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ReplaceCartOrderOptions builder
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
   * Gets the operation.
   *
   * The name of fulfilment job operation (install, uninstall, configure, operate).
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the cartOrder.
   *
   * Update the fulfilment job order and run the job.
   *
   * @return the cartOrder
   */
  public CartOrder cartOrder() {
    return cartOrder;
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

