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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Environment Flow JOB Status.
 */
public class JobStatusFlow extends GenericModel {

  /**
   * Status of Jobs.
   */
  public interface StatusCode {
    /** job_pending. */
    String JOB_PENDING = "job_pending";
    /** job_in_progress. */
    String JOB_IN_PROGRESS = "job_in_progress";
    /** job_finished. */
    String JOB_FINISHED = "job_finished";
    /** job_failed. */
    String JOB_FAILED = "job_failed";
    /** job_cancelled. */
    String JOB_CANCELLED = "job_cancelled";
  }

  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  protected List<JobStatusWorkitem> workitems;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private String flowName;
    private String statusCode;
    private String statusMessage;
    private List<JobStatusWorkitem> workitems;
    private Date updatedAt;

    private Builder(JobStatusFlow jobStatusFlow) {
      this.flowId = jobStatusFlow.flowId;
      this.flowName = jobStatusFlow.flowName;
      this.statusCode = jobStatusFlow.statusCode;
      this.statusMessage = jobStatusFlow.statusMessage;
      this.workitems = jobStatusFlow.workitems;
      this.updatedAt = jobStatusFlow.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusFlow.
     *
     * @return the new JobStatusFlow instance
     */
    public JobStatusFlow build() {
      return new JobStatusFlow(this);
    }

    /**
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the JobStatusFlow builder
     */
    public Builder addWorkitems(JobStatusWorkitem workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<JobStatusWorkitem>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the JobStatusFlow builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the flowName.
     *
     * @param flowName the flowName
     * @return the JobStatusFlow builder
     */
    public Builder flowName(String flowName) {
      this.flowName = flowName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusFlow builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusFlow builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the JobStatusFlow builder
     */
    public Builder workitems(List<JobStatusWorkitem> workitems) {
      this.workitems = workitems;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusFlow builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobStatusFlow(Builder builder) {
    flowId = builder.flowId;
    flowName = builder.flowName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    workitems = builder.workitems;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobStatusFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * flow id.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the flowName.
   *
   * flow name.
   *
   * @return the flowName
   */
  public String flowName() {
    return flowName;
  }

  /**
   * Gets the statusCode.
   *
   * Status of Jobs.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * Flow Job status message - to be displayed along with the status_code;.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * Gets the workitems.
   *
   * Environment's individual workItem status details;.
   *
   * @return the workitems
   */
  public List<JobStatusWorkitem> workitems() {
    return workitems;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

