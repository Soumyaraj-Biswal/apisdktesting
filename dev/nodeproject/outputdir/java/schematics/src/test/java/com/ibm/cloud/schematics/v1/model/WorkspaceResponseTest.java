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

import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.SharedTargetDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRunTimeDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusMessage;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableResponse;
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
 * Unit test class for the WorkspaceResponse model.
 */
public class WorkspaceResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkspaceResponse() throws Throwable {
    WorkspaceResponse workspaceResponseModel = new WorkspaceResponse();
    assertNull(workspaceResponseModel.getAppliedShareddataIds());
    assertNull(workspaceResponseModel.getCatalogRef());
    assertNull(workspaceResponseModel.getCreatedAt());
    assertNull(workspaceResponseModel.getCreatedBy());
    assertNull(workspaceResponseModel.getCrn());
    assertNull(workspaceResponseModel.getDescription());
    assertNull(workspaceResponseModel.getId());
    assertNull(workspaceResponseModel.getLastHealthCheckAt());
    assertNull(workspaceResponseModel.getLocation());
    assertNull(workspaceResponseModel.getName());
    assertNull(workspaceResponseModel.getResourceGroup());
    assertNull(workspaceResponseModel.getRuntimeData());
    assertNull(workspaceResponseModel.getSharedData());
    assertNull(workspaceResponseModel.getStatus());
    assertNull(workspaceResponseModel.getTags());
    assertNull(workspaceResponseModel.getTemplateData());
    assertNull(workspaceResponseModel.getTemplateRef());
    assertNull(workspaceResponseModel.getTemplateRepo());
    assertNull(workspaceResponseModel.getType());
    assertNull(workspaceResponseModel.getUpdatedAt());
    assertNull(workspaceResponseModel.getUpdatedBy());
    assertNull(workspaceResponseModel.getWorkspaceStatus());
    assertNull(workspaceResponseModel.getWorkspaceStatusMsg());
  }
}