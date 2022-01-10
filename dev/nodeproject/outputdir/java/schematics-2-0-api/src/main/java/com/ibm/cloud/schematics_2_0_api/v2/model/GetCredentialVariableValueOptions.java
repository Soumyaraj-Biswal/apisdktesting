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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getCredentialVariableValue options.
 */
public class GetCredentialVariableValueOptions extends GenericModel {

  protected String credsId;
  protected String varName;

  /**
   * Builder.
   */
  public static class Builder {
    private String credsId;
    private String varName;

    private Builder(GetCredentialVariableValueOptions getCredentialVariableValueOptions) {
      this.credsId = getCredentialVariableValueOptions.credsId;
      this.varName = getCredentialVariableValueOptions.varName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param credsId the credsId
     * @param varName the varName
     */
    public Builder(String credsId, String varName) {
      this.credsId = credsId;
      this.varName = varName;
    }

    /**
     * Builds a GetCredentialVariableValueOptions.
     *
     * @return the new GetCredentialVariableValueOptions instance
     */
    public GetCredentialVariableValueOptions build() {
      return new GetCredentialVariableValueOptions(this);
    }

    /**
     * Set the credsId.
     *
     * @param credsId the credsId
     * @return the GetCredentialVariableValueOptions builder
     */
    public Builder credsId(String credsId) {
      this.credsId = credsId;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the GetCredentialVariableValueOptions builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }
  }

  protected GetCredentialVariableValueOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.credsId,
      "credsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.varName,
      "varName cannot be empty");
    credsId = builder.credsId;
    varName = builder.varName;
  }

  /**
   * New builder.
   *
   * @return a GetCredentialVariableValueOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the credsId.
   *
   * Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account.
   *
   * @return the credsId
   */
  public String credsId() {
    return credsId;
  }

  /**
   * Gets the varName.
   *
   * Name of the variable.
   *
   * @return the varName
   */
  public String varName() {
    return varName;
  }
}

