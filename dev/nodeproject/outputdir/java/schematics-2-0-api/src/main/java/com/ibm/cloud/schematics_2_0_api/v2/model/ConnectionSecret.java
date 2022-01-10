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
 * Secrets used to connect to external source.
 */
public class ConnectionSecret extends DynamicModel<Object> {

  /**
   * Type of the credential.
   */
  public interface Type {
    /** apikey. */
    String APIKEY = "apikey";
  }

  @SerializedName("type")
  protected String type;
  @SerializedName("apikey")
  protected ConnectionSecretApikey apikey;

  public ConnectionSecret() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private ConnectionSecretApikey apikey;
    private Map<String, Object> dynamicProperties;

    private Builder(ConnectionSecret connectionSecret) {
      this.type = connectionSecret.type;
      this.apikey = connectionSecret.apikey;
      this.dynamicProperties = connectionSecret.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConnectionSecret.
     *
     * @return the new ConnectionSecret instance
     */
    public ConnectionSecret build() {
      return new ConnectionSecret(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ConnectionSecret builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the ConnectionSecret builder
     */
    public Builder apikey(ConnectionSecretApikey apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ConnectionSecret builder
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

  protected ConnectionSecret(Builder builder) {
    super(new TypeToken<Object>() { });
    type = builder.type;
    apikey = builder.apikey;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ConnectionSecret builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of the credential.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the apikey.
   *
   * Connection details to IBM Cloud COS source.
   *
   * @return the apikey
   */
  public ConnectionSecretApikey getApikey() {
    return this.apikey;
  }

  /**
   * Sets the apikey.
   *
   * @param apikey the new apikey
   */
  public void setApikey(final ConnectionSecretApikey apikey) {
    this.apikey = apikey;
  }
}
