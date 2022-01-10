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

import com.ibm.cloud.schematics_2_0_api.v2.model.BastionResourceDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.Job;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobData;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkitem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.Trigger;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerScheduled;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
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
 * Unit test class for the TriggerList model.
 */
public class TriggerListTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerList() throws Throwable {
    TriggerList triggerListModel = new TriggerList();
    assertNull(triggerListModel.getTotalCount());
    assertNull(triggerListModel.getLimit());
    assertNull(triggerListModel.getOffset());
    assertNull(triggerListModel.getTriggers());
  }
}