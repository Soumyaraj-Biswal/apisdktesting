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
 * Environment Flow JOB Status.
 */
public class JobStatusFlow extends DynamicModel<Object> {

  /**
   * Status of Jobs.
   */
  public interface StatusCode {
    /** job_pending. */
    String JOB_PENDING = "job_pending";
    /** job_in_progress. */
    String JOB_IN_PROGRESS = "job_in_progress";
    /** job_finished. */
    String JOB_FINISHED = "job_finished";
    /** job_failed. */
    String JOB_FAILED = "job_failed";
    /** job_cancelled. */
    String JOB_CANCELLED = "job_cancelled";
  }

  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_name")
  protected String flowName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("workitems")
  protected List<JobStatusWorkitem> workitems;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStatusFlow() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private String flowName;
    private String statusCode;
    private String statusMessage;
    private List<JobStatusWorkitem> workitems;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatusFlow jobStatusFlow) {
      this.flowId = jobStatusFlow.flowId;
      this.flowName = jobStatusFlow.flowName;
      this.statusCode = jobStatusFlow.statusCode;
      this.statusMessage = jobStatusFlow.statusMessage;
      this.workitems = jobStatusFlow.workitems;
      this.updatedAt = jobStatusFlow.updatedAt;
      this.dynamicProperties = jobStatusFlow.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusFlow.
     *
     * @return the new JobStatusFlow instance
     */
    public JobStatusFlow build() {
      return new JobStatusFlow(this);
    }

    /**
     * Adds an workitems to workitems.
     *
     * @param workitems the new workitems
     * @return the JobStatusFlow builder
     */
    public Builder addWorkitems(JobStatusWorkitem workitems) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workitems,
        "workitems cannot be null");
      if (this.workitems == null) {
        this.workitems = new ArrayList<JobStatusWorkitem>();
      }
      this.workitems.add(workitems);
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the JobStatusFlow builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the flowName.
     *
     * @param flowName the flowName
     * @return the JobStatusFlow builder
     */
    public Builder flowName(String flowName) {
      this.flowName = flowName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusFlow builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusFlow builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the workitems.
     * Existing workitems will be replaced.
     *
     * @param workitems the workitems
     * @return the JobStatusFlow builder
     */
    public Builder workitems(List<JobStatusWorkitem> workitems) {
      this.workitems = workitems;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusFlow builder
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
     * @return the JobStatusFlow builder
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

  protected JobStatusFlow(Builder builder) {
    super(new TypeToken<Object>() { });
    flowId = builder.flowId;
    flowName = builder.flowName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    workitems = builder.workitems;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatusFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * flow id.
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
   * flow name.
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
   * Gets the statusCode.
   *
   * Status of Jobs.
   *
   * @return the statusCode
   */
  public String getStatusCode() {
    return this.statusCode;
  }

  /**
   * Sets the statusCode.
   *
   * @param statusCode the new statusCode
   */
  public void setStatusCode(final String statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * Flow Job status message - to be displayed along with the status_code;.
   *
   * @return the statusMessage
   */
  public String getStatusMessage() {
    return this.statusMessage;
  }

  /**
   * Sets the statusMessage.
   *
   * @param statusMessage the new statusMessage
   */
  public void setStatusMessage(final String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * Gets the workitems.
   *
   * Environment's individual workItem status details;.
   *
   * @return the workitems
   */
  public List<JobStatusWorkitem> getWorkitems() {
    return this.workitems;
  }

  /**
   * Sets the workitems.
   *
   * @param workitems the new workitems
   */
  public void setWorkitems(final List<JobStatusWorkitem> workitems) {
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
