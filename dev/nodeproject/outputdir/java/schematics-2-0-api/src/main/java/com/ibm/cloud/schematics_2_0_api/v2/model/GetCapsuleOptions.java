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
 * The getCapsule options.
 */
public class GetCapsuleOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
  }

  protected String controlsId;
  protected String capsuleId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String controlsId;
    private String capsuleId;
    private String profile;

    private Builder(GetCapsuleOptions getCapsuleOptions) {
      this.controlsId = getCapsuleOptions.controlsId;
      this.capsuleId = getCapsuleOptions.capsuleId;
      this.profile = getCapsuleOptions.profile;
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
     */
    public Builder(String controlsId, String capsuleId) {
      this.controlsId = controlsId;
      this.capsuleId = capsuleId;
    }

    /**
     * Builds a GetCapsuleOptions.
     *
     * @return the new GetCapsuleOptions instance
     */
    public GetCapsuleOptions build() {
      return new GetCapsuleOptions(this);
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the GetCapsuleOptions builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the capsuleId.
     *
     * @param capsuleId the capsuleId
     * @return the GetCapsuleOptions builder
     */
    public Builder capsuleId(String capsuleId) {
      this.capsuleId = capsuleId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetCapsuleOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetCapsuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.controlsId,
      "controlsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.capsuleId,
      "capsuleId cannot be empty");
    controlsId = builder.controlsId;
    capsuleId = builder.capsuleId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetCapsuleOptions builder
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
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

