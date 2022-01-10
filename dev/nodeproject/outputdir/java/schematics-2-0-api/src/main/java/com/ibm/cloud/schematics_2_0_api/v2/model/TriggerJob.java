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
 * Job Trigger.
 */
public class TriggerJob extends DynamicModel<Object> {

  @SerializedName("event")
  protected String event;
  @SerializedName("job")
  protected Job job;

  public TriggerJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String event;
    private Job job;
    private Map<String, Object> dynamicProperties;

    private Builder(TriggerJob triggerJob) {
      this.event = triggerJob.event;
      this.job = triggerJob.job;
      this.dynamicProperties = triggerJob.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TriggerJob.
     *
     * @return the new TriggerJob instance
     */
    public TriggerJob build() {
      return new TriggerJob(this);
    }

    /**
     * Set the event.
     *
     * @param event the event
     * @return the TriggerJob builder
     */
    public Builder event(String event) {
      this.event = event;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the TriggerJob builder
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TriggerJob builder
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

  protected TriggerJob(Builder builder) {
    super(new TypeToken<Object>() { });
    event = builder.event;
    job = builder.job;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TriggerJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the event.
   *
   * Time in UTC format.
   *
   * @return the event
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Sets the event.
   *
   * @param event the new event
   */
  public void setEvent(final String event) {
    this.event = event;
  }

  /**
   * Gets the job.
   *
   * Complete Job with user inputs and system generated data.
   *
   * @return the job
   */
  public Job getJob() {
    return this.job;
  }

  /**
   * Sets the job.
   *
   * @param job the new job
   */
  public void setJob(final Job job) {
    this.job = job;
  }
}
