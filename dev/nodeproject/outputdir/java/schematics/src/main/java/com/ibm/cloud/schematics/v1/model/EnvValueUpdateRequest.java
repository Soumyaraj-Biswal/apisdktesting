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
 * EnvValueUpdateRequest.
 */
public class EnvValueUpdateRequest extends GenericModel {

  protected String name;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;

    private Builder(EnvValueUpdateRequest envValueUpdateRequest) {
      this.name = envValueUpdateRequest.name;
      this.value = envValueUpdateRequest.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnvValueUpdateRequest.
     *
     * @return the new EnvValueUpdateRequest instance
     */
    public EnvValueUpdateRequest build() {
      return new EnvValueUpdateRequest(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EnvValueUpdateRequest builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the EnvValueUpdateRequest builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected EnvValueUpdateRequest(Builder builder) {
    name = builder.name;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a EnvValueUpdateRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Environment variable name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value for environment variable.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

