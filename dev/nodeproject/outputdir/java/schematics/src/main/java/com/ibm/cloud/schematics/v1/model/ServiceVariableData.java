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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * User editable service variable data &amp; system generated reference to value.
 */
public class ServiceVariableData extends GenericModel {

  protected String name;
  protected String value;
  protected VariableMetadata metadata;
  protected List<ServiceMappingRule> mapping;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private VariableMetadata metadata;
    private List<ServiceMappingRule> mapping;

    private Builder(ServiceVariableData serviceVariableData) {
      this.name = serviceVariableData.name;
      this.value = serviceVariableData.value;
      this.metadata = serviceVariableData.metadata;
      this.mapping = serviceVariableData.mapping;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceVariableData.
     *
     * @return the new ServiceVariableData instance
     */
    public ServiceVariableData build() {
      return new ServiceVariableData(this);
    }

    /**
     * Adds an mapping to mapping.
     *
     * @param mapping the new mapping
     * @return the ServiceVariableData builder
     */
    public Builder addMapping(ServiceMappingRule mapping) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mapping,
        "mapping cannot be null");
      if (this.mapping == null) {
        this.mapping = new ArrayList<ServiceMappingRule>();
      }
      this.mapping.add(mapping);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ServiceVariableData builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ServiceVariableData builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the ServiceVariableData builder
     */
    public Builder metadata(VariableMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set the mapping.
     * Existing mapping will be replaced.
     *
     * @param mapping the mapping
     * @return the ServiceVariableData builder
     */
    public Builder mapping(List<ServiceMappingRule> mapping) {
      this.mapping = mapping;
      return this;
    }
  }

  protected ServiceVariableData(Builder builder) {
    name = builder.name;
    value = builder.value;
    metadata = builder.metadata;
    mapping = builder.mapping;
  }

  /**
   * New builder.
   *
   * @return a ServiceVariableData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the variable.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value for the variable or reference to the value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the metadata.
   *
   * An user editable metadata for the variables.
   *
   * @return the metadata
   */
  public VariableMetadata metadata() {
    return metadata;
  }

  /**
   * Gets the mapping.
   *
   * Service Mapping Rule.
   *
   * @return the mapping
   */
  public List<ServiceMappingRule> mapping() {
    return mapping;
  }
}

