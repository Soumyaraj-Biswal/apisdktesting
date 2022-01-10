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

import com.ibm.cloud.schematics.v1.model.JobLite;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusFlow;
import com.ibm.cloud.schematics.v1.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics.v1.model.JobStatusSystem;
import com.ibm.cloud.schematics.v1.model.JobStatusTemplate;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkitem;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkspace;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
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
 * Unit test class for the JobLite model.
 */
public class JobLiteTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLite() throws Throwable {
    JobLite jobLiteModel = new JobLite();
    assertNull(jobLiteModel.getId());
    assertNull(jobLiteModel.getName());
    assertNull(jobLiteModel.getDescription());
    assertNull(jobLiteModel.getCommandObject());
    assertNull(jobLiteModel.getCommandObjectId());
    assertNull(jobLiteModel.getCommandName());
    assertNull(jobLiteModel.getTags());
    assertNull(jobLiteModel.getLocation());
    assertNull(jobLiteModel.getResourceGroup());
    assertNull(jobLiteModel.getSubmittedAt());
    assertNull(jobLiteModel.getSubmittedBy());
    assertNull(jobLiteModel.getDuration());
    assertNull(jobLiteModel.getStartAt());
    assertNull(jobLiteModel.getEndAt());
    assertNull(jobLiteModel.getStatus());
    assertNull(jobLiteModel.getLogSummary());
    assertNull(jobLiteModel.getUpdatedAt());
  }
}