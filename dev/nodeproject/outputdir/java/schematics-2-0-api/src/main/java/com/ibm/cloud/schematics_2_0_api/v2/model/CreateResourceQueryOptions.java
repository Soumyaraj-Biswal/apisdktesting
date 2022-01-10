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
 * The createResourceQuery options.
 */
public class CreateResourceQueryOptions extends GenericModel {

  protected ResourceQueryDefinition resourceQueryDefinition;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceQueryDefinition resourceQueryDefinition;

    private Builder(CreateResourceQueryOptions createResourceQueryOptions) {
      this.resourceQueryDefinition = createResourceQueryOptions.resourceQueryDefinition;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceQueryDefinition the resourceQueryDefinition
     */
    public Builder(ResourceQueryDefinition resourceQueryDefinition) {
      this.resourceQueryDefinition = resourceQueryDefinition;
    }

    /**
     * Builds a CreateResourceQueryOptions.
     *
     * @return the new CreateResourceQueryOptions instance
     */
    public CreateResourceQueryOptions build() {
      return new CreateResourceQueryOptions(this);
    }

    /**
     * Set the resourceQueryDefinition.
     *
     * @param resourceQueryDefinition the resourceQueryDefinition
     * @return the CreateResourceQueryOptions builder
     */
    public Builder resourceQueryDefinition(ResourceQueryDefinition resourceQueryDefinition) {
      this.resourceQueryDefinition = resourceQueryDefinition;
      return this;
    }
  }

  protected CreateResourceQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceQueryDefinition,
      "resourceQueryDefinition cannot be null");
    resourceQueryDefinition = builder.resourceQueryDefinition;
  }

  /**
   * New builder.
   *
   * @return a CreateResourceQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceQueryDefinition.
   *
   * Create a resource query definition.
   *
   * @return the resourceQueryDefinition
   */
  public ResourceQueryDefinition resourceQueryDefinition() {
    return resourceQueryDefinition;
  }
}

