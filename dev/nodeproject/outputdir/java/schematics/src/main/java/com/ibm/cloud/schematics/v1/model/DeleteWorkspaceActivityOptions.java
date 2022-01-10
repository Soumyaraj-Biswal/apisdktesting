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
package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteWorkspaceActivity options.
 */
public class DeleteWorkspaceActivityOptions extends GenericModel {

  protected String wId;
  protected String activityId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String activityId;

    private Builder(DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions) {
      this.wId = deleteWorkspaceActivityOptions.wId;
      this.activityId = deleteWorkspaceActivityOptions.activityId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param activityId the activityId
     */
    public Builder(String wId, String activityId) {
      this.wId = wId;
      this.activityId = activityId;
    }

    /**
     * Builds a DeleteWorkspaceActivityOptions.
     *
     * @return the new DeleteWorkspaceActivityOptions instance
     */
    public DeleteWorkspaceActivityOptions build() {
      return new DeleteWorkspaceActivityOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the DeleteWorkspaceActivityOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the activityId.
     *
     * @param activityId the activityId
     * @return the DeleteWorkspaceActivityOptions builder
     */
    public Builder activityId(String activityId) {
      this.activityId = activityId;
      return this;
    }
  }

  protected DeleteWorkspaceActivityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.activityId,
      "activityId cannot be empty");
    wId = builder.wId;
    activityId = builder.activityId;
  }

  /**
   * New builder.
   *
   * @return a DeleteWorkspaceActivityOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace for which you want to retrieve details.  To find the workspace ID, use the `GET
   * /workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the activityId.
   *
   * The ID of the activity or job, for which you want to retrieve details.  To find the job ID, use the `GET
   * /v1/workspaces/{id}/actions` API.
   *
   * @return the activityId
   */
  public String activityId() {
    return activityId;
  }
}

