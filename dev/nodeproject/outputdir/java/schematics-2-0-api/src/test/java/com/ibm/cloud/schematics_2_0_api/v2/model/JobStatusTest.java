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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSystem;
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
 * Unit test class for the JobStatus model.
 */
public class JobStatusTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatus() throws Throwable {
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

    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .targetsStatusCode("none")
      .targetsStatusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusActionModel.getActionName(), "testString");
    assertEquals(jobStatusActionModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusActionModel.getStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getBastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.getBastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getTargetsStatusCode(), "none");
    assertEquals(jobStatusActionModel.getTargetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusActionModel.get("foo"), "testString");

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

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusSystemModel.getSystemStatusMessage(), "testString");
    assertEquals(jobStatusSystemModel.getSystemStatusCode(), "job_pending");
    assertEquals(jobStatusSystemModel.getSchematicsResourceStatus(), new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)));
    assertEquals(jobStatusSystemModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusSystemModel.get("foo"), "testString");

    JobStatus jobStatusModel = new JobStatus.Builder()
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusModel.getWorkspaceJobStatus(), jobStatusWorkspaceModel);
    assertEquals(jobStatusModel.getActionJobStatus(), jobStatusActionModel);
    assertEquals(jobStatusModel.getSystemJobStatus(), jobStatusSystemModel);
    assertEquals(jobStatusModel.getFlowJobStatus(), jobStatusFlowModel);
    assertEquals(jobStatusModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobStatusModel);

    JobStatus jobStatusModelNew = TestUtilities.deserialize(json, JobStatus.class);
    assertTrue(jobStatusModelNew instanceof JobStatus);
    assertEquals(jobStatusModelNew.getWorkspaceJobStatus().toString(), jobStatusWorkspaceModel.toString());
    assertEquals(jobStatusModelNew.getActionJobStatus().toString(), jobStatusActionModel.toString());
    assertEquals(jobStatusModelNew.getSystemJobStatus().toString(), jobStatusSystemModel.toString());
    assertEquals(jobStatusModelNew.getFlowJobStatus().toString(), jobStatusFlowModel.toString());
    assertEquals(jobStatusModelNew.get("foo"), "testString");
  }
}