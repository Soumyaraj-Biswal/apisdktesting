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

import com.ibm.cloud.schematics.v1.model.Flow;
import com.ibm.cloud.schematics.v1.model.FlowOperations;
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
 * Unit test class for the Flow model.
 */
public class FlowTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlow() throws Throwable {
    FlowOperations flowOperationsModel = new FlowOperations.Builder()
      .install("testString")
      .update("testString")
      .uninstall("testString")
      .configure("testString")
      .build();
    assertEquals(flowOperationsModel.install(), "testString");
    assertEquals(flowOperationsModel.update(), "testString");
    assertEquals(flowOperationsModel.uninstall(), "testString");
    assertEquals(flowOperationsModel.configure(), "testString");

    Flow flowModel = new Flow.Builder()
      .type("testString")
      .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
      .build();
    assertEquals(flowModel.type(), "testString");
    assertEquals(flowModel.operations(), new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)));

    String json = TestUtilities.serialize(flowModel);

    Flow flowModelNew = TestUtilities.deserialize(json, Flow.class);
    assertTrue(flowModelNew instanceof Flow);
    assertEquals(flowModelNew.type(), "testString");
  }
}