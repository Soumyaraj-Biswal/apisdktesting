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
 * Complete Controls definition with user input and system generated data.
 */
public class Controls extends DynamicModel<Object> {

  /**
   * Controls type.
   */
  public interface Type {
    /** it_controls. */
    String IT_CONTROLS = "it_controls";
    /** security_controls. */
    String SECURITY_CONTROLS = "security_controls";
    /** financial_controls. */
    String FINANCIAL_CONTROLS = "financial_controls";
    /** other_controls. */
    String OTHER_CONTROLS = "other_controls";
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
  @SerializedName("type")
  protected String type;
  @SerializedName("description")
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("location")
  protected String location;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("id")
  protected String id;
  @SerializedName("crn")
  protected String crn;
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
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("capsules")
  protected List<Capsule> capsules;

  public Controls() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private String description;
    private String resourceGroup;
    private String location;
    private List<String> tags;
    private String sourceReadmeUrl;
    private ExternalSource source;
    private String sourceType;
    private List<VariableData> inputs;
    private UserState userState;
    private SystemLock sysLock;
    private List<Capsule> capsules;
    private Map<String, Object> dynamicProperties;

    private Builder(Controls controls) {
      this.name = controls.name;
      this.type = controls.type;
      this.description = controls.description;
      this.resourceGroup = controls.resourceGroup;
      this.location = controls.location;
      this.tags = controls.tags;
      this.sourceReadmeUrl = controls.sourceReadmeUrl;
      this.source = controls.source;
      this.sourceType = controls.sourceType;
      this.inputs = controls.inputs;
      this.userState = controls.userState;
      this.sysLock = controls.sysLock;
      this.capsules = controls.capsules;
      this.dynamicProperties = controls.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Controls.
     *
     * @return the new Controls instance
     */
    public Controls build() {
      return new Controls(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Controls builder
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
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Controls builder
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
     * Adds an capsules to capsules.
     *
     * @param capsules the new capsules
     * @return the Controls builder
     */
    public Builder addCapsules(Capsule capsules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(capsules,
        "capsules cannot be null");
      if (this.capsules == null) {
        this.capsules = new ArrayList<Capsule>();
      }
      this.capsules.add(capsules);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Controls builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Controls builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Controls builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Controls builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Controls builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the Controls builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the Controls builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Controls builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Controls builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Controls builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Controls builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Controls builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the capsules.
     * Existing capsules will be replaced.
     *
     * @param capsules the capsules
     * @return the Controls builder
     */
    public Builder capsules(List<Capsule> capsules) {
      this.capsules = capsules;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Controls builder
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

  protected Controls(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    type = builder.type;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    location = builder.location;
    tags = builder.tags;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    source = builder.source;
    sourceType = builder.sourceType;
    inputs = builder.inputs;
    userState = builder.userState;
    sysLock = builder.sysLock;
    capsules = builder.capsules;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Controls builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Controls name (unique for an account).
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
   * Gets the type.
   *
   * Controls type.
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
   * Gets the description.
   *
   * Control description.
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
   * Resource-group name for the Controls. By default, controls will be created in Default Resource Group.
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
   * Gets the tags.
   *
   * Tags for the Controls definition.
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
   * Gets the sourceReadmeUrl.
   *
   * URL of the Readme file, for the source.
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
   * Gets the inputs.
   *
   * Input variables for the Controls.
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
   * Gets the id.
   *
   * Controls Id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the crn.
   *
   * Controls Cloud Resource Name.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Gets the sourceCreatedAt.
   *
   * Controls Source creation time.
   *
   * @return the sourceCreatedAt
   */
  public Date getSourceCreatedAt() {
    return this.sourceCreatedAt;
  }

  /**
   * Gets the sourceCreatedBy.
   *
   * Email address of user who created the Controls Source.
   *
   * @return the sourceCreatedBy
   */
  public String getSourceCreatedBy() {
    return this.sourceCreatedBy;
  }

  /**
   * Gets the sourceUpdatedAt.
   *
   * Controls Source updation time.
   *
   * @return the sourceUpdatedAt
   */
  public Date getSourceUpdatedAt() {
    return this.sourceUpdatedAt;
  }

  /**
   * Gets the sourceUpdatedBy.
   *
   * Email address of user who updated the Controls Source.
   *
   * @return the sourceUpdatedBy
   */
  public String getSourceUpdatedBy() {
    return this.sourceUpdatedBy;
  }

  /**
   * Gets the createdAt.
   *
   * Controls creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Name of user who created the controls.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Controls updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the controls.
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
   * Gets the capsules.
   *
   * List of capsules.
   *
   * @return the capsules
   */
  public List<Capsule> getCapsules() {
    return this.capsules;
  }

  /**
   * Sets the capsules.
   *
   * @param capsules the new capsules
   */
  public void setCapsules(final List<Capsule> capsules) {
    this.capsules = capsules;
  }
}
