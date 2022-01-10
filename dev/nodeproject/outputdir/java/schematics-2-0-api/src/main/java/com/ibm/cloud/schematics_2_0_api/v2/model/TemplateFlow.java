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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Complete Flow details with user inputs and system generated data.
 */
public class TemplateFlow extends DynamicModel<Object> {

  /**
   * Type of flow.
   */
  public interface Type {
    /** simple_flow. */
    String SIMPLE_FLOW = "simple_flow";
    /** node_red_flow. */
    String NODE_RED_FLOW = "node_red_flow";
  }

  @SerializedName("name")
  protected String name;
  @SerializedName("version")
  protected String version;
  @SerializedName("type")
  protected String type;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("definition")
  protected TemplateFlowDefinition definition;
  @SerializedName("id")
  protected String id;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("status")
  protected JobStatusWorkspaceTemplateFlow status;
  @SerializedName("validation_summary")
  protected TemplateFlowValidationSummary validationSummary;
  @SerializedName("validation_logs")
  protected List<TemplateFlowValidationLogs> validationLogs;

  public TemplateFlow() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String version;
    private String type;
    private UserState userState;
    private TemplateFlowDefinition definition;
    private SystemLock sysLock;
    private JobStatusWorkspaceTemplateFlow status;
    private TemplateFlowValidationSummary validationSummary;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateFlow templateFlow) {
      this.name = templateFlow.name;
      this.version = templateFlow.version;
      this.type = templateFlow.type;
      this.userState = templateFlow.userState;
      this.definition = templateFlow.definition;
      this.sysLock = templateFlow.sysLock;
      this.status = templateFlow.status;
      this.validationSummary = templateFlow.validationSummary;
      this.dynamicProperties = templateFlow.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateFlow.
     *
     * @return the new TemplateFlow instance
     */
    public TemplateFlow build() {
      return new TemplateFlow(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TemplateFlow builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the TemplateFlow builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TemplateFlow builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the TemplateFlow builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the definition.
     *
     * @param definition the definition
     * @return the TemplateFlow builder
     */
    public Builder definition(TemplateFlowDefinition definition) {
      this.definition = definition;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the TemplateFlow builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the TemplateFlow builder
     */
    public Builder status(JobStatusWorkspaceTemplateFlow status) {
      this.status = status;
      return this;
    }

    /**
     * Set the validationSummary.
     *
     * @param validationSummary the validationSummary
     * @return the TemplateFlow builder
     */
    public Builder validationSummary(TemplateFlowValidationSummary validationSummary) {
      this.validationSummary = validationSummary;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateFlow builder
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

  protected TemplateFlow(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    version = builder.version;
    type = builder.type;
    userState = builder.userState;
    definition = builder.definition;
    sysLock = builder.sysLock;
    status = builder.status;
    validationSummary = builder.validationSummary;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the Flow.
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
   * Gets the version.
   *
   * Version of the flow definition. Only value 'V1' is accepted.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Sets the version.
   *
   * @param version the new version
   */
  public void setVersion(final String version) {
    this.version = version;
  }

  /**
   * Gets the type.
   *
   * Type of flow.
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
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final UserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the definition.
   *
   * Flow definition.
   *
   * @return the definition
   */
  public TemplateFlowDefinition getDefinition() {
    return this.definition;
  }

  /**
   * Sets the definition.
   *
   * @param definition the new definition
   */
  public void setDefinition(final TemplateFlowDefinition definition) {
    this.definition = definition;
  }

  /**
   * Gets the id.
   *
   * Id of the Flow.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return this.sysLock;
  }

  /**
   * Sets the sysLock.
   *
   * @param sysLock the new sysLock
   */
  public void setSysLock(final SystemLock sysLock) {
    this.sysLock = sysLock;
  }

  /**
   * Gets the createdAt.
   *
   * Flow creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the flow.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Flow updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the flow.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the status.
   *
   * Flow Job Status.
   *
   * @return the status
   */
  public JobStatusWorkspaceTemplateFlow getStatus() {
    return this.status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(final JobStatusWorkspaceTemplateFlow status) {
    this.status = status;
  }

  /**
   * Gets the validationSummary.
   *
   * Validation summary.
   *
   * @return the validationSummary
   */
  public TemplateFlowValidationSummary getValidationSummary() {
    return this.validationSummary;
  }

  /**
   * Sets the validationSummary.
   *
   * @param validationSummary the new validationSummary
   */
  public void setValidationSummary(final TemplateFlowValidationSummary validationSummary) {
    this.validationSummary = validationSummary;
  }

  /**
   * Gets the validationLogs.
   *
   * Validation details.
   *
   * @return the validationLogs
   */
  public List<TemplateFlowValidationLogs> getValidationLogs() {
    return this.validationLogs;
  }
}
