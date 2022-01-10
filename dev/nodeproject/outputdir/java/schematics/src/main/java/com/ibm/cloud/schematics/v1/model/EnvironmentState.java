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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Computed state of the Environment.
 */
public class EnvironmentState extends GenericModel {

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
  @SerializedName("status_message")
  protected String statusMessage;

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusMessage;

    private Builder(EnvironmentState environmentState) {
      this.statusCode = environmentState.statusCode;
      this.statusMessage = environmentState.statusMessage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnvironmentState.
     *
     * @return the new EnvironmentState instance
     */
    public EnvironmentState build() {
      return new EnvironmentState(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the EnvironmentState builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the EnvironmentState builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }
  }

  protected EnvironmentState(Builder builder) {
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
  }

  /**
   * New builder.
   *
   * @return a EnvironmentState builder
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
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * Automation status message - to be displayed along with the status_code.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }
}

