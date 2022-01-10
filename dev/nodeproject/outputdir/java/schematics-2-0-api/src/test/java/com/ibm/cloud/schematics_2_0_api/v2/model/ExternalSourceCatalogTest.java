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

import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExternalSourceCatalog model.
 */
public class ExternalSourceCatalogTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExternalSourceCatalog() throws Throwable {
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

    String json = TestUtilities.serialize(externalSourceCatalogModel);

    ExternalSourceCatalog externalSourceCatalogModelNew = TestUtilities.deserialize(json, ExternalSourceCatalog.class);
    assertTrue(externalSourceCatalogModelNew instanceof ExternalSourceCatalog);
    assertEquals(externalSourceCatalogModelNew.getCatalogName(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingName(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingVersion(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingKind(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingId(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingVersionId(), "testString");
    assertEquals(externalSourceCatalogModelNew.getOfferingRepoUrl(), "testString");
    assertEquals(externalSourceCatalogModelNew.get("foo"), "testString");
  }
}