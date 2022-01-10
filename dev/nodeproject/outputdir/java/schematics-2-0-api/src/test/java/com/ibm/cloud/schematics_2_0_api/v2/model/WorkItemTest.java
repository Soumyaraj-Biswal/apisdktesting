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

import com.ibm.cloud.schematics_2_0_api.v2.model.BlueprintVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
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
 * Unit test class for the WorkItem model.
 */
public class WorkItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkItem() throws Throwable {
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

    String json = TestUtilities.serialize(workItemModel);

    WorkItem workItemModelNew = TestUtilities.deserialize(json, WorkItem.class);
    assertTrue(workItemModelNew instanceof WorkItem);
    assertEquals(workItemModelNew.getWorkitemObjectId(), "testString");
    assertEquals(workItemModelNew.getWorkitemObjectType(), "workspace");
    assertEquals(workItemModelNew.getName(), "testString");
    assertEquals(workItemModelNew.getLayer(), "testString");
    assertEquals(workItemModelNew.getSource().toString(), externalSourceModel.toString());
    assertEquals(workItemModelNew.getTags(), "testString");
    assertEquals(workItemModelNew.getLastJob().toString(), workItemLastJobModel.toString());
    assertEquals(workItemModelNew.get("foo"), "testString");
  }
}