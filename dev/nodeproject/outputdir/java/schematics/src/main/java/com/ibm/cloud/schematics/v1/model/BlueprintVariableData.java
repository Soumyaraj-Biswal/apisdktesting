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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * User editable variable data &amp; system generated reference to value.
 */
public class BlueprintVariableData extends GenericModel {

  protected String name;
  protected String value;
  protected String link;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;

    private Builder(BlueprintVariableData blueprintVariableData) {
      this.name = blueprintVariableData.name;
      this.value = blueprintVariableData.value;
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
  }

  protected BlueprintVariableData(Builder builder) {
    name = builder.name;
    value = builder.value;
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
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value for the variable or reference to the value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the link.
   *
   * Reference link to the variable value By default the expression will point to self.value.
   *
   * @return the link
   */
  public String link() {
    return link;
  }
}

