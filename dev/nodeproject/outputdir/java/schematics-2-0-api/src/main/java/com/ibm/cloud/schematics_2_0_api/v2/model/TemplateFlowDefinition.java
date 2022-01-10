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
 * Flow definition.
 */
public class TemplateFlowDefinition extends DynamicModel<Object> {

  /**
   * Type of flow definition.
   */
  public interface FlowType {
    /** simple. */
    String SIMPLE = "simple";
    /** custom. */
    String CUSTOM = "custom";
  }

  @SerializedName("flow_type")
  protected String flowType;
  @SerializedName("id")
  protected String id;
  @SerializedName("simple_flow")
  protected List<TemplateFlowDefinitionSimpleFlow> simpleFlow;
  @SerializedName("custom_flow")
  protected byte[] customFlow;

  public TemplateFlowDefinition() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String flowType;
    private String id;
    private List<TemplateFlowDefinitionSimpleFlow> simpleFlow;
    private byte[] customFlow;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowDefinition templateFlowDefinition) {
      this.flowType = templateFlowDefinition.flowType;
      this.id = templateFlowDefinition.id;
      this.simpleFlow = templateFlowDefinition.simpleFlow;
      this.customFlow = templateFlowDefinition.customFlow;
      this.dynamicProperties = templateFlowDefinition.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowDefinition.
     *
     * @return the new TemplateFlowDefinition instance
     */
    public TemplateFlowDefinition build() {
      return new TemplateFlowDefinition(this);
    }

    /**
     * Adds an simpleFlow to simpleFlow.
     *
     * @param simpleFlow the new simpleFlow
     * @return the TemplateFlowDefinition builder
     */
    public Builder addSimpleFlow(TemplateFlowDefinitionSimpleFlow simpleFlow) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(simpleFlow,
        "simpleFlow cannot be null");
      if (this.simpleFlow == null) {
        this.simpleFlow = new ArrayList<TemplateFlowDefinitionSimpleFlow>();
      }
      this.simpleFlow.add(simpleFlow);
      return this;
    }

    /**
     * Set the flowType.
     *
     * @param flowType the flowType
     * @return the TemplateFlowDefinition builder
     */
    public Builder flowType(String flowType) {
      this.flowType = flowType;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the TemplateFlowDefinition builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the simpleFlow.
     * Existing simpleFlow will be replaced.
     *
     * @param simpleFlow the simpleFlow
     * @return the TemplateFlowDefinition builder
     */
    public Builder simpleFlow(List<TemplateFlowDefinitionSimpleFlow> simpleFlow) {
      this.simpleFlow = simpleFlow;
      return this;
    }

    /**
     * Set the customFlow.
     *
     * @param customFlow the customFlow
     * @return the TemplateFlowDefinition builder
     */
    public Builder customFlow(byte[] customFlow) {
      this.customFlow = customFlow;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowDefinition builder
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

  protected TemplateFlowDefinition(Builder builder) {
    super(new TypeToken<Object>() { });
    flowType = builder.flowType;
    id = builder.id;
    simpleFlow = builder.simpleFlow;
    customFlow = builder.customFlow;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowType.
   *
   * Type of flow definition.
   *
   * @return the flowType
   */
  public String getFlowType() {
    return this.flowType;
  }

  /**
   * Sets the flowType.
   *
   * @param flowType the new flowType
   */
  public void setFlowType(final String flowType) {
    this.flowType = flowType;
  }

  /**
   * Gets the id.
   *
   * Flow definition id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * Gets the simpleFlow.
   *
   * Simple inbuilt flow defined using a list of template operations.
   *
   * @return the simpleFlow
   */
  public List<TemplateFlowDefinitionSimpleFlow> getSimpleFlow() {
    return this.simpleFlow;
  }

  /**
   * Sets the simpleFlow.
   *
   * @param simpleFlow the new simpleFlow
   */
  public void setSimpleFlow(final List<TemplateFlowDefinitionSimpleFlow> simpleFlow) {
    this.simpleFlow = simpleFlow;
  }

  /**
   * Gets the customFlow.
   *
   * flow definition string used by an external engine (eg. NodeRed).
   *
   * @return the customFlow
   */
  public byte[] getCustomFlow() {
    return this.customFlow;
  }

  /**
   * Sets the customFlow.
   *
   * @param customFlow the new customFlow
   */
  public void setCustomFlow(final byte[] customFlow) {
    this.customFlow = customFlow;
  }
}
