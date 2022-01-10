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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List of workspaces.
 */
public class WorkspaceResponseList extends GenericModel {

  protected Long count;
  protected Long limit;
  protected Long offset;
  protected List<WorkspaceResponse> workspaces;

  /**
   * Gets the count.
   *
   * The number of workspaces in the IBM Cloud account that you have access to and that matched your search criteria.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the limit.
   *
   * The `limit` value that you set in your API request and that represents the maximum number of workspaces that you
   * wanted to list.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The `offset` value that you set in your API request. The offset value represents the position number of the
   * workspace from which you wanted to start listing your workspaces.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the workspaces.
   *
   * The list of workspaces that was included in your API response.
   *
   * @return the workspaces
   */
  public List<WorkspaceResponse> getWorkspaces() {
    return workspaces;
  }
}

