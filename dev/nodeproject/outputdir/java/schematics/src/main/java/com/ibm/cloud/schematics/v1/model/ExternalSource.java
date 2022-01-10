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
 * Source of templates, playbooks, or controls.
 */
public class ExternalSource extends GenericModel {

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
    /** cos_bucket. */
    String COS_BUCKET = "cos_bucket";
  }

  @SerializedName("source_type")
  protected String sourceType;
  protected ExternalSourceGit git;
  protected ExternalSourceCatalog catalog;
  @SerializedName("cos_bucket")
  protected ExternalSourceCosBucket cosBucket;

  /**
   * Builder.
   */
  public static class Builder {
    private String sourceType;
    private ExternalSourceGit git;
    private ExternalSourceCatalog catalog;
    private ExternalSourceCosBucket cosBucket;

    private Builder(ExternalSource externalSource) {
      this.sourceType = externalSource.sourceType;
      this.git = externalSource.git;
      this.catalog = externalSource.catalog;
      this.cosBucket = externalSource.cosBucket;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceType the sourceType
     */
    public Builder(String sourceType) {
      this.sourceType = sourceType;
    }

    /**
     * Builds a ExternalSource.
     *
     * @return the new ExternalSource instance
     */
    public ExternalSource build() {
      return new ExternalSource(this);
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the ExternalSource builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the git.
     *
     * @param git the git
     * @return the ExternalSource builder
     */
    public Builder git(ExternalSourceGit git) {
      this.git = git;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the ExternalSource builder
     */
    public Builder catalog(ExternalSourceCatalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the cosBucket.
     *
     * @param cosBucket the cosBucket
     * @return the ExternalSource builder
     */
    public Builder cosBucket(ExternalSourceCosBucket cosBucket) {
      this.cosBucket = cosBucket;
      return this;
    }
  }

  protected ExternalSource(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceType,
      "sourceType cannot be null");
    sourceType = builder.sourceType;
    git = builder.git;
    catalog = builder.catalog;
    cosBucket = builder.cosBucket;
  }

  /**
   * New builder.
   *
   * @return a ExternalSource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the git.
   *
   * The connection details to the Git source repository.
   *
   * @return the git
   */
  public ExternalSourceGit git() {
    return git;
  }

  /**
   * Gets the catalog.
   *
   * The connection details to the IBM Cloud Catalog source.
   *
   * @return the catalog
   */
  public ExternalSourceCatalog catalog() {
    return catalog;
  }

  /**
   * Gets the cosBucket.
   *
   * The connection details to the IBM Cloud Object Storage bucket.
   *
   * @return the cosBucket
   */
  public ExternalSourceCosBucket cosBucket() {
    return cosBucket;
  }
}

