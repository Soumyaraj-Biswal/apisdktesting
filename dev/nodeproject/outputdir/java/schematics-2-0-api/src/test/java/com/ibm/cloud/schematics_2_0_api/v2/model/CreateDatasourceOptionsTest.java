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

import com.ibm.cloud.schematics_2_0_api.v2.model.CreateDatasourceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.Datasource;
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
 * Unit test class for the CreateDatasourceOptions model.
 */
public class CreateDatasourceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDatasourceOptions() throws Throwable {
    Datasource datasourceModel = new Datasource.Builder()
      .name("testString")
      .description("testString")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .sourceType("git")
      .dataSource("testString")
      .connection("testString")
      .replicaEnabled(true)
      .replicaInvalidationFrequency("hourly")
      .add("foo", "testString")
      .build();
    assertEquals(datasourceModel.getName(), "testString");
    assertEquals(datasourceModel.getDescription(), "testString");
    assertEquals(datasourceModel.getResourceGroup(), "testString");
    assertEquals(datasourceModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(datasourceModel.getSourceType(), "git");
    assertEquals(datasourceModel.getDataSource(), "testString");
    assertEquals(datasourceModel.getConnection(), "testString");
    assertEquals(datasourceModel.isReplicaEnabled(), Boolean.valueOf(true));
    assertEquals(datasourceModel.getReplicaInvalidationFrequency(), "hourly");
    assertEquals(datasourceModel.get("foo"), "testString");

    CreateDatasourceOptions createDatasourceOptionsModel = new CreateDatasourceOptions.Builder()
      .datasource(datasourceModel)
      .build();
    assertEquals(createDatasourceOptionsModel.datasource(), datasourceModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatasourceOptionsError() throws Throwable {
    new CreateDatasourceOptions.Builder().build();
  }

}