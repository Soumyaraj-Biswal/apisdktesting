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
 * The createDatasource options.
 */
public class CreateDatasourceOptions extends GenericModel {

  protected Datasource datasource;

  /**
   * Builder.
   */
  public static class Builder {
    private Datasource datasource;

    private Builder(CreateDatasourceOptions createDatasourceOptions) {
      this.datasource = createDatasourceOptions.datasource;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param datasource the datasource
     */
    public Builder(Datasource datasource) {
      this.datasource = datasource;
    }

    /**
     * Builds a CreateDatasourceOptions.
     *
     * @return the new CreateDatasourceOptions instance
     */
    public CreateDatasourceOptions build() {
      return new CreateDatasourceOptions(this);
    }

    /**
     * Set the datasource.
     *
     * @param datasource the datasource
     * @return the CreateDatasourceOptions builder
     */
    public Builder datasource(Datasource datasource) {
      this.datasource = datasource;
      return this;
    }
  }

  protected CreateDatasourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.datasource,
      "datasource cannot be null");
    datasource = builder.datasource;
  }

  /**
   * New builder.
   *
   * @return a CreateDatasourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the datasource.
   *
   * Register a datasource.
   *
   * @return the datasource
   */
  public Datasource datasource() {
    return datasource;
  }
}

