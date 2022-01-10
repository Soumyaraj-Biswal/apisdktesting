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
 * The getCartOrder options.
 */
public class GetCartOrderOptions extends GenericModel {

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
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String profile;

    private Builder(GetCartOrderOptions getCartOrderOptions) {
      this.orderId = getCartOrderOptions.orderId;
      this.profile = getCartOrderOptions.profile;
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
     * Builds a GetCartOrderOptions.
     *
     * @return the new GetCartOrderOptions instance
     */
    public GetCartOrderOptions build() {
      return new GetCartOrderOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the GetCartOrderOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetCartOrderOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    orderId = builder.orderId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetCartOrderOptions builder
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

