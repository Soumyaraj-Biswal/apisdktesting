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
 * Flow Job log summary.
 */
public class JobLogSummaryActionJob extends DynamicModel<Object> {

  @SerializedName("target_count")
  protected Double targetCount;
  @SerializedName("task_count")
  protected Double taskCount;
  @SerializedName("play_count")
  protected Double playCount;
  @SerializedName("recap")
  protected JobLogSummaryActionJobRecap recap;

  public JobLogSummaryActionJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private JobLogSummaryActionJobRecap recap;
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryActionJob jobLogSummaryActionJob) {
      this.recap = jobLogSummaryActionJob.recap;
      this.dynamicProperties = jobLogSummaryActionJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryActionJob.
     *
     * @return the new JobLogSummaryActionJob instance
     */
    public JobLogSummaryActionJob build() {
      return new JobLogSummaryActionJob(this);
    }

    /**
     * Set the recap.
     *
     * @param recap the recap
     * @return the JobLogSummaryActionJob builder
     */
    public Builder recap(JobLogSummaryActionJobRecap recap) {
      this.recap = recap;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryActionJob builder
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

  protected JobLogSummaryActionJob(Builder builder) {
    super(new TypeToken<Object>() { });
    recap = builder.recap;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryActionJob builder
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
   * Gets the taskCount.
   *
   * number of tasks in playbook.
   *
   * @return the taskCount
   */
  public Double getTaskCount() {
    return this.taskCount;
  }

  /**
   * Gets the playCount.
   *
   * number of plays in playbook.
   *
   * @return the playCount
   */
  public Double getPlayCount() {
    return this.playCount;
  }

  /**
   * Gets the recap.
   *
   * Recap records.
   *
   * @return the recap
   */
  public JobLogSummaryActionJobRecap getRecap() {
    return this.recap;
  }

  /**
   * Sets the recap.
   *
   * @param recap the new recap
   */
  public void setRecap(final JobLogSummaryActionJobRecap recap) {
    this.recap = recap;
  }
}
