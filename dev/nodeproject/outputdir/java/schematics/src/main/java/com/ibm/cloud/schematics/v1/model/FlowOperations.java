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
 * FlowOperations.
 */
public class FlowOperations extends GenericModel {

  protected String install;
  protected String update;
  protected String uninstall;
  protected String configure;

  /**
   * Builder.
   */
  public static class Builder {
    private String install;
    private String update;
    private String uninstall;
    private String configure;

    private Builder(FlowOperations flowOperations) {
      this.install = flowOperations.install;
      this.update = flowOperations.update;
      this.uninstall = flowOperations.uninstall;
      this.configure = flowOperations.configure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a FlowOperations.
     *
     * @return the new FlowOperations instance
     */
    public FlowOperations build() {
      return new FlowOperations(this);
    }

    /**
     * Set the install.
     *
     * @param install the install
     * @return the FlowOperations builder
     */
    public Builder install(String install) {
      this.install = install;
      return this;
    }

    /**
     * Set the update.
     *
     * @param update the update
     * @return the FlowOperations builder
     */
    public Builder update(String update) {
      this.update = update;
      return this;
    }

    /**
     * Set the uninstall.
     *
     * @param uninstall the uninstall
     * @return the FlowOperations builder
     */
    public Builder uninstall(String uninstall) {
      this.uninstall = uninstall;
      return this;
    }

    /**
     * Set the configure.
     *
     * @param configure the configure
     * @return the FlowOperations builder
     */
    public Builder configure(String configure) {
      this.configure = configure;
      return this;
    }
  }

  protected FlowOperations(Builder builder) {
    install = builder.install;
    update = builder.update;
    uninstall = builder.uninstall;
    configure = builder.configure;
  }

  /**
   * New builder.
   *
   * @return a FlowOperations builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the install.
   *
   * List of layer names for the install command.
   *
   * @return the install
   */
  public String install() {
    return install;
  }

  /**
   * Gets the update.
   *
   * List of layer names for the update command.
   *
   * @return the update
   */
  public String update() {
    return update;
  }

  /**
   * Gets the uninstall.
   *
   * List of layer names for the uninstall command.
   *
   * @return the uninstall
   */
  public String uninstall() {
    return uninstall;
  }

  /**
   * Gets the configure.
   *
   * List of layer names for the configure command.
   *
   * @return the configure
   */
  public String configure() {
    return configure;
  }
}

