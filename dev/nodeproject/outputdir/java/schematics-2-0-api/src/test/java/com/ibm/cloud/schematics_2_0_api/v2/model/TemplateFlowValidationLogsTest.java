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

import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDataValidationStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowValidationLogs;
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
 * Unit test class for the TemplateFlowValidationLogs model.
 */
public class TemplateFlowValidationLogsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateFlowValidationLogs() throws Throwable {
    TemplateFlowDataValidationStatus templateFlowDataValidationStatusModel = new TemplateFlowDataValidationStatus.Builder()
      .logLevel("info")
      .varName("testString")
      .varStatus("testString")
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDataValidationStatusModel.getLogLevel(), "info");
    assertEquals(templateFlowDataValidationStatusModel.getVarName(), "testString");
    assertEquals(templateFlowDataValidationStatusModel.getVarStatus(), "testString");
    assertEquals(templateFlowDataValidationStatusModel.get("foo"), "testString");

    TemplateFlowValidationLogs templateFlowValidationLogsModel = new TemplateFlowValidationLogs.Builder()
      .flowIndex(Long.valueOf("26"))
      .inputsStatus(new java.util.ArrayList<TemplateFlowDataValidationStatus>(java.util.Arrays.asList(templateFlowDataValidationStatusModel)))
      .outputsStatus(new java.util.ArrayList<TemplateFlowDataValidationStatus>(java.util.Arrays.asList(templateFlowDataValidationStatusModel)))
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowValidationLogsModel.getFlowIndex(), Long.valueOf("26"));
    assertEquals(templateFlowValidationLogsModel.getInputsStatus(), new java.util.ArrayList<TemplateFlowDataValidationStatus>(java.util.Arrays.asList(templateFlowDataValidationStatusModel)));
    assertEquals(templateFlowValidationLogsModel.getOutputsStatus(), new java.util.ArrayList<TemplateFlowDataValidationStatus>(java.util.Arrays.asList(templateFlowDataValidationStatusModel)));
    assertEquals(templateFlowValidationLogsModel.get("foo"), "testString");

    String json = TestUtilities.serialize(templateFlowValidationLogsModel);

    TemplateFlowValidationLogs templateFlowValidationLogsModelNew = TestUtilities.deserialize(json, TemplateFlowValidationLogs.class);
    assertTrue(templateFlowValidationLogsModelNew instanceof TemplateFlowValidationLogs);
    assertEquals(templateFlowValidationLogsModelNew.getFlowIndex(), Long.valueOf("26"));
    assertEquals(templateFlowValidationLogsModelNew.get("foo"), "testString");
  }
}