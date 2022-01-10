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
 * Store Keeping Unit for the Item in the Cart order.
 */
public class ItemSKU extends GenericModel {

  @SerializedName("sku_id")
  protected String skuId;
  @SerializedName("sku_type")
  protected String skuType;
  @SerializedName("sku_sys_lock")
  protected SystemLock skuSysLock;
  @SerializedName("sku_user_state")
  protected SKUUserState skuUserState;

  /**
   * Builder.
   */
  public static class Builder {
    private String skuId;
    private String skuType;
    private SystemLock skuSysLock;
    private SKUUserState skuUserState;

    private Builder(ItemSKU itemSku) {
      this.skuId = itemSku.skuId;
      this.skuType = itemSku.skuType;
      this.skuSysLock = itemSku.skuSysLock;
      this.skuUserState = itemSku.skuUserState;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param skuId the skuId
     * @param skuType the skuType
     */
    public Builder(String skuId, String skuType) {
      this.skuId = skuId;
      this.skuType = skuType;
    }

    /**
     * Builds a ItemSKU.
     *
     * @return the new ItemSKU instance
     */
    public ItemSKU build() {
      return new ItemSKU(this);
    }

    /**
     * Set the skuId.
     *
     * @param skuId the skuId
     * @return the ItemSKU builder
     */
    public Builder skuId(String skuId) {
      this.skuId = skuId;
      return this;
    }

    /**
     * Set the skuType.
     *
     * @param skuType the skuType
     * @return the ItemSKU builder
     */
    public Builder skuType(String skuType) {
      this.skuType = skuType;
      return this;
    }

    /**
     * Set the skuSysLock.
     *
     * @param skuSysLock the skuSysLock
     * @return the ItemSKU builder
     */
    public Builder skuSysLock(SystemLock skuSysLock) {
      this.skuSysLock = skuSysLock;
      return this;
    }

    /**
     * Set the skuUserState.
     *
     * @param skuUserState the skuUserState
     * @return the ItemSKU builder
     */
    public Builder skuUserState(SKUUserState skuUserState) {
      this.skuUserState = skuUserState;
      return this;
    }
  }

  protected ItemSKU(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.skuId,
      "skuId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.skuType,
      "skuType cannot be null");
    skuId = builder.skuId;
    skuType = builder.skuType;
    skuSysLock = builder.skuSysLock;
    skuUserState = builder.skuUserState;
  }

  /**
   * New builder.
   *
   * @return a ItemSKU builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the skuId.
   *
   * The ID of the underlying SKU object.
   *
   * @return the skuId
   */
  public String skuId() {
    return skuId;
  }

  /**
   * Gets the skuType.
   *
   * SKU Type - Workspace / Ansible.
   *
   * @return the skuType
   */
  public String skuType() {
    return skuType;
  }

  /**
   * Gets the skuSysLock.
   *
   * System lock status.
   *
   * @return the skuSysLock
   */
  public SystemLock skuSysLock() {
    return skuSysLock;
  }

  /**
   * Gets the skuUserState.
   *
   * Status of the underlying schematics objects used to fullfil CartOrder.
   *
   * @return the skuUserState
   */
  public SKUUserState skuUserState() {
    return skuUserState;
  }
}

