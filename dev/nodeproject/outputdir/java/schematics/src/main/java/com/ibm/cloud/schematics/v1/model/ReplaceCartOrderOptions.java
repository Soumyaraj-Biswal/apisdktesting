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
 * The replaceCartOrder options.
 */
public class ReplaceCartOrderOptions extends GenericModel {

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
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String operation;
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
    private String profile;

    private Builder(ReplaceCartOrderOptions replaceCartOrderOptions) {
      this.orderId = replaceCartOrderOptions.orderId;
      this.operation = replaceCartOrderOptions.operation;
      this.name = replaceCartOrderOptions.name;
      this.description = replaceCartOrderOptions.description;
      this.tags = replaceCartOrderOptions.tags;
      this.cartItems = replaceCartOrderOptions.cartItems;
      this.serviceName = replaceCartOrderOptions.serviceName;
      this.resourceGroup = replaceCartOrderOptions.resourceGroup;
      this.location = replaceCartOrderOptions.location;
      this.userState = replaceCartOrderOptions.userState;
      this.sysLock = replaceCartOrderOptions.sysLock;
      this.state = replaceCartOrderOptions.state;
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
     * @param name the name
     */
    public Builder(String orderId, String operation, String name) {
      this.orderId = orderId;
      this.operation = operation;
      this.name = name;
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
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ReplaceCartOrderOptions builder
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
     * @return the ReplaceCartOrderOptions builder
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
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceCartOrderOptions builder
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
     * @return the ReplaceCartOrderOptions builder
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
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder cartItems(List<OrderItemConfiguration> cartItems) {
      this.cartItems = cartItems;
      return this;
    }

    /**
     * Set the serviceName.
     *
     * @param serviceName the serviceName
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder userState(CartOrderUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ReplaceCartOrderOptions builder
     */
    public Builder state(CartOrderLiteState state) {
      this.state = state;
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

    /**
     * Set the cartOrder.
     *
     * @param cartOrder the cartOrder
     * @return the ReplaceCartOrderOptions builder
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

  protected ReplaceCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    orderId = builder.orderId;
    operation = builder.operation;
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

