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
 * The listJobs options.
 */
public class ListJobsOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  /**
   * Name of the resource (workspace, actions or controls).
   */
  public interface Resource {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
  }

  /**
   * list jobs.
   */
  public interface List {
    /** all. */
    String ALL = "all";
  }

  protected Long offset;
  protected Long limit;
  protected String sort;
  protected String profile;
  protected String resource;
  protected String resourceId;
  protected String actionId;
  protected String list;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String sort;
    private String profile;
    private String resource;
    private String resourceId;
    private String actionId;
    private String list;

    private Builder(ListJobsOptions listJobsOptions) {
      this.offset = listJobsOptions.offset;
      this.limit = listJobsOptions.limit;
      this.sort = listJobsOptions.sort;
      this.profile = listJobsOptions.profile;
      this.resource = listJobsOptions.resource;
      this.resourceId = listJobsOptions.resourceId;
      this.actionId = listJobsOptions.actionId;
      this.list = listJobsOptions.list;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListJobsOptions.
     *
     * @return the new ListJobsOptions instance
     */
    public ListJobsOptions build() {
      return new ListJobsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListJobsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListJobsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListJobsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ListJobsOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the ListJobsOptions builder
     */
    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Set the resourceId.
     *
     * @param resourceId the resourceId
     * @return the ListJobsOptions builder
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the ListJobsOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the list.
     *
     * @param list the list
     * @return the ListJobsOptions builder
     */
    public Builder list(String list) {
      this.list = list;
      return this;
    }
  }

  protected ListJobsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    sort = builder.sort;
    profile = builder.profile;
    resource = builder.resource;
    resourceId = builder.resourceId;
    actionId = builder.actionId;
    list = builder.list;
  }

  /**
   * New builder.
   *
   * @return a ListJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the resource.
   *
   * Name of the resource (workspace, actions or controls).
   *
   * @return the resource
   */
  public String resource() {
    return resource;
  }

  /**
   * Gets the resourceId.
   *
   * The Resource Id. It could be an Action-id or Workspace-id.
   *
   * @return the resourceId
   */
  public String resourceId() {
    return resourceId;
  }

  /**
   * Gets the actionId.
   *
   * Action Id.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
  }

  /**
   * Gets the list.
   *
   * list jobs.
   *
   * @return the list
   */
  public String list() {
    return list;
  }
}

