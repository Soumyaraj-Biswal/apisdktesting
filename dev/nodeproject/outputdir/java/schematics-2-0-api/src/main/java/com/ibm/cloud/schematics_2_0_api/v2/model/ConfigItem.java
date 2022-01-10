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
 * Environment configuration item used as input for the blueprint.
 */
public class ConfigItem extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("inputs")
  protected List<BlueprintVariableData> inputs;

  public ConfigItem() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private ExternalSource source;
    private List<BlueprintVariableData> inputs;
    private Map<String, Object> dynamicProperties;

    private Builder(ConfigItem configItem) {
      this.name = configItem.name;
      this.description = configItem.description;
      this.source = configItem.source;
      this.inputs = configItem.inputs;
      this.dynamicProperties = configItem.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigItem.
     *
     * @return the new ConfigItem instance
     */
    public ConfigItem build() {
      return new ConfigItem(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the ConfigItem builder
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
     * Set the name.
     *
     * @param name the name
     * @return the ConfigItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ConfigItem builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the ConfigItem builder
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
     * @return the ConfigItem builder
     */
    public Builder inputs(List<BlueprintVariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ConfigItem builder
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

  protected ConfigItem(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    source = builder.source;
    inputs = builder.inputs;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ConfigItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the environment configuration item.
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
   * Description for the environment configuration item.
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
   * Gets the inputs.
   *
   * Input variables and values for the environment configuration item.
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
}
