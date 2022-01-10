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
 * List of capsule evidences.
 */
public class CapsuleResultEvidences extends DynamicModel<Object> {

  @SerializedName("resources")
  protected List<CapsuleResultResources> resources;

  public CapsuleResultEvidences() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<CapsuleResultResources> resources;
    private Map<String, Object> dynamicProperties;

    private Builder(CapsuleResultEvidences capsuleResultEvidences) {
      this.resources = capsuleResultEvidences.resources;
      this.dynamicProperties = capsuleResultEvidences.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CapsuleResultEvidences.
     *
     * @return the new CapsuleResultEvidences instance
     */
    public CapsuleResultEvidences build() {
      return new CapsuleResultEvidences(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the CapsuleResultEvidences builder
     */
    public Builder addResources(CapsuleResultResources resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<CapsuleResultResources>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the CapsuleResultEvidences builder
     */
    public Builder resources(List<CapsuleResultResources> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the CapsuleResultEvidences builder
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

  protected CapsuleResultEvidences(Builder builder) {
    super(new TypeToken<Object>() { });
    resources = builder.resources;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a CapsuleResultEvidences builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resources.
   *
   * List of resources.
   *
   * @return the resources
   */
  public List<CapsuleResultResources> getResources() {
    return this.resources;
  }

  /**
   * Sets the resources.
   *
   * @param resources the new resources
   */
  public void setResources(final List<CapsuleResultResources> resources) {
    this.resources = resources;
  }
}
