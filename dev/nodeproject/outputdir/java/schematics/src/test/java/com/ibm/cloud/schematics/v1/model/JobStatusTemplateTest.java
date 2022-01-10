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

import com.ibm.cloud.schematics.v1.model.JobStatusTemplate;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusTemplate model.
 */
public class JobStatusTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusTemplate() throws Throwable {
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusTemplateModel.templateId(), "testString");
    assertEquals(jobStatusTemplateModel.templateName(), "testString");
    assertEquals(jobStatusTemplateModel.flowIndex(), Long.valueOf("26"));
    assertEquals(jobStatusTemplateModel.statusCode(), "job_pending");
    assertEquals(jobStatusTemplateModel.statusMessage(), "testString");
    assertEquals(jobStatusTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(jobStatusTemplateModel);

    JobStatusTemplate jobStatusTemplateModelNew = TestUtilities.deserialize(json, JobStatusTemplate.class);
    assertTrue(jobStatusTemplateModelNew instanceof JobStatusTemplate);
    assertEquals(jobStatusTemplateModelNew.templateId(), "testString");
    assertEquals(jobStatusTemplateModelNew.templateName(), "testString");
    assertEquals(jobStatusTemplateModelNew.flowIndex(), Long.valueOf("26"));
    assertEquals(jobStatusTemplateModelNew.statusCode(), "job_pending");
    assertEquals(jobStatusTemplateModelNew.statusMessage(), "testString");
    assertEquals(jobStatusTemplateModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}