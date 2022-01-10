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
 * The connection details to the Git source repository.
 */
public class ExternalSourceGit extends GenericModel {

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

    private Builder(ExternalSourceGit externalSourceGit) {
      this.computedGitRepoUrl = externalSourceGit.computedGitRepoUrl;
      this.gitRepoUrl = externalSourceGit.gitRepoUrl;
      this.gitToken = externalSourceGit.gitToken;
      this.gitRepoFolder = externalSourceGit.gitRepoFolder;
      this.gitRelease = externalSourceGit.gitRelease;
      this.gitBranch = externalSourceGit.gitBranch;
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
  }

  protected ExternalSourceGit(Builder builder) {
    computedGitRepoUrl = builder.computedGitRepoUrl;
    gitRepoUrl = builder.gitRepoUrl;
    gitToken = builder.gitToken;
    gitRepoFolder = builder.gitRepoFolder;
    gitRelease = builder.gitRelease;
    gitBranch = builder.gitBranch;
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
  public String computedGitRepoUrl() {
    return computedGitRepoUrl;
  }

  /**
   * Gets the gitRepoUrl.
   *
   * The URL to the Git repository that can be used to clone the template.
   *
   * @return the gitRepoUrl
   */
  public String gitRepoUrl() {
    return gitRepoUrl;
  }

  /**
   * Gets the gitToken.
   *
   * The personal access token to connect to the Git URLs.
   *
   * @return the gitToken
   */
  public String gitToken() {
    return gitToken;
  }

  /**
   * Gets the gitRepoFolder.
   *
   * The name of the folder in the Git repository, that contains the template.
   *
   * @return the gitRepoFolder
   */
  public String gitRepoFolder() {
    return gitRepoFolder;
  }

  /**
   * Gets the gitRelease.
   *
   * The name of the release tag that are used to fetch the Git repository.
   *
   * @return the gitRelease
   */
  public String gitRelease() {
    return gitRelease;
  }

  /**
   * Gets the gitBranch.
   *
   * The name of the branch that are used to fetch the Git repository.
   *
   * @return the gitBranch
   */
  public String gitBranch() {
    return gitBranch;
  }
}

