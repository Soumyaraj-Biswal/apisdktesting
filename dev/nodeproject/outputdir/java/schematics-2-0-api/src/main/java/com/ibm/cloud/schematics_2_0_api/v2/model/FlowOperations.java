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
 * FlowOperations.
 */
public class FlowOperations extends DynamicModel<Object> {

  @SerializedName("install")
  protected String install;
  @SerializedName("update")
  protected String update;
  @SerializedName("uninstall")
  protected String uninstall;
  @SerializedName("configure")
  protected String configure;

  public FlowOperations() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String install;
    private String update;
    private String uninstall;
    private String configure;
    private Map<String, Object> dynamicProperties;

    private Builder(FlowOperations flowOperations) {
      this.install = flowOperations.install;
      this.update = flowOperations.update;
      this.uninstall = flowOperations.uninstall;
      this.configure = flowOperations.configure;
      this.dynamicProperties = flowOperations.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the FlowOperations builder
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

  protected FlowOperations(Builder builder) {
    super(new TypeToken<Object>() { });
    install = builder.install;
    update = builder.update;
    uninstall = builder.uninstall;
    configure = builder.configure;
    this.setProperties(builder.dynamicProperties);
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
  public String getInstall() {
    return this.install;
  }

  /**
   * Sets the install.
   *
   * @param install the new install
   */
  public void setInstall(final String install) {
    this.install = install;
  }

  /**
   * Gets the update.
   *
   * List of layer names for the update command.
   *
   * @return the update
   */
  public String getUpdate() {
    return this.update;
  }

  /**
   * Sets the update.
   *
   * @param update the new update
   */
  public void setUpdate(final String update) {
    this.update = update;
  }

  /**
   * Gets the uninstall.
   *
   * List of layer names for the uninstall command.
   *
   * @return the uninstall
   */
  public String getUninstall() {
    return this.uninstall;
  }

  /**
   * Sets the uninstall.
   *
   * @param uninstall the new uninstall
   */
  public void setUninstall(final String uninstall) {
    this.uninstall = uninstall;
  }

  /**
   * Gets the configure.
   *
   * List of layer names for the configure command.
   *
   * @return the configure
   */
  public String getConfigure() {
    return this.configure;
  }

  /**
   * Sets the configure.
   *
   * @param configure the new configure
   */
  public void setConfigure(final String configure) {
    this.configure = configure;
  }
}
