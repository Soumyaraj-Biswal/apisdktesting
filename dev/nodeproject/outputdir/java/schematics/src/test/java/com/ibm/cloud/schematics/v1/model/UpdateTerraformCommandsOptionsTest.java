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

import com.ibm.cloud.schematics.v1.model.TerraformCommand;
import com.ibm.cloud.schematics.v1.model.UpdateTerraformCommandsOptions;
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
 * Unit test class for the UpdateTerraformCommandsOptions model.
 */
public class UpdateTerraformCommandsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTerraformCommandsOptions() throws Throwable {
    TerraformCommand terraformCommandModel = new TerraformCommand.Builder()
      .command("testString")
      .commandParams("testString")
      .commandName("testString")
      .commandDesc("testString")
      .commandOnError("testString")
      .commandDependsOn("testString")
      .commandStatus("testString")
      .build();
    assertEquals(terraformCommandModel.command(), "testString");
    assertEquals(terraformCommandModel.commandParams(), "testString");
    assertEquals(terraformCommandModel.commandName(), "testString");
    assertEquals(terraformCommandModel.commandDesc(), "testString");
    assertEquals(terraformCommandModel.commandOnError(), "testString");
    assertEquals(terraformCommandModel.commandDependsOn(), "testString");
    assertEquals(terraformCommandModel.commandStatus(), "testString");

    UpdateTerraformCommandsOptions updateTerraformCommandsOptionsModel = new UpdateTerraformCommandsOptions.Builder()
      .wId("testString")
      .commands(new java.util.ArrayList<TerraformCommand>(java.util.Arrays.asList(terraformCommandModel)))
      .operationName("testString")
      .description("testString")
      .build();
    assertEquals(updateTerraformCommandsOptionsModel.wId(), "testString");
    assertEquals(updateTerraformCommandsOptionsModel.commands(), new java.util.ArrayList<TerraformCommand>(java.util.Arrays.asList(terraformCommandModel)));
    assertEquals(updateTerraformCommandsOptionsModel.operationName(), "testString");
    assertEquals(updateTerraformCommandsOptionsModel.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTerraformCommandsOptionsError() throws Throwable {
    new UpdateTerraformCommandsOptions.Builder().build();
  }

}