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
 * The getWebhook options.
 */
public class GetWebhookOptions extends GenericModel {

  protected String hookId;

  /**
   * Builder.
   */
  public static class Builder {
    private String hookId;

    private Builder(GetWebhookOptions getWebhookOptions) {
      this.hookId = getWebhookOptions.hookId;
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
     */
    public Builder(String hookId) {
      this.hookId = hookId;
    }

    /**
     * Builds a GetWebhookOptions.
     *
     * @return the new GetWebhookOptions instance
     */
    public GetWebhookOptions build() {
      return new GetWebhookOptions(this);
    }

    /**
     * Set the hookId.
     *
     * @param hookId the hookId
     * @return the GetWebhookOptions builder
     */
    public Builder hookId(String hookId) {
      this.hookId = hookId;
      return this;
    }
  }

  protected GetWebhookOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.hookId,
      "hookId cannot be empty");
    hookId = builder.hookId;
  }

  /**
   * New builder.
   *
   * @return a GetWebhookOptions builder
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
}

