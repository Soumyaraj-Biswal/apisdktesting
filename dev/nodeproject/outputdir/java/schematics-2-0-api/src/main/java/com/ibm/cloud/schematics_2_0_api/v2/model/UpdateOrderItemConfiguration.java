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
 * Update Catalog item configuration in the Cart order.
 */
public class UpdateOrderItemConfiguration extends DynamicModel<Object> {

  /**
   * Name of the fulfilment job operations.
   */
  public interface Operation {
    /** install. */
    String INSTALL = "install";
    /** uninstall. */
    String UNINSTALL = "uninstall";
    /** configure. */
    String CONFIGURE = "configure";
    /** operate. */
    String OPERATE = "operate";
    /** dryrun. */
    String DRYRUN = "dryrun";
  }

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("target")
  protected TargetRequest target;
  @SerializedName("operation")
  protected String operation;
  @SerializedName("service_data")
  protected List<ServiceVariableData> serviceData;

  public UpdateOrderItemConfiguration() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private List<VariableData> outputs;
    private TargetRequest target;
    private String operation;
    private List<ServiceVariableData> serviceData;
    private Map<String, Object> dynamicProperties;

    private Builder(UpdateOrderItemConfiguration updateOrderItemConfiguration) {
      this.name = updateOrderItemConfiguration.name;
      this.description = updateOrderItemConfiguration.description;
      this.inputs = updateOrderItemConfiguration.inputs;
      this.settings = updateOrderItemConfiguration.settings;
      this.outputs = updateOrderItemConfiguration.outputs;
      this.target = updateOrderItemConfiguration.target;
      this.operation = updateOrderItemConfiguration.operation;
      this.serviceData = updateOrderItemConfiguration.serviceData;
      this.dynamicProperties = updateOrderItemConfiguration.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateOrderItemConfiguration.
     *
     * @return the new UpdateOrderItemConfiguration instance
     */
    public UpdateOrderItemConfiguration build() {
      return new UpdateOrderItemConfiguration(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the UpdateOrderItemConfiguration builder
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
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the UpdateOrderItemConfiguration builder
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
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the UpdateOrderItemConfiguration builder
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
     * Adds an serviceData to serviceData.
     *
     * @param serviceData the new serviceData
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder addServiceData(ServiceVariableData serviceData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(serviceData,
        "serviceData cannot be null");
      if (this.serviceData == null) {
        this.serviceData = new ArrayList<ServiceVariableData>();
      }
      this.serviceData.add(serviceData);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder target(TargetRequest target) {
      this.target = target;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the serviceData.
     * Existing serviceData will be replaced.
     *
     * @param serviceData the serviceData
     * @return the UpdateOrderItemConfiguration builder
     */
    public Builder serviceData(List<ServiceVariableData> serviceData) {
      this.serviceData = serviceData;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the UpdateOrderItemConfiguration builder
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

  protected UpdateOrderItemConfiguration(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    inputs = builder.inputs;
    settings = builder.settings;
    outputs = builder.outputs;
    target = builder.target;
    operation = builder.operation;
    serviceData = builder.serviceData;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a UpdateOrderItemConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Catalog item name.
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
   * Gets the description.
   *
   * Catalog item description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the inputs.
   *
   * Input configuration for the order.
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
   * Gets the settings.
   *
   * Input environment variables used by order.
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
   * Gets the outputs.
   *
   * Output configuration of the order.
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
   * Gets the target.
   *
   * Target cluster details to perform POC operation.
   *
   * @return the target
   */
  public TargetRequest getTarget() {
    return this.target;
  }

  /**
   * Sets the target.
   *
   * @param target the new target
   */
  public void setTarget(final TargetRequest target) {
    this.target = target;
  }

  /**
   * Gets the operation.
   *
   * Name of the fulfilment job operations.
   *
   * @return the operation
   */
  public String getOperation() {
    return this.operation;
  }

  /**
   * Sets the operation.
   *
   * @param operation the new operation
   */
  public void setOperation(final String operation) {
    this.operation = operation;
  }

  /**
   * Gets the serviceData.
   *
   * Additional service input data (for extensibility).
   *
   * @return the serviceData
   */
  public List<ServiceVariableData> getServiceData() {
    return this.serviceData;
  }

  /**
   * Sets the serviceData.
   *
   * @param serviceData the new serviceData
   */
  public void setServiceData(final List<ServiceVariableData> serviceData) {
    this.serviceData = serviceData;
  }
}
