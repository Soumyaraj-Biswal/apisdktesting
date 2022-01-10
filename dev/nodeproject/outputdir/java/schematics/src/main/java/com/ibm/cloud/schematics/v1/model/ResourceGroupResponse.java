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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A list of resource groups that your account has access to.
 */
public class ResourceGroupResponse extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  protected String crn;
  @SerializedName("default")
  protected Boolean xDefault;
  protected String name;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;
  protected String state;

  /**
   * Gets the accountId.
   *
   * The ID of the account for which you listed the resource groups.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the crn.
   *
   * The CRN of the resource group.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the xDefault.
   *
   * If set to **true**, the resource group is used as the default resource group for your account. If set to **false**,
   * the resource group is not used as the default resource group in your account.
   *
   * @return the xDefault
   */
  public Boolean isXDefault() {
    return xDefault;
  }

  /**
   * Gets the name.
   *
   * The name of the resource group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroupId.
   *
   * The ID of the resource group.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the state.
   *
   * The state of the resource group.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }
}

