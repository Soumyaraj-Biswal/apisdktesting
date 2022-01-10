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
 * The getKmsSettings options.
 */
public class GetKmsSettingsOptions extends GenericModel {

  protected String location;

  /**
   * Builder.
   */
  public static class Builder {
    private String location;

    private Builder(GetKmsSettingsOptions getKmsSettingsOptions) {
      this.location = getKmsSettingsOptions.location;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param location the location
     */
    public Builder(String location) {
      this.location = location;
    }

    /**
     * Builds a GetKmsSettingsOptions.
     *
     * @return the new GetKmsSettingsOptions instance
     */
    public GetKmsSettingsOptions build() {
      return new GetKmsSettingsOptions(this);
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the GetKmsSettingsOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }
  }

  protected GetKmsSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.location,
      "location cannot be null");
    location = builder.location;
  }

  /**
   * New builder.
   *
   * @return a GetKmsSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the location.
   *
   * The location of the Resource.
   *
   * @return the location
   */
  public String location() {
    return location;
  }
}

