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
 * The createPrivateCluster options.
 */
public class CreatePrivateClusterOptions extends GenericModel {

  protected PrivateCluster privateCluster;

  /**
   * Builder.
   */
  public static class Builder {
    private PrivateCluster privateCluster;

    private Builder(CreatePrivateClusterOptions createPrivateClusterOptions) {
      this.privateCluster = createPrivateClusterOptions.privateCluster;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param privateCluster the privateCluster
     */
    public Builder(PrivateCluster privateCluster) {
      this.privateCluster = privateCluster;
    }

    /**
     * Builds a CreatePrivateClusterOptions.
     *
     * @return the new CreatePrivateClusterOptions instance
     */
    public CreatePrivateClusterOptions build() {
      return new CreatePrivateClusterOptions(this);
    }

    /**
     * Set the privateCluster.
     *
     * @param privateCluster the privateCluster
     * @return the CreatePrivateClusterOptions builder
     */
    public Builder privateCluster(PrivateCluster privateCluster) {
      this.privateCluster = privateCluster;
      return this;
    }
  }

  protected CreatePrivateClusterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privateCluster,
      "privateCluster cannot be null");
    privateCluster = builder.privateCluster;
  }

  /**
   * New builder.
   *
   * @return a CreatePrivateClusterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the privateCluster.
   *
   * Register your private cluster with Schematics to run the jobs.
   *
   * @return the privateCluster
   */
  public PrivateCluster privateCluster() {
    return privateCluster;
  }
}

