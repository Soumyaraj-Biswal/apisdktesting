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
 * Complete Trigger details provided by user and system generated.
 */
public class Trigger extends DynamicModel<Object> {

  /**
   * Type of the trigger.
   */
  public interface Type {
    /** action. */
    String ACTION = "action";
    /** scheduled. */
    String SCHEDULED = "scheduled";
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

  @SerializedName("name")
  protected String name;
  @SerializedName("type")
  protected String type;
  @SerializedName("description")
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("service_id")
  protected byte[] serviceId;
  @SerializedName("apikey")
  protected byte[] apikey;
  @SerializedName("location")
  protected String location;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("job_triggers")
  protected List<TriggerJob> jobTriggers;
  @SerializedName("scheduled_triggers")
  protected List<TriggerScheduled> scheduledTriggers;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("trigger_id")
  protected String triggerId;
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
  @SerializedName("last_health_checked_at")
  protected Date lastHealthCheckedAt;

  public Trigger() {
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
    private byte[] serviceId;
    private byte[] apikey;
    private String location;
    private List<String> tags;
    private List<TriggerJob> jobTriggers;
    private List<TriggerScheduled> scheduledTriggers;
    private UserState userState;
    private SystemLock sysLock;
    private Map<String, Object> dynamicProperties;

    private Builder(Trigger trigger) {
      this.name = trigger.name;
      this.type = trigger.type;
      this.description = trigger.description;
      this.resourceGroup = trigger.resourceGroup;
      this.serviceId = trigger.serviceId;
      this.apikey = trigger.apikey;
      this.location = trigger.location;
      this.tags = trigger.tags;
      this.jobTriggers = trigger.jobTriggers;
      this.scheduledTriggers = trigger.scheduledTriggers;
      this.userState = trigger.userState;
      this.sysLock = trigger.sysLock;
      this.dynamicProperties = trigger.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Trigger.
     *
     * @return the new Trigger instance
     */
    public Trigger build() {
      return new Trigger(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Trigger builder
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
     * Adds an jobTriggers to jobTriggers.
     *
     * @param jobTriggers the new jobTriggers
     * @return the Trigger builder
     */
    public Builder addJobTriggers(TriggerJob jobTriggers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(jobTriggers,
        "jobTriggers cannot be null");
      if (this.jobTriggers == null) {
        this.jobTriggers = new ArrayList<TriggerJob>();
      }
      this.jobTriggers.add(jobTriggers);
      return this;
    }

    /**
     * Adds an scheduledTriggers to scheduledTriggers.
     *
     * @param scheduledTriggers the new scheduledTriggers
     * @return the Trigger builder
     */
    public Builder addScheduledTriggers(TriggerScheduled scheduledTriggers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(scheduledTriggers,
        "scheduledTriggers cannot be null");
      if (this.scheduledTriggers == null) {
        this.scheduledTriggers = new ArrayList<TriggerScheduled>();
      }
      this.scheduledTriggers.add(scheduledTriggers);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Trigger builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Trigger builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Trigger builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Trigger builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the Trigger builder
     */
    public Builder serviceId(byte[] serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the Trigger builder
     */
    public Builder apikey(byte[] apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Trigger builder
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
     * @return the Trigger builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the jobTriggers.
     * Existing jobTriggers will be replaced.
     *
     * @param jobTriggers the jobTriggers
     * @return the Trigger builder
     */
    public Builder jobTriggers(List<TriggerJob> jobTriggers) {
      this.jobTriggers = jobTriggers;
      return this;
    }

    /**
     * Set the scheduledTriggers.
     * Existing scheduledTriggers will be replaced.
     *
     * @param scheduledTriggers the scheduledTriggers
     * @return the Trigger builder
     */
    public Builder scheduledTriggers(List<TriggerScheduled> scheduledTriggers) {
      this.scheduledTriggers = scheduledTriggers;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Trigger builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Trigger builder
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
     * @return the Trigger builder
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

  protected Trigger(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    type = builder.type;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    serviceId = builder.serviceId;
    apikey = builder.apikey;
    location = builder.location;
    tags = builder.tags;
    jobTriggers = builder.jobTriggers;
    scheduledTriggers = builder.scheduledTriggers;
    userState = builder.userState;
    sysLock = builder.sysLock;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Trigger builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the trigger.
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
   * Type of the trigger.
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
   * Trigger description.
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
   * Resource-group id for the Trigger.
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
   * Gets the serviceId.
   *
   * The id of service ID to be associated with this Trigger.
   *
   * @return the serviceId
   */
  public byte[] getServiceId() {
    return this.serviceId;
  }

  /**
   * Sets the serviceId.
   *
   * @param serviceId the new serviceId
   */
  public void setServiceId(final byte[] serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Gets the apikey.
   *
   * API Key for the Service ID.
   *
   * @return the apikey
   */
  public byte[] getApikey() {
    return this.apikey;
  }

  /**
   * Sets the apikey.
   *
   * @param apikey the new apikey
   */
  public void setApikey(final byte[] apikey) {
    this.apikey = apikey;
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
   * Schematics trigger tags.
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
   * Gets the jobTriggers.
   *
   * List of Job Triggers.
   *
   * @return the jobTriggers
   */
  public List<TriggerJob> getJobTriggers() {
    return this.jobTriggers;
  }

  /**
   * Sets the jobTriggers.
   *
   * @param jobTriggers the new jobTriggers
   */
  public void setJobTriggers(final List<TriggerJob> jobTriggers) {
    this.jobTriggers = jobTriggers;
  }

  /**
   * Gets the scheduledTriggers.
   *
   * List of Scheduled Triggers.
   *
   * @return the scheduledTriggers
   */
  public List<TriggerScheduled> getScheduledTriggers() {
    return this.scheduledTriggers;
  }

  /**
   * Sets the scheduledTriggers.
   *
   * @param scheduledTriggers the new scheduledTriggers
   */
  public void setScheduledTriggers(final List<TriggerScheduled> scheduledTriggers) {
    this.scheduledTriggers = scheduledTriggers;
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
   * Gets the triggerId.
   *
   * Id of the Schematics trigger.
   *
   * @return the triggerId
   */
  public String getTriggerId() {
    return this.triggerId;
  }

  /**
   * Gets the registeredBy.
   *
   * Name of the user who registered the Schematics trigger.
   *
   * @return the registeredBy
   */
  public String getRegisteredBy() {
    return this.registeredBy;
  }

  /**
   * Gets the registeredAt.
   *
   * Timestamp of Schematics trigger registration.
   *
   * @return the registeredAt
   */
  public Date getRegisteredAt() {
    return this.registeredAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Schematics trigger updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the Schematics trigger definition.
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
   * Gets the lastHealthCheckedAt.
   *
   * Timestamp of the last health check.
   *
   * @return the lastHealthCheckedAt
   */
  public Date getLastHealthCheckedAt() {
    return this.lastHealthCheckedAt;
  }
}
