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
 * The updateWorkspace options.
 */
public class UpdateWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected Workspace workspace;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private Workspace workspace;

    private Builder(UpdateWorkspaceOptions updateWorkspaceOptions) {
      this.workspaceId = updateWorkspaceOptions.workspaceId;
      this.workspace = updateWorkspaceOptions.workspace;
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
     * @param workspace the workspace
     */
    public Builder(String workspaceId, Workspace workspace) {
      this.workspaceId = workspaceId;
      this.workspace = workspace;
    }

    /**
     * Builds a UpdateWorkspaceOptions.
     *
     * @return the new UpdateWorkspaceOptions instance
     */
    public UpdateWorkspaceOptions build() {
      return new UpdateWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the workspace.
     *
     * @param workspace the workspace
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder workspace(Workspace workspace) {
      this.workspace = workspace;
      return this;
    }
  }

  protected UpdateWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workspace,
      "workspace cannot be null");
    workspaceId = builder.workspaceId;
    workspace = builder.workspace;
  }

  /**
   * New builder.
   *
   * @return a UpdateWorkspaceOptions builder
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
   * Gets the workspace.
   *
   * Update some details in the Workspace.
   *
   * @return the workspace
   */
  public Workspace workspace() {
    return workspace;
  }
}

