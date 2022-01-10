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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Details about IBM Cloud Schematics service supported template types and versions, and the supported locations.
 */
public class SchematicsInfo extends DynamicModel<Object> {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface SupportedLocations {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  public interface List<Inner> {
    /** terraform_v0_11. */
    String TERRAFORM_V0_11 = "terraform_v0_11";
    /** terraform_v0_12. */
    String TERRAFORM_V0_12 = "terraform_v0_12";
    /** helm_v2_15. */
    String HELM_V2_15 = "helm_v2_15";
    /** helm_v2_16. */
    String HELM_V2_16 = "helm_v2_16";
    /** ansible_v2_2. */
    String ANSIBLE_V2_2 = "ansible_v2_2";
    /** ansible_v2_3. */
    String ANSIBLE_V2_3 = "ansible_v2_3";
    /** ibm_cloud_pak_v3_1. */
    String IBM_CLOUD_PAK_V3_1 = "ibm_cloud_pak_v3_1";
  }

  @SerializedName("schematics_version")
  protected String schematicsVersion;
  @SerializedName("schematics_build")
  protected String schematicsBuild;
  @SerializedName("supported_locations")
  protected List<String> supportedLocations;
  @SerializedName("supported_templates")
  protected Map<String, List<String>> supportedTemplates;
  @SerializedName("supported_runtimes")
  protected Map<String, List<SchematicsRuntimeInfo>> supportedRuntimes;

  public SchematicsInfo() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the schematicsVersion.
   *
   * Schematics version.
   *
   * @return the schematicsVersion
   */
  public String getSchematicsVersion() {
    return this.schematicsVersion;
  }

  /**
   * Gets the schematicsBuild.
   *
   * Schematics build number.
   *
   * @return the schematicsBuild
   */
  public String getSchematicsBuild() {
    return this.schematicsBuild;
  }

  /**
   * Gets the supportedLocations.
   *
   * Supported locations for IBM Cloud Schematics.
   *
   * @return the supportedLocations
   */
  public List<String> getSupportedLocations() {
    return this.supportedLocations;
  }

  /**
   * Gets the supportedTemplates.
   *
   * Support template-types in IBM Cloud Schematics.
   *
   * @return the supportedTemplates
   */
  public Map<String, List<String>> getSupportedTemplates() {
    return this.supportedTemplates;
  }

  /**
   * Gets the supportedRuntimes.
   *
   * Supported runtime components for each template-types in Schematics.
   *
   * @return the supportedRuntimes
   */
  public Map<String, List<SchematicsRuntimeInfo>> getSupportedRuntimes() {
    return this.supportedRuntimes;
  }
}
