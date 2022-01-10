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

import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusAction;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusAction model.
 */
public class JobStatusActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusAction() throws Throwable {
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .targetsStatusCode("none")
      .targetsStatusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(jobStatusActionModel.getActionName(), "testString");
    assertEquals(jobStatusActionModel.getStatusCode(), "job_pending");
    assertEquals(jobStatusActionModel.getStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getBastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.getBastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getTargetsStatusCode(), "none");
    assertEquals(jobStatusActionModel.getTargetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusActionModel.get("foo"), "testString");

    String json = TestUtilities.serialize(jobStatusActionModel);

    JobStatusAction jobStatusActionModelNew = TestUtilities.deserialize(json, JobStatusAction.class);
    assertTrue(jobStatusActionModelNew instanceof JobStatusAction);
    assertEquals(jobStatusActionModelNew.getActionName(), "testString");
    assertEquals(jobStatusActionModelNew.getStatusCode(), "job_pending");
    assertEquals(jobStatusActionModelNew.getStatusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.getBastionStatusCode(), "none");
    assertEquals(jobStatusActionModelNew.getBastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.getTargetsStatusCode(), "none");
    assertEquals(jobStatusActionModelNew.getTargetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.getUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobStatusActionModelNew.get("foo"), "testString");
  }
}