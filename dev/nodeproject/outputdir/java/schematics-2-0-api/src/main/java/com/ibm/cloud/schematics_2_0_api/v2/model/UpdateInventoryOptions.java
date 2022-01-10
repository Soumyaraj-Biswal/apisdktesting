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
 * The updateInventory options.
 */
public class UpdateInventoryOptions extends GenericModel {

  protected String inventoryId;
  protected InventoryResourceDefinition inventoryResourceDefinition;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;
    private InventoryResourceDefinition inventoryResourceDefinition;

    private Builder(UpdateInventoryOptions updateInventoryOptions) {
      this.inventoryId = updateInventoryOptions.inventoryId;
      this.inventoryResourceDefinition = updateInventoryOptions.inventoryResourceDefinition;
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
     * @param inventoryResourceDefinition the inventoryResourceDefinition
     */
    public Builder(String inventoryId, InventoryResourceDefinition inventoryResourceDefinition) {
      this.inventoryId = inventoryId;
      this.inventoryResourceDefinition = inventoryResourceDefinition;
    }

    /**
     * Builds a UpdateInventoryOptions.
     *
     * @return the new UpdateInventoryOptions instance
     */
    public UpdateInventoryOptions build() {
      return new UpdateInventoryOptions(this);
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the UpdateInventoryOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }

    /**
     * Set the inventoryResourceDefinition.
     *
     * @param inventoryResourceDefinition the inventoryResourceDefinition
     * @return the UpdateInventoryOptions builder
     */
    public Builder inventoryResourceDefinition(InventoryResourceDefinition inventoryResourceDefinition) {
      this.inventoryResourceDefinition = inventoryResourceDefinition;
      return this;
    }
  }

  protected UpdateInventoryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inventoryResourceDefinition,
      "inventoryResourceDefinition cannot be null");
    inventoryId = builder.inventoryId;
    inventoryResourceDefinition = builder.inventoryResourceDefinition;
  }

  /**
   * New builder.
   *
   * @return a UpdateInventoryOptions builder
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
   * Gets the inventoryResourceDefinition.
   *
   * Update the resource inventory definition.
   *
   * @return the inventoryResourceDefinition
   */
  public InventoryResourceDefinition inventoryResourceDefinition() {
    return inventoryResourceDefinition;
  }
}

