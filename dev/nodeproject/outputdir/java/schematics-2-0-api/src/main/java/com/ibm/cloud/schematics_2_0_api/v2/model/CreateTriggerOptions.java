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
 * The createTrigger options.
 */
public class CreateTriggerOptions extends GenericModel {

  protected Trigger trigger;

  /**
   * Builder.
   */
  public static class Builder {
    private Trigger trigger;

    private Builder(CreateTriggerOptions createTriggerOptions) {
      this.trigger = createTriggerOptions.trigger;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param trigger the trigger
     */
    public Builder(Trigger trigger) {
      this.trigger = trigger;
    }

    /**
     * Builds a CreateTriggerOptions.
     *
     * @return the new CreateTriggerOptions instance
     */
    public CreateTriggerOptions build() {
      return new CreateTriggerOptions(this);
    }

    /**
     * Set the trigger.
     *
     * @param trigger the trigger
     * @return the CreateTriggerOptions builder
     */
    public Builder trigger(Trigger trigger) {
      this.trigger = trigger;
      return this;
    }
  }

  protected CreateTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.trigger,
      "trigger cannot be null");
    trigger = builder.trigger;
  }

  /**
   * New builder.
   *
   * @return a CreateTriggerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the trigger.
   *
   * Register a Scheduling or Action Trigger with Schematics.
   *
   * @return the trigger
   */
  public Trigger trigger() {
    return trigger;
  }
}

