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
 * Connection details to IBM Cloud COS source.
 */
public class ConnectionSecretApikey extends DynamicModel<Object> {

  @SerializedName("key")
  protected String key;

  public ConnectionSecretApikey() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private Map<String, Object> dynamicProperties;

    private Builder(ConnectionSecretApikey connectionSecretApikey) {
      this.key = connectionSecretApikey.key;
      this.dynamicProperties = connectionSecretApikey.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConnectionSecretApikey.
     *
     * @return the new ConnectionSecretApikey instance
     */
    public ConnectionSecretApikey build() {
      return new ConnectionSecretApikey(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the ConnectionSecretApikey builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ConnectionSecretApikey builder
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

  protected ConnectionSecretApikey(Builder builder) {
    super(new TypeToken<Object>() { });
    key = builder.key;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ConnectionSecretApikey builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * API key.
   *
   * @return the key
   */
  public String getKey() {
    return this.key;
  }

  /**
   * Sets the key.
   *
   * @param key the new key
   */
  public void setKey(final String key) {
    this.key = key;
  }
}
