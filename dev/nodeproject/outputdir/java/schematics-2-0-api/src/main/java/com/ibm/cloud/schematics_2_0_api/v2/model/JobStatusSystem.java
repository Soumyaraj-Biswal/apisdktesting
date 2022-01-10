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
 * System Job Status.
 */
public class JobStatusSystem extends DynamicModel<Object> {

  /**
   * Status of Jobs.
   */
  public interface SystemStatusCode {
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

  @SerializedName("system_status_message")
  protected String systemStatusMessage;
  @SerializedName("system_status_code")
  protected String systemStatusCode;
  @SerializedName("schematics_resource_status")
  protected List<JobStatusSchematicsResources> schematicsResourceStatus;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStatusSystem() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String systemStatusMessage;
    private String systemStatusCode;
    private List<JobStatusSchematicsResources> schematicsResourceStatus;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatusSystem jobStatusSystem) {
      this.systemStatusMessage = jobStatusSystem.systemStatusMessage;
      this.systemStatusCode = jobStatusSystem.systemStatusCode;
      this.schematicsResourceStatus = jobStatusSystem.schematicsResourceStatus;
      this.updatedAt = jobStatusSystem.updatedAt;
      this.dynamicProperties = jobStatusSystem.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusSystem.
     *
     * @return the new JobStatusSystem instance
     */
    public JobStatusSystem build() {
      return new JobStatusSystem(this);
    }

    /**
     * Adds an schematicsResourceStatus to schematicsResourceStatus.
     *
     * @param schematicsResourceStatus the new schematicsResourceStatus
     * @return the JobStatusSystem builder
     */
    public Builder addSchematicsResourceStatus(JobStatusSchematicsResources schematicsResourceStatus) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(schematicsResourceStatus,
        "schematicsResourceStatus cannot be null");
      if (this.schematicsResourceStatus == null) {
        this.schematicsResourceStatus = new ArrayList<JobStatusSchematicsResources>();
      }
      this.schematicsResourceStatus.add(schematicsResourceStatus);
      return this;
    }

    /**
     * Set the systemStatusMessage.
     *
     * @param systemStatusMessage the systemStatusMessage
     * @return the JobStatusSystem builder
     */
    public Builder systemStatusMessage(String systemStatusMessage) {
      this.systemStatusMessage = systemStatusMessage;
      return this;
    }

    /**
     * Set the systemStatusCode.
     *
     * @param systemStatusCode the systemStatusCode
     * @return the JobStatusSystem builder
     */
    public Builder systemStatusCode(String systemStatusCode) {
      this.systemStatusCode = systemStatusCode;
      return this;
    }

    /**
     * Set the schematicsResourceStatus.
     * Existing schematicsResourceStatus will be replaced.
     *
     * @param schematicsResourceStatus the schematicsResourceStatus
     * @return the JobStatusSystem builder
     */
    public Builder schematicsResourceStatus(List<JobStatusSchematicsResources> schematicsResourceStatus) {
      this.schematicsResourceStatus = schematicsResourceStatus;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusSystem builder
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
     * @return the JobStatusSystem builder
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

  protected JobStatusSystem(Builder builder) {
    super(new TypeToken<Object>() { });
    systemStatusMessage = builder.systemStatusMessage;
    systemStatusCode = builder.systemStatusCode;
    schematicsResourceStatus = builder.schematicsResourceStatus;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatusSystem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the systemStatusMessage.
   *
   * System job message.
   *
   * @return the systemStatusMessage
   */
  public String getSystemStatusMessage() {
    return this.systemStatusMessage;
  }

  /**
   * Sets the systemStatusMessage.
   *
   * @param systemStatusMessage the new systemStatusMessage
   */
  public void setSystemStatusMessage(final String systemStatusMessage) {
    this.systemStatusMessage = systemStatusMessage;
  }

  /**
   * Gets the systemStatusCode.
   *
   * Status of Jobs.
   *
   * @return the systemStatusCode
   */
  public String getSystemStatusCode() {
    return this.systemStatusCode;
  }

  /**
   * Sets the systemStatusCode.
   *
   * @param systemStatusCode the new systemStatusCode
   */
  public void setSystemStatusCode(final String systemStatusCode) {
    this.systemStatusCode = systemStatusCode;
  }

  /**
   * Gets the schematicsResourceStatus.
   *
   * job staus for each schematics resource.
   *
   * @return the schematicsResourceStatus
   */
  public List<JobStatusSchematicsResources> getSchematicsResourceStatus() {
    return this.schematicsResourceStatus;
  }

  /**
   * Sets the schematicsResourceStatus.
   *
   * @param schematicsResourceStatus the new schematicsResourceStatus
   */
  public void setSchematicsResourceStatus(final List<JobStatusSchematicsResources> schematicsResourceStatus) {
    this.schematicsResourceStatus = schematicsResourceStatus;
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
