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
 * The updateCapsule options.
 */
public class UpdateCapsuleOptions extends GenericModel {

  protected String controlsId;
  protected String capsuleId;
  protected Capsule capsule;

  /**
   * Builder.
   */
  public static class Builder {
    private String controlsId;
    private String capsuleId;
    private Capsule capsule;

    private Builder(UpdateCapsuleOptions updateCapsuleOptions) {
      this.controlsId = updateCapsuleOptions.controlsId;
      this.capsuleId = updateCapsuleOptions.capsuleId;
      this.capsule = updateCapsuleOptions.capsule;
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
     * @param capsuleId the capsuleId
     * @param capsule the capsule
     */
    public Builder(String controlsId, String capsuleId, Capsule capsule) {
      this.controlsId = controlsId;
      this.capsuleId = capsuleId;
      this.capsule = capsule;
    }

    /**
     * Builds a UpdateCapsuleOptions.
     *
     * @return the new UpdateCapsuleOptions instance
     */
    public UpdateCapsuleOptions build() {
      return new UpdateCapsuleOptions(this);
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the UpdateCapsuleOptions builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the capsuleId.
     *
     * @param capsuleId the capsuleId
     * @return the UpdateCapsuleOptions builder
     */
    public Builder capsuleId(String capsuleId) {
      this.capsuleId = capsuleId;
      return this;
    }

    /**
     * Set the capsule.
     *
     * @param capsule the capsule
     * @return the UpdateCapsuleOptions builder
     */
    public Builder capsule(Capsule capsule) {
      this.capsule = capsule;
      return this;
    }
  }

  protected UpdateCapsuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.controlsId,
      "controlsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.capsuleId,
      "capsuleId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.capsule,
      "capsule cannot be null");
    controlsId = builder.controlsId;
    capsuleId = builder.capsuleId;
    capsule = builder.capsule;
  }

  /**
   * New builder.
   *
   * @return a UpdateCapsuleOptions builder
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
   * Gets the capsuleId.
   *
   * Capsule Id.  Use GET /controls/&lt;contorls_id&gt;/capsules API to look up the Capsules Ids  for the Controls in
   * your IBM Cloud account.
   *
   * @return the capsuleId
   */
  public String capsuleId() {
    return capsuleId;
  }

  /**
   * Gets the capsule.
   *
   * Update the Policy Capusle.
   *
   * @return the capsule
   */
  public Capsule capsule() {
    return capsule;
  }
}

