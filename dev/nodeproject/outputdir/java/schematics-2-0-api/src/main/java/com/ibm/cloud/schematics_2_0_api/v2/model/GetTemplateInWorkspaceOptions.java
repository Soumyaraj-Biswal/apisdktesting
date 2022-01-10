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
 * The getTemplateInWorkspace options.
 */
public class GetTemplateInWorkspaceOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
  }

  protected String workspaceId;
  protected String templateId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String templateId;
    private String profile;

    private Builder(GetTemplateInWorkspaceOptions getTemplateInWorkspaceOptions) {
      this.workspaceId = getTemplateInWorkspaceOptions.workspaceId;
      this.templateId = getTemplateInWorkspaceOptions.templateId;
      this.profile = getTemplateInWorkspaceOptions.profile;
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
     * Builds a GetTemplateInWorkspaceOptions.
     *
     * @return the new GetTemplateInWorkspaceOptions instance
     */
    public GetTemplateInWorkspaceOptions build() {
      return new GetTemplateInWorkspaceOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the GetTemplateInWorkspaceOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the GetTemplateInWorkspaceOptions builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetTemplateInWorkspaceOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetTemplateInWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.templateId,
      "templateId cannot be empty");
    workspaceId = builder.workspaceId;
    templateId = builder.templateId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetTemplateInWorkspaceOptions builder
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
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

