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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Inventory resource definition, its credentials and bastion.
 */
public class InventoryResourceDefinition extends DynamicModel<Object> {

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

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("location")
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("inventories_ini")
  protected String inventoriesIni;
  @SerializedName("resource_queries")
  protected List<String> resourceQueries;

  public InventoryResourceDefinition() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

    private Builder(InventoryResourceDefinition inventoryResourceDefinition) {
      this.name = inventoryResourceDefinition.name;
      this.description = inventoryResourceDefinition.description;
      this.location = inventoryResourceDefinition.location;
      this.resourceGroup = inventoryResourceDefinition.resourceGroup;
      this.inventoriesIni = inventoryResourceDefinition.inventoriesIni;
      this.resourceQueries = inventoryResourceDefinition.resourceQueries;
      this.dynamicProperties = inventoryResourceDefinition.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InventoryResourceDefinition.
     *
     * @return the new InventoryResourceDefinition instance
     */
    public InventoryResourceDefinition build() {
      return new InventoryResourceDefinition(this);
    }

    /**
     * Adds an resourceQueries to resourceQueries.
     *
     * @param resourceQueries the new resourceQueries
     * @return the InventoryResourceDefinition builder
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
     * @return the InventoryResourceDefinition builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the InventoryResourceDefinition builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the InventoryResourceDefinition builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InventoryResourceDefinition builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the inventoriesIni.
     *
     * @param inventoriesIni the inventoriesIni
     * @return the InventoryResourceDefinition builder
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
     * @return the InventoryResourceDefinition builder
     */
    public Builder resourceQueries(List<String> resourceQueries) {
      this.resourceQueries = resourceQueries;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the InventoryResourceDefinition builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected InventoryResourceDefinition(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    inventoriesIni = builder.inventoriesIni;
    resourceQueries = builder.resourceQueries;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a InventoryResourceDefinition builder
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
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the description.
   *
   * The description of your Inventory resource. The description can be up to 2048 characters long in size.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
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
  public String getLocation() {
    return this.location;
  }

  /**
   * Sets the location.
   *
   * @param location the new location
   */
  public void setLocation(final String location) {
    this.location = location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Inventory resource.  By default, Action will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Sets the resourceGroup.
   *
   * @param resourceGroup the new resourceGroup
   */
  public void setResourceGroup(final String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * Gets the inventoriesIni.
   *
   * Input inventory of host and host group for the playbook, in the `.ini` file format.
   *
   * @return the inventoriesIni
   */
  public String getInventoriesIni() {
    return this.inventoriesIni;
  }

  /**
   * Sets the inventoriesIni.
   *
   * @param inventoriesIni the new inventoriesIni
   */
  public void setInventoriesIni(final String inventoriesIni) {
    this.inventoriesIni = inventoriesIni;
  }

  /**
   * Gets the resourceQueries.
   *
   * Input resource queries that is used to dynamically generate the inventory of host and host group for the playbook.
   *
   * @return the resourceQueries
   */
  public List<String> getResourceQueries() {
    return this.resourceQueries;
  }

  /**
   * Sets the resourceQueries.
   *
   * @param resourceQueries the new resourceQueries
   */
  public void setResourceQueries(final List<String> resourceQueries) {
    this.resourceQueries = resourceQueries;
  }
}
