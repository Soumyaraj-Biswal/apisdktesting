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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Complete Private cluster details provided by user and system generated.
 */
public class PrivateCluster extends DynamicModel<Object> {

  /**
   * Health of the remote Cluster.
   */
  public interface ClusterHealth {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("kube_config")
  protected String kubeConfig;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("registered_by")
  protected String registeredBy;
  @SerializedName("registered_at")
  protected Date registeredAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("cluster_health")
  protected String clusterHealth;
  @SerializedName("last_health_checked_at")
  protected Date lastHealthCheckedAt;

  public PrivateCluster() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterId;
    private String kubeConfig;
    private List<String> tags;
    private UserState userState;
    private String registeredBy;
    private Date registeredAt;
    private Date updatedAt;
    private String updatedBy;
    private SystemLock sysLock;
    private String clusterHealth;
    private Date lastHealthCheckedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(PrivateCluster privateCluster) {
      this.clusterId = privateCluster.clusterId;
      this.kubeConfig = privateCluster.kubeConfig;
      this.tags = privateCluster.tags;
      this.userState = privateCluster.userState;
      this.registeredBy = privateCluster.registeredBy;
      this.registeredAt = privateCluster.registeredAt;
      this.updatedAt = privateCluster.updatedAt;
      this.updatedBy = privateCluster.updatedBy;
      this.sysLock = privateCluster.sysLock;
      this.clusterHealth = privateCluster.clusterHealth;
      this.lastHealthCheckedAt = privateCluster.lastHealthCheckedAt;
      this.dynamicProperties = privateCluster.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrivateCluster.
     *
     * @return the new PrivateCluster instance
     */
    public PrivateCluster build() {
      return new PrivateCluster(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the PrivateCluster builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the PrivateCluster builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the kubeConfig.
     *
     * @param kubeConfig the kubeConfig
     * @return the PrivateCluster builder
     */
    public Builder kubeConfig(String kubeConfig) {
      this.kubeConfig = kubeConfig;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the PrivateCluster builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the PrivateCluster builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the registeredBy.
     *
     * @param registeredBy the registeredBy
     * @return the PrivateCluster builder
     */
    public Builder registeredBy(String registeredBy) {
      this.registeredBy = registeredBy;
      return this;
    }

    /**
     * Set the registeredAt.
     *
     * @param registeredAt the registeredAt
     * @return the PrivateCluster builder
     */
    public Builder registeredAt(Date registeredAt) {
      this.registeredAt = registeredAt;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the PrivateCluster builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Set the updatedBy.
     *
     * @param updatedBy the updatedBy
     * @return the PrivateCluster builder
     */
    public Builder updatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the PrivateCluster builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the clusterHealth.
     *
     * @param clusterHealth the clusterHealth
     * @return the PrivateCluster builder
     */
    public Builder clusterHealth(String clusterHealth) {
      this.clusterHealth = clusterHealth;
      return this;
    }

    /**
     * Set the lastHealthCheckedAt.
     *
     * @param lastHealthCheckedAt the lastHealthCheckedAt
     * @return the PrivateCluster builder
     */
    public Builder lastHealthCheckedAt(Date lastHealthCheckedAt) {
      this.lastHealthCheckedAt = lastHealthCheckedAt;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the PrivateCluster builder
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

  protected PrivateCluster(Builder builder) {
    super(new TypeToken<Object>() { });
    clusterId = builder.clusterId;
    kubeConfig = builder.kubeConfig;
    tags = builder.tags;
    userState = builder.userState;
    registeredBy = builder.registeredBy;
    registeredAt = builder.registeredAt;
    updatedAt = builder.updatedAt;
    updatedBy = builder.updatedBy;
    sysLock = builder.sysLock;
    clusterHealth = builder.clusterHealth;
    lastHealthCheckedAt = builder.lastHealthCheckedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a PrivateCluster builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterId.
   *
   * Id of the remote K8s Cluster to run the Schematics Jobs.
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
   * Gets the kubeConfig.
   *
   * Kube Config to connect to the Cluster.
   *
   * @return the kubeConfig
   */
  public String getKubeConfig() {
    return this.kubeConfig;
  }

  /**
   * Sets the kubeConfig.
   *
   * @param kubeConfig the new kubeConfig
   */
  public void setKubeConfig(final String kubeConfig) {
    this.kubeConfig = kubeConfig;
  }

  /**
   * Gets the tags.
   *
   * SchematicsJobCluster definition tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return this.tags;
  }

  /**
   * Sets the tags.
   *
   * @param tags the new tags
   */
  public void setTags(final List<String> tags) {
    this.tags = tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final UserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the registeredBy.
   *
   * Name of the user who registered the remote K8s cluster.
   *
   * @return the registeredBy
   */
  public String getRegisteredBy() {
    return this.registeredBy;
  }

  /**
   * Sets the registeredBy.
   *
   * @param registeredBy the new registeredBy
   */
  public void setRegisteredBy(final String registeredBy) {
    this.registeredBy = registeredBy;
  }

  /**
   * Gets the registeredAt.
   *
   * Timestamp of SchematicsJobCluster registration.
   *
   * @return the registeredAt
   */
  public Date getRegisteredAt() {
    return this.registeredAt;
  }

  /**
   * Sets the registeredAt.
   *
   * @param registeredAt the new registeredAt
   */
  public void setRegisteredAt(final Date registeredAt) {
    this.registeredAt = registeredAt;
  }

  /**
   * Gets the updatedAt.
   *
   * SchematicsJobCluster updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the SchematicsJobCluster definitio.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Sets the updatedBy.
   *
   * @param updatedBy the new updatedBy
   */
  public void setUpdatedBy(final String updatedBy) {
    this.updatedBy = updatedBy;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return this.sysLock;
  }

  /**
   * Sets the sysLock.
   *
   * @param sysLock the new sysLock
   */
  public void setSysLock(final SystemLock sysLock) {
    this.sysLock = sysLock;
  }

  /**
   * Gets the clusterHealth.
   *
   * Health of the remote Cluster.
   *
   * @return the clusterHealth
   */
  public String getClusterHealth() {
    return this.clusterHealth;
  }

  /**
   * Sets the clusterHealth.
   *
   * @param clusterHealth the new clusterHealth
   */
  public void setClusterHealth(final String clusterHealth) {
    this.clusterHealth = clusterHealth;
  }

  /**
   * Gets the lastHealthCheckedAt.
   *
   * Timestamp of the last health check.
   *
   * @return the lastHealthCheckedAt
   */
  public Date getLastHealthCheckedAt() {
    return this.lastHealthCheckedAt;
  }

  /**
   * Sets the lastHealthCheckedAt.
   *
   * @param lastHealthCheckedAt the new lastHealthCheckedAt
   */
  public void setLastHealthCheckedAt(final Date lastHealthCheckedAt) {
    this.lastHealthCheckedAt = lastHealthCheckedAt;
  }
}
