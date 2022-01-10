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
 * The processTemplateMetaData options.
 */
public class ProcessTemplateMetaDataOptions extends GenericModel {

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
    /** cos_bucket. */
    String COS_BUCKET = "cos_bucket";
  }

  protected String templateType;
  protected ExternalSource source;
  protected String region;
  protected String sourceType;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String templateType;
    private ExternalSource source;
    private String region;
    private String sourceType;
    private String xGithubToken;

    private Builder(ProcessTemplateMetaDataOptions processTemplateMetaDataOptions) {
      this.templateType = processTemplateMetaDataOptions.templateType;
      this.source = processTemplateMetaDataOptions.source;
      this.region = processTemplateMetaDataOptions.region;
      this.sourceType = processTemplateMetaDataOptions.sourceType;
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
     * @param templateType the templateType
     * @param source the source
     */
    public Builder(String templateType, ExternalSource source) {
      this.templateType = templateType;
      this.source = source;
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
     * Set the templateType.
     *
     * @param templateType the templateType
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder templateType(String templateType) {
      this.templateType = templateType;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the ProcessTemplateMetaDataOptions builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.templateType,
      "templateType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    templateType = builder.templateType;
    source = builder.source;
    region = builder.region;
    sourceType = builder.sourceType;
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
   * Gets the templateType.
   *
   * Template type such as **terraform**, **ansible**, **helm**, **cloudpak**, or **bash script**.
   *
   * @return the templateType
   */
  public String templateType() {
    return templateType;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the region.
   *
   * Region on which request should process. Applicable only on global endpoint.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
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

