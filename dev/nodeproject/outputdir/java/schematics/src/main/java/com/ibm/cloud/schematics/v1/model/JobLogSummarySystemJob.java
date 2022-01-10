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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * System Job log summary.
 */
public class JobLogSummarySystemJob extends GenericModel {

  @SerializedName("target_count")
  protected Double targetCount;
  protected Double success;
  protected Double failed;

  /**
   * Builder.
   */
  public static class Builder {
    private Double success;
    private Double failed;

    private Builder(JobLogSummarySystemJob jobLogSummarySystemJob) {
      this.success = jobLogSummarySystemJob.success;
      this.failed = jobLogSummarySystemJob.failed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummarySystemJob.
     *
     * @return the new JobLogSummarySystemJob instance
     */
    public JobLogSummarySystemJob build() {
      return new JobLogSummarySystemJob(this);
    }

    /**
     * Set the success.
     *
     * @param success the success
     * @return the JobLogSummarySystemJob builder
     */
    public Builder success(Double success) {
      this.success = success;
      return this;
    }

    /**
     * Set the failed.
     *
     * @param failed the failed
     * @return the JobLogSummarySystemJob builder
     */
    public Builder failed(Double failed) {
      this.failed = failed;
      return this;
    }
  }

  protected JobLogSummarySystemJob(Builder builder) {
    success = builder.success;
    failed = builder.failed;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummarySystemJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the targetCount.
   *
   * number of targets or hosts.
   *
   * @return the targetCount
   */
  public Double targetCount() {
    return targetCount;
  }

  /**
   * Gets the success.
   *
   * Number of passed.
   *
   * @return the success
   */
  public Double success() {
    return success;
  }

  /**
   * Gets the failed.
   *
   * Number of failed.
   *
   * @return the failed
   */
  public Double failed() {
    return failed;
  }
}

