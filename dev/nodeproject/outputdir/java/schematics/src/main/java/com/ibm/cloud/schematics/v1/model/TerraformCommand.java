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
 * Inputs for running a Terraform command on the workspace.
 */
public class TerraformCommand extends GenericModel {

  protected String command;
  @SerializedName("command_params")
  protected String commandParams;
  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("command_desc")
  protected String commandDesc;
  @SerializedName("command_on_error")
  protected String commandOnError;
  @SerializedName("command_depends_on")
  protected String commandDependsOn;
  @SerializedName("command_status")
  protected String commandStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private String command;
    private String commandParams;
    private String commandName;
    private String commandDesc;
    private String commandOnError;
    private String commandDependsOn;
    private String commandStatus;

    private Builder(TerraformCommand terraformCommand) {
      this.command = terraformCommand.command;
      this.commandParams = terraformCommand.commandParams;
      this.commandName = terraformCommand.commandName;
      this.commandDesc = terraformCommand.commandDesc;
      this.commandOnError = terraformCommand.commandOnError;
      this.commandDependsOn = terraformCommand.commandDependsOn;
      this.commandStatus = terraformCommand.commandStatus;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TerraformCommand.
     *
     * @return the new TerraformCommand instance
     */
    public TerraformCommand build() {
      return new TerraformCommand(this);
    }

    /**
     * Set the command.
     *
     * @param command the command
     * @return the TerraformCommand builder
     */
    public Builder command(String command) {
      this.command = command;
      return this;
    }

    /**
     * Set the commandParams.
     *
     * @param commandParams the commandParams
     * @return the TerraformCommand builder
     */
    public Builder commandParams(String commandParams) {
      this.commandParams = commandParams;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the TerraformCommand builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the commandDesc.
     *
     * @param commandDesc the commandDesc
     * @return the TerraformCommand builder
     */
    public Builder commandDesc(String commandDesc) {
      this.commandDesc = commandDesc;
      return this;
    }

    /**
     * Set the commandOnError.
     *
     * @param commandOnError the commandOnError
     * @return the TerraformCommand builder
     */
    public Builder commandOnError(String commandOnError) {
      this.commandOnError = commandOnError;
      return this;
    }

    /**
     * Set the commandDependsOn.
     *
     * @param commandDependsOn the commandDependsOn
     * @return the TerraformCommand builder
     */
    public Builder commandDependsOn(String commandDependsOn) {
      this.commandDependsOn = commandDependsOn;
      return this;
    }

    /**
     * Set the commandStatus.
     *
     * @param commandStatus the commandStatus
     * @return the TerraformCommand builder
     */
    public Builder commandStatus(String commandStatus) {
      this.commandStatus = commandStatus;
      return this;
    }
  }

  protected TerraformCommand(Builder builder) {
    command = builder.command;
    commandParams = builder.commandParams;
    commandName = builder.commandName;
    commandDesc = builder.commandDesc;
    commandOnError = builder.commandOnError;
    commandDependsOn = builder.commandDependsOn;
    commandStatus = builder.commandStatus;
  }

  /**
   * New builder.
   *
   * @return a TerraformCommand builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the command.
   *
   * You must provide the command to execute. Supported commands are `show`,`taint`, `untaint`, `state`, `import`,
   * `output`.
   *
   * @return the command
   */
  public String command() {
    return command;
  }

  /**
   * Gets the commandParams.
   *
   * The required address parameters for the command name. You can send the option flag and address parameter in the
   * payload. **Syntax ** "command_params": "&lt;option&gt;=&lt;flag&gt;", "&lt;address&gt;". **Example **
   * "command_params": "-allow-missing=true", "-lock=true", "data.template_file.test".
   *
   * @return the commandParams
   */
  public String commandParams() {
    return commandParams;
  }

  /**
   * Gets the commandName.
   *
   * The optional name for the command block.
   *
   * @return the commandName
   */
  public String commandName() {
    return commandName;
  }

  /**
   * Gets the commandDesc.
   *
   * The optional text to describe the command block.
   *
   * @return the commandDesc
   */
  public String commandDesc() {
    return commandDesc;
  }

  /**
   * Gets the commandOnError.
   *
   * Instruction to continue or break in case of error.
   *
   * @return the commandOnError
   */
  public String commandOnError() {
    return commandOnError;
  }

  /**
   * Gets the commandDependsOn.
   *
   * Dependency on previous commands.
   *
   * @return the commandDependsOn
   */
  public String commandDependsOn() {
    return commandDependsOn;
  }

  /**
   * Gets the commandStatus.
   *
   * Displays the command executed status, either `success` or `failure`.
   *
   * @return the commandStatus
   */
  public String commandStatus() {
    return commandStatus;
  }
}

