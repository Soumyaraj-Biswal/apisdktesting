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
 * The getInventoryVariableValue options.
 */
public class GetInventoryVariableValueOptions extends GenericModel {

  protected String inventoryId;
  protected String varName;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;
    private String varName;

    private Builder(GetInventoryVariableValueOptions getInventoryVariableValueOptions) {
      this.inventoryId = getInventoryVariableValueOptions.inventoryId;
      this.varName = getInventoryVariableValueOptions.varName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inventoryId the inventoryId
     * @param varName the varName
     */
    public Builder(String inventoryId, String varName) {
      this.inventoryId = inventoryId;
      this.varName = varName;
    }

    /**
     * Builds a GetInventoryVariableValueOptions.
     *
     * @return the new GetInventoryVariableValueOptions instance
     */
    public GetInventoryVariableValueOptions build() {
      return new GetInventoryVariableValueOptions(this);
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the GetInventoryVariableValueOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the GetInventoryVariableValueOptions builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }
  }

  protected GetInventoryVariableValueOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.varName,
      "varName cannot be empty");
    inventoryId = builder.inventoryId;
    varName = builder.varName;
  }

  /**
   * New builder.
   *
   * @return a GetInventoryVariableValueOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inventoryId.
   *
   * Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your IBM
   * Cloud account.
   *
   * @return the inventoryId
   */
  public String inventoryId() {
    return inventoryId;
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

