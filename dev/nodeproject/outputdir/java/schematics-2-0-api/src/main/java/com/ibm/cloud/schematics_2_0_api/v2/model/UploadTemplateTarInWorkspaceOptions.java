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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The uploadTemplateTarInWorkspace options.
 */
public class UploadTemplateTarInWorkspaceOptions extends GenericModel {

  protected String workspaceId;
  protected String templateId;
  protected InputStream tarFile;
  protected String tarFileContentType;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String templateId;
    private InputStream tarFile;
    private String tarFileContentType;
    private String xGithubToken;

    private Builder(UploadTemplateTarInWorkspaceOptions uploadTemplateTarInWorkspaceOptions) {
      this.workspaceId = uploadTemplateTarInWorkspaceOptions.workspaceId;
      this.templateId = uploadTemplateTarInWorkspaceOptions.templateId;
      this.tarFile = uploadTemplateTarInWorkspaceOptions.tarFile;
      this.tarFileContentType = uploadTemplateTarInWorkspaceOptions.tarFileContentType;
      this.xGithubToken = uploadTemplateTarInWorkspaceOptions.xGithubToken;
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
     * Builds a UploadTemplateTarInWorkspaceOptions.
     *
     * @return the new UploadTemplateTarInWorkspaceOptions instance
     */
    public UploadTemplateTarInWorkspaceOptions build() {
      return new UploadTemplateTarInWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the UploadTemplateTarInWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the UploadTemplateTarInWorkspaceOptions builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the tarFile.
     *
     * @param tarFile the tarFile
     * @return the UploadTemplateTarInWorkspaceOptions builder
     */
    public Builder tarFile(InputStream tarFile) {
      this.tarFile = tarFile;
      return this;
    }

    /**
     * Set the tarFileContentType.
     *
     * @param tarFileContentType the tarFileContentType
     * @return the UploadTemplateTarInWorkspaceOptions builder
     */
    public Builder tarFileContentType(String tarFileContentType) {
      this.tarFileContentType = tarFileContentType;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the UploadTemplateTarInWorkspaceOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }

    /**
     * Set the tarFile.
     *
     * @param tarFile the tarFile
     * @return the UploadTemplateTarInWorkspaceOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder tarFile(File tarFile) throws FileNotFoundException {
      this.tarFile = new FileInputStream(tarFile);
      return this;
    }
  }

  protected UploadTemplateTarInWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.templateId,
      "templateId cannot be empty");
    workspaceId = builder.workspaceId;
    templateId = builder.templateId;
    tarFile = builder.tarFile;
    tarFileContentType = builder.tarFileContentType;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a UploadTemplateTarInWorkspaceOptions builder
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
   * Gets the tarFile.
   *
   * Template tar file.
   *
   * @return the tarFile
   */
  public InputStream tarFile() {
    return tarFile;
  }

  /**
   * Gets the tarFileContentType.
   *
   * The content type of tarFile. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the tarFileContentType
   */
  public String tarFileContentType() {
    return tarFileContentType;
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

