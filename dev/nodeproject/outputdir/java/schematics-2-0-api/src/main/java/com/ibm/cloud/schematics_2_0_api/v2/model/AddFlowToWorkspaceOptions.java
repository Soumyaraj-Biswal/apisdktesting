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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addFlowToWorkspace options.
 */
public class AddFlowToWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected TemplateFlow templateFlow;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private TemplateFlow templateFlow;

    private Builder(AddFlowToWorkspaceOptions addFlowToWorkspaceOptions) {
      this.workspaceId = addFlowToWorkspaceOptions.workspaceId;
      this.templateFlow = addFlowToWorkspaceOptions.templateFlow;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workspaceId the workspaceId
     * @param templateFlow the templateFlow
     */
    public Builder(String workspaceId, TemplateFlow templateFlow) {
      this.workspaceId = workspaceId;
      this.templateFlow = templateFlow;
    }

    /**
     * Builds a AddFlowToWorkspaceOptions.
     *
     * @return the new AddFlowToWorkspaceOptions instance
     */
    public AddFlowToWorkspaceOptions build() {
      return new AddFlowToWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the AddFlowToWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the templateFlow.
     *
     * @param templateFlow the templateFlow
     * @return the AddFlowToWorkspaceOptions builder
     */
    public Builder templateFlow(TemplateFlow templateFlow) {
      this.templateFlow = templateFlow;
      return this;
    }
  }

  protected AddFlowToWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.templateFlow,
      "templateFlow cannot be null");
    workspaceId = builder.workspaceId;
    templateFlow = builder.templateFlow;
  }

  /**
   * New builder.
   *
   * @return a AddFlowToWorkspaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceId.
   *
   * Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account.
   *
   * @return the workspaceId
   */
  public String workspaceId() {
    return workspaceId;
  }

  /**
   * Gets the templateFlow.
   *
   * Add a new Flow to the Workspace.
   *
   * @return the templateFlow
   */
  public TemplateFlow templateFlow() {
    return templateFlow;
  }
}

