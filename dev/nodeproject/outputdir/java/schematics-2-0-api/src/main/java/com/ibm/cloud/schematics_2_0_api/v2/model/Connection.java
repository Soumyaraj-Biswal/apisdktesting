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
 * External connection definition with unique id.
 */
public class Connection extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("connection_details")
  protected ExternalSource connectionDetails;
  @SerializedName("connection_secrets")
  protected ConnectionSecret connectionSecrets;
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

  public Connection() {
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
    private ExternalSource connectionDetails;
    private ConnectionSecret connectionSecrets;
    private Map<String, Object> dynamicProperties;

    private Builder(Connection connection) {
      this.name = connection.name;
      this.description = connection.description;
      this.resourceGroup = connection.resourceGroup;
      this.tags = connection.tags;
      this.connectionDetails = connection.connectionDetails;
      this.connectionSecrets = connection.connectionSecrets;
      this.dynamicProperties = connection.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Connection.
     *
     * @return the new Connection instance
     */
    public Connection build() {
      return new Connection(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Connection builder
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
     * @return the Connection builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Connection builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Connection builder
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
     * @return the Connection builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the connectionDetails.
     *
     * @param connectionDetails the connectionDetails
     * @return the Connection builder
     */
    public Builder connectionDetails(ExternalSource connectionDetails) {
      this.connectionDetails = connectionDetails;
      return this;
    }

    /**
     * Set the connectionSecrets.
     *
     * @param connectionSecrets the connectionSecrets
     * @return the Connection builder
     */
    public Builder connectionSecrets(ConnectionSecret connectionSecrets) {
      this.connectionSecrets = connectionSecrets;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Connection builder
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

  protected Connection(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    connectionDetails = builder.connectionDetails;
    connectionSecrets = builder.connectionSecrets;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Connection builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * connection name (unique for an account).
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
   * connection description.
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
   * Resource-group id for the connection.
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
   * connection tags.
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
   * Gets the connectionDetails.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the connectionDetails
   */
  public ExternalSource getConnectionDetails() {
    return this.connectionDetails;
  }

  /**
   * Sets the connectionDetails.
   *
   * @param connectionDetails the new connectionDetails
   */
  public void setConnectionDetails(final ExternalSource connectionDetails) {
    this.connectionDetails = connectionDetails;
  }

  /**
   * Gets the connectionSecrets.
   *
   * Secrets used to connect to external source.
   *
   * @return the connectionSecrets
   */
  public ConnectionSecret getConnectionSecrets() {
    return this.connectionSecrets;
  }

  /**
   * Sets the connectionSecrets.
   *
   * @param connectionSecrets the new connectionSecrets
   */
  public void setConnectionSecrets(final ConnectionSecret connectionSecrets) {
    this.connectionSecrets = connectionSecrets;
  }

  /**
   * Gets the id.
   *
   * Generated connection id.
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
   * connection creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the connection.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * connection updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the connection.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }
}
