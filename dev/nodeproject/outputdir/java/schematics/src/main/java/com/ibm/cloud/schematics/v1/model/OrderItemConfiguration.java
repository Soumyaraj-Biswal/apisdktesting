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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Catalog item configuration in the Cart order.
 */
public class OrderItemConfiguration extends GenericModel {

  /**
   * Name of the fulfilment job operations.
   */
  public interface Operation {
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

  protected String name;
  protected String description;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected List<VariableData> outputs;
  protected TargetRequest target;
  protected String operation;
  @SerializedName("service_data")
  protected List<ServiceVariableData> serviceData;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("owning_account")
  protected String owningAccount;
  @SerializedName("owning_account_crn")
  protected String owningAccountCrn;
  @SerializedName("offering_kind_id")
  protected String offeringKindId;
  @SerializedName("offering_target_kind")
  protected String offeringTargetKind;
  @SerializedName("offering_version_id")
  protected String offeringVersionId;
  @SerializedName("offering_kind")
  protected String offeringKind;
  @SerializedName("offering_fulfilment_kind")
  protected String offeringFulfilmentKind;
  @SerializedName("offering_version")
  protected String offeringVersion;
  @SerializedName("offering_provisioner_url")
  protected String offeringProvisionerUrl;
  @SerializedName("offering_provisioner_ssh")
  protected String offeringProvisionerSsh;
  @SerializedName("offering_provisioner_working_directory")
  protected String offeringProvisionerWorkingDirectory;
  @SerializedName("item_sku")
  protected ItemSKU itemSku;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private List<VariableData> outputs;
    private TargetRequest target;
    private String operation;
    private List<ServiceVariableData> serviceData;
    private String catalogId;
    private String offeringId;
    private String owningAccount;
    private String owningAccountCrn;
    private String offeringKindId;
    private String offeringTargetKind;
    private String offeringVersionId;
    private String offeringKind;
    private String offeringFulfilmentKind;
    private String offeringVersion;
    private String offeringProvisionerUrl;
    private String offeringProvisionerSsh;
    private String offeringProvisionerWorkingDirectory;
    private ItemSKU itemSku;

