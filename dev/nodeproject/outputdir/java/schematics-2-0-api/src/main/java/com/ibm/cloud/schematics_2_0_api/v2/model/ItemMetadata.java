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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Variables and operations metadata of the catalog item.  Variable metadata will be fetched from the template in the
 * repo. Operations metadata will be fetched from metadataFileName in the repo.
 */
public class ItemMetadata extends DynamicModel<Object> {

  /**
   * Name of the fulfilment job operations.
   */
  public interface Operations {
    /** install. */
    String INSTALL = "install";
    /** uninstall. */
    String UNINSTALL = "uninstall";
    /** configure. */
    String CONFIGURE = "configure";
    /** operate. */
    String OPERATE = "operate";
    /** dryrun. */
    String DRYRUN = "dryrun";
  }

  @SerializedName("item_id")
  protected String itemId;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("offering_kind_id")
  protected String offeringKindId;
  @SerializedName("offering_version_id")
  protected String offeringVersionId;
  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("operations")
  protected List<String> operations;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("outputs")
  protected List<VariableData> outputs;

  public ItemMetadata() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the itemId.
   *
   * Catalog item Id.
   *
   * @return the itemId
   */
  public String getItemId() {
    return this.itemId;
  }

  /**
   * Gets the offeringId.
   *
   * offering Id.
   *
   * @return the offeringId
   */
  public String getOfferingId() {
    return this.offeringId;
  }

  /**
   * Gets the offeringKindId.
   *
   * Offering kind id.
   *
   * @return the offeringKindId
   */
  public String getOfferingKindId() {
    return this.offeringKindId;
  }

  /**
   * Gets the offeringVersionId.
   *
   * Offering version id.
   *
   * @return the offeringVersionId
   */
  public String getOfferingVersionId() {
    return this.offeringVersionId;
  }

  /**
   * Gets the name.
   *
   * Catalog item name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the description.
   *
   * Catalog item description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Gets the operations.
   *
   * List of supported operation.
   *
   * @return the operations
   */
  public List<String> getOperations() {
    return this.operations;
  }

  /**
   * Gets the inputs.
   *
   * Input variables metadata.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Gets the settings.
   *
   * Input environment variables metadata.
   *
   * @return the settings
   */
  public List<VariableData> getSettings() {
    return this.settings;
  }

  /**
   * Gets the outputs.
   *
   * Output variables metadata.
   *
   * @return the outputs
   */
  public List<VariableData> getOutputs() {
    return this.outputs;
  }
}
