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
 * Complete Schematics Adapter details provided by user and system generated.
 */
public class Adapter extends DynamicModel<Object> {

  /**
   * Type of external schematics adapters.
   */
  public interface AdapterType {
    /** scm_adapter. */
    String SCM_ADAPTER = "scm_adapter";
    /** vault_adapter. */
    String VAULT_ADAPTER = "vault_adapter";
    /** catalog_adapter. */
    String CATALOG_ADAPTER = "catalog_adapter";
    /** workspace_data_adapter. */
    String WORKSPACE_DATA_ADAPTER = "workspace_data_adapter";
    /** provisioner_adapter. */
    String PROVISIONER_ADAPTER = "provisioner_adapter";
    /** policy_agent_adapter. */
    String POLICY_AGENT_ADAPTER = "policy_agent_adapter";
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
   * Health of the adapter.
   */
  public interface AdapterHealth {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("adapter_name")
  protected String adapterName;
  @SerializedName("adapter_type")
  protected String adapterType;
  @SerializedName("location")
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("adapter_endpoint_url")
  protected String adapterEndpointUrl;
  @SerializedName("service_id")
  protected String serviceId;
  @SerializedName("apikey")
  protected String apikey;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("ignore_inflight_operations")
  protected Boolean ignoreInflightOperations;
  @SerializedName("adapter_id")
  protected String adapterId;
  @SerializedName("registered_by")
  protected String registeredBy;
  @SerializedName("registered_at")
  protected Date registeredAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("adapter_health")
  protected String adapterHealth;
  @SerializedName("last_health_checked_at")
  protected Date lastHealthCheckedAt;

