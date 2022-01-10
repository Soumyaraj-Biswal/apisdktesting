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
 * System Job log summary.
 */
public class JobLogSummarySystemJob extends DynamicModel<Object> {

  @SerializedName("target_count")
  protected Double targetCount;
  @SerializedName("success")
  protected Double success;
  @SerializedName("failed")
  protected Double failed;

  public JobLogSummarySystemJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Double success;
    private Double failed;
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummarySystemJob jobLogSummarySystemJob) {
      this.success = jobLogSummarySystemJob.success;
      this.failed = jobLogSummarySystemJob.failed;
      this.dynamicProperties = jobLogSummarySystemJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummarySystemJob.
     *
     * @return the new JobLogSummarySystemJob instance
     */
    public JobLogSummarySystemJob build() {
      return new JobLogSummarySystemJob(this);
    }

    /**
     * Set the success.
     *
     * @param success the success
     * @return the JobLogSummarySystemJob builder
     */
    public Builder success(Double success) {
      this.success = success;
      return this;
    }

    /**
     * Set the failed.
     *
     * @param failed the failed
     * @return the JobLogSummarySystemJob builder
     */
    public Builder failed(Double failed) {
      this.failed = failed;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummarySystemJob builder
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

  protected JobLogSummarySystemJob(Builder builder) {
    super(new TypeToken<Object>() { });
    success = builder.success;
    failed = builder.failed;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobLogSummarySystemJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the targetCount.
   *
   * number of targets or hosts.
   *
   * @return the targetCount
   */
  public Double getTargetCount() {
    return this.targetCount;
  }

  /**
   * Gets the success.
   *
   * Number of passed.
   *
   * @return the success
   */
  public Double getSuccess() {
    return this.success;
  }

  /**
   * Sets the success.
   *
   * @param success the new success
   */
  public void setSuccess(final Double success) {
    this.success = success;
  }

  /**
   * Gets the failed.
   *
   * Number of failed.
   *
   * @return the failed
   */
  public Double getFailed() {
    return this.failed;
  }

  /**
   * Sets the failed.
   *
   * @param failed the new failed
   */
  public void setFailed(final Double failed) {
    this.failed = failed;
  }
}
