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

import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderUserState;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CartOrderUserState model.
 */
public class CartOrderUserStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCartOrderUserState() throws Throwable {
    CartOrderUserState cartOrderUserStateModel = new CartOrderUserState.Builder()
      .state("Order_Create_Init")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(cartOrderUserStateModel.getState(), "Order_Create_Init");
    assertEquals(cartOrderUserStateModel.getSetBy(), "testString");
    assertEquals(cartOrderUserStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(cartOrderUserStateModel.get("foo"), "testString");

    String json = TestUtilities.serialize(cartOrderUserStateModel);

    CartOrderUserState cartOrderUserStateModelNew = TestUtilities.deserialize(json, CartOrderUserState.class);
    assertTrue(cartOrderUserStateModelNew instanceof CartOrderUserState);
    assertEquals(cartOrderUserStateModelNew.getState(), "Order_Create_Init");
    assertEquals(cartOrderUserStateModelNew.getSetBy(), "testString");
    assertEquals(cartOrderUserStateModelNew.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(cartOrderUserStateModelNew.get("foo"), "testString");
  }
}