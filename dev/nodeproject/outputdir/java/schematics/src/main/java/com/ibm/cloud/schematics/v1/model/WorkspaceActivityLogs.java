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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workspace job logs for all the templates in the workspace.
 */
public class WorkspaceActivityLogs extends GenericModel {

  @SerializedName("action_id")
  protected String actionId;
  protected String name;
  protected List<WorkspaceActivityTemplateLogs> templates;

  /**
   * Gets the actionId.
   *
   * The ID of the activity or job that ran against your workspace.
   *
   * @return the actionId
   */
  public String getActionId() {
    return actionId;
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
   * Gets the templates.
   *
   * List of templates in the workspace.
   *
   * @return the templates
   */
  public List<WorkspaceActivityTemplateLogs> getTemplates() {
    return templates;
  }
}

