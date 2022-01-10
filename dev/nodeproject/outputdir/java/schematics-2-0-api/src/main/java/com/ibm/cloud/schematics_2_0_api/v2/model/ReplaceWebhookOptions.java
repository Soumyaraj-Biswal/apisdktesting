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
 * The replaceWebhook options.
 */
public class ReplaceWebhookOptions extends GenericModel {

  protected String hookId;
  protected WebHook webHook;

  /**
   * Builder.
   */
  public static class Builder {
    private String hookId;
    private WebHook webHook;

    private Builder(ReplaceWebhookOptions replaceWebhookOptions) {
      this.hookId = replaceWebhookOptions.hookId;
      this.webHook = replaceWebhookOptions.webHook;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hookId the hookId
     * @param webHook the webHook
     */
    public Builder(String hookId, WebHook webHook) {
      this.hookId = hookId;
      this.webHook = webHook;
    }

    /**
     * Builds a ReplaceWebhookOptions.
     *
     * @return the new ReplaceWebhookOptions instance
     */
    public ReplaceWebhookOptions build() {
      return new ReplaceWebhookOptions(this);
    }

    /**
     * Set the hookId.
     *
     * @param hookId the hookId
     * @return the ReplaceWebhookOptions builder
     */
    public Builder hookId(String hookId) {
      this.hookId = hookId;
      return this;
    }

    /**
     * Set the webHook.
     *
     * @param webHook the webHook
     * @return the ReplaceWebhookOptions builder
     */
    public Builder webHook(WebHook webHook) {
      this.webHook = webHook;
      return this;
    }
  }

  protected ReplaceWebhookOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.hookId,
      "hookId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.webHook,
      "webHook cannot be null");
    hookId = builder.hookId;
    webHook = builder.webHook;
  }

  /**
   * New builder.
   *
   * @return a ReplaceWebhookOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hookId.
   *
   * Id of the Schematics web-hook.
   *
   * @return the hookId
   */
  public String hookId() {
    return hookId;
  }

  /**
   * Gets the webHook.
   *
   * Replace the Schematics web-hook.
   *
   * @return the webHook
   */
  public WebHook webHook() {
    return webHook;
  }
}

