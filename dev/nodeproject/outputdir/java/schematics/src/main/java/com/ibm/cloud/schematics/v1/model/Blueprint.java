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
 * Blueprint definition - composed of multiple workitems used to construct an Environment.
 */
public class Blueprint extends GenericModel {

  protected String name;
  protected String description;
  protected ExternalSource source;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  protected List<WorkItem> workitems;
  protected Flow flow;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private ExternalSource source;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private List<WorkItem> workitems;
    private Flow flow;

    private Builder(Blueprint blueprint) {
      this.name = blueprint.name;
      this.description = blueprint.description;
      this.source = blueprint.source;
      this.inputs = blueprint.inputs;
      this.outputs = blueprint.outputs;
      this.settings = blueprint.settings;
      this.workitems = blueprint.workitems;
      this.flow = blueprint.flow;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Blueprint.
     *
     * @return the new Blueprint instance
     */
    public Blueprint build() {
      return new Blueprint(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Blueprint builder
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
     * @return the Blueprint builder
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
     * @return the Blueprint builder
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
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the Blueprint builder
     */
    public Builder addWorkitems(WorkItem workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<WorkItem>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Blueprint builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Blueprint builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Blueprint builder
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
     * @return the Blueprint builder
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
     * @return the Blueprint builder
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
     * @return the Blueprint builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the Blueprint builder
     */
    public Builder workitems(List<WorkItem> workitems) {
      this.workitems = workitems;
      return this;
    }

    /**
     * Set the flow.
     *
     * @param flow the flow
     * @return the Blueprint builder
     */
    public Builder flow(Flow flow) {
      this.flow = flow;
      return this;
    }
  }

  protected Blueprint(Builder builder) {
    name = builder.name;
    description = builder.description;
    source = builder.source;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    workitems = builder.workitems;
    flow = builder.flow;
  }

  /**
   * New builder.
   *
   * @return a Blueprint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the blueprint.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the blueprint.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Inputs for the blueprint.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Outputs from the blueprint.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Settings used by the blueprint.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the workitems.
   *
   * Workitems for the blueprint.
   *
   * @return the workitems
   */
  public List<WorkItem> workitems() {
    return workitems;
  }

  /**
   * Gets the flow.
   *
   * Order of execution for the Blueprint command.
   *
   * @return the flow
   */
  public Flow flow() {
    return flow;
  }
}

