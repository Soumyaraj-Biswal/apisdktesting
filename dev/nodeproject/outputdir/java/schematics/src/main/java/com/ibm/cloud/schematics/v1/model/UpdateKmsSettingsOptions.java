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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateKmsSettings options.
 */
public class UpdateKmsSettingsOptions extends GenericModel {

  protected String location;
  protected String encryptionScheme;
  protected String resourceGroup;
  protected KMSSettingsPrimaryCrk primaryCrk;
  protected KMSSettingsSecondaryCrk secondaryCrk;

  /**
   * Builder.
   */
  public static class Builder {
    private String location;
    private String encryptionScheme;
    private String resourceGroup;
    private KMSSettingsPrimaryCrk primaryCrk;
    private KMSSettingsSecondaryCrk secondaryCrk;

    private Builder(UpdateKmsSettingsOptions updateKmsSettingsOptions) {
      this.location = updateKmsSettingsOptions.location;
      this.encryptionScheme = updateKmsSettingsOptions.encryptionScheme;
      this.resourceGroup = updateKmsSettingsOptions.resourceGroup;
      this.primaryCrk = updateKmsSettingsOptions.primaryCrk;
      this.secondaryCrk = updateKmsSettingsOptions.secondaryCrk;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateKmsSettingsOptions.
     *
     * @return the new UpdateKmsSettingsOptions instance
     */
    public UpdateKmsSettingsOptions build() {
      return new UpdateKmsSettingsOptions(this);
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the encryptionScheme.
     *
     * @param encryptionScheme the encryptionScheme
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder encryptionScheme(String encryptionScheme) {
      this.encryptionScheme = encryptionScheme;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the primaryCrk.
     *
     * @param primaryCrk the primaryCrk
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder primaryCrk(KMSSettingsPrimaryCrk primaryCrk) {
      this.primaryCrk = primaryCrk;
      return this;
    }

    /**
     * Set the secondaryCrk.
     *
     * @param secondaryCrk the secondaryCrk
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder secondaryCrk(KMSSettingsSecondaryCrk secondaryCrk) {
      this.secondaryCrk = secondaryCrk;
      return this;
    }

    /**
     * Set the kmsSettings.
     *
     * @param kmsSettings the kmsSettings
     * @return the UpdateKmsSettingsOptions builder
     */
    public Builder kmsSettings(KMSSettings kmsSettings) {
      this.location = kmsSettings.location();
      this.encryptionScheme = kmsSettings.encryptionScheme();
      this.resourceGroup = kmsSettings.resourceGroup();
      this.primaryCrk = kmsSettings.primaryCrk();
      this.secondaryCrk = kmsSettings.secondaryCrk();
      return this;
    }
  }

  protected UpdateKmsSettingsOptions(Builder builder) {
    location = builder.location;
    encryptionScheme = builder.encryptionScheme;
    resourceGroup = builder.resourceGroup;
    primaryCrk = builder.primaryCrk;
    secondaryCrk = builder.secondaryCrk;
  }

  /**
   * New builder.
   *
   * @return a UpdateKmsSettingsOptions builder
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
  public String location() {
    return location;
  }

  /**
   * Gets the encryptionScheme.
   *
   * Encryption scheme.
   *
   * @return the encryptionScheme
   */
  public String encryptionScheme() {
    return encryptionScheme;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the primaryCrk.
   *
   * Primary CRK details.
   *
   * @return the primaryCrk
   */
  public KMSSettingsPrimaryCrk primaryCrk() {
    return primaryCrk;
  }

  /**
   * Gets the secondaryCrk.
   *
   * Secondary CRK details.
   *
   * @return the secondaryCrk
   */
  public KMSSettingsSecondaryCrk secondaryCrk() {
    return secondaryCrk;
  }
}

