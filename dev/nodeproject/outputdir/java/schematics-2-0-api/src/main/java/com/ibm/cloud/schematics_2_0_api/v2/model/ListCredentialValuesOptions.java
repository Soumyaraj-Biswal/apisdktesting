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
 * The listCredentialValues options.
 */
public class ListCredentialValuesOptions extends GenericModel {

  protected String credsId;

  /**
   * Builder.
   */
  public static class Builder {
    private String credsId;

    private Builder(ListCredentialValuesOptions listCredentialValuesOptions) {
      this.credsId = listCredentialValuesOptions.credsId;
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
     */
    public Builder(String credsId) {
      this.credsId = credsId;
    }

    /**
     * Builds a ListCredentialValuesOptions.
     *
     * @return the new ListCredentialValuesOptions instance
     */
    public ListCredentialValuesOptions build() {
      return new ListCredentialValuesOptions(this);
    }

    /**
     * Set the credsId.
     *
     * @param credsId the credsId
     * @return the ListCredentialValuesOptions builder
     */
    public Builder credsId(String credsId) {
      this.credsId = credsId;
      return this;
    }
  }

  protected ListCredentialValuesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.credsId,
      "credsId cannot be empty");
    credsId = builder.credsId;
  }

  /**
   * New builder.
   *
   * @return a ListCredentialValuesOptions builder
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
}

