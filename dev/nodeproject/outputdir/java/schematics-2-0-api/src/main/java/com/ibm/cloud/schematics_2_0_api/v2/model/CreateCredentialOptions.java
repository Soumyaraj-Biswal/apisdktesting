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
 * The createCredential options.
 */
public class CreateCredentialOptions extends GenericModel {

  protected Credentialset credentialset;

  /**
   * Builder.
   */
  public static class Builder {
    private Credentialset credentialset;

    private Builder(CreateCredentialOptions createCredentialOptions) {
      this.credentialset = createCredentialOptions.credentialset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param credentialset the credentialset
     */
    public Builder(Credentialset credentialset) {
      this.credentialset = credentialset;
    }

    /**
     * Builds a CreateCredentialOptions.
     *
     * @return the new CreateCredentialOptions instance
     */
    public CreateCredentialOptions build() {
      return new CreateCredentialOptions(this);
    }

    /**
     * Set the credentialset.
     *
     * @param credentialset the credentialset
     * @return the CreateCredentialOptions builder
     */
    public Builder credentialset(Credentialset credentialset) {
      this.credentialset = credentialset;
      return this;
    }
  }

  protected CreateCredentialOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.credentialset,
      "credentialset cannot be null");
    credentialset = builder.credentialset;
  }

  /**
   * New builder.
   *
   * @return a CreateCredentialOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the credentialset.
   *
   * Create a credential entry.
   *
   * @return the credentialset
   */
  public Credentialset credentialset() {
    return credentialset;
  }
}

