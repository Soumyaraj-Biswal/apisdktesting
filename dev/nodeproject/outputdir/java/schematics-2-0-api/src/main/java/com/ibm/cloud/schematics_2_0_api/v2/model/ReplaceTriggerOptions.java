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
 * The replaceTrigger options.
 */
public class ReplaceTriggerOptions extends GenericModel {

  protected String triggerId;
  protected Trigger trigger;

  /**
   * Builder.
   */
  public static class Builder {
    private String triggerId;
    private Trigger trigger;

    private Builder(ReplaceTriggerOptions replaceTriggerOptions) {
      this.triggerId = replaceTriggerOptions.triggerId;
      this.trigger = replaceTriggerOptions.trigger;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param triggerId the triggerId
     * @param trigger the trigger
     */
    public Builder(String triggerId, Trigger trigger) {
      this.triggerId = triggerId;
      this.trigger = trigger;
    }

    /**
     * Builds a ReplaceTriggerOptions.
     *
     * @return the new ReplaceTriggerOptions instance
     */
    public ReplaceTriggerOptions build() {
      return new ReplaceTriggerOptions(this);
    }

    /**
     * Set the triggerId.
     *
     * @param triggerId the triggerId
     * @return the ReplaceTriggerOptions builder
     */
    public Builder triggerId(String triggerId) {
      this.triggerId = triggerId;
      return this;
    }

    /**
     * Set the trigger.
     *
     * @param trigger the trigger
     * @return the ReplaceTriggerOptions builder
     */
    public Builder trigger(Trigger trigger) {
      this.trigger = trigger;
      return this;
    }
  }

  protected ReplaceTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.triggerId,
      "triggerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.trigger,
      "trigger cannot be null");
    triggerId = builder.triggerId;
    trigger = builder.trigger;
  }

  /**
   * New builder.
   *
   * @return a ReplaceTriggerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the triggerId.
   *
   * Id of the Schematics trigger.
   *
   * @return the triggerId
   */
  public String triggerId() {
    return triggerId;
  }

  /**
   * Gets the trigger.
   *
   * Replace the Schematics trigger.
   *
   * @return the trigger
   */
  public Trigger trigger() {
    return trigger;
  }
}

