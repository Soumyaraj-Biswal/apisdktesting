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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateControls options.
 */
public class UpdateControlsOptions extends GenericModel {

  protected String controlsId;
  protected Controls controls;

  /**
   * Builder.
   */
  public static class Builder {
    private String controlsId;
    private Controls controls;

    private Builder(UpdateControlsOptions updateControlsOptions) {
      this.controlsId = updateControlsOptions.controlsId;
      this.controls = updateControlsOptions.controls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param controlsId the controlsId
     * @param controls the controls
     */
    public Builder(String controlsId, Controls controls) {
      this.controlsId = controlsId;
      this.controls = controls;
    }

    /**
     * Builds a UpdateControlsOptions.
     *
     * @return the new UpdateControlsOptions instance
     */
    public UpdateControlsOptions build() {
      return new UpdateControlsOptions(this);
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the UpdateControlsOptions builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the controls.
     *
     * @param controls the controls
     * @return the UpdateControlsOptions builder
     */
    public Builder controls(Controls controls) {
      this.controls = controls;
      return this;
    }
  }

  protected UpdateControlsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.controlsId,
      "controlsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.controls,
      "controls cannot be null");
    controlsId = builder.controlsId;
    controls = builder.controls;
  }

  /**
   * New builder.
   *
   * @return a UpdateControlsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the controlsId.
   *
   * Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account.
   *
   * @return the controlsId
   */
  public String controlsId() {
    return controlsId;
  }

  /**
   * Gets the controls.
   *
   * Update the Controls definition.
   *
   * @return the controls
   */
  public Controls controls() {
    return controls;
  }
}

