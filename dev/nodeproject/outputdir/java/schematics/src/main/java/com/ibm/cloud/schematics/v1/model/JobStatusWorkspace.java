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
 * Workspace Job Status.
 */
public class JobStatusWorkspace extends GenericModel {

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

  @SerializedName("workspace_name")
  protected String workspaceName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("flow_status")
  protected JobStatusFlow flowStatus;
  @SerializedName("template_status")
  protected List<JobStatusTemplate> templateStatus;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceName;
    private String statusCode;
    private String statusMessage;
    private JobStatusFlow flowStatus;
    private List<JobStatusTemplate> templateStatus;
    private Date updatedAt;

    private Builder(JobStatusWorkspace jobStatusWorkspace) {
      this.workspaceName = jobStatusWorkspace.workspaceName;
      this.statusCode = jobStatusWorkspace.statusCode;
      this.statusMessage = jobStatusWorkspace.statusMessage;
      this.flowStatus = jobStatusWorkspace.flowStatus;
      this.templateStatus = jobStatusWorkspace.templateStatus;
      this.updatedAt = jobStatusWorkspace.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusWorkspace.
     *
     * @return the new JobStatusWorkspace instance
     */
    public JobStatusWorkspace build() {
      return new JobStatusWorkspace(this);
    }

    /**
     * Adds an templateStatus to templateStatus.
     *
     * @param templateStatus the new templateStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder addTemplateStatus(JobStatusTemplate templateStatus) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templateStatus,
        "templateStatus cannot be null");
      if (this.templateStatus == null) {
        this.templateStatus = new ArrayList<JobStatusTemplate>();
      }
      this.templateStatus.add(templateStatus);
      return this;
    }

    /**
     * Set the workspaceName.
     *
     * @param workspaceName the workspaceName
     * @return the JobStatusWorkspace builder
     */
    public Builder workspaceName(String workspaceName) {
      this.workspaceName = workspaceName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusWorkspace builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusWorkspace builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the flowStatus.
     *
     * @param flowStatus the flowStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder flowStatus(JobStatusFlow flowStatus) {
      this.flowStatus = flowStatus;
      return this;
    }

    /**
     * Set the templateStatus.
     * Existing templateStatus will be replaced.
     *
     * @param templateStatus the templateStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder templateStatus(List<JobStatusTemplate> templateStatus) {
      this.templateStatus = templateStatus;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusWorkspace builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobStatusWorkspace(Builder builder) {
    workspaceName = builder.workspaceName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    flowStatus = builder.flowStatus;
    templateStatus = builder.templateStatus;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobStatusWorkspace builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceName.
   *
   * Workspace name.
   *
   * @return the workspaceName
   */
  public String workspaceName() {
    return workspaceName;
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
   * Workspace job status message (eg. App1_Setup_Pending, for a 'Setup' flow in the 'App1' Workspace).
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * Gets the flowStatus.
   *
   * Environment Flow JOB Status.
   *
   * @return the flowStatus
   */
  public JobStatusFlow flowStatus() {
    return flowStatus;
  }

  /**
   * Gets the templateStatus.
   *
   * Workspace Flow Template job status.
   *
   * @return the templateStatus
   */
  public List<JobStatusTemplate> templateStatus() {
    return templateStatus;
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

