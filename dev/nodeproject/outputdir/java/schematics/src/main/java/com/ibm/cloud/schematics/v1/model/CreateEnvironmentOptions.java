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
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createEnvironment options.
 */
public class CreateEnvironmentOptions extends GenericModel {

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

  protected String name;
  protected String schemaVersion;
  protected ExternalSource source;
  protected String description;
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected Blueprint blueprint;
  protected List<ConfigItem> config;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected List<VariableData> outputs;
  protected SystemLock sysLock;
  protected EnvironmentUserState userState;
  protected EnvironmentState state;

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

    private Builder(CreateEnvironmentOptions createEnvironmentOptions) {
      this.name = createEnvironmentOptions.name;
      this.schemaVersion = createEnvironmentOptions.schemaVersion;
      this.source = createEnvironmentOptions.source;
      this.description = createEnvironmentOptions.description;
      this.resourceGroup = createEnvironmentOptions.resourceGroup;
      this.tags = createEnvironmentOptions.tags;
      this.location = createEnvironmentOptions.location;
      this.blueprint = createEnvironmentOptions.blueprint;
      this.config = createEnvironmentOptions.config;
      this.inputs = createEnvironmentOptions.inputs;
      this.settings = createEnvironmentOptions.settings;
      this.outputs = createEnvironmentOptions.outputs;
      this.sysLock = createEnvironmentOptions.sysLock;
      this.userState = createEnvironmentOptions.userState;
      this.state = createEnvironmentOptions.state;
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
     * Builds a CreateEnvironmentOptions.
     *
     * @return the new CreateEnvironmentOptions instance
     */
    public CreateEnvironmentOptions build() {
      return new CreateEnvironmentOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the schemaVersion.
     *
     * @param schemaVersion the schemaVersion
     * @return the CreateEnvironmentOptions builder
     */
    public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateEnvironmentOptions builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateEnvironmentOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateEnvironmentOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the blueprint.
     *
     * @param blueprint the blueprint
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
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
     * @return the CreateEnvironmentOptions builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the CreateEnvironmentOptions builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the CreateEnvironmentOptions builder
     */
    public Builder userState(EnvironmentUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CreateEnvironmentOptions builder
     */
    public Builder state(EnvironmentState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the environment.
     *
     * @param environment the environment
     * @return the CreateEnvironmentOptions builder
     */
    public Builder environment(Environment environment) {
      this.name = environment.name();
      this.schemaVersion = environment.schemaVersion();
      this.source = environment.source();
      this.description = environment.description();
      this.resourceGroup = environment.resourceGroup();
      this.tags = environment.tags();
      this.location = environment.location();
      this.blueprint = environment.blueprint();
      this.config = environment.config();
      this.inputs = environment.inputs();
      this.settings = environment.settings();
      this.outputs = environment.outputs();
      this.sysLock = environment.sysLock();
      this.userState = environment.userState();
      this.state = environment.state();
      return this;
    }
  }

  protected CreateEnvironmentOptions(Builder builder) {
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
  }

  /**
   * New builder.
   *
   * @return a CreateEnvironmentOptions builder
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
  public String name() {
    return name;
  }

  /**
   * Gets the schemaVersion.
   *
   * Schema version.
   *
   * @return the schemaVersion
   */
  public String schemaVersion() {
    return schemaVersion;
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
   * Gets the description.
   *
   * Environment description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Environment.  By default, Environment will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Environment instance tags.
   *
   * @return the tags
   */
  public List<String> tags() {
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
  public String location() {
    return location;
  }

  /**
   * Gets the blueprint.
   *
   * Blueprint definition - composed of multiple workitems used to construct an Environment.
   *
   * @return the blueprint
   */
  public Blueprint blueprint() {
    return blueprint;
  }

  /**
   * Gets the config.
   *
   * Environment configuration definition - used by the blueprint to construct an Environment.
   *
   * @return the config
   */
  public List<ConfigItem> config() {
    return config;
  }

  /**
   * Gets the inputs.
   *
   * Input configuration for the environment instance.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Input environment variables.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the outputs.
   *
   * Output environment variables.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
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

  /**
   * Gets the userState.
   *
   * User defined status of the Environment.
   *
   * @return the userState
   */
  public EnvironmentUserState userState() {
    return userState;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Environment.
   *
   * @return the state
   */
  public EnvironmentState state() {
    return state;
  }
}

