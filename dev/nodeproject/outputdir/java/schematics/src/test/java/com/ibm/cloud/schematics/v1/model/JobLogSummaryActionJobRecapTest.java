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

import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
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
 * Unit test class for the JobLogSummaryActionJobRecap model.
 */
public class JobLogSummaryActionJobRecapTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummaryActionJobRecap() throws Throwable {
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("72.5"));

    String json = TestUtilities.serialize(jobLogSummaryActionJobRecapModel);

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModelNew = TestUtilities.deserialize(json, JobLogSummaryActionJobRecap.class);
    assertTrue(jobLogSummaryActionJobRecapModelNew instanceof JobLogSummaryActionJobRecap);
    assertEquals(jobLogSummaryActionJobRecapModelNew.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModelNew.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModelNew.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModelNew.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModelNew.unreachable(), Double.valueOf("72.5"));
  }
}