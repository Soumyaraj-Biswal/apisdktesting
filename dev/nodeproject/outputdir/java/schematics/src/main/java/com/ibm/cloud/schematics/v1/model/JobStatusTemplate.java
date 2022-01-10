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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Template Job Status.
 */
public class JobStatusTemplate extends GenericModel {

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

  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("template_name")
  protected String templateName;
  @SerializedName("flow_index")
  protected Long flowIndex;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String templateId;
    private String templateName;
    private Long flowIndex;
    private String statusCode;
    private String statusMessage;
    private Date updatedAt;

    private Builder(JobStatusTemplate jobStatusTemplate) {
      this.templateId = jobStatusTemplate.templateId;
      this.templateName = jobStatusTemplate.templateName;
      this.flowIndex = jobStatusTemplate.flowIndex;
      this.statusCode = jobStatusTemplate.statusCode;
      this.statusMessage = jobStatusTemplate.statusMessage;
      this.updatedAt = jobStatusTemplate.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusTemplate.
     *
     * @return the new JobStatusTemplate instance
     */
    public JobStatusTemplate build() {
      return new JobStatusTemplate(this);
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the JobStatusTemplate builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the templateName.
     *
     * @param templateName the templateName
     * @return the JobStatusTemplate builder
     */
    public Builder templateName(String templateName) {
      this.templateName = templateName;
      return this;
    }

    /**
     * Set the flowIndex.
     *
     * @param flowIndex the flowIndex
     * @return the JobStatusTemplate builder
     */
    public Builder flowIndex(long flowIndex) {
      this.flowIndex = flowIndex;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusTemplate builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusTemplate builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusTemplate builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobStatusTemplate(Builder builder) {
    templateId = builder.templateId;
    templateName = builder.templateName;
    flowIndex = builder.flowIndex;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobStatusTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templateId.
   *
   * Template Id.
   *
   * @return the templateId
   */
  public String templateId() {
    return templateId;
  }

  /**
   * Gets the templateName.
   *
   * Template name.
   *
   * @return the templateName
   */
  public String templateName() {
    return templateName;
  }

  /**
   * Gets the flowIndex.
   *
   * Index of the template in the Flow.
   *
   * @return the flowIndex
   */
  public Long flowIndex() {
    return flowIndex;
  }

  /**
   * Gets the statusCode.
   *
   * Status of Jobs.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * Template job status message (eg. VPCt1_Apply_Pending, for a 'VPCt1' Template).
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
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

