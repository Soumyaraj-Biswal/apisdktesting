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
 * The createControls options.
 */
public class CreateControlsOptions extends GenericModel {

  protected Controls controls;

  /**
   * Builder.
   */
  public static class Builder {
    private Controls controls;

    private Builder(CreateControlsOptions createControlsOptions) {
      this.controls = createControlsOptions.controls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param controls the controls
     */
    public Builder(Controls controls) {
      this.controls = controls;
    }

    /**
     * Builds a CreateControlsOptions.
     *
     * @return the new CreateControlsOptions instance
     */
    public CreateControlsOptions build() {
      return new CreateControlsOptions(this);
    }

    /**
     * Set the controls.
     *
     * @param controls the controls
     * @return the CreateControlsOptions builder
     */
    public Builder controls(Controls controls) {
      this.controls = controls;
      return this;
    }
  }

  protected CreateControlsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.controls,
      "controls cannot be null");
    controls = builder.controls;
  }

  /**
   * New builder.
   *
   * @return a CreateControlsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the controls.
   *
   * Register a Control.
   *
   * @return the controls
   */
  public Controls controls() {
    return controls;
  }
}

