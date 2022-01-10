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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJobRecap;
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
 * Unit test class for the JobLogSummaryActionJob model.
 */
public class JobLogSummaryActionJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummaryActionJob() throws Throwable {
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.getTarget(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.getOk(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getChanged(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getFailed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getSkipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.getUnreachable(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.get("foo"), "testString");

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryActionJobModel.getRecap(), jobLogSummaryActionJobRecapModel);
    assertEquals(jobLogSummaryActionJobModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobLogSummaryActionJobModel);

    JobLogSummaryActionJob jobLogSummaryActionJobModelNew = TestUtilities.deserialize(json, JobLogSummaryActionJob.class);
    assertTrue(jobLogSummaryActionJobModelNew instanceof JobLogSummaryActionJob);
    assertEquals(jobLogSummaryActionJobModelNew.getRecap().toString(), jobLogSummaryActionJobRecapModel.toString());
    assertEquals(jobLogSummaryActionJobModelNew.get("foo"), "testString");
  }
}