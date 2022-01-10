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

import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetTemplateActivityLogOptions model.
 */
public class GetTemplateActivityLogOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetTemplateActivityLogOptions() throws Throwable {
    GetTemplateActivityLogOptions getTemplateActivityLogOptionsModel = new GetTemplateActivityLogOptions.Builder()
      .wId("testString")
      .tId("testString")
      .activityId("testString")
      .logTfCmd(true)
      .logTfPrefix(true)
      .logTfNullResource(true)
      .logTfAnsible(true)
      .build();
    assertEquals(getTemplateActivityLogOptionsModel.wId(), "testString");
    assertEquals(getTemplateActivityLogOptionsModel.tId(), "testString");
    assertEquals(getTemplateActivityLogOptionsModel.activityId(), "testString");
    assertEquals(getTemplateActivityLogOptionsModel.logTfCmd(), Boolean.valueOf(true));
    assertEquals(getTemplateActivityLogOptionsModel.logTfPrefix(), Boolean.valueOf(true));
    assertEquals(getTemplateActivityLogOptionsModel.logTfNullResource(), Boolean.valueOf(true));
    assertEquals(getTemplateActivityLogOptionsModel.logTfAnsible(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateActivityLogOptionsError() throws Throwable {
    new GetTemplateActivityLogOptions.Builder().build();
  }

}