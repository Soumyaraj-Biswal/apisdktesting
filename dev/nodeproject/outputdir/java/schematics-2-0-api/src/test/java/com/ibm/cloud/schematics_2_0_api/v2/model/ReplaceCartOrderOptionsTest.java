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

import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrder;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.ItemSKU;
import com.ibm.cloud.schematics_2_0_api.v2.model.OrderItemConfiguration;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.SKUUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceMappingRule;
import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.TargetRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceCartOrderOptions model.
 */
public class ReplaceCartOrderOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceCartOrderOptions() throws Throwable {
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .add("foo", "testString")
      .build();
    assertEquals(variableMetadataModel.getType(), "boolean");
    assertEquals(variableMetadataModel.getAliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getDescription(), "testString");
    assertEquals(variableMetadataModel.getDefaultValue(), "testString");
    assertEquals(variableMetadataModel.isSecure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isImmutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isHidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.getOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getMinValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMinLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMatches(), "testString");
    assertEquals(variableMetadataModel.getPosition(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getGroupBy(), "testString");
    assertEquals(variableMetadataModel.getSource(), "testString");
    assertEquals(variableMetadataModel.get("foo"), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .add("foo", "testString")
      .build();
    assertEquals(variableDataModel.getName(), "testString");
    assertEquals(variableDataModel.getValue(), "testString");
    assertEquals(variableDataModel.getMetadata(), variableMetadataModel);
    assertEquals(variableDataModel.get("foo"), "testString");

    TargetRequest targetRequestModel = new TargetRequest.Builder()
      .clusterId("testString")
      .clusterName("testString")
      .entitlementKey(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .add("foo", "testString")
      .build();
    assertEquals(targetRequestModel.getClusterId(), "testString");
    assertEquals(targetRequestModel.getClusterName(), "testString");
    assertEquals(targetRequestModel.getEntitlementKey(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(targetRequestModel.getNamespace(), "testString");
    assertEquals(targetRequestModel.getRegion(), "testString");
    assertEquals(targetRequestModel.getResourceGroupId(), "testString");
    assertEquals(targetRequestModel.get("foo"), "testString");

    ServiceMappingRule serviceMappingRuleModel = new ServiceMappingRule.Builder()
      .type("testString")
      .inputParamName("testString")
      .outputParamName("testString")
      .add("foo", "testString")
      .build();
    assertEquals(serviceMappingRuleModel.getType(), "testString");
    assertEquals(serviceMappingRuleModel.getInputParamName(), "testString");
    assertEquals(serviceMappingRuleModel.getOutputParamName(), "testString");
    assertEquals(serviceMappingRuleModel.get("foo"), "testString");

    ServiceVariableData serviceVariableDataModel = new ServiceVariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .mapping(new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)))
      .add("foo", "testString")
      .build();
    assertEquals(serviceVariableDataModel.getName(), "testString");
    assertEquals(serviceVariableDataModel.getValue(), "testString");
    assertEquals(serviceVariableDataModel.getMetadata(), variableMetadataModel);
    assertEquals(serviceVariableDataModel.getMapping(), new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)));
    assertEquals(serviceVariableDataModel.get("foo"), "testString");

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(systemLockModel.isSysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.getSysLockedBy(), "testString");
    assertEquals(systemLockModel.getSysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(systemLockModel.get("foo"), "testString");

    SKUUserState skuUserStateModel = new SKUUserState.Builder()
      .state("testString")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(skuUserStateModel.getState(), "testString");
    assertEquals(skuUserStateModel.getSetBy(), "testString");
    assertEquals(skuUserStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(skuUserStateModel.get("foo"), "testString");

    ItemSKU itemSkuModel = new ItemSKU.Builder()
      .skuId("testString")
      .skuType("testString")
      .skuSysLock(systemLockModel)
      .skuUserState(skuUserStateModel)
      .add("foo", "testString")
      .build();
    assertEquals(itemSkuModel.getSkuId(), "testString");
    assertEquals(itemSkuModel.getSkuType(), "testString");
    assertEquals(itemSkuModel.getSkuSysLock(), systemLockModel);
    assertEquals(itemSkuModel.getSkuUserState(), skuUserStateModel);
    assertEquals(itemSkuModel.get("foo"), "testString");

    OrderItemConfiguration orderItemConfigurationModel = new OrderItemConfiguration.Builder()
      .name("AWS Satellite")
      .description("Create satellite location in AWS")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .target(targetRequestModel)
      .operation("install")
      .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
      .catalogId("testString")
      .offeringId("testString")
      .owningAccount("testString")
      .owningAccountCrn("testString")
      .offeringKindId("testString")
      .offeringTargetKind("testString")
      .offeringVersionId("testString")
      .offeringKind("testString")
      .offeringFulfilmentKind("testString")
      .offeringVersion("testString")
      .offeringProvisionerUrl("testString")
      .offeringProvisionerSsh("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .itemSku(itemSkuModel)
      .add("foo", "testString")
      .build();
    assertEquals(orderItemConfigurationModel.getName(), "AWS Satellite");
    assertEquals(orderItemConfigurationModel.getDescription(), "Create satellite location in AWS");
    assertEquals(orderItemConfigurationModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.getTarget(), targetRequestModel);
    assertEquals(orderItemConfigurationModel.getOperation(), "install");
    assertEquals(orderItemConfigurationModel.getServiceData(), new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)));
    assertEquals(orderItemConfigurationModel.getCatalogId(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingId(), "testString");
    assertEquals(orderItemConfigurationModel.getOwningAccount(), "testString");
    assertEquals(orderItemConfigurationModel.getOwningAccountCrn(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingKindId(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingTargetKind(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingVersionId(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingKind(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingFulfilmentKind(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingVersion(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingProvisionerUrl(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingProvisionerSsh(), "testString");
    assertEquals(orderItemConfigurationModel.getOfferingProvisionerWorkingDirectory(), "testString");
    assertEquals(orderItemConfigurationModel.getItemSku(), itemSkuModel);
    assertEquals(orderItemConfigurationModel.get("foo"), "testString");

    CartOrderUserState cartOrderUserStateModel = new CartOrderUserState.Builder()
      .state("Order_Create_Init")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(cartOrderUserStateModel.getState(), "Order_Create_Init");
    assertEquals(cartOrderUserStateModel.getSetBy(), "testString");
    assertEquals(cartOrderUserStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(cartOrderUserStateModel.get("foo"), "testString");

    CartOrderLiteState cartOrderLiteStateModel = new CartOrderLiteState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .add("foo", "testString")
      .build();
    assertEquals(cartOrderLiteStateModel.getStatusCode(), "normal");
    assertEquals(cartOrderLiteStateModel.getStatusMessage(), "testString");
    assertEquals(cartOrderLiteStateModel.get("foo"), "testString");

    CartOrder cartOrderModel = new CartOrder.Builder()
      .name("MySatelliteLocation")
      .description("Creates satellite location in AWS")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cartItems(new java.util.ArrayList<OrderItemConfiguration>(java.util.Arrays.asList(orderItemConfigurationModel)))
      .serviceName("SatelliteLocation")
      .resourceGroup("testString")
      .location("us-south")
      .userState(cartOrderUserStateModel)
      .sysLock(systemLockModel)
      .state(cartOrderLiteStateModel)
      .add("foo", "testString")
      .build();
    assertEquals(cartOrderModel.getName(), "MySatelliteLocation");
    assertEquals(cartOrderModel.getDescription(), "Creates satellite location in AWS");
    assertEquals(cartOrderModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(cartOrderModel.getCartItems(), new java.util.ArrayList<OrderItemConfiguration>(java.util.Arrays.asList(orderItemConfigurationModel)));
    assertEquals(cartOrderModel.getServiceName(), "SatelliteLocation");
    assertEquals(cartOrderModel.getResourceGroup(), "testString");
    assertEquals(cartOrderModel.getLocation(), "us-south");
    assertEquals(cartOrderModel.getUserState(), cartOrderUserStateModel);
    assertEquals(cartOrderModel.getSysLock(), systemLockModel);
    assertEquals(cartOrderModel.getState(), cartOrderLiteStateModel);
    assertEquals(cartOrderModel.get("foo"), "testString");

    ReplaceCartOrderOptions replaceCartOrderOptionsModel = new ReplaceCartOrderOptions.Builder()
      .orderId("testString")
      .operation("testString")
      .cartOrder(cartOrderModel)
      .profile("ids")
      .build();
    assertEquals(replaceCartOrderOptionsModel.orderId(), "testString");
    assertEquals(replaceCartOrderOptionsModel.operation(), "testString");
    assertEquals(replaceCartOrderOptionsModel.cartOrder(), cartOrderModel);
    assertEquals(replaceCartOrderOptionsModel.profile(), "ids");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceCartOrderOptionsError() throws Throwable {
    new ReplaceCartOrderOptions.Builder().build();
  }

}