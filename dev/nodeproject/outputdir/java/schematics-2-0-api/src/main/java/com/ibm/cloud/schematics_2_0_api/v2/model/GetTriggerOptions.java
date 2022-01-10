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
 * The getTrigger options.
 */
public class GetTriggerOptions extends GenericModel {

  protected String triggerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String triggerId;

    private Builder(GetTriggerOptions getTriggerOptions) {
      this.triggerId = getTriggerOptions.triggerId;
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
     */
    public Builder(String triggerId) {
      this.triggerId = triggerId;
    }

    /**
     * Builds a GetTriggerOptions.
     *
     * @return the new GetTriggerOptions instance
     */
    public GetTriggerOptions build() {
      return new GetTriggerOptions(this);
    }

    /**
     * Set the triggerId.
     *
     * @param triggerId the triggerId
     * @return the GetTriggerOptions builder
     */
    public Builder triggerId(String triggerId) {
      this.triggerId = triggerId;
      return this;
    }
  }

  protected GetTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.triggerId,
      "triggerId cannot be empty");
    triggerId = builder.triggerId;
  }

  /**
   * New builder.
   *
   * @return a GetTriggerOptions builder
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
}

