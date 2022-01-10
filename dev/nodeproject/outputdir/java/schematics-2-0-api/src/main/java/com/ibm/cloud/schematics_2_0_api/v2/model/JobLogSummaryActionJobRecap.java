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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Recap records.
 */
public class JobLogSummaryActionJobRecap extends DynamicModel<Object> {

  @SerializedName("target")
  protected List<String> target;
  @SerializedName("ok")
  protected Double ok;
  @SerializedName("changed")
  protected Double changed;
  @SerializedName("failed")
  protected Double failed;
  @SerializedName("skipped")
  protected Double skipped;
  @SerializedName("unreachable")
  protected Double unreachable;

  public JobLogSummaryActionJobRecap() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> target;
    private Double ok;
    private Double changed;
    private Double failed;
    private Double skipped;
    private Double unreachable;
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryActionJobRecap jobLogSummaryActionJobRecap) {
      this.target = jobLogSummaryActionJobRecap.target;
      this.ok = jobLogSummaryActionJobRecap.ok;
      this.changed = jobLogSummaryActionJobRecap.changed;
      this.failed = jobLogSummaryActionJobRecap.failed;
      this.skipped = jobLogSummaryActionJobRecap.skipped;
      this.unreachable = jobLogSummaryActionJobRecap.unreachable;
      this.dynamicProperties = jobLogSummaryActionJobRecap.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryActionJobRecap.
     *
     * @return the new JobLogSummaryActionJobRecap instance
     */
    public JobLogSummaryActionJobRecap build() {
      return new JobLogSummaryActionJobRecap(this);
    }

    /**
     * Adds an target to target.
     *
     * @param target the new target
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder addTarget(String target) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(target,
        "target cannot be null");
      if (this.target == null) {
        this.target = new ArrayList<String>();
      }
      this.target.add(target);
      return this;
    }

    /**
     * Set the target.
     * Existing target will be replaced.
     *
     * @param target the target
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder target(List<String> target) {
      this.target = target;
      return this;
    }

    /**
     * Set the ok.
     *
     * @param ok the ok
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder ok(Double ok) {
      this.ok = ok;
      return this;
    }

    /**
     * Set the changed.
     *
     * @param changed the changed
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder changed(Double changed) {
      this.changed = changed;
      return this;
    }

    /**
     * Set the failed.
     *
     * @param failed the failed
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder failed(Double failed) {
      this.failed = failed;
      return this;
    }

    /**
     * Set the skipped.
     *
     * @param skipped the skipped
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder skipped(Double skipped) {
      this.skipped = skipped;
      return this;
    }

    /**
     * Set the unreachable.
     *
     * @param unreachable the unreachable
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder unreachable(Double unreachable) {
      this.unreachable = unreachable;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryActionJobRecap builder
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

  protected JobLogSummaryActionJobRecap(Builder builder) {
    super(new TypeToken<Object>() { });
    target = builder.target;
    ok = builder.ok;
    changed = builder.changed;
    failed = builder.failed;
    skipped = builder.skipped;
    unreachable = builder.unreachable;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryActionJobRecap builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * List of target or host name.
   *
   * @return the target
   */
  public List<String> getTarget() {
    return this.target;
  }

  /**
   * Sets the target.
   *
   * @param target the new target
   */
  public void setTarget(final List<String> target) {
    this.target = target;
  }

  /**
   * Gets the ok.
   *
   * Number of OK.
   *
   * @return the ok
   */
  public Double getOk() {
    return this.ok;
  }

  /**
   * Sets the ok.
   *
   * @param ok the new ok
   */
  public void setOk(final Double ok) {
    this.ok = ok;
  }

  /**
   * Gets the changed.
   *
   * Number of changed.
   *
   * @return the changed
   */
  public Double getChanged() {
    return this.changed;
  }

  /**
   * Sets the changed.
   *
   * @param changed the new changed
   */
  public void setChanged(final Double changed) {
    this.changed = changed;
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

  /**
   * Gets the skipped.
   *
   * Number of skipped.
   *
   * @return the skipped
   */
  public Double getSkipped() {
    return this.skipped;
  }

  /**
   * Sets the skipped.
   *
   * @param skipped the new skipped
   */
  public void setSkipped(final Double skipped) {
    this.skipped = skipped;
  }

  /**
   * Gets the unreachable.
   *
   * Number of unreachable.
   *
   * @return the unreachable
   */
  public Double getUnreachable() {
    return this.unreachable;
  }

  /**
   * Sets the unreachable.
   *
   * @param unreachable the new unreachable
   */
  public void setUnreachable(final Double unreachable) {
    this.unreachable = unreachable;
  }
}
