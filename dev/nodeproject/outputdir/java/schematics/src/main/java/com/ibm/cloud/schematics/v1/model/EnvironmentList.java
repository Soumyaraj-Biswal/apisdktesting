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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List of Environments.
 */
public class EnvironmentList extends GenericModel {

  @SerializedName("total_count")
  protected Long totalCount;
  protected Long limit;
  protected Long offset;
  protected List<EnvironmentLite> environments;

  /**
   * Gets the totalCount.
   *
   * Total number of Environment records.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the limit.
   *
   * Number of Environment records returned.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * Skipped number of Environment records.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the environments.
   *
   * List of Environments.
   *
   * @return the environments
   */
  public List<EnvironmentLite> getEnvironments() {
    return environments;
  }
}

