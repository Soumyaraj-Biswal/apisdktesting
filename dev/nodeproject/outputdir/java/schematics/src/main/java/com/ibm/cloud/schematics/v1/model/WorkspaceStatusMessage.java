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
 * Information about the last job that ran against the workspace. -.
 */
public class WorkspaceStatusMessage extends GenericModel {

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_msg")
  protected String statusMsg;

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusMsg;

    private Builder(WorkspaceStatusMessage workspaceStatusMessage) {
      this.statusCode = workspaceStatusMessage.statusCode;
      this.statusMsg = workspaceStatusMessage.statusMsg;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkspaceStatusMessage.
     *
     * @return the new WorkspaceStatusMessage instance
     */
    public WorkspaceStatusMessage build() {
      return new WorkspaceStatusMessage(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the WorkspaceStatusMessage builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMsg.
     *
     * @param statusMsg the statusMsg
     * @return the WorkspaceStatusMessage builder
     */
    public Builder statusMsg(String statusMsg) {
      this.statusMsg = statusMsg;
      return this;
    }
  }

  protected WorkspaceStatusMessage(Builder builder) {
    statusCode = builder.statusCode;
    statusMsg = builder.statusMsg;
  }

  /**
   * New builder.
   *
   * @return a WorkspaceStatusMessage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the statusCode.
   *
   * The success or error code that was returned for the last plan, apply, or destroy job that ran against your
   * workspace.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMsg.
   *
   * The success or error message that was returned for the last plan, apply, or destroy job that ran against your
   * workspace.
   *
   * @return the statusMsg
   */
  public String statusMsg() {
    return statusMsg;
  }
}

