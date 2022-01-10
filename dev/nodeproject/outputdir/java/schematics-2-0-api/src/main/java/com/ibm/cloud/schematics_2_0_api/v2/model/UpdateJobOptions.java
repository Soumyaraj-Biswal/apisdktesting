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
 * The updateJob options.
 */
public class UpdateJobOptions extends GenericModel {

  protected String jobId;
  protected String refreshToken;
  protected Job job;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String refreshToken;
    private Job job;

    private Builder(UpdateJobOptions updateJobOptions) {
      this.jobId = updateJobOptions.jobId;
      this.refreshToken = updateJobOptions.refreshToken;
      this.job = updateJobOptions.job;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     * @param refreshToken the refreshToken
     * @param job the job
     */
    public Builder(String jobId, String refreshToken, Job job) {
      this.jobId = jobId;
      this.refreshToken = refreshToken;
      this.job = job;
    }

    /**
     * Builds a UpdateJobOptions.
     *
     * @return the new UpdateJobOptions instance
     */
    public UpdateJobOptions build() {
      return new UpdateJobOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the UpdateJobOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the UpdateJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the UpdateJobOptions builder
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }
  }

  protected UpdateJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.job,
      "job cannot be null");
    jobId = builder.jobId;
    refreshToken = builder.refreshToken;
    job = builder.job;
  }

  /**
   * New builder.
   *
   * @return a UpdateJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
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
   * Clone the Job-record, and relaunch the Job.
   *
   * @return the job
   */
  public Job job() {
    return job;
  }
}