  public Adapter() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String adapterName;
    private String adapterType;
    private String location;
    private String resourceGroup;
    private List<String> tags;
    private String adapterEndpointUrl;
    private String serviceId;
    private String apikey;
    private UserState userState;
    private Boolean ignoreInflightOperations;
    private String adapterId;
    private String registeredBy;
    private Date registeredAt;
    private Date updatedAt;
    private String updatedBy;
    private SystemLock sysLock;
    private String adapterHealth;
    private Date lastHealthCheckedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(Adapter adapter) {
      this.adapterName = adapter.adapterName;
      this.adapterType = adapter.adapterType;
      this.location = adapter.location;
      this.resourceGroup = adapter.resourceGroup;
      this.tags = adapter.tags;
      this.adapterEndpointUrl = adapter.adapterEndpointUrl;
      this.serviceId = adapter.serviceId;
      this.apikey = adapter.apikey;
      this.userState = adapter.userState;
      this.ignoreInflightOperations = adapter.ignoreInflightOperations;
      this.adapterId = adapter.adapterId;
      this.registeredBy = adapter.registeredBy;
      this.registeredAt = adapter.registeredAt;
      this.updatedAt = adapter.updatedAt;
      this.updatedBy = adapter.updatedBy;
      this.sysLock = adapter.sysLock;
      this.adapterHealth = adapter.adapterHealth;
      this.lastHealthCheckedAt = adapter.lastHealthCheckedAt;
      this.dynamicProperties = adapter.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Adapter.
     *
     * @return the new Adapter instance
     */
    public Adapter build() {
      return new Adapter(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Adapter builder
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
     * Set the adapterName.
     *
     * @param adapterName the adapterName
     * @return the Adapter builder
     */
    public Builder adapterName(String adapterName) {
      this.adapterName = adapterName;
      return this;
    }

    /**
     * Set the adapterType.
     *
     * @param adapterType the adapterType
     * @return the Adapter builder
     */
    public Builder adapterType(String adapterType) {
      this.adapterType = adapterType;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Adapter builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Adapter builder
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
     * @return the Adapter builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the adapterEndpointUrl.
     *
     * @param adapterEndpointUrl the adapterEndpointUrl
     * @return the Adapter builder
     */
    public Builder adapterEndpointUrl(String adapterEndpointUrl) {
      this.adapterEndpointUrl = adapterEndpointUrl;
      return this;
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the Adapter builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the Adapter builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Adapter builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the ignoreInflightOperations.
     *
     * @param ignoreInflightOperations the ignoreInflightOperations
     * @return the Adapter builder
     */
    public Builder ignoreInflightOperations(Boolean ignoreInflightOperations) {
      this.ignoreInflightOperations = ignoreInflightOperations;
      return this;
    }

    /**
     * Set the adapterId.
     *
     * @param adapterId the adapterId
     * @return the Adapter builder
     */
    public Builder adapterId(String adapterId) {
      this.adapterId = adapterId;
      return this;
    }

    /**
     * Set the registeredBy.
     *
     * @param registeredBy the registeredBy
     * @return the Adapter builder
     */
    public Builder registeredBy(String registeredBy) {
      this.registeredBy = registeredBy;
      return this;
    }

    /**
     * Set the registeredAt.
     *
     * @param registeredAt the registeredAt
     * @return the Adapter builder
     */
    public Builder registeredAt(Date registeredAt) {
      this.registeredAt = registeredAt;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the Adapter builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Set the updatedBy.
     *
     * @param updatedBy the updatedBy
     * @return the Adapter builder
     */
    public Builder updatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Adapter builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the adapterHealth.
     *
     * @param adapterHealth the adapterHealth
     * @return the Adapter builder
     */
    public Builder adapterHealth(String adapterHealth) {
      this.adapterHealth = adapterHealth;
      return this;
    }

    /**
     * Set the lastHealthCheckedAt.
     *
     * @param lastHealthCheckedAt the lastHealthCheckedAt
     * @return the Adapter builder
     */
    public Builder lastHealthCheckedAt(Date lastHealthCheckedAt) {
      this.lastHealthCheckedAt = lastHealthCheckedAt;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Adapter builder
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

  protected Adapter(Builder builder) {
    super(new TypeToken<Object>() { });
    adapterName = builder.adapterName;
    adapterType = builder.adapterType;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    adapterEndpointUrl = builder.adapterEndpointUrl;
    serviceId = builder.serviceId;
    apikey = builder.apikey;
    userState = builder.userState;
    ignoreInflightOperations = builder.ignoreInflightOperations;
    adapterId = builder.adapterId;
    registeredBy = builder.registeredBy;
    registeredAt = builder.registeredAt;
    updatedAt = builder.updatedAt;
    updatedBy = builder.updatedBy;
    sysLock = builder.sysLock;
    adapterHealth = builder.adapterHealth;
    lastHealthCheckedAt = builder.lastHealthCheckedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Adapter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the adapterName.
   *
   * Name of the Adapter.
   *
   * @return the adapterName
   */
  public String getAdapterName() {
    return this.adapterName;
  }

  /**
   * Sets the adapterName.
   *
   * @param adapterName the new adapterName
   */
  public void setAdapterName(final String adapterName) {
    this.adapterName = adapterName;
  }

  /**
   * Gets the adapterType.
   *
   * Type of external schematics adapters.
   *
   * @return the adapterType
   */
  public String getAdapterType() {
    return this.adapterType;
  }

  /**
   * Sets the adapterType.
   *
   * @param adapterType the new adapterType
   */
  public void setAdapterType(final String adapterType) {
    this.adapterType = adapterType;
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
   * Resource-group id for the Adapter.
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
   * Adapter tags.
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
   * Gets the adapterEndpointUrl.
   *
   * Endpoint URL for the Adapter.
   *
   * @return the adapterEndpointUrl
   */
  public String getAdapterEndpointUrl() {
    return this.adapterEndpointUrl;
  }

  /**
   * Sets the adapterEndpointUrl.
   *
   * @param adapterEndpointUrl the new adapterEndpointUrl
   */
  public void setAdapterEndpointUrl(final String adapterEndpointUrl) {
    this.adapterEndpointUrl = adapterEndpointUrl;
  }

  /**
   * Gets the serviceId.
   *
   * Service-ID to connect to the Adapter; if this is not provided, Schematics will used the IAM token of the user to
   * connect to the Adapter.
   *
   * @return the serviceId
   */
  public String getServiceId() {
    return this.serviceId;
  }

  /**
   * Sets the serviceId.
   *
   * @param serviceId the new serviceId
   */
  public void setServiceId(final String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Gets the apikey.
   *
   * API Key for the Service ID.
   *
   * @return the apikey
   */
  public String getApikey() {
    return this.apikey;
  }

  /**
   * Sets the apikey.
   *
   * @param apikey the new apikey
   */
  public void setApikey(final String apikey) {
    this.apikey = apikey;
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
   * Gets the ignoreInflightOperations.
   *
   * True - Replace the Adapter definition, without waiting for completion of all inflight Schematics operations; False
   * -  Block all new Schematics operations in the Account, and wait for inflight operations to complete - before
   * changing the Adapter definition.
   *
   * @return the ignoreInflightOperations
   */
  public Boolean isIgnoreInflightOperations() {
    return this.ignoreInflightOperations;
  }

  /**
   * Sets the ignoreInflightOperations.
   *
   * @param ignoreInflightOperations the new ignoreInflightOperations
   */
  public void setIgnoreInflightOperations(final Boolean ignoreInflightOperations) {
    this.ignoreInflightOperations = ignoreInflightOperations;
  }

  /**
   * Gets the adapterId.
   *
   * Id of the Adapter.
   *
   * @return the adapterId
   */
  public String getAdapterId() {
    return this.adapterId;
  }

  /**
   * Sets the adapterId.
   *
   * @param adapterId the new adapterId
   */
  public void setAdapterId(final String adapterId) {
    this.adapterId = adapterId;
  }

  /**
   * Gets the registeredBy.
   *
   * Name of the user who registered the Adapter.
   *
   * @return the registeredBy
   */
  public String getRegisteredBy() {
    return this.registeredBy;
  }

  /**
   * Sets the registeredBy.
   *
   * @param registeredBy the new registeredBy
   */
  public void setRegisteredBy(final String registeredBy) {
    this.registeredBy = registeredBy;
  }

  /**
   * Gets the registeredAt.
   *
   * Timestamp of Adapter registration.
   *
   * @return the registeredAt
   */
  public Date getRegisteredAt() {
    return this.registeredAt;
  }

  /**
   * Sets the registeredAt.
   *
   * @param registeredAt the new registeredAt
   */
  public void setRegisteredAt(final Date registeredAt) {
    this.registeredAt = registeredAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Adapter updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the Adapter definition.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Sets the updatedBy.
   *
   * @param updatedBy the new updatedBy
   */
  public void setUpdatedBy(final String updatedBy) {
    this.updatedBy = updatedBy;
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
   * Gets the adapterHealth.
   *
   * Health of the adapter.
   *
   * @return the adapterHealth
   */
  public String getAdapterHealth() {
    return this.adapterHealth;
  }

  /**
   * Sets the adapterHealth.
   *
   * @param adapterHealth the new adapterHealth
   */
  public void setAdapterHealth(final String adapterHealth) {
    this.adapterHealth = adapterHealth;
  }

  /**
   * Gets the lastHealthCheckedAt.
   *
   * Timestamp of the last health check.
   *
   * @return the lastHealthCheckedAt
   */
  public Date getLastHealthCheckedAt() {
    return this.lastHealthCheckedAt;
  }

  /**
   * Sets the lastHealthCheckedAt.
   *
   * @param lastHealthCheckedAt the new lastHealthCheckedAt
   */
  public void setLastHealthCheckedAt(final Date lastHealthCheckedAt) {
    this.lastHealthCheckedAt = lastHealthCheckedAt;
  }
}
