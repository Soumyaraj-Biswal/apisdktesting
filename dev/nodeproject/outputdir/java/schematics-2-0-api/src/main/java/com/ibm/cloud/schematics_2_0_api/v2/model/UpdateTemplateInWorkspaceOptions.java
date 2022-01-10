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
 * The updateTemplateInWorkspace options.
 */
public class UpdateTemplateInWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected String templateId;
  protected Template template;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String templateId;
    private Template template;
    private String xGithubToken;

    private Builder(UpdateTemplateInWorkspaceOptions updateTemplateInWorkspaceOptions) {
      this.workspaceId = updateTemplateInWorkspaceOptions.workspaceId;
      this.templateId = updateTemplateInWorkspaceOptions.templateId;
      this.template = updateTemplateInWorkspaceOptions.template;
      this.xGithubToken = updateTemplateInWorkspaceOptions.xGithubToken;
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
     * @param templateId the templateId
     */
    public Builder(String workspaceId, String templateId) {
      this.workspaceId = workspaceId;
      this.templateId = templateId;
    }

    /**
     * Builds a UpdateTemplateInWorkspaceOptions.
     *
     * @return the new UpdateTemplateInWorkspaceOptions instance
     */
    public UpdateTemplateInWorkspaceOptions build() {
      return new UpdateTemplateInWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the UpdateTemplateInWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the UpdateTemplateInWorkspaceOptions builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the template.
     *
     * @param template the template
     * @return the UpdateTemplateInWorkspaceOptions builder
     */
    public Builder template(Template template) {
      this.template = template;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the UpdateTemplateInWorkspaceOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected UpdateTemplateInWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.templateId,
      "templateId cannot be empty");
    workspaceId = builder.workspaceId;
    templateId = builder.templateId;
    template = builder.template;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a UpdateTemplateInWorkspaceOptions builder
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
   * Gets the templateId.
   *
   * Template Id.  Use GET /workspaces/&lt;workspace_id&gt;/templates API to look up the  Template Ids in your
   * Workspaces.
   *
   * @return the templateId
   */
  public String templateId() {
    return templateId;
  }

  /**
   * Gets the template.
   *
   * Update the Template definition in the Workspace.
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

