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

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * EnvironmentCatalogOfferingItemVersions.
 */
public class EnvironmentCatalogOfferingItemVersions extends DynamicModel<Object> {

  @SerializedName("version")
  protected String version;
  @SerializedName("versionid")
  protected String versionid;

  public EnvironmentCatalogOfferingItemVersions() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the version.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Gets the versionid.
   *
   * @return the versionid
   */
  public String getVersionid() {
    return this.versionid;
  }
}
