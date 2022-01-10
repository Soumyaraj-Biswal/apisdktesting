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
 * Secondary CRK details.
 */
public class KMSSettingsSecondaryCrk extends DynamicModel<Object> {

  @SerializedName("kms_name")
  protected String kmsName;
  @SerializedName("kms_private_endpoint")
  protected String kmsPrivateEndpoint;
  @SerializedName("key_crn")
  protected String keyCrn;

  public KMSSettingsSecondaryCrk() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String kmsName;
    private String kmsPrivateEndpoint;
    private String keyCrn;
    private Map<String, Object> dynamicProperties;

    private Builder(KMSSettingsSecondaryCrk kmsSettingsSecondaryCrk) {
      this.kmsName = kmsSettingsSecondaryCrk.kmsName;
      this.kmsPrivateEndpoint = kmsSettingsSecondaryCrk.kmsPrivateEndpoint;
      this.keyCrn = kmsSettingsSecondaryCrk.keyCrn;
      this.dynamicProperties = kmsSettingsSecondaryCrk.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a KMSSettingsSecondaryCrk.
     *
     * @return the new KMSSettingsSecondaryCrk instance
     */
    public KMSSettingsSecondaryCrk build() {
      return new KMSSettingsSecondaryCrk(this);
    }

    /**
     * Set the kmsName.
     *
     * @param kmsName the kmsName
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder kmsName(String kmsName) {
      this.kmsName = kmsName;
      return this;
    }

    /**
     * Set the kmsPrivateEndpoint.
     *
     * @param kmsPrivateEndpoint the kmsPrivateEndpoint
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder kmsPrivateEndpoint(String kmsPrivateEndpoint) {
      this.kmsPrivateEndpoint = kmsPrivateEndpoint;
      return this;
    }

    /**
     * Set the keyCrn.
     *
     * @param keyCrn the keyCrn
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder keyCrn(String keyCrn) {
      this.keyCrn = keyCrn;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the KMSSettingsSecondaryCrk builder
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

  protected KMSSettingsSecondaryCrk(Builder builder) {
    super(new TypeToken<Object>() { });
    kmsName = builder.kmsName;
    kmsPrivateEndpoint = builder.kmsPrivateEndpoint;
    keyCrn = builder.keyCrn;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a KMSSettingsSecondaryCrk builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the kmsName.
   *
   * Secondary KMS name.
   *
   * @return the kmsName
   */
  public String getKmsName() {
    return this.kmsName;
  }

  /**
   * Sets the kmsName.
   *
   * @param kmsName the new kmsName
   */
  public void setKmsName(final String kmsName) {
    this.kmsName = kmsName;
  }

  /**
   * Gets the kmsPrivateEndpoint.
   *
   * Secondary KMS endpoint.
   *
   * @return the kmsPrivateEndpoint
   */
  public String getKmsPrivateEndpoint() {
    return this.kmsPrivateEndpoint;
  }

  /**
   * Sets the kmsPrivateEndpoint.
   *
   * @param kmsPrivateEndpoint the new kmsPrivateEndpoint
   */
  public void setKmsPrivateEndpoint(final String kmsPrivateEndpoint) {
    this.kmsPrivateEndpoint = kmsPrivateEndpoint;
  }

  /**
   * Gets the keyCrn.
   *
   * CRN of the Secondary Key.
   *
   * @return the keyCrn
   */
  public String getKeyCrn() {
    return this.keyCrn;
  }

  /**
   * Sets the keyCrn.
   *
   * @param keyCrn the new keyCrn
   */
  public void setKeyCrn(final String keyCrn) {
    this.keyCrn = keyCrn;
  }
}
