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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the provisioning engine, state file, and runtime logs.
 */
public class TemplateRunTimeDataResponse extends GenericModel {

  @SerializedName("engine_cmd")
  protected String engineCmd;
  @SerializedName("engine_name")
  protected String engineName;
  @SerializedName("engine_version")
  protected String engineVersion;
  protected String id;
  @SerializedName("log_store_url")
  protected String logStoreUrl;
  @SerializedName("output_values")
  protected List<Object> outputValues;
  protected List<List<Object>> resources;
  @SerializedName("state_store_url")
  protected String stateStoreUrl;

  /**
   * Gets the engineCmd.
   *
   * The command that was used to apply the Terraform template or IBM Cloud catalog software template.
   *
   * @return the engineCmd
   */
  public String getEngineCmd() {
    return engineCmd;
  }

  /**
   * Gets the engineName.
   *
   * The provisioning engine that was used to apply the Terraform template or IBM Cloud catalog software template.
   *
   * @return the engineName
   */
  public String getEngineName() {
    return engineName;
  }

  /**
   * Gets the engineVersion.
   *
   * The version of the provisioning engine that was used.
   *
   * @return the engineVersion
   */
  public String getEngineVersion() {
    return engineVersion;
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
   * Gets the logStoreUrl.
   *
   * The URL to access the logs that were created during the creation, update, or deletion of your IBM Cloud resources.
   *
   * @return the logStoreUrl
   */
  public String getLogStoreUrl() {
    return logStoreUrl;
  }

  /**
   * Gets the outputValues.
   *
   * List of Output values.
   *
   * @return the outputValues
   */
  public List<Object> getOutputValues() {
    return outputValues;
  }

  /**
   * Gets the resources.
   *
   * List of resources.
   *
   * @return the resources
   */
  public List<List<Object>> getResources() {
    return resources;
  }

  /**
   * Gets the stateStoreUrl.
   *
   * The URL where the Terraform statefile (`terraform.tfstate`) is stored. You can use the statefile to find an
   * overview of IBM Cloud resources that were created by Schematics. Schematics uses the statefile as an inventory list
   * to determine future create, update, or deletion jobs.
   *
   * @return the stateStoreUrl
   */
  public String getStateStoreUrl() {
    return stateStoreUrl;
  }
}

