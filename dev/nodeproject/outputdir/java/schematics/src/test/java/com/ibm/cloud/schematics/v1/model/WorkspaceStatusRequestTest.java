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

import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkspaceStatusRequest model.
 */
public class WorkspaceStatusRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkspaceStatusRequest() throws Throwable {
    WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(workspaceStatusRequestModel.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusRequestModel.frozenBy(), "testString");
    assertEquals(workspaceStatusRequestModel.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.lockedBy(), "testString");
    assertEquals(workspaceStatusRequestModel.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(workspaceStatusRequestModel);

    WorkspaceStatusRequest workspaceStatusRequestModelNew = TestUtilities.deserialize(json, WorkspaceStatusRequest.class);
    assertTrue(workspaceStatusRequestModelNew instanceof WorkspaceStatusRequest);
    assertEquals(workspaceStatusRequestModelNew.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModelNew.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusRequestModelNew.frozenBy(), "testString");
    assertEquals(workspaceStatusRequestModelNew.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModelNew.lockedBy(), "testString");
    assertEquals(workspaceStatusRequestModelNew.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}