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
 * The createAction options.
 */
public class CreateActionOptions extends GenericModel {

  protected Action action;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private Action action;
    private String xGithubToken;

    private Builder(CreateActionOptions createActionOptions) {
      this.action = createActionOptions.action;
      this.xGithubToken = createActionOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     */
    public Builder(Action action) {
      this.action = action;
    }

    /**
     * Builds a CreateActionOptions.
     *
     * @return the new CreateActionOptions instance
     */
    public CreateActionOptions build() {
      return new CreateActionOptions(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateActionOptions builder
     */
    public Builder action(Action action) {
      this.action = action;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the CreateActionOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected CreateActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    action = builder.action;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a CreateActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * Create Action request.
   *
   * @return the action
   */
  public Action action() {
    return action;
  }

  /**
   * Gets the xGithubToken.
   *
   * The personal access token associated with your GitHub or GitLab repository, required to clone the repository.
   *
   * @return the xGithubToken
   */
  public String xGithubToken() {
    return xGithubToken;
  }
}

