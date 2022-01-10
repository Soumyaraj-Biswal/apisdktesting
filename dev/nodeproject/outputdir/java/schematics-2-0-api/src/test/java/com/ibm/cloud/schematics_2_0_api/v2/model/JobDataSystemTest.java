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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataSystem;
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
 * Unit test class for the JobDataSystem model.
 */
public class JobDataSystemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobDataSystem() throws Throwable {
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobDataSystemModel.getKeyId(), "testString");
    assertEquals(jobDataSystemModel.getSchematicsResourceId(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobDataSystemModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataSystemModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobDataSystemModel);

    JobDataSystem jobDataSystemModelNew = TestUtilities.deserialize(json, JobDataSystem.class);
    assertTrue(jobDataSystemModelNew instanceof JobDataSystem);
    assertEquals(jobDataSystemModelNew.getKeyId(), "testString");
    assertEquals(jobDataSystemModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataSystemModelNew.get("foo"), "testString");
  }
}