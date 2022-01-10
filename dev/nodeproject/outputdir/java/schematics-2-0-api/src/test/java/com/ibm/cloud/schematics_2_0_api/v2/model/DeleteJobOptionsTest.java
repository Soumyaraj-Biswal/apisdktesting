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

import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteJobOptions model.
 */
public class DeleteJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteJobOptions() throws Throwable {
    DeleteJobOptions deleteJobOptionsModel = new DeleteJobOptions.Builder()
      .jobId("testString")
      .refreshToken("testString")
      .force(true)
      .propagate(true)
      .build();
    assertEquals(deleteJobOptionsModel.jobId(), "testString");
    assertEquals(deleteJobOptionsModel.refreshToken(), "testString");
    assertEquals(deleteJobOptionsModel.force(), Boolean.valueOf(true));
    assertEquals(deleteJobOptionsModel.propagate(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobOptionsError() throws Throwable {
    new DeleteJobOptions.Builder().build();
  }

}