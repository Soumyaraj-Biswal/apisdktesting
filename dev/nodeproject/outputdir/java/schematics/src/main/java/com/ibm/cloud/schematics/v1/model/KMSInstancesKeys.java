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
 * KMSInstancesKeys.
 */
public class KMSInstancesKeys extends GenericModel {

  protected String name;
  protected String crn;
  protected String error;

  /**
   * Gets the name.
   *
   * Key name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the crn.
   *
   * CRN of the Key.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the error.
   *
   * Error message.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }
}

