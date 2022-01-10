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
 * The createInventory options.
 */
public class CreateInventoryOptions extends GenericModel {

  protected InventoryResourceDefinition inventoryResourceDefinition;

  /**
   * Builder.
   */
  public static class Builder {
    private InventoryResourceDefinition inventoryResourceDefinition;

    private Builder(CreateInventoryOptions createInventoryOptions) {
      this.inventoryResourceDefinition = createInventoryOptions.inventoryResourceDefinition;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inventoryResourceDefinition the inventoryResourceDefinition
     */
    public Builder(InventoryResourceDefinition inventoryResourceDefinition) {
      this.inventoryResourceDefinition = inventoryResourceDefinition;
    }

    /**
     * Builds a CreateInventoryOptions.
     *
     * @return the new CreateInventoryOptions instance
     */
    public CreateInventoryOptions build() {
      return new CreateInventoryOptions(this);
    }

    /**
     * Set the inventoryResourceDefinition.
     *
     * @param inventoryResourceDefinition the inventoryResourceDefinition
     * @return the CreateInventoryOptions builder
     */
    public Builder inventoryResourceDefinition(InventoryResourceDefinition inventoryResourceDefinition) {
      this.inventoryResourceDefinition = inventoryResourceDefinition;
      return this;
    }
  }

  protected CreateInventoryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inventoryResourceDefinition,
      "inventoryResourceDefinition cannot be null");
    inventoryResourceDefinition = builder.inventoryResourceDefinition;
  }

  /**
   * New builder.
   *
   * @return a CreateInventoryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inventoryResourceDefinition.
   *
   * Create a Inventory definition resource.
   *
   * @return the inventoryResourceDefinition
   */
  public InventoryResourceDefinition inventoryResourceDefinition() {
    return inventoryResourceDefinition;
  }
}

