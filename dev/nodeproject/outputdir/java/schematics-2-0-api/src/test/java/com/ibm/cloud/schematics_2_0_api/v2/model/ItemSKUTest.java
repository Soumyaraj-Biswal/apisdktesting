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

import com.ibm.cloud.schematics_2_0_api.v2.model.ItemSKU;
import com.ibm.cloud.schematics_2_0_api.v2.model.SKUUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ItemSKU model.
 */
public class ItemSKUTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testItemSKU() throws Throwable {
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

    SKUUserState skuUserStateModel = new SKUUserState.Builder()
      .state("testString")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(skuUserStateModel.getState(), "testString");
    assertEquals(skuUserStateModel.getSetBy(), "testString");
    assertEquals(skuUserStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(skuUserStateModel.get("foo"), "testString");

    ItemSKU itemSkuModel = new ItemSKU.Builder()
      .skuId("testString")
      .skuType("testString")
      .skuSysLock(systemLockModel)
      .skuUserState(skuUserStateModel)
      .add("foo", "testString")
      .build();
    assertEquals(itemSkuModel.getSkuId(), "testString");
    assertEquals(itemSkuModel.getSkuType(), "testString");
    assertEquals(itemSkuModel.getSkuSysLock(), systemLockModel);
    assertEquals(itemSkuModel.getSkuUserState(), skuUserStateModel);
    assertEquals(itemSkuModel.get("foo"), "testString");

    String json = TestUtilities.serialize(itemSkuModel);

    ItemSKU itemSkuModelNew = TestUtilities.deserialize(json, ItemSKU.class);
    assertTrue(itemSkuModelNew instanceof ItemSKU);
    assertEquals(itemSkuModelNew.getSkuId(), "testString");
    assertEquals(itemSkuModelNew.getSkuType(), "testString");
    assertEquals(itemSkuModelNew.getSkuSysLock().toString(), systemLockModel.toString());
    assertEquals(itemSkuModelNew.getSkuUserState().toString(), skuUserStateModel.toString());
    assertEquals(itemSkuModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testItemSKUError() throws Throwable {
    new ItemSKU.Builder().build();
  }

}