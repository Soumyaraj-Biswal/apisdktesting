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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Cart order summary profile.
 */
public class CartOrderLite extends DynamicModel<Object> {

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
  @SerializedName("description")
  protected String description;
  @SerializedName("service_name")
  protected String serviceName;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("location")
  protected String location;
  @SerializedName("id")
  protected String id;
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
  protected CartOrderUserState userState;
  @SerializedName("state")
  protected CartOrderLiteState state;

  public CartOrderLite() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the name.
   *
   * Cart order name (unique for an account).
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the description.
   *
   * Cart order description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Gets the serviceName.
   *
   * Service short name.
   *
   * @return the serviceName
   */
  public String getServiceName() {
    return this.serviceName;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Cart order.  By default, Cart order will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Cart order tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return this.tags;
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
   * Gets the id.
   *
   * System generated cart order Id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the crn.
   *
   * Cart order CRN.
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
   * Cart order creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the Cart order.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Cart order updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the Cart order.
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
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public CartOrderUserState getUserState() {
    return this.userState;
  }

  /**
   * Gets the state.
   *
   * Computed state of the CartOrder.
   *
   * @return the state
   */
  public CartOrderLiteState getState() {
    return this.state;
  }
}
