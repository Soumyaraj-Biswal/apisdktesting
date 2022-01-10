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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Capsule Job data.
 */
public class JobDataCapsule extends DynamicModel<Object> {

  @SerializedName("capsule_id")
  protected String capsuleId;
  @SerializedName("calsule_name")
  protected String calsuleName;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("results")
  protected List<JobResultCapsule> results;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobDataCapsule() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String capsuleId;
    private String calsuleName;
    private List<VariableData> inputs;
    private List<JobResultCapsule> results;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataCapsule jobDataCapsule) {
      this.capsuleId = jobDataCapsule.capsuleId;
      this.calsuleName = jobDataCapsule.calsuleName;
      this.inputs = jobDataCapsule.inputs;
      this.results = jobDataCapsule.results;
      this.updatedAt = jobDataCapsule.updatedAt;
      this.dynamicProperties = jobDataCapsule.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataCapsule.
     *
     * @return the new JobDataCapsule instance
     */
    public JobDataCapsule build() {
      return new JobDataCapsule(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the JobDataCapsule builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an results to results.
     *
     * @param results the new results
     * @return the JobDataCapsule builder
     */
    public Builder addResults(JobResultCapsule results) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(results,
        "results cannot be null");
      if (this.results == null) {
        this.results = new ArrayList<JobResultCapsule>();
      }
      this.results.add(results);
      return this;
    }

    /**
     * Set the capsuleId.
     *
     * @param capsuleId the capsuleId
     * @return the JobDataCapsule builder
     */
    public Builder capsuleId(String capsuleId) {
      this.capsuleId = capsuleId;
      return this;
    }

    /**
     * Set the calsuleName.
     *
     * @param calsuleName the calsuleName
     * @return the JobDataCapsule builder
     */
    public Builder calsuleName(String calsuleName) {
      this.calsuleName = calsuleName;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the JobDataCapsule builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the results.
     * Existing results will be replaced.
     *
     * @param results the results
     * @return the JobDataCapsule builder
     */
    public Builder results(List<JobResultCapsule> results) {
      this.results = results;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataCapsule builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataCapsule builder
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

  protected JobDataCapsule(Builder builder) {
    super(new TypeToken<Object>() { });
    capsuleId = builder.capsuleId;
    calsuleName = builder.calsuleName;
    inputs = builder.inputs;
    results = builder.results;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobDataCapsule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the capsuleId.
   *
   * Capsule Id.
   *
   * @return the capsuleId
   */
  public String getCapsuleId() {
    return this.capsuleId;
  }

  /**
   * Sets the capsuleId.
   *
   * @param capsuleId the new capsuleId
   */
  public void setCapsuleId(final String capsuleId) {
    this.capsuleId = capsuleId;
  }

  /**
   * Gets the calsuleName.
   *
   * Capsule name.
   *
   * @return the calsuleName
   */
  public String getCalsuleName() {
    return this.calsuleName;
  }

  /**
   * Sets the calsuleName.
   *
   * @param calsuleName the new calsuleName
   */
  public void setCalsuleName(final String calsuleName) {
    this.calsuleName = calsuleName;
  }

  /**
   * Gets the inputs.
   *
   * Input variables data used by the Controls Job.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<VariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the results.
   *
   * Results from the Capsules Job.
   *
   * @return the results
   */
  public List<JobResultCapsule> getResults() {
    return this.results;
  }

  /**
   * Sets the results.
   *
   * @param results the new results
   */
  public void setResults(final List<JobResultCapsule> results) {
    this.results = results;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
