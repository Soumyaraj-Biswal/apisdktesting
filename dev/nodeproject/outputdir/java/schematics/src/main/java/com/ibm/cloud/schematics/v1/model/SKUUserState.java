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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status of the underlying schematics objects used to fullfil CartOrder.
 */
public class SKUUserState extends GenericModel {

  protected String state;
  @SerializedName("set_by")
  protected String setBy;
  @SerializedName("set_at")
  protected Date setAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String state;
    private String setBy;
    private Date setAt;

    private Builder(SKUUserState skuUserState) {
      this.state = skuUserState.state;
      this.setBy = skuUserState.setBy;
      this.setAt = skuUserState.setAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SKUUserState.
     *
     * @return the new SKUUserState instance
     */
    public SKUUserState build() {
      return new SKUUserState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the SKUUserState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the setBy.
     *
     * @param setBy the setBy
     * @return the SKUUserState builder
     */
    public Builder setBy(String setBy) {
      this.setBy = setBy;
      return this;
    }

    /**
     * Set the setAt.
     *
     * @param setAt the setAt
     * @return the SKUUserState builder
     */
    public Builder setAt(Date setAt) {
      this.setAt = setAt;
      return this;
    }
  }

  protected SKUUserState(Builder builder) {
    state = builder.state;
    setBy = builder.setBy;
    setAt = builder.setAt;
  }

  /**
   * New builder.
   *
   * @return a SKUUserState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * State of the object.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the setBy.
   *
   * Name of the User who set the state of the Object.
   *
   * @return the setBy
   */
  public String setBy() {
    return setBy;
  }

  /**
   * Gets the setAt.
   *
   * When the User who set the state of the Object.
   *
   * @return the setAt
   */
  public Date setAt() {
    return setAt;
  }
}

