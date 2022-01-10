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

import com.ibm.cloud.schematics_2_0_api.v2.model.Connection;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecret;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecretApikey;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
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
 * Unit test class for the Connection model.
 */
public class ConnectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConnection() throws Throwable {
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

    ConnectionSecretApikey connectionSecretApikeyModel = new ConnectionSecretApikey.Builder()
      .key("testString")
      .add("foo", "testString")
      .build();
    assertEquals(connectionSecretApikeyModel.getKey(), "testString");
    assertEquals(connectionSecretApikeyModel.get("foo"), "testString");

    ConnectionSecret connectionSecretModel = new ConnectionSecret.Builder()
      .type("apikey")
      .apikey(connectionSecretApikeyModel)
      .add("foo", "testString")
      .build();
    assertEquals(connectionSecretModel.getType(), "apikey");
    assertEquals(connectionSecretModel.getApikey(), connectionSecretApikeyModel);
    assertEquals(connectionSecretModel.get("foo"), "testString");

    Connection connectionModel = new Connection.Builder()
      .name("testString")
      .description("testString")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .connectionDetails(externalSourceModel)
      .connectionSecrets(connectionSecretModel)
      .add("foo", "testString")
      .build();
    assertEquals(connectionModel.getName(), "testString");
    assertEquals(connectionModel.getDescription(), "testString");
    assertEquals(connectionModel.getResourceGroup(), "testString");
    assertEquals(connectionModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(connectionModel.getConnectionDetails(), externalSourceModel);
    assertEquals(connectionModel.getConnectionSecrets(), connectionSecretModel);
    assertEquals(connectionModel.get("foo"), "testString");

    String json = TestUtilities.serialize(connectionModel);

    Connection connectionModelNew = TestUtilities.deserialize(json, Connection.class);
    assertTrue(connectionModelNew instanceof Connection);
    assertEquals(connectionModelNew.getName(), "testString");
    assertEquals(connectionModelNew.getDescription(), "testString");
    assertEquals(connectionModelNew.getResourceGroup(), "testString");
    assertEquals(connectionModelNew.getConnectionDetails().toString(), externalSourceModel.toString());
    assertEquals(connectionModelNew.getConnectionSecrets().toString(), connectionSecretModel.toString());
    assertEquals(connectionModelNew.get("foo"), "testString");
  }
}