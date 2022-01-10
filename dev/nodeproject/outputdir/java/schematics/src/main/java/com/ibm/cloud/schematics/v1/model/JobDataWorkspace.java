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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workspace Job data.
 */
public class JobDataWorkspace extends GenericModel {

  @SerializedName("workspace_name")
  protected String workspaceName;
  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  @SerializedName("template_data")
  protected List<JobDataTemplate> templateData;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceName;
    private String flowId;
    private String flowName;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private List<JobDataTemplate> templateData;
    private Date updatedAt;

    private Builder(JobDataWorkspace jobDataWorkspace) {
      this.workspaceName = jobDataWorkspace.workspaceName;
      this.flowId = jobDataWorkspace.flowId;
      this.flowName = jobDataWorkspace.flowName;
      this.inputs = jobDataWorkspace.inputs;
      this.outputs = jobDataWorkspace.outputs;
      this.settings = jobDataWorkspace.settings;
      this.templateData = jobDataWorkspace.templateData;
      this.updatedAt = jobDataWorkspace.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataWorkspace.
     *
     * @return the new JobDataWorkspace instance
     */
    public JobDataWorkspace build() {
      return new JobDataWorkspace(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the JobDataWorkspace builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the JobDataWorkspace builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the JobDataWorkspace builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Adds an templateData to templateData.
     *
     * @param templateData the new templateData
     * @return the JobDataWorkspace builder
     */
    public Builder addTemplateData(JobDataTemplate templateData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templateData,
        "templateData cannot be null");
      if (this.templateData == null) {
        this.templateData = new ArrayList<JobDataTemplate>();
      }
      this.templateData.add(templateData);
      return this;
    }

    /**
     * Set the workspaceName.
     *
     * @param workspaceName the workspaceName
     * @return the JobDataWorkspace builder
     */
    public Builder workspaceName(String workspaceName) {
      this.workspaceName = workspaceName;
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the JobDataWorkspace builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the flowName.
     *
     * @param flowName the flowName
     * @return the JobDataWorkspace builder
     */
    public Builder flowName(String flowName) {
      this.flowName = flowName;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the JobDataWorkspace builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the JobDataWorkspace builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the JobDataWorkspace builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the templateData.
     * Existing templateData will be replaced.
     *
     * @param templateData the templateData
     * @return the JobDataWorkspace builder
     */
    public Builder templateData(List<JobDataTemplate> templateData) {
      this.templateData = templateData;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataWorkspace builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobDataWorkspace(Builder builder) {
    workspaceName = builder.workspaceName;
    flowId = builder.flowId;
    flowName = builder.flowName;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    templateData = builder.templateData;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobDataWorkspace builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceName.
   *
   * Workspace name.
   *
   * @return the workspaceName
   */
  public String workspaceName() {
    return workspaceName;
  }

  /**
   * Gets the flowId.
   *
   * Flow Id.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the flowName.
   *
   * Flow name.
   *
   * @return the flowName
   */
  public String flowName() {
    return flowName;
  }

  /**
   * Gets the inputs.
   *
   * Input variables data used by the Workspace Job.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables data from the Workspace Job.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by all the templates in the Workspace.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the templateData.
   *
   * Input / output data of the Template in the Workspace Job.
   *
   * @return the templateData
   */
  public List<JobDataTemplate> templateData() {
    return templateData;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

