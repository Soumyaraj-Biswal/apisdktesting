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
 * Complete Template definition with user inputs and system generated data.
 */
public class Template extends DynamicModel<Object> {

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
  @SerializedName("type")
  protected String type;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("inventory")
  protected String inventory;
  @SerializedName("id")
  protected String id;
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
  @SerializedName("status")
  protected JobStatusTemplate status;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;

  public Template() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String type;
    private UserState userState;
    private String sourceType;
    private ExternalSource source;
    private String sourceReadmeUrl;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private String inventory;
    private JobStatusTemplate status;
    private SystemLock sysLock;
    private Map<String, Object> dynamicProperties;

    private Builder(Template template) {
      this.name = template.name;
      this.description = template.description;
      this.type = template.type;
      this.userState = template.userState;
      this.sourceType = template.sourceType;
      this.source = template.source;
      this.sourceReadmeUrl = template.sourceReadmeUrl;
      this.inputs = template.inputs;
      this.outputs = template.outputs;
      this.settings = template.settings;
      this.inventory = template.inventory;
      this.status = template.status;
      this.sysLock = template.sysLock;
      this.dynamicProperties = template.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Template.
     *
     * @return the new Template instance
     */
    public Template build() {
      return new Template(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Template builder
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
     * @return the Template builder
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
     * @return the Template builder
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
     * @return the Template builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Template builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Template builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Template builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Template builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Template builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the Template builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Template builder
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
     * @return the Template builder
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
     * @return the Template builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the inventory.
     *
     * @param inventory the inventory
     * @return the Template builder
     */
    public Builder inventory(String inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the Template builder
     */
    public Builder status(JobStatusTemplate status) {
      this.status = status;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Template builder
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
     * @return the Template builder
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

  protected Template(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    type = builder.type;
    userState = builder.userState;
    sourceType = builder.sourceType;
    source = builder.source;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    inventory = builder.inventory;
    status = builder.status;
    sysLock = builder.sysLock;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Template builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the template. Should be unique within a workspace.
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
   * Template description.
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
   * Gets the type.
   *
   * Template type.  Ex: terraform_v0.11, terraform_v0.12, ansible.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
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
   * Gets the sourceReadmeUrl.
   *
   * URL of the README file, for the source.
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
   * Gets the inputs.
   *
   * Input variables for the Template.
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
   * Output variables from the Template.
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
   * Environment variables used by the template.
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
   * Gets the inventory.
   *
   * Target inventory record ID used by the template to deploy the resources.
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
   * Gets the id.
   *
   * template ID generated by the system.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the sourceCreatedAt.
   *
   * Template Source creation time.
   *
   * @return the sourceCreatedAt
   */
  public Date getSourceCreatedAt() {
    return this.sourceCreatedAt;
  }

  /**
   * Gets the sourceCreatedBy.
   *
   * Email address of user who created the Template Source.
   *
   * @return the sourceCreatedBy
   */
  public String getSourceCreatedBy() {
    return this.sourceCreatedBy;
  }

  /**
   * Gets the sourceUpdatedAt.
   *
   * Template Source updation time.
   *
   * @return the sourceUpdatedAt
   */
  public Date getSourceUpdatedAt() {
    return this.sourceUpdatedAt;
  }

  /**
   * Gets the sourceUpdatedBy.
   *
   * Email address of user who updated the Template Source.
   *
   * @return the sourceUpdatedBy
   */
  public String getSourceUpdatedBy() {
    return this.sourceUpdatedBy;
  }

  /**
   * Gets the createdAt.
   *
   * Template creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the template.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Template updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the template.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the status.
   *
   * Template Job Status.
   *
   * @return the status
   */
  public JobStatusTemplate getStatus() {
    return this.status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(final JobStatusTemplate status) {
    this.status = status;
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
