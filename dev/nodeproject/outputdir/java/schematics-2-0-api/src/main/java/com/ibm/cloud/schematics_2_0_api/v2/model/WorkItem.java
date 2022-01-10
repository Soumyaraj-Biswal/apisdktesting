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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Workitem for the Blueprint.
 */
public class WorkItem extends DynamicModel<Object> {

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
  @SerializedName("name")
  protected String name;
  @SerializedName("layer")
  protected String layer;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("tags")
  protected String tags;
  @SerializedName("inputs")
  protected List<BlueprintVariableData> inputs;
  @SerializedName("outputs")
  protected List<BlueprintVariableData> outputs;
  @SerializedName("settings")
  protected List<BlueprintVariableData> settings;
  @SerializedName("last_job")
  protected WorkItemLastJob lastJob;

  public WorkItem() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

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
      this.dynamicProperties = workItem.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the WorkItem builder
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

  protected WorkItem(Builder builder) {
    super(new TypeToken<Object>() { });
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
    this.setProperties(builder.dynamicProperties);
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
  public String getWorkitemObjectId() {
    return this.workitemObjectId;
  }

  /**
   * Sets the workitemObjectId.
   *
   * @param workitemObjectId the new workitemObjectId
   */
  public void setWorkitemObjectId(final String workitemObjectId) {
    this.workitemObjectId = workitemObjectId;
  }

  /**
   * Gets the workitemObjectType.
   *
   * Name of the Schematics automation resource.
   *
   * @return the workitemObjectType
   */
  public String getWorkitemObjectType() {
    return this.workitemObjectType;
  }

  /**
   * Sets the workitemObjectType.
   *
   * @param workitemObjectType the new workitemObjectType
   */
  public void setWorkitemObjectType(final String workitemObjectType) {
    this.workitemObjectType = workitemObjectType;
  }

  /**
   * Gets the name.
   *
   * Name of the workitem.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the layer.
   *
   * Layer for the workitem.
   *
   * @return the layer
   */
  public String getLayer() {
    return this.layer;
  }

  /**
   * Sets the layer.
   *
   * @param layer the new layer
   */
  public void setLayer(final String layer) {
    this.layer = layer;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource getSource() {
    return this.source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final ExternalSource source) {
    this.source = source;
  }

  /**
   * Gets the tags.
   *
   * Tags used by the workitem.
   *
   * @return the tags
   */
  public String getTags() {
    return this.tags;
  }

  /**
   * Sets the tags.
   *
   * @param tags the new tags
   */
  public void setTags(final String tags) {
    this.tags = tags;
  }

  /**
   * Gets the inputs.
   *
   * Inputs used by the workitem.
   *
   * @return the inputs
   */
  public List<BlueprintVariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<BlueprintVariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the outputs.
   *
   * Outputs from the workitem.
   *
   * @return the outputs
   */
  public List<BlueprintVariableData> getOutputs() {
    return this.outputs;
  }

  /**
   * Sets the outputs.
   *
   * @param outputs the new outputs
   */
  public void setOutputs(final List<BlueprintVariableData> outputs) {
    this.outputs = outputs;
  }

  /**
   * Gets the settings.
   *
   * @return the settings
   */
  public List<BlueprintVariableData> getSettings() {
    return this.settings;
  }

  /**
   * Sets the settings.
   *
   * @param settings the new settings
   */
  public void setSettings(final List<BlueprintVariableData> settings) {
    this.settings = settings;
  }

  /**
   * Gets the lastJob.
   *
   * Status of the last job executed by the workitem.
   *
   * @return the lastJob
   */
  public WorkItemLastJob getLastJob() {
    return this.lastJob;
  }

  /**
   * Sets the lastJob.
   *
   * @param lastJob the new lastJob
   */
  public void setLastJob(final WorkItemLastJob lastJob) {
    this.lastJob = lastJob;
  }
}
