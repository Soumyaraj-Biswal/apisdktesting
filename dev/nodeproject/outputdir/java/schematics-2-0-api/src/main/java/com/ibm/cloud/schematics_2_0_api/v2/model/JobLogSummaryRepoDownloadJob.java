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
 * Repo download Job log summary.
 */
public class JobLogSummaryRepoDownloadJob extends DynamicModel<Object> {

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

  public JobLogSummaryRepoDownloadJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> dynamicProperties;

    private Builder(JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJob) {
      this.dynamicProperties = jobLogSummaryRepoDownloadJob.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobLogSummaryRepoDownloadJob builder
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

  protected JobLogSummaryRepoDownloadJob(Builder builder) {
    super(new TypeToken<Object>() { });
    this.setProperties(builder.dynamicProperties);
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
  public Double getScannedFileCount() {
    return this.scannedFileCount;
  }

  /**
   * Gets the quarantinedFileCount.
   *
   * Number of files quarantined.
   *
   * @return the quarantinedFileCount
   */
  public Double getQuarantinedFileCount() {
    return this.quarantinedFileCount;
  }

  /**
   * Gets the detectedFiletype.
   *
   * Detected template or data file type.
   *
   * @return the detectedFiletype
   */
  public String getDetectedFiletype() {
    return this.detectedFiletype;
  }

  /**
   * Gets the inputsCount.
   *
   * Number of inputs detected.
   *
   * @return the inputsCount
   */
  public String getInputsCount() {
    return this.inputsCount;
  }

  /**
   * Gets the outputsCount.
   *
   * Number of outputs detected.
   *
   * @return the outputsCount
   */
  public String getOutputsCount() {
    return this.outputsCount;
  }
}
