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
 * Name of the template-specific command.
 */
public class TemplateCommand extends DynamicModel<Object> {

  /**
   * Schematics job command name.
   */
  public interface Command {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** create_environment. */
    String CREATE_ENVIRONMENT = "create_environment";
    /** put_environment. */
    String PUT_ENVIRONMENT = "put_environment";
    /** delete_environment. */
    String DELETE_ENVIRONMENT = "delete_environment";
    /** environment_init. */
    String ENVIRONMENT_INIT = "environment_init";
    /** environment_install. */
    String ENVIRONMENT_INSTALL = "environment_install";
    /** environment_uninstall. */
    String ENVIRONMENT_UNINSTALL = "environment_uninstall";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
  }

  @SerializedName("command")
  protected String command;
  @SerializedName("command_options")
  protected List<String> commandOptions;

  public TemplateCommand() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String command;
    private List<String> commandOptions;
    private Map<String, Object> dynamicProperties;

    private Builder(TemplateCommand templateCommand) {
      this.command = templateCommand.command;
      this.commandOptions = templateCommand.commandOptions;
      this.dynamicProperties = templateCommand.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateCommand.
     *
     * @return the new TemplateCommand instance
     */
    public TemplateCommand build() {
      return new TemplateCommand(this);
    }

    /**
     * Adds an commandOptions to commandOptions.
     *
     * @param commandOptions the new commandOptions
     * @return the TemplateCommand builder
     */
    public Builder addCommandOptions(String commandOptions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(commandOptions,
        "commandOptions cannot be null");
      if (this.commandOptions == null) {
        this.commandOptions = new ArrayList<String>();
      }
      this.commandOptions.add(commandOptions);
      return this;
    }

    /**
     * Set the command.
     *
     * @param command the command
     * @return the TemplateCommand builder
     */
    public Builder command(String command) {
      this.command = command;
      return this;
    }

    /**
     * Set the commandOptions.
     * Existing commandOptions will be replaced.
     *
     * @param commandOptions the commandOptions
     * @return the TemplateCommand builder
     */
    public Builder commandOptions(List<String> commandOptions) {
      this.commandOptions = commandOptions;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TemplateCommand builder
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

  protected TemplateCommand(Builder builder) {
    super(new TypeToken<Object>() { });
    command = builder.command;
    commandOptions = builder.commandOptions;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TemplateCommand builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the command.
   *
   * Schematics job command name.
   *
   * @return the command
   */
  public String getCommand() {
    return this.command;
  }

  /**
   * Sets the command.
   *
   * @param command the new command
   */
  public void setCommand(final String command) {
    this.command = command;
  }

  /**
   * Gets the commandOptions.
   *
   * Options supported by the Template Command - it will be used as command line options for Terraform, Helm, Operator
   * engine Eg -parallelism=n  -var-file=myvarfile.
   *
   * @return the commandOptions
   */
  public List<String> getCommandOptions() {
    return this.commandOptions;
  }

  /**
   * Sets the commandOptions.
   *
   * @param commandOptions the new commandOptions
   */
  public void setCommandOptions(final List<String> commandOptions) {
    this.commandOptions = commandOptions;
  }
}
