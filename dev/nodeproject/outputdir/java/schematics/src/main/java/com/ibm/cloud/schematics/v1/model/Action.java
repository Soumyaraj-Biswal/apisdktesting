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
 * Complete Action details with user inputs and system generated data.
 */
public class Action extends GenericModel {

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

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
    /** cos_bucket. */
    String COS_BUCKET = "cos_bucket";
  }

  protected String name;
  protected String description;
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("command_parameter")
  protected String commandParameter;
  protected String inventory;
  protected List<VariableData> credentials;
  protected BastionResourceDefinition bastion;
  @SerializedName("bastion_credential")
  protected VariableData bastionCredential;
  @SerializedName("targets_ini")
  protected String targetsIni;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  protected String id;
  protected String crn;
  protected String account;
  @SerializedName("source_created_at")
  protected Date sourceCreatedAt;
  @SerializedName("source_created_by")
  protected String sourceCreatedBy;
  @SerializedName("source_updated_at")
  protected Date sourceUpdatedAt;
  @SerializedName("source_updated_by")
  protected String sourceUpdatedBy;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  protected ActionState state;
  @SerializedName("playbook_names")
  protected List<String> playbookNames;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private List<String> tags;
    private UserState userState;
    private String sourceReadmeUrl;
    private ExternalSource source;
    private String sourceType;
    private String commandParameter;
    private String inventory;
    private List<VariableData> credentials;
    private BastionResourceDefinition bastion;
    private VariableData bastionCredential;
    private String targetsIni;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private ActionState state;
    private SystemLock sysLock;

    private Builder(Action action) {
      this.name = action.name;
      this.description = action.description;
      this.location = action.location;
      this.resourceGroup = action.resourceGroup;
      this.tags = action.tags;
      this.userState = action.userState;
      this.sourceReadmeUrl = action.sourceReadmeUrl;
      this.source = action.source;
      this.sourceType = action.sourceType;
      this.commandParameter = action.commandParameter;
      this.inventory = action.inventory;
      this.credentials = action.credentials;
      this.bastion = action.bastion;
      this.bastionCredential = action.bastionCredential;
      this.targetsIni = action.targetsIni;
      this.inputs = action.inputs;
      this.outputs = action.outputs;
      this.settings = action.settings;
      this.state = action.state;
      this.sysLock = action.sysLock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Action.
     *
     * @return the new Action instance
     */
    public Action build() {
      return new Action(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Action builder
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
     * Adds an credentials to credentials.
     *
     * @param credentials the new credentials
     * @return the Action builder
     */
    public Builder addCredentials(VariableData credentials) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(credentials,
        "credentials cannot be null");
      if (this.credentials == null) {
        this.credentials = new ArrayList<VariableData>();
      }
      this.credentials.add(credentials);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Action builder
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
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the Action builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the Action builder
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
     * Set the name.
     *
     * @param name the name
     * @return the Action builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Action builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Action builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Action builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the Action builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Action builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the Action builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Action builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Action builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the Action builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the inventory.
     *
     * @param inventory the inventory
     * @return the Action builder
     */
    public Builder inventory(String inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * Set the credentials.
     * Existing credentials will be replaced.
     *
     * @param credentials the credentials
     * @return the Action builder
     */
    public Builder credentials(List<VariableData> credentials) {
      this.credentials = credentials;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the Action builder
     */
    public Builder bastion(BastionResourceDefinition bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the bastionCredential.
     *
     * @param bastionCredential the bastionCredential
     * @return the Action builder
     */
    public Builder bastionCredential(VariableData bastionCredential) {
      this.bastionCredential = bastionCredential;
      return this;
    }

    /**
     * Set the targetsIni.
     *
     * @param targetsIni the targetsIni
     * @return the Action builder
     */
    public Builder targetsIni(String targetsIni) {
      this.targetsIni = targetsIni;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Action builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the Action builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the Action builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the Action builder
     */
    public Builder state(ActionState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Action builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }
  }

  protected Action(Builder builder) {
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    userState = builder.userState;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    source = builder.source;
    sourceType = builder.sourceType;
    commandParameter = builder.commandParameter;
    inventory = builder.inventory;
    credentials = builder.credentials;
    bastion = builder.bastion;
    bastionCredential = builder.bastionCredential;
    targetsIni = builder.targetsIni;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    state = builder.state;
    sysLock = builder.sysLock;
  }

  /**
   * New builder.
   *
   * @return a Action builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The unique name of your action. The name can be up to 128 characters long and can include alphanumeric characters,
   * spaces, dashes, and underscores. **Example** you can use the name to stop action.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Action description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for an action.  By default, action is created in default resource group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Action tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState userState() {
    return userState;
  }

  /**
   * Gets the sourceReadmeUrl.
   *
   * URL of the `README` file, for the source URL.
   *
   * @return the sourceReadmeUrl
   */
  public String sourceReadmeUrl() {
    return sourceReadmeUrl;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name).
   *
   * @return the commandParameter
   */
  public String commandParameter() {
    return commandParameter;
  }

  /**
   * Gets the inventory.
   *
   * Target inventory record ID, used by the action or ansible playbook.
   *
   * @return the inventory
   */
  public String inventory() {
    return inventory;
  }

  /**
   * Gets the credentials.
   *
   * credentials of the Action.
   *
   * @return the credentials
   */
  public List<VariableData> credentials() {
    return credentials;
  }

  /**
   * Gets the bastion.
   *
   * Describes a bastion resource.
   *
   * @return the bastion
   */
  public BastionResourceDefinition bastion() {
    return bastion;
  }

  /**
   * Gets the bastionCredential.
   *
   * User editable variable data and system generated reference to the value.
   *
   * @return the bastionCredential
   */
  public VariableData bastionCredential() {
    return bastionCredential;
  }

  /**
   * Gets the targetsIni.
   *
   * Inventory of host and host group for the playbook in `INI` file format. For example, `"targets_ini":
   * "[webserverhost] 172.22.192.6
   *  [dbhost]
   *  172.22.192.5"`. For more information, about an inventory host group syntax, see [Inventory host
   * groups](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-inventory-host-grps).
   *
   * @return the targetsIni
   */
  public String targetsIni() {
    return targetsIni;
  }

  /**
   * Gets the inputs.
   *
   * Input variables for the Action.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the Action.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the Action.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the id.
   *
   * Action ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * Action Cloud Resource Name.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * Action account ID.
   *
   * @return the account
   */
  public String account() {
    return account;
  }

  /**
   * Gets the sourceCreatedAt.
   *
   * Action Playbook Source creation time.
   *
   * @return the sourceCreatedAt
   */
  public Date sourceCreatedAt() {
    return sourceCreatedAt;
  }

  /**
   * Gets the sourceCreatedBy.
   *
   * E-mail address of user who created the Action Playbook Source.
   *
   * @return the sourceCreatedBy
   */
  public String sourceCreatedBy() {
    return sourceCreatedBy;
  }

  /**
   * Gets the sourceUpdatedAt.
   *
   * The action playbook updation time.
   *
   * @return the sourceUpdatedAt
   */
  public Date sourceUpdatedAt() {
    return sourceUpdatedAt;
  }

  /**
   * Gets the sourceUpdatedBy.
   *
   * E-mail address of user who updated the action playbook source.
   *
   * @return the sourceUpdatedBy
   */
  public String sourceUpdatedBy() {
    return sourceUpdatedBy;
  }

  /**
   * Gets the createdAt.
   *
   * Action creation time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * E-mail address of the user who created an action.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Action updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * E-mail address of the user who updated an action.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Action.
   *
   * @return the state
   */
  public ActionState state() {
    return state;
  }

  /**
   * Gets the playbookNames.
   *
   * Playbook names retrieved from the respository.
   *
   * @return the playbookNames
   */
  public List<String> playbookNames() {
    return playbookNames;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock sysLock() {
    return sysLock;
  }
}

