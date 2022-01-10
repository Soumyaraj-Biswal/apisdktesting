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

import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettings;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KMSSettings model.
 */
public class KMSSettingsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKMSSettings() throws Throwable {
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .add("foo", "testString")
      .build();
    assertEquals(kmsSettingsPrimaryCrkModel.getKmsName(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.getKmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.getKeyCrn(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.get("foo"), "testString");

    KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .add("foo", "testString")
      .build();
    assertEquals(kmsSettingsSecondaryCrkModel.getKmsName(), "testString");
    assertEquals(kmsSettingsSecondaryCrkModel.getKmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsSecondaryCrkModel.getKeyCrn(), "testString");
    assertEquals(kmsSettingsSecondaryCrkModel.get("foo"), "testString");

    KMSSettings kmsSettingsModel = new KMSSettings.Builder()
      .location("testString")
      .encryptionScheme("testString")
      .resourceGroup("testString")
      .primaryCrk(kmsSettingsPrimaryCrkModel)
      .secondaryCrk(kmsSettingsSecondaryCrkModel)
      .add("foo", "testString")
      .build();
    assertEquals(kmsSettingsModel.getLocation(), "testString");
    assertEquals(kmsSettingsModel.getEncryptionScheme(), "testString");
    assertEquals(kmsSettingsModel.getResourceGroup(), "testString");
    assertEquals(kmsSettingsModel.getPrimaryCrk(), kmsSettingsPrimaryCrkModel);
    assertEquals(kmsSettingsModel.getSecondaryCrk(), kmsSettingsSecondaryCrkModel);
    assertEquals(kmsSettingsModel.get("foo"), "testString");

    String json = TestUtilities.serialize(kmsSettingsModel);

    KMSSettings kmsSettingsModelNew = TestUtilities.deserialize(json, KMSSettings.class);
    assertTrue(kmsSettingsModelNew instanceof KMSSettings);
    assertEquals(kmsSettingsModelNew.getLocation(), "testString");
    assertEquals(kmsSettingsModelNew.getEncryptionScheme(), "testString");
    assertEquals(kmsSettingsModelNew.getResourceGroup(), "testString");
    assertEquals(kmsSettingsModelNew.getPrimaryCrk().toString(), kmsSettingsPrimaryCrkModel.toString());
    assertEquals(kmsSettingsModelNew.getSecondaryCrk().toString(), kmsSettingsSecondaryCrkModel.toString());
    assertEquals(kmsSettingsModelNew.get("foo"), "testString");
  }
}