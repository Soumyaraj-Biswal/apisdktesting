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
 * Action Job Status.
 */
public class JobStatusAction extends DynamicModel<Object> {

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

  /**
   * Status of Resources.
   */
  public interface BastionStatusCode {
    /** none. */
    String NONE = "none";
    /** ready. */
    String READY = "ready";
    /** processing. */
    String PROCESSING = "processing";
    /** error. */
    String ERROR = "error";
  }

  /**
   * Status of Resources.
   */
  public interface TargetsStatusCode {
    /** none. */
    String NONE = "none";
    /** ready. */
    String READY = "ready";
    /** processing. */
    String PROCESSING = "processing";
    /** error. */
    String ERROR = "error";
  }

  @SerializedName("action_name")
  protected String actionName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("bastion_status_code")
  protected String bastionStatusCode;
  @SerializedName("bastion_status_message")
  protected String bastionStatusMessage;
  @SerializedName("targets_status_code")
  protected String targetsStatusCode;
  @SerializedName("targets_status_message")
  protected String targetsStatusMessage;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStatusAction() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String actionName;
    private String statusCode;
    private String statusMessage;
    private String bastionStatusCode;
    private String bastionStatusMessage;
    private String targetsStatusCode;
    private String targetsStatusMessage;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobStatusAction jobStatusAction) {
      this.actionName = jobStatusAction.actionName;
      this.statusCode = jobStatusAction.statusCode;
      this.statusMessage = jobStatusAction.statusMessage;
      this.bastionStatusCode = jobStatusAction.bastionStatusCode;
      this.bastionStatusMessage = jobStatusAction.bastionStatusMessage;
      this.targetsStatusCode = jobStatusAction.targetsStatusCode;
      this.targetsStatusMessage = jobStatusAction.targetsStatusMessage;
      this.updatedAt = jobStatusAction.updatedAt;
      this.dynamicProperties = jobStatusAction.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusAction.
     *
     * @return the new JobStatusAction instance
     */
    public JobStatusAction build() {
      return new JobStatusAction(this);
    }

    /**
     * Set the actionName.
     *
     * @param actionName the actionName
     * @return the JobStatusAction builder
     */
    public Builder actionName(String actionName) {
      this.actionName = actionName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusAction builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusAction builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the bastionStatusCode.
     *
     * @param bastionStatusCode the bastionStatusCode
     * @return the JobStatusAction builder
     */
    public Builder bastionStatusCode(String bastionStatusCode) {
      this.bastionStatusCode = bastionStatusCode;
      return this;
    }

    /**
     * Set the bastionStatusMessage.
     *
     * @param bastionStatusMessage the bastionStatusMessage
     * @return the JobStatusAction builder
     */
    public Builder bastionStatusMessage(String bastionStatusMessage) {
      this.bastionStatusMessage = bastionStatusMessage;
      return this;
    }

    /**
     * Set the targetsStatusCode.
     *
     * @param targetsStatusCode the targetsStatusCode
     * @return the JobStatusAction builder
     */
    public Builder targetsStatusCode(String targetsStatusCode) {
      this.targetsStatusCode = targetsStatusCode;
      return this;
    }

    /**
     * Set the targetsStatusMessage.
     *
     * @param targetsStatusMessage the targetsStatusMessage
     * @return the JobStatusAction builder
     */
    public Builder targetsStatusMessage(String targetsStatusMessage) {
      this.targetsStatusMessage = targetsStatusMessage;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusAction builder
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
     * @return the JobStatusAction builder
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

  protected JobStatusAction(Builder builder) {
    super(new TypeToken<Object>() { });
    actionName = builder.actionName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    bastionStatusCode = builder.bastionStatusCode;
    bastionStatusMessage = builder.bastionStatusMessage;
    targetsStatusCode = builder.targetsStatusCode;
    targetsStatusMessage = builder.targetsStatusMessage;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobStatusAction builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionName.
   *
   * Action name.
   *
   * @return the actionName
   */
  public String getActionName() {
    return this.actionName;
  }

  /**
   * Sets the actionName.
   *
   * @param actionName the new actionName
   */
  public void setActionName(final String actionName) {
    this.actionName = actionName;
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
   * Action Job status message - to be displayed along with the action_status_code.
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
   * Gets the bastionStatusCode.
   *
   * Status of Resources.
   *
   * @return the bastionStatusCode
   */
  public String getBastionStatusCode() {
    return this.bastionStatusCode;
  }

  /**
   * Sets the bastionStatusCode.
   *
   * @param bastionStatusCode the new bastionStatusCode
   */
  public void setBastionStatusCode(final String bastionStatusCode) {
    this.bastionStatusCode = bastionStatusCode;
  }

  /**
   * Gets the bastionStatusMessage.
   *
   * Bastion status message - to be displayed along with the bastion_status_code;.
   *
   * @return the bastionStatusMessage
   */
  public String getBastionStatusMessage() {
    return this.bastionStatusMessage;
  }

  /**
   * Sets the bastionStatusMessage.
   *
   * @param bastionStatusMessage the new bastionStatusMessage
   */
  public void setBastionStatusMessage(final String bastionStatusMessage) {
    this.bastionStatusMessage = bastionStatusMessage;
  }

  /**
   * Gets the targetsStatusCode.
   *
   * Status of Resources.
   *
   * @return the targetsStatusCode
   */
  public String getTargetsStatusCode() {
    return this.targetsStatusCode;
  }

  /**
   * Sets the targetsStatusCode.
   *
   * @param targetsStatusCode the new targetsStatusCode
   */
  public void setTargetsStatusCode(final String targetsStatusCode) {
    this.targetsStatusCode = targetsStatusCode;
  }

  /**
   * Gets the targetsStatusMessage.
   *
   * Aggregated status message for all target resources,  to be displayed along with the targets_status_code;.
   *
   * @return the targetsStatusMessage
   */
  public String getTargetsStatusMessage() {
    return this.targetsStatusMessage;
  }

  /**
   * Sets the targetsStatusMessage.
   *
   * @param targetsStatusMessage the new targetsStatusMessage
   */
  public void setTargetsStatusMessage(final String targetsStatusMessage) {
    this.targetsStatusMessage = targetsStatusMessage;
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
