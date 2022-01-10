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
 * The createWorkspaceTemplates options.
 */
public class CreateWorkspaceTemplatesOptions extends GenericModel {

  protected TemplateListRequest templateListRequest;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private TemplateListRequest templateListRequest;
    private String xGithubToken;

    private Builder(CreateWorkspaceTemplatesOptions createWorkspaceTemplatesOptions) {
      this.templateListRequest = createWorkspaceTemplatesOptions.templateListRequest;
      this.xGithubToken = createWorkspaceTemplatesOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param templateListRequest the templateListRequest
     */
    public Builder(TemplateListRequest templateListRequest) {
      this.templateListRequest = templateListRequest;
    }

    /**
     * Builds a CreateWorkspaceTemplatesOptions.
     *
     * @return the new CreateWorkspaceTemplatesOptions instance
     */
    public CreateWorkspaceTemplatesOptions build() {
      return new CreateWorkspaceTemplatesOptions(this);
    }

    /**
     * Set the templateListRequest.
     *
     * @param templateListRequest the templateListRequest
     * @return the CreateWorkspaceTemplatesOptions builder
     */
    public Builder templateListRequest(TemplateListRequest templateListRequest) {
      this.templateListRequest = templateListRequest;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the CreateWorkspaceTemplatesOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected CreateWorkspaceTemplatesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.templateListRequest,
      "templateListRequest cannot be null");
    templateListRequest = builder.templateListRequest;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a CreateWorkspaceTemplatesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templateListRequest.
   *
   * List of Templates.
   *
   * @return the templateListRequest
   */
  public TemplateListRequest templateListRequest() {
    return templateListRequest;
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

