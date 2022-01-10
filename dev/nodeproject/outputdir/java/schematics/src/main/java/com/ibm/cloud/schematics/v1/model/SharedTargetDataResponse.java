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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the Target used by the templates originating from IBM Cloud catalog offerings. This information is
 * not relevant when you create a workspace from your own Terraform template.
 */
public class SharedTargetDataResponse extends GenericModel {

  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_name")
  protected String clusterName;
  @SerializedName("entitlement_keys")
  protected List<Object> entitlementKeys;
  protected String namespace;
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;

  /**
   * Gets the clusterId.
   *
   * The ID of the cluster where you want to provision the resources of all IBM Cloud catalog templates that are
   * included in the catalog offering.
   *
   * @return the clusterId
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Gets the clusterName.
   *
   * Target cluster name.
   *
   * @return the clusterName
   */
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Gets the entitlementKeys.
   *
   * The entitlement key that you want to use to install IBM Cloud entitled software.
   *
   * @return the entitlementKeys
   */
  public List<Object> getEntitlementKeys() {
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
  public String getNamespace() {
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
  public String getRegion() {
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
  public String getResourceGroupId() {
    return resourceGroupId;
  }
}

