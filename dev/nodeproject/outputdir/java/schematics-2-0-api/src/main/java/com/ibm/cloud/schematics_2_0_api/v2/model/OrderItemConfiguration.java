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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Catalog item configuration in the Cart order.
 */
public class OrderItemConfiguration extends DynamicModel<Object> {

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

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("settings")
  protected List<VariableData> settings;
  @SerializedName("outputs")
  protected List<VariableData> outputs;
  @SerializedName("target")
  protected TargetRequest target;
  @SerializedName("operation")
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

  public OrderItemConfiguration() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

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
      this.dynamicProperties = orderItemConfiguration.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the OrderItemConfiguration builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected OrderItemConfiguration(Builder builder) {
    super(new TypeToken<Object>() { });
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
    this.setProperties(builder.dynamicProperties);
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
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
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
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the inputs.
   *
   * Input configuration for the order.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<VariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the settings.
   *
   * Input environment variables used by order.
   *
   * @return the settings
   */
  public List<VariableData> getSettings() {
    return this.settings;
  }

  /**
   * Sets the settings.
   *
   * @param settings the new settings
   */
  public void setSettings(final List<VariableData> settings) {
    this.settings = settings;
  }

  /**
   * Gets the outputs.
   *
   * Output configuration of the order.
   *
   * @return the outputs
   */
  public List<VariableData> getOutputs() {
    return this.outputs;
  }

  /**
   * Sets the outputs.
   *
   * @param outputs the new outputs
   */
  public void setOutputs(final List<VariableData> outputs) {
    this.outputs = outputs;
  }

  /**
   * Gets the target.
   *
   * Target cluster details to perform POC operation.
   *
   * @return the target
   */
  public TargetRequest getTarget() {
    return this.target;
  }

  /**
   * Sets the target.
   *
   * @param target the new target
   */
  public void setTarget(final TargetRequest target) {
    this.target = target;
  }

  /**
   * Gets the operation.
   *
   * Name of the fulfilment job operations.
   *
   * @return the operation
   */
  public String getOperation() {
    return this.operation;
  }

  /**
   * Sets the operation.
   *
   * @param operation the new operation
   */
  public void setOperation(final String operation) {
    this.operation = operation;
  }

  /**
   * Gets the serviceData.
   *
   * Additional service input data (for extensibility).
   *
   * @return the serviceData
   */
  public List<ServiceVariableData> getServiceData() {
    return this.serviceData;
  }

  /**
   * Sets the serviceData.
   *
   * @param serviceData the new serviceData
   */
  public void setServiceData(final List<ServiceVariableData> serviceData) {
    this.serviceData = serviceData;
  }

  /**
   * Gets the catalogId.
   *
   * Catalog Id.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return this.catalogId;
  }

  /**
   * Sets the catalogId.
   *
   * @param catalogId the new catalogId
   */
  public void setCatalogId(final String catalogId) {
    this.catalogId = catalogId;
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
   * Sets the offeringId.
   *
   * @param offeringId the new offeringId
   */
  public void setOfferingId(final String offeringId) {
    this.offeringId = offeringId;
  }

  /**
   * Gets the owningAccount.
   *
   * Account ID where catalog is created.
   *
   * @return the owningAccount
   */
  public String getOwningAccount() {
    return this.owningAccount;
  }

  /**
   * Sets the owningAccount.
   *
   * @param owningAccount the new owningAccount
   */
  public void setOwningAccount(final String owningAccount) {
    this.owningAccount = owningAccount;
  }

  /**
   * Gets the owningAccountCrn.
   *
   * CRN of account where catalog is created.
   *
   * @return the owningAccountCrn
   */
  public String getOwningAccountCrn() {
    return this.owningAccountCrn;
  }

  /**
   * Sets the owningAccountCrn.
   *
   * @param owningAccountCrn the new owningAccountCrn
   */
  public void setOwningAccountCrn(final String owningAccountCrn) {
    this.owningAccountCrn = owningAccountCrn;
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
   * Sets the offeringKindId.
   *
   * @param offeringKindId the new offeringKindId
   */
  public void setOfferingKindId(final String offeringKindId) {
    this.offeringKindId = offeringKindId;
  }

  /**
   * Gets the offeringTargetKind.
   *
   * Offering Target Kind.
   *
   * @return the offeringTargetKind
   */
  public String getOfferingTargetKind() {
    return this.offeringTargetKind;
  }

  /**
   * Sets the offeringTargetKind.
   *
   * @param offeringTargetKind the new offeringTargetKind
   */
  public void setOfferingTargetKind(final String offeringTargetKind) {
    this.offeringTargetKind = offeringTargetKind;
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
   * Sets the offeringVersionId.
   *
   * @param offeringVersionId the new offeringVersionId
   */
  public void setOfferingVersionId(final String offeringVersionId) {
    this.offeringVersionId = offeringVersionId;
  }

  /**
   * Gets the offeringKind.
   *
   * Offering kind.
   *
   * @return the offeringKind
   */
  public String getOfferingKind() {
    return this.offeringKind;
  }

  /**
   * Sets the offeringKind.
   *
   * @param offeringKind the new offeringKind
   */
  public void setOfferingKind(final String offeringKind) {
    this.offeringKind = offeringKind;
  }

  /**
   * Gets the offeringFulfilmentKind.
   *
   * Offering fulfilment kind.
   *
   * @return the offeringFulfilmentKind
   */
  public String getOfferingFulfilmentKind() {
    return this.offeringFulfilmentKind;
  }

  /**
   * Sets the offeringFulfilmentKind.
   *
   * @param offeringFulfilmentKind the new offeringFulfilmentKind
   */
  public void setOfferingFulfilmentKind(final String offeringFulfilmentKind) {
    this.offeringFulfilmentKind = offeringFulfilmentKind;
  }

  /**
   * Gets the offeringVersion.
   *
   * Offering version.
   *
   * @return the offeringVersion
   */
  public String getOfferingVersion() {
    return this.offeringVersion;
  }

  /**
   * Sets the offeringVersion.
   *
   * @param offeringVersion the new offeringVersion
   */
  public void setOfferingVersion(final String offeringVersion) {
    this.offeringVersion = offeringVersion;
  }

  /**
   * Gets the offeringProvisionerUrl.
   *
   * Repo URL where the provisioner can be found.
   *
   * @return the offeringProvisionerUrl
   */
  public String getOfferingProvisionerUrl() {
    return this.offeringProvisionerUrl;
  }

  /**
   * Sets the offeringProvisionerUrl.
   *
   * @param offeringProvisionerUrl the new offeringProvisionerUrl
   */
  public void setOfferingProvisionerUrl(final String offeringProvisionerUrl) {
    this.offeringProvisionerUrl = offeringProvisionerUrl;
  }

  /**
   * Gets the offeringProvisionerSsh.
   *
   * SHA value of Repo URL.
   *
   * @return the offeringProvisionerSsh
   */
  public String getOfferingProvisionerSsh() {
    return this.offeringProvisionerSsh;
  }

  /**
   * Sets the offeringProvisionerSsh.
   *
   * @param offeringProvisionerSsh the new offeringProvisionerSsh
   */
  public void setOfferingProvisionerSsh(final String offeringProvisionerSsh) {
    this.offeringProvisionerSsh = offeringProvisionerSsh;
  }

  /**
   * Gets the offeringProvisionerWorkingDirectory.
   *
   * Root folder name in .tgz file.
   *
   * @return the offeringProvisionerWorkingDirectory
   */
  public String getOfferingProvisionerWorkingDirectory() {
    return this.offeringProvisionerWorkingDirectory;
  }

  /**
   * Sets the offeringProvisionerWorkingDirectory.
   *
   * @param offeringProvisionerWorkingDirectory the new offeringProvisionerWorkingDirectory
   */
  public void setOfferingProvisionerWorkingDirectory(final String offeringProvisionerWorkingDirectory) {
    this.offeringProvisionerWorkingDirectory = offeringProvisionerWorkingDirectory;
  }

  /**
   * Gets the itemSku.
   *
   * Store Keeping Unit for the Item in the Cart order.
   *
   * @return the itemSku
   */
  public ItemSKU getItemSku() {
    return this.itemSku;
  }

  /**
   * Sets the itemSku.
   *
   * @param itemSku the new itemSku
   */
  public void setItemSku(final ItemSKU itemSku) {
    this.itemSku = itemSku;
  }
}
