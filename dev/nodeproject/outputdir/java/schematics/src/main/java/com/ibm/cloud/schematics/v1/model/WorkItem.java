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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workitem for the Blueprint.
 */
public class WorkItem extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface WorkitemObjectType {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
  }

  @SerializedName("workitem_object_id")
  protected String workitemObjectId;
  @SerializedName("workitem_object_type")
  protected String workitemObjectType;
  protected String name;
  protected String layer;
  protected ExternalSource source;
  protected String tags;
  protected List<BlueprintVariableData> inputs;
  protected List<BlueprintVariableData> outputs;
  protected List<BlueprintVariableData> settings;
  @SerializedName("last_job")
  protected WorkItemLastJob lastJob;

  /**
   * Builder.
   */
  public static class Builder {
    private String workitemObjectId;
    private String workitemObjectType;
    private String name;
    private String layer;
    private ExternalSource source;
    private String tags;
    private List<BlueprintVariableData> inputs;
    private List<BlueprintVariableData> outputs;
    private List<BlueprintVariableData> settings;
    private WorkItemLastJob lastJob;

    private Builder(WorkItem workItem) {
      this.workitemObjectId = workItem.workitemObjectId;
      this.workitemObjectType = workItem.workitemObjectType;
      this.name = workItem.name;
      this.layer = workItem.layer;
      this.source = workItem.source;
      this.tags = workItem.tags;
      this.inputs = workItem.inputs;
      this.outputs = workItem.outputs;
      this.settings = workItem.settings;
      this.lastJob = workItem.lastJob;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkItem.
     *
     * @return the new WorkItem instance
     */
    public WorkItem build() {
      return new WorkItem(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the WorkItem builder
     */
    public Builder addInputs(BlueprintVariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<BlueprintVariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the WorkItem builder
     */
    public Builder addOutputs(BlueprintVariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<BlueprintVariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the WorkItem builder
     */
    public Builder addSettings(BlueprintVariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<BlueprintVariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Set the workitemObjectId.
     *
     * @param workitemObjectId the workitemObjectId
     * @return the WorkItem builder
     */
    public Builder workitemObjectId(String workitemObjectId) {
      this.workitemObjectId = workitemObjectId;
      return this;
    }

    /**
     * Set the workitemObjectType.
     *
     * @param workitemObjectType the workitemObjectType
     * @return the WorkItem builder
     */
    public Builder workitemObjectType(String workitemObjectType) {
      this.workitemObjectType = workitemObjectType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the WorkItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the layer.
     *
     * @param layer the layer
     * @return the WorkItem builder
     */
    public Builder layer(String layer) {
      this.layer = layer;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the WorkItem builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the tags.
     *
     * @param tags the tags
     * @return the WorkItem builder
     */
    public Builder tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the WorkItem builder
     */
    public Builder inputs(List<BlueprintVariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the WorkItem builder
     */
    public Builder outputs(List<BlueprintVariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the WorkItem builder
     */
    public Builder settings(List<BlueprintVariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the lastJob.
     *
     * @param lastJob the lastJob
     * @return the WorkItem builder
     */
    public Builder lastJob(WorkItemLastJob lastJob) {
      this.lastJob = lastJob;
      return this;
    }
  }

  protected WorkItem(Builder builder) {
    workitemObjectId = builder.workitemObjectId;
    workitemObjectType = builder.workitemObjectType;
    name = builder.name;
    layer = builder.layer;
    source = builder.source;
    tags = builder.tags;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    lastJob = builder.lastJob;
  }

  /**
   * New builder.
   *
   * @return a WorkItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workitemObjectId.
   *
   * work item id.
   *
   * @return the workitemObjectId
   */
  public String workitemObjectId() {
    return workitemObjectId;
  }

  /**
   * Gets the workitemObjectType.
   *
   * Name of the Schematics automation resource.
   *
   * @return the workitemObjectType
   */
  public String workitemObjectType() {
    return workitemObjectType;
  }

  /**
   * Gets the name.
   *
   * Name of the workitem.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the layer.
   *
   * Layer for the workitem.
   *
   * @return the layer
   */
  public String layer() {
    return layer;
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
   * Gets the tags.
   *
   * Tags used by the workitem.
   *
   * @return the tags
   */
  public String tags() {
    return tags;
  }

  /**
   * Gets the inputs.
   *
   * Inputs used by the workitem.
   *
   * @return the inputs
   */
  public List<BlueprintVariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Outputs from the workitem.
   *
   * @return the outputs
   */
  public List<BlueprintVariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * @return the settings
   */
  public List<BlueprintVariableData> settings() {
    return settings;
  }

  /**
   * Gets the lastJob.
   *
   * Status of the last job executed by the workitem.
   *
   * @return the lastJob
   */
  public WorkItemLastJob lastJob() {
    return lastJob;
  }
}

