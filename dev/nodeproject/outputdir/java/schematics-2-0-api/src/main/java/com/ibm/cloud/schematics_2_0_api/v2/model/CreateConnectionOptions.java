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
 * The createConnection options.
 */
public class CreateConnectionOptions extends GenericModel {

  protected Connection connection;

  /**
   * Builder.
   */
  public static class Builder {
    private Connection connection;

    private Builder(CreateConnectionOptions createConnectionOptions) {
      this.connection = createConnectionOptions.connection;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param connection the connection
     */
    public Builder(Connection connection) {
      this.connection = connection;
    }

    /**
     * Builds a CreateConnectionOptions.
     *
     * @return the new CreateConnectionOptions instance
     */
    public CreateConnectionOptions build() {
      return new CreateConnectionOptions(this);
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the CreateConnectionOptions builder
     */
    public Builder connection(Connection connection) {
      this.connection = connection;
      return this;
    }
  }

  protected CreateConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connection,
      "connection cannot be null");
    connection = builder.connection;
  }

  /**
   * New builder.
   *
   * @return a CreateConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the connection.
   *
   * Register a new connection.
   *
   * @return the connection
   */
  public Connection connection() {
    return connection;
  }
}

