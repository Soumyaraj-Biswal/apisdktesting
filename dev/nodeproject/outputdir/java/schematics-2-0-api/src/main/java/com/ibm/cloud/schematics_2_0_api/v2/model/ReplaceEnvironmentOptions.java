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
 * The replaceEnvironment options.
 */
public class ReplaceEnvironmentOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String environmentId;
  protected Environment environment;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String environmentId;
    private Environment environment;
    private String profile;

    private Builder(ReplaceEnvironmentOptions replaceEnvironmentOptions) {
      this.environmentId = replaceEnvironmentOptions.environmentId;
      this.environment = replaceEnvironmentOptions.environment;
      this.profile = replaceEnvironmentOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param environmentId the environmentId
     * @param environment the environment
     */
    public Builder(String environmentId, Environment environment) {
      this.environmentId = environmentId;
      this.environment = environment;
    }

    /**
     * Builds a ReplaceEnvironmentOptions.
     *
     * @return the new ReplaceEnvironmentOptions instance
     */
    public ReplaceEnvironmentOptions build() {
      return new ReplaceEnvironmentOptions(this);
    }

    /**
     * Set the environmentId.
     *
     * @param environmentId the environmentId
     * @return the ReplaceEnvironmentOptions builder
     */
    public Builder environmentId(String environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set the environment.
     *
     * @param environment the environment
     * @return the ReplaceEnvironmentOptions builder
     */
    public Builder environment(Environment environment) {
      this.environment = environment;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ReplaceEnvironmentOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ReplaceEnvironmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.environmentId,
      "environmentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.environment,
      "environment cannot be null");
    environmentId = builder.environmentId;
    environment = builder.environment;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ReplaceEnvironmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the environmentId.
   *
   * Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account.
   *
   * @return the environmentId
   */
  public String environmentId() {
    return environmentId;
  }

  /**
   * Gets the environment.
   *
   * Update the environment details.
   *
   * @return the environment
   */
  public Environment environment() {
    return environment;
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

