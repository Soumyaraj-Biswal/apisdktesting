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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getSchematicsAccessRulesForResource options.
 */
public class GetSchematicsAccessRulesForResourceOptions extends GenericModel {

  protected String resourceName;
  protected String commandName;
  protected String commandParameter;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;
    private String commandName;
    private String commandParameter;

    private Builder(GetSchematicsAccessRulesForResourceOptions getSchematicsAccessRulesForResourceOptions) {
      this.resourceName = getSchematicsAccessRulesForResourceOptions.resourceName;
      this.commandName = getSchematicsAccessRulesForResourceOptions.commandName;
      this.commandParameter = getSchematicsAccessRulesForResourceOptions.commandParameter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceName the resourceName
     */
    public Builder(String resourceName) {
      this.resourceName = resourceName;
    }

    /**
     * Builds a GetSchematicsAccessRulesForResourceOptions.
     *
     * @return the new GetSchematicsAccessRulesForResourceOptions instance
     */
    public GetSchematicsAccessRulesForResourceOptions build() {
      return new GetSchematicsAccessRulesForResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the GetSchematicsAccessRulesForResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the GetSchematicsAccessRulesForResourceOptions builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the GetSchematicsAccessRulesForResourceOptions builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }
  }

  protected GetSchematicsAccessRulesForResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    resourceName = builder.resourceName;
    commandName = builder.commandName;
    commandParameter = builder.commandParameter;
  }

  /**
   * New builder.
   *
   * @return a GetSchematicsAccessRulesForResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceName.
   *
   * Name of the schematics resource.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
  }

  /**
   * Gets the commandName.
   *
   * Job command name.
   *
   * @return the commandName
   */
  public String commandName() {
    return commandName;
  }

  /**
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name, capsule-name or flow-name).
   *
   * @return the commandParameter
   */
  public String commandParameter() {
    return commandParameter;
  }
}

