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
 * JobLogSummaryLogErrors.
 */
public class JobLogSummaryLogErrors extends GenericModel {

  @SerializedName("error_code")
  protected String errorCode;
  @SerializedName("error_msg")
  protected String errorMsg;
  @SerializedName("error_count")
  protected Double errorCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String errorCode;
    private String errorMsg;
    private Double errorCount;

    private Builder(JobLogSummaryLogErrors jobLogSummaryLogErrors) {
      this.errorCode = jobLogSummaryLogErrors.errorCode;
      this.errorMsg = jobLogSummaryLogErrors.errorMsg;
      this.errorCount = jobLogSummaryLogErrors.errorCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryLogErrors.
     *
     * @return the new JobLogSummaryLogErrors instance
     */
    public JobLogSummaryLogErrors build() {
      return new JobLogSummaryLogErrors(this);
    }

    /**
     * Set the errorCode.
     *
     * @param errorCode the errorCode
     * @return the JobLogSummaryLogErrors builder
     */
    public Builder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * Set the errorMsg.
     *
     * @param errorMsg the errorMsg
     * @return the JobLogSummaryLogErrors builder
     */
    public Builder errorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    /**
     * Set the errorCount.
     *
     * @param errorCount the errorCount
     * @return the JobLogSummaryLogErrors builder
     */
    public Builder errorCount(Double errorCount) {
      this.errorCount = errorCount;
      return this;
    }
  }

  protected JobLogSummaryLogErrors(Builder builder) {
    errorCode = builder.errorCode;
    errorMsg = builder.errorMsg;
    errorCount = builder.errorCount;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryLogErrors builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the errorCode.
   *
   * Error code in the Log.
   *
   * @return the errorCode
   */
  public String errorCode() {
    return errorCode;
  }

  /**
   * Gets the errorMsg.
   *
   * Summary error message in the log.
   *
   * @return the errorMsg
   */
  public String errorMsg() {
    return errorMsg;
  }

  /**
   * Gets the errorCount.
   *
   * Number of occurrence.
   *
   * @return the errorCount
   */
  public Double errorCount() {
    return errorCount;
  }
}

