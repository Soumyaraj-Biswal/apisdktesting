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
 * The processTemplateMetaData options.
 */
public class ProcessTemplateMetaDataOptions extends GenericModel {

  protected TemplateMetaDataRequest templateMetaDataRequest;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private TemplateMetaDataRequest templateMetaDataRequest;
    private String xGithubToken;

    private Builder(ProcessTemplateMetaDataOptions processTemplateMetaDataOptions) {
      this.templateMetaDataRequest = processTemplateMetaDataOptions.templateMetaDataRequest;
      this.xGithubToken = processTemplateMetaDataOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param templateMetaDataRequest the templateMetaDataRequest
     */
    public Builder(TemplateMetaDataRequest templateMetaDataRequest) {
      this.templateMetaDataRequest = templateMetaDataRequest;
    }

    /**
     * Builds a ProcessTemplateMetaDataOptions.
     *
     * @return the new ProcessTemplateMetaDataOptions instance
     */
    public ProcessTemplateMetaDataOptions build() {
      return new ProcessTemplateMetaDataOptions(this);
    }

    /**
     * Set the templateMetaDataRequest.
     *
     * @param templateMetaDataRequest the templateMetaDataRequest
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder templateMetaDataRequest(TemplateMetaDataRequest templateMetaDataRequest) {
      this.templateMetaDataRequest = templateMetaDataRequest;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected ProcessTemplateMetaDataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.templateMetaDataRequest,
      "templateMetaDataRequest cannot be null");
    templateMetaDataRequest = builder.templateMetaDataRequest;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a ProcessTemplateMetaDataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templateMetaDataRequest.
   *
   * Create template metadata request.
   *
   * @return the templateMetaDataRequest
   */
  public TemplateMetaDataRequest templateMetaDataRequest() {
    return templateMetaDataRequest;
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

