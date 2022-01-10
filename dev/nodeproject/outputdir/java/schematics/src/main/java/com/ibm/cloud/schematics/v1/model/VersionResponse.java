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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Successful response when you retrieve detailed information about the IBM Cloud Schematics API.
 */
public class VersionResponse extends GenericModel {

  protected String builddate;
  protected String buildno;
  protected String commitsha;
  @SerializedName("helm_provider_version")
  protected String helmProviderVersion;
  @SerializedName("helm_version")
  protected String helmVersion;
  @SerializedName("supported_template_types")
  protected Map<String, Object> supportedTemplateTypes;
  @SerializedName("terraform_provider_version")
  protected String terraformProviderVersion;
  @SerializedName("terraform_version")
  protected String terraformVersion;

  /**
   * Gets the builddate.
   *
   * The date when the API version was built.
   *
   * @return the builddate
   */
  public String getBuilddate() {
    return builddate;
  }

  /**
   * Gets the buildno.
   *
   * The build number that the API is based on.
   *
   * @return the buildno
   */
  public String getBuildno() {
    return buildno;
  }

  /**
   * Gets the commitsha.
   *
   * The SHA value for the Git commit that represents the latest version of the API.
   *
   * @return the commitsha
   */
  public String getCommitsha() {
    return commitsha;
  }

  /**
   * Gets the helmProviderVersion.
   *
   * The Terraform Helm provider version that is used when you install Helm charts with Schematics.
   *
   * @return the helmProviderVersion
   */
  public String getHelmProviderVersion() {
    return helmProviderVersion;
  }

  /**
   * Gets the helmVersion.
   *
   * The Helm version that is used when you install Helm charts with Schematics.
   *
   * @return the helmVersion
   */
  public String getHelmVersion() {
    return helmVersion;
  }

  /**
   * Gets the supportedTemplateTypes.
   *
   * Supported template types.
   *
   * @return the supportedTemplateTypes
   */
  public Map<String, Object> getSupportedTemplateTypes() {
    return supportedTemplateTypes;
  }

  /**
   * Gets the terraformProviderVersion.
   *
   * The version of the IBM Cloud Terraform provider plug-in that is used when you apply Terraform templates with
   * Schematics.
   *
   * @return the terraformProviderVersion
   */
  public String getTerraformProviderVersion() {
    return terraformProviderVersion;
  }

  /**
   * Gets the terraformVersion.
   *
   * The Terraform version that is used when you apply Terraform templates with Schematics.
   *
   * @return the terraformVersion
   */
  public String getTerraformVersion() {
    return terraformVersion;
  }
}

