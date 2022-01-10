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
 * The updateAtaset options.
 */
public class UpdateAtasetOptions extends GenericModel {

  protected String datasetId;
  protected Dataset dataset;

  /**
   * Builder.
   */
  public static class Builder {
    private String datasetId;
    private Dataset dataset;

    private Builder(UpdateAtasetOptions updateAtasetOptions) {
      this.datasetId = updateAtasetOptions.datasetId;
      this.dataset = updateAtasetOptions.dataset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param datasetId the datasetId
     * @param dataset the dataset
     */
    public Builder(String datasetId, Dataset dataset) {
      this.datasetId = datasetId;
      this.dataset = dataset;
    }

    /**
     * Builds a UpdateAtasetOptions.
     *
     * @return the new UpdateAtasetOptions instance
     */
    public UpdateAtasetOptions build() {
      return new UpdateAtasetOptions(this);
    }

    /**
     * Set the datasetId.
     *
     * @param datasetId the datasetId
     * @return the UpdateAtasetOptions builder
     */
    public Builder datasetId(String datasetId) {
      this.datasetId = datasetId;
      return this;
    }

    /**
     * Set the dataset.
     *
     * @param dataset the dataset
     * @return the UpdateAtasetOptions builder
     */
    public Builder dataset(Dataset dataset) {
      this.dataset = dataset;
      return this;
    }
  }

  protected UpdateAtasetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.datasetId,
      "datasetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataset,
      "dataset cannot be null");
    datasetId = builder.datasetId;
    dataset = builder.dataset;
  }

  /**
   * New builder.
   *
   * @return a UpdateAtasetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the datasetId.
   *
   * Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account.
   *
   * @return the datasetId
   */
  public String datasetId() {
    return datasetId;
  }

  /**
   * Gets the dataset.
   *
   * Update the shared dataset details.
   *
   * @return the dataset
   */
  public Dataset dataset() {
    return dataset;
  }
}

