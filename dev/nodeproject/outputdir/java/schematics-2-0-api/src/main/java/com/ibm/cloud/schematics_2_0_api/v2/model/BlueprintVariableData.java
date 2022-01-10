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
 * User editable variable data &amp; system generated reference to value.
 */
public class BlueprintVariableData extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("value")
  protected String value;
  @SerializedName("link")
  protected String link;

  public BlueprintVariableData() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private Map<String, Object> dynamicProperties;

    private Builder(BlueprintVariableData blueprintVariableData) {
      this.name = blueprintVariableData.name;
      this.value = blueprintVariableData.value;
      this.dynamicProperties = blueprintVariableData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintVariableData.
     *
     * @return the new BlueprintVariableData instance
     */
    public BlueprintVariableData build() {
      return new BlueprintVariableData(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BlueprintVariableData builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the BlueprintVariableData builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the BlueprintVariableData builder
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

  protected BlueprintVariableData(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    value = builder.value;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a BlueprintVariableData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the variable.
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
   * Value for the variable or reference to the value.
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
   * Gets the link.
   *
   * Reference link to the variable value By default the expression will point to self.value.
   *
   * @return the link
   */
  public String getLink() {
    return this.link;
  }
}
