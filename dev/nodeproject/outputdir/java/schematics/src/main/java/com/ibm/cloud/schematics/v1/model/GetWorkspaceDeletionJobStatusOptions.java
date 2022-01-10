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
 * The getWorkspaceDeletionJobStatus options.
 */
public class GetWorkspaceDeletionJobStatusOptions extends GenericModel {

  protected String wjId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wjId;

    private Builder(GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions) {
      this.wjId = getWorkspaceDeletionJobStatusOptions.wjId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wjId the wjId
     */
    public Builder(String wjId) {
      this.wjId = wjId;
    }

    /**
     * Builds a GetWorkspaceDeletionJobStatusOptions.
     *
     * @return the new GetWorkspaceDeletionJobStatusOptions instance
     */
    public GetWorkspaceDeletionJobStatusOptions build() {
      return new GetWorkspaceDeletionJobStatusOptions(this);
    }

    /**
     * Set the wjId.
     *
     * @param wjId the wjId
     * @return the GetWorkspaceDeletionJobStatusOptions builder
     */
    public Builder wjId(String wjId) {
      this.wjId = wjId;
      return this;
    }
  }

  protected GetWorkspaceDeletionJobStatusOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wjId,
      "wjId cannot be empty");
    wjId = builder.wjId;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceDeletionJobStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wjId.
   *
   * The workspace job ID.
   *
   * @return the wjId
   */
  public String wjId() {
    return wjId;
  }
}

