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
 * Flow data-flow validation status.
 */
public class TemplateFlowDataValidationStatus extends DynamicModel<Object> {

  /**
   * Validation status of the template variable.
   */
  public interface LogLevel {
    /** info. */
    String INFO = "info";
    /** warning. */
    String WARNING = "warning";
    /** error. */
    String ERROR = "error";
  }

  @SerializedName("log_level")
  protected String logLevel;
  @SerializedName("var_name")
  protected String varName;
  @SerializedName("var_status")
  protected String varStatus;

  public TemplateFlowDataValidationStatus() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String logLevel;
    private String varName;
    private String varStatus;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowDataValidationStatus templateFlowDataValidationStatus) {
      this.logLevel = templateFlowDataValidationStatus.logLevel;
      this.varName = templateFlowDataValidationStatus.varName;
      this.varStatus = templateFlowDataValidationStatus.varStatus;
      this.dynamicProperties = templateFlowDataValidationStatus.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowDataValidationStatus.
     *
     * @return the new TemplateFlowDataValidationStatus instance
     */
    public TemplateFlowDataValidationStatus build() {
      return new TemplateFlowDataValidationStatus(this);
    }

    /**
     * Set the logLevel.
     *
     * @param logLevel the logLevel
     * @return the TemplateFlowDataValidationStatus builder
     */
    public Builder logLevel(String logLevel) {
      this.logLevel = logLevel;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the TemplateFlowDataValidationStatus builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }

    /**
     * Set the varStatus.
     *
     * @param varStatus the varStatus
     * @return the TemplateFlowDataValidationStatus builder
     */
    public Builder varStatus(String varStatus) {
      this.varStatus = varStatus;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowDataValidationStatus builder
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

  protected TemplateFlowDataValidationStatus(Builder builder) {
    super(new TypeToken<Object>() { });
    logLevel = builder.logLevel;
    varName = builder.varName;
    varStatus = builder.varStatus;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowDataValidationStatus builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the logLevel.
   *
   * Validation status of the template variable.
   *
   * @return the logLevel
   */
  public String getLogLevel() {
    return this.logLevel;
  }

  /**
   * Sets the logLevel.
   *
   * @param logLevel the new logLevel
   */
  public void setLogLevel(final String logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * Gets the varName.
   *
   * Input variable name.
   *
   * @return the varName
   */
  public String getVarName() {
    return this.varName;
  }

  /**
   * Sets the varName.
   *
   * @param varName the new varName
   */
  public void setVarName(final String varName) {
    this.varName = varName;
  }

  /**
   * Gets the varStatus.
   *
   * Validation log message related to the template variable.
   *
   * @return the varStatus
   */
  public String getVarStatus() {
    return this.varStatus;
  }

  /**
   * Sets the varStatus.
   *
   * @param varStatus the new varStatus
   */
  public void setVarStatus(final String varStatus) {
    this.varStatus = varStatus;
  }
}
