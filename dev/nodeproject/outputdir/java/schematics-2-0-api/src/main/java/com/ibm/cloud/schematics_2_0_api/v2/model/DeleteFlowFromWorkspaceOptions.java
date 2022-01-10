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
 * The deleteFlowFromWorkspace options.
 */
public class DeleteFlowFromWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected String flowId;
  protected Boolean propagate;
  protected Boolean force;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String flowId;
    private Boolean propagate;
    private Boolean force;

    private Builder(DeleteFlowFromWorkspaceOptions deleteFlowFromWorkspaceOptions) {
      this.workspaceId = deleteFlowFromWorkspaceOptions.workspaceId;
      this.flowId = deleteFlowFromWorkspaceOptions.flowId;
      this.propagate = deleteFlowFromWorkspaceOptions.propagate;
      this.force = deleteFlowFromWorkspaceOptions.force;
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
     * @param flowId the flowId
     */
    public Builder(String workspaceId, String flowId) {
      this.workspaceId = workspaceId;
      this.flowId = flowId;
    }

    /**
     * Builds a DeleteFlowFromWorkspaceOptions.
     *
     * @return the new DeleteFlowFromWorkspaceOptions instance
     */
    public DeleteFlowFromWorkspaceOptions build() {
      return new DeleteFlowFromWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the DeleteFlowFromWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the DeleteFlowFromWorkspaceOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteFlowFromWorkspaceOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteFlowFromWorkspaceOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  protected DeleteFlowFromWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    workspaceId = builder.workspaceId;
    flowId = builder.flowId;
    propagate = builder.propagate;
    force = builder.force;
  }

  /**
   * New builder.
   *
   * @return a DeleteFlowFromWorkspaceOptions builder
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
   * Gets the flowId.
   *
   * Flow Id.  Use GET /workspaces/&lt;workspace_id&gt;/flows API to look up the  Flow Ids in your Workspaces.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the propagate.
   *
   * Auto propagate the chaange or deletion to the dependent resources.
   *
   * @return the propagate
   */
  public Boolean propagate() {
    return propagate;
  }

  /**
   * Gets the force.
   *
   * Equivalent to -force options in the command line.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }
}

