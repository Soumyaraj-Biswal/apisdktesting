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

import com.ibm.cloud.schematics_2_0_api.v2.model.Adapter;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateAdapterOptions;
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
 * Unit test class for the CreateAdapterOptions model.
 */
public class CreateAdapterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateAdapterOptions() throws Throwable {
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

    Adapter adapterModel = new Adapter.Builder()
      .adapterName("testString")
      .adapterType("scm_adapter")
      .location("us-south")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .adapterEndpointUrl("testString")
      .serviceId("testString")
      .apikey("testString")
      .userState(userStateModel)
      .ignoreInflightOperations(true)
      .adapterId("testString")
      .registeredBy("testString")
      .registeredAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .updatedBy("testString")
      .sysLock(systemLockModel)
      .adapterHealth("active")
      .lastHealthCheckedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(adapterModel.getAdapterName(), "testString");
    assertEquals(adapterModel.getAdapterType(), "scm_adapter");
    assertEquals(adapterModel.getLocation(), "us-south");
    assertEquals(adapterModel.getResourceGroup(), "testString");
    assertEquals(adapterModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(adapterModel.getAdapterEndpointUrl(), "testString");
    assertEquals(adapterModel.getServiceId(), "testString");
    assertEquals(adapterModel.getApikey(), "testString");
    assertEquals(adapterModel.getUserState(), userStateModel);
    assertEquals(adapterModel.isIgnoreInflightOperations(), Boolean.valueOf(true));
    assertEquals(adapterModel.getAdapterId(), "testString");
    assertEquals(adapterModel.getRegisteredBy(), "testString");
    assertEquals(adapterModel.getRegisteredAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(adapterModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(adapterModel.getUpdatedBy(), "testString");
    assertEquals(adapterModel.getSysLock(), systemLockModel);
    assertEquals(adapterModel.getAdapterHealth(), "active");
    assertEquals(adapterModel.getLastHealthCheckedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(adapterModel.get("foo"), "testString");

    CreateAdapterOptions createAdapterOptionsModel = new CreateAdapterOptions.Builder()
      .adapter(adapterModel)
      .build();
    assertEquals(createAdapterOptionsModel.adapter(), adapterModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAdapterOptionsError() throws Throwable {
    new CreateAdapterOptions.Builder().build();
  }

}