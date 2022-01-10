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
  protected String name;
  protected String description;
  protected List<String> tags;
  protected List<UpdateOrderItemConfiguration> cartItems;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String name;
    private String description;
    private List<String> tags;
    private List<UpdateOrderItemConfiguration> cartItems;
    private String profile;

    private Builder(UpdateCartOrderOptions updateCartOrderOptions) {
      this.orderId = updateCartOrderOptions.orderId;
      this.name = updateCartOrderOptions.name;
      this.description = updateCartOrderOptions.description;
      this.tags = updateCartOrderOptions.tags;
      this.cartItems = updateCartOrderOptions.cartItems;
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
     */
    public Builder(String orderId) {
      this.orderId = orderId;
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
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateCartOrderOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an cartItems to cartItems.
     *
     * @param cartItems the new cartItems
     * @return the UpdateCartOrderOptions builder
     */
    public Builder addCartItems(UpdateOrderItemConfiguration cartItems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cartItems,
        "cartItems cannot be null");
      if (this.cartItems == null) {
        this.cartItems = new ArrayList<UpdateOrderItemConfiguration>();
      }
      this.cartItems.add(cartItems);
      return this;
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
     * Set the name.
     *
     * @param name the name
     * @return the UpdateCartOrderOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateCartOrderOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateCartOrderOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the cartItems.
     * Existing cartItems will be replaced.
     *
     * @param cartItems the cartItems
     * @return the UpdateCartOrderOptions builder
     */
    public Builder cartItems(List<UpdateOrderItemConfiguration> cartItems) {
      this.cartItems = cartItems;
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
    orderId = builder.orderId;
    name = builder.name;
    description = builder.description;
    tags = builder.tags;
    cartItems = builder.cartItems;
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
   * Gets the name.
   *
   * Cart order name (unique for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Cart order description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tags.
   *
   * Cart order tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the cartItems.
   *
   * @return the cartItems
   */
  public List<UpdateOrderItemConfiguration> cartItems() {
    return cartItems;
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

