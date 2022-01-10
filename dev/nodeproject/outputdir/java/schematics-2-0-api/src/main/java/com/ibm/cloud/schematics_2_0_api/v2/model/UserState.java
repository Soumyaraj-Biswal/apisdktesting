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
public class UserState extends DynamicModel<Object> {

  /**
   * User-defined states
   *   * `draft` Object can be modified; can be used by Jobs run by the author, during execution
   *   * `live` Object can be modified; can be used by Jobs during execution
   *   * `locked` Object cannot be modified; can be used by Jobs during execution
   *   * `disable` Object can be modified. cannot be used by Jobs during execution.
   */
  public interface State {
    /** draft. */
    String DRAFT = "draft";
    /** live. */
    String LIVE = "live";
    /** locked. */
    String LOCKED = "locked";
    /** disable. */
    String DISABLE = "disable";
  }

  @SerializedName("state")
  protected String state;
  @SerializedName("set_by")
  protected String setBy;
  @SerializedName("set_at")
  protected Date setAt;

  public UserState() {
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

    private Builder(UserState userState) {
      this.state = userState.state;
      this.setBy = userState.setBy;
      this.setAt = userState.setAt;
      this.dynamicProperties = userState.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UserState.
     *
     * @return the new UserState instance
     */
    public UserState build() {
      return new UserState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the UserState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the setBy.
     *
     * @param setBy the setBy
     * @return the UserState builder
     */
    public Builder setBy(String setBy) {
      this.setBy = setBy;
      return this;
    }

    /**
     * Set the setAt.
     *
     * @param setAt the setAt
     * @return the UserState builder
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
     * @return the UserState builder
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

  protected UserState(Builder builder) {
    super(new TypeToken<Object>() { });
    state = builder.state;
    setBy = builder.setBy;
    setAt = builder.setAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a UserState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * User-defined states
   *   * `draft` Object can be modified; can be used by Jobs run by the author, during execution
   *   * `live` Object can be modified; can be used by Jobs during execution
   *   * `locked` Object cannot be modified; can be used by Jobs during execution
   *   * `disable` Object can be modified. cannot be used by Jobs during execution.
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
