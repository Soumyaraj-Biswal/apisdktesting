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

import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceInputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetWorkspaceInputValueOptions model.
 */
public class GetWorkspaceInputValueOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetWorkspaceInputValueOptions() throws Throwable {
    GetWorkspaceInputValueOptions getWorkspaceInputValueOptionsModel = new GetWorkspaceInputValueOptions.Builder()
      .workspaceId("testString")
      .varName("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .build();
    assertEquals(getWorkspaceInputValueOptionsModel.workspaceId(), "testString");
    assertEquals(getWorkspaceInputValueOptionsModel.varName(), "testString");
    assertEquals(getWorkspaceInputValueOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(getWorkspaceInputValueOptionsModel.offset(), Long.valueOf("0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputValueOptionsError() throws Throwable {
    new GetWorkspaceInputValueOptions.Builder().build();
  }

}