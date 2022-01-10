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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusSchematicsResources model.
 */
public class JobStatusSchematicsResourcesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusSchematicsResources() throws Throwable {
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusSchematicsResourcesModel.getStatusMessage(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.getSchematicsResourceId(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusSchematicsResourcesModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobStatusSchematicsResourcesModel);

    JobStatusSchematicsResources jobStatusSchematicsResourcesModelNew = TestUtilities.deserialize(json, JobStatusSchematicsResources.class);
    assertTrue(jobStatusSchematicsResourcesModelNew instanceof JobStatusSchematicsResources);
    assertEquals(jobStatusSchematicsResourcesModelNew.getStatusCode(), "job_pending");
    assertEquals(jobStatusSchematicsResourcesModelNew.getStatusMessage(), "testString");
    assertEquals(jobStatusSchematicsResourcesModelNew.getSchematicsResourceId(), "testString");
    assertEquals(jobStatusSchematicsResourcesModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusSchematicsResourcesModelNew.get("foo"), "testString");
  }
}