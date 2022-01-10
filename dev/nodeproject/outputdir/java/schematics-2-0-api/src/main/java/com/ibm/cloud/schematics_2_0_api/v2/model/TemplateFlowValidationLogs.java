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
 * TemplateFlowValidationLogs.
 */
public class TemplateFlowValidationLogs extends DynamicModel<Object> {

  @SerializedName("flow_index")
  protected Long flowIndex;
  @SerializedName("inputs_status")
  protected List<TemplateFlowDataValidationStatus> inputsStatus;
  @SerializedName("outputs_status")
  protected List<TemplateFlowDataValidationStatus> outputsStatus;

  public TemplateFlowValidationLogs() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Long flowIndex;
    private List<TemplateFlowDataValidationStatus> inputsStatus;
    private List<TemplateFlowDataValidationStatus> outputsStatus;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowValidationLogs templateFlowValidationLogs) {
      this.flowIndex = templateFlowValidationLogs.flowIndex;
      this.inputsStatus = templateFlowValidationLogs.inputsStatus;
      this.outputsStatus = templateFlowValidationLogs.outputsStatus;
      this.dynamicProperties = templateFlowValidationLogs.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowValidationLogs.
     *
     * @return the new TemplateFlowValidationLogs instance
     */
    public TemplateFlowValidationLogs build() {
      return new TemplateFlowValidationLogs(this);
    }

    /**
     * Adds an inputsStatus to inputsStatus.
     *
     * @param inputsStatus the new inputsStatus
     * @return the TemplateFlowValidationLogs builder
     */
    public Builder addInputsStatus(TemplateFlowDataValidationStatus inputsStatus) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputsStatus,
        "inputsStatus cannot be null");
      if (this.inputsStatus == null) {
        this.inputsStatus = new ArrayList<TemplateFlowDataValidationStatus>();
      }
      this.inputsStatus.add(inputsStatus);
      return this;
    }

    /**
     * Adds an outputsStatus to outputsStatus.
     *
     * @param outputsStatus the new outputsStatus
     * @return the TemplateFlowValidationLogs builder
     */
    public Builder addOutputsStatus(TemplateFlowDataValidationStatus outputsStatus) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputsStatus,
        "outputsStatus cannot be null");
      if (this.outputsStatus == null) {
        this.outputsStatus = new ArrayList<TemplateFlowDataValidationStatus>();
      }
      this.outputsStatus.add(outputsStatus);
      return this;
    }

    /**
     * Set the flowIndex.
     *
     * @param flowIndex the flowIndex
     * @return the TemplateFlowValidationLogs builder
     */
    public Builder flowIndex(long flowIndex) {
      this.flowIndex = flowIndex;
      return this;
    }

    /**
     * Set the inputsStatus.
     * Existing inputsStatus will be replaced.
     *
     * @param inputsStatus the inputsStatus
     * @return the TemplateFlowValidationLogs builder
     */
    public Builder inputsStatus(List<TemplateFlowDataValidationStatus> inputsStatus) {
      this.inputsStatus = inputsStatus;
      return this;
    }

    /**
     * Set the outputsStatus.
     * Existing outputsStatus will be replaced.
     *
     * @param outputsStatus the outputsStatus
     * @return the TemplateFlowValidationLogs builder
     */
    public Builder outputsStatus(List<TemplateFlowDataValidationStatus> outputsStatus) {
      this.outputsStatus = outputsStatus;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowValidationLogs builder
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

  protected TemplateFlowValidationLogs(Builder builder) {
    super(new TypeToken<Object>() { });
    flowIndex = builder.flowIndex;
    inputsStatus = builder.inputsStatus;
    outputsStatus = builder.outputsStatus;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowValidationLogs builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowIndex.
   *
   * Line number of the flow-item.
   *
   * @return the flowIndex
   */
  public Long getFlowIndex() {
    return this.flowIndex;
  }

  /**
   * Sets the flowIndex.
   *
   * @param flowIndex the new flowIndex
   */
  public void setFlowIndex(final long flowIndex) {
    this.flowIndex = flowIndex;
  }

  /**
   * Gets the inputsStatus.
   *
   * Validation status of input data for the flow-item.
   *
   * @return the inputsStatus
   */
  public List<TemplateFlowDataValidationStatus> getInputsStatus() {
    return this.inputsStatus;
  }

  /**
   * Sets the inputsStatus.
   *
   * @param inputsStatus the new inputsStatus
   */
  public void setInputsStatus(final List<TemplateFlowDataValidationStatus> inputsStatus) {
    this.inputsStatus = inputsStatus;
  }

  /**
   * Gets the outputsStatus.
   *
   * Validation status of output data for the flow-item.
   *
   * @return the outputsStatus
   */
  public List<TemplateFlowDataValidationStatus> getOutputsStatus() {
    return this.outputsStatus;
  }

  /**
   * Sets the outputsStatus.
   *
   * @param outputsStatus the new outputsStatus
   */
  public void setOutputsStatus(final List<TemplateFlowDataValidationStatus> outputsStatus) {
    this.outputsStatus = outputsStatus;
  }
}
