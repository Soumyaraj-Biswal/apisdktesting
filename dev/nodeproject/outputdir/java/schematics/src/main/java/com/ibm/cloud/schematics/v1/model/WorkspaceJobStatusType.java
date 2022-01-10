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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status of the workspace bulk job.
 */
public class WorkspaceJobStatusType extends GenericModel {

  protected List<String> failed;
  @SerializedName("in_progress")
  protected List<String> inProgress;
  protected List<String> success;
  @SerializedName("last_updated_on")
  protected Date lastUpdatedOn;

  /**
   * Gets the failed.
   *
   * List of failed workspace jobs.
   *
   * @return the failed
   */
  public List<String> getFailed() {
    return failed;
  }

  /**
   * Gets the inProgress.
   *
   * List of in_progress workspace jobs.
   *
   * @return the inProgress
   */
  public List<String> getInProgress() {
    return inProgress;
  }

  /**
   * Gets the success.
   *
   * List of successful workspace jobs.
   *
   * @return the success
   */
  public List<String> getSuccess() {
    return success;
  }

  /**
   * Gets the lastUpdatedOn.
   *
   * Workspace job status updated at.
   *
   * @return the lastUpdatedOn
   */
  public Date getLastUpdatedOn() {
    return lastUpdatedOn;
  }
}

