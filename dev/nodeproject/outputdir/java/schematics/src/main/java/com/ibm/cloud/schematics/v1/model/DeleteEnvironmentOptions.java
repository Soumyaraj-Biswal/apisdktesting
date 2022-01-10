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
package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteEnvironment options.
 */
public class DeleteEnvironmentOptions extends GenericModel {

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
  protected String profile;
  protected Boolean destroy;

  /**
   * Builder.
   */
  public static class Builder {
    private String environmentId;
    private String profile;
    private Boolean destroy;

    private Builder(DeleteEnvironmentOptions deleteEnvironmentOptions) {
      this.environmentId = deleteEnvironmentOptions.environmentId;
      this.profile = deleteEnvironmentOptions.profile;
      this.destroy = deleteEnvironmentOptions.destroy;
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
     */
    public Builder(String environmentId) {
      this.environmentId = environmentId;
    }

    /**
     * Builds a DeleteEnvironmentOptions.
     *
     * @return the new DeleteEnvironmentOptions instance
     */
    public DeleteEnvironmentOptions build() {
      return new DeleteEnvironmentOptions(this);
    }

    /**
     * Set the environmentId.
     *
     * @param environmentId the environmentId
     * @return the DeleteEnvironmentOptions builder
     */
    public Builder environmentId(String environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the DeleteEnvironmentOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the destroy.
     *
     * @param destroy the destroy
     * @return the DeleteEnvironmentOptions builder
     */
    public Builder destroy(Boolean destroy) {
      this.destroy = destroy;
      return this;
    }
  }

  protected DeleteEnvironmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.environmentId,
      "environmentId cannot be empty");
    environmentId = builder.environmentId;
    profile = builder.profile;
    destroy = builder.destroy;
  }

  /**
   * New builder.
   *
   * @return a DeleteEnvironmentOptions builder
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
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }

  /**
   * Gets the destroy.
   *
   * Destroy the resources before deleting the environment.
   *
   * @return the destroy
   */
  public Boolean destroy() {
    return destroy;
  }
}

