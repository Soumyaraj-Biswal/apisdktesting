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

import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsEscalation;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ControlsEscalation model.
 */
public class ControlsEscalationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testControlsEscalation() throws Throwable {
    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
      .actionId("testString")
      .add("foo", "testString")
      .build();
    assertEquals(controlsEscalationModel.getActionId(), "testString");
    assertEquals(controlsEscalationModel.get("foo"), "testString");

    String json = TestUtilities.serialize(controlsEscalationModel);

    ControlsEscalation controlsEscalationModelNew = TestUtilities.deserialize(json, ControlsEscalation.class);
    assertTrue(controlsEscalationModelNew instanceof ControlsEscalation);
    assertEquals(controlsEscalationModelNew.getActionId(), "testString");
    assertEquals(controlsEscalationModelNew.get("foo"), "testString");
  }
}