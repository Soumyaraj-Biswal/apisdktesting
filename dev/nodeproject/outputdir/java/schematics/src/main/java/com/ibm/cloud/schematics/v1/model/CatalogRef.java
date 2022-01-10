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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the software template that you chose from the IBM Cloud catalog. This information is returned for
 * IBM Cloud catalog offerings only.
 */
public class CatalogRef extends GenericModel {

  @SerializedName("dry_run")
  protected Boolean dryRun;
  @SerializedName("owning_account")
  protected String owningAccount;
  @SerializedName("item_icon_url")
  protected String itemIconUrl;
  @SerializedName("item_id")
  protected String itemId;
  @SerializedName("item_name")
  protected String itemName;
  @SerializedName("item_readme_url")
  protected String itemReadmeUrl;
  @SerializedName("item_url")
  protected String itemUrl;
  @SerializedName("launch_url")
  protected String launchUrl;
  @SerializedName("offering_version")
  protected String offeringVersion;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean dryRun;
    private String owningAccount;
    private String itemIconUrl;
    private String itemId;
    private String itemName;
    private String itemReadmeUrl;
    private String itemUrl;
    private String launchUrl;
    private String offeringVersion;

    private Builder(CatalogRef catalogRef) {
      this.dryRun = catalogRef.dryRun;
      this.owningAccount = catalogRef.owningAccount;
      this.itemIconUrl = catalogRef.itemIconUrl;
      this.itemId = catalogRef.itemId;
      this.itemName = catalogRef.itemName;
      this.itemReadmeUrl = catalogRef.itemReadmeUrl;
      this.itemUrl = catalogRef.itemUrl;
      this.launchUrl = catalogRef.launchUrl;
      this.offeringVersion = catalogRef.offeringVersion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CatalogRef.
     *
     * @return the new CatalogRef instance
     */
    public CatalogRef build() {
      return new CatalogRef(this);
    }

    /**
     * Set the dryRun.
     *
     * @param dryRun the dryRun
     * @return the CatalogRef builder
     */
    public Builder dryRun(Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
    }

    /**
     * Set the owningAccount.
     *
     * @param owningAccount the owningAccount
     * @return the CatalogRef builder
     */
    public Builder owningAccount(String owningAccount) {
      this.owningAccount = owningAccount;
      return this;
    }

    /**
     * Set the itemIconUrl.
     *
     * @param itemIconUrl the itemIconUrl
     * @return the CatalogRef builder
     */
    public Builder itemIconUrl(String itemIconUrl) {
      this.itemIconUrl = itemIconUrl;
      return this;
    }

    /**
     * Set the itemId.
     *
     * @param itemId the itemId
     * @return the CatalogRef builder
     */
    public Builder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     * Set the itemName.
     *
     * @param itemName the itemName
     * @return the CatalogRef builder
     */
    public Builder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     * Set the itemReadmeUrl.
     *
     * @param itemReadmeUrl the itemReadmeUrl
     * @return the CatalogRef builder
     */
    public Builder itemReadmeUrl(String itemReadmeUrl) {
      this.itemReadmeUrl = itemReadmeUrl;
      return this;
    }

    /**
     * Set the itemUrl.
     *
     * @param itemUrl the itemUrl
     * @return the CatalogRef builder
     */
    public Builder itemUrl(String itemUrl) {
      this.itemUrl = itemUrl;
      return this;
    }

    /**
     * Set the launchUrl.
     *
     * @param launchUrl the launchUrl
     * @return the CatalogRef builder
     */
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }

    /**
     * Set the offeringVersion.
     *
     * @param offeringVersion the offeringVersion
     * @return the CatalogRef builder
     */
    public Builder offeringVersion(String offeringVersion) {
      this.offeringVersion = offeringVersion;
      return this;
    }
  }

  protected CatalogRef(Builder builder) {
    dryRun = builder.dryRun;
    owningAccount = builder.owningAccount;
    itemIconUrl = builder.itemIconUrl;
    itemId = builder.itemId;
    itemName = builder.itemName;
    itemReadmeUrl = builder.itemReadmeUrl;
    itemUrl = builder.itemUrl;
    launchUrl = builder.launchUrl;
    offeringVersion = builder.offeringVersion;
  }

  /**
   * New builder.
   *
   * @return a CatalogRef builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dryRun.
   *
   * Dry run.
   *
   * @return the dryRun
   */
  public Boolean dryRun() {
    return dryRun;
  }

  /**
   * Gets the owningAccount.
   *
   * Owning account ID of the catalog.
   *
   * @return the owningAccount
   */
  public String owningAccount() {
    return owningAccount;
  }

  /**
   * Gets the itemIconUrl.
   *
   * The URL to the icon of the software template in the IBM Cloud catalog.
   *
   * @return the itemIconUrl
   */
  public String itemIconUrl() {
    return itemIconUrl;
  }

  /**
   * Gets the itemId.
   *
   * The ID of the software template that you chose to install from the IBM Cloud catalog. This software is provisioned
   * with Schematics.
   *
   * @return the itemId
   */
  public String itemId() {
    return itemId;
  }

  /**
   * Gets the itemName.
   *
   * The name of the software that you chose to install from the IBM Cloud catalog.
   *
   * @return the itemName
   */
  public String itemName() {
    return itemName;
  }

  /**
   * Gets the itemReadmeUrl.
   *
   * The URL to the readme file of the software template in the IBM Cloud catalog.
   *
   * @return the itemReadmeUrl
   */
  public String itemReadmeUrl() {
    return itemReadmeUrl;
  }

  /**
   * Gets the itemUrl.
   *
   * The URL to the software template in the IBM Cloud catalog.
   *
   * @return the itemUrl
   */
  public String itemUrl() {
    return itemUrl;
  }

  /**
   * Gets the launchUrl.
   *
   * The URL to the dashboard to access your software.
   *
   * @return the launchUrl
   */
  public String launchUrl() {
    return launchUrl;
  }

  /**
   * Gets the offeringVersion.
   *
   * The version of the software template that you chose to install from the IBM Cloud catalog.
   *
   * @return the offeringVersion
   */
  public String offeringVersion() {
    return offeringVersion;
  }
}

