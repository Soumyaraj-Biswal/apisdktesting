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

import com.ibm.cloud.schematics_2_0_api.v2.model.GetJobWorkspaceInputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetJobWorkspaceInputValueOptions model.
 */
public class GetJobWorkspaceInputValueOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetJobWorkspaceInputValueOptions() throws Throwable {
    GetJobWorkspaceInputValueOptions getJobWorkspaceInputValueOptionsModel = new GetJobWorkspaceInputValueOptions.Builder()
      .jobId("testString")
      .workspaceId("testString")
      .varName("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .build();
    assertEquals(getJobWorkspaceInputValueOptionsModel.jobId(), "testString");
    assertEquals(getJobWorkspaceInputValueOptionsModel.workspaceId(), "testString");
    assertEquals(getJobWorkspaceInputValueOptionsModel.varName(), "testString");
    assertEquals(getJobWorkspaceInputValueOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getJobWorkspaceInputValueOptionsModel.limit(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobWorkspaceInputValueOptionsError() throws Throwable {
    new GetJobWorkspaceInputValueOptions.Builder().build();
  }

}