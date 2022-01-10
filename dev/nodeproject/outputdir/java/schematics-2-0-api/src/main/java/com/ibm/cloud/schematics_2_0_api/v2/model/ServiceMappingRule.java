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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Rule to map input param_name to output_param.
 */
public class ServiceMappingRule extends DynamicModel<Object> {

  @SerializedName("type")
  protected String type;
  @SerializedName("input_param_name")
  protected String inputParamName;
  @SerializedName("output_param_name")
  protected String outputParamName;

  public ServiceMappingRule() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String inputParamName;
    private String outputParamName;
    private Map<String, Object> dynamicProperties;

    private Builder(ServiceMappingRule serviceMappingRule) {
      this.type = serviceMappingRule.type;
      this.inputParamName = serviceMappingRule.inputParamName;
      this.outputParamName = serviceMappingRule.outputParamName;
      this.dynamicProperties = serviceMappingRule.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceMappingRule.
     *
     * @return the new ServiceMappingRule instance
     */
    public ServiceMappingRule build() {
      return new ServiceMappingRule(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ServiceMappingRule builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the inputParamName.
     *
     * @param inputParamName the inputParamName
     * @return the ServiceMappingRule builder
     */
    public Builder inputParamName(String inputParamName) {
      this.inputParamName = inputParamName;
      return this;
    }

    /**
     * Set the outputParamName.
     *
     * @param outputParamName the outputParamName
     * @return the ServiceMappingRule builder
     */
    public Builder outputParamName(String outputParamName) {
      this.outputParamName = outputParamName;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ServiceMappingRule builder
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

  protected ServiceMappingRule(Builder builder) {
    super(new TypeToken<Object>() { });
    type = builder.type;
    inputParamName = builder.inputParamName;
    outputParamName = builder.outputParamName;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ServiceMappingRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of mapping.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the inputParamName.
   *
   * Input parameter name which acts as source for mapping.
   *
   * @return the inputParamName
   */
  public String getInputParamName() {
    return this.inputParamName;
  }

  /**
   * Sets the inputParamName.
   *
   * @param inputParamName the new inputParamName
   */
  public void setInputParamName(final String inputParamName) {
    this.inputParamName = inputParamName;
  }

  /**
   * Gets the outputParamName.
   *
   * Output parameter name which acts as destination for mapping.
   *
   * @return the outputParamName
   */
  public String getOutputParamName() {
    return this.outputParamName;
  }

  /**
   * Sets the outputParamName.
   *
   * @param outputParamName the new outputParamName
   */
  public void setOutputParamName(final String outputParamName) {
    this.outputParamName = outputParamName;
  }
}
