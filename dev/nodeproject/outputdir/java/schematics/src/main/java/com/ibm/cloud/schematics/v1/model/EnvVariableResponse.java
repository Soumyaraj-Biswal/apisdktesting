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
 * List of environment values.
 */
public class EnvVariableResponse extends GenericModel {

  protected Boolean hidden;
  protected String name;
  protected Boolean secure;
  protected String value;

  /**
   * Gets the hidden.
   *
   * Environment variable is hidden.
   *
   * @return the hidden
   */
  public Boolean isHidden() {
    return hidden;
  }

  /**
   * Gets the name.
   *
   * Environment variable name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the secure.
   *
   * Environment variable is secure.
   *
   * @return the secure
   */
  public Boolean isSecure() {
    return secure;
  }

  /**
   * Gets the value.
   *
   * Value for environment variable.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

