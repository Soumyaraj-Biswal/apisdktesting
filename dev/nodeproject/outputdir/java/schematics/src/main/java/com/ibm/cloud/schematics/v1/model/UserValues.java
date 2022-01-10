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
 * UserValues -.
 */
public class UserValues extends GenericModel {

  @SerializedName("env_values")
  protected List<Object> envValues;
  protected String values;
  protected List<WorkspaceVariableResponse> variablestore;

  /**
   * Gets the envValues.
   *
   * A list of environment variables that you want to apply during the execution of a bash script or Terraform job. This
   * field must be provided as a list of key-value pairs, for example, **TF_LOG=debug**. Each entry will be a map with
   * one entry where `key is the environment variable name and value is value`. You can define environment variables for
   * IBM Cloud catalog offerings that are provisioned by using a bash script. See [example to use special environment
   * variable](https://cloud.ibm.com/docs/schematics?topic=schematics-set-parallelism#parallelism-example)  that are
   * supported by Schematics.
   *
   * @return the envValues
   */
  public List<Object> getEnvValues() {
    return envValues;
  }

  /**
   * Gets the values.
   *
   * User values.
   *
   * @return the values
   */
  public String getValues() {
    return values;
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

