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
 * The createWebhook options.
 */
public class CreateWebhookOptions extends GenericModel {

  protected WebHook webHook;

  /**
   * Builder.
   */
  public static class Builder {
    private WebHook webHook;

    private Builder(CreateWebhookOptions createWebhookOptions) {
      this.webHook = createWebhookOptions.webHook;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param webHook the webHook
     */
    public Builder(WebHook webHook) {
      this.webHook = webHook;
    }

    /**
     * Builds a CreateWebhookOptions.
     *
     * @return the new CreateWebhookOptions instance
     */
    public CreateWebhookOptions build() {
      return new CreateWebhookOptions(this);
    }

    /**
     * Set the webHook.
     *
     * @param webHook the webHook
     * @return the CreateWebhookOptions builder
     */
    public Builder webHook(WebHook webHook) {
      this.webHook = webHook;
      return this;
    }
  }

  protected CreateWebhookOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.webHook,
      "webHook cannot be null");
    webHook = builder.webHook;
  }

  /**
   * New builder.
   *
   * @return a CreateWebhookOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the webHook.
   *
   * Register a Web-hook or callback (pre- &amp; post-  actions, such as initialise, redeploy, reconfigure, refresh)
   * with Schematics.
   *
   * @return the webHook
   */
  public WebHook webHook() {
    return webHook;
  }
}

