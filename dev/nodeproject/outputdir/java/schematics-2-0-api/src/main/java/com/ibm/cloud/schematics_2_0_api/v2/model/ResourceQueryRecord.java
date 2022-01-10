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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Describe resource query record.
 */
public class ResourceQueryRecord extends DynamicModel<Object> {

  /**
   * Resource type (cluster, vsi, icd, vpc).
   */
  public interface Type {
    /** vsi. */
    String VSI = "vsi";
  }

  @SerializedName("type")
  protected String type;
  @SerializedName("name")
  protected String name;
  @SerializedName("id")
  protected String id;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("queries")
  protected List<ResourceQuery> queries;

  public ResourceQueryRecord() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the type.
   *
   * Resource type (cluster, vsi, icd, vpc).
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Gets the name.
   *
   * Resource query name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the id.
   *
   * Resource Query id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the createdAt.
   *
   * Resource query creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the Resource query.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Resource query updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the Resource query.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the queries.
   *
   * @return the queries
   */
  public List<ResourceQuery> getQueries() {
    return this.queries;
  }
}
