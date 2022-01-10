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

import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics.v1.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateKmsSettingsOptions model.
 */
public class UpdateKmsSettingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateKmsSettingsOptions() throws Throwable {
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();
    assertEquals(kmsSettingsPrimaryCrkModel.kmsName(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.kmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.keyCrn(), "testString");

    KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();
    assertEquals(kmsSettingsSecondaryCrkModel.kmsName(), "testString");
    assertEquals(kmsSettingsSecondaryCrkModel.kmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsSecondaryCrkModel.keyCrn(), "testString");

    UpdateKmsSettingsOptions updateKmsSettingsOptionsModel = new UpdateKmsSettingsOptions.Builder()
      .location("testString")
      .encryptionScheme("testString")
      .resourceGroup("testString")
      .primaryCrk(kmsSettingsPrimaryCrkModel)
      .secondaryCrk(kmsSettingsSecondaryCrkModel)
      .build();
    assertEquals(updateKmsSettingsOptionsModel.location(), "testString");
    assertEquals(updateKmsSettingsOptionsModel.encryptionScheme(), "testString");
    assertEquals(updateKmsSettingsOptionsModel.resourceGroup(), "testString");
    assertEquals(updateKmsSettingsOptionsModel.primaryCrk(), kmsSettingsPrimaryCrkModel);
    assertEquals(updateKmsSettingsOptionsModel.secondaryCrk(), kmsSettingsSecondaryCrkModel);
  }
}