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
package com.ibm.cloud.schematics_2_0_api.v2.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Status of the last job executed by the workitem.
 */
public class WorkItemLastJob extends DynamicModel<Object> {

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
   * Status of Jobs.
   */
  public interface JobStatus {
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

  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_name")
  protected String commandObjectName;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("job_status")
  protected String jobStatus;

  public WorkItemLastJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String commandObject;
    private String commandObjectName;
    private String commandObjectId;
    private String commandName;
    private String jobStatus;
    private Map<String, Object> dynamicProperties;

    private Builder(WorkItemLastJob workItemLastJob) {
      this.commandObject = workItemLastJob.commandObject;
      this.commandObjectName = workItemLastJob.commandObjectName;
      this.commandObjectId = workItemLastJob.commandObjectId;
      this.commandName = workItemLastJob.commandName;
      this.jobStatus = workItemLastJob.jobStatus;
      this.dynamicProperties = workItemLastJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkItemLastJob.
     *
     * @return the new WorkItemLastJob instance
     */
    public WorkItemLastJob build() {
      return new WorkItemLastJob(this);
    }

    /**
     * Set the commandObject.
     *
     * @param commandObject the commandObject
     * @return the WorkItemLastJob builder
     */
    public Builder commandObject(String commandObject) {
      this.commandObject = commandObject;
      return this;
    }

    /**
     * Set the commandObjectName.
     *
     * @param commandObjectName the commandObjectName
     * @return the WorkItemLastJob builder
     */
    public Builder commandObjectName(String commandObjectName) {
      this.commandObjectName = commandObjectName;
      return this;
    }

    /**
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the WorkItemLastJob builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the WorkItemLastJob builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the jobStatus.
     *
     * @param jobStatus the jobStatus
     * @return the WorkItemLastJob builder
     */
    public Builder jobStatus(String jobStatus) {
      this.jobStatus = jobStatus;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the WorkItemLastJob builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected WorkItemLastJob(Builder builder) {
    super(new TypeToken<Object>() { });
    commandObject = builder.commandObject;
    commandObjectName = builder.commandObjectName;
    commandObjectId = builder.commandObjectId;
    commandName = builder.commandName;
    jobStatus = builder.jobStatus;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a WorkItemLastJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String getCommandObject() {
    return this.commandObject;
  }

  /**
   * Sets the commandObject.
   *
   * @param commandObject the new commandObject
   */
  public void setCommandObject(final String commandObject) {
    this.commandObject = commandObject;
  }

  /**
   * Gets the commandObjectName.
   *
   * Name of the command object id, maps to workspace_name or action_name.
   *
   * @return the commandObjectName
   */
  public String getCommandObjectName() {
    return this.commandObjectName;
  }

  /**
   * Sets the commandObjectName.
   *
   * @param commandObjectName the new commandObjectName
   */
  public void setCommandObjectName(final String commandObjectName) {
    this.commandObjectName = commandObjectName;
  }

  /**
   * Gets the commandObjectId.
   *
   * Workitem command object id, maps to workspace_id or action_id.
   *
   * @return the commandObjectId
   */
  public String getCommandObjectId() {
    return this.commandObjectId;
  }

  /**
   * Sets the commandObjectId.
   *
   * @param commandObjectId the new commandObjectId
   */
  public void setCommandObjectId(final String commandObjectId) {
    this.commandObjectId = commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String getCommandName() {
    return this.commandName;
  }

  /**
   * Sets the commandName.
   *
   * @param commandName the new commandName
   */
  public void setCommandName(final String commandName) {
    this.commandName = commandName;
  }

  /**
   * Gets the jobStatus.
   *
   * Status of Jobs.
   *
   * @return the jobStatus
   */
  public String getJobStatus() {
    return this.jobStatus;
  }

  /**
   * Sets the jobStatus.
   *
   * @param jobStatus the new jobStatus
   */
  public void setJobStatus(final String jobStatus) {
    this.jobStatus = jobStatus;
  }
}
