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
 * The deleteDataset options.
 */
public class DeleteDatasetOptions extends GenericModel {

  protected String datasetId;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String datasetId;
    private Boolean force;
    private Boolean propagate;

    private Builder(DeleteDatasetOptions deleteDatasetOptions) {
      this.datasetId = deleteDatasetOptions.datasetId;
      this.force = deleteDatasetOptions.force;
      this.propagate = deleteDatasetOptions.propagate;
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
     */
    public Builder(String datasetId) {
      this.datasetId = datasetId;
    }

    /**
     * Builds a DeleteDatasetOptions.
     *
     * @return the new DeleteDatasetOptions instance
     */
    public DeleteDatasetOptions build() {
      return new DeleteDatasetOptions(this);
    }

    /**
     * Set the datasetId.
     *
     * @param datasetId the datasetId
     * @return the DeleteDatasetOptions builder
     */
    public Builder datasetId(String datasetId) {
      this.datasetId = datasetId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteDatasetOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteDatasetOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteDatasetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.datasetId,
      "datasetId cannot be empty");
    datasetId = builder.datasetId;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteDatasetOptions builder
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
   * Gets the force.
   *
   * Equivalent to -force options in the command line.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the propagate.
   *
   * Auto propagate the chaange or deletion to the dependent resources.
   *
   * @return the propagate
   */
  public Boolean propagate() {
    return propagate;
  }
}

