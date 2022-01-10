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

import com.ibm.cloud.schematics.v1.model.ItemSKU;
import com.ibm.cloud.schematics.v1.model.SKUUserState;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
      .build();
    assertEquals(systemLockModel.sysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.sysLockedBy(), "testString");
    assertEquals(systemLockModel.sysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    SKUUserState skuUserStateModel = new SKUUserState.Builder()
      .state("testString")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(skuUserStateModel.state(), "testString");
    assertEquals(skuUserStateModel.setBy(), "testString");
    assertEquals(skuUserStateModel.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    ItemSKU itemSkuModel = new ItemSKU.Builder()
      .skuId("testString")
      .skuType("testString")
      .skuSysLock(systemLockModel)
      .skuUserState(skuUserStateModel)
      .build();
    assertEquals(itemSkuModel.skuId(), "testString");
    assertEquals(itemSkuModel.skuType(), "testString");
    assertEquals(itemSkuModel.skuSysLock(), systemLockModel);
    assertEquals(itemSkuModel.skuUserState(), skuUserStateModel);

    String json = TestUtilities.serialize(itemSkuModel);

    ItemSKU itemSkuModelNew = TestUtilities.deserialize(json, ItemSKU.class);
    assertTrue(itemSkuModelNew instanceof ItemSKU);
    assertEquals(itemSkuModelNew.skuId(), "testString");
    assertEquals(itemSkuModelNew.skuType(), "testString");
    assertEquals(itemSkuModelNew.skuSysLock().toString(), systemLockModel.toString());
    assertEquals(itemSkuModelNew.skuUserState().toString(), skuUserStateModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testItemSKUError() throws Throwable {
    new ItemSKU.Builder().build();
  }

}