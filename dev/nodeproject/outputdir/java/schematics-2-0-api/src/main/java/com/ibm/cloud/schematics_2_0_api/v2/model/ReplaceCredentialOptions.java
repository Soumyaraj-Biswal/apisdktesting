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
 * The replaceCredential options.
 */
public class ReplaceCredentialOptions extends GenericModel {

  protected String credsId;
  protected Credentialset credentialset;

  /**
   * Builder.
   */
  public static class Builder {
    private String credsId;
    private Credentialset credentialset;

    private Builder(ReplaceCredentialOptions replaceCredentialOptions) {
      this.credsId = replaceCredentialOptions.credsId;
      this.credentialset = replaceCredentialOptions.credentialset;
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
     * @param credentialset the credentialset
     */
    public Builder(String credsId, Credentialset credentialset) {
      this.credsId = credsId;
      this.credentialset = credentialset;
    }

    /**
     * Builds a ReplaceCredentialOptions.
     *
     * @return the new ReplaceCredentialOptions instance
     */
    public ReplaceCredentialOptions build() {
      return new ReplaceCredentialOptions(this);
    }

    /**
     * Set the credsId.
     *
     * @param credsId the credsId
     * @return the ReplaceCredentialOptions builder
     */
    public Builder credsId(String credsId) {
      this.credsId = credsId;
      return this;
    }

    /**
     * Set the credentialset.
     *
     * @param credentialset the credentialset
     * @return the ReplaceCredentialOptions builder
     */
    public Builder credentialset(Credentialset credentialset) {
      this.credentialset = credentialset;
      return this;
    }
  }

  protected ReplaceCredentialOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.credsId,
      "credsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.credentialset,
      "credentialset cannot be null");
    credsId = builder.credsId;
    credentialset = builder.credentialset;
  }

  /**
   * New builder.
   *
   * @return a ReplaceCredentialOptions builder
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
   * Gets the credentialset.
   *
   * Replace the credential entry.
   *
   * @return the credentialset
   */
  public Credentialset credentialset() {
    return credentialset;
  }
}

