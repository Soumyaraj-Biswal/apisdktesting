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
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * schematics Resources Job Status.
 */
public class JobStatusSchematicsResources extends DynamicModel<Object> {

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

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("schematics_resource_id")
  protected String schematicsResourceId;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStatusSchematicsResources() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusMessage;
    private String schematicsResourceId;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatusSchematicsResources jobStatusSchematicsResources) {
      this.statusCode = jobStatusSchematicsResources.statusCode;
      this.statusMessage = jobStatusSchematicsResources.statusMessage;
      this.schematicsResourceId = jobStatusSchematicsResources.schematicsResourceId;
      this.updatedAt = jobStatusSchematicsResources.updatedAt;
      this.dynamicProperties = jobStatusSchematicsResources.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusSchematicsResources.
     *
     * @return the new JobStatusSchematicsResources instance
     */
    public JobStatusSchematicsResources build() {
      return new JobStatusSchematicsResources(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusSchematicsResources builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusSchematicsResources builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the schematicsResourceId.
     *
     * @param schematicsResourceId the schematicsResourceId
     * @return the JobStatusSchematicsResources builder
     */
    public Builder schematicsResourceId(String schematicsResourceId) {
      this.schematicsResourceId = schematicsResourceId;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusSchematicsResources builder
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
     * @return the JobStatusSchematicsResources builder
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

  protected JobStatusSchematicsResources(Builder builder) {
    super(new TypeToken<Object>() { });
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    schematicsResourceId = builder.schematicsResourceId;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatusSchematicsResources builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * system job status message.
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
   * Gets the schematicsResourceId.
   *
   * id for each resource which is targeted as a part of system job.
   *
   * @return the schematicsResourceId
   */
  public String getSchematicsResourceId() {
    return this.schematicsResourceId;
  }

  /**
   * Sets the schematicsResourceId.
   *
   * @param schematicsResourceId the new schematicsResourceId
   */
  public void setSchematicsResourceId(final String schematicsResourceId) {
    this.schematicsResourceId = schematicsResourceId;
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
