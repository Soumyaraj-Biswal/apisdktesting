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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * The connection details to the Git source repository.
 */
public class ExternalSourceGit extends DynamicModel<Object> {

  @SerializedName("computed_git_repo_url")
  protected String computedGitRepoUrl;
  @SerializedName("git_repo_url")
  protected String gitRepoUrl;
  @SerializedName("git_token")
  protected String gitToken;
  @SerializedName("git_repo_folder")
  protected String gitRepoFolder;
  @SerializedName("git_release")
  protected String gitRelease;
  @SerializedName("git_branch")
  protected String gitBranch;

  public ExternalSourceGit() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String computedGitRepoUrl;
    private String gitRepoUrl;
    private String gitToken;
    private String gitRepoFolder;
    private String gitRelease;
    private String gitBranch;
    private Map<String, Object> dynamicProperties;

    private Builder(ExternalSourceGit externalSourceGit) {
      this.computedGitRepoUrl = externalSourceGit.computedGitRepoUrl;
      this.gitRepoUrl = externalSourceGit.gitRepoUrl;
      this.gitToken = externalSourceGit.gitToken;
      this.gitRepoFolder = externalSourceGit.gitRepoFolder;
      this.gitRelease = externalSourceGit.gitRelease;
      this.gitBranch = externalSourceGit.gitBranch;
      this.dynamicProperties = externalSourceGit.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExternalSourceGit.
     *
     * @return the new ExternalSourceGit instance
     */
    public ExternalSourceGit build() {
      return new ExternalSourceGit(this);
    }

    /**
     * Set the computedGitRepoUrl.
     *
     * @param computedGitRepoUrl the computedGitRepoUrl
     * @return the ExternalSourceGit builder
     */
    public Builder computedGitRepoUrl(String computedGitRepoUrl) {
      this.computedGitRepoUrl = computedGitRepoUrl;
      return this;
    }

    /**
     * Set the gitRepoUrl.
     *
     * @param gitRepoUrl the gitRepoUrl
     * @return the ExternalSourceGit builder
     */
    public Builder gitRepoUrl(String gitRepoUrl) {
      this.gitRepoUrl = gitRepoUrl;
      return this;
    }

    /**
     * Set the gitToken.
     *
     * @param gitToken the gitToken
     * @return the ExternalSourceGit builder
     */
    public Builder gitToken(String gitToken) {
      this.gitToken = gitToken;
      return this;
    }

    /**
     * Set the gitRepoFolder.
     *
     * @param gitRepoFolder the gitRepoFolder
     * @return the ExternalSourceGit builder
     */
    public Builder gitRepoFolder(String gitRepoFolder) {
      this.gitRepoFolder = gitRepoFolder;
      return this;
    }

    /**
     * Set the gitRelease.
     *
     * @param gitRelease the gitRelease
     * @return the ExternalSourceGit builder
     */
    public Builder gitRelease(String gitRelease) {
      this.gitRelease = gitRelease;
      return this;
    }

    /**
     * Set the gitBranch.
     *
     * @param gitBranch the gitBranch
     * @return the ExternalSourceGit builder
     */
    public Builder gitBranch(String gitBranch) {
      this.gitBranch = gitBranch;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ExternalSourceGit builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected ExternalSourceGit(Builder builder) {
    super(new TypeToken<Object>() { });
    computedGitRepoUrl = builder.computedGitRepoUrl;
    gitRepoUrl = builder.gitRepoUrl;
    gitToken = builder.gitToken;
    gitRepoFolder = builder.gitRepoFolder;
    gitRelease = builder.gitRelease;
    gitBranch = builder.gitBranch;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ExternalSourceGit builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the computedGitRepoUrl.
   *
   * The complete URL which is computed by the **git_repo_url**, **git_repo_folder**, and **branch**.
   *
   * @return the computedGitRepoUrl
   */
  public String getComputedGitRepoUrl() {
    return this.computedGitRepoUrl;
  }

  /**
   * Sets the computedGitRepoUrl.
   *
   * @param computedGitRepoUrl the new computedGitRepoUrl
   */
  public void setComputedGitRepoUrl(final String computedGitRepoUrl) {
    this.computedGitRepoUrl = computedGitRepoUrl;
  }

  /**
   * Gets the gitRepoUrl.
   *
   * The URL to the Git repository that can be used to clone the template.
   *
   * @return the gitRepoUrl
   */
  public String getGitRepoUrl() {
    return this.gitRepoUrl;
  }

  /**
   * Sets the gitRepoUrl.
   *
   * @param gitRepoUrl the new gitRepoUrl
   */
  public void setGitRepoUrl(final String gitRepoUrl) {
    this.gitRepoUrl = gitRepoUrl;
  }

  /**
   * Gets the gitToken.
   *
   * The Personal Access Token (PAT) to connect to the Git URLs.
   *
   * @return the gitToken
   */
  public String getGitToken() {
    return this.gitToken;
  }

  /**
   * Sets the gitToken.
   *
   * @param gitToken the new gitToken
   */
  public void setGitToken(final String gitToken) {
    this.gitToken = gitToken;
  }

  /**
   * Gets the gitRepoFolder.
   *
   * The name of the folder in the Git repository, that contains the template.
   *
   * @return the gitRepoFolder
   */
  public String getGitRepoFolder() {
    return this.gitRepoFolder;
  }

  /**
   * Sets the gitRepoFolder.
   *
   * @param gitRepoFolder the new gitRepoFolder
   */
  public void setGitRepoFolder(final String gitRepoFolder) {
    this.gitRepoFolder = gitRepoFolder;
  }

  /**
   * Gets the gitRelease.
   *
   * The name of the release tag that are used to fetch the Git repository.
   *
   * @return the gitRelease
   */
  public String getGitRelease() {
    return this.gitRelease;
  }

  /**
   * Sets the gitRelease.
   *
   * @param gitRelease the new gitRelease
   */
  public void setGitRelease(final String gitRelease) {
    this.gitRelease = gitRelease;
  }

  /**
   * Gets the gitBranch.
   *
   * The name of the branch that are used to fetch the Git repository.
   *
   * @return the gitBranch
   */
  public String getGitBranch() {
    return this.gitBranch;
  }

  /**
   * Sets the gitBranch.
   *
   * @param gitBranch the new gitBranch
   */
  public void setGitBranch(final String gitBranch) {
    this.gitBranch = gitBranch;
  }
}
