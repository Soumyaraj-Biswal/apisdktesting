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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Flow summary profile with system generated data.
 */
public class TemplateFlowLite extends DynamicModel<Object> {

  /**
   * Type of flow.
   */
  public interface Type {
    /** simple_flow. */
    String SIMPLE_FLOW = "simple_flow";
    /** node_red_flow. */
    String NODE_RED_FLOW = "node_red_flow";
  }

  @SerializedName("id")
  protected String id;
  @SerializedName("name")
  protected String name;
  @SerializedName("version")
  protected String version;
  @SerializedName("type")
  protected String type;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("status")
  protected JobStatusWorkspaceTemplateFlow status;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;

  public TemplateFlowLite() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * Id of the Flow.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the name.
   *
   * Name of the Flow.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the version.
   *
   * Version of the flow definition. Only value 'V1' is accepted.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Gets the type.
   *
   * Type of flow.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
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
   * Gets the status.
   *
   * Flow Job Status.
   *
   * @return the status
   */
  public JobStatusWorkspaceTemplateFlow getStatus() {
    return this.status;
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
   * Gets the createdAt.
   *
   * Flow creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the flow.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * TemplateFlow updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the flow.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }
}
