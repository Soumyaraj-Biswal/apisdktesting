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
 * The createEnvironment options.
 */
public class CreateEnvironmentOptions extends GenericModel {

  protected Environment environment;

  /**
   * Builder.
   */
  public static class Builder {
    private Environment environment;

    private Builder(CreateEnvironmentOptions createEnvironmentOptions) {
      this.environment = createEnvironmentOptions.environment;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param environment the environment
     */
    public Builder(Environment environment) {
      this.environment = environment;
    }

    /**
     * Builds a CreateEnvironmentOptions.
     *
     * @return the new CreateEnvironmentOptions instance
     */
    public CreateEnvironmentOptions build() {
      return new CreateEnvironmentOptions(this);
    }

    /**
     * Set the environment.
     *
     * @param environment the environment
     * @return the CreateEnvironmentOptions builder
     */
    public Builder environment(Environment environment) {
      this.environment = environment;
      return this;
    }
  }

  protected CreateEnvironmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.environment,
      "environment cannot be null");
    environment = builder.environment;
  }

  /**
   * New builder.
   *
   * @return a CreateEnvironmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the environment.
   *
   * Create environment.
   *
   * @return the environment
   */
  public Environment environment() {
    return environment;
  }
}

