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
 * Response that indicate the status of the workspace as either frozen or locked.
 */
public class WorkspaceStatusResponse extends GenericModel {

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
   * Gets the frozen.
   *
   * If set to true, the workspace is frozen and changes to the workspace are disabled.
   *
   * @return the frozen
   */
  public Boolean isFrozen() {
    return frozen;
  }

  /**
   * Gets the frozenAt.
   *
   * The timestamp when the workspace was frozen.
   *
   * @return the frozenAt
   */
  public Date getFrozenAt() {
    return frozenAt;
  }

  /**
   * Gets the frozenBy.
   *
   * The user ID that froze the workspace.
   *
   * @return the frozenBy
   */
  public String getFrozenBy() {
    return frozenBy;
  }

  /**
   * Gets the locked.
   *
   * If set to true, the workspace is locked and disabled for changes.
   *
   * @return the locked
   */
  public Boolean isLocked() {
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
  public String getLockedBy() {
    return lockedBy;
  }

  /**
   * Gets the lockedTime.
   *
   * The timestamp when the workspace was locked.
   *
   * @return the lockedTime
   */
  public Date getLockedTime() {
    return lockedTime;
  }
}

