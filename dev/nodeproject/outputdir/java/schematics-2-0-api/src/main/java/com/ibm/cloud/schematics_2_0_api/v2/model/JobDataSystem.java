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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Controls Job data.
 */
public class JobDataSystem extends DynamicModel<Object> {

  @SerializedName("key_id")
  protected String keyId;
  @SerializedName("schematics_resource_id")
  protected List<String> schematicsResourceId;
  @SerializedName("updated_at")
  protected Date updatedAt;

  public JobDataSystem() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String keyId;
    private List<String> schematicsResourceId;
    private Date updatedAt;
    private Map<String, Object> dynamicProperties;

    private Builder(JobDataSystem jobDataSystem) {
      this.keyId = jobDataSystem.keyId;
      this.schematicsResourceId = jobDataSystem.schematicsResourceId;
      this.updatedAt = jobDataSystem.updatedAt;
      this.dynamicProperties = jobDataSystem.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataSystem.
     *
     * @return the new JobDataSystem instance
     */
    public JobDataSystem build() {
      return new JobDataSystem(this);
    }

    /**
     * Adds an schematicsResourceId to schematicsResourceId.
     *
     * @param schematicsResourceId the new schematicsResourceId
     * @return the JobDataSystem builder
     */
    public Builder addSchematicsResourceId(String schematicsResourceId) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(schematicsResourceId,
        "schematicsResourceId cannot be null");
      if (this.schematicsResourceId == null) {
        this.schematicsResourceId = new ArrayList<String>();
      }
      this.schematicsResourceId.add(schematicsResourceId);
      return this;
    }

    /**
     * Set the keyId.
     *
     * @param keyId the keyId
     * @return the JobDataSystem builder
     */
    public Builder keyId(String keyId) {
      this.keyId = keyId;
      return this;
    }

    /**
     * Set the schematicsResourceId.
     * Existing schematicsResourceId will be replaced.
     *
     * @param schematicsResourceId the schematicsResourceId
     * @return the JobDataSystem builder
     */
    public Builder schematicsResourceId(List<String> schematicsResourceId) {
      this.schematicsResourceId = schematicsResourceId;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobDataSystem builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the JobDataSystem builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected JobDataSystem(Builder builder) {
    super(new TypeToken<Object>() { });
    keyId = builder.keyId;
    schematicsResourceId = builder.schematicsResourceId;
    updatedAt = builder.updatedAt;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a JobDataSystem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the keyId.
   *
   * Key ID for which key event is generated.
   *
   * @return the keyId
   */
  public String getKeyId() {
    return this.keyId;
  }

  /**
   * Sets the keyId.
   *
   * @param keyId the new keyId
   */
  public void setKeyId(final String keyId) {
    this.keyId = keyId;
  }

  /**
   * Gets the schematicsResourceId.
   *
   * List of the schematics resource id.
   *
   * @return the schematicsResourceId
   */
  public List<String> getSchematicsResourceId() {
    return this.schematicsResourceId;
  }

  /**
   * Sets the schematicsResourceId.
   *
   * @param schematicsResourceId the new schematicsResourceId
   */
  public void setSchematicsResourceId(final List<String> schematicsResourceId) {
    this.schematicsResourceId = schematicsResourceId;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Sets the updatedAt.
   *
   * @param updatedAt the new updatedAt
   */
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
