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
 * User defined KMS Settings details.
 */
public class KMSSettings extends DynamicModel<Object> {

  @SerializedName("location")
  protected String location;
  @SerializedName("encryption_scheme")
  protected String encryptionScheme;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("primary_crk")
  protected KMSSettingsPrimaryCrk primaryCrk;
  @SerializedName("secondary_crk")
  protected KMSSettingsSecondaryCrk secondaryCrk;

  public KMSSettings() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String location;
    private String encryptionScheme;
    private String resourceGroup;
    private KMSSettingsPrimaryCrk primaryCrk;
    private KMSSettingsSecondaryCrk secondaryCrk;
    private Map<String, Object> dynamicProperties;

    private Builder(KMSSettings kmsSettings) {
      this.location = kmsSettings.location;
      this.encryptionScheme = kmsSettings.encryptionScheme;
      this.resourceGroup = kmsSettings.resourceGroup;
      this.primaryCrk = kmsSettings.primaryCrk;
      this.secondaryCrk = kmsSettings.secondaryCrk;
      this.dynamicProperties = kmsSettings.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a KMSSettings.
     *
     * @return the new KMSSettings instance
     */
    public KMSSettings build() {
      return new KMSSettings(this);
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the KMSSettings builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the encryptionScheme.
     *
     * @param encryptionScheme the encryptionScheme
     * @return the KMSSettings builder
     */
    public Builder encryptionScheme(String encryptionScheme) {
      this.encryptionScheme = encryptionScheme;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the KMSSettings builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the primaryCrk.
     *
     * @param primaryCrk the primaryCrk
     * @return the KMSSettings builder
     */
    public Builder primaryCrk(KMSSettingsPrimaryCrk primaryCrk) {
      this.primaryCrk = primaryCrk;
      return this;
    }

    /**
     * Set the secondaryCrk.
     *
     * @param secondaryCrk the secondaryCrk
     * @return the KMSSettings builder
     */
    public Builder secondaryCrk(KMSSettingsSecondaryCrk secondaryCrk) {
      this.secondaryCrk = secondaryCrk;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the KMSSettings builder
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

  protected KMSSettings(Builder builder) {
    super(new TypeToken<Object>() { });
    location = builder.location;
    encryptionScheme = builder.encryptionScheme;
    resourceGroup = builder.resourceGroup;
    primaryCrk = builder.primaryCrk;
    secondaryCrk = builder.secondaryCrk;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a KMSSettings builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the location.
   *
   * Location.
   *
   * @return the location
   */
  public String getLocation() {
    return this.location;
  }

  /**
   * Sets the location.
   *
   * @param location the new location
   */
  public void setLocation(final String location) {
    this.location = location;
  }

  /**
   * Gets the encryptionScheme.
   *
   * Encryption scheme.
   *
   * @return the encryptionScheme
   */
  public String getEncryptionScheme() {
    return this.encryptionScheme;
  }

  /**
   * Sets the encryptionScheme.
   *
   * @param encryptionScheme the new encryptionScheme
   */
  public void setEncryptionScheme(final String encryptionScheme) {
    this.encryptionScheme = encryptionScheme;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Sets the resourceGroup.
   *
   * @param resourceGroup the new resourceGroup
   */
  public void setResourceGroup(final String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * Gets the primaryCrk.
   *
   * Primary CRK details.
   *
   * @return the primaryCrk
   */
  public KMSSettingsPrimaryCrk getPrimaryCrk() {
    return this.primaryCrk;
  }

  /**
   * Sets the primaryCrk.
   *
   * @param primaryCrk the new primaryCrk
   */
  public void setPrimaryCrk(final KMSSettingsPrimaryCrk primaryCrk) {
    this.primaryCrk = primaryCrk;
  }

  /**
   * Gets the secondaryCrk.
   *
   * Secondary CRK details.
   *
   * @return the secondaryCrk
   */
  public KMSSettingsSecondaryCrk getSecondaryCrk() {
    return this.secondaryCrk;
  }

  /**
   * Sets the secondaryCrk.
   *
   * @param secondaryCrk the new secondaryCrk
   */
  public void setSecondaryCrk(final KMSSettingsSecondaryCrk secondaryCrk) {
    this.secondaryCrk = secondaryCrk;
  }
}
