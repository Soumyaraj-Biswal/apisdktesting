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
 * Template Job data.
 */
public class JobDataTemplate extends GenericModel {

  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("template_name")
  protected String templateName;
  @SerializedName("flow_index")
  protected Long flowIndex;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String templateId;
    private String templateName;
    private Long flowIndex;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private Date updatedAt;

    private Builder(JobDataTemplate jobDataTemplate) {
      this.templateId = jobDataTemplate.templateId;
      this.templateName = jobDataTemplate.templateName;
      this.flowIndex = jobDataTemplate.flowIndex;
      this.inputs = jobDataTemplate.inputs;
      this.outputs = jobDataTemplate.outputs;
      this.settings = jobDataTemplate.settings;
      this.updatedAt = jobDataTemplate.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataTemplate.
     *
     * @return the new JobDataTemplate instance
     */
    public JobDataTemplate build() {
      return new JobDataTemplate(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the JobDataTemplate builder
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
     * @return the JobDataTemplate builder
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
     * @return the JobDataTemplate builder
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
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the JobDataTemplate builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the templateName.
     *
     * @param templateName the templateName
     * @return the JobDataTemplate builder
     */
    public Builder templateName(String templateName) {
      this.templateName = templateName;
      return this;
    }

    /**
     * Set the flowIndex.
     *
     * @param flowIndex the flowIndex
     * @return the JobDataTemplate builder
     */
    public Builder flowIndex(long flowIndex) {
      this.flowIndex = flowIndex;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the JobDataTemplate builder
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
     * @return the JobDataTemplate builder
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
     * @return the JobDataTemplate builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataTemplate builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobDataTemplate(Builder builder) {
    templateId = builder.templateId;
    templateName = builder.templateName;
    flowIndex = builder.flowIndex;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobDataTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templateId.
   *
   * Template Id.
   *
   * @return the templateId
   */
  public String templateId() {
    return templateId;
  }

  /**
   * Gets the templateName.
   *
   * Template name.
   *
   * @return the templateName
   */
  public String templateName() {
    return templateName;
  }

  /**
   * Gets the flowIndex.
   *
   * Index of the template in the Flow.
   *
   * @return the flowIndex
   */
  public Long flowIndex() {
    return flowIndex;
  }

  /**
   * Gets the inputs.
   *
   * Job inputs used by the Templates.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Job output from the Templates.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by the template.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
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

