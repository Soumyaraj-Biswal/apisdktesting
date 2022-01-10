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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * List of user-defined Template definitions.
 */
public class TemplateListRequest extends DynamicModel<Object> {

  @SerializedName("templates")
  protected List<Template> templates;

  public TemplateListRequest() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<Template> templates;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateListRequest templateListRequest) {
      this.templates = templateListRequest.templates;
      this.dynamicProperties = templateListRequest.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateListRequest.
     *
     * @return the new TemplateListRequest instance
     */
    public TemplateListRequest build() {
      return new TemplateListRequest(this);
    }

    /**
     * Adds an templates to templates.
     *
     * @param templates the new templates
     * @return the TemplateListRequest builder
     */
    public Builder addTemplates(Template templates) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templates,
        "templates cannot be null");
      if (this.templates == null) {
        this.templates = new ArrayList<Template>();
      }
      this.templates.add(templates);
      return this;
    }

    /**
     * Set the templates.
     * Existing templates will be replaced.
     *
     * @param templates the templates
     * @return the TemplateListRequest builder
     */
    public Builder templates(List<Template> templates) {
      this.templates = templates;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateListRequest builder
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

  protected TemplateListRequest(Builder builder) {
    super(new TypeToken<Object>() { });
    templates = builder.templates;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateListRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templates.
   *
   * List of Template definitions.
   *
   * @return the templates
   */
  public List<Template> getTemplates() {
    return this.templates;
  }

  /**
   * Sets the templates.
   *
   * @param templates the new templates
   */
  public void setTemplates(final List<Template> templates) {
    this.templates = templates;
  }
}
