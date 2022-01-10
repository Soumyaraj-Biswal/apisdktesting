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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createWorkspace options.
 */
public class CreateWorkspaceOptions extends GenericModel {

  protected List<String> appliedShareddataIds;
  protected CatalogRef catalogRef;
  protected String description;
  protected String location;
  protected String name;
  protected String resourceGroup;
  protected SharedTargetData sharedData;
  protected List<String> tags;
  protected List<TemplateSourceDataRequest> templateData;
  protected String templateRef;
  protected TemplateRepoRequest templateRepo;
  protected List<String> type;
  protected WorkspaceStatusRequest workspaceStatus;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> appliedShareddataIds;
    private CatalogRef catalogRef;
    private String description;
    private String location;
    private String name;
    private String resourceGroup;
    private SharedTargetData sharedData;
    private List<String> tags;
    private List<TemplateSourceDataRequest> templateData;
    private String templateRef;
    private TemplateRepoRequest templateRepo;
    private List<String> type;
    private WorkspaceStatusRequest workspaceStatus;
    private String xGithubToken;

    private Builder(CreateWorkspaceOptions createWorkspaceOptions) {
      this.appliedShareddataIds = createWorkspaceOptions.appliedShareddataIds;
      this.catalogRef = createWorkspaceOptions.catalogRef;
      this.description = createWorkspaceOptions.description;
      this.location = createWorkspaceOptions.location;
      this.name = createWorkspaceOptions.name;
      this.resourceGroup = createWorkspaceOptions.resourceGroup;
      this.sharedData = createWorkspaceOptions.sharedData;
      this.tags = createWorkspaceOptions.tags;
      this.templateData = createWorkspaceOptions.templateData;
      this.templateRef = createWorkspaceOptions.templateRef;
      this.templateRepo = createWorkspaceOptions.templateRepo;
      this.type = createWorkspaceOptions.type;
      this.workspaceStatus = createWorkspaceOptions.workspaceStatus;
      this.xGithubToken = createWorkspaceOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateWorkspaceOptions.
     *
     * @return the new CreateWorkspaceOptions instance
     */
    public CreateWorkspaceOptions build() {
      return new CreateWorkspaceOptions(this);
    }

    /**
     * Adds an appliedShareddataIds to appliedShareddataIds.
     *
     * @param appliedShareddataIds the new appliedShareddataIds
     * @return the CreateWorkspaceOptions builder
     */
    public Builder addAppliedShareddataIds(String appliedShareddataIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(appliedShareddataIds,
        "appliedShareddataIds cannot be null");
      if (this.appliedShareddataIds == null) {
        this.appliedShareddataIds = new ArrayList<String>();
      }
      this.appliedShareddataIds.add(appliedShareddataIds);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateWorkspaceOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an templateData to templateData.
     *
     * @param templateData the new templateData
     * @return the CreateWorkspaceOptions builder
     */
    public Builder addTemplateData(TemplateSourceDataRequest templateData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templateData,
        "templateData cannot be null");
      if (this.templateData == null) {
        this.templateData = new ArrayList<TemplateSourceDataRequest>();
      }
      this.templateData.add(templateData);
      return this;
    }

    /**
     * Adds an type to type.
     *
     * @param type the new type
     * @return the CreateWorkspaceOptions builder
     */
    public Builder addType(String type) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(type,
        "type cannot be null");
      if (this.type == null) {
        this.type = new ArrayList<String>();
      }
      this.type.add(type);
      return this;
    }

    /**
     * Set the appliedShareddataIds.
     * Existing appliedShareddataIds will be replaced.
     *
     * @param appliedShareddataIds the appliedShareddataIds
     * @return the CreateWorkspaceOptions builder
     */
    public Builder appliedShareddataIds(List<String> appliedShareddataIds) {
      this.appliedShareddataIds = appliedShareddataIds;
      return this;
    }

