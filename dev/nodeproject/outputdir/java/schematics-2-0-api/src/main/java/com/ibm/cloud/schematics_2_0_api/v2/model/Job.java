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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Complete Job with user inputs and system generated data.
 */
public class Job extends DynamicModel<Object> {

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

  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("command_parameter")
  protected String commandParameter;
  @SerializedName("command_options")
  protected List<String> commandOptions;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("id")
  protected String id;
  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("location")
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("submitted_at")
  protected Date submittedAt;
  @SerializedName("submitted_by")
  protected String submittedBy;
  @SerializedName("start_at")
  protected Date startAt;
  @SerializedName("end_at")
  protected Date endAt;
  @SerializedName("duration")
  protected String duration;
  @SerializedName("status")
  protected JobStatus status;
  @SerializedName("data")
  protected JobData data;
  @SerializedName("bastion")
  protected BastionResourceDefinition bastion;
  @SerializedName("log_summary")
  protected JobLogSummary logSummary;
  @SerializedName("log_store_url")
  protected String logStoreUrl;
  @SerializedName("state_store_url")
  protected String stateStoreUrl;
  @SerializedName("results_url")
  protected String resultsUrl;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public Job() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String commandObject;
    private String commandObjectId;
    private String commandName;
    private String commandParameter;
    private List<String> commandOptions;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private List<String> tags;
    private String location;
    private JobStatus status;
    private JobData data;
    private BastionResourceDefinition bastion;
    private JobLogSummary logSummary;
    private Map<String, Object> dynamicProperties;

