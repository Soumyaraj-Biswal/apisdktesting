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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rule to map input param_name to output_param.
 */
public class ServiceMappingRule extends GenericModel {

  protected String type;
  @SerializedName("input_param_name")
  protected String inputParamName;
  @SerializedName("output_param_name")
  protected String outputParamName;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String inputParamName;
    private String outputParamName;

    private Builder(ServiceMappingRule serviceMappingRule) {
      this.type = serviceMappingRule.type;
      this.inputParamName = serviceMappingRule.inputParamName;
      this.outputParamName = serviceMappingRule.outputParamName;
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
  }

  protected ServiceMappingRule(Builder builder) {
    type = builder.type;
    inputParamName = builder.inputParamName;
    outputParamName = builder.outputParamName;
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
  public String type() {
    return type;
  }

  /**
   * Gets the inputParamName.
   *
   * Input parameter name which acts as source for mapping.
   *
   * @return the inputParamName
   */
  public String inputParamName() {
    return inputParamName;
  }

  /**
   * Gets the outputParamName.
   *
   * Output parameter name which acts as destination for mapping.
   *
   * @return the outputParamName
   */
  public String outputParamName() {
    return outputParamName;
  }
}

