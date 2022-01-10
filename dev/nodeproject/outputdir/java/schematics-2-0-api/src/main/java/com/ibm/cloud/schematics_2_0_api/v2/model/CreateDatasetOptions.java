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
 * The createDataset options.
 */
public class CreateDatasetOptions extends GenericModel {

  protected Dataset dataset;

  /**
   * Builder.
   */
  public static class Builder {
    private Dataset dataset;

    private Builder(CreateDatasetOptions createDatasetOptions) {
      this.dataset = createDatasetOptions.dataset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataset the dataset
     */
    public Builder(Dataset dataset) {
      this.dataset = dataset;
    }

    /**
     * Builds a CreateDatasetOptions.
     *
     * @return the new CreateDatasetOptions instance
     */
    public CreateDatasetOptions build() {
      return new CreateDatasetOptions(this);
    }

    /**
     * Set the dataset.
     *
     * @param dataset the dataset
     * @return the CreateDatasetOptions builder
     */
    public Builder dataset(Dataset dataset) {
      this.dataset = dataset;
      return this;
    }
  }

  protected CreateDatasetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataset,
      "dataset cannot be null");
    dataset = builder.dataset;
  }

  /**
   * New builder.
   *
   * @return a CreateDatasetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataset.
   *
   * Create a shared dataset.
   *
   * @return the dataset
   */
  public Dataset dataset() {
    return dataset;
  }
}

