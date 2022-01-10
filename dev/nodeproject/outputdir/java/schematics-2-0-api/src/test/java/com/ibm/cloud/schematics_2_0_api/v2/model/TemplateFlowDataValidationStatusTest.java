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
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateFlowDataValidationStatus model.
 */
public class TemplateFlowDataValidationStatusTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateFlowDataValidationStatus() throws Throwable {
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

    String json = TestUtilities.serialize(templateFlowDataValidationStatusModel);

    TemplateFlowDataValidationStatus templateFlowDataValidationStatusModelNew = TestUtilities.deserialize(json, TemplateFlowDataValidationStatus.class);
    assertTrue(templateFlowDataValidationStatusModelNew instanceof TemplateFlowDataValidationStatus);
    assertEquals(templateFlowDataValidationStatusModelNew.getLogLevel(), "info");
    assertEquals(templateFlowDataValidationStatusModelNew.getVarName(), "testString");
    assertEquals(templateFlowDataValidationStatusModelNew.getVarStatus(), "testString");
    assertEquals(templateFlowDataValidationStatusModelNew.get("foo"), "testString");
  }
}