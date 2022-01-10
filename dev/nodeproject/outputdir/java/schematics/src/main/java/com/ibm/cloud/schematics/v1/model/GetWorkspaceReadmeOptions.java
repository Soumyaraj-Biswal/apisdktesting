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
 * The getWorkspaceReadme options.
 */
public class GetWorkspaceReadmeOptions extends GenericModel {

  /**
   * The format of the readme file.  Value ''markdown'' will give markdown, otherwise html.
   */
  public interface Formatted {
    /** markdown. */
    String MARKDOWN = "markdown";
    /** html. */
    String HTML = "html";
  }

  protected String wId;
  protected String ref;
  protected String formatted;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String ref;
    private String formatted;

    private Builder(GetWorkspaceReadmeOptions getWorkspaceReadmeOptions) {
      this.wId = getWorkspaceReadmeOptions.wId;
      this.ref = getWorkspaceReadmeOptions.ref;
      this.formatted = getWorkspaceReadmeOptions.formatted;
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
     */
    public Builder(String wId) {
      this.wId = wId;
    }

    /**
     * Builds a GetWorkspaceReadmeOptions.
     *
     * @return the new GetWorkspaceReadmeOptions instance
     */
    public GetWorkspaceReadmeOptions build() {
      return new GetWorkspaceReadmeOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetWorkspaceReadmeOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the ref.
     *
     * @param ref the ref
     * @return the GetWorkspaceReadmeOptions builder
     */
    public Builder ref(String ref) {
      this.ref = ref;
      return this;
    }

    /**
     * Set the formatted.
     *
     * @param formatted the formatted
     * @return the GetWorkspaceReadmeOptions builder
     */
    public Builder formatted(String formatted) {
      this.formatted = formatted;
      return this;
    }
  }

  protected GetWorkspaceReadmeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
    ref = builder.ref;
    formatted = builder.formatted;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceReadmeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace for which you want to retrieve the `README.md` file that is stored in the GitHub or GitLab
   * repository that your workspace points to. To find the workspace ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the ref.
   *
   * The GitHub or GitLab branch where the `README.md` file is stored, or the commit ID or tag that references the
   * `README.md` file that you want to retrieve. If you do not specify this option, the `README.md` file is retrieved
   * from the master branch by default.
   *
   * @return the ref
   */
  public String ref() {
    return ref;
  }

  /**
   * Gets the formatted.
   *
   * The format of the readme file.  Value ''markdown'' will give markdown, otherwise html.
   *
   * @return the formatted
   */
  public String formatted() {
    return formatted;
  }
}

