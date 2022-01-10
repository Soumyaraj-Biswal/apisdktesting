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
 * Complete WebHook details provided by user and system generated.
 */
public class WebHook extends DynamicModel<Object> {

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** create_environment. */
    String CREATE_ENVIRONMENT = "create_environment";
    /** put_environment. */
    String PUT_ENVIRONMENT = "put_environment";
    /** delete_environment. */
    String DELETE_ENVIRONMENT = "delete_environment";
    /** environment_init. */
    String ENVIRONMENT_INIT = "environment_init";
    /** environment_install. */
    String ENVIRONMENT_INSTALL = "environment_install";
    /** environment_uninstall. */
    String ENVIRONMENT_UNINSTALL = "environment_uninstall";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
  }

  /**
   * Type of the Schematics web-hook.
   */
  public interface HookType {
    /** hook. */
    String HOOK = "hook";
    /** callback. */
    String CALLBACK = "callback";
  }

  /**
   * List of notification points.
   */
  public interface HookSite {
    /** before. */
    String BEFORE = "before";
    /** on_error. */
    String ON_ERROR = "on_error";
    /** on_success. */
    String ON_SUCCESS = "on_success";
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

  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("hook_type")
  protected String hookType;
  @SerializedName("hook_site")
  protected String hookSite;
  @SerializedName("location")
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("hook_endpoint_url")
  protected String hookEndpointUrl;
  @SerializedName("service_id")
  protected String serviceId;
  @SerializedName("apikey")
  protected String apikey;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("ignore_inflight_operations")
  protected Boolean ignoreInflightOperations;
  @SerializedName("hook_id")
  protected String hookId;
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

  public WebHook() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String commandName;
    private String hookType;
    private String hookSite;
    private String location;
    private String resourceGroup;
    private List<String> tags;
    private String hookEndpointUrl;
    private String serviceId;
    private String apikey;
    private UserState userState;
    private Boolean ignoreInflightOperations;
    private SystemLock sysLock;
    private Map<String, Object> dynamicProperties;

    private Builder(WebHook webHook) {
      this.commandName = webHook.commandName;
      this.hookType = webHook.hookType;
      this.hookSite = webHook.hookSite;
      this.location = webHook.location;
      this.resourceGroup = webHook.resourceGroup;
      this.tags = webHook.tags;
      this.hookEndpointUrl = webHook.hookEndpointUrl;
      this.serviceId = webHook.serviceId;
      this.apikey = webHook.apikey;
      this.userState = webHook.userState;
      this.ignoreInflightOperations = webHook.ignoreInflightOperations;
      this.sysLock = webHook.sysLock;
      this.dynamicProperties = webHook.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WebHook.
     *
     * @return the new WebHook instance
     */
    public WebHook build() {
      return new WebHook(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the WebHook builder
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
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the WebHook builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the hookType.
     *
     * @param hookType the hookType
     * @return the WebHook builder
     */
    public Builder hookType(String hookType) {
      this.hookType = hookType;
      return this;
    }

    /**
     * Set the hookSite.
     *
     * @param hookSite the hookSite
     * @return the WebHook builder
     */
    public Builder hookSite(String hookSite) {
      this.hookSite = hookSite;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the WebHook builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the WebHook builder
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
     * @return the WebHook builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the hookEndpointUrl.
     *
     * @param hookEndpointUrl the hookEndpointUrl
     * @return the WebHook builder
     */
    public Builder hookEndpointUrl(String hookEndpointUrl) {
      this.hookEndpointUrl = hookEndpointUrl;
      return this;
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the WebHook builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the WebHook builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the WebHook builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the ignoreInflightOperations.
     *
     * @param ignoreInflightOperations the ignoreInflightOperations
     * @return the WebHook builder
     */
    public Builder ignoreInflightOperations(Boolean ignoreInflightOperations) {
      this.ignoreInflightOperations = ignoreInflightOperations;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the WebHook builder
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
     * @return the WebHook builder
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

  protected WebHook(Builder builder) {
    super(new TypeToken<Object>() { });
    commandName = builder.commandName;
    hookType = builder.hookType;
    hookSite = builder.hookSite;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    hookEndpointUrl = builder.hookEndpointUrl;
    serviceId = builder.serviceId;
    apikey = builder.apikey;
    userState = builder.userState;
    ignoreInflightOperations = builder.ignoreInflightOperations;
    sysLock = builder.sysLock;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a WebHook builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String getCommandName() {
    return this.commandName;
  }

  /**
   * Sets the commandName.
   *
   * @param commandName the new commandName
   */
  public void setCommandName(final String commandName) {
    this.commandName = commandName;
  }

  /**
   * Gets the hookType.
   *
   * Type of the Schematics web-hook.
   *
   * @return the hookType
   */
  public String getHookType() {
    return this.hookType;
  }

  /**
   * Sets the hookType.
   *
   * @param hookType the new hookType
   */
  public void setHookType(final String hookType) {
    this.hookType = hookType;
  }

  /**
   * Gets the hookSite.
   *
   * List of notification points.
   *
   * @return the hookSite
   */
  public String getHookSite() {
    return this.hookSite;
  }

  /**
   * Sets the hookSite.
   *
   * @param hookSite the new hookSite
   */
  public void setHookSite(final String hookSite) {
    this.hookSite = hookSite;
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
   * Resource-group id for the Schematics web-hook.
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
   * Schematics web-hook tags.
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
   * Gets the hookEndpointUrl.
   *
   * Endpoint URL for the Schematics web-hook.
   *
   * @return the hookEndpointUrl
   */
  public String getHookEndpointUrl() {
    return this.hookEndpointUrl;
  }

  /**
   * Sets the hookEndpointUrl.
   *
   * @param hookEndpointUrl the new hookEndpointUrl
   */
  public void setHookEndpointUrl(final String hookEndpointUrl) {
    this.hookEndpointUrl = hookEndpointUrl;
  }

  /**
   * Gets the serviceId.
   *
   * Service-ID to connect to the Schematics web-hook; if this is not provided, Schematics will used the IAM token of
   * the user to connect to the Hook.
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
   * True - Replace the Hook definition, without waiting for completion of all inflight Schematics operations;   False -
   * Block new Schematics operations, and wait for  the relevant inflight operations to complete - before  changing the
   * Hook definition.
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
   * Gets the hookId.
   *
   * Id of the Schematics web-hook.
   *
   * @return the hookId
   */
  public String getHookId() {
    return this.hookId;
  }

  /**
   * Gets the registeredBy.
   *
   * Name of the user who registered the Schematics web-hook.
   *
   * @return the registeredBy
   */
  public String getRegisteredBy() {
    return this.registeredBy;
  }

  /**
   * Gets the registeredAt.
   *
   * Timestamp of Schematics web-hook registration.
   *
   * @return the registeredAt
   */
  public Date getRegisteredAt() {
    return this.registeredAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Schematics web-hook updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the Schematics web-hook definition.
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
