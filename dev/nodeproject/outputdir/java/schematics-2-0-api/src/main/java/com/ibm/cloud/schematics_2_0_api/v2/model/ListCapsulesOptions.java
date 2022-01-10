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
 * The listCapsules options.
 */
public class ListCapsulesOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String controlsId;
  protected Long offset;
  protected Long limit;
  protected String sort;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String controlsId;
    private Long offset;
    private Long limit;
    private String sort;
    private String profile;

    private Builder(ListCapsulesOptions listCapsulesOptions) {
      this.controlsId = listCapsulesOptions.controlsId;
      this.offset = listCapsulesOptions.offset;
      this.limit = listCapsulesOptions.limit;
      this.sort = listCapsulesOptions.sort;
      this.profile = listCapsulesOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param controlsId the controlsId
     */
    public Builder(String controlsId) {
      this.controlsId = controlsId;
    }

    /**
     * Builds a ListCapsulesOptions.
     *
     * @return the new ListCapsulesOptions instance
     */
    public ListCapsulesOptions build() {
      return new ListCapsulesOptions(this);
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the ListCapsulesOptions builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListCapsulesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListCapsulesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListCapsulesOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ListCapsulesOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ListCapsulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.controlsId,
      "controlsId cannot be empty");
    controlsId = builder.controlsId;
    offset = builder.offset;
    limit = builder.limit;
    sort = builder.sort;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ListCapsulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the controlsId.
   *
   * Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account.
   *
   * @return the controlsId
   */
  public String controlsId() {
    return controlsId;
  }

  /**
   * Gets the offset.
   *
   * The starting position of the item in the list of items. For example, if you have three workspaces in your account,
   * the first workspace is assigned position number 0, the second workspace is assigned position number 1, and so
   * forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit the number
   * of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative numbers are not
   * supported and are ignored.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000. If no
   * value is provided, 100 is used by default.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the sort.
   *
   * Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
   * owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is ascending)
   *  Ignore unrecognized or unsupported sort field.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

