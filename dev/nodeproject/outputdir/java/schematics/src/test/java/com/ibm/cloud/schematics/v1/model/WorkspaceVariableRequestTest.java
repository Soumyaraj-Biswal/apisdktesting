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

import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkspaceVariableRequest model.
 */
public class WorkspaceVariableRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkspaceVariableRequest() throws Throwable {
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();
    assertEquals(workspaceVariableRequestModel.description(), "testString");
    assertEquals(workspaceVariableRequestModel.name(), "testString");
    assertEquals(workspaceVariableRequestModel.secure(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.type(), "testString");
    assertEquals(workspaceVariableRequestModel.useDefault(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.value(), "testString");

    String json = TestUtilities.serialize(workspaceVariableRequestModel);

    WorkspaceVariableRequest workspaceVariableRequestModelNew = TestUtilities.deserialize(json, WorkspaceVariableRequest.class);
    assertTrue(workspaceVariableRequestModelNew instanceof WorkspaceVariableRequest);
    assertEquals(workspaceVariableRequestModelNew.description(), "testString");
    assertEquals(workspaceVariableRequestModelNew.name(), "testString");
    assertEquals(workspaceVariableRequestModelNew.secure(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModelNew.type(), "testString");
    assertEquals(workspaceVariableRequestModelNew.useDefault(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModelNew.value(), "testString");
  }
}