    private Builder(Job job) {
      this.commandObject = job.commandObject;
      this.commandObjectId = job.commandObjectId;
      this.commandName = job.commandName;
      this.commandParameter = job.commandParameter;
      this.commandOptions = job.commandOptions;
      this.inputs = job.inputs;
      this.settings = job.settings;
      this.tags = job.tags;
      this.location = job.location;
      this.status = job.status;
      this.data = job.data;
      this.bastion = job.bastion;
      this.logSummary = job.logSummary;
      this.dynamicProperties = job.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Job.
     *
     * @return the new Job instance
     */
    public Job build() {
      return new Job(this);
    }

    /**
     * Adds an commandOptions to commandOptions.
     *
     * @param commandOptions the new commandOptions
     * @return the Job builder
     */
    public Builder addCommandOptions(String commandOptions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(commandOptions,
        "commandOptions cannot be null");
      if (this.commandOptions == null) {
        this.commandOptions = new ArrayList<String>();
      }
      this.commandOptions.add(commandOptions);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Job builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the Job builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Job builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the commandObject.
     *
     * @param commandObject the commandObject
     * @return the Job builder
     */
    public Builder commandObject(String commandObject) {
      this.commandObject = commandObject;
      return this;
    }

    /**
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the Job builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the Job builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the Job builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the commandOptions.
     * Existing commandOptions will be replaced.
     *
     * @param commandOptions the commandOptions
     * @return the Job builder
     */
    public Builder commandOptions(List<String> commandOptions) {
      this.commandOptions = commandOptions;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Job builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the Job builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the Job builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Job builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the Job builder
     */
    public Builder status(JobStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the Job builder
     */
    public Builder data(JobData data) {
      this.data = data;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the Job builder
     */
    public Builder bastion(BastionResourceDefinition bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the logSummary.
     *
     * @param logSummary the logSummary
     * @return the Job builder
     */
    public Builder logSummary(JobLogSummary logSummary) {
      this.logSummary = logSummary;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Job builder
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

  protected Job(Builder builder) {
    super(new TypeToken<Object>() { });
    commandObject = builder.commandObject;
    commandObjectId = builder.commandObjectId;
    commandName = builder.commandName;
    commandParameter = builder.commandParameter;
    commandOptions = builder.commandOptions;
    inputs = builder.inputs;
    settings = builder.settings;
    tags = builder.tags;
    location = builder.location;
    status = builder.status;
    data = builder.data;
    bastion = builder.bastion;
    logSummary = builder.logSummary;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Job builder
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
   * Gets the commandObjectId.
   *
   * Job command object id (workspace-id, action-id).
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
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name).
   *
   * @return the commandParameter
   */
  public String getCommandParameter() {
    return this.commandParameter;
  }

  /**
   * Sets the commandParameter.
   *
   * @param commandParameter the new commandParameter
   */
  public void setCommandParameter(final String commandParameter) {
    this.commandParameter = commandParameter;
  }

  /**
   * Gets the commandOptions.
   *
   * Command line options for the command.
   *
   * @return the commandOptions
   */
  public List<String> getCommandOptions() {
    return this.commandOptions;
  }

  /**
   * Sets the commandOptions.
   *
   * @param commandOptions the new commandOptions
   */
  public void setCommandOptions(final List<String> commandOptions) {
    this.commandOptions = commandOptions;
  }

  /**
   * Gets the inputs.
   *
   * Job inputs used by Action or Workspace.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<VariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by the Job while performing Action or Workspace.
   *
   * @return the settings
   */
  public List<VariableData> getSettings() {
    return this.settings;
  }

  /**
   * Sets the settings.
   *
   * @param settings the new settings
   */
  public void setSettings(final List<VariableData> settings) {
    this.settings = settings;
  }

  /**
   * Gets the tags.
   *
   * User defined tags, while running the job.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return this.tags;
  }

  /**
   * Sets the tags.
   *
   * @param tags the new tags
   */
  public void setTags(final List<String> tags) {
    this.tags = tags;
  }

  /**
   * Gets the id.
   *
   * Job ID.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the name.
   *
   * Job name, uniquely derived from the related Workspace or Action.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the description.
   *
   * The description of your job is derived from the related action or workspace.  The description can be up to 2048
   * characters long in size.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
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
    return this.location;
  }

  /**
   * Sets the location.
   *
   * @param location the new location
   */
  public void setLocation(final String location) {
    this.location = location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name derived from the related Workspace or Action.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Gets the submittedAt.
   *
   * Job submission time.
   *
   * @return the submittedAt
   */
  public Date getSubmittedAt() {
    return this.submittedAt;
  }

  /**
   * Gets the submittedBy.
   *
   * Email address of user who submitted the job.
   *
   * @return the submittedBy
   */
  public String getSubmittedBy() {
    return this.submittedBy;
  }

  /**
   * Gets the startAt.
   *
   * Job start time.
   *
   * @return the startAt
   */
  public Date getStartAt() {
    return this.startAt;
  }

  /**
   * Gets the endAt.
   *
   * Job end time.
   *
   * @return the endAt
   */
  public Date getEndAt() {
    return this.endAt;
  }

  /**
   * Gets the duration.
   *
   * Duration of job execution; example 40 sec.
   *
   * @return the duration
   */
  public String getDuration() {
    return this.duration;
  }

  /**
   * Gets the status.
   *
   * Job Status.
   *
   * @return the status
   */
  public JobStatus getStatus() {
    return this.status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(final JobStatus status) {
    this.status = status;
  }

  /**
   * Gets the data.
   *
   * Job data.
   *
   * @return the data
   */
  public JobData getData() {
    return this.data;
  }

  /**
   * Sets the data.
   *
   * @param data the new data
   */
  public void setData(final JobData data) {
    this.data = data;
  }

  /**
   * Gets the bastion.
   *
   * Describes a bastion resource.
   *
   * @return the bastion
   */
  public BastionResourceDefinition getBastion() {
    return this.bastion;
  }

  /**
   * Sets the bastion.
   *
   * @param bastion the new bastion
   */
  public void setBastion(final BastionResourceDefinition bastion) {
    this.bastion = bastion;
  }

  /**
   * Gets the logSummary.
   *
   * Job log summary record.
   *
   * @return the logSummary
   */
  public JobLogSummary getLogSummary() {
    return this.logSummary;
  }

  /**
   * Sets the logSummary.
   *
   * @param logSummary the new logSummary
   */
  public void setLogSummary(final JobLogSummary logSummary) {
    this.logSummary = logSummary;
  }

  /**
   * Gets the logStoreUrl.
   *
   * Job log store URL.
   *
   * @return the logStoreUrl
   */
  public String getLogStoreUrl() {
    return this.logStoreUrl;
  }

  /**
   * Gets the stateStoreUrl.
   *
   * Job state store URL.
   *
   * @return the stateStoreUrl
   */
  public String getStateStoreUrl() {
    return this.stateStoreUrl;
  }

  /**
   * Gets the resultsUrl.
   *
   * Job results store URL.
   *
   * @return the resultsUrl
   */
  public String getResultsUrl() {
    return this.resultsUrl;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }
}
