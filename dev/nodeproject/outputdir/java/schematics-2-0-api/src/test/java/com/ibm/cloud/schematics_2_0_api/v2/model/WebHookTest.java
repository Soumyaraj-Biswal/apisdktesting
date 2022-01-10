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

import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.WebHook;
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
 * Unit test class for the WebHook model.
 */
public class WebHookTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWebHook() throws Throwable {
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

    WebHook webHookModel = new WebHook.Builder()
      .commandName("workspace_plan")
      .hookType("hook")
      .hookSite("before")
      .location("us-south")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .hookEndpointUrl("testString")
      .serviceId("testString")
      .apikey("testString")
      .userState(userStateModel)
      .ignoreInflightOperations(true)
      .sysLock(systemLockModel)
      .add("foo", "testString")
      .build();
    assertEquals(webHookModel.getCommandName(), "workspace_plan");
    assertEquals(webHookModel.getHookType(), "hook");
    assertEquals(webHookModel.getHookSite(), "before");
    assertEquals(webHookModel.getLocation(), "us-south");
    assertEquals(webHookModel.getResourceGroup(), "testString");
    assertEquals(webHookModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(webHookModel.getHookEndpointUrl(), "testString");
    assertEquals(webHookModel.getServiceId(), "testString");
    assertEquals(webHookModel.getApikey(), "testString");
    assertEquals(webHookModel.getUserState(), userStateModel);
    assertEquals(webHookModel.isIgnoreInflightOperations(), Boolean.valueOf(true));
    assertEquals(webHookModel.getSysLock(), systemLockModel);
    assertEquals(webHookModel.get("foo"), "testString");

    String json = TestUtilities.serialize(webHookModel);

    WebHook webHookModelNew = TestUtilities.deserialize(json, WebHook.class);
    assertTrue(webHookModelNew instanceof WebHook);
    assertEquals(webHookModelNew.getCommandName(), "workspace_plan");
    assertEquals(webHookModelNew.getHookType(), "hook");
    assertEquals(webHookModelNew.getHookSite(), "before");
    assertEquals(webHookModelNew.getLocation(), "us-south");
    assertEquals(webHookModelNew.getResourceGroup(), "testString");
    assertEquals(webHookModelNew.getHookEndpointUrl(), "testString");
    assertEquals(webHookModelNew.getServiceId(), "testString");
    assertEquals(webHookModelNew.getApikey(), "testString");
    assertEquals(webHookModelNew.getUserState().toString(), userStateModel.toString());
    assertEquals(webHookModelNew.isIgnoreInflightOperations(), Boolean.valueOf(true));
    assertEquals(webHookModelNew.getSysLock().toString(), systemLockModel.toString());
    assertEquals(webHookModelNew.get("foo"), "testString");
  }
}