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
 * Job data.
 */
public class JobData extends DynamicModel<Object> {

  /**
   * Type of Job.
   */
  public interface JobType {
    /** repo_download_job. */
    String REPO_DOWNLOAD_JOB = "repo_download_job";
    /** workspace_job. */
    String WORKSPACE_JOB = "workspace_job";
    /** action_job. */
    String ACTION_JOB = "action_job";
    /** system_job. */
    String SYSTEM_JOB = "system_job";
    /** flow-job. */
    String FLOW_JOB = "flow-job";
  }

  @SerializedName("job_type")
  protected String jobType;
  @SerializedName("workspace_job_data")
  protected JobDataWorkspace workspaceJobData;
  @SerializedName("action_job_data")
  protected JobDataAction actionJobData;
  @SerializedName("system_job_data")
  protected JobDataSystem systemJobData;
  @SerializedName("flow_job_data")
  protected JobDataFlow flowJobData;

  public JobData() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String jobType;
    private JobDataWorkspace workspaceJobData;
    private JobDataAction actionJobData;
    private JobDataSystem systemJobData;
    private JobDataFlow flowJobData;
    private Map<String, Object> dynamicProperties;

    private Builder(JobData jobData) {
      this.jobType = jobData.jobType;
      this.workspaceJobData = jobData.workspaceJobData;
      this.actionJobData = jobData.actionJobData;
      this.systemJobData = jobData.systemJobData;
      this.flowJobData = jobData.flowJobData;
      this.dynamicProperties = jobData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobType the jobType
     */
    public Builder(String jobType) {
      this.jobType = jobType;
    }

    /**
     * Builds a JobData.
     *
     * @return the new JobData instance
     */
    public JobData build() {
      return new JobData(this);
    }

    /**
     * Set the jobType.
     *
     * @param jobType the jobType
     * @return the JobData builder
     */
    public Builder jobType(String jobType) {
      this.jobType = jobType;
      return this;
    }

    /**
     * Set the workspaceJobData.
     *
     * @param workspaceJobData the workspaceJobData
     * @return the JobData builder
     */
    public Builder workspaceJobData(JobDataWorkspace workspaceJobData) {
      this.workspaceJobData = workspaceJobData;
      return this;
    }

    /**
     * Set the actionJobData.
     *
     * @param actionJobData the actionJobData
     * @return the JobData builder
     */
    public Builder actionJobData(JobDataAction actionJobData) {
      this.actionJobData = actionJobData;
      return this;
    }

    /**
     * Set the systemJobData.
     *
     * @param systemJobData the systemJobData
     * @return the JobData builder
     */
    public Builder systemJobData(JobDataSystem systemJobData) {
      this.systemJobData = systemJobData;
      return this;
    }

    /**
     * Set the flowJobData.
     *
     * @param flowJobData the flowJobData
     * @return the JobData builder
     */
    public Builder flowJobData(JobDataFlow flowJobData) {
      this.flowJobData = flowJobData;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobData builder
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

  protected JobData(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobType,
      "jobType cannot be null");
    jobType = builder.jobType;
    workspaceJobData = builder.workspaceJobData;
    actionJobData = builder.actionJobData;
    systemJobData = builder.systemJobData;
    flowJobData = builder.flowJobData;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobType.
   *
   * Type of Job.
   *
   * @return the jobType
   */
  public String getJobType() {
    return this.jobType;
  }

  /**
   * Sets the jobType.
   *
   * @param jobType the new jobType
   */
  public void setJobType(final String jobType) {
    this.jobType = jobType;
  }

  /**
   * Gets the workspaceJobData.
   *
   * Workspace Job data.
   *
   * @return the workspaceJobData
   */
  public JobDataWorkspace getWorkspaceJobData() {
    return this.workspaceJobData;
  }

  /**
   * Sets the workspaceJobData.
   *
   * @param workspaceJobData the new workspaceJobData
   */
  public void setWorkspaceJobData(final JobDataWorkspace workspaceJobData) {
    this.workspaceJobData = workspaceJobData;
  }

  /**
   * Gets the actionJobData.
   *
   * Action Job data.
   *
   * @return the actionJobData
   */
  public JobDataAction getActionJobData() {
    return this.actionJobData;
  }

  /**
   * Sets the actionJobData.
   *
   * @param actionJobData the new actionJobData
   */
  public void setActionJobData(final JobDataAction actionJobData) {
    this.actionJobData = actionJobData;
  }

  /**
   * Gets the systemJobData.
   *
   * Controls Job data.
   *
   * @return the systemJobData
   */
  public JobDataSystem getSystemJobData() {
    return this.systemJobData;
  }

  /**
   * Sets the systemJobData.
   *
   * @param systemJobData the new systemJobData
   */
  public void setSystemJobData(final JobDataSystem systemJobData) {
    this.systemJobData = systemJobData;
  }

  /**
   * Gets the flowJobData.
   *
   * Flow Job data.
   *
   * @return the flowJobData
   */
  public JobDataFlow getFlowJobData() {
    return this.flowJobData;
  }

  /**
   * Sets the flowJobData.
   *
   * @param flowJobData the new flowJobData
   */
  public void setFlowJobData(final JobDataFlow flowJobData) {
    this.flowJobData = flowJobData;
  }
}
