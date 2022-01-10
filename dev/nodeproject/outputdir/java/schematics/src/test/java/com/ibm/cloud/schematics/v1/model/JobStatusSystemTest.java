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

import com.ibm.cloud.schematics.v1.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics.v1.model.JobStatusSystem;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusSystem model.
 */
public class JobStatusSystemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusSystem() throws Throwable {
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.statusCode(), "job_pending");
    assertEquals(jobStatusSchematicsResourcesModel.statusMessage(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.schematicsResourceId(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusSystemModel.systemStatusMessage(), "testString");
    assertEquals(jobStatusSystemModel.systemStatusCode(), "job_pending");
    assertEquals(jobStatusSystemModel.schematicsResourceStatus(), new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)));
    assertEquals(jobStatusSystemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(jobStatusSystemModel);

    JobStatusSystem jobStatusSystemModelNew = TestUtilities.deserialize(json, JobStatusSystem.class);
    assertTrue(jobStatusSystemModelNew instanceof JobStatusSystem);
    assertEquals(jobStatusSystemModelNew.systemStatusMessage(), "testString");
    assertEquals(jobStatusSystemModelNew.systemStatusCode(), "job_pending");
    assertEquals(jobStatusSystemModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}