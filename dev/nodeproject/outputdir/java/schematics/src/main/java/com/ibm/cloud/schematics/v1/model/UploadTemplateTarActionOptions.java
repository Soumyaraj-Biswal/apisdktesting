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
 * The uploadTemplateTarAction options.
 */
public class UploadTemplateTarActionOptions extends GenericModel {

  protected String actionId;
  protected InputStream file;
  protected String fileContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private InputStream file;
    private String fileContentType;

    private Builder(UploadTemplateTarActionOptions uploadTemplateTarActionOptions) {
      this.actionId = uploadTemplateTarActionOptions.actionId;
      this.file = uploadTemplateTarActionOptions.file;
      this.fileContentType = uploadTemplateTarActionOptions.fileContentType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionId the actionId
     */
    public Builder(String actionId) {
      this.actionId = actionId;
    }

    /**
     * Builds a UploadTemplateTarActionOptions.
     *
     * @return the new UploadTemplateTarActionOptions instance
     */
    public UploadTemplateTarActionOptions build() {
      return new UploadTemplateTarActionOptions(this);
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the UploadTemplateTarActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarActionOptions builder
     */
    public Builder file(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Set the fileContentType.
     *
     * @param fileContentType the fileContentType
     * @return the UploadTemplateTarActionOptions builder
     */
    public Builder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarActionOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder file(File file) throws FileNotFoundException {
      this.file = new FileInputStream(file);
      return this;
    }
  }

  protected UploadTemplateTarActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    actionId = builder.actionId;
    file = builder.file;
    fileContentType = builder.fileContentType;
  }

  /**
   * New builder.
   *
   * @return a UploadTemplateTarActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionId.
   *
   * Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
  }

  /**
   * Gets the file.
   *
   * Template tar file.
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

