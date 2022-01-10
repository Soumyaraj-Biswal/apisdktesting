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
 * Resource details.
 */
public class CapsuleResultResources extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("type")
  protected String type;

  public CapsuleResultResources() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private Map<String, Object> dynamicProperties;

    private Builder(CapsuleResultResources capsuleResultResources) {
      this.name = capsuleResultResources.name;
      this.type = capsuleResultResources.type;
      this.dynamicProperties = capsuleResultResources.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CapsuleResultResources.
     *
     * @return the new CapsuleResultResources instance
     */
    public CapsuleResultResources build() {
      return new CapsuleResultResources(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CapsuleResultResources builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CapsuleResultResources builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the CapsuleResultResources builder
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

  protected CapsuleResultResources(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    type = builder.type;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a CapsuleResultResources builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the resource.
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
   * Gets the type.
   *
   * Type of resource.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }
}
