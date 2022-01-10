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
 * The getAdapter options.
 */
public class GetAdapterOptions extends GenericModel {

  protected String adapterId;

  /**
   * Builder.
   */
  public static class Builder {
    private String adapterId;

    private Builder(GetAdapterOptions getAdapterOptions) {
      this.adapterId = getAdapterOptions.adapterId;
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
     */
    public Builder(String adapterId) {
      this.adapterId = adapterId;
    }

    /**
     * Builds a GetAdapterOptions.
     *
     * @return the new GetAdapterOptions instance
     */
    public GetAdapterOptions build() {
      return new GetAdapterOptions(this);
    }

    /**
     * Set the adapterId.
     *
     * @param adapterId the adapterId
     * @return the GetAdapterOptions builder
     */
    public Builder adapterId(String adapterId) {
      this.adapterId = adapterId;
      return this;
    }
  }

  protected GetAdapterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.adapterId,
      "adapterId cannot be empty");
    adapterId = builder.adapterId;
  }

  /**
   * New builder.
   *
   * @return a GetAdapterOptions builder
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
}

