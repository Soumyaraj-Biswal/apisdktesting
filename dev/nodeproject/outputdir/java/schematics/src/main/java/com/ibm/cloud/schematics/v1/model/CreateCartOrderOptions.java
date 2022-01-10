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
 * The createCartOrder options.
 */
public class CreateCartOrderOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String name;
  protected String description;
  protected List<String> tags;
  protected List<OrderItemConfiguration> cartItems;
  protected String serviceName;
  protected String resourceGroup;
  protected String location;
  protected CartOrderUserState userState;
  protected SystemLock sysLock;
  protected CartOrderLiteState state;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<String> tags;
    private List<OrderItemConfiguration> cartItems;
    private String serviceName;
    private String resourceGroup;
    private String location;
    private CartOrderUserState userState;
    private SystemLock sysLock;
    private CartOrderLiteState state;

    private Builder(CreateCartOrderOptions createCartOrderOptions) {
      this.name = createCartOrderOptions.name;
      this.description = createCartOrderOptions.description;
      this.tags = createCartOrderOptions.tags;
      this.cartItems = createCartOrderOptions.cartItems;
      this.serviceName = createCartOrderOptions.serviceName;
      this.resourceGroup = createCartOrderOptions.resourceGroup;
      this.location = createCartOrderOptions.location;
      this.userState = createCartOrderOptions.userState;
      this.sysLock = createCartOrderOptions.sysLock;
      this.state = createCartOrderOptions.state;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a CreateCartOrderOptions.
     *
     * @return the new CreateCartOrderOptions instance
     */
    public CreateCartOrderOptions build() {
      return new CreateCartOrderOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateCartOrderOptions builder
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
     * @return the CreateCartOrderOptions builder
     */
    public Builder addCartItems(OrderItemConfiguration cartItems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cartItems,
        "cartItems cannot be null");
      if (this.cartItems == null) {
        this.cartItems = new ArrayList<OrderItemConfiguration>();
      }
      this.cartItems.add(cartItems);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateCartOrderOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateCartOrderOptions builder
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
     * @return the CreateCartOrderOptions builder
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
     * @return the CreateCartOrderOptions builder
     */
    public Builder cartItems(List<OrderItemConfiguration> cartItems) {
      this.cartItems = cartItems;
      return this;
    }

    /**
     * Set the serviceName.
     *
     * @param serviceName the serviceName
     * @return the CreateCartOrderOptions builder
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateCartOrderOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateCartOrderOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the CreateCartOrderOptions builder
     */
    public Builder userState(CartOrderUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the CreateCartOrderOptions builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CreateCartOrderOptions builder
     */
    public Builder state(CartOrderLiteState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the cartOrder.
     *
     * @param cartOrder the cartOrder
     * @return the CreateCartOrderOptions builder
     */
    public Builder cartOrder(CartOrder cartOrder) {
      this.name = cartOrder.name();
      this.description = cartOrder.description();
      this.tags = cartOrder.tags();
      this.cartItems = cartOrder.cartItems();
      this.serviceName = cartOrder.serviceName();
      this.resourceGroup = cartOrder.resourceGroup();
      this.location = cartOrder.location();
      this.userState = cartOrder.userState();
      this.sysLock = cartOrder.sysLock();
      this.state = cartOrder.state();
      return this;
    }
  }

  protected CreateCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    description = builder.description;
    tags = builder.tags;
    cartItems = builder.cartItems;
    serviceName = builder.serviceName;
    resourceGroup = builder.resourceGroup;
    location = builder.location;
    userState = builder.userState;
    sysLock = builder.sysLock;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a CreateCartOrderOptions builder
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
  public List<OrderItemConfiguration> cartItems() {
    return cartItems;
  }

  /**
   * Gets the serviceName.
   *
   * Service short name.
   *
   * @return the serviceName
   */
  public String serviceName() {
    return serviceName;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Cart order.  By default, Cart order will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public CartOrderUserState userState() {
    return userState;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock sysLock() {
    return sysLock;
  }

  /**
   * Gets the state.
   *
   * Computed state of the CartOrder.
   *
   * @return the state
   */
  public CartOrderLiteState state() {
    return state;
  }
}

