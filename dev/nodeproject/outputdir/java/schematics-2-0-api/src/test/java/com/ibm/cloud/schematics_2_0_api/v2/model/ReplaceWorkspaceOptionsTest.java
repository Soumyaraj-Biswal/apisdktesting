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

import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.model.Workspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkspaceLiteState;
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
 * Unit test class for the ReplaceWorkspaceOptions model.
 */
public class ReplaceWorkspaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceWorkspaceOptions() throws Throwable {
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

    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .add("foo", "testString")
      .build();
    assertEquals(variableMetadataModel.getType(), "boolean");
    assertEquals(variableMetadataModel.getAliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getDescription(), "testString");
    assertEquals(variableMetadataModel.getDefaultValue(), "testString");
    assertEquals(variableMetadataModel.isSecure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isImmutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.isHidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.getOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.getMinValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMinLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMaxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getMatches(), "testString");
    assertEquals(variableMetadataModel.getPosition(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.getGroupBy(), "testString");
    assertEquals(variableMetadataModel.getSource(), "testString");
    assertEquals(variableMetadataModel.get("foo"), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .add("foo", "testString")
      .build();
    assertEquals(variableDataModel.getName(), "testString");
    assertEquals(variableDataModel.getValue(), "testString");
    assertEquals(variableDataModel.getMetadata(), variableMetadataModel);
    assertEquals(variableDataModel.get("foo"), "testString");

    WorkspaceLiteState workspaceLiteStateModel = new WorkspaceLiteState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .add("foo", "testString")
      .build();
    assertEquals(workspaceLiteStateModel.getStatusCode(), "normal");
    assertEquals(workspaceLiteStateModel.getStatusMessage(), "testString");
    assertEquals(workspaceLiteStateModel.get("foo"), "testString");

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

    Workspace workspaceModel = new Workspace.Builder()
      .name("My Workspace")
      .description("This workspace manages front-end micro service for production environment")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .destroyResourcesOnDelete(true)
      .location("us-south")
      .userState(userStateModel)
      .commandParameter("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .state(workspaceLiteStateModel)
      .sysLock(systemLockModel)
      .add("foo", "testString")
      .build();
    assertEquals(workspaceModel.getName(), "My Workspace");
    assertEquals(workspaceModel.getDescription(), "This workspace manages front-end micro service for production environment");
    assertEquals(workspaceModel.getResourceGroup(), "testString");
    assertEquals(workspaceModel.getTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(workspaceModel.isDestroyResourcesOnDelete(), Boolean.valueOf(true));
    assertEquals(workspaceModel.getLocation(), "us-south");
    assertEquals(workspaceModel.getUserState(), userStateModel);
    assertEquals(workspaceModel.getCommandParameter(), "testString");
    assertEquals(workspaceModel.getInputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(workspaceModel.getOutputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(workspaceModel.getSettings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(workspaceModel.getState(), workspaceLiteStateModel);
    assertEquals(workspaceModel.getSysLock(), systemLockModel);
    assertEquals(workspaceModel.get("foo"), "testString");

    ReplaceWorkspaceOptions replaceWorkspaceOptionsModel = new ReplaceWorkspaceOptions.Builder()
      .workspaceId("testString")
      .workspace(workspaceModel)
      .build();
    assertEquals(replaceWorkspaceOptionsModel.workspaceId(), "testString");
    assertEquals(replaceWorkspaceOptionsModel.workspace(), workspaceModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceOptionsError() throws Throwable {
    new ReplaceWorkspaceOptions.Builder().build();
  }

}