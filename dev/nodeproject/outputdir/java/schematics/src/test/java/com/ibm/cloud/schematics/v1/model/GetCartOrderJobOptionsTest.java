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

import com.ibm.cloud.schematics.v1.model.GetCartOrderJobOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetCartOrderJobOptions model.
 */
public class GetCartOrderJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetCartOrderJobOptions() throws Throwable {
    GetCartOrderJobOptions getCartOrderJobOptionsModel = new GetCartOrderJobOptions.Builder()
      .orderId("testString")
      .jobId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .build();
    assertEquals(getCartOrderJobOptionsModel.orderId(), "testString");
    assertEquals(getCartOrderJobOptionsModel.jobId(), "testString");
    assertEquals(getCartOrderJobOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getCartOrderJobOptionsModel.limit(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartOrderJobOptionsError() throws Throwable {
    new GetCartOrderJobOptions.Builder().build();
  }

}