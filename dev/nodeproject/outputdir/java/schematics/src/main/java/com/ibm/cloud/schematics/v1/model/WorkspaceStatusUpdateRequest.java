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
 * Input to update the workspace status.
 */
public class WorkspaceStatusUpdateRequest extends GenericModel {

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

    private Builder(WorkspaceStatusUpdateRequest workspaceStatusUpdateRequest) {
      this.frozen = workspaceStatusUpdateRequest.frozen;
      this.frozenAt = workspaceStatusUpdateRequest.frozenAt;
      this.frozenBy = workspaceStatusUpdateRequest.frozenBy;
      this.locked = workspaceStatusUpdateRequest.locked;
      this.lockedBy = workspaceStatusUpdateRequest.lockedBy;
      this.lockedTime = workspaceStatusUpdateRequest.lockedTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkspaceStatusUpdateRequest.
     *
     * @return the new WorkspaceStatusUpdateRequest instance
     */
    public WorkspaceStatusUpdateRequest build() {
      return new WorkspaceStatusUpdateRequest(this);
    }

    /**
     * Set the frozen.
     *
     * @param frozen the frozen
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder frozen(Boolean frozen) {
      this.frozen = frozen;
      return this;
    }

    /**
     * Set the frozenAt.
     *
     * @param frozenAt the frozenAt
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder frozenAt(Date frozenAt) {
      this.frozenAt = frozenAt;
      return this;
    }

    /**
     * Set the frozenBy.
     *
     * @param frozenBy the frozenBy
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder frozenBy(String frozenBy) {
      this.frozenBy = frozenBy;
      return this;
    }

    /**
     * Set the locked.
     *
     * @param locked the locked
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder locked(Boolean locked) {
      this.locked = locked;
      return this;
    }

    /**
     * Set the lockedBy.
     *
     * @param lockedBy the lockedBy
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder lockedBy(String lockedBy) {
      this.lockedBy = lockedBy;
      return this;
    }

    /**
     * Set the lockedTime.
     *
     * @param lockedTime the lockedTime
     * @return the WorkspaceStatusUpdateRequest builder
     */
    public Builder lockedTime(Date lockedTime) {
      this.lockedTime = lockedTime;
      return this;
    }
  }

  protected WorkspaceStatusUpdateRequest(Builder builder) {
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
   * @return a WorkspaceStatusUpdateRequest builder
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
   * Frozen at.
   *
   * @return the frozenAt
   */
  public Date frozenAt() {
    return frozenAt;
  }

  /**
   * Gets the frozenBy.
   *
   * Frozen by.
   *
   * @return the frozenBy
   */
  public String frozenBy() {
    return frozenBy;
  }

  /**
   * Gets the locked.
   *
   * Locked status.
   *
   * @return the locked
   */
  public Boolean locked() {
    return locked;
  }

  /**
   * Gets the lockedBy.
   *
   * Locked by.
   *
   * @return the lockedBy
   */
  public String lockedBy() {
    return lockedBy;
  }

  /**
   * Gets the lockedTime.
   *
   * Locked at.
   *
   * @return the lockedTime
   */
  public Date lockedTime() {
    return lockedTime;
  }
}

