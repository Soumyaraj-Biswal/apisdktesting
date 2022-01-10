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

import com.ibm.cloud.schematics.v1.model.Blueprint;
import com.ibm.cloud.schematics.v1.model.BlueprintVariableData;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics.v1.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
import com.ibm.cloud.schematics.v1.model.Flow;
import com.ibm.cloud.schematics.v1.model.FlowOperations;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.model.WorkItem;
import com.ibm.cloud.schematics.v1.model.WorkItemLastJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
      .build();
    assertEquals(externalSourceGitModel.computedGitRepoUrl(), "testString");
    assertEquals(externalSourceGitModel.gitRepoUrl(), "testString");
    assertEquals(externalSourceGitModel.gitToken(), "testString");
    assertEquals(externalSourceGitModel.gitRepoFolder(), "testString");
    assertEquals(externalSourceGitModel.gitRelease(), "testString");
    assertEquals(externalSourceGitModel.gitBranch(), "testString");

    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
      .catalogName("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringRepoUrl("testString")
      .build();
    assertEquals(externalSourceCatalogModel.catalogName(), "testString");
    assertEquals(externalSourceCatalogModel.offeringName(), "testString");
    assertEquals(externalSourceCatalogModel.offeringVersion(), "testString");
    assertEquals(externalSourceCatalogModel.offeringKind(), "testString");
    assertEquals(externalSourceCatalogModel.offeringId(), "testString");
    assertEquals(externalSourceCatalogModel.offeringVersionId(), "testString");
    assertEquals(externalSourceCatalogModel.offeringRepoUrl(), "testString");

    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
      .cosBucketUrl("testString")
      .build();
    assertEquals(externalSourceCosBucketModel.cosBucketUrl(), "testString");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(externalSourceGitModel)
      .catalog(externalSourceCatalogModel)
      .cosBucket(externalSourceCosBucketModel)
      .build();
    assertEquals(externalSourceModel.sourceType(), "local");
    assertEquals(externalSourceModel.git(), externalSourceGitModel);
    assertEquals(externalSourceModel.catalog(), externalSourceCatalogModel);
    assertEquals(externalSourceModel.cosBucket(), externalSourceCosBucketModel);

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
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
      .name("testString")
      .value("testString")
      .build();
    assertEquals(blueprintVariableDataModel.name(), "testString");
    assertEquals(blueprintVariableDataModel.value(), "testString");

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
      .build();
    assertEquals(workItemModel.workitemObjectId(), "testString");
    assertEquals(workItemModel.workitemObjectType(), "workspace");
    assertEquals(workItemModel.name(), "testString");
    assertEquals(workItemModel.layer(), "testString");
    assertEquals(workItemModel.source(), externalSourceModel);
    assertEquals(workItemModel.tags(), "testString");
    assertEquals(workItemModel.inputs(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.outputs(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.settings(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));
    assertEquals(workItemModel.lastJob(), workItemLastJobModel);

    FlowOperations flowOperationsModel = new FlowOperations.Builder()
      .install("testString")
      .update("testString")
      .uninstall("testString")
      .configure("testString")
      .build();
    assertEquals(flowOperationsModel.install(), "testString");
    assertEquals(flowOperationsModel.update(), "testString");
    assertEquals(flowOperationsModel.uninstall(), "testString");
    assertEquals(flowOperationsModel.configure(), "testString");

    Flow flowModel = new Flow.Builder()
      .type("testString")
      .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
      .build();
    assertEquals(flowModel.type(), "testString");
    assertEquals(flowModel.operations(), new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)));

    Blueprint blueprintModel = new Blueprint.Builder()
      .name("testString")
      .description("testString")
      .source(externalSourceModel)
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .workitems(new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)))
      .flow(flowModel)
      .build();
    assertEquals(blueprintModel.name(), "testString");
    assertEquals(blueprintModel.description(), "testString");
    assertEquals(blueprintModel.source(), externalSourceModel);
    assertEquals(blueprintModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(blueprintModel.workitems(), new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)));
    assertEquals(blueprintModel.flow(), flowModel);

    String json = TestUtilities.serialize(blueprintModel);

    Blueprint blueprintModelNew = TestUtilities.deserialize(json, Blueprint.class);
    assertTrue(blueprintModelNew instanceof Blueprint);
    assertEquals(blueprintModelNew.name(), "testString");
    assertEquals(blueprintModelNew.description(), "testString");
    assertEquals(blueprintModelNew.source().toString(), externalSourceModel.toString());
    assertEquals(blueprintModelNew.flow().toString(), flowModel.toString());
  }
}