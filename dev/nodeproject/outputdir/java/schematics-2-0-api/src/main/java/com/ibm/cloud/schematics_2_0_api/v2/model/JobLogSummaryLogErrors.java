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
 * JobLogSummaryLogErrors.
 */
public class JobLogSummaryLogErrors extends DynamicModel<Object> {

  @SerializedName("error_code")
  protected String errorCode;
  @SerializedName("error_msg")
  protected String errorMsg;
  @SerializedName("error_count")
  protected Double errorCount;

  public JobLogSummaryLogErrors() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String errorCode;
    private String errorMsg;
    private Double errorCount;
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryLogErrors jobLogSummaryLogErrors) {
      this.errorCode = jobLogSummaryLogErrors.errorCode;
      this.errorMsg = jobLogSummaryLogErrors.errorMsg;
      this.errorCount = jobLogSummaryLogErrors.errorCount;
      this.dynamicProperties = jobLogSummaryLogErrors.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryLogErrors builder
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

  protected JobLogSummaryLogErrors(Builder builder) {
    super(new TypeToken<Object>() { });
    errorCode = builder.errorCode;
    errorMsg = builder.errorMsg;
    errorCount = builder.errorCount;
    this.setProperties(builder.dynamicProperties);
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
  public String getErrorCode() {
    return this.errorCode;
  }

  /**
   * Sets the errorCode.
   *
   * @param errorCode the new errorCode
   */
  public void setErrorCode(final String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Gets the errorMsg.
   *
   * Summary error message in the log.
   *
   * @return the errorMsg
   */
  public String getErrorMsg() {
    return this.errorMsg;
  }

  /**
   * Sets the errorMsg.
   *
   * @param errorMsg the new errorMsg
   */
  public void setErrorMsg(final String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * Gets the errorCount.
   *
   * Number of occurrence.
   *
   * @return the errorCount
   */
  public Double getErrorCount() {
    return this.errorCount;
  }

  /**
   * Sets the errorCount.
   *
   * @param errorCount the new errorCount
   */
  public void setErrorCount(final Double errorCount) {
    this.errorCount = errorCount;
  }
}
