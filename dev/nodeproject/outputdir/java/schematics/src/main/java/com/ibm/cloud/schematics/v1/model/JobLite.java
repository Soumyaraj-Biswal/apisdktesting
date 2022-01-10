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
 * Job summary profile with system generated data.
 */
public class JobLite extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface CommandObject {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** create_environment. */
    String CREATE_ENVIRONMENT = "create_environment";
    /** put_environment. */
    String PUT_ENVIRONMENT = "put_environment";
    /** delete_environment. */
    String DELETE_ENVIRONMENT = "delete_environment";
    /** environment_init. */
    String ENVIRONMENT_INIT = "environment_init";
    /** environment_install. */
    String ENVIRONMENT_INSTALL = "environment_install";
    /** environment_uninstall. */
    String ENVIRONMENT_UNINSTALL = "environment_uninstall";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
  }

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  protected List<String> tags;
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("submitted_at")
  protected Date submittedAt;
  @SerializedName("submitted_by")
  protected String submittedBy;
  protected String duration;
  @SerializedName("start_at")
  protected Date startAt;
  @SerializedName("end_at")
  protected Date endAt;
  protected JobStatus status;
  @SerializedName("log_summary")
  protected JobLogSummary logSummary;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the id.
   *
   * Job ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Job name, uniquely derived from the related Workspace or Action.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Job description derived from the related Workspace or Action.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String getCommandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectId.
   *
   * Job command object id (workspace-id, action-id).
   *
   * @return the commandObjectId
   */
  public String getCommandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String getCommandName() {
    return commandName;
  }

  /**
   * Gets the tags.
   *
   * User defined tags, while running the job.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name derived from the related Workspace or Action.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the submittedAt.
   *
   * Job submission time.
   *
   * @return the submittedAt
   */
  public Date getSubmittedAt() {
    return submittedAt;
  }

  /**
   * Gets the submittedBy.
   *
   * Email address of user who submitted the job.
   *
   * @return the submittedBy
   */
  public String getSubmittedBy() {
    return submittedBy;
  }

  /**
   * Gets the duration.
   *
   * Duration of job execution; example 40 sec.
   *
   * @return the duration
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Gets the startAt.
   *
   * Job start time.
   *
   * @return the startAt
   */
  public Date getStartAt() {
    return startAt;
  }

  /**
   * Gets the endAt.
   *
   * Job end time.
   *
   * @return the endAt
   */
  public Date getEndAt() {
    return endAt;
  }

  /**
   * Gets the status.
   *
   * Job Status.
   *
   * @return the status
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * Gets the logSummary.
   *
   * Job log summary record.
   *
   * @return the logSummary
   */
  public JobLogSummary getLogSummary() {
    return logSummary;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

