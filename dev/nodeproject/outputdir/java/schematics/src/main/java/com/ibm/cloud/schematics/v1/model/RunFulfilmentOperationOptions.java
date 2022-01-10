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
 * The runFulfilmentOperation options.
 */
public class RunFulfilmentOperationOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String orderId;
  protected String operation;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String orderId;
    private String operation;
    private String profile;

    private Builder(RunFulfilmentOperationOptions runFulfilmentOperationOptions) {
      this.orderId = runFulfilmentOperationOptions.orderId;
      this.operation = runFulfilmentOperationOptions.operation;
      this.profile = runFulfilmentOperationOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param orderId the orderId
     * @param operation the operation
     */
    public Builder(String orderId, String operation) {
      this.orderId = orderId;
      this.operation = operation;
    }

    /**
     * Builds a RunFulfilmentOperationOptions.
     *
     * @return the new RunFulfilmentOperationOptions instance
     */
    public RunFulfilmentOperationOptions build() {
      return new RunFulfilmentOperationOptions(this);
    }

    /**
     * Set the orderId.
     *
     * @param orderId the orderId
     * @return the RunFulfilmentOperationOptions builder
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the RunFulfilmentOperationOptions builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the RunFulfilmentOperationOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected RunFulfilmentOperationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.orderId,
      "orderId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    orderId = builder.orderId;
    operation = builder.operation;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a RunFulfilmentOperationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderId.
   *
   * Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account.
   *
   * @return the orderId
   */
  public String orderId() {
    return orderId;
  }

  /**
   * Gets the operation.
   *
   * The name of fulfilment job operation (install, uninstall, configure, operate).
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

