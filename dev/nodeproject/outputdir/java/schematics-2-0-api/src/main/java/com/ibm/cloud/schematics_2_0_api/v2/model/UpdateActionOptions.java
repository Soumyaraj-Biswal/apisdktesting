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
 * The updateAction options.
 */
public class UpdateActionOptions extends GenericModel {

  protected String actionId;
  protected Action action;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private Action action;
    private String xGithubToken;

    private Builder(UpdateActionOptions updateActionOptions) {
      this.actionId = updateActionOptions.actionId;
      this.action = updateActionOptions.action;
      this.xGithubToken = updateActionOptions.xGithubToken;
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
     * @param action the action
     */
    public Builder(String actionId, Action action) {
      this.actionId = actionId;
      this.action = action;
    }

    /**
     * Builds a UpdateActionOptions.
     *
     * @return the new UpdateActionOptions instance
     */
    public UpdateActionOptions build() {
      return new UpdateActionOptions(this);
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the UpdateActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateActionOptions builder
     */
    public Builder action(Action action) {
      this.action = action;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the UpdateActionOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }
  }

  protected UpdateActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    actionId = builder.actionId;
    action = builder.action;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a UpdateActionOptions builder
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
   * Gets the action.
   *
   * Action.
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

