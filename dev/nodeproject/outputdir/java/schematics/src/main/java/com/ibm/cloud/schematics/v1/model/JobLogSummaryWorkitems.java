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
 * Job log summary of the flow workitem.
 */
public class JobLogSummaryWorkitems extends GenericModel {

  @SerializedName("workspace_id")
  protected String workspaceId;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("resources_add")
  protected Double resourcesAdd;
  @SerializedName("resources_modify")
  protected Double resourcesModify;
  @SerializedName("resources_destroy")
  protected Double resourcesDestroy;
  @SerializedName("log_url")
  protected String logUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String jobId;
    private String logUrl;

    private Builder(JobLogSummaryWorkitems jobLogSummaryWorkitems) {
      this.workspaceId = jobLogSummaryWorkitems.workspaceId;
      this.jobId = jobLogSummaryWorkitems.jobId;
      this.logUrl = jobLogSummaryWorkitems.logUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryWorkitems.
     *
     * @return the new JobLogSummaryWorkitems instance
     */
    public JobLogSummaryWorkitems build() {
      return new JobLogSummaryWorkitems(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the JobLogSummaryWorkitems builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the JobLogSummaryWorkitems builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the logUrl.
     *
     * @param logUrl the logUrl
     * @return the JobLogSummaryWorkitems builder
     */
    public Builder logUrl(String logUrl) {
      this.logUrl = logUrl;
      return this;
    }
  }

  protected JobLogSummaryWorkitems(Builder builder) {
    workspaceId = builder.workspaceId;
    jobId = builder.jobId;
    logUrl = builder.logUrl;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryWorkitems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceId.
   *
   * workspace ID.
   *
   * @return the workspaceId
   */
  public String workspaceId() {
    return workspaceId;
  }

  /**
   * Gets the jobId.
   *
   * workspace JOB ID.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the resourcesAdd.
   *
   * Number of resources add.
   *
   * @return the resourcesAdd
   */
  public Double resourcesAdd() {
    return resourcesAdd;
  }

  /**
   * Gets the resourcesModify.
   *
   * Number of resources modify.
   *
   * @return the resourcesModify
   */
  public Double resourcesModify() {
    return resourcesModify;
  }

  /**
   * Gets the resourcesDestroy.
   *
   * Number of resources destroy.
   *
   * @return the resourcesDestroy
   */
  public Double resourcesDestroy() {
    return resourcesDestroy;
  }

  /**
   * Gets the logUrl.
   *
   * Log url for job.
   *
   * @return the logUrl
   */
  public String logUrl() {
    return logUrl;
  }
}

