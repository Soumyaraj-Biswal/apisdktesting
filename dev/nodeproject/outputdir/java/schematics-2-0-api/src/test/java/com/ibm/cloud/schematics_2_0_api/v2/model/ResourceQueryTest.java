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

import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQuery;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryParam;
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
 * Unit test class for the ResourceQuery model.
 */
public class ResourceQueryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceQuery() throws Throwable {
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
      .name("testString")
      .value("testString")
      .description("testString")
      .add("foo", "testString")
      .build();
    assertEquals(resourceQueryParamModel.getName(), "testString");
    assertEquals(resourceQueryParamModel.getValue(), "testString");
    assertEquals(resourceQueryParamModel.getDescription(), "testString");
    assertEquals(resourceQueryParamModel.get("foo"), "testString");

    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
      .queryType("workspaces")
      .queryCondition(new java.util.ArrayList<ResourceQueryParam>(java.util.Arrays.asList(resourceQueryParamModel)))
      .querySelect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(resourceQueryModel.getQueryType(), "workspaces");
    assertEquals(resourceQueryModel.getQueryCondition(), new java.util.ArrayList<ResourceQueryParam>(java.util.Arrays.asList(resourceQueryParamModel)));
    assertEquals(resourceQueryModel.getQuerySelect(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(resourceQueryModel.get("foo"), "testString");

    String json = TestUtilities.serialize(resourceQueryModel);

    ResourceQuery resourceQueryModelNew = TestUtilities.deserialize(json, ResourceQuery.class);
    assertTrue(resourceQueryModelNew instanceof ResourceQuery);
    assertEquals(resourceQueryModelNew.getQueryType(), "workspaces");
    assertEquals(resourceQueryModelNew.get("foo"), "testString");
  }
}