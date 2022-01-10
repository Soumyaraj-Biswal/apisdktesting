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

import com.ibm.cloud.schematics_2_0_api.v2.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListWorkspacesOptions model.
 */
public class ListWorkspacesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListWorkspacesOptions() throws Throwable {
    ListWorkspacesOptions listWorkspacesOptionsModel = new ListWorkspacesOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .sort("testString")
      .profile("ids")
      .build();
    assertEquals(listWorkspacesOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listWorkspacesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listWorkspacesOptionsModel.sort(), "testString");
    assertEquals(listWorkspacesOptionsModel.profile(), "ids");
  }
}