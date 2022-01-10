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
 * The replaceAdapter options.
 */
public class ReplaceAdapterOptions extends GenericModel {

  protected String adapterId;
  protected Adapter adapter;

  /**
   * Builder.
   */
  public static class Builder {
    private String adapterId;
    private Adapter adapter;

    private Builder(ReplaceAdapterOptions replaceAdapterOptions) {
      this.adapterId = replaceAdapterOptions.adapterId;
      this.adapter = replaceAdapterOptions.adapter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param adapterId the adapterId
     * @param adapter the adapter
     */
    public Builder(String adapterId, Adapter adapter) {
      this.adapterId = adapterId;
      this.adapter = adapter;
    }

    /**
     * Builds a ReplaceAdapterOptions.
     *
     * @return the new ReplaceAdapterOptions instance
     */
    public ReplaceAdapterOptions build() {
      return new ReplaceAdapterOptions(this);
    }

    /**
     * Set the adapterId.
     *
     * @param adapterId the adapterId
     * @return the ReplaceAdapterOptions builder
     */
    public Builder adapterId(String adapterId) {
      this.adapterId = adapterId;
      return this;
    }

    /**
     * Set the adapter.
     *
     * @param adapter the adapter
     * @return the ReplaceAdapterOptions builder
     */
    public Builder adapter(Adapter adapter) {
      this.adapter = adapter;
      return this;
    }
  }

  protected ReplaceAdapterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.adapterId,
      "adapterId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.adapter,
      "adapter cannot be null");
    adapterId = builder.adapterId;
    adapter = builder.adapter;
  }

  /**
   * New builder.
   *
   * @return a ReplaceAdapterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the adapterId.
   *
   * Id of the Schematics Adapter.
   *
   * @return the adapterId
   */
  public String adapterId() {
    return adapterId;
  }

  /**
   * Gets the adapter.
   *
   * Replace the Schematics Adapter definition.
   *
   * @return the adapter
   */
  public Adapter adapter() {
    return adapter;
  }
}

