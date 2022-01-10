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
 * The createCartOrder options.
 */
public class CreateCartOrderOptions extends GenericModel {

  protected CartOrder cartOrder;

  /**
   * Builder.
   */
  public static class Builder {
    private CartOrder cartOrder;

    private Builder(CreateCartOrderOptions createCartOrderOptions) {
      this.cartOrder = createCartOrderOptions.cartOrder;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cartOrder the cartOrder
     */
    public Builder(CartOrder cartOrder) {
      this.cartOrder = cartOrder;
    }

    /**
     * Builds a CreateCartOrderOptions.
     *
     * @return the new CreateCartOrderOptions instance
     */
    public CreateCartOrderOptions build() {
      return new CreateCartOrderOptions(this);
    }

    /**
     * Set the cartOrder.
     *
     * @param cartOrder the cartOrder
     * @return the CreateCartOrderOptions builder
     */
    public Builder cartOrder(CartOrder cartOrder) {
      this.cartOrder = cartOrder;
      return this;
    }
  }

  protected CreateCartOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cartOrder,
      "cartOrder cannot be null");
    cartOrder = builder.cartOrder;
  }

  /**
   * New builder.
   *
   * @return a CreateCartOrderOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cartOrder.
   *
   * Create fulfilment job order for the cart.
   *
   * @return the cartOrder
   */
  public CartOrder cartOrder() {
    return cartOrder;
  }
}

