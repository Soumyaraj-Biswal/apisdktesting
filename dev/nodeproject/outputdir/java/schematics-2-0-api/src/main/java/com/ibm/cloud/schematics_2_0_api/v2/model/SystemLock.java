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
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * System lock status.
 */
public class SystemLock extends DynamicModel<Object> {

  @SerializedName("sys_locked")
  protected Boolean sysLocked;
  @SerializedName("sys_locked_by")
  protected String sysLockedBy;
  @SerializedName("sys_locked_at")
  protected Date sysLockedAt;

  public SystemLock() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean sysLocked;
    private String sysLockedBy;
    private Date sysLockedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(SystemLock systemLock) {
      this.sysLocked = systemLock.sysLocked;
      this.sysLockedBy = systemLock.sysLockedBy;
      this.sysLockedAt = systemLock.sysLockedAt;
      this.dynamicProperties = systemLock.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SystemLock builder
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

  protected SystemLock(Builder builder) {
    super(new TypeToken<Object>() { });
    sysLocked = builder.sysLocked;
    sysLockedBy = builder.sysLockedBy;
    sysLockedAt = builder.sysLockedAt;
    this.setProperties(builder.dynamicProperties);
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
  public Boolean isSysLocked() {
    return this.sysLocked;
  }

  /**
   * Sets the sysLocked.
   *
   * @param sysLocked the new sysLocked
   */
  public void setSysLocked(final Boolean sysLocked) {
    this.sysLocked = sysLocked;
  }

  /**
   * Gets the sysLockedBy.
   *
   * Name of the User who performed the job, that lead to the locking of the automation.
   *
   * @return the sysLockedBy
   */
  public String getSysLockedBy() {
    return this.sysLockedBy;
  }

  /**
   * Sets the sysLockedBy.
   *
   * @param sysLockedBy the new sysLockedBy
   */
  public void setSysLockedBy(final String sysLockedBy) {
    this.sysLockedBy = sysLockedBy;
  }

  /**
   * Gets the sysLockedAt.
   *
   * When the User performed the job that lead to locking of the automation ?.
   *
   * @return the sysLockedAt
   */
  public Date getSysLockedAt() {
    return this.sysLockedAt;
  }

  /**
   * Sets the sysLockedAt.
   *
   * @param sysLockedAt the new sysLockedAt
   */
  public void setSysLockedAt(final Date sysLockedAt) {
    this.sysLockedAt = sysLockedAt;
  }
}
