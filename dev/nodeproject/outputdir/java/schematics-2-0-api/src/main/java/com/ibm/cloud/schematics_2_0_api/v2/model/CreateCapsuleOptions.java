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
 * The createCapsule options.
 */
public class CreateCapsuleOptions extends GenericModel {

  protected String controlsId;
  protected Capsule capsule;

  /**
   * Builder.
   */
  public static class Builder {
    private String controlsId;
    private Capsule capsule;

    private Builder(CreateCapsuleOptions createCapsuleOptions) {
      this.controlsId = createCapsuleOptions.controlsId;
      this.capsule = createCapsuleOptions.capsule;
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
     * @param capsule the capsule
     */
    public Builder(String controlsId, Capsule capsule) {
      this.controlsId = controlsId;
      this.capsule = capsule;
    }

    /**
     * Builds a CreateCapsuleOptions.
     *
     * @return the new CreateCapsuleOptions instance
     */
    public CreateCapsuleOptions build() {
      return new CreateCapsuleOptions(this);
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the CreateCapsuleOptions builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the capsule.
     *
     * @param capsule the capsule
     * @return the CreateCapsuleOptions builder
     */
    public Builder capsule(Capsule capsule) {
      this.capsule = capsule;
      return this;
    }
  }

  protected CreateCapsuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.controlsId,
      "controlsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.capsule,
      "capsule cannot be null");
    controlsId = builder.controlsId;
    capsule = builder.capsule;
  }

  /**
   * New builder.
   *
   * @return a CreateCapsuleOptions builder
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
   * Gets the capsule.
   *
   * Create a Policy Capsule in the Controls definition.
   *
   * @return the capsule
   */
  public Capsule capsule() {
    return capsule;
  }
}

