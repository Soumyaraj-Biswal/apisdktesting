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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkitem;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusWorkitem model.
 */
public class JobStatusWorkitemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusWorkitem() throws Throwable {
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("testString")
      .workspaceName("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusWorkitemModel.getWorkspaceId(), "testString");
    assertEquals(jobStatusWorkitemModel.getWorkspaceName(), "testString");
    assertEquals(jobStatusWorkitemModel.getJobId(), "testString");
    assertEquals(jobStatusWorkitemModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusWorkitemModel.getStatusMessage(), "testString");
    assertEquals(jobStatusWorkitemModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusWorkitemModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobStatusWorkitemModel);

    JobStatusWorkitem jobStatusWorkitemModelNew = TestUtilities.deserialize(json, JobStatusWorkitem.class);
    assertTrue(jobStatusWorkitemModelNew instanceof JobStatusWorkitem);
    assertEquals(jobStatusWorkitemModelNew.getWorkspaceId(), "testString");
    assertEquals(jobStatusWorkitemModelNew.getWorkspaceName(), "testString");
    assertEquals(jobStatusWorkitemModelNew.getJobId(), "testString");
    assertEquals(jobStatusWorkitemModelNew.getStatusCode(), "job_pending");
    assertEquals(jobStatusWorkitemModelNew.getStatusMessage(), "testString");
    assertEquals(jobStatusWorkitemModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusWorkitemModelNew.get("foo"), "testString");
  }
}