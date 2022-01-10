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
 * Template operation in the flow.
 */
public class TemplateFlowDefinitionTemplateOperation extends DynamicModel<Object> {

  @SerializedName("pre_condition")
  protected String preCondition;
  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("override_command")
  protected TemplateCommand overrideCommand;
  @SerializedName("post_condition")
  protected String postCondition;
  @SerializedName("on_error")
  protected String onError;

  public TemplateFlowDefinitionTemplateOperation() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String preCondition;
    private String templateId;
    private TemplateCommand overrideCommand;
    private String postCondition;
    private String onError;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperation) {
      this.preCondition = templateFlowDefinitionTemplateOperation.preCondition;
      this.templateId = templateFlowDefinitionTemplateOperation.templateId;
      this.overrideCommand = templateFlowDefinitionTemplateOperation.overrideCommand;
      this.postCondition = templateFlowDefinitionTemplateOperation.postCondition;
      this.onError = templateFlowDefinitionTemplateOperation.onError;
      this.dynamicProperties = templateFlowDefinitionTemplateOperation.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlowDefinitionTemplateOperation.
     *
     * @return the new TemplateFlowDefinitionTemplateOperation instance
     */
    public TemplateFlowDefinitionTemplateOperation build() {
      return new TemplateFlowDefinitionTemplateOperation(this);
    }

    /**
     * Set the preCondition.
     *
     * @param preCondition the preCondition
     * @return the TemplateFlowDefinitionTemplateOperation builder
     */
    public Builder preCondition(String preCondition) {
      this.preCondition = preCondition;
      return this;
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the TemplateFlowDefinitionTemplateOperation builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the overrideCommand.
     *
     * @param overrideCommand the overrideCommand
     * @return the TemplateFlowDefinitionTemplateOperation builder
     */
    public Builder overrideCommand(TemplateCommand overrideCommand) {
      this.overrideCommand = overrideCommand;
      return this;
    }

    /**
     * Set the postCondition.
     *
     * @param postCondition the postCondition
     * @return the TemplateFlowDefinitionTemplateOperation builder
     */
    public Builder postCondition(String postCondition) {
      this.postCondition = postCondition;
      return this;
    }

    /**
     * Set the onError.
     *
     * @param onError the onError
     * @return the TemplateFlowDefinitionTemplateOperation builder
     */
    public Builder onError(String onError) {
      this.onError = onError;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlowDefinitionTemplateOperation builder
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

  protected TemplateFlowDefinitionTemplateOperation(Builder builder) {
    super(new TypeToken<Object>() { });
    preCondition = builder.preCondition;
    templateId = builder.templateId;
    overrideCommand = builder.overrideCommand;
    postCondition = builder.postCondition;
    onError = builder.onError;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlowDefinitionTemplateOperation builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the preCondition.
   *
   * Condition expression that will be evaluated before performing the template command; if false, this template action
   * is skipped to the next.
   *
   * @return the preCondition
   */
  public String getPreCondition() {
    return this.preCondition;
  }

  /**
   * Sets the preCondition.
   *
   * @param preCondition the new preCondition
   */
  public void setPreCondition(final String preCondition) {
    this.preCondition = preCondition;
  }

  /**
   * Gets the templateId.
   *
   * Id of the Template picked for performing the workspace command.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return this.templateId;
  }

  /**
   * Sets the templateId.
   *
   * @param templateId the new templateId
   */
  public void setTemplateId(final String templateId) {
    this.templateId = templateId;
  }

  /**
   * Gets the overrideCommand.
   *
   * Name of the template-specific command.
   *
   * @return the overrideCommand
   */
  public TemplateCommand getOverrideCommand() {
    return this.overrideCommand;
  }

  /**
   * Sets the overrideCommand.
   *
   * @param overrideCommand the new overrideCommand
   */
  public void setOverrideCommand(final TemplateCommand overrideCommand) {
    this.overrideCommand = overrideCommand;
  }

  /**
   * Gets the postCondition.
   *
   * Condition expression that will be evaluated after performing the template command; if false, the workspace command
   * will be reported as Failed, and error event is triggered".
   *
   * @return the postCondition
   */
  public String getPostCondition() {
    return this.postCondition;
  }

  /**
   * Sets the postCondition.
   *
   * @param postCondition the new postCondition
   */
  public void setPostCondition(final String postCondition) {
    this.postCondition = postCondition;
  }

  /**
   * Gets the onError.
   *
   * On encountering error in the workspace command - ignore (and continue to next step), or break (to stop execution),
   * or retry (the template action, for a configurable retry count).
   *
   * @return the onError
   */
  public String getOnError() {
    return this.onError;
  }

  /**
   * Sets the onError.
   *
   * @param onError the new onError
   */
  public void setOnError(final String onError) {
    this.onError = onError;
  }
}
