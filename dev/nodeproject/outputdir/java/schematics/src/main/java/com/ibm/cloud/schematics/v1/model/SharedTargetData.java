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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the Target used by the templates originating from the  IBM Cloud catalog offerings. This
 * information is not relevant for workspace created using your own Terraform template.
 */
public class SharedTargetData extends GenericModel {

  @SerializedName("cluster_created_on")
  protected String clusterCreatedOn;
  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_name")
  protected String clusterName;
  @SerializedName("cluster_type")
  protected String clusterType;
  @SerializedName("entitlement_keys")
  protected List<Object> entitlementKeys;
  protected String namespace;
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;
  @SerializedName("worker_count")
  protected Long workerCount;
  @SerializedName("worker_machine_type")
  protected String workerMachineType;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterCreatedOn;
    private String clusterId;
    private String clusterName;
    private String clusterType;
    private List<Object> entitlementKeys;
    private String namespace;
    private String region;
    private String resourceGroupId;
    private Long workerCount;
    private String workerMachineType;

    private Builder(SharedTargetData sharedTargetData) {
      this.clusterCreatedOn = sharedTargetData.clusterCreatedOn;
      this.clusterId = sharedTargetData.clusterId;
      this.clusterName = sharedTargetData.clusterName;
      this.clusterType = sharedTargetData.clusterType;
      this.entitlementKeys = sharedTargetData.entitlementKeys;
      this.namespace = sharedTargetData.namespace;
      this.region = sharedTargetData.region;
      this.resourceGroupId = sharedTargetData.resourceGroupId;
      this.workerCount = sharedTargetData.workerCount;
      this.workerMachineType = sharedTargetData.workerMachineType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SharedTargetData.
     *
     * @return the new SharedTargetData instance
     */
    public SharedTargetData build() {
      return new SharedTargetData(this);
    }

    /**
     * Adds an entitlementKeys to entitlementKeys.
     *
     * @param entitlementKeys the new entitlementKeys
     * @return the SharedTargetData builder
     */
    public Builder addEntitlementKeys(Object entitlementKeys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entitlementKeys,
        "entitlementKeys cannot be null");
      if (this.entitlementKeys == null) {
        this.entitlementKeys = new ArrayList<Object>();
      }
      this.entitlementKeys.add(entitlementKeys);
      return this;
    }

    /**
     * Set the clusterCreatedOn.
     *
     * @param clusterCreatedOn the clusterCreatedOn
     * @return the SharedTargetData builder
     */
    public Builder clusterCreatedOn(String clusterCreatedOn) {
      this.clusterCreatedOn = clusterCreatedOn;
      return this;
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the SharedTargetData builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the clusterName.
     *
     * @param clusterName the clusterName
     * @return the SharedTargetData builder
     */
    public Builder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set the clusterType.
     *
     * @param clusterType the clusterType
     * @return the SharedTargetData builder
     */
    public Builder clusterType(String clusterType) {
      this.clusterType = clusterType;
      return this;
    }

    /**
     * Set the entitlementKeys.
     * Existing entitlementKeys will be replaced.
     *
     * @param entitlementKeys the entitlementKeys
     * @return the SharedTargetData builder
     */
    public Builder entitlementKeys(List<Object> entitlementKeys) {
      this.entitlementKeys = entitlementKeys;
      return this;
    }

    /**
     * Set the namespace.
     *
     * @param namespace the namespace
     * @return the SharedTargetData builder
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the SharedTargetData builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the SharedTargetData builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the workerCount.
     *
     * @param workerCount the workerCount
     * @return the SharedTargetData builder
     */
    public Builder workerCount(long workerCount) {
      this.workerCount = workerCount;
      return this;
    }

    /**
     * Set the workerMachineType.
     *
     * @param workerMachineType the workerMachineType
     * @return the SharedTargetData builder
     */
    public Builder workerMachineType(String workerMachineType) {
      this.workerMachineType = workerMachineType;
      return this;
    }
  }

  protected SharedTargetData(Builder builder) {
    clusterCreatedOn = builder.clusterCreatedOn;
    clusterId = builder.clusterId;
    clusterName = builder.clusterName;
    clusterType = builder.clusterType;
    entitlementKeys = builder.entitlementKeys;
    namespace = builder.namespace;
    region = builder.region;
    resourceGroupId = builder.resourceGroupId;
    workerCount = builder.workerCount;
    workerMachineType = builder.workerMachineType;
  }

  /**
   * New builder.
   *
   * @return a SharedTargetData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterCreatedOn.
   *
   * Cluster created on.
   *
   * @return the clusterCreatedOn
   */
  public String clusterCreatedOn() {
    return clusterCreatedOn;
  }

  /**
   * Gets the clusterId.
   *
   * The ID of the cluster where you want to provision the resources of all IBM Cloud catalog templates that are
   * included in the catalog offering.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the clusterName.
   *
   * The cluster name.
   *
   * @return the clusterName
   */
  public String clusterName() {
    return clusterName;
  }

  /**
   * Gets the clusterType.
   *
   * The cluster type.
   *
   * @return the clusterType
   */
  public String clusterType() {
    return clusterType;
  }

  /**
   * Gets the entitlementKeys.
   *
   * The entitlement key that you want to use to install IBM Cloud entitled software.
   *
   * @return the entitlementKeys
   */
  public List<Object> entitlementKeys() {
    return entitlementKeys;
  }

  /**
   * Gets the namespace.
   *
   * The Kubernetes namespace or OpenShift project where the resources of all IBM Cloud catalog templates that are
   * included in the catalog offering are deployed into.
   *
   * @return the namespace
   */
  public String namespace() {
    return namespace;
  }

  /**
   * Gets the region.
   *
   * The IBM Cloud region that you want to use for the resources of all IBM Cloud catalog templates that are included in
   * the catalog offering.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the resourceGroupId.
   *
   * The ID of the resource group that you want to use for the resources of all IBM Cloud catalog templates that are
   * included in the catalog offering.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the workerCount.
   *
   * The cluster worker count.
   *
   * @return the workerCount
   */
  public Long workerCount() {
    return workerCount;
  }

  /**
   * Gets the workerMachineType.
   *
   * The cluster worker type.
   *
   * @return the workerMachineType
   */
  public String workerMachineType() {
    return workerMachineType;
  }
}

