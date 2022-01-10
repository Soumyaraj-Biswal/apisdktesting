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

import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
 * Unit test class for the CreateWorkspaceOptions model.
 */
public class CreateWorkspaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateWorkspaceOptions() throws Throwable {
    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .build();
    assertEquals(catalogRefModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogRefModel.owningAccount(), "testString");
    assertEquals(catalogRefModel.itemIconUrl(), "testString");
    assertEquals(catalogRefModel.itemId(), "testString");
    assertEquals(catalogRefModel.itemName(), "testString");
    assertEquals(catalogRefModel.itemReadmeUrl(), "testString");
    assertEquals(catalogRefModel.itemUrl(), "testString");
    assertEquals(catalogRefModel.launchUrl(), "testString");
    assertEquals(catalogRefModel.offeringVersion(), "testString");

    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();
    assertEquals(sharedTargetDataModel.clusterCreatedOn(), "testString");
    assertEquals(sharedTargetDataModel.clusterId(), "testString");
    assertEquals(sharedTargetDataModel.clusterName(), "testString");
    assertEquals(sharedTargetDataModel.clusterType(), "testString");
    assertEquals(sharedTargetDataModel.entitlementKeys(), new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")));
    assertEquals(sharedTargetDataModel.namespace(), "testString");
    assertEquals(sharedTargetDataModel.region(), "testString");
    assertEquals(sharedTargetDataModel.resourceGroupId(), "testString");
    assertEquals(sharedTargetDataModel.workerCount(), Long.valueOf("26"));
    assertEquals(sharedTargetDataModel.workerMachineType(), "testString");

    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();
    assertEquals(workspaceVariableRequestModel.description(), "testString");
    assertEquals(workspaceVariableRequestModel.name(), "testString");
    assertEquals(workspaceVariableRequestModel.secure(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.type(), "testString");
    assertEquals(workspaceVariableRequestModel.useDefault(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.value(), "testString");

    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .folder("testString")
      .compact(true)
      .initStateFile("testString")
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();
    assertEquals(templateSourceDataRequestModel.envValues(), new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")));
    assertEquals(templateSourceDataRequestModel.folder(), "testString");
    assertEquals(templateSourceDataRequestModel.compact(), Boolean.valueOf(true));
    assertEquals(templateSourceDataRequestModel.initStateFile(), "testString");
    assertEquals(templateSourceDataRequestModel.type(), "testString");
    assertEquals(templateSourceDataRequestModel.uninstallScriptName(), "testString");
    assertEquals(templateSourceDataRequestModel.values(), "testString");
    assertEquals(templateSourceDataRequestModel.valuesMetadata(), new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")));
    assertEquals(templateSourceDataRequestModel.variablestore(), new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)));

    TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();
    assertEquals(templateRepoRequestModel.branch(), "testString");
    assertEquals(templateRepoRequestModel.release(), "testString");
    assertEquals(templateRepoRequestModel.repoShaValue(), "testString");
    assertEquals(templateRepoRequestModel.repoUrl(), "testString");
    assertEquals(templateRepoRequestModel.url(), "testString");

    WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(workspaceStatusRequestModel.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusRequestModel.frozenBy(), "testString");
    assertEquals(workspaceStatusRequestModel.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.lockedBy(), "testString");
    assertEquals(workspaceStatusRequestModel.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    CreateWorkspaceOptions createWorkspaceOptionsModel = new CreateWorkspaceOptions.Builder()
      .appliedShareddataIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .catalogRef(catalogRefModel)
      .description("testString")
      .location("testString")
      .name("testString")
      .resourceGroup("testString")
      .sharedData(sharedTargetDataModel)
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .templateRef("testString")
      .templateRepo(templateRepoRequestModel)
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .workspaceStatus(workspaceStatusRequestModel)
      .xGithubToken("testString")
      .build();
    assertEquals(createWorkspaceOptionsModel.appliedShareddataIds(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createWorkspaceOptionsModel.catalogRef(), catalogRefModel);
    assertEquals(createWorkspaceOptionsModel.description(), "testString");
    assertEquals(createWorkspaceOptionsModel.location(), "testString");
    assertEquals(createWorkspaceOptionsModel.name(), "testString");
    assertEquals(createWorkspaceOptionsModel.resourceGroup(), "testString");
    assertEquals(createWorkspaceOptionsModel.sharedData(), sharedTargetDataModel);
    assertEquals(createWorkspaceOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createWorkspaceOptionsModel.templateData(), new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)));
    assertEquals(createWorkspaceOptionsModel.templateRef(), "testString");
    assertEquals(createWorkspaceOptionsModel.templateRepo(), templateRepoRequestModel);
    assertEquals(createWorkspaceOptionsModel.type(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createWorkspaceOptionsModel.workspaceStatus(), workspaceStatusRequestModel);
    assertEquals(createWorkspaceOptionsModel.xGithubToken(), "testString");
  }
}