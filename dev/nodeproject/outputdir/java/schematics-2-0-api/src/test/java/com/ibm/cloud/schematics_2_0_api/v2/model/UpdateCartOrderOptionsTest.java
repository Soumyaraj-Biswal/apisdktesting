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

import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceMappingRule;
import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.TargetRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCartOrder;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateOrderItemConfiguration;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
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

    UpdateOrderItemConfiguration updateOrderItemConfigurationModel = new UpdateOrderItemConfiguration.Builder()
      .name("AWS Satellite")
      .description("Create satellite location in AWS")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .target(targetRequestModel)
      .operation("install")
      .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
      .add("foo", "testString")
      .build();
    assertEquals(updateOrderItemConfigurationModel.getName(), "AWS Satellite");
    assertEquals(updateOrderItemConfigurationModel.getDescription(), "Create satellite location in AWS");
    assertEquals(updateOrderItemConfigurationModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.getTarget(), targetRequestModel);
    assertEquals(updateOrderItemConfigurationModel.getOperation(), "install");
    assertEquals(updateOrderItemConfigurationModel.getServiceData(), new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)));
    assertEquals(updateOrderItemConfigurationModel.get("foo"), "testString");

    UpdateCartOrder updateCartOrderModel = new UpdateCartOrder.Builder()
      .name("MySatelliteLocation")
      .description("Creates satellite location in AWS")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cartItems(new java.util.ArrayList<UpdateOrderItemConfiguration>(java.util.Arrays.asList(updateOrderItemConfigurationModel)))
      .add("foo", "testString")
      .build();
    assertEquals(updateCartOrderModel.getName(), "MySatelliteLocation");
    assertEquals(updateCartOrderModel.getDescription(), "Creates satellite location in AWS");
    assertEquals(updateCartOrderModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(updateCartOrderModel.getCartItems(), new java.util.ArrayList<UpdateOrderItemConfiguration>(java.util.Arrays.asList(updateOrderItemConfigurationModel)));
    assertEquals(updateCartOrderModel.get("foo"), "testString");

    UpdateCartOrderOptions updateCartOrderOptionsModel = new UpdateCartOrderOptions.Builder()
      .orderId("testString")
      .updateCartOrder(updateCartOrderModel)
      .profile("ids")
      .build();
    assertEquals(updateCartOrderOptionsModel.orderId(), "testString");
    assertEquals(updateCartOrderOptionsModel.updateCartOrder(), updateCartOrderModel);
    assertEquals(updateCartOrderOptionsModel.profile(), "ids");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCartOrderOptionsError() throws Throwable {
    new UpdateCartOrderOptions.Builder().build();
  }

}