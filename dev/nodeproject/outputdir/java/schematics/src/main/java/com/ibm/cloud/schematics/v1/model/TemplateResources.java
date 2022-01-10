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
 * Information about the resources provisioned by the Terraform template.
 */
public class TemplateResources extends GenericModel {

  protected String folder;
  protected String id;
  @SerializedName("null_resources")
  protected List<Object> nullResources;
  @SerializedName("related_resources")
  protected List<Object> relatedResources;
  protected List<Object> resources;
  @SerializedName("resources_count")
  protected Long resourcesCount;
  @SerializedName("template_type")
  protected String templateType;

  /**
   * Gets the folder.
   *
   * The subfolder in GitHub or GitLab where your Terraform templates are stored.  If your template is stored in the
   * root directory, `.` is returned.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

  /**
   * Gets the id.
   *
   * The ID that was assigned to your Terraform template or IBM Cloud catalog software template.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the nullResources.
   *
   * List of null resources.
   *
   * @return the nullResources
   */
  public List<Object> getNullResources() {
    return nullResources;
  }

  /**
   * Gets the relatedResources.
   *
   * Information about the IBM Cloud resources that are associated with your workspace.
   *
   * @return the relatedResources
   */
  public List<Object> getRelatedResources() {
    return relatedResources;
  }

  /**
   * Gets the resources.
   *
   * Information about the IBM Cloud resources that are associated with your workspace. **Note** The `resource_tainted`
   * flag marks `true` when an instance is times out after few hours, if your resource provisioning takes longer
   * duration. When you rerun the apply plan, based on the `resource_taint` flag result the provisioning continues from
   * the state where the provisioning has stopped.
   *
   * @return the resources
   */
  public List<Object> getResources() {
    return resources;
  }

  /**
   * Gets the resourcesCount.
   *
   * Number of resources.
   *
   * @return the resourcesCount
   */
  public Long getResourcesCount() {
    return resourcesCount;
  }

  /**
   * Gets the templateType.
   *
   * The Terraform version that was used to apply your template.
   *
   * @return the templateType
   */
  public String getTemplateType() {
    return templateType;
  }
}

