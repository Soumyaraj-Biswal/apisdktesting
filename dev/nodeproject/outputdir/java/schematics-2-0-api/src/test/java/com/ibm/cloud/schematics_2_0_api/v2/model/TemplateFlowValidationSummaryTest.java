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

import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowValidationSummary;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateFlowValidationSummary model.
 */
public class TemplateFlowValidationSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateFlowValidationSummary() throws Throwable {
    TemplateFlowValidationSummary templateFlowValidationSummaryModel = new TemplateFlowValidationSummary.Builder()
      .warningCount(Double.valueOf("72.5"))
      .errorCount(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowValidationSummaryModel.getWarningCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModel.getErrorCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModel.get("foo"), "testString");

    String json = TestUtilities.serialize(templateFlowValidationSummaryModel);

    TemplateFlowValidationSummary templateFlowValidationSummaryModelNew = TestUtilities.deserialize(json, TemplateFlowValidationSummary.class);
    assertTrue(templateFlowValidationSummaryModelNew instanceof TemplateFlowValidationSummary);
    assertEquals(templateFlowValidationSummaryModelNew.getWarningCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModelNew.getErrorCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModelNew.get("foo"), "testString");
  }
}