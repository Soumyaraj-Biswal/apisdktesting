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
package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listInventoryValues options.
 */
public class ListInventoryValuesOptions extends GenericModel {

  protected String inventoryId;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;

    private Builder(ListInventoryValuesOptions listInventoryValuesOptions) {
      this.inventoryId = listInventoryValuesOptions.inventoryId;
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
     */
    public Builder(String inventoryId) {
      this.inventoryId = inventoryId;
    }

    /**
     * Builds a ListInventoryValuesOptions.
     *
     * @return the new ListInventoryValuesOptions instance
     */
    public ListInventoryValuesOptions build() {
      return new ListInventoryValuesOptions(this);
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the ListInventoryValuesOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }
  }

  protected ListInventoryValuesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    inventoryId = builder.inventoryId;
  }

  /**
   * New builder.
   *
   * @return a ListInventoryValuesOptions builder
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
}

