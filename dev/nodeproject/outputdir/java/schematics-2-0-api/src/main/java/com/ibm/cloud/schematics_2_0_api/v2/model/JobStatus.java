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
 * Job Status.
 */
public class JobStatus extends DynamicModel<Object> {

  @SerializedName("workspace_job_status")
  protected JobStatusWorkspace workspaceJobStatus;
  @SerializedName("action_job_status")
  protected JobStatusAction actionJobStatus;
  @SerializedName("system_job_status")
  protected JobStatusSystem systemJobStatus;
  @SerializedName("flow_job_status")
  protected JobStatusFlow flowJobStatus;

  public JobStatus() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private JobStatusWorkspace workspaceJobStatus;
    private JobStatusAction actionJobStatus;
    private JobStatusSystem systemJobStatus;
    private JobStatusFlow flowJobStatus;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatus jobStatus) {
      this.workspaceJobStatus = jobStatus.workspaceJobStatus;
      this.actionJobStatus = jobStatus.actionJobStatus;
      this.systemJobStatus = jobStatus.systemJobStatus;
      this.flowJobStatus = jobStatus.flowJobStatus;
      this.dynamicProperties = jobStatus.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatus.
     *
     * @return the new JobStatus instance
     */
    public JobStatus build() {
      return new JobStatus(this);
    }

    /**
     * Set the workspaceJobStatus.
     *
     * @param workspaceJobStatus the workspaceJobStatus
     * @return the JobStatus builder
     */
    public Builder workspaceJobStatus(JobStatusWorkspace workspaceJobStatus) {
      this.workspaceJobStatus = workspaceJobStatus;
      return this;
    }

    /**
     * Set the actionJobStatus.
     *
     * @param actionJobStatus the actionJobStatus
     * @return the JobStatus builder
     */
    public Builder actionJobStatus(JobStatusAction actionJobStatus) {
      this.actionJobStatus = actionJobStatus;
      return this;
    }

    /**
     * Set the systemJobStatus.
     *
     * @param systemJobStatus the systemJobStatus
     * @return the JobStatus builder
     */
    public Builder systemJobStatus(JobStatusSystem systemJobStatus) {
      this.systemJobStatus = systemJobStatus;
      return this;
    }

    /**
     * Set the flowJobStatus.
     *
     * @param flowJobStatus the flowJobStatus
     * @return the JobStatus builder
     */
    public Builder flowJobStatus(JobStatusFlow flowJobStatus) {
      this.flowJobStatus = flowJobStatus;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobStatus builder
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

  protected JobStatus(Builder builder) {
    super(new TypeToken<Object>() { });
    workspaceJobStatus = builder.workspaceJobStatus;
    actionJobStatus = builder.actionJobStatus;
    systemJobStatus = builder.systemJobStatus;
    flowJobStatus = builder.flowJobStatus;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatus builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceJobStatus.
   *
   * Workspace Job Status.
   *
   * @return the workspaceJobStatus
   */
  public JobStatusWorkspace getWorkspaceJobStatus() {
    return this.workspaceJobStatus;
  }

  /**
   * Sets the workspaceJobStatus.
   *
   * @param workspaceJobStatus the new workspaceJobStatus
   */
  public void setWorkspaceJobStatus(final JobStatusWorkspace workspaceJobStatus) {
    this.workspaceJobStatus = workspaceJobStatus;
  }

  /**
   * Gets the actionJobStatus.
   *
   * Action Job Status.
   *
   * @return the actionJobStatus
   */
  public JobStatusAction getActionJobStatus() {
    return this.actionJobStatus;
  }

  /**
   * Sets the actionJobStatus.
   *
   * @param actionJobStatus the new actionJobStatus
   */
  public void setActionJobStatus(final JobStatusAction actionJobStatus) {
    this.actionJobStatus = actionJobStatus;
  }

  /**
   * Gets the systemJobStatus.
   *
   * System Job Status.
   *
   * @return the systemJobStatus
   */
  public JobStatusSystem getSystemJobStatus() {
    return this.systemJobStatus;
  }

  /**
   * Sets the systemJobStatus.
   *
   * @param systemJobStatus the new systemJobStatus
   */
  public void setSystemJobStatus(final JobStatusSystem systemJobStatus) {
    this.systemJobStatus = systemJobStatus;
  }

  /**
   * Gets the flowJobStatus.
   *
   * Environment Flow JOB Status.
   *
   * @return the flowJobStatus
   */
  public JobStatusFlow getFlowJobStatus() {
    return this.flowJobStatus;
  }

  /**
   * Sets the flowJobStatus.
   *
   * @param flowJobStatus the new flowJobStatus
   */
  public void setFlowJobStatus(final JobStatusFlow flowJobStatus) {
    this.flowJobStatus = flowJobStatus;
  }
}
