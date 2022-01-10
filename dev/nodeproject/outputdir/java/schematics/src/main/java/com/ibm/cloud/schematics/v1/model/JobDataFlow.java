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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Flow Job data.
 */
public class JobDataFlow extends GenericModel {

  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  protected List<JobDataWorkItem> workitems;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private String flowName;
    private List<JobDataWorkItem> workitems;
    private Date updatedAt;

    private Builder(JobDataFlow jobDataFlow) {
      this.flowId = jobDataFlow.flowId;
      this.flowName = jobDataFlow.flowName;
      this.workitems = jobDataFlow.workitems;
      this.updatedAt = jobDataFlow.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataFlow.
     *
     * @return the new JobDataFlow instance
     */
    public JobDataFlow build() {
      return new JobDataFlow(this);
    }

    /**
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the JobDataFlow builder
     */
    public Builder addWorkitems(JobDataWorkItem workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<JobDataWorkItem>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the JobDataFlow builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the flowName.
     *
     * @param flowName the flowName
     * @return the JobDataFlow builder
     */
    public Builder flowName(String flowName) {
      this.flowName = flowName;
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the JobDataFlow builder
     */
    public Builder workitems(List<JobDataWorkItem> workitems) {
      this.workitems = workitems;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataFlow builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobDataFlow(Builder builder) {
    flowId = builder.flowId;
    flowName = builder.flowName;
    workitems = builder.workitems;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobDataFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * Flow ID.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the flowName.
   *
   * Flow Name.
   *
   * @return the flowName
   */
  public String flowName() {
    return flowName;
  }

  /**
   * Gets the workitems.
   *
   * Job data used by each workitem Job.
   *
   * @return the workitems
   */
  public List<JobDataWorkItem> workitems() {
    return workitems;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

