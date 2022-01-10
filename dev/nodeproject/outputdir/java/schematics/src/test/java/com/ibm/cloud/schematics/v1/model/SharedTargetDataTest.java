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

import com.ibm.cloud.schematics.v1.model.SharedTargetData;
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
 * Unit test class for the SharedTargetData model.
 */
public class SharedTargetDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSharedTargetData() throws Throwable {
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

    String json = TestUtilities.serialize(sharedTargetDataModel);

    SharedTargetData sharedTargetDataModelNew = TestUtilities.deserialize(json, SharedTargetData.class);
    assertTrue(sharedTargetDataModelNew instanceof SharedTargetData);
    assertEquals(sharedTargetDataModelNew.clusterCreatedOn(), "testString");
    assertEquals(sharedTargetDataModelNew.clusterId(), "testString");
    assertEquals(sharedTargetDataModelNew.clusterName(), "testString");
    assertEquals(sharedTargetDataModelNew.clusterType(), "testString");
    assertEquals(sharedTargetDataModelNew.namespace(), "testString");
    assertEquals(sharedTargetDataModelNew.region(), "testString");
    assertEquals(sharedTargetDataModelNew.resourceGroupId(), "testString");
    assertEquals(sharedTargetDataModelNew.workerCount(), Long.valueOf("26"));
    assertEquals(sharedTargetDataModelNew.workerMachineType(), "testString");
  }
}