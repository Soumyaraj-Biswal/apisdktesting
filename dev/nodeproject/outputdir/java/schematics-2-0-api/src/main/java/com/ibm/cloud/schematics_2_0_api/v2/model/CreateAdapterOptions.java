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
 * The createAdapter options.
 */
public class CreateAdapterOptions extends GenericModel {

  protected Adapter adapter;

  /**
   * Builder.
   */
  public static class Builder {
    private Adapter adapter;

    private Builder(CreateAdapterOptions createAdapterOptions) {
      this.adapter = createAdapterOptions.adapter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param adapter the adapter
     */
    public Builder(Adapter adapter) {
      this.adapter = adapter;
    }

    /**
     * Builds a CreateAdapterOptions.
     *
     * @return the new CreateAdapterOptions instance
     */
    public CreateAdapterOptions build() {
      return new CreateAdapterOptions(this);
    }

    /**
     * Set the adapter.
     *
     * @param adapter the adapter
     * @return the CreateAdapterOptions builder
     */
    public Builder adapter(Adapter adapter) {
      this.adapter = adapter;
      return this;
    }
  }

  protected CreateAdapterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.adapter,
      "adapter cannot be null");
    adapter = builder.adapter;
  }

  /**
   * New builder.
   *
   * @return a CreateAdapterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the adapter.
   *
   * Adapter Register Request.
   *
   * @return the adapter
   */
  public Adapter adapter() {
    return adapter;
  }
}

