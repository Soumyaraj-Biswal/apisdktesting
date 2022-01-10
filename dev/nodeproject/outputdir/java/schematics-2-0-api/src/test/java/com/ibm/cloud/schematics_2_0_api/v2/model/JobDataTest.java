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

import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobData;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkspace;
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
 * Unit test class for the JobData model.
 */
public class JobDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobData() throws Throwable {
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

    String json = TestUtilities.serialize(jobDataModel);

    JobData jobDataModelNew = TestUtilities.deserialize(json, JobData.class);
    assertTrue(jobDataModelNew instanceof JobData);
    assertEquals(jobDataModelNew.getJobType(), "repo_download_job");
    assertEquals(jobDataModelNew.getWorkspaceJobData().toString(), jobDataWorkspaceModel.toString());
    assertEquals(jobDataModelNew.getActionJobData().toString(), jobDataActionModel.toString());
    assertEquals(jobDataModelNew.getSystemJobData().toString(), jobDataSystemModel.toString());
    assertEquals(jobDataModelNew.getFlowJobData().toString(), jobDataFlowModel.toString());
    assertEquals(jobDataModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testJobDataError() throws Throwable {
    new JobData.Builder().build();
  }

}