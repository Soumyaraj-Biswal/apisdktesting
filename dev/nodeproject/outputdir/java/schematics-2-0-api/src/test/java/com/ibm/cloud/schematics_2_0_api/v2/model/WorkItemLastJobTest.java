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

import com.ibm.cloud.schematics_2_0_api.v2.model.WorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkItemLastJob model.
 */
public class WorkItemLastJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkItemLastJob() throws Throwable {
    WorkItemLastJob workItemLastJobModel = new WorkItemLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobStatus("job_pending")
      .add("foo", "testString")
      .build();
    assertEquals(workItemLastJobModel.getCommandObject(), "workspace");
    assertEquals(workItemLastJobModel.getCommandObjectName(), "testString");
    assertEquals(workItemLastJobModel.getCommandObjectId(), "testString");
    assertEquals(workItemLastJobModel.getCommandName(), "workspace_plan");
    assertEquals(workItemLastJobModel.getJobStatus(), "job_pending");
    assertEquals(workItemLastJobModel.get("foo"), "testString");

    String json = TestUtilities.serialize(workItemLastJobModel);

    WorkItemLastJob workItemLastJobModelNew = TestUtilities.deserialize(json, WorkItemLastJob.class);
    assertTrue(workItemLastJobModelNew instanceof WorkItemLastJob);
    assertEquals(workItemLastJobModelNew.getCommandObject(), "workspace");
    assertEquals(workItemLastJobModelNew.getCommandObjectName(), "testString");
    assertEquals(workItemLastJobModelNew.getCommandObjectId(), "testString");
    assertEquals(workItemLastJobModelNew.getCommandName(), "workspace_plan");
    assertEquals(workItemLastJobModelNew.getJobStatus(), "job_pending");
    assertEquals(workItemLastJobModelNew.get("foo"), "testString");
  }
}