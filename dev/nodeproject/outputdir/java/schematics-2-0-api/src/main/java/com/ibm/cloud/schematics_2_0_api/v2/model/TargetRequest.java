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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Target cluster details to perform POC operation.
 */
public class TargetRequest extends DynamicModel<Object> {

  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_name")
  protected String clusterName;
  @SerializedName("entitlement_key")
  protected Map<String, Object> entitlementKey;
  @SerializedName("namespace")
  protected String namespace;
  @SerializedName("region")
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;

  public TargetRequest() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

    private Builder(TargetRequest targetRequest) {
      this.clusterId = targetRequest.clusterId;
      this.clusterName = targetRequest.clusterName;
      this.entitlementKey = targetRequest.entitlementKey;
      this.namespace = targetRequest.namespace;
      this.region = targetRequest.region;
      this.resourceGroupId = targetRequest.resourceGroupId;
      this.dynamicProperties = targetRequest.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TargetRequest builder
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

  protected TargetRequest(Builder builder) {
    super(new TypeToken<Object>() { });
    clusterId = builder.clusterId;
    clusterName = builder.clusterName;
    entitlementKey = builder.entitlementKey;
    namespace = builder.namespace;
    region = builder.region;
    resourceGroupId = builder.resourceGroupId;
    this.setProperties(builder.dynamicProperties);
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
  public String getClusterId() {
    return this.clusterId;
  }

  /**
   * Sets the clusterId.
   *
   * @param clusterId the new clusterId
   */
  public void setClusterId(final String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Gets the clusterName.
   *
   * Cluster name.
   *
   * @return the clusterName
   */
  public String getClusterName() {
    return this.clusterName;
  }

  /**
   * Sets the clusterName.
   *
   * @param clusterName the new clusterName
   */
  public void setClusterName(final String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Gets the entitlementKey.
   *
   * Entitlement key.
   *
   * @return the entitlementKey
   */
  public Map<String, Object> getEntitlementKey() {
    return this.entitlementKey;
  }

  /**
   * Sets the entitlementKey.
   *
   * @param entitlementKey the new entitlementKey
   */
  public void setEntitlementKey(final Map<String, Object> entitlementKey) {
    this.entitlementKey = entitlementKey;
  }

  /**
   * Gets the namespace.
   *
   * K8s namespace.
   *
   * @return the namespace
   */
  public String getNamespace() {
    return this.namespace;
  }

  /**
   * Sets the namespace.
   *
   * @param namespace the new namespace
   */
  public void setNamespace(final String namespace) {
    this.namespace = namespace;
  }

  /**
   * Gets the region.
   *
   * Cluster region.
   *
   * @return the region
   */
  public String getRegion() {
    return this.region;
  }

  /**
   * Sets the region.
   *
   * @param region the new region
   */
  public void setRegion(final String region) {
    this.region = region;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Resource group id.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return this.resourceGroupId;
  }

  /**
   * Sets the resourceGroupId.
   *
   * @param resourceGroupId the new resourceGroupId
   */
  public void setResourceGroupId(final String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
  }
}
