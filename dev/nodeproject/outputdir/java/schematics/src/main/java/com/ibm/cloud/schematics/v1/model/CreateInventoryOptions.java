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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createInventory options.
 */
public class CreateInventoryOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String name;
  protected String description;
  protected String location;
  protected String resourceGroup;
  protected String inventoriesIni;
  protected List<String> resourceQueries;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private String inventoriesIni;
    private List<String> resourceQueries;

    private Builder(CreateInventoryOptions createInventoryOptions) {
      this.name = createInventoryOptions.name;
      this.description = createInventoryOptions.description;
      this.location = createInventoryOptions.location;
      this.resourceGroup = createInventoryOptions.resourceGroup;
      this.inventoriesIni = createInventoryOptions.inventoriesIni;
      this.resourceQueries = createInventoryOptions.resourceQueries;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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
     * Adds an resourceQueries to resourceQueries.
     *
     * @param resourceQueries the new resourceQueries
     * @return the CreateInventoryOptions builder
     */
    public Builder addResourceQueries(String resourceQueries) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceQueries,
        "resourceQueries cannot be null");
      if (this.resourceQueries == null) {
        this.resourceQueries = new ArrayList<String>();
      }
      this.resourceQueries.add(resourceQueries);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInventoryOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInventoryOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateInventoryOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateInventoryOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the inventoriesIni.
     *
     * @param inventoriesIni the inventoriesIni
     * @return the CreateInventoryOptions builder
     */
    public Builder inventoriesIni(String inventoriesIni) {
      this.inventoriesIni = inventoriesIni;
      return this;
    }

    /**
     * Set the resourceQueries.
     * Existing resourceQueries will be replaced.
     *
     * @param resourceQueries the resourceQueries
     * @return the CreateInventoryOptions builder
     */
    public Builder resourceQueries(List<String> resourceQueries) {
      this.resourceQueries = resourceQueries;
      return this;
    }
  }

  protected CreateInventoryOptions(Builder builder) {
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    inventoriesIni = builder.inventoriesIni;
    resourceQueries = builder.resourceQueries;
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
   * Gets the name.
   *
   * The unique name of your Inventory resource. The name can be up to 128 characters long and can include alphanumeric
   * characters, spaces, dashes, and underscores.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of your Inventory resource. The description can be up to 2048 characters long in size.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Inventory resource.  By default, Action will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the inventoriesIni.
   *
   * Input inventory of host and host group for the playbook, in the `.ini` file format.
   *
   * @return the inventoriesIni
   */
  public String inventoriesIni() {
    return inventoriesIni;
  }

  /**
   * Gets the resourceQueries.
   *
   * Input resource queries that is used to dynamically generate the inventory of host and host group for the playbook.
   *
   * @return the resourceQueries
   */
  public List<String> resourceQueries() {
    return resourceQueries;
  }
}

