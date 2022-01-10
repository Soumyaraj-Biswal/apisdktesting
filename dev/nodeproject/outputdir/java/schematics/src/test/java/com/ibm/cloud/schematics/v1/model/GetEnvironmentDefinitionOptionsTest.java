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

import com.ibm.cloud.schematics.v1.model.GetEnvironmentDefinitionOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetEnvironmentDefinitionOptions model.
 */
public class GetEnvironmentDefinitionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetEnvironmentDefinitionOptions() throws Throwable {
    GetEnvironmentDefinitionOptions getEnvironmentDefinitionOptionsModel = new GetEnvironmentDefinitionOptions.Builder()
      .offeringId("testString")
      .catalogId("testString")
      .catalogName("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .build();
    assertEquals(getEnvironmentDefinitionOptionsModel.offeringId(), "testString");
    assertEquals(getEnvironmentDefinitionOptionsModel.catalogId(), "testString");
    assertEquals(getEnvironmentDefinitionOptionsModel.catalogName(), "testString");
    assertEquals(getEnvironmentDefinitionOptionsModel.offeringName(), "testString");
    assertEquals(getEnvironmentDefinitionOptionsModel.offeringVersion(), "testString");
    assertEquals(getEnvironmentDefinitionOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getEnvironmentDefinitionOptionsModel.limit(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEnvironmentDefinitionOptionsError() throws Throwable {
    new GetEnvironmentDefinitionOptions.Builder().build();
  }

}