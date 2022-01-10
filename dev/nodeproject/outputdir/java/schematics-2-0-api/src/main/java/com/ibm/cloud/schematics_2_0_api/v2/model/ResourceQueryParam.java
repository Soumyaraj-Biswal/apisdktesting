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
 * Describe resource query param.
 */
public class ResourceQueryParam extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("value")
  protected String value;
  @SerializedName("description")
  protected String description;

  public ResourceQueryParam() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private String description;
    private Map<String, Object> dynamicProperties;

    private Builder(ResourceQueryParam resourceQueryParam) {
      this.name = resourceQueryParam.name;
      this.value = resourceQueryParam.value;
      this.description = resourceQueryParam.description;
      this.dynamicProperties = resourceQueryParam.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceQueryParam.
     *
     * @return the new ResourceQueryParam instance
     */
    public ResourceQueryParam build() {
      return new ResourceQueryParam(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ResourceQueryParam builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ResourceQueryParam builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ResourceQueryParam builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ResourceQueryParam builder
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

  protected ResourceQueryParam(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    value = builder.value;
    description = builder.description;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ResourceQueryParam builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the resource query param.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the value.
   *
   * Value of the resource query param.
   *
   * @return the value
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(final String value) {
    this.value = value;
  }

  /**
   * Gets the description.
   *
   * Description of resource query param variable.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }
}
