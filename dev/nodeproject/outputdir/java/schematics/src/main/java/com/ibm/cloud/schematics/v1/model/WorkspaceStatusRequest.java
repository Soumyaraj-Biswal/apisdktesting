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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WorkspaceStatusRequest -.
 */
public class WorkspaceStatusRequest extends GenericModel {

  protected Boolean frozen;
  @SerializedName("frozen_at")
  protected Date frozenAt;
  @SerializedName("frozen_by")
  protected String frozenBy;
  protected Boolean locked;
  @SerializedName("locked_by")
  protected String lockedBy;
  @SerializedName("locked_time")
  protected Date lockedTime;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean frozen;
    private Date frozenAt;
    private String frozenBy;
    private Boolean locked;
    private String lockedBy;
    private Date lockedTime;

    private Builder(WorkspaceStatusRequest workspaceStatusRequest) {
      this.frozen = workspaceStatusRequest.frozen;
      this.frozenAt = workspaceStatusRequest.frozenAt;
      this.frozenBy = workspaceStatusRequest.frozenBy;
      this.locked = workspaceStatusRequest.locked;
      this.lockedBy = workspaceStatusRequest.lockedBy;
      this.lockedTime = workspaceStatusRequest.lockedTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkspaceStatusRequest.
     *
     * @return the new WorkspaceStatusRequest instance
     */
    public WorkspaceStatusRequest build() {
      return new WorkspaceStatusRequest(this);
    }

    /**
     * Set the frozen.
     *
     * @param frozen the frozen
     * @return the WorkspaceStatusRequest builder
     */
    public Builder frozen(Boolean frozen) {
      this.frozen = frozen;
      return this;
    }

    /**
     * Set the frozenAt.
     *
     * @param frozenAt the frozenAt
     * @return the WorkspaceStatusRequest builder
     */
    public Builder frozenAt(Date frozenAt) {
      this.frozenAt = frozenAt;
      return this;
    }

    /**
     * Set the frozenBy.
     *
     * @param frozenBy the frozenBy
     * @return the WorkspaceStatusRequest builder
     */
    public Builder frozenBy(String frozenBy) {
      this.frozenBy = frozenBy;
      return this;
    }

    /**
     * Set the locked.
     *
     * @param locked the locked
     * @return the WorkspaceStatusRequest builder
     */
    public Builder locked(Boolean locked) {
      this.locked = locked;
      return this;
    }

    /**
     * Set the lockedBy.
     *
     * @param lockedBy the lockedBy
     * @return the WorkspaceStatusRequest builder
     */
    public Builder lockedBy(String lockedBy) {
      this.lockedBy = lockedBy;
      return this;
    }

    /**
     * Set the lockedTime.
     *
     * @param lockedTime the lockedTime
     * @return the WorkspaceStatusRequest builder
     */
    public Builder lockedTime(Date lockedTime) {
      this.lockedTime = lockedTime;
      return this;
    }
  }

  protected WorkspaceStatusRequest(Builder builder) {
    frozen = builder.frozen;
    frozenAt = builder.frozenAt;
    frozenBy = builder.frozenBy;
    locked = builder.locked;
    lockedBy = builder.lockedBy;
    lockedTime = builder.lockedTime;
  }

  /**
   * New builder.
   *
   * @return a WorkspaceStatusRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the frozen.
   *
   * If set to true, the workspace is frozen and changes to the workspace are disabled.
   *
   * @return the frozen
   */
  public Boolean frozen() {
    return frozen;
  }

  /**
   * Gets the frozenAt.
   *
   * The timestamp when the workspace was frozen.
   *
   * @return the frozenAt
   */
  public Date frozenAt() {
    return frozenAt;
  }

  /**
   * Gets the frozenBy.
   *
   * The user ID that froze the workspace.
   *
   * @return the frozenBy
   */
  public String frozenBy() {
    return frozenBy;
  }

  /**
   * Gets the locked.
   *
   * If set to true, the workspace is locked and disabled for changes.
   *
   * @return the locked
   */
  public Boolean locked() {
    return locked;
  }

  /**
   * Gets the lockedBy.
   *
   * The user ID that initiated a resource-related job, such as applying or destroying resources, that locked the
   * workspace.
   *
   * @return the lockedBy
   */
  public String lockedBy() {
    return lockedBy;
  }

  /**
   * Gets the lockedTime.
   *
   * The timestamp when the workspace was locked.
   *
   * @return the lockedTime
   */
  public Date lockedTime() {
    return lockedTime;
  }
}

