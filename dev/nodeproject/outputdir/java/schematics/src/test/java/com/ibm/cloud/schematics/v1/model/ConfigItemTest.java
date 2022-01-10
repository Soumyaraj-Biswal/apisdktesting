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

import com.ibm.cloud.schematics.v1.model.BlueprintVariableData;
import com.ibm.cloud.schematics.v1.model.ConfigItem;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics.v1.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
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
 * Unit test class for the ConfigItem model.
 */
public class ConfigItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigItem() throws Throwable {
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

    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
      .name("testString")
      .value("testString")
      .build();
    assertEquals(blueprintVariableDataModel.name(), "testString");
    assertEquals(blueprintVariableDataModel.value(), "testString");

    ConfigItem configItemModel = new ConfigItem.Builder()
      .name("testString")
      .description("testString")
      .source(externalSourceModel)
      .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
      .build();
    assertEquals(configItemModel.name(), "testString");
    assertEquals(configItemModel.description(), "testString");
    assertEquals(configItemModel.source(), externalSourceModel);
    assertEquals(configItemModel.inputs(), new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)));

    String json = TestUtilities.serialize(configItemModel);

    ConfigItem configItemModelNew = TestUtilities.deserialize(json, ConfigItem.class);
    assertTrue(configItemModelNew instanceof ConfigItem);
    assertEquals(configItemModelNew.name(), "testString");
    assertEquals(configItemModelNew.description(), "testString");
    assertEquals(configItemModelNew.source().toString(), externalSourceModel.toString());
  }
}