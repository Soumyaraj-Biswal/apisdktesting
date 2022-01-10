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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The uploadTemplateTar options.
 */
public class UploadTemplateTarOptions extends GenericModel {

  protected String wId;
  protected String tId;
  protected InputStream file;
  protected String fileContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String tId;
    private InputStream file;
    private String fileContentType;

    private Builder(UploadTemplateTarOptions uploadTemplateTarOptions) {
      this.wId = uploadTemplateTarOptions.wId;
      this.tId = uploadTemplateTarOptions.tId;
      this.file = uploadTemplateTarOptions.file;
      this.fileContentType = uploadTemplateTarOptions.fileContentType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param tId the tId
     */
    public Builder(String wId, String tId) {
      this.wId = wId;
      this.tId = tId;
    }

    /**
     * Builds a UploadTemplateTarOptions.
     *
     * @return the new UploadTemplateTarOptions instance
     */
    public UploadTemplateTarOptions build() {
      return new UploadTemplateTarOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the UploadTemplateTarOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the tId.
     *
     * @param tId the tId
     * @return the UploadTemplateTarOptions builder
     */
    public Builder tId(String tId) {
      this.tId = tId;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarOptions builder
     */
    public Builder file(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Set the fileContentType.
     *
     * @param fileContentType the fileContentType
     * @return the UploadTemplateTarOptions builder
     */
    public Builder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder file(File file) throws FileNotFoundException {
      this.file = new FileInputStream(file);
      return this;
    }
  }

  protected UploadTemplateTarOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tId,
      "tId cannot be empty");
    wId = builder.wId;
    tId = builder.tId;
    file = builder.file;
    fileContentType = builder.fileContentType;
  }

  /**
   * New builder.
   *
   * @return a UploadTemplateTarOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace where you want to upload your `.tar` file. To find the workspace ID, use the `GET
   * /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the tId.
   *
   * The ID of the Terraform template in your workspace. When you create a workspace, a unique ID is assigned to your
   * Terraform template, even if no template was provided during workspace creation. To find this ID, use the `GET
   * /v1/workspaces` API and review the `template_data.id` value.
   *
   * @return the tId
   */
  public String tId() {
    return tId;
  }

  /**
   * Gets the file.
   *
   * You can upload the `TAR` file of your template repository, to the workspace by using `tar` command to create the
   * file. For example, `tar -cvf mytarfile.tar $TEMPLATE_REPO_FOLDER`.
   *
   * @return the file
   */
  public InputStream file() {
    return file;
  }

  /**
   * Gets the fileContentType.
   *
   * The content type of file. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the fileContentType
   */
  public String fileContentType() {
    return fileContentType;
  }
}

