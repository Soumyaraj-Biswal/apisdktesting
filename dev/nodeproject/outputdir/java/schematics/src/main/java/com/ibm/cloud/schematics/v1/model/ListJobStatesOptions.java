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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listJobStates options.
 */
public class ListJobStatesOptions extends GenericModel {

  protected String jobId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;

    private Builder(ListJobStatesOptions listJobStatesOptions) {
      this.jobId = listJobStatesOptions.jobId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     */
    public Builder(String jobId) {
      this.jobId = jobId;
    }

    /**
     * Builds a ListJobStatesOptions.
     *
     * @return the new ListJobStatesOptions instance
     */
    public ListJobStatesOptions build() {
      return new ListJobStatesOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the ListJobStatesOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }
  }

  protected ListJobStatesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    jobId = builder.jobId;
  }

  /**
   * New builder.
   *
   * @return a ListJobStatesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job ID. Use `GET /jobs` API to see the Job IDs in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }
}

