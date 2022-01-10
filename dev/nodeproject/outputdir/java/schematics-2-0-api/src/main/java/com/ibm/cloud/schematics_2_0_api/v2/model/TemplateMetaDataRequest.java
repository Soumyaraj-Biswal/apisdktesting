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
 * Template metadata request.
 */
public class TemplateMetaDataRequest extends DynamicModel<Object> {

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

  @SerializedName("region")
  protected String region;
  @SerializedName("template_type")
  protected String templateType;
  @SerializedName("source")
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;

  public TemplateMetaDataRequest() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String region;
    private String templateType;
    private ExternalSource source;
    private String sourceType;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateMetaDataRequest templateMetaDataRequest) {
      this.region = templateMetaDataRequest.region;
      this.templateType = templateMetaDataRequest.templateType;
      this.source = templateMetaDataRequest.source;
      this.sourceType = templateMetaDataRequest.sourceType;
      this.dynamicProperties = templateMetaDataRequest.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param templateType the templateType
     * @param source the source
     */
    public Builder(String templateType, ExternalSource source) {
      this.templateType = templateType;
      this.source = source;
    }

    /**
     * Builds a TemplateMetaDataRequest.
     *
     * @return the new TemplateMetaDataRequest instance
     */
    public TemplateMetaDataRequest build() {
      return new TemplateMetaDataRequest(this);
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the TemplateMetaDataRequest builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the templateType.
     *
     * @param templateType the templateType
     * @return the TemplateMetaDataRequest builder
     */
    public Builder templateType(String templateType) {
      this.templateType = templateType;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the TemplateMetaDataRequest builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the TemplateMetaDataRequest builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateMetaDataRequest builder
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

  protected TemplateMetaDataRequest(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.templateType,
      "templateType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    region = builder.region;
    templateType = builder.templateType;
    source = builder.source;
    sourceType = builder.sourceType;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateMetaDataRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the region.
   *
   * Region on which request should process. Applicable only on global endpoint.
   *
   * @return the region
   */
  public String getRegion() {
    return this.region;
  }

  /**
   * Sets the region.
   *
   * @param region the new region
   */
  public void setRegion(final String region) {
    this.region = region;
  }

  /**
   * Gets the templateType.
   *
   * Template type such as **terraform**, **ansible**, **helm**, **cloudpak**, or **bash script**.
   *
   * @return the templateType
   */
  public String getTemplateType() {
    return this.templateType;
  }

  /**
   * Sets the templateType.
   *
   * @param templateType the new templateType
   */
  public void setTemplateType(final String templateType) {
    this.templateType = templateType;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource getSource() {
    return this.source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final ExternalSource source) {
    this.source = source;
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
}
