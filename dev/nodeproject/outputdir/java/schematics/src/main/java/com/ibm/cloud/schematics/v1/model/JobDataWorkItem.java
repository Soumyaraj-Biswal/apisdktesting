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
 * Environment work items.
 */
public class JobDataWorkItem extends GenericModel {

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
    /** cos_bucket. */
    String COS_BUCKET = "cos_bucket";
  }

  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_object_name")
  protected String commandObjectName;
  protected String layers;
  @SerializedName("source_type")
  protected String sourceType;
  protected ExternalSource source;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  @SerializedName("last_job")
  protected JobDataWorkItemLastJob lastJob;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String commandObjectId;
    private String commandObjectName;
    private String layers;
    private String sourceType;
    private ExternalSource source;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private JobDataWorkItemLastJob lastJob;
    private Date updatedAt;

    private Builder(JobDataWorkItem jobDataWorkItem) {
      this.commandObjectId = jobDataWorkItem.commandObjectId;
      this.commandObjectName = jobDataWorkItem.commandObjectName;
      this.layers = jobDataWorkItem.layers;
      this.sourceType = jobDataWorkItem.sourceType;
      this.source = jobDataWorkItem.source;
      this.inputs = jobDataWorkItem.inputs;
      this.outputs = jobDataWorkItem.outputs;
      this.settings = jobDataWorkItem.settings;
      this.lastJob = jobDataWorkItem.lastJob;
      this.updatedAt = jobDataWorkItem.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataWorkItem.
     *
     * @return the new JobDataWorkItem instance
     */
    public JobDataWorkItem build() {
      return new JobDataWorkItem(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the JobDataWorkItem builder
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
     * @return the JobDataWorkItem builder
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
     * @return the JobDataWorkItem builder
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
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the JobDataWorkItem builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandObjectName.
     *
     * @param commandObjectName the commandObjectName
     * @return the JobDataWorkItem builder
     */
    public Builder commandObjectName(String commandObjectName) {
      this.commandObjectName = commandObjectName;
      return this;
    }

    /**
     * Set the layers.
     *
     * @param layers the layers
     * @return the JobDataWorkItem builder
     */
    public Builder layers(String layers) {
      this.layers = layers;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the JobDataWorkItem builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the JobDataWorkItem builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the JobDataWorkItem builder
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
     * @return the JobDataWorkItem builder
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
     * @return the JobDataWorkItem builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the lastJob.
     *
     * @param lastJob the lastJob
     * @return the JobDataWorkItem builder
     */
    public Builder lastJob(JobDataWorkItemLastJob lastJob) {
      this.lastJob = lastJob;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataWorkItem builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobDataWorkItem(Builder builder) {
    commandObjectId = builder.commandObjectId;
    commandObjectName = builder.commandObjectName;
    layers = builder.layers;
    sourceType = builder.sourceType;
    source = builder.source;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    lastJob = builder.lastJob;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobDataWorkItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commandObjectId.
   *
   * command object id.
   *
   * @return the commandObjectId
   */
  public String commandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandObjectName.
   *
   * command object name.
   *
   * @return the commandObjectName
   */
  public String commandObjectName() {
    return commandObjectName;
  }

  /**
   * Gets the layers.
   *
   * layer name.
   *
   * @return the layers
   */
  public String layers() {
    return layers;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the inputs.
   *
   * Input variables data for the workItem used in FlowJob.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the workItem.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the workItem.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the lastJob.
   *
   * Status of the last job executed by the workitem.
   *
   * @return the lastJob
   */
  public JobDataWorkItemLastJob lastJob() {
    return lastJob;
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

