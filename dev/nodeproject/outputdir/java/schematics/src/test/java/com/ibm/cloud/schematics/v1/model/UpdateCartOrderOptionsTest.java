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

import com.ibm.cloud.schematics.v1.model.ServiceMappingRule;
import com.ibm.cloud.schematics.v1.model.ServiceVariableData;
import com.ibm.cloud.schematics.v1.model.TargetRequest;
import com.ibm.cloud.schematics.v1.model.UpdateCartOrderOptions;
import com.ibm.cloud.schematics.v1.model.UpdateOrderItemConfiguration;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateCartOrderOptions model.
 */
public class UpdateCartOrderOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateCartOrderOptions() throws Throwable {
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

    UpdateOrderItemConfiguration updateOrderItemConfigurationModel = new UpdateOrderItemConfiguration.Builder()
      .name("AWS Satellite")
      .description("Create satellite location in AWS")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .target(targetRequestModel)
      .operation("install")
      .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
      .build();
    assertEquals(updateOrderItemConfigurationModel.name(), "AWS Satellite");
    assertEquals(updateOrderItemConfigurationModel.description(), "Create satellite location in AWS");
    assertEquals(updateOrderItemConfigurationModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.target(), targetRequestModel);
    assertEquals(updateOrderItemConfigurationModel.operation(), "install");
    assertEquals(updateOrderItemConfigurationModel.serviceData(), new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)));

    UpdateCartOrderOptions updateCartOrderOptionsModel = new UpdateCartOrderOptions.Builder()
      .orderId("testString")
      .name("MySatelliteLocation")
      .description("Creates satellite location in AWS")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cartItems(new java.util.ArrayList<UpdateOrderItemConfiguration>(java.util.Arrays.asList(updateOrderItemConfigurationModel)))
      .profile("ids")
      .build();
    assertEquals(updateCartOrderOptionsModel.orderId(), "testString");
    assertEquals(updateCartOrderOptionsModel.name(), "MySatelliteLocation");
    assertEquals(updateCartOrderOptionsModel.description(), "Creates satellite location in AWS");
    assertEquals(updateCartOrderOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(updateCartOrderOptionsModel.cartItems(), new java.util.ArrayList<UpdateOrderItemConfiguration>(java.util.Arrays.asList(updateOrderItemConfigurationModel)));
    assertEquals(updateCartOrderOptionsModel.profile(), "ids");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCartOrderOptionsError() throws Throwable {
    new UpdateCartOrderOptions.Builder().build();
  }

}