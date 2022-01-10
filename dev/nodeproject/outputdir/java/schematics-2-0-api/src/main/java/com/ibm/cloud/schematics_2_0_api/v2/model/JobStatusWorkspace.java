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
 * Workspace Job Status.
 */
public class JobStatusWorkspace extends DynamicModel<Object> {

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

  @SerializedName("workspace_name")
  protected String workspaceName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("flow_status")
  protected JobStatusFlow flowStatus;
  @SerializedName("template_status")
  protected List<JobStatusTemplate> templateStatus;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStatusWorkspace() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceName;
    private String statusCode;
    private String statusMessage;
    private JobStatusFlow flowStatus;
    private List<JobStatusTemplate> templateStatus;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatusWorkspace jobStatusWorkspace) {
      this.workspaceName = jobStatusWorkspace.workspaceName;
      this.statusCode = jobStatusWorkspace.statusCode;
      this.statusMessage = jobStatusWorkspace.statusMessage;
      this.flowStatus = jobStatusWorkspace.flowStatus;
      this.templateStatus = jobStatusWorkspace.templateStatus;
      this.updatedAt = jobStatusWorkspace.updatedAt;
      this.dynamicProperties = jobStatusWorkspace.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusWorkspace.
     *
     * @return the new JobStatusWorkspace instance
     */
    public JobStatusWorkspace build() {
      return new JobStatusWorkspace(this);
    }

    /**
     * Adds an templateStatus to templateStatus.
     *
     * @param templateStatus the new templateStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder addTemplateStatus(JobStatusTemplate templateStatus) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templateStatus,
        "templateStatus cannot be null");
      if (this.templateStatus == null) {
        this.templateStatus = new ArrayList<JobStatusTemplate>();
      }
      this.templateStatus.add(templateStatus);
      return this;
    }

    /**
     * Set the workspaceName.
     *
     * @param workspaceName the workspaceName
     * @return the JobStatusWorkspace builder
     */
    public Builder workspaceName(String workspaceName) {
      this.workspaceName = workspaceName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusWorkspace builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusWorkspace builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the flowStatus.
     *
     * @param flowStatus the flowStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder flowStatus(JobStatusFlow flowStatus) {
      this.flowStatus = flowStatus;
      return this;
    }

    /**
     * Set the templateStatus.
     * Existing templateStatus will be replaced.
     *
     * @param templateStatus the templateStatus
     * @return the JobStatusWorkspace builder
     */
    public Builder templateStatus(List<JobStatusTemplate> templateStatus) {
      this.templateStatus = templateStatus;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusWorkspace builder
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
     * @return the JobStatusWorkspace builder
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

  protected JobStatusWorkspace(Builder builder) {
    super(new TypeToken<Object>() { });
    workspaceName = builder.workspaceName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    flowStatus = builder.flowStatus;
    templateStatus = builder.templateStatus;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatusWorkspace builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceName.
   *
   * Workspace name.
   *
   * @return the workspaceName
   */
  public String getWorkspaceName() {
    return this.workspaceName;
  }

  /**
   * Sets the workspaceName.
   *
   * @param workspaceName the new workspaceName
   */
  public void setWorkspaceName(final String workspaceName) {
    this.workspaceName = workspaceName;
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
   * Workspace job status message (eg. App1_Setup_Pending, for a 'Setup' flow in the 'App1' Workspace).
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
   * Gets the flowStatus.
   *
   * Environment Flow JOB Status.
   *
   * @return the flowStatus
   */
  public JobStatusFlow getFlowStatus() {
    return this.flowStatus;
  }

  /**
   * Sets the flowStatus.
   *
   * @param flowStatus the new flowStatus
   */
  public void setFlowStatus(final JobStatusFlow flowStatus) {
    this.flowStatus = flowStatus;
  }

  /**
   * Gets the templateStatus.
   *
   * Workspace Flow Template job status.
   *
   * @return the templateStatus
   */
  public List<JobStatusTemplate> getTemplateStatus() {
    return this.templateStatus;
  }

  /**
   * Sets the templateStatus.
   *
   * @param templateStatus the new templateStatus
   */
  public void setTemplateStatus(final List<JobStatusTemplate> templateStatus) {
    this.templateStatus = templateStatus;
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
