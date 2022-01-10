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
 * The replaceWorkspace options.
 */
public class ReplaceWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected Workspace workspace;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private Workspace workspace;

    private Builder(ReplaceWorkspaceOptions replaceWorkspaceOptions) {
      this.workspaceId = replaceWorkspaceOptions.workspaceId;
      this.workspace = replaceWorkspaceOptions.workspace;
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
     * Builds a ReplaceWorkspaceOptions.
     *
     * @return the new ReplaceWorkspaceOptions instance
     */
    public ReplaceWorkspaceOptions build() {
      return new ReplaceWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the ReplaceWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the workspace.
     *
     * @param workspace the workspace
     * @return the ReplaceWorkspaceOptions builder
     */
    public Builder workspace(Workspace workspace) {
      this.workspace = workspace;
      return this;
    }
  }

  protected ReplaceWorkspaceOptions(Builder builder) {
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
   * @return a ReplaceWorkspaceOptions builder
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
   * Replace the entire Workspace definition.
   *
   * @return the workspace
   */
  public Workspace workspace() {
    return workspace;
  }
}

