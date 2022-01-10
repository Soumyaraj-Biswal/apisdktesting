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
 * The addTemplatesToWorkspace options.
 */
public class AddTemplatesToWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected Template template;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private Template template;
    private String xGithubToken;

    private Builder(AddTemplatesToWorkspaceOptions addTemplatesToWorkspaceOptions) {
      this.workspaceId = addTemplatesToWorkspaceOptions.workspaceId;
      this.template = addTemplatesToWorkspaceOptions.template;
      this.xGithubToken = addTemplatesToWorkspaceOptions.xGithubToken;
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
     * @param template the template
     */
    public Builder(String workspaceId, Template template) {
      this.workspaceId = workspaceId;
      this.template = template;
    }

    /**
     * Builds a AddTemplatesToWorkspaceOptions.
     *
     * @return the new AddTemplatesToWorkspaceOptions instance
     */
    public AddTemplatesToWorkspaceOptions build() {
      return new AddTemplatesToWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the AddTemplatesToWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the template.
     *
     * @param template the template
     * @return the AddTemplatesToWorkspaceOptions builder
     */
    public Builder template(Template template) {
      this.template = template;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the AddTemplatesToWorkspaceOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected AddTemplatesToWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.template,
      "template cannot be null");
    workspaceId = builder.workspaceId;
    template = builder.template;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a AddTemplatesToWorkspaceOptions builder
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
   * Gets the template.
   *
   * Add a new Template to the Workspace.
   *
   * @return the template
   */
  public Template template() {
    return template;
  }

  /**
   * Gets the xGithubToken.
   *
   * The personal access token associated with your GitHub or GitLab repository, required to clone the repository.
   *
   * @return the xGithubToken
   */
  public String xGithubToken() {
    return xGithubToken;
  }
}

