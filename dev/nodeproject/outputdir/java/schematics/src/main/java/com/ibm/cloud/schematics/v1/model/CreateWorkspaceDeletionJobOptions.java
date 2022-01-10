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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createWorkspaceDeletionJob options.
 */
public class CreateWorkspaceDeletionJobOptions extends GenericModel {

  protected String refreshToken;
  protected Boolean newDeleteWorkspaces;
  protected Boolean newDestroyResources;
  protected String newJob;
  protected String newVersion;
  protected List<String> newWorkspaces;
  protected String destroyResources;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private Boolean newDeleteWorkspaces;
    private Boolean newDestroyResources;
    private String newJob;
    private String newVersion;
    private List<String> newWorkspaces;
    private String destroyResources;

    private Builder(CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions) {
      this.refreshToken = createWorkspaceDeletionJobOptions.refreshToken;
      this.newDeleteWorkspaces = createWorkspaceDeletionJobOptions.newDeleteWorkspaces;
      this.newDestroyResources = createWorkspaceDeletionJobOptions.newDestroyResources;
      this.newJob = createWorkspaceDeletionJobOptions.newJob;
      this.newVersion = createWorkspaceDeletionJobOptions.newVersion;
      this.newWorkspaces = createWorkspaceDeletionJobOptions.newWorkspaces;
      this.destroyResources = createWorkspaceDeletionJobOptions.destroyResources;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param refreshToken the refreshToken
     */
    public Builder(String refreshToken) {
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a CreateWorkspaceDeletionJobOptions.
     *
     * @return the new CreateWorkspaceDeletionJobOptions instance
     */
    public CreateWorkspaceDeletionJobOptions build() {
      return new CreateWorkspaceDeletionJobOptions(this);
    }

    /**
     * Adds an newWorkspaces to newWorkspaces.
     *
     * @param newWorkspaces the new newWorkspaces
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder addNewWorkspaces(String newWorkspaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(newWorkspaces,
        "newWorkspaces cannot be null");
      if (this.newWorkspaces == null) {
        this.newWorkspaces = new ArrayList<String>();
      }
      this.newWorkspaces.add(newWorkspaces);
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the newDeleteWorkspaces.
     *
     * @param newDeleteWorkspaces the newDeleteWorkspaces
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder newDeleteWorkspaces(Boolean newDeleteWorkspaces) {
      this.newDeleteWorkspaces = newDeleteWorkspaces;
      return this;
    }

    /**
     * Set the newDestroyResources.
     *
     * @param newDestroyResources the newDestroyResources
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder newDestroyResources(Boolean newDestroyResources) {
      this.newDestroyResources = newDestroyResources;
      return this;
    }

    /**
     * Set the newJob.
     *
     * @param newJob the newJob
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder newJob(String newJob) {
      this.newJob = newJob;
      return this;
    }

    /**
     * Set the newVersion.
     *
     * @param newVersion the newVersion
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder newVersion(String newVersion) {
      this.newVersion = newVersion;
      return this;
    }

    /**
     * Set the newWorkspaces.
     * Existing newWorkspaces will be replaced.
     *
     * @param newWorkspaces the newWorkspaces
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder newWorkspaces(List<String> newWorkspaces) {
      this.newWorkspaces = newWorkspaces;
      return this;
    }

    /**
     * Set the destroyResources.
     *
     * @param destroyResources the destroyResources
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder destroyResources(String destroyResources) {
      this.destroyResources = destroyResources;
      return this;
    }
  }

  protected CreateWorkspaceDeletionJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    refreshToken = builder.refreshToken;
    newDeleteWorkspaces = builder.newDeleteWorkspaces;
    newDestroyResources = builder.newDestroyResources;
    newJob = builder.newJob;
    newVersion = builder.newVersion;
    newWorkspaces = builder.newWorkspaces;
    destroyResources = builder.destroyResources;
  }

  /**
   * New builder.
   *
   * @return a CreateWorkspaceDeletionJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token associated with the IBM Cloud account.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the newDeleteWorkspaces.
   *
   * True to delete workspace.
   *
   * @return the newDeleteWorkspaces
   */
  public Boolean newDeleteWorkspaces() {
    return newDeleteWorkspaces;
  }

  /**
   * Gets the newDestroyResources.
   *
   * True to destroy the resources managed by this workspace.
   *
   * @return the newDestroyResources
   */
  public Boolean newDestroyResources() {
    return newDestroyResources;
  }

  /**
   * Gets the newJob.
   *
   * Workspace deletion job name.
   *
   * @return the newJob
   */
  public String newJob() {
    return newJob;
  }

  /**
   * Gets the newVersion.
   *
   * Version of the terraform template.
   *
   * @return the newVersion
   */
  public String newVersion() {
    return newVersion;
  }

  /**
   * Gets the newWorkspaces.
   *
   * List of workspaces to be deleted.
   *
   * @return the newWorkspaces
   */
  public List<String> newWorkspaces() {
    return newWorkspaces;
  }

  /**
   * Gets the destroyResources.
   *
   * true or 1 - to destroy resources before deleting workspace;  If this is true, refresh_token is mandatory.
   *
   * @return the destroyResources
   */
  public String destroyResources() {
    return destroyResources;
  }
}

