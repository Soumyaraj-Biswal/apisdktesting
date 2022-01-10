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
 * System lock status.
 */
public class SystemLock extends GenericModel {

  @SerializedName("sys_locked")
  protected Boolean sysLocked;
  @SerializedName("sys_locked_by")
  protected String sysLockedBy;
  @SerializedName("sys_locked_at")
  protected Date sysLockedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean sysLocked;
    private String sysLockedBy;
    private Date sysLockedAt;

    private Builder(SystemLock systemLock) {
      this.sysLocked = systemLock.sysLocked;
      this.sysLockedBy = systemLock.sysLockedBy;
      this.sysLockedAt = systemLock.sysLockedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SystemLock.
     *
     * @return the new SystemLock instance
     */
    public SystemLock build() {
      return new SystemLock(this);
    }

    /**
     * Set the sysLocked.
     *
     * @param sysLocked the sysLocked
     * @return the SystemLock builder
     */
    public Builder sysLocked(Boolean sysLocked) {
      this.sysLocked = sysLocked;
      return this;
    }

    /**
     * Set the sysLockedBy.
     *
     * @param sysLockedBy the sysLockedBy
     * @return the SystemLock builder
     */
    public Builder sysLockedBy(String sysLockedBy) {
      this.sysLockedBy = sysLockedBy;
      return this;
    }

    /**
     * Set the sysLockedAt.
     *
     * @param sysLockedAt the sysLockedAt
     * @return the SystemLock builder
     */
    public Builder sysLockedAt(Date sysLockedAt) {
      this.sysLockedAt = sysLockedAt;
      return this;
    }
  }

  protected SystemLock(Builder builder) {
    sysLocked = builder.sysLocked;
    sysLockedBy = builder.sysLockedBy;
    sysLockedAt = builder.sysLockedAt;
  }

  /**
   * New builder.
   *
   * @return a SystemLock builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sysLocked.
   *
   * Is the automation locked by a Schematic job ?.
   *
   * @return the sysLocked
   */
  public Boolean sysLocked() {
    return sysLocked;
  }

  /**
   * Gets the sysLockedBy.
   *
   * Name of the User who performed the job, that lead to the locking of the automation.
   *
   * @return the sysLockedBy
   */
  public String sysLockedBy() {
    return sysLockedBy;
  }

  /**
   * Gets the sysLockedAt.
   *
   * When the User performed the job that lead to locking of the automation ?.
   *
   * @return the sysLockedAt
   */
  public Date sysLockedAt() {
    return sysLockedAt;
  }
}

