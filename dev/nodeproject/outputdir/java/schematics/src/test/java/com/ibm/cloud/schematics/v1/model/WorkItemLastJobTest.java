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

import com.ibm.cloud.schematics.v1.model.WorkItemLastJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
      .build();
    assertEquals(workItemLastJobModel.commandObject(), "workspace");
    assertEquals(workItemLastJobModel.commandObjectName(), "testString");
    assertEquals(workItemLastJobModel.commandObjectId(), "testString");
    assertEquals(workItemLastJobModel.commandName(), "workspace_plan");
    assertEquals(workItemLastJobModel.jobStatus(), "job_pending");

    String json = TestUtilities.serialize(workItemLastJobModel);

    WorkItemLastJob workItemLastJobModelNew = TestUtilities.deserialize(json, WorkItemLastJob.class);
    assertTrue(workItemLastJobModelNew instanceof WorkItemLastJob);
    assertEquals(workItemLastJobModelNew.commandObject(), "workspace");
    assertEquals(workItemLastJobModelNew.commandObjectName(), "testString");
    assertEquals(workItemLastJobModelNew.commandObjectId(), "testString");
    assertEquals(workItemLastJobModelNew.commandName(), "workspace_plan");
    assertEquals(workItemLastJobModelNew.jobStatus(), "job_pending");
  }
}