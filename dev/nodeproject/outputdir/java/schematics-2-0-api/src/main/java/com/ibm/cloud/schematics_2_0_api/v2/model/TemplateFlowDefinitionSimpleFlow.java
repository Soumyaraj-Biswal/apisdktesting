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
 * TemplateFlowDefinitionSimpleFlow.
 */
public class TemplateFlowDefinitionSimpleFlow extends DynamicModel<Object> {

  /**
   * Control action in the flow.
   */
  public interface Control {
    /** do. */
    String X_DO = "do";
    /** repeat_until. */
    String REPEAT_UNTIL = "repeat_until";
    /** wait_until. */
    String WAIT_UNTIL = "wait_until";
    /** branch_if. */
    String BRANCH_IF = "branch_if";
    /** switch. */
    String X_SWITCH = "switch";
  }

  @SerializedName("index")
  protected Long index;
  @SerializedName("control")
  protected String control;
  @SerializedName("template_operation")
  protected TemplateFlowDefinitionTemplateOperation templateOperation;

  public TemplateFlowDefinitionSimpleFlow() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Long index;
    private String control;
    private TemplateFlowDefinitionTemplateOperation templateOperation;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlow) {
      this.index = templateFlowDefinitionSimpleFlow.index;
      this.control = templateFlowDefinitionSimpleFlow.control;
      this.templateOperation = templateFlowDefinitionSimpleFlow.templateOperation;
      this.dynamicProperties = templateFlowDefinitionSimpleFlow.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowDefinitionSimpleFlow.
     *
     * @return the new TemplateFlowDefinitionSimpleFlow instance
     */
    public TemplateFlowDefinitionSimpleFlow build() {
      return new TemplateFlowDefinitionSimpleFlow(this);
    }

    /**
     * Set the index.
     *
     * @param index the index
     * @return the TemplateFlowDefinitionSimpleFlow builder
     */
    public Builder index(long index) {
      this.index = index;
      return this;
    }

    /**
     * Set the control.
     *
     * @param control the control
     * @return the TemplateFlowDefinitionSimpleFlow builder
     */
    public Builder control(String control) {
      this.control = control;
      return this;
    }

    /**
     * Set the templateOperation.
     *
     * @param templateOperation the templateOperation
     * @return the TemplateFlowDefinitionSimpleFlow builder
     */
    public Builder templateOperation(TemplateFlowDefinitionTemplateOperation templateOperation) {
      this.templateOperation = templateOperation;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowDefinitionSimpleFlow builder
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

  protected TemplateFlowDefinitionSimpleFlow(Builder builder) {
    super(new TypeToken<Object>() { });
    index = builder.index;
    control = builder.control;
    templateOperation = builder.templateOperation;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowDefinitionSimpleFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the index.
   *
   * Line number of the template-operation.
   *
   * @return the index
   */
  public Long getIndex() {
    return this.index;
  }

  /**
   * Sets the index.
   *
   * @param index the new index
   */
  public void setIndex(final long index) {
    this.index = index;
  }

  /**
   * Gets the control.
   *
   * Control action in the flow.
   *
   * @return the control
   */
  public String getControl() {
    return this.control;
  }

  /**
   * Sets the control.
   *
   * @param control the new control
   */
  public void setControl(final String control) {
    this.control = control;
  }

  /**
   * Gets the templateOperation.
   *
   * Template operation in the flow.
   *
   * @return the templateOperation
   */
  public TemplateFlowDefinitionTemplateOperation getTemplateOperation() {
    return this.templateOperation;
  }

  /**
   * Sets the templateOperation.
   *
   * @param templateOperation the new templateOperation
   */
  public void setTemplateOperation(final TemplateFlowDefinitionTemplateOperation templateOperation) {
    this.templateOperation = templateOperation;
  }
}
