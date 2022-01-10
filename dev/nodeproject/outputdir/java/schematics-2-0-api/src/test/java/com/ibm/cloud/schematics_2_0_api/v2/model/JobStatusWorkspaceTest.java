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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkitem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
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
 * Unit test class for the JobStatusWorkspace model.
 */
public class JobStatusWorkspaceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusWorkspace() throws Throwable {
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

    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusFlowModel.getFlowId(), "testString");
    assertEquals(jobStatusFlowModel.getFlowName(), "testString");
    assertEquals(jobStatusFlowModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusFlowModel.getStatusMessage(), "testString");
    assertEquals(jobStatusFlowModel.getWorkitems(), new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)));
    assertEquals(jobStatusFlowModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusFlowModel.get("foo"), "testString");

    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusTemplateModel.getTemplateId(), "testString");
    assertEquals(jobStatusTemplateModel.getTemplateName(), "testString");
    assertEquals(jobStatusTemplateModel.getFlowIndex(), Long.valueOf("26"));
    assertEquals(jobStatusTemplateModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusTemplateModel.getStatusMessage(), "testString");
    assertEquals(jobStatusTemplateModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusTemplateModel.get("foo"), "testString");

    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusWorkspaceModel.getWorkspaceName(), "testString");
    assertEquals(jobStatusWorkspaceModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModel.getStatusMessage(), "testString");
    assertEquals(jobStatusWorkspaceModel.getFlowStatus(), jobStatusFlowModel);
    assertEquals(jobStatusWorkspaceModel.getTemplateStatus(), new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)));
    assertEquals(jobStatusWorkspaceModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusWorkspaceModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobStatusWorkspaceModel);

    JobStatusWorkspace jobStatusWorkspaceModelNew = TestUtilities.deserialize(json, JobStatusWorkspace.class);
    assertTrue(jobStatusWorkspaceModelNew instanceof JobStatusWorkspace);
    assertEquals(jobStatusWorkspaceModelNew.getWorkspaceName(), "testString");
    assertEquals(jobStatusWorkspaceModelNew.getStatusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModelNew.getStatusMessage(), "testString");
    assertEquals(jobStatusWorkspaceModelNew.getFlowStatus().toString(), jobStatusFlowModel.toString());
    assertEquals(jobStatusWorkspaceModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusWorkspaceModelNew.get("foo"), "testString");
  }
}