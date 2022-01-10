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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * ControlsEscalation definition.
 */
public class ControlsEscalation extends DynamicModel<Object> {

  @SerializedName("action_id")
  protected String actionId;

  public ControlsEscalation() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private Map<String, Object> dynamicProperties;

    private Builder(ControlsEscalation controlsEscalation) {
      this.actionId = controlsEscalation.actionId;
      this.dynamicProperties = controlsEscalation.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ControlsEscalation.
     *
     * @return the new ControlsEscalation instance
     */
    public ControlsEscalation build() {
      return new ControlsEscalation(this);
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the ControlsEscalation builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ControlsEscalation builder
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

  protected ControlsEscalation(Builder builder) {
    super(new TypeToken<Object>() { });
    actionId = builder.actionId;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ControlsEscalation builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionId.
   *
   * ControlsEscalation details (placeholder).
   *
   * @return the actionId
   */
  public String getActionId() {
    return this.actionId;
  }

  /**
   * Sets the actionId.
   *
   * @param actionId the new actionId
   */
  public void setActionId(final String actionId) {
    this.actionId = actionId;
  }
}
