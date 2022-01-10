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

import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultEvidences;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobResultCapsule;
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
 * Unit test class for the JobResultCapsule model.
 */
public class JobResultCapsuleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobResultCapsule() throws Throwable {
    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
      .name("testString")
      .type("testString")
      .add("foo", "testString")
      .build();
    assertEquals(capsuleResultResourcesModel.getName(), "testString");
    assertEquals(capsuleResultResourcesModel.getType(), "testString");
    assertEquals(capsuleResultResourcesModel.get("foo"), "testString");

    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
      .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
      .add("foo", "testString")
      .build();
    assertEquals(capsuleResultEvidencesModel.getResources(), new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)));
    assertEquals(capsuleResultEvidencesModel.get("foo"), "testString");

    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
      .jobId("testString")
      .jobName("testString")
      .policy("testString")
      .severity(Long.valueOf("1"))
      .jobState("success")
      .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobResultCapsuleModel.getJobId(), "testString");
    assertEquals(jobResultCapsuleModel.getJobName(), "testString");
    assertEquals(jobResultCapsuleModel.getPolicy(), "testString");
    assertEquals(jobResultCapsuleModel.getSeverity(), Long.valueOf("1"));
    assertEquals(jobResultCapsuleModel.getJobState(), "success");
    assertEquals(jobResultCapsuleModel.getFailures(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobResultCapsuleModel.getPassed(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobResultCapsuleModel.getEvidences(), new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)));
    assertEquals(jobResultCapsuleModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobResultCapsuleModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobResultCapsuleModel);

    JobResultCapsule jobResultCapsuleModelNew = TestUtilities.deserialize(json, JobResultCapsule.class);
    assertTrue(jobResultCapsuleModelNew instanceof JobResultCapsule);
    assertEquals(jobResultCapsuleModelNew.getJobId(), "testString");
    assertEquals(jobResultCapsuleModelNew.getJobName(), "testString");
    assertEquals(jobResultCapsuleModelNew.getPolicy(), "testString");
    assertEquals(jobResultCapsuleModelNew.getSeverity(), Long.valueOf("1"));
    assertEquals(jobResultCapsuleModelNew.getJobState(), "success");
    assertEquals(jobResultCapsuleModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobResultCapsuleModelNew.get("foo"), "testString");
  }
}