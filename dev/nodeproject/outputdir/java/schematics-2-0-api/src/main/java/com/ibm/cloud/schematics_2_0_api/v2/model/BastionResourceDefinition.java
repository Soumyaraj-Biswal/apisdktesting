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
 * Describes a bastion resource.
 */
public class BastionResourceDefinition extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("host")
  protected String host;

  public BastionResourceDefinition() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String host;
    private Map<String, Object> dynamicProperties;

    private Builder(BastionResourceDefinition bastionResourceDefinition) {
      this.name = bastionResourceDefinition.name;
      this.host = bastionResourceDefinition.host;
      this.dynamicProperties = bastionResourceDefinition.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BastionResourceDefinition.
     *
     * @return the new BastionResourceDefinition instance
     */
    public BastionResourceDefinition build() {
      return new BastionResourceDefinition(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BastionResourceDefinition builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the BastionResourceDefinition builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the BastionResourceDefinition builder
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

  protected BastionResourceDefinition(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    host = builder.host;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a BastionResourceDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Bastion Name(Unique).
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
   * Gets the host.
   *
   * Reference to the Inventory resource definition.
   *
   * @return the host
   */
  public String getHost() {
    return this.host;
  }

  /**
   * Sets the host.
   *
   * @param host the new host
   */
  public void setHost(final String host) {
    this.host = host;
  }
}
