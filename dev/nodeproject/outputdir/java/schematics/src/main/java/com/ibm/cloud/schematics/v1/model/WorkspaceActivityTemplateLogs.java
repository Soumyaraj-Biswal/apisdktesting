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
 * Information about the log URL for a job that ran for a template against your workspace.
 */
public class WorkspaceActivityTemplateLogs extends GenericModel {

  @SerializedName("log_url")
  protected String logUrl;
  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("template_type")
  protected String templateType;

  /**
   * Gets the logUrl.
   *
   * The URL to access the logs that were created during the plan, apply, or destroy job.
   *
   * @return the logUrl
   */
  public String getLogUrl() {
    return logUrl;
  }

  /**
   * Gets the templateId.
   *
   * The ID that was assigned to your Terraform template or IBM Cloud catalog software template.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return templateId;
  }

  /**
   * Gets the templateType.
   *
   * The type of template.
   *
   * @return the templateType
   */
  public String getTemplateType() {
    return templateType;
  }
}

