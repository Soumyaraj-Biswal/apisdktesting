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

import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsDecision;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ControlsDecision model.
 */
public class ControlsDecisionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testControlsDecision() throws Throwable {
    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
      .rule("testString")
      .passValue("before")
      .passExpr("== OR != OR <= OR >= OR > OR <")
      .evidenceFoundIn("rule emitting details")
      .add("foo", "testString")
      .build();
    assertEquals(controlsDecisionModel.getRule(), "testString");
    assertEquals(controlsDecisionModel.getPassValue(), "before");
    assertEquals(controlsDecisionModel.getPassExpr(), "== OR != OR <= OR >= OR > OR <");
    assertEquals(controlsDecisionModel.getEvidenceFoundIn(), "rule emitting details");
    assertEquals(controlsDecisionModel.get("foo"), "testString");

    String json = TestUtilities.serialize(controlsDecisionModel);

    ControlsDecision controlsDecisionModelNew = TestUtilities.deserialize(json, ControlsDecision.class);
    assertTrue(controlsDecisionModelNew instanceof ControlsDecision);
    assertEquals(controlsDecisionModelNew.getRule(), "testString");
    assertEquals(controlsDecisionModelNew.getPassValue(), "before");
    assertEquals(controlsDecisionModelNew.getPassExpr(), "== OR != OR <= OR >= OR > OR <");
    assertEquals(controlsDecisionModelNew.getEvidenceFoundIn(), "rule emitting details");
    assertEquals(controlsDecisionModelNew.get("foo"), "testString");
  }
}