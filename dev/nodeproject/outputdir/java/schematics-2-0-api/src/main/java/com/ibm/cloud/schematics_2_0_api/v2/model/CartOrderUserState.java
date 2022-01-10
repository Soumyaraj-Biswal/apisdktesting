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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * User defined status of the Schematics object.
 */
public class CartOrderUserState extends DynamicModel<Object> {

  /**
   * User-defined states
   *   * `Order_Create_Init` When Create Order POST API is invoked and CreateOrder process is initiated.
   *   * `Order_Create_InProgress` When CreateOrder process is in progress.
   *   * `Order_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Order_Create_Failed` Failed to create CartOrder or underlying schematics objects
   *   * `Order_Fulfilment_Pending` Fulfilment operation is triggered and waiting to be picked up by orchestrator.
   *   * `Order_Fulfilment_InProgress` Actively processing fulfilment operation
   *   * `Order_Fulfilment_Success` Fulfilment successful
   *   * `Order_Fulfilment_Failed` Fulfilment failed.
   */
  public interface State {
    /** Order_Create_Init. */
    String ORDER_CREATE_INIT = "Order_Create_Init";
    /** Order_Create_InProgress. */
    String ORDER_CREATE_INPROGRESS = "Order_Create_InProgress";
    /** Order_Create_Success. */
    String ORDER_CREATE_SUCCESS = "Order_Create_Success";
    /** Order_Create_Failed. */
    String ORDER_CREATE_FAILED = "Order_Create_Failed";
    /** Order_Fulfilment_Pending. */
    String ORDER_FULFILMENT_PENDING = "Order_Fulfilment_Pending";
    /** Order_Fulfilment_Success. */
    String ORDER_FULFILMENT_SUCCESS = "Order_Fulfilment_Success";
    /** Order_Fulfilment_Failed. */
    String ORDER_FULFILMENT_FAILED = "Order_Fulfilment_Failed";
  }

  @SerializedName("state")
  protected String state;
  @SerializedName("set_by")
  protected String setBy;
  @SerializedName("set_at")
  protected Date setAt;

  public CartOrderUserState() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String state;
    private String setBy;
    private Date setAt;
    private Map<String, Object> dynamicProperties;

    private Builder(CartOrderUserState cartOrderUserState) {
      this.state = cartOrderUserState.state;
      this.setBy = cartOrderUserState.setBy;
      this.setAt = cartOrderUserState.setAt;
      this.dynamicProperties = cartOrderUserState.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CartOrderUserState.
     *
     * @return the new CartOrderUserState instance
     */
    public CartOrderUserState build() {
      return new CartOrderUserState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CartOrderUserState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the setBy.
     *
     * @param setBy the setBy
     * @return the CartOrderUserState builder
     */
    public Builder setBy(String setBy) {
      this.setBy = setBy;
      return this;
    }

    /**
     * Set the setAt.
     *
     * @param setAt the setAt
     * @return the CartOrderUserState builder
     */
    public Builder setAt(Date setAt) {
      this.setAt = setAt;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the CartOrderUserState builder
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

  protected CartOrderUserState(Builder builder) {
    super(new TypeToken<Object>() { });
    state = builder.state;
    setBy = builder.setBy;
    setAt = builder.setAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a CartOrderUserState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * User-defined states
   *   * `Order_Create_Init` When Create Order POST API is invoked and CreateOrder process is initiated.
   *   * `Order_Create_InProgress` When CreateOrder process is in progress.
   *   * `Order_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Order_Create_Failed` Failed to create CartOrder or underlying schematics objects
   *   * `Order_Fulfilment_Pending` Fulfilment operation is triggered and waiting to be picked up by orchestrator.
   *   * `Order_Fulfilment_InProgress` Actively processing fulfilment operation
   *   * `Order_Fulfilment_Success` Fulfilment successful
   *   * `Order_Fulfilment_Failed` Fulfilment failed.
   *
   * @return the state
   */
  public String getState() {
    return this.state;
  }

  /**
   * Sets the state.
   *
   * @param state the new state
   */
  public void setState(final String state) {
    this.state = state;
  }

  /**
   * Gets the setBy.
   *
   * Name of the User who set the state of the Object.
   *
   * @return the setBy
   */
  public String getSetBy() {
    return this.setBy;
  }

  /**
   * Sets the setBy.
   *
   * @param setBy the new setBy
   */
  public void setSetBy(final String setBy) {
    this.setBy = setBy;
  }

  /**
   * Gets the setAt.
   *
   * When the User who set the state of the Object.
   *
   * @return the setAt
   */
  public Date getSetAt() {
    return this.setAt;
  }

  /**
   * Sets the setAt.
   *
   * @param setAt the new setAt
   */
  public void setSetAt(final Date setAt) {
    this.setAt = setAt;
  }
}
