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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Complete Cart order details with user inputs and system generated data.
 */
public class CartOrder extends DynamicModel<Object> {

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

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("cart_items")
  protected List<OrderItemConfiguration> cartItems;
  @SerializedName("service_name")
  protected String serviceName;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("location")
  protected String location;
  @SerializedName("user_state")
  protected CartOrderUserState userState;
  @SerializedName("cart_order_id")
  protected String cartOrderId;
  @SerializedName("crn")
  protected String crn;
  @SerializedName("account")
  protected String account;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("state")
  protected CartOrderLiteState state;

  public CartOrder() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

    private Builder(CartOrder cartOrder) {
      this.name = cartOrder.name;
      this.description = cartOrder.description;
      this.tags = cartOrder.tags;
      this.cartItems = cartOrder.cartItems;
      this.serviceName = cartOrder.serviceName;
      this.resourceGroup = cartOrder.resourceGroup;
      this.location = cartOrder.location;
      this.userState = cartOrder.userState;
      this.sysLock = cartOrder.sysLock;
      this.state = cartOrder.state;
      this.dynamicProperties = cartOrder.getProperties();
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
     * Builds a CartOrder.
     *
     * @return the new CartOrder instance
     */
    public CartOrder build() {
      return new CartOrder(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CartOrder builder
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
     * @return the CartOrder builder
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
     * @return the CartOrder builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CartOrder builder
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
     * @return the CartOrder builder
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
     * @return the CartOrder builder
     */
    public Builder cartItems(List<OrderItemConfiguration> cartItems) {
      this.cartItems = cartItems;
      return this;
    }

    /**
     * Set the serviceName.
     *
     * @param serviceName the serviceName
     * @return the CartOrder builder
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CartOrder builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CartOrder builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the CartOrder builder
     */
    public Builder userState(CartOrderUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the CartOrder builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CartOrder builder
     */
    public Builder state(CartOrderLiteState state) {
      this.state = state;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the CartOrder builder
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

  protected CartOrder(Builder builder) {
    super(new TypeToken<Object>() { });
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
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a CartOrder builder
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
  public List<OrderItemConfiguration> getCartItems() {
    return this.cartItems;
  }

  /**
   * Sets the cartItems.
   *
   * @param cartItems the new cartItems
   */
  public void setCartItems(final List<OrderItemConfiguration> cartItems) {
    this.cartItems = cartItems;
  }

  /**
   * Gets the serviceName.
   *
   * Service short name.
   *
   * @return the serviceName
   */
  public String getServiceName() {
    return this.serviceName;
  }

  /**
   * Sets the serviceName.
   *
   * @param serviceName the new serviceName
   */
  public void setServiceName(final String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Cart order.  By default, Cart order will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Sets the resourceGroup.
   *
   * @param resourceGroup the new resourceGroup
   */
  public void setResourceGroup(final String resourceGroup) {
    this.resourceGroup = resourceGroup;
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
  public String getLocation() {
    return this.location;
  }

  /**
   * Sets the location.
   *
   * @param location the new location
   */
  public void setLocation(final String location) {
    this.location = location;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public CartOrderUserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final CartOrderUserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the cartOrderId.
   *
   * System generated Cart order Id.
   *
   * @return the cartOrderId
   */
  public String getCartOrderId() {
    return this.cartOrderId;
  }

  /**
   * Gets the crn.
   *
   * Cart order CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Gets the account.
   *
   * Account id.
   *
   * @return the account
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * Gets the createdAt.
   *
   * Cart order creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the Cart order.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Cart order updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the Cart order.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return this.sysLock;
  }

  /**
   * Sets the sysLock.
   *
   * @param sysLock the new sysLock
   */
  public void setSysLock(final SystemLock sysLock) {
    this.sysLock = sysLock;
  }

  /**
   * Gets the state.
   *
   * Computed state of the CartOrder.
   *
   * @return the state
   */
  public CartOrderLiteState getState() {
    return this.state;
  }

  /**
   * Sets the state.
   *
   * @param state the new state
   */
  public void setState(final CartOrderLiteState state) {
    this.state = state;
  }
}
