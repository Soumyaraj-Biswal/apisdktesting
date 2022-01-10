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
 * Capsule Job Results.
 */
public class JobResultCapsule extends DynamicModel<Object> {

  /**
   * Job state.
   */
  public interface JobState {
    /** success. */
    String SUCCESS = "success";
    /** failed. */
    String FAILED = "failed";
    /** terminated. */
    String TERMINATED = "terminated";
  }

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("policy")
  protected String policy;
  @SerializedName("severity")
  protected Long severity;
  @SerializedName("job_state")
  protected String jobState;
  @SerializedName("failures")
  protected List<String> failures;
  @SerializedName("passed")
  protected List<String> passed;
  @SerializedName("evidences")
  protected List<CapsuleResultEvidences> evidences;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobResultCapsule() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String jobName;
    private String policy;
    private Long severity;
    private String jobState;
    private List<String> failures;
    private List<String> passed;
    private List<CapsuleResultEvidences> evidences;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobResultCapsule jobResultCapsule) {
      this.jobId = jobResultCapsule.jobId;
      this.jobName = jobResultCapsule.jobName;
      this.policy = jobResultCapsule.policy;
      this.severity = jobResultCapsule.severity;
      this.jobState = jobResultCapsule.jobState;
      this.failures = jobResultCapsule.failures;
      this.passed = jobResultCapsule.passed;
      this.evidences = jobResultCapsule.evidences;
      this.updatedAt = jobResultCapsule.updatedAt;
      this.dynamicProperties = jobResultCapsule.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobResultCapsule.
     *
     * @return the new JobResultCapsule instance
     */
    public JobResultCapsule build() {
      return new JobResultCapsule(this);
    }

    /**
     * Adds an failures to failures.
     *
     * @param failures the new failures
     * @return the JobResultCapsule builder
     */
    public Builder addFailures(String failures) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(failures,
        "failures cannot be null");
      if (this.failures == null) {
        this.failures = new ArrayList<String>();
      }
      this.failures.add(failures);
      return this;
    }

    /**
     * Adds an passed to passed.
     *
     * @param passed the new passed
     * @return the JobResultCapsule builder
     */
    public Builder addPassed(String passed) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(passed,
        "passed cannot be null");
      if (this.passed == null) {
        this.passed = new ArrayList<String>();
      }
      this.passed.add(passed);
      return this;
    }

    /**
     * Adds an evidences to evidences.
     *
     * @param evidences the new evidences
     * @return the JobResultCapsule builder
     */
    public Builder addEvidences(CapsuleResultEvidences evidences) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(evidences,
        "evidences cannot be null");
      if (this.evidences == null) {
        this.evidences = new ArrayList<CapsuleResultEvidences>();
      }
      this.evidences.add(evidences);
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the JobResultCapsule builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the jobName.
     *
     * @param jobName the jobName
     * @return the JobResultCapsule builder
     */
    public Builder jobName(String jobName) {
      this.jobName = jobName;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the JobResultCapsule builder
     */
    public Builder policy(String policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Set the severity.
     *
     * @param severity the severity
     * @return the JobResultCapsule builder
     */
    public Builder severity(long severity) {
      this.severity = severity;
      return this;
    }

    /**
     * Set the jobState.
     *
     * @param jobState the jobState
     * @return the JobResultCapsule builder
     */
    public Builder jobState(String jobState) {
      this.jobState = jobState;
      return this;
    }

    /**
     * Set the failures.
     * Existing failures will be replaced.
     *
     * @param failures the failures
     * @return the JobResultCapsule builder
     */
    public Builder failures(List<String> failures) {
      this.failures = failures;
      return this;
    }

    /**
     * Set the passed.
     * Existing passed will be replaced.
     *
     * @param passed the passed
     * @return the JobResultCapsule builder
     */
    public Builder passed(List<String> passed) {
      this.passed = passed;
      return this;
    }

    /**
     * Set the evidences.
     * Existing evidences will be replaced.
     *
     * @param evidences the evidences
     * @return the JobResultCapsule builder
     */
    public Builder evidences(List<CapsuleResultEvidences> evidences) {
      this.evidences = evidences;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobResultCapsule builder
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
     * @return the JobResultCapsule builder
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

  protected JobResultCapsule(Builder builder) {
    super(new TypeToken<Object>() { });
    jobId = builder.jobId;
    jobName = builder.jobName;
    policy = builder.policy;
    severity = builder.severity;
    jobState = builder.jobState;
    failures = builder.failures;
    passed = builder.passed;
    evidences = builder.evidences;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobResultCapsule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job Id.
   *
   * @return the jobId
   */
  public String getJobId() {
    return this.jobId;
  }

  /**
   * Sets the jobId.
   *
   * @param jobId the new jobId
   */
  public void setJobId(final String jobId) {
    this.jobId = jobId;
  }

  /**
   * Gets the jobName.
   *
   * Job name, uniquely derived from the related Workspace, Action or Controls.
   *
   * @return the jobName
   */
  public String getJobName() {
    return this.jobName;
  }

  /**
   * Sets the jobName.
   *
   * @param jobName the new jobName
   */
  public void setJobName(final String jobName) {
    this.jobName = jobName;
  }

  /**
   * Gets the policy.
   *
   * Policy name.
   *
   * @return the policy
   */
  public String getPolicy() {
    return this.policy;
  }

  /**
   * Sets the policy.
   *
   * @param policy the new policy
   */
  public void setPolicy(final String policy) {
    this.policy = policy;
  }

  /**
   * Gets the severity.
   *
   * Severity.
   *
   * @return the severity
   */
  public Long getSeverity() {
    return this.severity;
  }

  /**
   * Sets the severity.
   *
   * @param severity the new severity
   */
  public void setSeverity(final long severity) {
    this.severity = severity;
  }

  /**
   * Gets the jobState.
   *
   * Job state.
   *
   * @return the jobState
   */
  public String getJobState() {
    return this.jobState;
  }

  /**
   * Sets the jobState.
   *
   * @param jobState the new jobState
   */
  public void setJobState(final String jobState) {
    this.jobState = jobState;
  }

  /**
   * Gets the failures.
   *
   * Job failures.
   *
   * @return the failures
   */
  public List<String> getFailures() {
    return this.failures;
  }

  /**
   * Sets the failures.
   *
   * @param failures the new failures
   */
  public void setFailures(final List<String> failures) {
    this.failures = failures;
  }

  /**
   * Gets the passed.
   *
   * Job passed.
   *
   * @return the passed
   */
  public List<String> getPassed() {
    return this.passed;
  }

  /**
   * Sets the passed.
   *
   * @param passed the new passed
   */
  public void setPassed(final List<String> passed) {
    this.passed = passed;
  }

  /**
   * Gets the evidences.
   *
   * Capsule evidences.
   *
   * @return the evidences
   */
  public List<CapsuleResultEvidences> getEvidences() {
    return this.evidences;
  }

  /**
   * Sets the evidences.
   *
   * @param evidences the new evidences
   */
  public void setEvidences(final List<CapsuleResultEvidences> evidences) {
    this.evidences = evidences;
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
