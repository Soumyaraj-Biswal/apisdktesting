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
 * The getDatasetVariable options.
 */
public class GetDatasetVariableOptions extends GenericModel {

  protected String datasetId;
  protected String varName;

  /**
   * Builder.
   */
  public static class Builder {
    private String datasetId;
    private String varName;

    private Builder(GetDatasetVariableOptions getDatasetVariableOptions) {
      this.datasetId = getDatasetVariableOptions.datasetId;
      this.varName = getDatasetVariableOptions.varName;
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
     * @param varName the varName
     */
    public Builder(String datasetId, String varName) {
      this.datasetId = datasetId;
      this.varName = varName;
    }

    /**
     * Builds a GetDatasetVariableOptions.
     *
     * @return the new GetDatasetVariableOptions instance
     */
    public GetDatasetVariableOptions build() {
      return new GetDatasetVariableOptions(this);
    }

    /**
     * Set the datasetId.
     *
     * @param datasetId the datasetId
     * @return the GetDatasetVariableOptions builder
     */
    public Builder datasetId(String datasetId) {
      this.datasetId = datasetId;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the GetDatasetVariableOptions builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }
  }

  protected GetDatasetVariableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.datasetId,
      "datasetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.varName,
      "varName cannot be empty");
    datasetId = builder.datasetId;
    varName = builder.varName;
  }

  /**
   * New builder.
   *
   * @return a GetDatasetVariableOptions builder
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
   * Gets the varName.
   *
   * Name of the variable.
   *
   * @return the varName
   */
  public String varName() {
    return varName;
  }
}