    /**
     * Set the catalogRef.
     *
     * @param catalogRef the catalogRef
     * @return the CreateWorkspaceOptions builder
     */
    public Builder catalogRef(CatalogRef catalogRef) {
      this.catalogRef = catalogRef;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateWorkspaceOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateWorkspaceOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateWorkspaceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateWorkspaceOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the sharedData.
     *
     * @param sharedData the sharedData
     * @return the CreateWorkspaceOptions builder
     */
    public Builder sharedData(SharedTargetData sharedData) {
      this.sharedData = sharedData;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateWorkspaceOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the templateData.
     * Existing templateData will be replaced.
     *
     * @param templateData the templateData
     * @return the CreateWorkspaceOptions builder
     */
    public Builder templateData(List<TemplateSourceDataRequest> templateData) {
      this.templateData = templateData;
      return this;
    }

    /**
     * Set the templateRef.
     *
     * @param templateRef the templateRef
     * @return the CreateWorkspaceOptions builder
     */
    public Builder templateRef(String templateRef) {
      this.templateRef = templateRef;
      return this;
    }

    /**
     * Set the templateRepo.
     *
     * @param templateRepo the templateRepo
     * @return the CreateWorkspaceOptions builder
     */
    public Builder templateRepo(TemplateRepoRequest templateRepo) {
      this.templateRepo = templateRepo;
      return this;
    }

    /**
     * Set the type.
     * Existing type will be replaced.
     *
     * @param type the type
     * @return the CreateWorkspaceOptions builder
     */
    public Builder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     * Set the workspaceStatus.
     *
     * @param workspaceStatus the workspaceStatus
     * @return the CreateWorkspaceOptions builder
     */
    public Builder workspaceStatus(WorkspaceStatusRequest workspaceStatus) {
      this.workspaceStatus = workspaceStatus;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the CreateWorkspaceOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected CreateWorkspaceOptions(Builder builder) {
    appliedShareddataIds = builder.appliedShareddataIds;
    catalogRef = builder.catalogRef;
    description = builder.description;
    location = builder.location;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    sharedData = builder.sharedData;
    tags = builder.tags;
    templateData = builder.templateData;
    templateRef = builder.templateRef;
    templateRepo = builder.templateRepo;
    type = builder.type;
    workspaceStatus = builder.workspaceStatus;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a CreateWorkspaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the appliedShareddataIds.
   *
   * List of applied shared dataset ID.
   *
   * @return the appliedShareddataIds
   */
  public List<String> appliedShareddataIds() {
    return appliedShareddataIds;
  }

  /**
   * Gets the catalogRef.
   *
   * Information about the software template that you chose from the IBM Cloud catalog. This information is returned for
   * IBM Cloud catalog offerings only.
   *
   * @return the catalogRef
   */
  public CatalogRef catalogRef() {
    return catalogRef;
  }

  /**
   * Gets the description.
   *
   * The description of the workspace.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the location.
   *
   * The location where you want to create your Schematics workspace and run the Schematics jobs. The location that you
   * enter must match the API endpoint that you use. For example, if you use the Frankfurt API endpoint, you must
   * specify `eu-de` as your location. If you use an API endpoint for a geography and you do not specify a location,
   * Schematics determines the location based on availability.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the name.
   *
   * The name of your workspace. The name can be up to 128 characters long and can include alphanumeric characters,
   * spaces, dashes, and underscores. When you create a workspace for your own Terraform template, consider including
   * the microservice component that you set up with your Terraform template and the IBM Cloud environment where you
   * want to deploy your resources in your name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The ID of the resource group where you want to provision the workspace.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the sharedData.
   *
   * Information about the Target used by the templates originating from the  IBM Cloud catalog offerings. This
   * information is not relevant for workspace created using your own Terraform template.
   *
   * @return the sharedData
   */
  public SharedTargetData sharedData() {
    return sharedData;
  }

  /**
   * Gets the tags.
   *
   * A list of tags that are associated with the workspace.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the templateData.
   *
   * Input data for the Template.
   *
   * @return the templateData
   */
  public List<TemplateSourceDataRequest> templateData() {
    return templateData;
  }

  /**
   * Gets the templateRef.
   *
   * Workspace template ref.
   *
   * @return the templateRef
   */
  public String templateRef() {
    return templateRef;
  }

  /**
   * Gets the templateRepo.
   *
   * Input variables for the Template repoository, while creating a workspace.
   *
   * @return the templateRepo
   */
  public TemplateRepoRequest templateRepo() {
    return templateRepo;
  }

  /**
   * Gets the type.
   *
   * List of Workspace type.
   *
   * @return the type
   */
  public List<String> type() {
    return type;
  }

  /**
   * Gets the workspaceStatus.
   *
   * WorkspaceStatusRequest -.
   *
   * @return the workspaceStatus
   */
  public WorkspaceStatusRequest workspaceStatus() {
    return workspaceStatus;
  }

  /**
   * Gets the xGithubToken.
   *
   * The personal access token to authenticate with your private GitHub or GitLab repository and access your Terraform
   * template.
   *
   * @return the xGithubToken
   */
  public String xGithubToken() {
    return xGithubToken;
  }
}

