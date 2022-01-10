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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkspaceJob;
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
 * Unit test class for the JobLogSummary model.
 */
public class JobLogSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummary() throws Throwable {
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryRepoDownloadJobModel.get("foo"), "testString");

    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryWorkspaceJobModel.get("foo"), "testString");

    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("testString")
      .jobId("testString")
      .logUrl("testString")
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryWorkitemsModel.getWorkspaceId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.getJobId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.getLogUrl(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.get("foo"), "testString");

    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryFlowJobModel.getWorkitems(), new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)));
    assertEquals(jobLogSummaryFlowJobModel.get("foo"), "testString");

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

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummarySystemJobModel.getSuccess(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.getFailed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.get("foo"), "testString");

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .add("foo", "testString")
      .build();
    assertEquals(jobLogSummaryModel.getJobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.getRepoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.getWorkspaceJob(), jobLogSummaryWorkspaceJobModel);
    assertEquals(jobLogSummaryModel.getFlowJob(), jobLogSummaryFlowJobModel);
    assertEquals(jobLogSummaryModel.getActionJob(), jobLogSummaryActionJobModel);
    assertEquals(jobLogSummaryModel.getSystemJob(), jobLogSummarySystemJobModel);
    assertEquals(jobLogSummaryModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobLogSummaryModel);

    JobLogSummary jobLogSummaryModelNew = TestUtilities.deserialize(json, JobLogSummary.class);
    assertTrue(jobLogSummaryModelNew instanceof JobLogSummary);
    assertEquals(jobLogSummaryModelNew.getJobType(), "repo_download_job");
    assertEquals(jobLogSummaryModelNew.getRepoDownloadJob().toString(), jobLogSummaryRepoDownloadJobModel.toString());
    assertEquals(jobLogSummaryModelNew.getWorkspaceJob().toString(), jobLogSummaryWorkspaceJobModel.toString());
    assertEquals(jobLogSummaryModelNew.getFlowJob().toString(), jobLogSummaryFlowJobModel.toString());
    assertEquals(jobLogSummaryModelNew.getActionJob().toString(), jobLogSummaryActionJobModel.toString());
    assertEquals(jobLogSummaryModelNew.getSystemJob().toString(), jobLogSummarySystemJobModel.toString());
    assertEquals(jobLogSummaryModelNew.get("foo"), "testString");
  }
}