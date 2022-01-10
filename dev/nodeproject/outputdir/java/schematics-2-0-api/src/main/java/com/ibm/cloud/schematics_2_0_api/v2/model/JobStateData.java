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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Workspace Job state-file.
 */
public class JobStateData extends DynamicModel<Object> {

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("summary")
  protected List<JobStateDataSummary> summary;
  @SerializedName("format")
  protected String format;
  @SerializedName("details")
  protected byte[] details;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobStateData() {
    super(new TypeToken<Object>() { });
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
   * Gets the jobName.
   *
   * Job name, uniquely derived from the related Workspace and Action.
   *
   * @return the jobName
   */
  public String getJobName() {
    return this.jobName;
  }

  /**
   * Gets the summary.
   *
   * Job state summary.
   *
   * @return the summary
   */
  public List<JobStateDataSummary> getSummary() {
    return this.summary;
  }

  /**
   * Gets the format.
   *
   * Format of the State data (eg. tfstate).
   *
   * @return the format
   */
  public String getFormat() {
    return this.format;
  }

  /**
   * Gets the details.
   *
   * State data file.
   *
   * @return the details
   */
  public byte[] getDetails() {
    return this.details;
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
}
