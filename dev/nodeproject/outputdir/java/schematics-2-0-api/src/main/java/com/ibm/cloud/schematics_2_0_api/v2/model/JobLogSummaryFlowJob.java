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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Flow Job log summary.
 */
public class JobLogSummaryFlowJob extends DynamicModel<Object> {

  @SerializedName("workitems_completed")
  protected Double workitemsCompleted;
  @SerializedName("workitems_pending")
  protected Double workitemsPending;
  @SerializedName("workitems_failed")
  protected Double workitemsFailed;
  @SerializedName("workitems")
  protected List<JobLogSummaryWorkitems> workitems;

  public JobLogSummaryFlowJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<JobLogSummaryWorkitems> workitems;
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryFlowJob jobLogSummaryFlowJob) {
      this.workitems = jobLogSummaryFlowJob.workitems;
      this.dynamicProperties = jobLogSummaryFlowJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryFlowJob.
     *
     * @return the new JobLogSummaryFlowJob instance
     */
    public JobLogSummaryFlowJob build() {
      return new JobLogSummaryFlowJob(this);
    }

    /**
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the JobLogSummaryFlowJob builder
     */
    public Builder addWorkitems(JobLogSummaryWorkitems workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<JobLogSummaryWorkitems>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the JobLogSummaryFlowJob builder
     */
    public Builder workitems(List<JobLogSummaryWorkitems> workitems) {
      this.workitems = workitems;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryFlowJob builder
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

  protected JobLogSummaryFlowJob(Builder builder) {
    super(new TypeToken<Object>() { });
    workitems = builder.workitems;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryFlowJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workitemsCompleted.
   *
   * Number of workitems completed successfully.
   *
   * @return the workitemsCompleted
   */
  public Double getWorkitemsCompleted() {
    return this.workitemsCompleted;
  }

  /**
   * Gets the workitemsPending.
   *
   * Number of workitems pending in the flow.
   *
   * @return the workitemsPending
   */
  public Double getWorkitemsPending() {
    return this.workitemsPending;
  }

  /**
   * Gets the workitemsFailed.
   *
   * Number of workitems failed.
   *
   * @return the workitemsFailed
   */
  public Double getWorkitemsFailed() {
    return this.workitemsFailed;
  }

  /**
   * Gets the workitems.
   *
   * @return the workitems
   */
  public List<JobLogSummaryWorkitems> getWorkitems() {
    return this.workitems;
  }

  /**
   * Sets the workitems.
   *
   * @param workitems the new workitems
   */
  public void setWorkitems(final List<JobLogSummaryWorkitems> workitems) {
    this.workitems = workitems;
  }
}
