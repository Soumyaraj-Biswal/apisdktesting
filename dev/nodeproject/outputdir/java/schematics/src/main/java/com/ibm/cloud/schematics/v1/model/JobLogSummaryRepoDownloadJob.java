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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Repo download Job log summary.
 */
public class JobLogSummaryRepoDownloadJob extends GenericModel {

  @SerializedName("scanned_file_count")
  protected Double scannedFileCount;
  @SerializedName("quarantined_file_count")
  protected Double quarantinedFileCount;
  @SerializedName("detected_filetype")
  protected String detectedFiletype;
  @SerializedName("inputs_count")
  protected String inputsCount;
  @SerializedName("outputs_count")
  protected String outputsCount;

  /**
   * Builder.
   */
  public static class Builder {

    private Builder(JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJob) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryRepoDownloadJob.
     *
     * @return the new JobLogSummaryRepoDownloadJob instance
     */
    public JobLogSummaryRepoDownloadJob build() {
      return new JobLogSummaryRepoDownloadJob(this);
    }
  }

  protected JobLogSummaryRepoDownloadJob(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryRepoDownloadJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the scannedFileCount.
   *
   * Number of files scanned.
   *
   * @return the scannedFileCount
   */
  public Double scannedFileCount() {
    return scannedFileCount;
  }

  /**
   * Gets the quarantinedFileCount.
   *
   * Number of files quarantined.
   *
   * @return the quarantinedFileCount
   */
  public Double quarantinedFileCount() {
    return quarantinedFileCount;
  }

  /**
   * Gets the detectedFiletype.
   *
   * Detected template or data file type.
   *
   * @return the detectedFiletype
   */
  public String detectedFiletype() {
    return detectedFiletype;
  }

  /**
   * Gets the inputsCount.
   *
   * Number of inputs detected.
   *
   * @return the inputsCount
   */
  public String inputsCount() {
    return inputsCount;
  }

  /**
   * Gets the outputsCount.
   *
   * Number of outputs detected.
   *
   * @return the outputsCount
   */
  public String outputsCount() {
    return outputsCount;
  }
}

