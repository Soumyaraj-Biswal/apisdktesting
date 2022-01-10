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
 * The connection details to the IBM Cloud Object Storage bucket.
 */
public class ExternalSourceCosBucket extends DynamicModel<Object> {

  @SerializedName("cos_bucket_url")
  protected String cosBucketUrl;

  public ExternalSourceCosBucket() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String cosBucketUrl;
    private Map<String, Object> dynamicProperties;

    private Builder(ExternalSourceCosBucket externalSourceCosBucket) {
      this.cosBucketUrl = externalSourceCosBucket.cosBucketUrl;
      this.dynamicProperties = externalSourceCosBucket.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ExternalSourceCosBucket builder
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

  protected ExternalSourceCosBucket(Builder builder) {
    super(new TypeToken<Object>() { });
    cosBucketUrl = builder.cosBucketUrl;
    this.setProperties(builder.dynamicProperties);
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
  public String getCosBucketUrl() {
    return this.cosBucketUrl;
  }

  /**
   * Sets the cosBucketUrl.
   *
   * @param cosBucketUrl the new cosBucketUrl
   */
  public void setCosBucketUrl(final String cosBucketUrl) {
    this.cosBucketUrl = cosBucketUrl;
  }
}
