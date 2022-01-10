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

import com.ibm.cloud.schematics.v1.model.WorkspaceStatusUpdateRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkspaceStatusUpdateRequest model.
 */
public class WorkspaceStatusUpdateRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkspaceStatusUpdateRequest() throws Throwable {
    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(workspaceStatusUpdateRequestModel.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusUpdateRequestModel.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusUpdateRequestModel.frozenBy(), "testString");
    assertEquals(workspaceStatusUpdateRequestModel.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusUpdateRequestModel.lockedBy(), "testString");
    assertEquals(workspaceStatusUpdateRequestModel.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(workspaceStatusUpdateRequestModel);

    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModelNew = TestUtilities.deserialize(json, WorkspaceStatusUpdateRequest.class);
    assertTrue(workspaceStatusUpdateRequestModelNew instanceof WorkspaceStatusUpdateRequest);
    assertEquals(workspaceStatusUpdateRequestModelNew.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusUpdateRequestModelNew.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusUpdateRequestModelNew.frozenBy(), "testString");
    assertEquals(workspaceStatusUpdateRequestModelNew.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusUpdateRequestModelNew.lockedBy(), "testString");
    assertEquals(workspaceStatusUpdateRequestModelNew.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}