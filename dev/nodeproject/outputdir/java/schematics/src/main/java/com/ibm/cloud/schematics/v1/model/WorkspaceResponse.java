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
 * Workspace details.
 */
public class WorkspaceResponse extends GenericModel {

  @SerializedName("applied_shareddata_ids")
  protected List<String> appliedShareddataIds;
  @SerializedName("catalog_ref")
  protected CatalogRef catalogRef;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String crn;
  protected String description;
  protected String id;
  @SerializedName("last_health_check_at")
  protected Date lastHealthCheckAt;
  protected String location;
  protected String name;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("runtime_data")
  protected List<TemplateRunTimeDataResponse> runtimeData;
  @SerializedName("shared_data")
  protected SharedTargetDataResponse sharedData;
  protected String status;
  protected List<String> tags;
  @SerializedName("template_data")
  protected List<TemplateSourceDataResponse> templateData;
  @SerializedName("template_ref")
  protected String templateRef;
  @SerializedName("template_repo")
  protected TemplateRepoResponse templateRepo;
  protected List<String> type;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("workspace_status")
  protected WorkspaceStatusResponse workspaceStatus;
  @SerializedName("workspace_status_msg")
  protected WorkspaceStatusMessage workspaceStatusMsg;

  /**
   * Gets the appliedShareddataIds.
   *
   * List of applied shared dataset ID.
   *
   * @return the appliedShareddataIds
   */
  public List<String> getAppliedShareddataIds() {
    return appliedShareddataIds;
  }

  /**
   * Gets the catalogRef.
   *
   * Information about the software template that you chose from the IBM Cloud catalog. This information is returned for
   * IBM Cloud catalog offerings only.
   *
   * @return the catalogRef
   */
  public CatalogRef getCatalogRef() {
    return catalogRef;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the workspace was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * The user ID that created the workspace.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the crn.
   *
   * The workspace CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the description.
   *
   * The description of the workspace.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the workspace.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lastHealthCheckAt.
   *
   * The timestamp when the last health check was performed by Schematics.
   *
   * @return the lastHealthCheckAt
   */
  public Date getLastHealthCheckAt() {
    return lastHealthCheckAt;
  }

  /**
   * Gets the location.
   *
   * The IBM Cloud location where your workspace was provisioned.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the name.
   *
   * The name of the workspace.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group the workspace was provisioned in.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the runtimeData.
   *
   * Information about the provisioning engine, state file, and runtime logs.
   *
   * @return the runtimeData
   */
  public List<TemplateRunTimeDataResponse> getRuntimeData() {
    return runtimeData;
  }

  /**
   * Gets the sharedData.
   *
   * Information about the Target used by the templates originating from IBM Cloud catalog offerings. This information
   * is not relevant when you create a workspace from your own Terraform template.
   *
   * @return the sharedData
   */
  public SharedTargetDataResponse getSharedData() {
    return sharedData;
  }

  /**
   * Gets the status.
   *
   * The status of the workspace.
   *
   *   **Active**: After you successfully ran your infrastructure code by applying your Terraform execution plan, the
   * state of your workspace changes to `Active`.
   *
   *   **Connecting**: Schematics tries to connect to the template in your source repo. If successfully connected, the
   * template is downloaded and metadata, such as input parameters, is extracted. After the template is downloaded, the
   * state of the workspace changes to `Scanning`.
   *
   *   **Draft**: The workspace is created without a reference to a GitHub or GitLab repository.
   *
   *   **Failed**: If errors occur during the execution of your infrastructure code in IBM Cloud Schematics, your
   * workspace status is set to `Failed`.
   *
   *   **Inactive**: The Terraform template was scanned successfully and the workspace creation is complete. You can now
   * start running Schematics plan and apply jobs to provision the IBM Cloud resources that you specified in your
   * template. If you have an `Active` workspace and decide to remove all your resources, your workspace is set to
   * `Inactive` after all your resources are removed.
   *
   *   **In progress**: When you instruct IBM Cloud Schematics to run your infrastructure code by applying your
   * Terraform execution plan, the status of our workspace changes to `In progress`.
   *
   *   **Scanning**: The download of the Terraform template is complete and vulnerability scanning started. If the scan
   * is successful, the workspace state changes to `Inactive`. If errors in your template are found, the state changes
   * to `Template Error`.
   *
   *   **Stopped**: The Schematics plan, apply, or destroy job was cancelled manually.
   *
   *   **Template Error**: The Schematics template contains errors and cannot be processed.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the tags.
   *
   * A list of tags that are associated with the workspace.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the templateData.
   *
   * Information about the Terraform or IBM Cloud software template that you want to use.
   *
   * @return the templateData
   */
  public List<TemplateSourceDataResponse> getTemplateData() {
    return templateData;
  }

  /**
   * Gets the templateRef.
   *
   * Workspace template reference.
   *
   * @return the templateRef
   */
  public String getTemplateRef() {
    return templateRef;
  }

  /**
   * Gets the templateRepo.
   *
   * Information about the Template repository used by the workspace.
   *
   * @return the templateRepo
   */
  public TemplateRepoResponse getTemplateRepo() {
    return templateRepo;
  }

  /**
   * Gets the type.
   *
   * The Terraform version that was used to run your Terraform code.
   *
   * @return the type
   */
  public List<String> getType() {
    return type;
  }

  /**
   * Gets the updatedAt.
   *
   * The timestamp when the workspace was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * The user ID that updated the workspace.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the workspaceStatus.
   *
   * Response that indicate the status of the workspace as either frozen or locked.
   *
   * @return the workspaceStatus
   */
  public WorkspaceStatusResponse getWorkspaceStatus() {
    return workspaceStatus;
  }

  /**
   * Gets the workspaceStatusMsg.
   *
   * Information about the last job that ran against the workspace. -.
   *
   * @return the workspaceStatusMsg
   */
  public WorkspaceStatusMessage getWorkspaceStatusMsg() {
    return workspaceStatusMsg;
  }
}

