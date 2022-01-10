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
 * Complete Action details with user inputs and system generated data.
 */
public class Action extends DynamicModel<Object> {

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

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("location")
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("command_parameter")
  protected String commandParameter;
  @SerializedName("inventory")
  protected String inventory;
  @SerializedName("credentials")
  protected List<VariableData> credentials;
  @SerializedName("bastion")
  protected BastionResourceDefinition bastion;
  @SerializedName("bastion_credential")
  protected VariableData bastionCredential;
  @SerializedName("targets_ini")
  protected String targetsIni;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("id")
  protected String id;
  @SerializedName("crn")
  protected String crn;
  @SerializedName("account")
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
  @SerializedName("state")
  protected ActionState state;
  @SerializedName("playbook_names")
  protected List<String> playbookNames;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;

  public Action() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

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
      this.dynamicProperties = action.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Action builder
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

  protected Action(Builder builder) {
    super(new TypeToken<Object>() { });
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
    this.setProperties(builder.dynamicProperties);
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
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the description.
   *
   * Action description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
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
   * Resource-group name for an action.  By default, action is created in default resource group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Sets the resourceGroup.
   *
   * @param resourceGroup the new resourceGroup
   */
  public void setResourceGroup(final String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Action tags.
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
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final UserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the sourceReadmeUrl.
   *
   * URL of the `README` file, for the source URL.
   *
   * @return the sourceReadmeUrl
   */
  public String getSourceReadmeUrl() {
    return this.sourceReadmeUrl;
  }

  /**
   * Sets the sourceReadmeUrl.
   *
   * @param sourceReadmeUrl the new sourceReadmeUrl
   */
  public void setSourceReadmeUrl(final String sourceReadmeUrl) {
    this.sourceReadmeUrl = sourceReadmeUrl;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource getSource() {
    return this.source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final ExternalSource source) {
    this.source = source;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String getSourceType() {
    return this.sourceType;
  }

  /**
   * Sets the sourceType.
   *
   * @param sourceType the new sourceType
   */
  public void setSourceType(final String sourceType) {
    this.sourceType = sourceType;
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
   * Gets the inventory.
   *
   * Target inventory record ID, used by the action or ansible playbook.
   *
   * @return the inventory
   */
  public String getInventory() {
    return this.inventory;
  }

  /**
   * Sets the inventory.
   *
   * @param inventory the new inventory
   */
  public void setInventory(final String inventory) {
    this.inventory = inventory;
  }

  /**
   * Gets the credentials.
   *
   * credentials of the Action.
   *
   * @return the credentials
   */
  public List<VariableData> getCredentials() {
    return this.credentials;
  }

  /**
   * Sets the credentials.
   *
   * @param credentials the new credentials
   */
  public void setCredentials(final List<VariableData> credentials) {
    this.credentials = credentials;
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
   * Gets the bastionCredential.
   *
   * User editable variable data and system generated reference to the value.
   *
   * @return the bastionCredential
   */
  public VariableData getBastionCredential() {
    return this.bastionCredential;
  }

  /**
   * Sets the bastionCredential.
   *
   * @param bastionCredential the new bastionCredential
   */
  public void setBastionCredential(final VariableData bastionCredential) {
    this.bastionCredential = bastionCredential;
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
  public String getTargetsIni() {
    return this.targetsIni;
  }

  /**
   * Sets the targetsIni.
   *
   * @param targetsIni the new targetsIni
   */
  public void setTargetsIni(final String targetsIni) {
    this.targetsIni = targetsIni;
  }

  /**
   * Gets the inputs.
   *
   * Input variables for the Action.
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
   * Gets the outputs.
   *
   * Output variables for the Action.
   *
   * @return the outputs
   */
  public List<VariableData> getOutputs() {
    return this.outputs;
  }

  /**
   * Sets the outputs.
   *
   * @param outputs the new outputs
   */
  public void setOutputs(final List<VariableData> outputs) {
    this.outputs = outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the Action.
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
   * Gets the id.
   *
   * Action ID.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the crn.
   *
   * Action Cloud Resource Name.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Gets the account.
   *
   * Action account ID.
   *
   * @return the account
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * Gets the sourceCreatedAt.
   *
   * Action Playbook Source creation time.
   *
   * @return the sourceCreatedAt
   */
  public Date getSourceCreatedAt() {
    return this.sourceCreatedAt;
  }

  /**
   * Gets the sourceCreatedBy.
   *
   * E-mail address of user who created the Action Playbook Source.
   *
   * @return the sourceCreatedBy
   */
  public String getSourceCreatedBy() {
    return this.sourceCreatedBy;
  }

  /**
   * Gets the sourceUpdatedAt.
   *
   * The action playbook updation time.
   *
   * @return the sourceUpdatedAt
   */
  public Date getSourceUpdatedAt() {
    return this.sourceUpdatedAt;
  }

  /**
   * Gets the sourceUpdatedBy.
   *
   * E-mail address of user who updated the action playbook source.
   *
   * @return the sourceUpdatedBy
   */
  public String getSourceUpdatedBy() {
    return this.sourceUpdatedBy;
  }

  /**
   * Gets the createdAt.
   *
   * Action creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * E-mail address of the user who created an action.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Action updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * E-mail address of the user who updated an action.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Action.
   *
   * @return the state
   */
  public ActionState getState() {
    return this.state;
  }

  /**
   * Sets the state.
   *
   * @param state the new state
   */
  public void setState(final ActionState state) {
    this.state = state;
  }

  /**
   * Gets the playbookNames.
   *
   * Playbook names retrieved from the respository.
   *
   * @return the playbookNames
   */
  public List<String> getPlaybookNames() {
    return this.playbookNames;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return this.sysLock;
  }

  /**
   * Sets the sysLock.
   *
   * @param sysLock the new sysLock
   */
  public void setSysLock(final SystemLock sysLock) {
    this.sysLock = sysLock;
  }
}
