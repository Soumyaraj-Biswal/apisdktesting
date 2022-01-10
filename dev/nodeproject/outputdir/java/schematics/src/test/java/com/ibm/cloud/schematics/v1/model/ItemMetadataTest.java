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

import com.ibm.cloud.schematics.v1.model.ItemMetadata;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
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
 * Unit test class for the ItemMetadata model.
 */
public class ItemMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testItemMetadata() throws Throwable {
    ItemMetadata itemMetadataModel = new ItemMetadata();
    assertNull(itemMetadataModel.getItemId());
    assertNull(itemMetadataModel.getOfferingId());
    assertNull(itemMetadataModel.getOfferingKindId());
    assertNull(itemMetadataModel.getOfferingVersionId());
    assertNull(itemMetadataModel.getName());
    assertNull(itemMetadataModel.getDescription());
    assertNull(itemMetadataModel.getOperations());
    assertNull(itemMetadataModel.getInputs());
    assertNull(itemMetadataModel.getSettings());
    assertNull(itemMetadataModel.getOutputs());
  }
}