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
 * Action Job data.
 */
public class JobDataAction extends DynamicModel<Object> {

  @SerializedName("action_name")
  protected String actionName;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("inventory_record")
  protected InventoryResourceRecord inventoryRecord;
  @SerializedName("materialized_inventory")
  protected String materializedInventory;

  public JobDataAction() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String actionName;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private Date updatedAt;
    private InventoryResourceRecord inventoryRecord;
    private String materializedInventory;
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataAction jobDataAction) {
      this.actionName = jobDataAction.actionName;
      this.inputs = jobDataAction.inputs;
      this.outputs = jobDataAction.outputs;
      this.settings = jobDataAction.settings;
      this.updatedAt = jobDataAction.updatedAt;
      this.inventoryRecord = jobDataAction.inventoryRecord;
      this.materializedInventory = jobDataAction.materializedInventory;
      this.dynamicProperties = jobDataAction.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataAction.
     *
     * @return the new JobDataAction instance
     */
    public JobDataAction build() {
      return new JobDataAction(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the JobDataAction builder
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
     * @return the JobDataAction builder
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
     * @return the JobDataAction builder
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
     * Set the actionName.
     *
     * @param actionName the actionName
     * @return the JobDataAction builder
     */
    public Builder actionName(String actionName) {
      this.actionName = actionName;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the JobDataAction builder
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
     * @return the JobDataAction builder
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
     * @return the JobDataAction builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataAction builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Set the inventoryRecord.
     *
     * @param inventoryRecord the inventoryRecord
     * @return the JobDataAction builder
     */
    public Builder inventoryRecord(InventoryResourceRecord inventoryRecord) {
      this.inventoryRecord = inventoryRecord;
      return this;
    }

    /**
     * Set the materializedInventory.
     *
     * @param materializedInventory the materializedInventory
     * @return the JobDataAction builder
     */
    public Builder materializedInventory(String materializedInventory) {
      this.materializedInventory = materializedInventory;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataAction builder
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

  protected JobDataAction(Builder builder) {
    super(new TypeToken<Object>() { });
    actionName = builder.actionName;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    updatedAt = builder.updatedAt;
    inventoryRecord = builder.inventoryRecord;
    materializedInventory = builder.materializedInventory;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobDataAction builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionName.
   *
   * Flow name.
   *
   * @return the actionName
   */
  public String getActionName() {
    return this.actionName;
  }

  /**
   * Sets the actionName.
   *
   * @param actionName the new actionName
   */
  public void setActionName(final String actionName) {
    this.actionName = actionName;
  }

  /**
   * Gets the inputs.
   *
   * Input variables data used by the Action Job.
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
   * Output variables data from the Action Job.
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
   * Environment variables used by all the templates in the Action.
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

  /**
   * Gets the inventoryRecord.
   *
   * Complete inventory resource details with user inputs and system generated data.
   *
   * @return the inventoryRecord
   */
  public InventoryResourceRecord getInventoryRecord() {
    return this.inventoryRecord;
  }

  /**
   * Sets the inventoryRecord.
   *
   * @param inventoryRecord the new inventoryRecord
   */
  public void setInventoryRecord(final InventoryResourceRecord inventoryRecord) {
    this.inventoryRecord = inventoryRecord;
  }

  /**
   * Gets the materializedInventory.
   *
   * Materialized inventory details used by the Action Job, in .ini format.
   *
   * @return the materializedInventory
   */
  public String getMaterializedInventory() {
    return this.materializedInventory;
  }

  /**
   * Sets the materializedInventory.
   *
   * @param materializedInventory the new materializedInventory
   */
  public void setMaterializedInventory(final String materializedInventory) {
    this.materializedInventory = materializedInventory;
  }
}
