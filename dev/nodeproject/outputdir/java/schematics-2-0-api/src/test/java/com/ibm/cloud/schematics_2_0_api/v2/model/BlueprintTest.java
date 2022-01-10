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

import com.ibm.cloud.schematics_2_0_api.v2.model.Blueprint;
import com.ibm.cloud.schematics_2_0_api.v2.model.BlueprintVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
import com.ibm.cloud.schematics_2_0_api.v2.model.Flow;
import com.ibm.cloud.schematics_2_0_api.v2.model.FlowOperations;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Blueprint model.
 */
public class BlueprintTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBlueprint() throws Throwable {
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

    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
      .name("testString")
      .value("testString")
      .add("foo", "testString")
      .build();
    assertEquals(blueprintVariableDataModel.getName(), "testString");
    assertEquals(blueprintVariableDataModel.getValue(), "testString");
    assertEquals(blueprintVariableDataModel.get("foo"), "testString");

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

    WorkItem workItemModel = new WorkItem.Builder()
      .workitemObjectId("testString")
      .workitemObjectType("workspace")
      .name("testString")
      .layer("testString")
      .source(externalSourceModel)
      .tags("testString")
      .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
      .outputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
      .settings(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
      .lastJob(workItemLastJobModel)
      .add("foo", "testString")
      .build();
    assertEquals(workItemModel.getWorkitemObjectId(), "testString");
    assertEquals(workItemModel.getWorkitemObjectType(), "workspace");
    assertEquals(workItemModel.getName(), "testString");
    assertEquals(workItemModel.getLayer(), "testString");
    assertEquals(workItemModel.getSource(), externalSourceModel);
    assertEquals(workItemModel.getTags(), "testString");
    assertEquals(workItemModel.getInputs(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.getOutputs(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.getSettings(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.getLastJob(), workItemLastJobModel);
    assertEquals(workItemModel.get("foo"), "testString");

    FlowOperations flowOperationsModel = new FlowOperations.Builder()
      .install("testString")
      .update("testString")
      .uninstall("testString")
      .configure("testString")
      .add("foo", "testString")
      .build();
    assertEquals(flowOperationsModel.getInstall(), "testString");
    assertEquals(flowOperationsModel.getUpdate(), "testString");
    assertEquals(flowOperationsModel.getUninstall(), "testString");
    assertEquals(flowOperationsModel.getConfigure(), "testString");
    assertEquals(flowOperationsModel.get("foo"), "testString");

    Flow flowModel = new Flow.Builder()
      .type("testString")
      .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
      .add("foo", "testString")
      .build();
    assertEquals(flowModel.getType(), "testString");
    assertEquals(flowModel.getOperations(), new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)));
    assertEquals(flowModel.get("foo"), "testString");

    Blueprint blueprintModel = new Blueprint.Builder()
      .name("testString")
      .description("testString")
      .source(externalSourceModel)
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .workitems(new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)))
      .flow(flowModel)
      .add("foo", "testString")
      .build();
    assertEquals(blueprintModel.getName(), "testString");
    assertEquals(blueprintModel.getDescription(), "testString");
    assertEquals(blueprintModel.getSource(), externalSourceModel);
    assertEquals(blueprintModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.getWorkitems(), new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)));
    assertEquals(blueprintModel.getFlow(), flowModel);
    assertEquals(blueprintModel.get("foo"), "testString");

    String json = TestUtilities.serialize(blueprintModel);

    Blueprint blueprintModelNew = TestUtilities.deserialize(json, Blueprint.class);
    assertTrue(blueprintModelNew instanceof Blueprint);
    assertEquals(blueprintModelNew.getName(), "testString");
    assertEquals(blueprintModelNew.getDescription(), "testString");
    assertEquals(blueprintModelNew.getSource().toString(), externalSourceModel.toString());
    assertEquals(blueprintModelNew.getFlow().toString(), flowModel.toString());
    assertEquals(blueprintModelNew.get("foo"), "testString");
  }
}