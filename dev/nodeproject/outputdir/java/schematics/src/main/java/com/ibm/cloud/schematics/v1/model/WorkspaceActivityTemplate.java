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
 * Information about the template in the workspace.
 */
public class WorkspaceActivityTemplate extends GenericModel {

  @SerializedName("end_time")
  protected Date endTime;
  @SerializedName("log_summary")
  protected LogSummary logSummary;
  @SerializedName("log_url")
  protected String logUrl;
  protected String message;
  @SerializedName("start_time")
  protected Date startTime;
  protected String status;
  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("template_type")
  protected String templateType;

  /**
   * Gets the endTime.
   *
   * End time for the job.
   *
   * @return the endTime
   */
  public Date getEndTime() {
    return endTime;
  }

  /**
   * Gets the logSummary.
   *
   * Summary information extracted from the job logs.
   *
   * @return the logSummary
   */
  public LogSummary getLogSummary() {
    return logSummary;
  }

  /**
   * Gets the logUrl.
   *
   * Log URL.
   *
   * @return the logUrl
   */
  public String getLogUrl() {
    return logUrl;
  }

  /**
   * Gets the message.
   *
   * Message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the startTime.
   *
   * Job start time.
   *
   * @return the startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Gets the status.
   *
   * The status of your activity or job. To retrieve the URL to your job logs, use the GET
   * /v1/workspaces/{id}/actions/{action_id}/logs API.
   *
   * * **COMPLETED**: The job completed successfully.
   * * **CREATED**: The job was created, but the provisioning, modification, or removal of IBM Cloud resources has not
   * started yet.
   * * **FAILED**: An error occurred during the plan, apply, or destroy job. Use the job ID to retrieve the URL to the
   * log files for your job.
   * * **IN PROGRESS**: The job is in progress. You can use the log_url to access the logs.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the templateId.
   *
   * The ID that was assigned to your Terraform template or IBM Cloud catalog software template.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return templateId;
  }

  /**
   * Gets the templateType.
   *
   * The type of template.
   *
   * @return the templateType
   */
  public String getTemplateType() {
    return templateType;
  }
}

