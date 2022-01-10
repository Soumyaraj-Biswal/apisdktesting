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
 * The getFlowInWorkspace options.
 */
public class GetFlowInWorkspaceOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
  }

  protected String workspaceId;
  protected String flowId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String flowId;
    private String profile;

    private Builder(GetFlowInWorkspaceOptions getFlowInWorkspaceOptions) {
      this.workspaceId = getFlowInWorkspaceOptions.workspaceId;
      this.flowId = getFlowInWorkspaceOptions.flowId;
      this.profile = getFlowInWorkspaceOptions.profile;
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
     * Builds a GetFlowInWorkspaceOptions.
     *
     * @return the new GetFlowInWorkspaceOptions instance
     */
    public GetFlowInWorkspaceOptions build() {
      return new GetFlowInWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the GetFlowInWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the GetFlowInWorkspaceOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetFlowInWorkspaceOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetFlowInWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    workspaceId = builder.workspaceId;
    flowId = builder.flowId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetFlowInWorkspaceOptions builder
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
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

