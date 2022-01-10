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
 * The deleteAction options.
 */
public class DeleteActionOptions extends GenericModel {

  protected String actionId;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private Boolean force;
    private Boolean propagate;

    private Builder(DeleteActionOptions deleteActionOptions) {
      this.actionId = deleteActionOptions.actionId;
      this.force = deleteActionOptions.force;
      this.propagate = deleteActionOptions.propagate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionId the actionId
     */
    public Builder(String actionId) {
      this.actionId = actionId;
    }

    /**
     * Builds a DeleteActionOptions.
     *
     * @return the new DeleteActionOptions instance
     */
    public DeleteActionOptions build() {
      return new DeleteActionOptions(this);
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the DeleteActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteActionOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteActionOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    actionId = builder.actionId;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionId.
   *
   * Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
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

