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

import com.ibm.cloud.schematics_2_0_api.v2.model.AddFlowToWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspaceTemplateFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateCommand;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionSimpleFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionTemplateOperation;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowValidationSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
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
 * Unit test class for the AddFlowToWorkspaceOptions model.
 */
public class AddFlowToWorkspaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAddFlowToWorkspaceOptions() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(userStateModel.getState(), "draft");
    assertEquals(userStateModel.getSetBy(), "testString");
    assertEquals(userStateModel.getSetAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(userStateModel.get("foo"), "testString");

    TemplateCommand templateCommandModel = new TemplateCommand.Builder()
      .command("workspace_plan")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(templateCommandModel.getCommand(), "workspace_plan");
    assertEquals(templateCommandModel.getCommandOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(templateCommandModel.get("foo"), "testString");

    TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperationModel = new TemplateFlowDefinitionTemplateOperation.Builder()
      .preCondition("testString")
      .templateId("testString")
      .overrideCommand(templateCommandModel)
      .postCondition("testString")
      .onError("testString")
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDefinitionTemplateOperationModel.getPreCondition(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getTemplateId(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getOverrideCommand(), templateCommandModel);
    assertEquals(templateFlowDefinitionTemplateOperationModel.getPostCondition(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.getOnError(), "testString");
    assertEquals(templateFlowDefinitionTemplateOperationModel.get("foo"), "testString");

    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModel = new TemplateFlowDefinitionSimpleFlow.Builder()
      .index(Long.valueOf("26"))
      .control("do")
      .templateOperation(templateFlowDefinitionTemplateOperationModel)
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDefinitionSimpleFlowModel.getIndex(), Long.valueOf("26"));
    assertEquals(templateFlowDefinitionSimpleFlowModel.getControl(), "do");
    assertEquals(templateFlowDefinitionSimpleFlowModel.getTemplateOperation(), templateFlowDefinitionTemplateOperationModel);
    assertEquals(templateFlowDefinitionSimpleFlowModel.get("foo"), "testString");

    TemplateFlowDefinition templateFlowDefinitionModel = new TemplateFlowDefinition.Builder()
      .flowType("simple")
      .id("testString")
      .simpleFlow(new java.util.ArrayList<TemplateFlowDefinitionSimpleFlow>(java.util.Arrays.asList(templateFlowDefinitionSimpleFlowModel)))
      .customFlow(TestUtilities.createMockByteArray("This is a mock byte array value."))
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowDefinitionModel.getFlowType(), "simple");
    assertEquals(templateFlowDefinitionModel.getId(), "testString");
    assertEquals(templateFlowDefinitionModel.getSimpleFlow(), new java.util.ArrayList<TemplateFlowDefinitionSimpleFlow>(java.util.Arrays.asList(templateFlowDefinitionSimpleFlowModel)));
    assertEquals(templateFlowDefinitionModel.getCustomFlow(), TestUtilities.createMockByteArray("This is a mock byte array value."));
    assertEquals(templateFlowDefinitionModel.get("foo"), "testString");

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(systemLockModel.isSysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.getSysLockedBy(), "testString");
    assertEquals(systemLockModel.getSysLockedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(systemLockModel.get("foo"), "testString");

    JobStatusWorkspaceTemplateFlow jobStatusWorkspaceTemplateFlowModel = new JobStatusWorkspaceTemplateFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusWorkspaceTemplateFlowModel.getFlowId(), "testString");
    assertEquals(jobStatusWorkspaceTemplateFlowModel.getFlowName(), "testString");
    assertEquals(jobStatusWorkspaceTemplateFlowModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceTemplateFlowModel.getStatusMessage(), "testString");
    assertEquals(jobStatusWorkspaceTemplateFlowModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusWorkspaceTemplateFlowModel.get("foo"), "testString");

    TemplateFlowValidationSummary templateFlowValidationSummaryModel = new TemplateFlowValidationSummary.Builder()
      .warningCount(Double.valueOf("72.5"))
      .errorCount(Double.valueOf("72.5"))
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowValidationSummaryModel.getWarningCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModel.getErrorCount(), Double.valueOf("72.5"));
    assertEquals(templateFlowValidationSummaryModel.get("foo"), "testString");

    TemplateFlow templateFlowModel = new TemplateFlow.Builder()
      .name("testString")
      .version("testString")
      .type("simple_flow")
      .userState(userStateModel)
      .definition(templateFlowDefinitionModel)
      .sysLock(systemLockModel)
      .status(jobStatusWorkspaceTemplateFlowModel)
      .validationSummary(templateFlowValidationSummaryModel)
      .add("foo", "testString")
      .build();
    assertEquals(templateFlowModel.getName(), "testString");
    assertEquals(templateFlowModel.getVersion(), "testString");
    assertEquals(templateFlowModel.getType(), "simple_flow");
    assertEquals(templateFlowModel.getUserState(), userStateModel);
    assertEquals(templateFlowModel.getDefinition(), templateFlowDefinitionModel);
    assertEquals(templateFlowModel.getSysLock(), systemLockModel);
    assertEquals(templateFlowModel.getStatus(), jobStatusWorkspaceTemplateFlowModel);
    assertEquals(templateFlowModel.getValidationSummary(), templateFlowValidationSummaryModel);
    assertEquals(templateFlowModel.get("foo"), "testString");

    AddFlowToWorkspaceOptions addFlowToWorkspaceOptionsModel = new AddFlowToWorkspaceOptions.Builder()
      .workspaceId("testString")
      .templateFlow(templateFlowModel)
      .build();
    assertEquals(addFlowToWorkspaceOptionsModel.workspaceId(), "testString");
    assertEquals(addFlowToWorkspaceOptionsModel.templateFlow(), templateFlowModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddFlowToWorkspaceOptionsError() throws Throwable {
    new AddFlowToWorkspaceOptions.Builder().build();
  }

}