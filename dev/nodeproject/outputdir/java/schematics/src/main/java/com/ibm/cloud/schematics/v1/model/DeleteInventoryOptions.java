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
 * The deleteInventory options.
 */
public class DeleteInventoryOptions extends GenericModel {

  protected String inventoryId;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;
    private Boolean force;
    private Boolean propagate;

    private Builder(DeleteInventoryOptions deleteInventoryOptions) {
      this.inventoryId = deleteInventoryOptions.inventoryId;
      this.force = deleteInventoryOptions.force;
      this.propagate = deleteInventoryOptions.propagate;
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
     * Builds a DeleteInventoryOptions.
     *
     * @return the new DeleteInventoryOptions instance
     */
    public DeleteInventoryOptions build() {
      return new DeleteInventoryOptions(this);
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the DeleteInventoryOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteInventoryOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteInventoryOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteInventoryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    inventoryId = builder.inventoryId;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteInventoryOptions builder
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

