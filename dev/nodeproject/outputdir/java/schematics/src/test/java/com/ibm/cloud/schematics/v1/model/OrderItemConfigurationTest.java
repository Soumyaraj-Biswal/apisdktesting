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

import com.ibm.cloud.schematics.v1.model.ItemSKU;
import com.ibm.cloud.schematics.v1.model.OrderItemConfiguration;
import com.ibm.cloud.schematics.v1.model.SKUUserState;
import com.ibm.cloud.schematics.v1.model.ServiceMappingRule;
import com.ibm.cloud.schematics.v1.model.ServiceVariableData;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetRequest;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
 * Unit test class for the OrderItemConfiguration model.
 */
public class OrderItemConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOrderItemConfiguration() throws Throwable {
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
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    TargetRequest targetRequestModel = new TargetRequest.Builder()
      .clusterId("testString")
      .clusterName("testString")
      .entitlementKey(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .build();
    assertEquals(targetRequestModel.clusterId(), "testString");
    assertEquals(targetRequestModel.clusterName(), "testString");
    assertEquals(targetRequestModel.entitlementKey(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(targetRequestModel.namespace(), "testString");
    assertEquals(targetRequestModel.region(), "testString");
    assertEquals(targetRequestModel.resourceGroupId(), "testString");

    ServiceMappingRule serviceMappingRuleModel = new ServiceMappingRule.Builder()
      .type("testString")
      .inputParamName("testString")
      .outputParamName("testString")
      .build();
    assertEquals(serviceMappingRuleModel.type(), "testString");
    assertEquals(serviceMappingRuleModel.inputParamName(), "testString");
    assertEquals(serviceMappingRuleModel.outputParamName(), "testString");

    ServiceVariableData serviceVariableDataModel = new ServiceVariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .mapping(new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)))
      .build();
    assertEquals(serviceVariableDataModel.name(), "testString");
    assertEquals(serviceVariableDataModel.value(), "testString");
    assertEquals(serviceVariableDataModel.metadata(), variableMetadataModel);
    assertEquals(serviceVariableDataModel.mapping(), new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)));

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(systemLockModel.sysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.sysLockedBy(), "testString");
    assertEquals(systemLockModel.sysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    SKUUserState skuUserStateModel = new SKUUserState.Builder()
      .state("testString")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(skuUserStateModel.state(), "testString");
    assertEquals(skuUserStateModel.setBy(), "testString");
    assertEquals(skuUserStateModel.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    ItemSKU itemSkuModel = new ItemSKU.Builder()
      .skuId("testString")
      .skuType("testString")
      .skuSysLock(systemLockModel)
      .skuUserState(skuUserStateModel)
      .build();
    assertEquals(itemSkuModel.skuId(), "testString");
    assertEquals(itemSkuModel.skuType(), "testString");
    assertEquals(itemSkuModel.skuSysLock(), systemLockModel);
    assertEquals(itemSkuModel.skuUserState(), skuUserStateModel);

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
      .build();
    assertEquals(orderItemConfigurationModel.name(), "AWS Satellite");
    assertEquals(orderItemConfigurationModel.description(), "Create satellite location in AWS");
    assertEquals(orderItemConfigurationModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(orderItemConfigurationModel.target(), targetRequestModel);
    assertEquals(orderItemConfigurationModel.operation(), "install");
    assertEquals(orderItemConfigurationModel.serviceData(), new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)));
    assertEquals(orderItemConfigurationModel.catalogId(), "testString");
    assertEquals(orderItemConfigurationModel.offeringId(), "testString");
    assertEquals(orderItemConfigurationModel.owningAccount(), "testString");
    assertEquals(orderItemConfigurationModel.owningAccountCrn(), "testString");
    assertEquals(orderItemConfigurationModel.offeringKindId(), "testString");
    assertEquals(orderItemConfigurationModel.offeringTargetKind(), "testString");
    assertEquals(orderItemConfigurationModel.offeringVersionId(), "testString");
    assertEquals(orderItemConfigurationModel.offeringKind(), "testString");
    assertEquals(orderItemConfigurationModel.offeringFulfilmentKind(), "testString");
    assertEquals(orderItemConfigurationModel.offeringVersion(), "testString");
    assertEquals(orderItemConfigurationModel.offeringProvisionerUrl(), "testString");
    assertEquals(orderItemConfigurationModel.offeringProvisionerSsh(), "testString");
    assertEquals(orderItemConfigurationModel.offeringProvisionerWorkingDirectory(), "testString");
    assertEquals(orderItemConfigurationModel.itemSku(), itemSkuModel);

    String json = TestUtilities.serialize(orderItemConfigurationModel);

    OrderItemConfiguration orderItemConfigurationModelNew = TestUtilities.deserialize(json, OrderItemConfiguration.class);
    assertTrue(orderItemConfigurationModelNew instanceof OrderItemConfiguration);
    assertEquals(orderItemConfigurationModelNew.name(), "AWS Satellite");
    assertEquals(orderItemConfigurationModelNew.description(), "Create satellite location in AWS");
    assertEquals(orderItemConfigurationModelNew.target().toString(), targetRequestModel.toString());
    assertEquals(orderItemConfigurationModelNew.operation(), "install");
    assertEquals(orderItemConfigurationModelNew.catalogId(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringId(), "testString");
    assertEquals(orderItemConfigurationModelNew.owningAccount(), "testString");
    assertEquals(orderItemConfigurationModelNew.owningAccountCrn(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringKindId(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringTargetKind(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringVersionId(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringKind(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringFulfilmentKind(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringVersion(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringProvisionerUrl(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringProvisionerSsh(), "testString");
    assertEquals(orderItemConfigurationModelNew.offeringProvisionerWorkingDirectory(), "testString");
    assertEquals(orderItemConfigurationModelNew.itemSku().toString(), itemSkuModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testOrderItemConfigurationError() throws Throwable {
    new OrderItemConfiguration.Builder().build();
  }

}