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
 * User editable variable data and system generated reference to the value.
 */
public class VariableData extends GenericModel {

  protected String name;
  protected String value;
  protected VariableMetadata metadata;
  protected String link;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private VariableMetadata metadata;

    private Builder(VariableData variableData) {
      this.name = variableData.name;
      this.value = variableData.value;
      this.metadata = variableData.metadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VariableData.
     *
     * @return the new VariableData instance
     */
    public VariableData build() {
      return new VariableData(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VariableData builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the VariableData builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the VariableData builder
     */
    public Builder metadata(VariableMetadata metadata) {
      this.metadata = metadata;
      return this;
    }
  }

  protected VariableData(Builder builder) {
    name = builder.name;
    value = builder.value;
    metadata = builder.metadata;
  }

  /**
   * New builder.
   *
   * @return a VariableData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the variable. For example, `name = "ssh_key"`.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * The value for the variable or reference to the value. For example, `value = "&lt;provide your ssh_key_value with
   * \n&gt;"`. **Note** The SSH key should contain `\n` at the end of the key details in case of command line or API
   * calls.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the metadata.
   *
   * An user editable metadata for the variables.
   *
   * @return the metadata
   */
  public VariableMetadata metadata() {
    return metadata;
  }

  /**
   * Gets the link.
   *
   * The reference link to the variable value By default the expression points to `self.value`.
   *
   * @return the link
   */
  public String link() {
    return link;
  }
}

