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
 * Complete details of the Dataset record.
 */
public class Dataset extends DynamicModel<Object> {

  /**
   * Dataset types.
   */
  public interface Type {
    /** credential. */
    String CREDENTIAL = "credential";
    /** environment. */
    String ENVIRONMENT = "environment";
    /** others. */
    String OTHERS = "others";
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

  /**
   * Type of link with shared dataset repo.
   */
  public interface SourceLink {
    /** static. */
    String X_STATIC = "static";
    /** dynamic. */
    String DYNAMIC = "dynamic";
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
  @SerializedName("data")
  protected List<VariableData> data;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("source_link")
  protected String sourceLink;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("auto_propagate_change")
  protected Boolean autoPropagateChange;
  @SerializedName("dataset_id")
  protected String datasetId;
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
  @SerializedName("affected_resource_ids")
  protected List<String> affectedResourceIds;

  public Dataset() {
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
    private List<VariableData> data;
    private ExternalSource source;
    private String sourceType;
    private String sourceLink;
    private String sourceReadmeUrl;
    private UserState userState;
    private Boolean autoPropagateChange;
    private Map<String, Object> dynamicProperties;

    private Builder(Dataset dataset) {
      this.name = dataset.name;
      this.type = dataset.type;
      this.description = dataset.description;
      this.resourceGroup = dataset.resourceGroup;
      this.location = dataset.location;
      this.tags = dataset.tags;
      this.data = dataset.data;
      this.source = dataset.source;
      this.sourceType = dataset.sourceType;
      this.sourceLink = dataset.sourceLink;
      this.sourceReadmeUrl = dataset.sourceReadmeUrl;
      this.userState = dataset.userState;
      this.autoPropagateChange = dataset.autoPropagateChange;
      this.dynamicProperties = dataset.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Dataset.
     *
     * @return the new Dataset instance
     */
    public Dataset build() {
      return new Dataset(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Dataset builder
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
     * Adds an data to data.
     *
     * @param data the new data
     * @return the Dataset builder
     */
    public Builder addData(VariableData data) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(data,
        "data cannot be null");
      if (this.data == null) {
        this.data = new ArrayList<VariableData>();
      }
      this.data.add(data);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Dataset builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Dataset builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Dataset builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Dataset builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Dataset builder
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
     * @return the Dataset builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the data.
     * Existing data will be replaced.
     *
     * @param data the data
     * @return the Dataset builder
     */
    public Builder data(List<VariableData> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Dataset builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Dataset builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the sourceLink.
     *
     * @param sourceLink the sourceLink
     * @return the Dataset builder
     */
    public Builder sourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the Dataset builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Dataset builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the autoPropagateChange.
     *
     * @param autoPropagateChange the autoPropagateChange
     * @return the Dataset builder
     */
    public Builder autoPropagateChange(Boolean autoPropagateChange) {
      this.autoPropagateChange = autoPropagateChange;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Dataset builder
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

  protected Dataset(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    type = builder.type;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    location = builder.location;
    tags = builder.tags;
    data = builder.data;
    source = builder.source;
    sourceType = builder.sourceType;
    sourceLink = builder.sourceLink;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    userState = builder.userState;
    autoPropagateChange = builder.autoPropagateChange;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Dataset builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Shared dataset name (unique for an account).
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
   * Dataset types.
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
   * Shared dataset description.
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
   * Resource-group id for the shared dataset.
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
   * Shared dataset tags.
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
   * Gets the data.
   *
   * Local shared dataset.
   *
   * @return the data
   */
  public List<VariableData> getData() {
    return this.data;
  }

  /**
   * Sets the data.
   *
   * @param data the new data
   */
  public void setData(final List<VariableData> data) {
    this.data = data;
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
   * Gets the sourceLink.
   *
   * Type of link with shared dataset repo.
   *
   * @return the sourceLink
   */
  public String getSourceLink() {
    return this.sourceLink;
  }

  /**
   * Sets the sourceLink.
   *
   * @param sourceLink the new sourceLink
   */
  public void setSourceLink(final String sourceLink) {
    this.sourceLink = sourceLink;
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
   * Gets the autoPropagateChange.
   *
   * True - On successful shared dataset updation, propagate the change to all the dependent Workspaces.
   *
   * @return the autoPropagateChange
   */
  public Boolean isAutoPropagateChange() {
    return this.autoPropagateChange;
  }

  /**
   * Sets the autoPropagateChange.
   *
   * @param autoPropagateChange the new autoPropagateChange
   */
  public void setAutoPropagateChange(final Boolean autoPropagateChange) {
    this.autoPropagateChange = autoPropagateChange;
  }

  /**
   * Gets the datasetId.
   *
   * Dataset Id.
   *
   * @return the datasetId
   */
  public String getDatasetId() {
    return this.datasetId;
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
   * Dataset creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Name of user who created the shared dataset.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Dataset updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the shared dataset.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the affectedResourceIds.
   *
   * List of resouce-ids (Workspace, Action, Controls) that are impacted by the change in shared dataset values.
   *
   * @return the affectedResourceIds
   */
  public List<String> getAffectedResourceIds() {
    return this.affectedResourceIds;
  }
}
