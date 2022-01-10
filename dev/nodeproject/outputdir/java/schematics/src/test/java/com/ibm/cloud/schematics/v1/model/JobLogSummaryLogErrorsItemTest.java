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

import com.ibm.cloud.schematics.v1.model.JobLogSummaryLogErrorsItem;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobLogSummaryLogErrorsItem model.
 */
public class JobLogSummaryLogErrorsItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummaryLogErrorsItem() throws Throwable {
    JobLogSummaryLogErrorsItem jobLogSummaryLogErrorsItemModel = new JobLogSummaryLogErrorsItem.Builder()
      .errorCode("testString")
      .errorMsg("testString")
      .errorCount(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryLogErrorsItemModel.errorCode(), "testString");
    assertEquals(jobLogSummaryLogErrorsItemModel.errorMsg(), "testString");
    assertEquals(jobLogSummaryLogErrorsItemModel.errorCount(), Double.valueOf("72.5"));

    String json = TestUtilities.serialize(jobLogSummaryLogErrorsItemModel);

    JobLogSummaryLogErrorsItem jobLogSummaryLogErrorsItemModelNew = TestUtilities.deserialize(json, JobLogSummaryLogErrorsItem.class);
    assertTrue(jobLogSummaryLogErrorsItemModelNew instanceof JobLogSummaryLogErrorsItem);
    assertEquals(jobLogSummaryLogErrorsItemModelNew.errorCode(), "testString");
    assertEquals(jobLogSummaryLogErrorsItemModelNew.errorMsg(), "testString");
    assertEquals(jobLogSummaryLogErrorsItemModelNew.errorCount(), Double.valueOf("72.5"));
  }
}