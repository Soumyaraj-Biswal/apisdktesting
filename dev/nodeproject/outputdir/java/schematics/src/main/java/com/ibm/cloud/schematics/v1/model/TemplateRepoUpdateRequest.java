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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Input to update the template repository data.
 */
public class TemplateRepoUpdateRequest extends GenericModel {

  protected String branch;
  protected String release;
  @SerializedName("repo_sha_value")
  protected String repoShaValue;
  @SerializedName("repo_url")
  protected String repoUrl;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String branch;
    private String release;
    private String repoShaValue;
    private String repoUrl;
    private String url;

    private Builder(TemplateRepoUpdateRequest templateRepoUpdateRequest) {
      this.branch = templateRepoUpdateRequest.branch;
      this.release = templateRepoUpdateRequest.release;
      this.repoShaValue = templateRepoUpdateRequest.repoShaValue;
      this.repoUrl = templateRepoUpdateRequest.repoUrl;
      this.url = templateRepoUpdateRequest.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateRepoUpdateRequest.
     *
     * @return the new TemplateRepoUpdateRequest instance
     */
    public TemplateRepoUpdateRequest build() {
      return new TemplateRepoUpdateRequest(this);
    }

    /**
     * Set the branch.
     *
     * @param branch the branch
     * @return the TemplateRepoUpdateRequest builder
     */
    public Builder branch(String branch) {
      this.branch = branch;
      return this;
    }

    /**
     * Set the release.
     *
     * @param release the release
     * @return the TemplateRepoUpdateRequest builder
     */
    public Builder release(String release) {
      this.release = release;
      return this;
    }

    /**
     * Set the repoShaValue.
     *
     * @param repoShaValue the repoShaValue
     * @return the TemplateRepoUpdateRequest builder
     */
    public Builder repoShaValue(String repoShaValue) {
      this.repoShaValue = repoShaValue;
      return this;
    }

    /**
     * Set the repoUrl.
     *
     * @param repoUrl the repoUrl
     * @return the TemplateRepoUpdateRequest builder
     */
    public Builder repoUrl(String repoUrl) {
      this.repoUrl = repoUrl;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the TemplateRepoUpdateRequest builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected TemplateRepoUpdateRequest(Builder builder) {
    branch = builder.branch;
    release = builder.release;
    repoShaValue = builder.repoShaValue;
    repoUrl = builder.repoUrl;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a TemplateRepoUpdateRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the branch.
   *
   * The repository branch.
   *
   * @return the branch
   */
  public String branch() {
    return branch;
  }

  /**
   * Gets the release.
   *
   * The repository release.
   *
   * @return the release
   */
  public String release() {
    return release;
  }

  /**
   * Gets the repoShaValue.
   *
   * The repository SHA value.
   *
   * @return the repoShaValue
   */
  public String repoShaValue() {
    return repoShaValue;
  }

  /**
   * Gets the repoUrl.
   *
   * The repository URL.
   *
   * @return the repoUrl
   */
  public String repoUrl() {
    return repoUrl;
  }

  /**
   * Gets the url.
   *
   * The source URL.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

