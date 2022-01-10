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
 * Scheduled Trigger.
 */
public class TriggerScheduled extends DynamicModel<Object> {

  @SerializedName("frequency")
  protected String frequency;
  @SerializedName("time")
  protected String time;
  @SerializedName("day")
  protected String day;

  public TriggerScheduled() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String frequency;
    private String time;
    private String day;
    private Map<String, Object> dynamicProperties;

    private Builder(TriggerScheduled triggerScheduled) {
      this.frequency = triggerScheduled.frequency;
      this.time = triggerScheduled.time;
      this.day = triggerScheduled.day;
      this.dynamicProperties = triggerScheduled.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TriggerScheduled.
     *
     * @return the new TriggerScheduled instance
     */
    public TriggerScheduled build() {
      return new TriggerScheduled(this);
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the TriggerScheduled builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the TriggerScheduled builder
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    /**
     * Set the day.
     *
     * @param day the day
     * @return the TriggerScheduled builder
     */
    public Builder day(String day) {
      this.day = day;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the TriggerScheduled builder
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

  protected TriggerScheduled(Builder builder) {
    super(new TypeToken<Object>() { });
    frequency = builder.frequency;
    time = builder.time;
    day = builder.day;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a TriggerScheduled builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the frequency.
   *
   * frequency.
   *
   * @return the frequency
   */
  public String getFrequency() {
    return this.frequency;
  }

  /**
   * Sets the frequency.
   *
   * @param frequency the new frequency
   */
  public void setFrequency(final String frequency) {
    this.frequency = frequency;
  }

  /**
   * Gets the time.
   *
   * Tinme in UTC format.
   *
   * @return the time
   */
  public String getTime() {
    return this.time;
  }

  /**
   * Sets the time.
   *
   * @param time the new time
   */
  public void setTime(final String time) {
    this.time = time;
  }

  /**
   * Gets the day.
   *
   * Day.
   *
   * @return the day
   */
  public String getDay() {
    return this.day;
  }

  /**
   * Sets the day.
   *
   * @param day the new day
   */
  public void setDay(final String day) {
    this.day = day;
  }
}
