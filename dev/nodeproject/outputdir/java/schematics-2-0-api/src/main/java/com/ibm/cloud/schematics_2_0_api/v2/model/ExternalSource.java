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
 * Source of templates, playbooks, or controls.
 */
public class ExternalSource extends DynamicModel<Object> {

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
  @SerializedName("git")
  protected ExternalSourceGit git;
  @SerializedName("catalog")
  protected ExternalSourceCatalog catalog;
  @SerializedName("cos_bucket")
  protected ExternalSourceCosBucket cosBucket;

  public ExternalSource() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String sourceType;
    private ExternalSourceGit git;
    private ExternalSourceCatalog catalog;
    private ExternalSourceCosBucket cosBucket;
    private Map<String, Object> dynamicProperties;

    private Builder(ExternalSource externalSource) {
      this.sourceType = externalSource.sourceType;
      this.git = externalSource.git;
      this.catalog = externalSource.catalog;
      this.cosBucket = externalSource.cosBucket;
      this.dynamicProperties = externalSource.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ExternalSource builder
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

  protected ExternalSource(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceType,
      "sourceType cannot be null");
    sourceType = builder.sourceType;
    git = builder.git;
    catalog = builder.catalog;
    cosBucket = builder.cosBucket;
    this.setProperties(builder.dynamicProperties);
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
  public String getSourceType() {
    return this.sourceType;
  }

  /**
   * Sets the sourceType.
   *
   * @param sourceType the new sourceType
   */
  public void setSourceType(final String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Gets the git.
   *
   * The connection details to the Git source repository.
   *
   * @return the git
   */
  public ExternalSourceGit getGit() {
    return this.git;
  }

  /**
   * Sets the git.
   *
   * @param git the new git
   */
  public void setGit(final ExternalSourceGit git) {
    this.git = git;
  }

  /**
   * Gets the catalog.
   *
   * The connection details to the IBM Cloud Catalog source.
   *
   * @return the catalog
   */
  public ExternalSourceCatalog getCatalog() {
    return this.catalog;
  }

  /**
   * Sets the catalog.
   *
   * @param catalog the new catalog
   */
  public void setCatalog(final ExternalSourceCatalog catalog) {
    this.catalog = catalog;
  }

  /**
   * Gets the cosBucket.
   *
   * The connection details to the IBM Cloud Object Storage bucket.
   *
   * @return the cosBucket
   */
  public ExternalSourceCosBucket getCosBucket() {
    return this.cosBucket;
  }

  /**
   * Sets the cosBucket.
   *
   * @param cosBucket the new cosBucket
   */
  public void setCosBucket(final ExternalSourceCosBucket cosBucket) {
    this.cosBucket = cosBucket;
  }
}
