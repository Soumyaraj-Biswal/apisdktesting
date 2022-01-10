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

import com.ibm.cloud.schematics_2_0_api.v2.model.PrivateCluster;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
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
 * Unit test class for the PrivateCluster model.
 */
public class PrivateClusterTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivateCluster() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(userStateModel.getState(), "draft");
    assertEquals(userStateModel.getSetBy(), "testString");
    assertEquals(userStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(userStateModel.get("foo"), "testString");

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(systemLockModel.isSysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.getSysLockedBy(), "testString");
    assertEquals(systemLockModel.getSysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(systemLockModel.get("foo"), "testString");

    PrivateCluster privateClusterModel = new PrivateCluster.Builder()
      .clusterId("testString")
      .kubeConfig("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .userState(userStateModel)
      .registeredBy("testString")
      .registeredAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .updatedBy("testString")
      .sysLock(systemLockModel)
      .clusterHealth("active")
      .lastHealthCheckedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(privateClusterModel.getClusterId(), "testString");
    assertEquals(privateClusterModel.getKubeConfig(), "testString");
    assertEquals(privateClusterModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(privateClusterModel.getUserState(), userStateModel);
    assertEquals(privateClusterModel.getRegisteredBy(), "testString");
    assertEquals(privateClusterModel.getRegisteredAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModel.getUpdatedBy(), "testString");
    assertEquals(privateClusterModel.getSysLock(), systemLockModel);
    assertEquals(privateClusterModel.getClusterHealth(), "active");
    assertEquals(privateClusterModel.getLastHealthCheckedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModel.get("foo"), "testString");

    String json = TestUtilities.serialize(privateClusterModel);

    PrivateCluster privateClusterModelNew = TestUtilities.deserialize(json, PrivateCluster.class);
    assertTrue(privateClusterModelNew instanceof PrivateCluster);
    assertEquals(privateClusterModelNew.getClusterId(), "testString");
    assertEquals(privateClusterModelNew.getKubeConfig(), "testString");
    assertEquals(privateClusterModelNew.getUserState().toString(), userStateModel.toString());
    assertEquals(privateClusterModelNew.getRegisteredBy(), "testString");
    assertEquals(privateClusterModelNew.getRegisteredAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModelNew.getUpdatedBy(), "testString");
    assertEquals(privateClusterModelNew.getSysLock().toString(), systemLockModel.toString());
    assertEquals(privateClusterModelNew.getClusterHealth(), "active");
    assertEquals(privateClusterModelNew.getLastHealthCheckedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(privateClusterModelNew.get("foo"), "testString");
  }
}