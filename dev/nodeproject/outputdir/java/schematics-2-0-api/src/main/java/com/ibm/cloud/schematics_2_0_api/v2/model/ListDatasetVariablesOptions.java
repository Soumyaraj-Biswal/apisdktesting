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
 * The listDatasetVariables options.
 */
public class ListDatasetVariablesOptions extends GenericModel {

  protected String datasetId;

  /**
   * Builder.
   */
  public static class Builder {
    private String datasetId;

    private Builder(ListDatasetVariablesOptions listDatasetVariablesOptions) {
      this.datasetId = listDatasetVariablesOptions.datasetId;
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
     * Builds a ListDatasetVariablesOptions.
     *
     * @return the new ListDatasetVariablesOptions instance
     */
    public ListDatasetVariablesOptions build() {
      return new ListDatasetVariablesOptions(this);
    }

    /**
     * Set the datasetId.
     *
     * @param datasetId the datasetId
     * @return the ListDatasetVariablesOptions builder
     */
    public Builder datasetId(String datasetId) {
      this.datasetId = datasetId;
      return this;
    }
  }

  protected ListDatasetVariablesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.datasetId,
      "datasetId cannot be empty");
    datasetId = builder.datasetId;
  }

  /**
   * New builder.
   *
   * @return a ListDatasetVariablesOptions builder
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
}

