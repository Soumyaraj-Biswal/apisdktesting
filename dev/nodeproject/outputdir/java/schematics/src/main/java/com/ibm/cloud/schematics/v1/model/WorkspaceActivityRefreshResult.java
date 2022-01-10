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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response after successfully initiating a request to `refresh` the Terraform template in IBM Cloud.
 */
public class WorkspaceActivityRefreshResult extends GenericModel {

  protected String activityid;

  /**
   * Gets the activityid.
   *
   * The ID of the activity or job that was created for your workspace `refresh` activity or job.  You can use the ID to
   * retrieve the log file by using the `GET /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   * @return the activityid
   */
  public String getActivityid() {
    return activityid;
  }
}

