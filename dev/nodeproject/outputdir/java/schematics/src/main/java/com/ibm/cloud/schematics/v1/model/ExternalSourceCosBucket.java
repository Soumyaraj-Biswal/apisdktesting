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
 * The connection details to the IBM Cloud Object Storage bucket.
 */
public class ExternalSourceCosBucket extends GenericModel {

  @SerializedName("cos_bucket_url")
  protected String cosBucketUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosBucketUrl;

    private Builder(ExternalSourceCosBucket externalSourceCosBucket) {
      this.cosBucketUrl = externalSourceCosBucket.cosBucketUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExternalSourceCosBucket.
     *
     * @return the new ExternalSourceCosBucket instance
     */
    public ExternalSourceCosBucket build() {
      return new ExternalSourceCosBucket(this);
    }

    /**
     * Set the cosBucketUrl.
     *
     * @param cosBucketUrl the cosBucketUrl
     * @return the ExternalSourceCosBucket builder
     */
    public Builder cosBucketUrl(String cosBucketUrl) {
      this.cosBucketUrl = cosBucketUrl;
      return this;
    }
  }

  protected ExternalSourceCosBucket(Builder builder) {
    cosBucketUrl = builder.cosBucketUrl;
  }

  /**
   * New builder.
   *
   * @return a ExternalSourceCosBucket builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosBucketUrl.
   *
   * The COS bucket URL.
   *
   * @return the cosBucketUrl
   */
  public String cosBucketUrl() {
    return cosBucketUrl;
  }
}

