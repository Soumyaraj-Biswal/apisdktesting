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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Flow Job log summary.
 */
public class JobLogSummaryFlowJob extends GenericModel {

  @SerializedName("workitems_completed")
  protected Double workitemsCompleted;
  @SerializedName("workitems_pending")
  protected Double workitemsPending;
  @SerializedName("workitems_failed")
  protected Double workitemsFailed;
  protected List<JobLogSummaryWorkitems> workitems;

  /**
   * Builder.
   */
  public static class Builder {
    private List<JobLogSummaryWorkitems> workitems;

    private Builder(JobLogSummaryFlowJob jobLogSummaryFlowJob) {
      this.workitems = jobLogSummaryFlowJob.workitems;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryFlowJob.
     *
     * @return the new JobLogSummaryFlowJob instance
     */
    public JobLogSummaryFlowJob build() {
      return new JobLogSummaryFlowJob(this);
    }

    /**
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the JobLogSummaryFlowJob builder
     */
    public Builder addWorkitems(JobLogSummaryWorkitems workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<JobLogSummaryWorkitems>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the JobLogSummaryFlowJob builder
     */
    public Builder workitems(List<JobLogSummaryWorkitems> workitems) {
      this.workitems = workitems;
      return this;
    }
  }

  protected JobLogSummaryFlowJob(Builder builder) {
    workitems = builder.workitems;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryFlowJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workitemsCompleted.
   *
   * Number of workitems completed successfully.
   *
   * @return the workitemsCompleted
   */
  public Double workitemsCompleted() {
    return workitemsCompleted;
  }

  /**
   * Gets the workitemsPending.
   *
   * Number of workitems pending in the flow.
   *
   * @return the workitemsPending
   */
  public Double workitemsPending() {
    return workitemsPending;
  }

  /**
   * Gets the workitemsFailed.
   *
   * Number of workitems failed.
   *
   * @return the workitemsFailed
   */
  public Double workitemsFailed() {
    return workitemsFailed;
  }

  /**
   * Gets the workitems.
   *
   * @return the workitems
   */
  public List<JobLogSummaryWorkitems> workitems() {
    return workitems;
  }
}

