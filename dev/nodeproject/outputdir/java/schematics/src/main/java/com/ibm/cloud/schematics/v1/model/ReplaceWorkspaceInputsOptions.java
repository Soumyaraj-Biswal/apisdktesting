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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceWorkspaceInputs options.
 */
public class ReplaceWorkspaceInputsOptions extends GenericModel {

  protected String wId;
  protected String tId;
  protected List<Object> envValues;
  protected String values;
  protected List<WorkspaceVariableRequest> variablestore;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String tId;
    private List<Object> envValues;
    private String values;
    private List<WorkspaceVariableRequest> variablestore;

    private Builder(ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions) {
      this.wId = replaceWorkspaceInputsOptions.wId;
      this.tId = replaceWorkspaceInputsOptions.tId;
      this.envValues = replaceWorkspaceInputsOptions.envValues;
      this.values = replaceWorkspaceInputsOptions.values;
      this.variablestore = replaceWorkspaceInputsOptions.variablestore;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param tId the tId
     */
    public Builder(String wId, String tId) {
      this.wId = wId;
      this.tId = tId;
    }

    /**
     * Builds a ReplaceWorkspaceInputsOptions.
     *
     * @return the new ReplaceWorkspaceInputsOptions instance
     */
    public ReplaceWorkspaceInputsOptions build() {
      return new ReplaceWorkspaceInputsOptions(this);
    }

    /**
     * Adds an envValues to envValues.
     *
     * @param envValues the new envValues
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder addEnvValues(Object envValues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(envValues,
        "envValues cannot be null");
      if (this.envValues == null) {
        this.envValues = new ArrayList<Object>();
      }
      this.envValues.add(envValues);
      return this;
    }

    /**
     * Adds an variablestore to variablestore.
     *
     * @param variablestore the new variablestore
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder addVariablestore(WorkspaceVariableRequest variablestore) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(variablestore,
        "variablestore cannot be null");
      if (this.variablestore == null) {
        this.variablestore = new ArrayList<WorkspaceVariableRequest>();
      }
      this.variablestore.add(variablestore);
      return this;
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the tId.
     *
     * @param tId the tId
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder tId(String tId) {
      this.tId = tId;
      return this;
    }

    /**
     * Set the envValues.
     * Existing envValues will be replaced.
     *
     * @param envValues the envValues
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder envValues(List<Object> envValues) {
      this.envValues = envValues;
      return this;
    }

    /**
     * Set the values.
     *
     * @param values the values
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder values(String values) {
      this.values = values;
      return this;
    }

    /**
     * Set the variablestore.
     * Existing variablestore will be replaced.
     *
     * @param variablestore the variablestore
     * @return the ReplaceWorkspaceInputsOptions builder
     */
    public Builder variablestore(List<WorkspaceVariableRequest> variablestore) {
      this.variablestore = variablestore;
      return this;
    }
  }

  protected ReplaceWorkspaceInputsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tId,
      "tId cannot be empty");
    wId = builder.wId;
    tId = builder.tId;
    envValues = builder.envValues;
    values = builder.values;
    variablestore = builder.variablestore;
  }

  /**
   * New builder.
   *
   * @return a ReplaceWorkspaceInputsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace for which you want to retrieve the input variables that you declared in your Terraform
   * template. To find the workspace ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the tId.
   *
   * The ID of the Terraform template for which you want to retrieve all your input variables. When you create a
   * workspace, the Terraform template that your workspace points to is assigned a unique ID. To find this ID, use the
   * `GET /v1/workspaces` API and review the `template_data.id` value.
   *
   * @return the tId
   */
  public String tId() {
    return tId;
  }

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
  public List<Object> envValues() {
    return envValues;
  }

  /**
   * Gets the values.
   *
   * User values.
   *
   * @return the values
   */
  public String values() {
    return values;
  }

  /**
   * Gets the variablestore.
   *
   * VariablesRequest -.
   *
   * @return the variablestore
   */
  public List<WorkspaceVariableRequest> variablestore() {
    return variablestore;
  }
}

