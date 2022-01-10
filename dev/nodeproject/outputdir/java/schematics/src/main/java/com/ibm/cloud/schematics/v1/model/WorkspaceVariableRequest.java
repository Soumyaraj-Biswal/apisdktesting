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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Input variables for your workspace.
 */
public class WorkspaceVariableRequest extends GenericModel {

  protected String description;
  protected String name;
  protected Boolean secure;
  protected String type;
  @SerializedName("use_default")
  protected Boolean useDefault;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String name;
    private Boolean secure;
    private String type;
    private Boolean useDefault;
    private String value;

    private Builder(WorkspaceVariableRequest workspaceVariableRequest) {
      this.description = workspaceVariableRequest.description;
      this.name = workspaceVariableRequest.name;
      this.secure = workspaceVariableRequest.secure;
      this.type = workspaceVariableRequest.type;
      this.useDefault = workspaceVariableRequest.useDefault;
      this.value = workspaceVariableRequest.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkspaceVariableRequest.
     *
     * @return the new WorkspaceVariableRequest instance
     */
    public WorkspaceVariableRequest build() {
      return new WorkspaceVariableRequest(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the WorkspaceVariableRequest builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the WorkspaceVariableRequest builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the secure.
     *
     * @param secure the secure
     * @return the WorkspaceVariableRequest builder
     */
    public Builder secure(Boolean secure) {
      this.secure = secure;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the WorkspaceVariableRequest builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the useDefault.
     *
     * @param useDefault the useDefault
     * @return the WorkspaceVariableRequest builder
     */
    public Builder useDefault(Boolean useDefault) {
      this.useDefault = useDefault;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the WorkspaceVariableRequest builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected WorkspaceVariableRequest(Builder builder) {
    description = builder.description;
    name = builder.name;
    secure = builder.secure;
    type = builder.type;
    useDefault = builder.useDefault;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a WorkspaceVariableRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The description of your input variable.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * The name of the variable.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the secure.
   *
   * If set to `true`, the value of your input variable is protected and not returned in your API response.
   *
   * @return the secure
   */
  public Boolean secure() {
    return secure;
  }

  /**
   * Gets the type.
   *
   * `Terraform v0.11` supports `string`, `list`, `map` data type. For more information, about the syntax, see
   * [Configuring input variables](https://www.terraform.io/docs/configuration-0-11/variables.html).
   * &lt;br&gt; `Terraform v0.12` additionally, supports `bool`, `number` and complex data types such as `list(type)`,
   * `map(type)`,
   * `object({attribute name=type,..})`, `set(type)`, `tuple([type])`. For more information, about the syntax to use the
   * complex data type, see [Configuring
   * variables](https://www.terraform.io/docs/configuration/variables.html#type-constraints).
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the useDefault.
   *
   * Variable uses default value; and is not over-ridden.
   *
   * @return the useDefault
   */
  public Boolean useDefault() {
    return useDefault;
  }

  /**
   * Gets the value.
   *
   * Enter the value as a string for the primitive types such as `bool`, `number`, `string`, and `HCL` format for the
   * complex variables, as you provide in a `.tfvars` file. **You need to enter escaped string of `HCL` format for the
   * complex variable value**. For more information, about how to declare variables in a terraform configuration file
   * and provide value to schematics, see [Providing values for the declared
   * variables](/docs/schematics?topic=schematics-create-tf-config#declare-variable).
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

