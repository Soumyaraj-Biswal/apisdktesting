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

import com.ibm.cloud.schematics.v1.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobDataWorkItemLastJob model.
 */
public class JobDataWorkItemLastJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobDataWorkItemLastJob() throws Throwable {
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobId("testString")
      .jobStatus("job_pending")
      .build();
    assertEquals(jobDataWorkItemLastJobModel.commandObject(), "workspace");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectName(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.commandName(), "workspace_plan");
    assertEquals(jobDataWorkItemLastJobModel.jobId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.jobStatus(), "job_pending");

    String json = TestUtilities.serialize(jobDataWorkItemLastJobModel);

    JobDataWorkItemLastJob jobDataWorkItemLastJobModelNew = TestUtilities.deserialize(json, JobDataWorkItemLastJob.class);
    assertTrue(jobDataWorkItemLastJobModelNew instanceof JobDataWorkItemLastJob);
    assertEquals(jobDataWorkItemLastJobModelNew.commandObject(), "workspace");
    assertEquals(jobDataWorkItemLastJobModelNew.commandObjectName(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.commandObjectId(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.commandName(), "workspace_plan");
    assertEquals(jobDataWorkItemLastJobModelNew.jobId(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.jobStatus(), "job_pending");
  }
}