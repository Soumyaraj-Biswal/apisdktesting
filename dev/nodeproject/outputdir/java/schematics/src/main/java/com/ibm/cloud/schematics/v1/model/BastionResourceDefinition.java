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
 * Describes a bastion resource.
 */
public class BastionResourceDefinition extends GenericModel {

  protected String name;
  protected String host;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String host;

    private Builder(BastionResourceDefinition bastionResourceDefinition) {
      this.name = bastionResourceDefinition.name;
      this.host = bastionResourceDefinition.host;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BastionResourceDefinition.
     *
     * @return the new BastionResourceDefinition instance
     */
    public BastionResourceDefinition build() {
      return new BastionResourceDefinition(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BastionResourceDefinition builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the BastionResourceDefinition builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }
  }

  protected BastionResourceDefinition(Builder builder) {
    name = builder.name;
    host = builder.host;
  }

  /**
   * New builder.
   *
   * @return a BastionResourceDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Bastion Name(Unique).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the host.
   *
   * Reference to the Inventory resource definition.
   *
   * @return the host
   */
  public String host() {
    return host;
  }
}

