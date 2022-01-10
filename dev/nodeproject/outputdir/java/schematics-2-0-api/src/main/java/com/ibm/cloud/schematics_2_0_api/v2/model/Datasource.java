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
 * External datasource definition.
 */
public class Datasource extends DynamicModel<Object> {

  /**
   * supported list of external services.
   */
  public interface SourceType {
    /** git. */
    String GIT = "git";
    /** ibm_cloud_cos. */
    String IBM_CLOUD_COS = "ibm_cloud_cos";
  }

  /**
   * Replication frequency.
   */
  public interface ReplicaInvalidationFrequency {
    /** hourly. */
    String HOURLY = "hourly";
    /** every_6_hours. */
    String EVERY_6_HOURS = "every_6_hours";
    /** every_12_hours. */
    String EVERY_12_HOURS = "every_12_hours";
    /** daily. */
    String DAILY = "daily";
  }

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("data_source")
  protected String dataSource;
  @SerializedName("connection")
  protected String connection;
  @SerializedName("replica_enabled")
  protected Boolean replicaEnabled;
  @SerializedName("replica_invalidation_frequency")
  protected String replicaInvalidationFrequency;
  @SerializedName("id")
  protected String id;
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

  public Datasource() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String sourceType;
    private String dataSource;
    private String connection;
    private Boolean replicaEnabled;
    private String replicaInvalidationFrequency;
    private Map<String, Object> dynamicProperties;

    private Builder(Datasource datasource) {
      this.name = datasource.name;
      this.description = datasource.description;
      this.resourceGroup = datasource.resourceGroup;
      this.tags = datasource.tags;
      this.sourceType = datasource.sourceType;
      this.dataSource = datasource.dataSource;
      this.connection = datasource.connection;
      this.replicaEnabled = datasource.replicaEnabled;
      this.replicaInvalidationFrequency = datasource.replicaInvalidationFrequency;
      this.dynamicProperties = datasource.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Datasource.
     *
     * @return the new Datasource instance
     */
    public Datasource build() {
      return new Datasource(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Datasource builder
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
     * Set the name.
     *
     * @param name the name
     * @return the Datasource builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Datasource builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Datasource builder
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
     * @return the Datasource builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Datasource builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the dataSource.
     *
     * @param dataSource the dataSource
     * @return the Datasource builder
     */
    public Builder dataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the Datasource builder
     */
    public Builder connection(String connection) {
      this.connection = connection;
      return this;
    }

    /**
     * Set the replicaEnabled.
     *
     * @param replicaEnabled the replicaEnabled
     * @return the Datasource builder
     */
    public Builder replicaEnabled(Boolean replicaEnabled) {
      this.replicaEnabled = replicaEnabled;
      return this;
    }

    /**
     * Set the replicaInvalidationFrequency.
     *
     * @param replicaInvalidationFrequency the replicaInvalidationFrequency
     * @return the Datasource builder
     */
    public Builder replicaInvalidationFrequency(String replicaInvalidationFrequency) {
      this.replicaInvalidationFrequency = replicaInvalidationFrequency;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Datasource builder
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

  protected Datasource(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    sourceType = builder.sourceType;
    dataSource = builder.dataSource;
    connection = builder.connection;
    replicaEnabled = builder.replicaEnabled;
    replicaInvalidationFrequency = builder.replicaInvalidationFrequency;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Datasource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * External data source name (unique for an account).
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
   * data source description.
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
   * Resource-group id for the data source.
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
   * data source tags.
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
   * Gets the sourceType.
   *
   * supported list of external services.
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
   * Gets the dataSource.
   *
   * source name or id like file name or object id.
   *
   * @return the dataSource
   */
  public String getDataSource() {
    return this.dataSource;
  }

  /**
   * Sets the dataSource.
   *
   * @param dataSource the new dataSource
   */
  public void setDataSource(final String dataSource) {
    this.dataSource = dataSource;
  }

  /**
   * Gets the connection.
   *
   * Named connection from settings.
   *
   * @return the connection
   */
  public String getConnection() {
    return this.connection;
  }

  /**
   * Sets the connection.
   *
   * @param connection the new connection
   */
  public void setConnection(final String connection) {
    this.connection = connection;
  }

  /**
   * Gets the replicaEnabled.
   *
   * Replicate the data locally or not.
   *
   * @return the replicaEnabled
   */
  public Boolean isReplicaEnabled() {
    return this.replicaEnabled;
  }

  /**
   * Sets the replicaEnabled.
   *
   * @param replicaEnabled the new replicaEnabled
   */
  public void setReplicaEnabled(final Boolean replicaEnabled) {
    this.replicaEnabled = replicaEnabled;
  }

  /**
   * Gets the replicaInvalidationFrequency.
   *
   * Replication frequency.
   *
   * @return the replicaInvalidationFrequency
   */
  public String getReplicaInvalidationFrequency() {
    return this.replicaInvalidationFrequency;
  }

  /**
   * Sets the replicaInvalidationFrequency.
   *
   * @param replicaInvalidationFrequency the new replicaInvalidationFrequency
   */
  public void setReplicaInvalidationFrequency(final String replicaInvalidationFrequency) {
    this.replicaInvalidationFrequency = replicaInvalidationFrequency;
  }

  /**
   * Gets the id.
   *
   * Generated datasource id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the account.
   *
   * account id.
   *
   * @return the account
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * Gets the createdAt.
   *
   * datasource creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the datasource.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * datasource updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the datasource.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }
}
