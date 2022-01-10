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
 * Response with the template details in your workspace.
 */
public class WorkspaceTemplateValuesResponse extends GenericModel {

  @SerializedName("runtime_data")
  protected List<TemplateRunTimeDataResponse> runtimeData;
  @SerializedName("shared_data")
  protected SharedTargetData sharedData;
  @SerializedName("template_data")
  protected List<TemplateSourceDataResponse> templateData;

  /**
   * Gets the runtimeData.
   *
   * Information about the provisioning engine, state file, and runtime logs.
   *
   * @return the runtimeData
   */
  public List<TemplateRunTimeDataResponse> getRuntimeData() {
    return runtimeData;
  }

  /**
   * Gets the sharedData.
   *
   * Information about the Target used by the templates originating from the  IBM Cloud catalog offerings. This
   * information is not relevant for workspace created using your own Terraform template.
   *
   * @return the sharedData
   */
  public SharedTargetData getSharedData() {
    return sharedData;
  }

  /**
   * Gets the templateData.
   *
   * Information about the input variables that are used in the template.
   *
   * @return the templateData
   */
  public List<TemplateSourceDataResponse> getTemplateData() {
    return templateData;
  }
}

