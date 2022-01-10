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

import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateCommand;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionSimpleFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionTemplateOperation;
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
 * Unit test class for the TemplateFlowDefinitionSimpleFlow model.
 */
public class TemplateFlowDefinitionSimpleFlowTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateFlowDefinitionSimpleFlow() throws Throwable {
    TemplateCommand templateCommandModel = new TemplateCommand.Builder()
      .command("workspace_plan")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(templateCommandModel.getCommand(), "workspace_plan");
    assertEquals(templateCommandModel.getCommandOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(templateCommandModel.get("foo"), "testString");

    TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperationModel = new TemplateFlowDefinitionTemplateOperation.Builder()
      .preCondition("testString")
      .templateId("testString")
      .overrideCommand(templateCommandModel)
      .postCondition("testString")
      .onError("testString")
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDefinitionTemplateOperationModel.getPreCondition(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getTemplateId(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getOverrideCommand(), templateCommandModel);
    assertEquals(templateFlowDefinitionTemplateOperationModel.getPostCondition(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getOnError(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.get("foo"), "testString");

    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModel = new TemplateFlowDefinitionSimpleFlow.Builder()
      .index(Long.valueOf("26"))
      .control("do")
      .templateOperation(templateFlowDefinitionTemplateOperationModel)
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDefinitionSimpleFlowModel.getIndex(), Long.valueOf("26"));
    assertEquals(templateFlowDefinitionSimpleFlowModel.getControl(), "do");
    assertEquals(templateFlowDefinitionSimpleFlowModel.getTemplateOperation(), templateFlowDefinitionTemplateOperationModel);
    assertEquals(templateFlowDefinitionSimpleFlowModel.get("foo"), "testString");

    String json = TestUtilities.serialize(templateFlowDefinitionSimpleFlowModel);

    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModelNew = TestUtilities.deserialize(json, TemplateFlowDefinitionSimpleFlow.class);
    assertTrue(templateFlowDefinitionSimpleFlowModelNew instanceof TemplateFlowDefinitionSimpleFlow);
    assertEquals(templateFlowDefinitionSimpleFlowModelNew.getIndex(), Long.valueOf("26"));
    assertEquals(templateFlowDefinitionSimpleFlowModelNew.getControl(), "do");
    assertEquals(templateFlowDefinitionSimpleFlowModelNew.getTemplateOperation().toString(), templateFlowDefinitionTemplateOperationModel.toString());
    assertEquals(templateFlowDefinitionSimpleFlowModelNew.get("foo"), "testString");
  }
}