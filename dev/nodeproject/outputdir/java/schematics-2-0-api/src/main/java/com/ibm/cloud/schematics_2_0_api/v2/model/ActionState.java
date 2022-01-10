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
 * Computed state of the Action.
 */
public class ActionState extends DynamicModel<Object> {

  /**
   * Status of automation (workspace or action).
   */
  public interface StatusCode {
    /** normal. */
    String NORMAL = "normal";
    /** pending. */
    String PENDING = "pending";
    /** disabled. */
    String DISABLED = "disabled";
    /** critical. */
    String CRITICAL = "critical";
  }

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_job_id")
  protected String statusJobId;
  @SerializedName("status_message")
  protected String statusMessage;

  public ActionState() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusJobId;
    private String statusMessage;
    private Map<String, Object> dynamicProperties;

    private Builder(ActionState actionState) {
      this.statusCode = actionState.statusCode;
      this.statusJobId = actionState.statusJobId;
      this.statusMessage = actionState.statusMessage;
      this.dynamicProperties = actionState.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionState.
     *
     * @return the new ActionState instance
     */
    public ActionState build() {
      return new ActionState(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the ActionState builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusJobId.
     *
     * @param statusJobId the statusJobId
     * @return the ActionState builder
     */
    public Builder statusJobId(String statusJobId) {
      this.statusJobId = statusJobId;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the ActionState builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ActionState builder
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

  protected ActionState(Builder builder) {
    super(new TypeToken<Object>() { });
    statusCode = builder.statusCode;
    statusJobId = builder.statusJobId;
    statusMessage = builder.statusMessage;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ActionState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the statusCode.
   *
   * Status of automation (workspace or action).
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
   * Gets the statusJobId.
   *
   * Job id reference for this status.
   *
   * @return the statusJobId
   */
  public String getStatusJobId() {
    return this.statusJobId;
  }

  /**
   * Sets the statusJobId.
   *
   * @param statusJobId the new statusJobId
   */
  public void setStatusJobId(final String statusJobId) {
    this.statusJobId = statusJobId;
  }

  /**
   * Gets the statusMessage.
   *
   * Automation status message - to be displayed along with the status_code.
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
}
