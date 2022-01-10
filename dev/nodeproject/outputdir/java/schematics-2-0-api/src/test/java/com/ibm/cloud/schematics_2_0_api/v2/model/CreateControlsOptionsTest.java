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

import com.ibm.cloud.schematics_2_0_api.v2.model.BastionResourceDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.Capsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultEvidences;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.Controls;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsDecision;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsEscalation;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.Job;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobData;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataCapsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobResultCapsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkitem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerScheduled;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
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
 * Unit test class for the CreateControlsOptions model.
 */
public class CreateControlsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateControlsOptions() throws Throwable {
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .add("foo", "testString")
      .build();
    assertEquals(externalSourceGitModel.getComputedGitRepoUrl(), "testString");
    assertEquals(externalSourceGitModel.getGitRepoUrl(), "testString");
    assertEquals(externalSourceGitModel.getGitToken(), "testString");
    assertEquals(externalSourceGitModel.getGitRepoFolder(), "testString");
    assertEquals(externalSourceGitModel.getGitRelease(), "testString");
    assertEquals(externalSourceGitModel.getGitBranch(), "testString");
    assertEquals(externalSourceGitModel.get("foo"), "testString");

    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
      .catalogName("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringRepoUrl("testString")
      .add("foo", "testString")
      .build();
    assertEquals(externalSourceCatalogModel.getCatalogName(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingName(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingVersion(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingKind(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingId(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingVersionId(), "testString");
    assertEquals(externalSourceCatalogModel.getOfferingRepoUrl(), "testString");
    assertEquals(externalSourceCatalogModel.get("foo"), "testString");

    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
      .cosBucketUrl("testString")
      .add("foo", "testString")
      .build();
    assertEquals(externalSourceCosBucketModel.getCosBucketUrl(), "testString");
    assertEquals(externalSourceCosBucketModel.get("foo"), "testString");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(externalSourceGitModel)
      .catalog(externalSourceCatalogModel)
      .cosBucket(externalSourceCosBucketModel)
      .add("foo", "testString")
      .build();
    assertEquals(externalSourceModel.getSourceType(), "local");
    assertEquals(externalSourceModel.getGit(), externalSourceGitModel);
    assertEquals(externalSourceModel.getCatalog(), externalSourceCatalogModel);
    assertEquals(externalSourceModel.getCosBucket(), externalSourceCosBucketModel);
    assertEquals(externalSourceModel.get("foo"), "testString");

    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .add("foo", "testString")
      .build();
    assertEquals(variableMetadataModel.getType(), "boolean");
    assertEquals(variableMetadataModel.getAliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getDescription(), "testString");
    assertEquals(variableMetadataModel.getDefaultValue(), "testString");
    assertEquals(variableMetadataModel.isSecure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isImmutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isHidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.getOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getMinValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMinLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMatches(), "testString");
    assertEquals(variableMetadataModel.getPosition(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getGroupBy(), "testString");
    assertEquals(variableMetadataModel.getSource(), "testString");
    assertEquals(variableMetadataModel.get("foo"), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .add("foo", "testString")
      .build();
    assertEquals(variableDataModel.getName(), "testString");
    assertEquals(variableDataModel.getValue(), "testString");
    assertEquals(variableDataModel.getMetadata(), variableMetadataModel);
    assertEquals(variableDataModel.get("foo"), "testString");

    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(userStateModel.getState(), "draft");
    assertEquals(userStateModel.getSetBy(), "testString");
    assertEquals(userStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(userStateModel.get("foo"), "testString");

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(systemLockModel.isSysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.getSysLockedBy(), "testString");
    assertEquals(systemLockModel.getSysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(systemLockModel.get("foo"), "testString");

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

    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataTemplateModel.getTemplateId(), "testString");
    assertEquals(jobDataTemplateModel.getTemplateName(), "testString");
    assertEquals(jobDataTemplateModel.getFlowIndex(), Long.valueOf("26"));
    assertEquals(jobDataTemplateModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataTemplateModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataTemplateModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataTemplateModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataTemplateModel.get("foo"), "testString");

    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
      .workspaceName("testString")
      .flowId("testString")
      .flowName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataWorkspaceModel.getWorkspaceName(), "testString");
    assertEquals(jobDataWorkspaceModel.getFlowId(), "testString");
    assertEquals(jobDataWorkspaceModel.getFlowName(), "testString");
    assertEquals(jobDataWorkspaceModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkspaceModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkspaceModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkspaceModel.getTemplateData(), new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)));
    assertEquals(jobDataWorkspaceModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataWorkspaceModel.get("foo"), "testString");

    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(inventoryResourceRecordModel.getName(), "testString");
    assertEquals(inventoryResourceRecordModel.getDescription(), "testString");
    assertEquals(inventoryResourceRecordModel.getLocation(), "us-south");
    assertEquals(inventoryResourceRecordModel.getResourceGroup(), "testString");
    assertEquals(inventoryResourceRecordModel.getInventoriesIni(), "testString");
    assertEquals(inventoryResourceRecordModel.getResourceQueries(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(inventoryResourceRecordModel.get("foo"), "testString");

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("testString")
      .add("foo", "testString")
      .build();
    assertEquals(jobDataActionModel.getActionName(), "testString");
    assertEquals(jobDataActionModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataActionModel.getInventoryRecord(), inventoryResourceRecordModel);
    assertEquals(jobDataActionModel.getMaterializedInventory(), "testString");
    assertEquals(jobDataActionModel.get("foo"), "testString");

    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataSystemModel.getKeyId(), "testString");
    assertEquals(jobDataSystemModel.getSchematicsResourceId(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobDataSystemModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataSystemModel.get("foo"), "testString");

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

    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
      .commandObjectId("testString")
      .commandObjectName("testString")
      .layers("testString")
      .sourceType("local")
      .source(externalSourceModel)
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .lastJob(jobDataWorkItemLastJobModel)
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataWorkItemModel.getCommandObjectId(), "testString");
    assertEquals(jobDataWorkItemModel.getCommandObjectName(), "testString");
    assertEquals(jobDataWorkItemModel.getLayers(), "testString");
    assertEquals(jobDataWorkItemModel.getSourceType(), "local");
    assertEquals(jobDataWorkItemModel.getSource(), externalSourceModel);
    assertEquals(jobDataWorkItemModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkItemModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkItemModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataWorkItemModel.getLastJob(), jobDataWorkItemLastJobModel);
    assertEquals(jobDataWorkItemModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataWorkItemModel.get("foo"), "testString");

    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataFlowModel.getFlowId(), "testString");
    assertEquals(jobDataFlowModel.getFlowName(), "testString");
    assertEquals(jobDataFlowModel.getWorkitems(), new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)));
    assertEquals(jobDataFlowModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataFlowModel.get("foo"), "testString");

    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .workspaceJobData(jobDataWorkspaceModel)
      .actionJobData(jobDataActionModel)
      .systemJobData(jobDataSystemModel)
      .flowJobData(jobDataFlowModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobDataModel.getJobType(), "repo_download_job");
    assertEquals(jobDataModel.getWorkspaceJobData(), jobDataWorkspaceModel);
    assertEquals(jobDataModel.getActionJobData(), jobDataActionModel);
    assertEquals(jobDataModel.getSystemJobData(), jobDataSystemModel);
    assertEquals(jobDataModel.getFlowJobData(), jobDataFlowModel);
    assertEquals(jobDataModel.get("foo"), "testString");

    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .add("foo", "testString")
      .build();
    assertEquals(bastionResourceDefinitionModel.getName(), "testString");
    assertEquals(bastionResourceDefinitionModel.getHost(), "testString");
    assertEquals(bastionResourceDefinitionModel.get("foo"), "testString");

    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryRepoDownloadJobModel.get("foo"), "testString");

    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryWorkspaceJobModel.get("foo"), "testString");

    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("testString")
      .jobId("testString")
      .logUrl("testString")
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryWorkitemsModel.getWorkspaceId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.getJobId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.getLogUrl(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.get("foo"), "testString");

    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryFlowJobModel.getWorkitems(), new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)));
    assertEquals(jobLogSummaryFlowJobModel.get("foo"), "testString");

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.getTarget(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.getOk(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getChanged(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getFailed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getSkipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getUnreachable(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.get("foo"), "testString");

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryActionJobModel.getRecap(), jobLogSummaryActionJobRecapModel);
    assertEquals(jobLogSummaryActionJobModel.get("foo"), "testString");

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummarySystemJobModel.getSuccess(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.getFailed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.get("foo"), "testString");

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryModel.getJobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.getRepoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.getWorkspaceJob(), jobLogSummaryWorkspaceJobModel);
    assertEquals(jobLogSummaryModel.getFlowJob(), jobLogSummaryFlowJobModel);
    assertEquals(jobLogSummaryModel.getActionJob(), jobLogSummaryActionJobModel);
    assertEquals(jobLogSummaryModel.getSystemJob(), jobLogSummarySystemJobModel);
    assertEquals(jobLogSummaryModel.get("foo"), "testString");

    Job jobModel = new Job.Builder()
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .commandParameter("testString")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .location("us-south")
      .status(jobStatusModel)
      .data(jobDataModel)
      .bastion(bastionResourceDefinitionModel)
      .logSummary(jobLogSummaryModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobModel.getCommandObject(), "workspace");
    assertEquals(jobModel.getCommandObjectId(), "testString");
    assertEquals(jobModel.getCommandName(), "workspace_plan");
    assertEquals(jobModel.getCommandParameter(), "testString");
    assertEquals(jobModel.getCommandOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobModel.getLocation(), "us-south");
    assertEquals(jobModel.getStatus(), jobStatusModel);
    assertEquals(jobModel.getData(), jobDataModel);
    assertEquals(jobModel.getBastion(), bastionResourceDefinitionModel);
    assertEquals(jobModel.getLogSummary(), jobLogSummaryModel);
    assertEquals(jobModel.get("foo"), "testString");

    TriggerJob triggerJobModel = new TriggerJob.Builder()
      .event("before | after")
      .job(jobModel)
      .add("foo", "testString")
      .build();
    assertEquals(triggerJobModel.getEvent(), "before | after");
    assertEquals(triggerJobModel.getJob(), jobModel);
    assertEquals(triggerJobModel.get("foo"), "testString");

    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
      .frequency("daily | weekly")
      .time("time in UTC")
      .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
      .add("foo", "testString")
      .build();
    assertEquals(triggerScheduledModel.getFrequency(), "daily | weekly");
    assertEquals(triggerScheduledModel.getTime(), "time in UTC");
    assertEquals(triggerScheduledModel.getDay(), "expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday");
    assertEquals(triggerScheduledModel.get("foo"), "testString");

    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
      .rule("testString")
      .passValue("before")
      .passExpr("== OR != OR <= OR >= OR > OR <")
      .evidenceFoundIn("rule emitting details")
      .add("foo", "testString")
      .build();
    assertEquals(controlsDecisionModel.getRule(), "testString");
    assertEquals(controlsDecisionModel.getPassValue(), "before");
    assertEquals(controlsDecisionModel.getPassExpr(), "== OR != OR <= OR >= OR > OR <");
    assertEquals(controlsDecisionModel.getEvidenceFoundIn(), "rule emitting details");
    assertEquals(controlsDecisionModel.get("foo"), "testString");

    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
      .actionId("testString")
      .add("foo", "testString")
      .build();
    assertEquals(controlsEscalationModel.getActionId(), "testString");
    assertEquals(controlsEscalationModel.get("foo"), "testString");

    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .add("foo", "testString")
      .build();
    assertEquals(controlsLiteStateModel.getStatusCode(), "normal");
    assertEquals(controlsLiteStateModel.getStatusMessage(), "testString");
    assertEquals(controlsLiteStateModel.get("foo"), "testString");

    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
      .name("testString")
      .type("testString")
      .add("foo", "testString")
      .build();
    assertEquals(capsuleResultResourcesModel.getName(), "testString");
    assertEquals(capsuleResultResourcesModel.getType(), "testString");
    assertEquals(capsuleResultResourcesModel.get("foo"), "testString");

    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
      .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
      .add("foo", "testString")
      .build();
    assertEquals(capsuleResultEvidencesModel.getResources(), new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)));
    assertEquals(capsuleResultEvidencesModel.get("foo"), "testString");

    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
      .jobId("testString")
      .jobName("testString")
      .policy("testString")
      .severity(Long.valueOf("1"))
      .jobState("success")
      .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobResultCapsuleModel.getJobId(), "testString");
    assertEquals(jobResultCapsuleModel.getJobName(), "testString");
    assertEquals(jobResultCapsuleModel.getPolicy(), "testString");
    assertEquals(jobResultCapsuleModel.getSeverity(), Long.valueOf("1"));
    assertEquals(jobResultCapsuleModel.getJobState(), "success");
    assertEquals(jobResultCapsuleModel.getFailures(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobResultCapsuleModel.getPassed(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobResultCapsuleModel.getEvidences(), new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)));
    assertEquals(jobResultCapsuleModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobResultCapsuleModel.get("foo"), "testString");

    JobDataCapsule jobDataCapsuleModel = new JobDataCapsule.Builder()
      .capsuleId("testString")
      .calsuleName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .results(new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataCapsuleModel.getCapsuleId(), "testString");
    assertEquals(jobDataCapsuleModel.getCalsuleName(), "testString");
    assertEquals(jobDataCapsuleModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataCapsuleModel.getResults(), new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)));
    assertEquals(jobDataCapsuleModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataCapsuleModel.get("foo"), "testString");

    Capsule capsuleModel = new Capsule.Builder()
      .name("testString")
      .description("testString")
      .type("testString")
      .userState(userStateModel)
      .xPackage("Policy package path")
      .severity(Long.valueOf("1"))
      .inventory("testString")
      .triggerRecordId("testString")
      .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
      .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .decisions(new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)))
      .escalations(new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)))
      .id("testString")
      .status("testString")
      .controlsId("testString")
      .controlsName("testString")
      .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .createdBy("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .updatedBy("testString")
      .state(controlsLiteStateModel)
      .lastJobData(jobDataCapsuleModel)
      .sysLock(systemLockModel)
      .add("foo", "testString")
      .build();
    assertEquals(capsuleModel.getName(), "testString");
    assertEquals(capsuleModel.getDescription(), "testString");
    assertEquals(capsuleModel.getType(), "testString");
    assertEquals(capsuleModel.getUserState(), userStateModel);
    assertEquals(capsuleModel.getXPackage(), "Policy package path");
    assertEquals(capsuleModel.getSeverity(), Long.valueOf("1"));
    assertEquals(capsuleModel.getInventory(), "testString");
    assertEquals(capsuleModel.getTriggerRecordId(), "testString");
    assertEquals(capsuleModel.getJobTriggers(), new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)));
    assertEquals(capsuleModel.getScheduledTriggers(), new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)));
    assertEquals(capsuleModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(capsuleModel.getDecisions(), new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)));
    assertEquals(capsuleModel.getEscalations(), new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)));
    assertEquals(capsuleModel.getId(), "testString");
    assertEquals(capsuleModel.getStatus(), "testString");
    assertEquals(capsuleModel.getControlsId(), "testString");
    assertEquals(capsuleModel.getControlsName(), "testString");
    assertEquals(capsuleModel.getCreatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(capsuleModel.getCreatedBy(), "testString");
    assertEquals(capsuleModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(capsuleModel.getUpdatedBy(), "testString");
    assertEquals(capsuleModel.getState(), controlsLiteStateModel);
    assertEquals(capsuleModel.getLastJobData(), jobDataCapsuleModel);
    assertEquals(capsuleModel.getSysLock(), systemLockModel);
    assertEquals(capsuleModel.get("foo"), "testString");

    Controls controlsModel = new Controls.Builder()
      .name("testString")
      .type("it_controls")
      .description("testString")
      .resourceGroup("testString")
      .location("us-south")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .sourceReadmeUrl("testString")
      .source(externalSourceModel)
      .sourceType("local")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .userState(userStateModel)
      .sysLock(systemLockModel)
      .capsules(new java.util.ArrayList<Capsule>(java.util.Arrays.asList(capsuleModel)))
      .add("foo", "testString")
      .build();
    assertEquals(controlsModel.getName(), "testString");
    assertEquals(controlsModel.getType(), "it_controls");
    assertEquals(controlsModel.getDescription(), "testString");
    assertEquals(controlsModel.getResourceGroup(), "testString");
    assertEquals(controlsModel.getLocation(), "us-south");
    assertEquals(controlsModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(controlsModel.getSourceReadmeUrl(), "testString");
    assertEquals(controlsModel.getSource(), externalSourceModel);
    assertEquals(controlsModel.getSourceType(), "local");
    assertEquals(controlsModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(controlsModel.getUserState(), userStateModel);
    assertEquals(controlsModel.getSysLock(), systemLockModel);
    assertEquals(controlsModel.getCapsules(), new java.util.ArrayList<Capsule>(java.util.Arrays.asList(capsuleModel)));
    assertEquals(controlsModel.get("foo"), "testString");

    CreateControlsOptions createControlsOptionsModel = new CreateControlsOptions.Builder()
      .controls(controlsModel)
      .build();
    assertEquals(createControlsOptionsModel.controls(), controlsModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateControlsOptionsError() throws Throwable {
    new CreateControlsOptions.Builder().build();
  }

}