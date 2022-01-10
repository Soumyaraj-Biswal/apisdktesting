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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
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
      .add("foo", "testString")
      .build();
    assertEquals(jobDataWorkItemLastJobModel.getCommandObject(), "workspace");
    assertEquals(jobDataWorkItemLastJobModel.getCommandObjectName(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.getCommandObjectId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.getCommandName(), "workspace_plan");
    assertEquals(jobDataWorkItemLastJobModel.getJobId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.getJobStatus(), "job_pending");
    assertEquals(jobDataWorkItemLastJobModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobDataWorkItemLastJobModel);

    JobDataWorkItemLastJob jobDataWorkItemLastJobModelNew = TestUtilities.deserialize(json, JobDataWorkItemLastJob.class);
    assertTrue(jobDataWorkItemLastJobModelNew instanceof JobDataWorkItemLastJob);
    assertEquals(jobDataWorkItemLastJobModelNew.getCommandObject(), "workspace");
    assertEquals(jobDataWorkItemLastJobModelNew.getCommandObjectName(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.getCommandObjectId(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.getCommandName(), "workspace_plan");
    assertEquals(jobDataWorkItemLastJobModelNew.getJobId(), "testString");
    assertEquals(jobDataWorkItemLastJobModelNew.getJobStatus(), "job_pending");
    assertEquals(jobDataWorkItemLastJobModelNew.get("foo"), "testString");
  }
}