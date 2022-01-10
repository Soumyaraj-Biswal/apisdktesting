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
 * Environment details with user inputs and system generated data.
 */
public class Environment extends DynamicModel<Object> {

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

  @SerializedName("name")
  protected String name;
  @SerializedName("schema_version")
  protected String schemaVersion;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("description")
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("location")
  protected String location;
  @SerializedName("blueprint")
  protected Blueprint blueprint;
  @SerializedName("config")
  protected List<ConfigItem> config;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("environment_id")
  protected String environmentId;
  @SerializedName("crn")
  protected String crn;
  @SerializedName("account")
  protected String account;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("user_state")
  protected EnvironmentUserState userState;
  @SerializedName("state")
  protected EnvironmentState state;

  public Environment() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String schemaVersion;
    private ExternalSource source;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String location;
    private Blueprint blueprint;
    private List<ConfigItem> config;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private List<VariableData> outputs;
    private SystemLock sysLock;
    private EnvironmentUserState userState;
    private EnvironmentState state;
    private Map<String, Object> dynamicProperties;

    private Builder(Environment environment) {
      this.name = environment.name;
      this.schemaVersion = environment.schemaVersion;
      this.source = environment.source;
      this.description = environment.description;
      this.resourceGroup = environment.resourceGroup;
      this.tags = environment.tags;
      this.location = environment.location;
      this.blueprint = environment.blueprint;
      this.config = environment.config;
      this.inputs = environment.inputs;
      this.settings = environment.settings;
      this.outputs = environment.outputs;
      this.sysLock = environment.sysLock;
      this.userState = environment.userState;
      this.state = environment.state;
      this.dynamicProperties = environment.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a Environment.
     *
     * @return the new Environment instance
     */
    public Environment build() {
      return new Environment(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Environment builder
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
     * Adds an config to config.
     *
     * @param config the new config
     * @return the Environment builder
     */
    public Builder addConfig(ConfigItem config) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(config,
        "config cannot be null");
      if (this.config == null) {
        this.config = new ArrayList<ConfigItem>();
      }
      this.config.add(config);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Environment builder
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
     * @return the Environment builder
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
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the Environment builder
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
     * Set the name.
     *
     * @param name the name
     * @return the Environment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the schemaVersion.
     *
     * @param schemaVersion the schemaVersion
     * @return the Environment builder
     */
    public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Environment builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Environment builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Environment builder
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
     * @return the Environment builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Environment builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the blueprint.
     *
     * @param blueprint the blueprint
     * @return the Environment builder
     */
    public Builder blueprint(Blueprint blueprint) {
      this.blueprint = blueprint;
      return this;
    }

    /**
     * Set the config.
     * Existing config will be replaced.
     *
     * @param config the config
     * @return the Environment builder
     */
    public Builder config(List<ConfigItem> config) {
      this.config = config;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Environment builder
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
     * @return the Environment builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the Environment builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Environment builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Environment builder
     */
    public Builder userState(EnvironmentUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the Environment builder
     */
    public Builder state(EnvironmentState state) {
      this.state = state;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Environment builder
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

  protected Environment(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    schemaVersion = builder.schemaVersion;
    source = builder.source;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    location = builder.location;
    blueprint = builder.blueprint;
    config = builder.config;
    inputs = builder.inputs;
    settings = builder.settings;
    outputs = builder.outputs;
    sysLock = builder.sysLock;
    userState = builder.userState;
    state = builder.state;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Environment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Environment name (unique for an account).
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
   * Gets the schemaVersion.
   *
   * Schema version.
   *
   * @return the schemaVersion
   */
  public String getSchemaVersion() {
    return this.schemaVersion;
  }

  /**
   * Sets the schemaVersion.
   *
   * @param schemaVersion the new schemaVersion
   */
  public void setSchemaVersion(final String schemaVersion) {
    this.schemaVersion = schemaVersion;
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
   * Gets the description.
   *
   * Environment description.
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
   * Gets the resourceGroup.
   *
   * Resource-group name for the Environment.  By default, Environment will be created in Default Resource Group.
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
   * Environment instance tags.
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
   * Gets the blueprint.
   *
   * Blueprint definition - composed of multiple workitems used to construct an Environment.
   *
   * @return the blueprint
   */
  public Blueprint getBlueprint() {
    return this.blueprint;
  }

  /**
   * Sets the blueprint.
   *
   * @param blueprint the new blueprint
   */
  public void setBlueprint(final Blueprint blueprint) {
    this.blueprint = blueprint;
  }

  /**
   * Gets the config.
   *
   * Environment configuration definition - used by the blueprint to construct an Environment.
   *
   * @return the config
   */
  public List<ConfigItem> getConfig() {
    return this.config;
  }

  /**
   * Sets the config.
   *
   * @param config the new config
   */
  public void setConfig(final List<ConfigItem> config) {
    this.config = config;
  }

  /**
   * Gets the inputs.
   *
   * Input configuration for the environment instance.
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
   * Input environment variables.
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
   * Gets the outputs.
   *
   * Output environment variables.
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
   * Gets the environmentId.
   *
   * System generated Environment Id.
   *
   * @return the environmentId
   */
  public String getEnvironmentId() {
    return this.environmentId;
  }

  /**
   * Gets the crn.
   *
   * Environment CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Gets the account.
   *
   * Account id.
   *
   * @return the account
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * Gets the createdAt.
   *
   * Environment creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * User who created the Environment.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Environment updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * User who updated the Environment.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
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

  /**
   * Gets the userState.
   *
   * User defined status of the Environment.
   *
   * @return the userState
   */
  public EnvironmentUserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final EnvironmentUserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Environment.
   *
   * @return the state
   */
  public EnvironmentState getState() {
    return this.state;
  }

  /**
   * Sets the state.
   *
   * @param state the new state
   */
  public void setState(final EnvironmentState state) {
    this.state = state;
  }
}
