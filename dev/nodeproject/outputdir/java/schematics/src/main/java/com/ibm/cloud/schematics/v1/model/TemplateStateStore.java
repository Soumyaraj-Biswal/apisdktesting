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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The content of the Terraform statefile (`terraform.tfstate`).
 */
public class TemplateStateStore extends GenericModel {

  protected Double version;
  @SerializedName("terraform_version")
  protected String terraformVersion;
  protected Double serial;
  protected String lineage;
  protected List<Object> modules;

  /**
   * Gets the version.
   *
   * @return the version
   */
  public Double getVersion() {
    return version;
  }

  /**
   * Gets the terraformVersion.
   *
   * @return the terraformVersion
   */
  public String getTerraformVersion() {
    return terraformVersion;
  }

  /**
   * Gets the serial.
   *
   * @return the serial
   */
  public Double getSerial() {
    return serial;
  }

  /**
   * Gets the lineage.
   *
   * @return the lineage
   */
  public String getLineage() {
    return lineage;
  }

  /**
   * Gets the modules.
   *
   * @return the modules
   */
  public List<Object> getModules() {
    return modules;
  }
}