    private Builder(OrderItemConfiguration orderItemConfiguration) {
      this.name = orderItemConfiguration.name;
      this.description = orderItemConfiguration.description;
      this.inputs = orderItemConfiguration.inputs;
      this.settings = orderItemConfiguration.settings;
      this.outputs = orderItemConfiguration.outputs;
      this.target = orderItemConfiguration.target;
      this.operation = orderItemConfiguration.operation;
      this.serviceData = orderItemConfiguration.serviceData;
      this.catalogId = orderItemConfiguration.catalogId;
      this.offeringId = orderItemConfiguration.offeringId;
      this.owningAccount = orderItemConfiguration.owningAccount;
      this.owningAccountCrn = orderItemConfiguration.owningAccountCrn;
      this.offeringKindId = orderItemConfiguration.offeringKindId;
      this.offeringTargetKind = orderItemConfiguration.offeringTargetKind;
      this.offeringVersionId = orderItemConfiguration.offeringVersionId;
      this.offeringKind = orderItemConfiguration.offeringKind;
      this.offeringFulfilmentKind = orderItemConfiguration.offeringFulfilmentKind;
      this.offeringVersion = orderItemConfiguration.offeringVersion;
      this.offeringProvisionerUrl = orderItemConfiguration.offeringProvisionerUrl;
      this.offeringProvisionerSsh = orderItemConfiguration.offeringProvisionerSsh;
      this.offeringProvisionerWorkingDirectory = orderItemConfiguration.offeringProvisionerWorkingDirectory;
      this.itemSku = orderItemConfiguration.itemSku;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param offeringId the offeringId
     */
    public Builder(String catalogId, String offeringId) {
      this.catalogId = catalogId;
      this.offeringId = offeringId;
    }

    /**
     * Builds a OrderItemConfiguration.
     *
     * @return the new OrderItemConfiguration instance
     */
    public OrderItemConfiguration build() {
      return new OrderItemConfiguration(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the OrderItemConfiguration builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the OrderItemConfiguration builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the OrderItemConfiguration builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an serviceData to serviceData.
     *
     * @param serviceData the new serviceData
     * @return the OrderItemConfiguration builder
     */
    public Builder addServiceData(ServiceVariableData serviceData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(serviceData,
        "serviceData cannot be null");
      if (this.serviceData == null) {
        this.serviceData = new ArrayList<ServiceVariableData>();
      }
      this.serviceData.add(serviceData);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the OrderItemConfiguration builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the OrderItemConfiguration builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the OrderItemConfiguration builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the OrderItemConfiguration builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the OrderItemConfiguration builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the OrderItemConfiguration builder
     */
    public Builder target(TargetRequest target) {
      this.target = target;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the OrderItemConfiguration builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the serviceData.
     * Existing serviceData will be replaced.
     *
     * @param serviceData the serviceData
     * @return the OrderItemConfiguration builder
     */
    public Builder serviceData(List<ServiceVariableData> serviceData) {
      this.serviceData = serviceData;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the OrderItemConfiguration builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the offeringId.
     *
     * @param offeringId the offeringId
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringId(String offeringId) {
      this.offeringId = offeringId;
      return this;
    }

    /**
     * Set the owningAccount.
     *
     * @param owningAccount the owningAccount
     * @return the OrderItemConfiguration builder
     */
    public Builder owningAccount(String owningAccount) {
      this.owningAccount = owningAccount;
      return this;
    }

    /**
     * Set the owningAccountCrn.
     *
     * @param owningAccountCrn the owningAccountCrn
     * @return the OrderItemConfiguration builder
     */
    public Builder owningAccountCrn(String owningAccountCrn) {
      this.owningAccountCrn = owningAccountCrn;
      return this;
    }

    /**
     * Set the offeringKindId.
     *
     * @param offeringKindId the offeringKindId
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringKindId(String offeringKindId) {
      this.offeringKindId = offeringKindId;
      return this;
    }

    /**
     * Set the offeringTargetKind.
     *
     * @param offeringTargetKind the offeringTargetKind
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringTargetKind(String offeringTargetKind) {
      this.offeringTargetKind = offeringTargetKind;
      return this;
    }

    /**
     * Set the offeringVersionId.
     *
     * @param offeringVersionId the offeringVersionId
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringVersionId(String offeringVersionId) {
      this.offeringVersionId = offeringVersionId;
      return this;
    }

    /**
     * Set the offeringKind.
     *
     * @param offeringKind the offeringKind
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringKind(String offeringKind) {
      this.offeringKind = offeringKind;
      return this;
    }

    /**
     * Set the offeringFulfilmentKind.
     *
     * @param offeringFulfilmentKind the offeringFulfilmentKind
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringFulfilmentKind(String offeringFulfilmentKind) {
      this.offeringFulfilmentKind = offeringFulfilmentKind;
      return this;
    }

    /**
     * Set the offeringVersion.
     *
     * @param offeringVersion the offeringVersion
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringVersion(String offeringVersion) {
      this.offeringVersion = offeringVersion;
      return this;
    }

    /**
     * Set the offeringProvisionerUrl.
     *
     * @param offeringProvisionerUrl the offeringProvisionerUrl
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringProvisionerUrl(String offeringProvisionerUrl) {
      this.offeringProvisionerUrl = offeringProvisionerUrl;
      return this;
    }

    /**
     * Set the offeringProvisionerSsh.
     *
     * @param offeringProvisionerSsh the offeringProvisionerSsh
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringProvisionerSsh(String offeringProvisionerSsh) {
      this.offeringProvisionerSsh = offeringProvisionerSsh;
      return this;
    }

    /**
     * Set the offeringProvisionerWorkingDirectory.
     *
     * @param offeringProvisionerWorkingDirectory the offeringProvisionerWorkingDirectory
     * @return the OrderItemConfiguration builder
     */
    public Builder offeringProvisionerWorkingDirectory(String offeringProvisionerWorkingDirectory) {
      this.offeringProvisionerWorkingDirectory = offeringProvisionerWorkingDirectory;
      return this;
    }

    /**
     * Set the itemSku.
     *
     * @param itemSku the itemSku
     * @return the OrderItemConfiguration builder
     */
    public Builder itemSku(ItemSKU itemSku) {
      this.itemSku = itemSku;
      return this;
    }
  }

  protected OrderItemConfiguration(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.offeringId,
      "offeringId cannot be null");
    name = builder.name;
    description = builder.description;
    inputs = builder.inputs;
    settings = builder.settings;
    outputs = builder.outputs;
    target = builder.target;
    operation = builder.operation;
    serviceData = builder.serviceData;
    catalogId = builder.catalogId;
    offeringId = builder.offeringId;
    owningAccount = builder.owningAccount;
    owningAccountCrn = builder.owningAccountCrn;
    offeringKindId = builder.offeringKindId;
    offeringTargetKind = builder.offeringTargetKind;
    offeringVersionId = builder.offeringVersionId;
    offeringKind = builder.offeringKind;
    offeringFulfilmentKind = builder.offeringFulfilmentKind;
    offeringVersion = builder.offeringVersion;
    offeringProvisionerUrl = builder.offeringProvisionerUrl;
    offeringProvisionerSsh = builder.offeringProvisionerSsh;
    offeringProvisionerWorkingDirectory = builder.offeringProvisionerWorkingDirectory;
    itemSku = builder.itemSku;
  }

  /**
   * New builder.
   *
   * @return a OrderItemConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Catalog item name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Catalog item description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the inputs.
   *
   * Input configuration for the order.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Input environment variables used by order.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the outputs.
   *
   * Output configuration of the order.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the target.
   *
   * Target cluster details to perform POC operation.
   *
   * @return the target
   */
  public TargetRequest target() {
    return target;
  }

  /**
   * Gets the operation.
   *
   * Name of the fulfilment job operations.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the serviceData.
   *
   * Additional service input data (for extensibility).
   *
   * @return the serviceData
   */
  public List<ServiceVariableData> serviceData() {
    return serviceData;
  }

  /**
   * Gets the catalogId.
   *
   * Catalog Id.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the offeringId.
   *
   * offering Id.
   *
   * @return the offeringId
   */
  public String offeringId() {
    return offeringId;
  }

  /**
   * Gets the owningAccount.
   *
   * Account ID where catalog is created.
   *
   * @return the owningAccount
   */
  public String owningAccount() {
    return owningAccount;
  }

  /**
   * Gets the owningAccountCrn.
   *
   * CRN of account where catalog is created.
   *
   * @return the owningAccountCrn
   */
  public String owningAccountCrn() {
    return owningAccountCrn;
  }

  /**
   * Gets the offeringKindId.
   *
   * Offering kind id.
   *
   * @return the offeringKindId
   */
  public String offeringKindId() {
    return offeringKindId;
  }

  /**
   * Gets the offeringTargetKind.
   *
   * Offering Target Kind.
   *
   * @return the offeringTargetKind
   */
  public String offeringTargetKind() {
    return offeringTargetKind;
  }

  /**
   * Gets the offeringVersionId.
   *
   * Offering version id.
   *
   * @return the offeringVersionId
   */
  public String offeringVersionId() {
    return offeringVersionId;
  }

  /**
   * Gets the offeringKind.
   *
   * Offering kind.
   *
   * @return the offeringKind
   */
  public String offeringKind() {
    return offeringKind;
  }

  /**
   * Gets the offeringFulfilmentKind.
   *
   * Offering fulfilment kind.
   *
   * @return the offeringFulfilmentKind
   */
  public String offeringFulfilmentKind() {
    return offeringFulfilmentKind;
  }

  /**
   * Gets the offeringVersion.
   *
   * Offering version.
   *
   * @return the offeringVersion
   */
  public String offeringVersion() {
    return offeringVersion;
  }

  /**
   * Gets the offeringProvisionerUrl.
   *
   * Repo URL where the provisioner can be found.
   *
   * @return the offeringProvisionerUrl
   */
  public String offeringProvisionerUrl() {
    return offeringProvisionerUrl;
  }

  /**
   * Gets the offeringProvisionerSsh.
   *
   * SHA value of Repo URL.
   *
   * @return the offeringProvisionerSsh
   */
  public String offeringProvisionerSsh() {
    return offeringProvisionerSsh;
  }

  /**
   * Gets the offeringProvisionerWorkingDirectory.
   *
   * Root folder name in .tgz file.
   *
   * @return the offeringProvisionerWorkingDirectory
   */
  public String offeringProvisionerWorkingDirectory() {
    return offeringProvisionerWorkingDirectory;
  }

  /**
   * Gets the itemSku.
   *
   * Store Keeping Unit for the Item in the Cart order.
   *
   * @return the itemSku
   */
  public ItemSKU itemSku() {
    return itemSku;
  }
}

