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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * KMS Instances.
 */
public class KMSInstances extends DynamicModel<Object> {

  @SerializedName("location")
  protected String location;
  @SerializedName("encryption_scheme")
  protected String encryptionScheme;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("kms_crn")
  protected String kmsCrn;
  @SerializedName("kms_name")
  protected String kmsName;
  @SerializedName("kms_private_endpoint")
  protected String kmsPrivateEndpoint;
  @SerializedName("kms_public_endpoint")
  protected String kmsPublicEndpoint;
  @SerializedName("keys")
  protected List<KMSInstancesKeys> keys;

  public KMSInstances() {
    super(new TypeToken<Object>() { });
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
   * Gets the encryptionScheme.
   *
   * Encryption schema.
   *
   * @return the encryptionScheme
   */
  public String getEncryptionScheme() {
    return this.encryptionScheme;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource groups.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return this.resourceGroup;
  }

  /**
   * Gets the kmsCrn.
   *
   * KMS CRN.
   *
   * @return the kmsCrn
   */
  public String getKmsCrn() {
    return this.kmsCrn;
  }

  /**
   * Gets the kmsName.
   *
   * KMS Name.
   *
   * @return the kmsName
   */
  public String getKmsName() {
    return this.kmsName;
  }

  /**
   * Gets the kmsPrivateEndpoint.
   *
   * KMS private endpoint.
   *
   * @return the kmsPrivateEndpoint
   */
  public String getKmsPrivateEndpoint() {
    return this.kmsPrivateEndpoint;
  }

  /**
   * Gets the kmsPublicEndpoint.
   *
   * KMS public endpoint.
   *
   * @return the kmsPublicEndpoint
   */
  public String getKmsPublicEndpoint() {
    return this.kmsPublicEndpoint;
  }

  /**
   * Gets the keys.
   *
   * List of keys.
   *
   * @return the keys
   */
  public List<KMSInstancesKeys> getKeys() {
    return this.keys;
  }
}
