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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Workspace Job log summary.
 */
public class JobLogSummaryWorkspaceJob extends DynamicModel<Object> {

  @SerializedName("resources_add")
  protected Double resourcesAdd;
  @SerializedName("resources_modify")
  protected Double resourcesModify;
  @SerializedName("resources_destroy")
  protected Double resourcesDestroy;

  public JobLogSummaryWorkspaceJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJob) {
      this.dynamicProperties = jobLogSummaryWorkspaceJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryWorkspaceJob.
     *
     * @return the new JobLogSummaryWorkspaceJob instance
     */
    public JobLogSummaryWorkspaceJob build() {
      return new JobLogSummaryWorkspaceJob(this);
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryWorkspaceJob builder
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

  protected JobLogSummaryWorkspaceJob(Builder builder) {
    super(new TypeToken<Object>() { });
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryWorkspaceJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourcesAdd.
   *
   * Number of resources add.
   *
   * @return the resourcesAdd
   */
  public Double getResourcesAdd() {
    return this.resourcesAdd;
  }

  /**
   * Gets the resourcesModify.
   *
   * Number of resources modify.
   *
   * @return the resourcesModify
   */
  public Double getResourcesModify() {
    return this.resourcesModify;
  }

  /**
   * Gets the resourcesDestroy.
   *
   * Number of resources destroy.
   *
   * @return the resourcesDestroy
   */
  public Double getResourcesDestroy() {
    return this.resourcesDestroy;
  }
}
