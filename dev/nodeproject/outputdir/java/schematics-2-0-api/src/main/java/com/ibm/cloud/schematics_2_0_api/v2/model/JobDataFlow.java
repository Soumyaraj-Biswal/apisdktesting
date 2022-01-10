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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Flow Job data.
 */
public class JobDataFlow extends DynamicModel<Object> {

  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  @SerializedName("workitems")
  protected List<JobDataWorkItem> workitems;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobDataFlow() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private String flowName;
    private List<JobDataWorkItem> workitems;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataFlow jobDataFlow) {
      this.flowId = jobDataFlow.flowId;
      this.flowName = jobDataFlow.flowName;
      this.workitems = jobDataFlow.workitems;
      this.updatedAt = jobDataFlow.updatedAt;
      this.dynamicProperties = jobDataFlow.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataFlow builder
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

  protected JobDataFlow(Builder builder) {
    super(new TypeToken<Object>() { });
    flowId = builder.flowId;
    flowName = builder.flowName;
    workitems = builder.workitems;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
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
  public String getFlowId() {
    return this.flowId;
  }

  /**
   * Sets the flowId.
   *
   * @param flowId the new flowId
   */
  public void setFlowId(final String flowId) {
    this.flowId = flowId;
  }

  /**
   * Gets the flowName.
   *
   * Flow Name.
   *
   * @return the flowName
   */
  public String getFlowName() {
    return this.flowName;
  }

  /**
   * Sets the flowName.
   *
   * @param flowName the new flowName
   */
  public void setFlowName(final String flowName) {
    this.flowName = flowName;
  }

  /**
   * Gets the workitems.
   *
   * Job data used by each workitem Job.
   *
   * @return the workitems
   */
  public List<JobDataWorkItem> getWorkitems() {
    return this.workitems;
  }

  /**
   * Sets the workitems.
   *
   * @param workitems the new workitems
   */
  public void setWorkitems(final List<JobDataWorkItem> workitems) {
    this.workitems = workitems;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
