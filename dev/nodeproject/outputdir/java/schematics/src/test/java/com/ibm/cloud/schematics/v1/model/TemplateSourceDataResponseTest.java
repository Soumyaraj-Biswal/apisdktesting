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

import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableResponse;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateSourceDataResponse model.
 */
public class TemplateSourceDataResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateSourceDataResponse() throws Throwable {
    TemplateSourceDataResponse templateSourceDataResponseModel = new TemplateSourceDataResponse();
    assertNull(templateSourceDataResponseModel.getEnvValues());
    assertNull(templateSourceDataResponseModel.getFolder());
    assertNull(templateSourceDataResponseModel.isCompact());
    assertNull(templateSourceDataResponseModel.isHasGithubtoken());
    assertNull(templateSourceDataResponseModel.getId());
    assertNull(templateSourceDataResponseModel.getType());
    assertNull(templateSourceDataResponseModel.getUninstallScriptName());
    assertNull(templateSourceDataResponseModel.getValues());
    assertNull(templateSourceDataResponseModel.getValuesMetadata());
    assertNull(templateSourceDataResponseModel.getValuesUrl());
    assertNull(templateSourceDataResponseModel.getVariablestore());
  }
}