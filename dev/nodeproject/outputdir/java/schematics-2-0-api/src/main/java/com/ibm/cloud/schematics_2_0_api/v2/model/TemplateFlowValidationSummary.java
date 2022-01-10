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
 * Validation summary.
 */
public class TemplateFlowValidationSummary extends DynamicModel<Object> {

  @SerializedName("warning_count")
  protected Double warningCount;
  @SerializedName("error_count")
  protected Double errorCount;

  public TemplateFlowValidationSummary() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Double warningCount;
    private Double errorCount;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowValidationSummary templateFlowValidationSummary) {
      this.warningCount = templateFlowValidationSummary.warningCount;
      this.errorCount = templateFlowValidationSummary.errorCount;
      this.dynamicProperties = templateFlowValidationSummary.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowValidationSummary.
     *
     * @return the new TemplateFlowValidationSummary instance
     */
    public TemplateFlowValidationSummary build() {
      return new TemplateFlowValidationSummary(this);
    }

    /**
     * Set the warningCount.
     *
     * @param warningCount the warningCount
     * @return the TemplateFlowValidationSummary builder
     */
    public Builder warningCount(Double warningCount) {
      this.warningCount = warningCount;
      return this;
    }

    /**
     * Set the errorCount.
     *
     * @param errorCount the errorCount
     * @return the TemplateFlowValidationSummary builder
     */
    public Builder errorCount(Double errorCount) {
      this.errorCount = errorCount;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowValidationSummary builder
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

  protected TemplateFlowValidationSummary(Builder builder) {
    super(new TypeToken<Object>() { });
    warningCount = builder.warningCount;
    errorCount = builder.errorCount;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowValidationSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the warningCount.
   *
   * Number of warnings in the flow.
   *
   * @return the warningCount
   */
  public Double getWarningCount() {
    return this.warningCount;
  }

  /**
   * Sets the warningCount.
   *
   * @param warningCount the new warningCount
   */
  public void setWarningCount(final Double warningCount) {
    this.warningCount = warningCount;
  }

  /**
   * Gets the errorCount.
   *
   * Number of errors in the flow.
   *
   * @return the errorCount
   */
  public Double getErrorCount() {
    return this.errorCount;
  }

  /**
   * Sets the errorCount.
   *
   * @param errorCount the new errorCount
   */
  public void setErrorCount(final Double errorCount) {
    this.errorCount = errorCount;
  }
}
