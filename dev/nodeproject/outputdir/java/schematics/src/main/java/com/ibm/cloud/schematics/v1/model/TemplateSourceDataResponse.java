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
 * Information about the input variables that are used in the template.
 */
public class TemplateSourceDataResponse extends GenericModel {

  @SerializedName("env_values")
  protected List<EnvVariableResponse> envValues;
  protected String folder;
  protected Boolean compact;
  @SerializedName("has_githubtoken")
  protected Boolean hasGithubtoken;
  protected String id;
  protected String type;
  @SerializedName("uninstall_script_name")
  protected String uninstallScriptName;
  protected String values;
  @SerializedName("values_metadata")
  protected List<Object> valuesMetadata;
  @SerializedName("values_url")
  protected String valuesUrl;
  protected List<WorkspaceVariableResponse> variablestore;

  /**
   * Gets the envValues.
   *
   * List of environment values.
   *
   * @return the envValues
   */
  public List<EnvVariableResponse> getEnvValues() {
    return envValues;
  }

  /**
   * Gets the folder.
   *
   * The subfolder in your GitHub or GitLab repository where your Terraform template is stored. If your template is
   * stored in the root directory, `.` is returned.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

  /**
   * Gets the compact.
   *
   * True, to use the files from the specified folder &amp; subfolder in your GitHub or GitLab repository and ignore the
   * other folders in the repository.
   *
   * @return the compact
   */
  public Boolean isCompact() {
    return compact;
  }

  /**
   * Gets the hasGithubtoken.
   *
   * Has github token.
   *
   * @return the hasGithubtoken
   */
  public Boolean isHasGithubtoken() {
    return hasGithubtoken;
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
   * Gets the type.
   *
   * The Terraform version that was used to run your Terraform code.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the uninstallScriptName.
   *
   * Uninstall script name.
   *
   * @return the uninstallScriptName
   */
  public String getUninstallScriptName() {
    return uninstallScriptName;
  }

  /**
   * Gets the values.
   *
   * A list of variable values that you want to apply during the Helm chart installation. The list must be provided in
   * JSON format, such as `"autoscaling: enabled: true minReplicas: 2"`. The values that you define here override the
   * default Helm chart values. This field is supported only for IBM Cloud catalog offerings that are provisioned by
   * using the Terraform Helm provider.
   *
   * @return the values
   */
  public String getValues() {
    return values;
  }

  /**
   * Gets the valuesMetadata.
   *
   * A list of input variables that are associated with the workspace.
   *
   * @return the valuesMetadata
   */
  public List<Object> getValuesMetadata() {
    return valuesMetadata;
  }

  /**
   * Gets the valuesUrl.
   *
   * The API endpoint to access the input variables that you defined for your template.
   *
   * @return the valuesUrl
   */
  public String getValuesUrl() {
    return valuesUrl;
  }

  /**
   * Gets the variablestore.
   *
   * Information about the input variables that your template uses.
   *
   * @return the variablestore
   */
  public List<WorkspaceVariableResponse> getVariablestore() {
    return variablestore;
  }
}

