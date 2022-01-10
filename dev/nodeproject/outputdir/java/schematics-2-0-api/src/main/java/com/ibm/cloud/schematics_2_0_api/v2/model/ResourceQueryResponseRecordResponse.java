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
 * ResourceQueryResponseRecordResponse.
 */
public class ResourceQueryResponseRecordResponse extends DynamicModel<Object> {

  /**
   * Type of the query(workspaces).
   */
  public interface QueryType {
    /** workspaces. */
    String WORKSPACES = "workspaces";
  }

  @SerializedName("query_type")
  protected String queryType;
  @SerializedName("query_condition")
  protected List<ResourceQueryParam> queryCondition;
  @SerializedName("query_select")
  protected List<String> querySelect;
  @SerializedName("query_output")
  protected List<ResourceQueryResponseRecordQueryOutput> queryOutput;

  public ResourceQueryResponseRecordResponse() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the queryType.
   *
   * Type of the query(workspaces).
   *
   * @return the queryType
   */
  public String getQueryType() {
    return this.queryType;
  }

  /**
   * Gets the queryCondition.
   *
   * @return the queryCondition
   */
  public List<ResourceQueryParam> getQueryCondition() {
    return this.queryCondition;
  }

  /**
   * Gets the querySelect.
   *
   * List of query selection parameters.
   *
   * @return the querySelect
   */
  public List<String> getQuerySelect() {
    return this.querySelect;
  }

  /**
   * Gets the queryOutput.
   *
   * @return the queryOutput
   */
  public List<ResourceQueryResponseRecordQueryOutput> getQueryOutput() {
    return this.queryOutput;
  }
}
