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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the workspace jobs.
 */
public class WorkspaceActivity extends GenericModel {

  @SerializedName("action_id")
  protected String actionId;
  protected List<String> message;
  protected String name;
  @SerializedName("performed_at")
  protected Date performedAt;
  @SerializedName("performed_by")
  protected String performedBy;
  protected String status;
  protected List<WorkspaceActivityTemplate> templates;

  /**
   * Gets the actionId.
   *
   * The ID of the activity or job.  You can use the ID to retrieve the logs for that job by using the `GET
   * /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   * @return the actionId
   */
  public String getActionId() {
    return actionId;
  }

  /**
   * Gets the message.
   *
   * Information about the success or failure of your job,  including a success or error code and the timestamp when the
   * job succeeded or failed.
   *
   * @return the message
   */
  public List<String> getMessage() {
    return message;
  }

  /**
   * Gets the name.
   *
   * The type of actovoty or job that ran against your workspace.
   *
   *  * **APPLY**: The apply job was created when you used the `PUT /v1/workspaces/{id}/apply` API to apply a Terraform
   * template in IBM Cloud.
   *  * **DESTROY**: The destroy job was created when you used the `DELETE /v1/workspaces/{id}/destroy` API to remove
   * all resources that are associated with your workspace.
   *  * **PLAN**: The plan job was created when you used the `POST /v1/workspaces/{id}/plan` API to create a Terraform
   * execution plan.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the performedAt.
   *
   * The timestamp when the job was initiated.
   *
   * @return the performedAt
   */
  public Date getPerformedAt() {
    return performedAt;
  }

  /**
   * Gets the performedBy.
   *
   * The user ID who initiated the job.
   *
   * @return the performedBy
   */
  public String getPerformedBy() {
    return performedBy;
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
   * Gets the templates.
   *
   * List of template activities.
   *
   * @return the templates
   */
  public List<WorkspaceActivityTemplate> getTemplates() {
    return templates;
  }
}

