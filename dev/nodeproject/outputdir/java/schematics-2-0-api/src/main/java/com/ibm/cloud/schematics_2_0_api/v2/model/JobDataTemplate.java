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
 * Template Job data.
 */
public class JobDataTemplate extends DynamicModel<Object> {

  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("template_name")
  protected String templateName;
  @SerializedName("flow_index")
  protected Long flowIndex;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobDataTemplate() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataTemplate jobDataTemplate) {
      this.templateId = jobDataTemplate.templateId;
      this.templateName = jobDataTemplate.templateName;
      this.flowIndex = jobDataTemplate.flowIndex;
      this.inputs = jobDataTemplate.inputs;
      this.outputs = jobDataTemplate.outputs;
      this.settings = jobDataTemplate.settings;
      this.updatedAt = jobDataTemplate.updatedAt;
      this.dynamicProperties = jobDataTemplate.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataTemplate builder
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

  protected JobDataTemplate(Builder builder) {
    super(new TypeToken<Object>() { });
    templateId = builder.templateId;
    templateName = builder.templateName;
    flowIndex = builder.flowIndex;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
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
  public String getTemplateId() {
    return this.templateId;
  }

  /**
   * Sets the templateId.
   *
   * @param templateId the new templateId
   */
  public void setTemplateId(final String templateId) {
    this.templateId = templateId;
  }

  /**
   * Gets the templateName.
   *
   * Template name.
   *
   * @return the templateName
   */
  public String getTemplateName() {
    return this.templateName;
  }

  /**
   * Sets the templateName.
   *
   * @param templateName the new templateName
   */
  public void setTemplateName(final String templateName) {
    this.templateName = templateName;
  }

  /**
   * Gets the flowIndex.
   *
   * Index of the template in the Flow.
   *
   * @return the flowIndex
   */
  public Long getFlowIndex() {
    return this.flowIndex;
  }

  /**
   * Sets the flowIndex.
   *
   * @param flowIndex the new flowIndex
   */
  public void setFlowIndex(final long flowIndex) {
    this.flowIndex = flowIndex;
  }

  /**
   * Gets the inputs.
   *
   * Job inputs used by the Templates.
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
   * Job output from the Templates.
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
   * Environment variables used by the template.
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
