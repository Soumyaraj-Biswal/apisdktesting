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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Update Cart order details with user inputs data.
 */
public class UpdateCartOrder extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("cart_items")
  protected List<UpdateOrderItemConfiguration> cartItems;

  public UpdateCartOrder() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<String> tags;
    private List<UpdateOrderItemConfiguration> cartItems;
    private Map<String, Object> dynamicProperties;

    private Builder(UpdateCartOrder updateCartOrder) {
      this.name = updateCartOrder.name;
      this.description = updateCartOrder.description;
      this.tags = updateCartOrder.tags;
      this.cartItems = updateCartOrder.cartItems;
      this.dynamicProperties = updateCartOrder.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateCartOrder.
     *
     * @return the new UpdateCartOrder instance
     */
    public UpdateCartOrder build() {
      return new UpdateCartOrder(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateCartOrder builder
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
     * @return the UpdateCartOrder builder
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
     * Set the name.
     *
     * @param name the name
     * @return the UpdateCartOrder builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateCartOrder builder
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
     * @return the UpdateCartOrder builder
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
     * @return the UpdateCartOrder builder
     */
    public Builder cartItems(List<UpdateOrderItemConfiguration> cartItems) {
      this.cartItems = cartItems;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the UpdateCartOrder builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected UpdateCartOrder(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    tags = builder.tags;
    cartItems = builder.cartItems;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a UpdateCartOrder builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Cart order name (unique for an account).
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the description.
   *
   * Cart order description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the tags.
   *
   * Cart order tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return this.tags;
  }

  /**
   * Sets the tags.
   *
   * @param tags the new tags
   */
  public void setTags(final List<String> tags) {
    this.tags = tags;
  }

  /**
   * Gets the cartItems.
   *
   * @return the cartItems
   */
  public List<UpdateOrderItemConfiguration> getCartItems() {
    return this.cartItems;
  }

  /**
   * Sets the cartItems.
   *
   * @param cartItems the new cartItems
   */
  public void setCartItems(final List<UpdateOrderItemConfiguration> cartItems) {
    this.cartItems = cartItems;
  }
}
