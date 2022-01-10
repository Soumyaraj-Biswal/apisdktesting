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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Target cluster details to perform POC operation.
 */
public class TargetRequest extends GenericModel {

  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_name")
  protected String clusterName;
  @SerializedName("entitlement_key")
  protected Map<String, Object> entitlementKey;
  protected String namespace;
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterId;
    private String clusterName;
    private Map<String, Object> entitlementKey;
    private String namespace;
    private String region;
    private String resourceGroupId;

    private Builder(TargetRequest targetRequest) {
      this.clusterId = targetRequest.clusterId;
      this.clusterName = targetRequest.clusterName;
      this.entitlementKey = targetRequest.entitlementKey;
      this.namespace = targetRequest.namespace;
      this.region = targetRequest.region;
      this.resourceGroupId = targetRequest.resourceGroupId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TargetRequest.
     *
     * @return the new TargetRequest instance
     */
    public TargetRequest build() {
      return new TargetRequest(this);
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the TargetRequest builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the clusterName.
     *
     * @param clusterName the clusterName
     * @return the TargetRequest builder
     */
    public Builder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set the entitlementKey.
     *
     * @param entitlementKey the entitlementKey
     * @return the TargetRequest builder
     */
    public Builder entitlementKey(Map<String, Object> entitlementKey) {
      this.entitlementKey = entitlementKey;
      return this;
    }

    /**
     * Set the namespace.
     *
     * @param namespace the namespace
     * @return the TargetRequest builder
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the TargetRequest builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the TargetRequest builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }
  }

  protected TargetRequest(Builder builder) {
    clusterId = builder.clusterId;
    clusterName = builder.clusterName;
    entitlementKey = builder.entitlementKey;
    namespace = builder.namespace;
    region = builder.region;
    resourceGroupId = builder.resourceGroupId;
  }

  /**
   * New builder.
   *
   * @return a TargetRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterId.
   *
   * Cluster Id.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the clusterName.
   *
   * Cluster name.
   *
   * @return the clusterName
   */
  public String clusterName() {
    return clusterName;
  }

  /**
   * Gets the entitlementKey.
   *
   * Entitlement key.
   *
   * @return the entitlementKey
   */
  public Map<String, Object> entitlementKey() {
    return entitlementKey;
  }

  /**
   * Gets the namespace.
   *
   * K8s namespace.
   *
   * @return the namespace
   */
  public String namespace() {
    return namespace;
  }

  /**
   * Gets the region.
   *
   * Cluster region.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Resource group id.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }
}

