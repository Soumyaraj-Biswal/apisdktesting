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

import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecret;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecretApikey;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConnectionSecret model.
 */
public class ConnectionSecretTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConnectionSecret() throws Throwable {
    ConnectionSecretApikey connectionSecretApikeyModel = new ConnectionSecretApikey.Builder()
      .key("testString")
      .add("foo", "testString")
      .build();
    assertEquals(connectionSecretApikeyModel.getKey(), "testString");
    assertEquals(connectionSecretApikeyModel.get("foo"), "testString");

    ConnectionSecret connectionSecretModel = new ConnectionSecret.Builder()
      .type("apikey")
      .apikey(connectionSecretApikeyModel)
      .add("foo", "testString")
      .build();
    assertEquals(connectionSecretModel.getType(), "apikey");
    assertEquals(connectionSecretModel.getApikey(), connectionSecretApikeyModel);
    assertEquals(connectionSecretModel.get("foo"), "testString");

    String json = TestUtilities.serialize(connectionSecretModel);

    ConnectionSecret connectionSecretModelNew = TestUtilities.deserialize(json, ConnectionSecret.class);
    assertTrue(connectionSecretModelNew instanceof ConnectionSecret);
    assertEquals(connectionSecretModelNew.getType(), "apikey");
    assertEquals(connectionSecretModelNew.getApikey().toString(), connectionSecretApikeyModel.toString());
    assertEquals(connectionSecretModelNew.get("foo"), "testString");
  }
}