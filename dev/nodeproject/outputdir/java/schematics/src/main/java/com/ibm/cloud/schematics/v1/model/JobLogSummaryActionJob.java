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
 * Flow Job log summary.
 */
public class JobLogSummaryActionJob extends GenericModel {

  @SerializedName("target_count")
  protected Double targetCount;
  @SerializedName("task_count")
  protected Double taskCount;
  @SerializedName("play_count")
  protected Double playCount;
  protected JobLogSummaryActionJobRecap recap;

  /**
   * Builder.
   */
  public static class Builder {
    private JobLogSummaryActionJobRecap recap;

    private Builder(JobLogSummaryActionJob jobLogSummaryActionJob) {
      this.recap = jobLogSummaryActionJob.recap;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryActionJob.
     *
     * @return the new JobLogSummaryActionJob instance
     */
    public JobLogSummaryActionJob build() {
      return new JobLogSummaryActionJob(this);
    }

    /**
     * Set the recap.
     *
     * @param recap the recap
     * @return the JobLogSummaryActionJob builder
     */
    public Builder recap(JobLogSummaryActionJobRecap recap) {
      this.recap = recap;
      return this;
    }
  }

  protected JobLogSummaryActionJob(Builder builder) {
    recap = builder.recap;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryActionJob builder
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
   * Gets the taskCount.
   *
   * number of tasks in playbook.
   *
   * @return the taskCount
   */
  public Double taskCount() {
    return taskCount;
  }

  /**
   * Gets the playCount.
   *
   * number of plays in playbook.
   *
   * @return the playCount
   */
  public Double playCount() {
    return playCount;
  }

  /**
   * Gets the recap.
   *
   * Recap records.
   *
   * @return the recap
   */
  public JobLogSummaryActionJobRecap recap() {
    return recap;
  }
}

