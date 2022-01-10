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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTerraformCommands options.
 */
public class UpdateTerraformCommandsOptions extends GenericModel {

  protected String wId;
  protected List<TerraformCommand> commands;
  protected String operationName;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private List<TerraformCommand> commands;
    private String operationName;
    private String description;

    private Builder(UpdateTerraformCommandsOptions updateTerraformCommandsOptions) {
      this.wId = updateTerraformCommandsOptions.wId;
      this.commands = updateTerraformCommandsOptions.commands;
      this.operationName = updateTerraformCommandsOptions.operationName;
      this.description = updateTerraformCommandsOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     */
    public Builder(String wId) {
      this.wId = wId;
    }

    /**
     * Builds a UpdateTerraformCommandsOptions.
     *
     * @return the new UpdateTerraformCommandsOptions instance
     */
    public UpdateTerraformCommandsOptions build() {
      return new UpdateTerraformCommandsOptions(this);
    }

    /**
     * Adds an commands to commands.
     *
     * @param commands the new commands
     * @return the UpdateTerraformCommandsOptions builder
     */
    public Builder addCommands(TerraformCommand commands) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(commands,
        "commands cannot be null");
      if (this.commands == null) {
        this.commands = new ArrayList<TerraformCommand>();
      }
      this.commands.add(commands);
      return this;
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the UpdateTerraformCommandsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the commands.
     * Existing commands will be replaced.
     *
     * @param commands the commands
     * @return the UpdateTerraformCommandsOptions builder
     */
    public Builder commands(List<TerraformCommand> commands) {
      this.commands = commands;
      return this;
    }

    /**
     * Set the operationName.
     *
     * @param operationName the operationName
     * @return the UpdateTerraformCommandsOptions builder
     */
    public Builder operationName(String operationName) {
      this.operationName = operationName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateTerraformCommandsOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected UpdateTerraformCommandsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
    commands = builder.commands;
    operationName = builder.operationName;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a UpdateTerraformCommandsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace that you want to update. To find the ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the commands.
   *
   * List of commands. You can execute single set of commands or multiple commands. For more information, about the
   * payload of the multiple commands, refer to
   * [Commands](/docs/schematics?topic=schematics-schematics-cli-reference#commands).
   *
   * @return the commands
   */
  public List<TerraformCommand> commands() {
    return commands;
  }

  /**
   * Gets the operationName.
   *
   * Command name.
   *
   * @return the operationName
   */
  public String operationName() {
    return operationName;
  }

  /**
   * Gets the description.
   *
   * Command description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

