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

import com.ibm.cloud.schematics_2_0_api.v2.model.FlowOperations;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowOperations model.
 */
public class FlowOperationsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowOperations() throws Throwable {
    FlowOperations flowOperationsModel = new FlowOperations.Builder()
      .install("testString")
      .update("testString")
      .uninstall("testString")
      .configure("testString")
      .add("foo", "testString")
      .build();
    assertEquals(flowOperationsModel.getInstall(), "testString");
    assertEquals(flowOperationsModel.getUpdate(), "testString");
    assertEquals(flowOperationsModel.getUninstall(), "testString");
    assertEquals(flowOperationsModel.getConfigure(), "testString");
    assertEquals(flowOperationsModel.get("foo"), "testString");

    String json = TestUtilities.serialize(flowOperationsModel);

    FlowOperations flowOperationsModelNew = TestUtilities.deserialize(json, FlowOperations.class);
    assertTrue(flowOperationsModelNew instanceof FlowOperations);
    assertEquals(flowOperationsModelNew.getInstall(), "testString");
    assertEquals(flowOperationsModelNew.getUpdate(), "testString");
    assertEquals(flowOperationsModelNew.getUninstall(), "testString");
    assertEquals(flowOperationsModelNew.getConfigure(), "testString");
    assertEquals(flowOperationsModelNew.get("foo"), "testString");
  }
}