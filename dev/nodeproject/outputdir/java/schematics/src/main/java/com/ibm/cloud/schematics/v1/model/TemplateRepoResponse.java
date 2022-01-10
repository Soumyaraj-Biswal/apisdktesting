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
 * Information about the Template repository used by the workspace.
 */
public class TemplateRepoResponse extends GenericModel {

  protected String branch;
  @SerializedName("full_url")
  protected String fullUrl;
  @SerializedName("has_uploadedgitrepotar")
  protected Boolean hasUploadedgitrepotar;
  protected String release;
  @SerializedName("repo_sha_value")
  protected String repoShaValue;
  @SerializedName("repo_url")
  protected String repoUrl;
  protected String url;

  /**
   * Gets the branch.
   *
   * The repository branch.
   *
   * @return the branch
   */
  public String getBranch() {
    return branch;
  }

  /**
   * Gets the fullUrl.
   *
   * Full repository URL.
   *
   * @return the fullUrl
   */
  public String getFullUrl() {
    return fullUrl;
  }

  /**
   * Gets the hasUploadedgitrepotar.
   *
   * Has uploaded Git repository tar.
   *
   * @return the hasUploadedgitrepotar
   */
  public Boolean isHasUploadedgitrepotar() {
    return hasUploadedgitrepotar;
  }

  /**
   * Gets the release.
   *
   * The repository release.
   *
   * @return the release
   */
  public String getRelease() {
    return release;
  }

  /**
   * Gets the repoShaValue.
   *
   * The repository SHA value.
   *
   * @return the repoShaValue
   */
  public String getRepoShaValue() {
    return repoShaValue;
  }

  /**
   * Gets the repoUrl.
   *
   * The repository URL.
   *
   * @return the repoUrl
   */
  public String getRepoUrl() {
    return repoUrl;
  }

  /**
   * Gets the url.
   *
   * The source URL.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }
}

