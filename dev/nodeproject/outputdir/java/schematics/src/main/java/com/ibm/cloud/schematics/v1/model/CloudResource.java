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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Cloud resource data.
 */
public class CloudResource extends GenericModel {

  @SerializedName("resource_id")
  protected String resourceId;
  @SerializedName("cloud_resource_name")
  protected String cloudResourceName;
  @SerializedName("terraform_resource_name")
  protected String terraformResourceName;
  protected String crn;
  @SerializedName("resource_state")
  protected String resourceState;
  protected List<String> tags;

  /**
   * Gets the resourceId.
   *
   * Cloud resource id.
   *
   * @return the resourceId
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Gets the cloudResourceName.
   *
   * Cloud resource name.
   *
   * @return the cloudResourceName
   */
  public String getCloudResourceName() {
    return cloudResourceName;
  }

  /**
   * Gets the terraformResourceName.
   *
   * Terraform cloud resource name.
   *
   * @return the terraformResourceName
   */
  public String getTerraformResourceName() {
    return terraformResourceName;
  }

  /**
   * Gets the crn.
   *
   * Cloud resource CRN (if applicable).
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the resourceState.
   *
   * State of the Cloud resource.
   *
   * @return the resourceState
   */
  public String getResourceState() {
    return resourceState;
  }

  /**
   * Gets the tags.
   *
   * Cloud resource tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }
}

