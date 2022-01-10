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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Order of execution for the Blueprint command.
 */
public class Flow extends DynamicModel<Object> {

  @SerializedName("type")
  protected String type;
  @SerializedName("operations")
  protected List<FlowOperations> operations;

  public Flow() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<FlowOperations> operations;
    private Map<String, Object> dynamicProperties;

    private Builder(Flow flow) {
      this.type = flow.type;
      this.operations = flow.operations;
      this.dynamicProperties = flow.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Flow.
     *
     * @return the new Flow instance
     */
    public Flow build() {
      return new Flow(this);
    }

    /**
     * Adds an operations to operations.
     *
     * @param operations the new operations
     * @return the Flow builder
     */
    public Builder addOperations(FlowOperations operations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(operations,
        "operations cannot be null");
      if (this.operations == null) {
        this.operations = new ArrayList<FlowOperations>();
      }
      this.operations.add(operations);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Flow builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the operations.
     * Existing operations will be replaced.
     *
     * @param operations the operations
     * @return the Flow builder
     */
    public Builder operations(List<FlowOperations> operations) {
      this.operations = operations;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Flow builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected Flow(Builder builder) {
    super(new TypeToken<Object>() { });
    type = builder.type;
    operations = builder.operations;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Flow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of Blueprint flows.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the operations.
   *
   * @return the operations
   */
  public List<FlowOperations> getOperations() {
    return this.operations;
  }

  /**
   * Sets the operations.
   *
   * @param operations the new operations
   */
  public void setOperations(final List<FlowOperations> operations) {
    this.operations = operations;
  }
}
