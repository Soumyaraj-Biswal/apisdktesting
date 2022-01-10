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
package com.ibm.cloud.schematics_2_0_api.v2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Workspace Job data.
 */
public class JobDataWorkspace extends DynamicModel<Object> {

  @SerializedName("workspace_name")
  protected String workspaceName;
  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("template_data")
  protected List<JobDataTemplate> templateData;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobDataWorkspace() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataWorkspace jobDataWorkspace) {
      this.workspaceName = jobDataWorkspace.workspaceName;
      this.flowId = jobDataWorkspace.flowId;
      this.flowName = jobDataWorkspace.flowName;
      this.inputs = jobDataWorkspace.inputs;
      this.outputs = jobDataWorkspace.outputs;
      this.settings = jobDataWorkspace.settings;
      this.templateData = jobDataWorkspace.templateData;
      this.updatedAt = jobDataWorkspace.updatedAt;
      this.dynamicProperties = jobDataWorkspace.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataWorkspace builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected JobDataWorkspace(Builder builder) {
    super(new TypeToken<Object>() { });
    workspaceName = builder.workspaceName;
    flowId = builder.flowId;
    flowName = builder.flowName;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    templateData = builder.templateData;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
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
  public String getWorkspaceName() {
    return this.workspaceName;
  }

  /**
   * Sets the workspaceName.
   *
   * @param workspaceName the new workspaceName
   */
  public void setWorkspaceName(final String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Gets the flowId.
   *
   * Flow Id.
   *
   * @return the flowId
   */
  public String getFlowId() {
    return this.flowId;
  }

  /**
   * Sets the flowId.
   *
   * @param flowId the new flowId
   */
  public void setFlowId(final String flowId) {
    this.flowId = flowId;
  }

  /**
   * Gets the flowName.
   *
   * Flow name.
   *
   * @return the flowName
   */
  public String getFlowName() {
    return this.flowName;
  }

  /**
   * Sets the flowName.
   *
   * @param flowName the new flowName
   */
  public void setFlowName(final String flowName) {
    this.flowName = flowName;
  }

  /**
   * Gets the inputs.
   *
   * Input variables data used by the Workspace Job.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<VariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables data from the Workspace Job.
   *
   * @return the outputs
   */
  public List<VariableData> getOutputs() {
    return this.outputs;
  }

  /**
   * Sets the outputs.
   *
   * @param outputs the new outputs
   */
  public void setOutputs(final List<VariableData> outputs) {
    this.outputs = outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by all the templates in the Workspace.
   *
   * @return the settings
   */
  public List<VariableData> getSettings() {
    return this.settings;
  }

  /**
   * Sets the settings.
   *
   * @param settings the new settings
   */
  public void setSettings(final List<VariableData> settings) {
    this.settings = settings;
  }

  /**
   * Gets the templateData.
   *
   * Input / output data of the Template in the Workspace Job.
   *
   * @return the templateData
   */
  public List<JobDataTemplate> getTemplateData() {
    return this.templateData;
  }

  /**
   * Sets the templateData.
   *
   * @param templateData the new templateData
   */
  public void setTemplateData(final List<JobDataTemplate> templateData) {
    this.templateData = templateData;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
