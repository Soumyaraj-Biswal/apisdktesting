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

import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ControlsLite model.
 */
public class ControlsLiteTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testControlsLite() throws Throwable {
    ControlsLite controlsLiteModel = new ControlsLite();
    assertNull(controlsLiteModel.getName());
    assertNull(controlsLiteModel.getDescription());
    assertNull(controlsLiteModel.getId());
    assertNull(controlsLiteModel.getCrn());
    assertNull(controlsLiteModel.getLocation());
    assertNull(controlsLiteModel.getResourceGroup());
    assertNull(controlsLiteModel.getTags());
    assertNull(controlsLiteModel.getUserState());
    assertNull(controlsLiteModel.getState());
    assertNull(controlsLiteModel.getSysLock());
    assertNull(controlsLiteModel.getCreatedAt());
    assertNull(controlsLiteModel.getCreatedBy());
    assertNull(controlsLiteModel.getUpdatedAt());
    assertNull(controlsLiteModel.getUpdatedBy());
  }
}