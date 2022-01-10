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
 * The planWorkspaceCommand options.
 */
public class PlanWorkspaceCommandOptions extends GenericModel {

  protected String wId;
  protected String refreshToken;
  protected String delegatedToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String refreshToken;
    private String delegatedToken;

    private Builder(PlanWorkspaceCommandOptions planWorkspaceCommandOptions) {
      this.wId = planWorkspaceCommandOptions.wId;
      this.refreshToken = planWorkspaceCommandOptions.refreshToken;
      this.delegatedToken = planWorkspaceCommandOptions.delegatedToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param refreshToken the refreshToken
     */
    public Builder(String wId, String refreshToken) {
      this.wId = wId;
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a PlanWorkspaceCommandOptions.
     *
     * @return the new PlanWorkspaceCommandOptions instance
     */
    public PlanWorkspaceCommandOptions build() {
      return new PlanWorkspaceCommandOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the PlanWorkspaceCommandOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the PlanWorkspaceCommandOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the delegatedToken.
     *
     * @param delegatedToken the delegatedToken
     * @return the PlanWorkspaceCommandOptions builder
     */
    public Builder delegatedToken(String delegatedToken) {
      this.delegatedToken = delegatedToken;
      return this;
    }
  }

  protected PlanWorkspaceCommandOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    wId = builder.wId;
    refreshToken = builder.refreshToken;
    delegatedToken = builder.delegatedToken;
  }

  /**
   * New builder.
   *
   * @return a PlanWorkspaceCommandOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace, for which you want to run a Schematics `plan` job. To find the ID of your workspace, use
   * the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token is required only if you want to delete all the Terraform resources before deleting the
   * Schematics workspace. If you want to delete the workspace only and keep all your Terraform resources, refresh token
   * is not required.
   *  **Retrieving refresh token**:
   *  * Use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;`, and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type: application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`.
   *  * For more information, about creating IAM access token and API Docs, refer, [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *
   *  **Limitation**:
   *  * If the token is expired, you can use `refresh token` to get a new IAM access token.
   *  * The `refresh_token` parameter cannot be used to retrieve a new IAM access token.
   *  * When the IAM access token is about to expire, use the API key to create a new access token.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the delegatedToken.
   *
   * The IAM delegated token for your IBM Cloud account. This token is required for requests that are sent via the UI
   * only.
   *
   * @return the delegatedToken
   */
  public String delegatedToken() {
    return delegatedToken;
  }
}

