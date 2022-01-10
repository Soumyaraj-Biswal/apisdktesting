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
 * The createJob options.
 */
public class CreateJobOptions extends GenericModel {

  protected String refreshToken;
  protected Job job;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private Job job;

    private Builder(CreateJobOptions createJobOptions) {
      this.refreshToken = createJobOptions.refreshToken;
      this.job = createJobOptions.job;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param refreshToken the refreshToken
     * @param job the job
     */
    public Builder(String refreshToken, Job job) {
      this.refreshToken = refreshToken;
      this.job = job;
    }

    /**
     * Builds a CreateJobOptions.
     *
     * @return the new CreateJobOptions instance
     */
    public CreateJobOptions build() {
      return new CreateJobOptions(this);
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the CreateJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the CreateJobOptions builder
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }
  }

  protected CreateJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.job,
      "job cannot be null");
    refreshToken = builder.refreshToken;
    job = builder.job;
  }

  /**
   * New builder.
   *
   * @return a CreateJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token associated with the IBM Cloud account.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the job.
   *
   * Create a Job Record and launch the Job.
   *
   * @return the job
   */
  public Job job() {
    return job;
  }
}

