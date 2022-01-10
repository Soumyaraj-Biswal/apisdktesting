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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Individual workitem status info.
 */
public class JobStatusWorkitem extends GenericModel {

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

  @SerializedName("workspace_id")
  protected String workspaceId;
  @SerializedName("workspace_name")
  protected String workspaceName;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String workspaceName;
    private String jobId;
    private String statusCode;
    private String statusMessage;
    private Date updatedAt;

    private Builder(JobStatusWorkitem jobStatusWorkitem) {
      this.workspaceId = jobStatusWorkitem.workspaceId;
      this.workspaceName = jobStatusWorkitem.workspaceName;
      this.jobId = jobStatusWorkitem.jobId;
      this.statusCode = jobStatusWorkitem.statusCode;
      this.statusMessage = jobStatusWorkitem.statusMessage;
      this.updatedAt = jobStatusWorkitem.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusWorkitem.
     *
     * @return the new JobStatusWorkitem instance
     */
    public JobStatusWorkitem build() {
      return new JobStatusWorkitem(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the JobStatusWorkitem builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the workspaceName.
     *
     * @param workspaceName the workspaceName
     * @return the JobStatusWorkitem builder
     */
    public Builder workspaceName(String workspaceName) {
      this.workspaceName = workspaceName;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the JobStatusWorkitem builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusWorkitem builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusWorkitem builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusWorkitem builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobStatusWorkitem(Builder builder) {
    workspaceId = builder.workspaceId;
    workspaceName = builder.workspaceName;
    jobId = builder.jobId;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobStatusWorkitem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceId.
   *
   * Workspace id.
   *
   * @return the workspaceId
   */
  public String workspaceId() {
    return workspaceId;
  }

  /**
   * Gets the workspaceName.
   *
   * workspace name.
   *
   * @return the workspaceName
   */
  public String workspaceName() {
    return workspaceName;
  }

  /**
   * Gets the jobId.
   *
   * workspace job id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
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
   * workitem job status message;.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * Gets the updatedAt.
   *
   * workitem job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

