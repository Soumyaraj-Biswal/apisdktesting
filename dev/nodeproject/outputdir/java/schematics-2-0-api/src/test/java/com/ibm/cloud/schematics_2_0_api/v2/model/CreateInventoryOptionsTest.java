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

import com.ibm.cloud.schematics_2_0_api.v2.model.CreateInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceDefinition;
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
 * Unit test class for the CreateInventoryOptions model.
 */
public class CreateInventoryOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInventoryOptions() throws Throwable {
    InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(inventoryResourceDefinitionModel.getName(), "testString");
    assertEquals(inventoryResourceDefinitionModel.getDescription(), "testString");
    assertEquals(inventoryResourceDefinitionModel.getLocation(), "us-south");
    assertEquals(inventoryResourceDefinitionModel.getResourceGroup(), "testString");
    assertEquals(inventoryResourceDefinitionModel.getInventoriesIni(), "testString");
    assertEquals(inventoryResourceDefinitionModel.getResourceQueries(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(inventoryResourceDefinitionModel.get("foo"), "testString");

    CreateInventoryOptions createInventoryOptionsModel = new CreateInventoryOptions.Builder()
      .inventoryResourceDefinition(inventoryResourceDefinitionModel)
      .build();
    assertEquals(createInventoryOptionsModel.inventoryResourceDefinition(), inventoryResourceDefinitionModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInventoryOptionsError() throws Throwable {
    new CreateInventoryOptions.Builder().build();
  }

}