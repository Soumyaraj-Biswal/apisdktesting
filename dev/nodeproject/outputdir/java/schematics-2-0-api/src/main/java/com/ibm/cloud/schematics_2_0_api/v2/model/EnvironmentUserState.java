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
 * User defined status of the Environment.
 */
public class EnvironmentUserState extends DynamicModel<Object> {

  /**
   * User-defined states
   *   * `Environment_Create_Init` When Create Environment POST API is invoked and CreateEnvironment process is
   * initiated.
   *   * `Environment_Create_InProgress` When Create Environment process is in progress.
   *   * `Environment_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Environment_Create_Failed` Failed to create Environment or underlying schematics objects.
   */
  public interface State {
    /** Environment_Create_Init. */
    String ENVIRONMENT_CREATE_INIT = "Environment_Create_Init";
    /** Environment_Create_InProgress. */
    String ENVIRONMENT_CREATE_INPROGRESS = "Environment_Create_InProgress";
    /** Environment_Create_Success. */
    String ENVIRONMENT_CREATE_SUCCESS = "Environment_Create_Success";
    /** Environment_Create_Failed. */
    String ENVIRONMENT_CREATE_FAILED = "Environment_Create_Failed";
  }

  @SerializedName("state")
  protected String state;
  @SerializedName("set_by")
  protected String setBy;
  @SerializedName("set_at")
  protected Date setAt;

  public EnvironmentUserState() {
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

    private Builder(EnvironmentUserState environmentUserState) {
      this.state = environmentUserState.state;
      this.setBy = environmentUserState.setBy;
      this.setAt = environmentUserState.setAt;
      this.dynamicProperties = environmentUserState.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnvironmentUserState.
     *
     * @return the new EnvironmentUserState instance
     */
    public EnvironmentUserState build() {
      return new EnvironmentUserState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the EnvironmentUserState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the setBy.
     *
     * @param setBy the setBy
     * @return the EnvironmentUserState builder
     */
    public Builder setBy(String setBy) {
      this.setBy = setBy;
      return this;
    }

    /**
     * Set the setAt.
     *
     * @param setAt the setAt
     * @return the EnvironmentUserState builder
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
     * @return the EnvironmentUserState builder
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

  protected EnvironmentUserState(Builder builder) {
    super(new TypeToken<Object>() { });
    state = builder.state;
    setBy = builder.setBy;
    setAt = builder.setAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a EnvironmentUserState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * User-defined states
   *   * `Environment_Create_Init` When Create Environment POST API is invoked and CreateEnvironment process is
   * initiated.
   *   * `Environment_Create_InProgress` When Create Environment process is in progress.
   *   * `Environment_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Environment_Create_Failed` Failed to create Environment or underlying schematics objects.
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
   * User who set the state of the Environment.
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
   * When the User who set the state of the Environment.
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
