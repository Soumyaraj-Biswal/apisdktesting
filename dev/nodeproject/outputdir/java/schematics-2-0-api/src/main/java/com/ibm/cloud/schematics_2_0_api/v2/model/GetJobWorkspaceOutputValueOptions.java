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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getJobWorkspaceOutputValue options.
 */
public class GetJobWorkspaceOutputValueOptions extends GenericModel {

  protected String jobId;
  protected String workspaceId;
  protected String varName;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String workspaceId;
    private String varName;
    private Long offset;
    private Long limit;

    private Builder(GetJobWorkspaceOutputValueOptions getJobWorkspaceOutputValueOptions) {
      this.jobId = getJobWorkspaceOutputValueOptions.jobId;
      this.workspaceId = getJobWorkspaceOutputValueOptions.workspaceId;
      this.varName = getJobWorkspaceOutputValueOptions.varName;
      this.offset = getJobWorkspaceOutputValueOptions.offset;
      this.limit = getJobWorkspaceOutputValueOptions.limit;
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
     * @param workspaceId the workspaceId
     * @param varName the varName
     */
    public Builder(String jobId, String workspaceId, String varName) {
      this.jobId = jobId;
      this.workspaceId = workspaceId;
      this.varName = varName;
    }

    /**
     * Builds a GetJobWorkspaceOutputValueOptions.
     *
     * @return the new GetJobWorkspaceOutputValueOptions instance
     */
    public GetJobWorkspaceOutputValueOptions build() {
      return new GetJobWorkspaceOutputValueOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetJobWorkspaceOutputValueOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the GetJobWorkspaceOutputValueOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the GetJobWorkspaceOutputValueOptions builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetJobWorkspaceOutputValueOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetJobWorkspaceOutputValueOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetJobWorkspaceOutputValueOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workspaceId,
      "workspaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.varName,
      "varName cannot be empty");
    jobId = builder.jobId;
    workspaceId = builder.workspaceId;
    varName = builder.varName;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetJobWorkspaceOutputValueOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the workspaceId.
   *
   * Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account.
   *
   * @return the workspaceId
   */
  public String workspaceId() {
    return workspaceId;
  }

  /**
   * Gets the varName.
   *
   * Name of the variable.
   *
   * @return the varName
   */
  public String varName() {
    return varName;
  }

  /**
   * Gets the offset.
   *
   * The starting position of the item in the list of items. For example, if you have three workspaces in your account,
   * the first workspace is assigned position number 0, the second workspace is assigned position number 1, and so
   * forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit the number
   * of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative numbers are not
   * supported and are ignored.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000. If no
   * value is provided, 100 is used by default.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

