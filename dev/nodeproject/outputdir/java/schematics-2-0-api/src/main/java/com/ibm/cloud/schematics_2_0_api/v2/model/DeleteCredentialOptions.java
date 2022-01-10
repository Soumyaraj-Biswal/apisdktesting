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
 * The deleteCredential options.
 */
public class DeleteCredentialOptions extends GenericModel {

  protected String credsId;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String credsId;
    private Boolean force;
    private Boolean propagate;

    private Builder(DeleteCredentialOptions deleteCredentialOptions) {
      this.credsId = deleteCredentialOptions.credsId;
      this.force = deleteCredentialOptions.force;
      this.propagate = deleteCredentialOptions.propagate;
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
     * Builds a DeleteCredentialOptions.
     *
     * @return the new DeleteCredentialOptions instance
     */
    public DeleteCredentialOptions build() {
      return new DeleteCredentialOptions(this);
    }

    /**
     * Set the credsId.
     *
     * @param credsId the credsId
     * @return the DeleteCredentialOptions builder
     */
    public Builder credsId(String credsId) {
      this.credsId = credsId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteCredentialOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteCredentialOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteCredentialOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.credsId,
      "credsId cannot be empty");
    credsId = builder.credsId;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteCredentialOptions builder
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
   * Gets the force.
   *
   * Equivalent to -force options in the command line.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the propagate.
   *
   * Auto propagate the chaange or deletion to the dependent resources.
   *
   * @return the propagate
   */
  public Boolean propagate() {
    return propagate;
  }
}

