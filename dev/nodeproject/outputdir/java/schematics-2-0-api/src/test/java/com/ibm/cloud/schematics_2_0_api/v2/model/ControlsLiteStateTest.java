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

import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ControlsLiteState model.
 */
public class ControlsLiteStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testControlsLiteState() throws Throwable {
    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .add("foo", "testString")
      .build();
    assertEquals(controlsLiteStateModel.getStatusCode(), "normal");
    assertEquals(controlsLiteStateModel.getStatusMessage(), "testString");
    assertEquals(controlsLiteStateModel.get("foo"), "testString");

    String json = TestUtilities.serialize(controlsLiteStateModel);

    ControlsLiteState controlsLiteStateModelNew = TestUtilities.deserialize(json, ControlsLiteState.class);
    assertTrue(controlsLiteStateModelNew instanceof ControlsLiteState);
    assertEquals(controlsLiteStateModelNew.getStatusCode(), "normal");
    assertEquals(controlsLiteStateModelNew.getStatusMessage(), "testString");
    assertEquals(controlsLiteStateModelNew.get("foo"), "testString");
  }
}