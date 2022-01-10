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
 * The createWorkspace options.
 */
public class CreateWorkspaceOptions extends GenericModel {

  protected Workspace workspace;

  /**
   * Builder.
   */
  public static class Builder {
    private Workspace workspace;

    private Builder(CreateWorkspaceOptions createWorkspaceOptions) {
      this.workspace = createWorkspaceOptions.workspace;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workspace the workspace
     */
    public Builder(Workspace workspace) {
      this.workspace = workspace;
    }

    /**
     * Builds a CreateWorkspaceOptions.
     *
     * @return the new CreateWorkspaceOptions instance
     */
    public CreateWorkspaceOptions build() {
      return new CreateWorkspaceOptions(this);
    }

    /**
     * Set the workspace.
     *
     * @param workspace the workspace
     * @return the CreateWorkspaceOptions builder
     */
    public Builder workspace(Workspace workspace) {
      this.workspace = workspace;
      return this;
    }
  }

  protected CreateWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workspace,
      "workspace cannot be null");
    workspace = builder.workspace;
  }

  /**
   * New builder.
   *
   * @return a CreateWorkspaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspace.
   *
   * Create a Workspace in your Account.
   *
   * @return the workspace
   */
  public Workspace workspace() {
    return workspace;
  }
}

