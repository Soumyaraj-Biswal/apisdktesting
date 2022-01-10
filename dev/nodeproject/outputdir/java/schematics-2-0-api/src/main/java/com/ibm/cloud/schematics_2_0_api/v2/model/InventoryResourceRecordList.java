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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * List of Inventory resource records.
 */
public class InventoryResourceRecordList extends DynamicModel<Object> {

  @SerializedName("total_count")
  protected Long totalCount;
  @SerializedName("limit")
  protected Long limit;
  @SerializedName("offset")
  protected Long offset;
  @SerializedName("inventories")
  protected List<InventoryResourceRecord> inventories;

  public InventoryResourceRecordList() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the totalCount.
   *
   * Total number of records.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return this.totalCount;
  }

  /**
   * Gets the limit.
   *
   * Number of records returned.
   *
   * @return the limit
   */
  public Long getLimit() {
    return this.limit;
  }

  /**
   * Gets the offset.
   *
   * Skipped number of records.
   *
   * @return the offset
   */
  public Long getOffset() {
    return this.offset;
  }

  /**
   * Gets the inventories.
   *
   * List of inventory resource records.
   *
   * @return the inventories
   */
  public List<InventoryResourceRecord> getInventories() {
    return this.inventories;
  }
}
