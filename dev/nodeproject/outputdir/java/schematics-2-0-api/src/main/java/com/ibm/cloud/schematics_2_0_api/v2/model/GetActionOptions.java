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
 * The getAction options.
 */
public class GetActionOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
  }

  protected String actionId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private String profile;

    private Builder(GetActionOptions getActionOptions) {
      this.actionId = getActionOptions.actionId;
      this.profile = getActionOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionId the actionId
     */
    public Builder(String actionId) {
      this.actionId = actionId;
    }

    /**
     * Builds a GetActionOptions.
     *
     * @return the new GetActionOptions instance
     */
    public GetActionOptions build() {
      return new GetActionOptions(this);
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the GetActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetActionOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    actionId = builder.actionId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionId.
   *
   * Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
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

