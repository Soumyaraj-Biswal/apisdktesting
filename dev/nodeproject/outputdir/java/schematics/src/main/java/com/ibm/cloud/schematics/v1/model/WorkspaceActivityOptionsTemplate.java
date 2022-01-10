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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workspace job options template.
 */
public class WorkspaceActivityOptionsTemplate extends GenericModel {

  protected List<String> target;
  @SerializedName("tf_vars")
  protected List<String> tfVars;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> target;
    private List<String> tfVars;

    private Builder(WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplate) {
      this.target = workspaceActivityOptionsTemplate.target;
      this.tfVars = workspaceActivityOptionsTemplate.tfVars;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkspaceActivityOptionsTemplate.
     *
     * @return the new WorkspaceActivityOptionsTemplate instance
     */
    public WorkspaceActivityOptionsTemplate build() {
      return new WorkspaceActivityOptionsTemplate(this);
    }

    /**
     * Adds an target to target.
     *
     * @param target the new target
     * @return the WorkspaceActivityOptionsTemplate builder
     */
    public Builder addTarget(String target) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(target,
        "target cannot be null");
      if (this.target == null) {
        this.target = new ArrayList<String>();
      }
      this.target.add(target);
      return this;
    }

    /**
     * Adds an tfVars to tfVars.
     *
     * @param tfVars the new tfVars
     * @return the WorkspaceActivityOptionsTemplate builder
     */
    public Builder addTfVars(String tfVars) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tfVars,
        "tfVars cannot be null");
      if (this.tfVars == null) {
        this.tfVars = new ArrayList<String>();
      }
      this.tfVars.add(tfVars);
      return this;
    }

    /**
     * Set the target.
     * Existing target will be replaced.
     *
     * @param target the target
     * @return the WorkspaceActivityOptionsTemplate builder
     */
    public Builder target(List<String> target) {
      this.target = target;
      return this;
    }

    /**
     * Set the tfVars.
     * Existing tfVars will be replaced.
     *
     * @param tfVars the tfVars
     * @return the WorkspaceActivityOptionsTemplate builder
     */
    public Builder tfVars(List<String> tfVars) {
      this.tfVars = tfVars;
      return this;
    }
  }

  protected WorkspaceActivityOptionsTemplate(Builder builder) {
    target = builder.target;
    tfVars = builder.tfVars;
  }

  /**
   * New builder.
   *
   * @return a WorkspaceActivityOptionsTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * A list of Terraform resources to target.
   *
   * @return the target
   */
  public List<String> target() {
    return target;
  }

  /**
   * Gets the tfVars.
   *
   * Terraform variables for the workspace job options.
   *
   * @return the tfVars
   */
  public List<String> tfVars() {
    return tfVars;
  }
}

