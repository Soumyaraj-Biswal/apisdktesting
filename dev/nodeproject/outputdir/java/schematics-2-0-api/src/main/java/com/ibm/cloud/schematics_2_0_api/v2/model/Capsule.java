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
 * Complete capsule definition record.
 */
public class Capsule extends DynamicModel<Object> {

  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("type")
  protected String type;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("package")
  protected String xPackage;
  @SerializedName("severity")
  protected Long severity;
  @SerializedName("inventory")
  protected String inventory;
  @SerializedName("trigger_record_id")
  protected String triggerRecordId;
  @SerializedName("job_triggers")
  protected List<TriggerJob> jobTriggers;
  @SerializedName("scheduled_triggers")
  protected List<TriggerScheduled> scheduledTriggers;
  @SerializedName("inputs")
  protected List<VariableData> inputs;
  @SerializedName("decisions")
  protected List<ControlsDecision> decisions;
  @SerializedName("escalations")
  protected List<ControlsEscalation> escalations;
  @SerializedName("id")
  protected String id;
  @SerializedName("status")
  protected String status;
  @SerializedName("controls_id")
  protected String controlsId;
  @SerializedName("controls_name")
  protected String controlsName;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("state")
  protected ControlsLiteState state;
  @SerializedName("last_job_data")
  protected JobDataCapsule lastJobData;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;

  public Capsule() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String type;
    private UserState userState;
    private String xPackage;
    private Long severity;
    private String inventory;
    private String triggerRecordId;
    private List<TriggerJob> jobTriggers;
    private List<TriggerScheduled> scheduledTriggers;
    private List<VariableData> inputs;
    private List<ControlsDecision> decisions;
    private List<ControlsEscalation> escalations;
    private String id;
    private String status;
    private String controlsId;
    private String controlsName;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private ControlsLiteState state;
    private JobDataCapsule lastJobData;
    private SystemLock sysLock;
    private Map<String, Object> dynamicProperties;

    private Builder(Capsule capsule) {
      this.name = capsule.name;
      this.description = capsule.description;
      this.type = capsule.type;
      this.userState = capsule.userState;
      this.xPackage = capsule.xPackage;
      this.severity = capsule.severity;
      this.inventory = capsule.inventory;
      this.triggerRecordId = capsule.triggerRecordId;
      this.jobTriggers = capsule.jobTriggers;
      this.scheduledTriggers = capsule.scheduledTriggers;
      this.inputs = capsule.inputs;
      this.decisions = capsule.decisions;
      this.escalations = capsule.escalations;
      this.id = capsule.id;
      this.status = capsule.status;
      this.controlsId = capsule.controlsId;
      this.controlsName = capsule.controlsName;
      this.createdAt = capsule.createdAt;
      this.createdBy = capsule.createdBy;
      this.updatedAt = capsule.updatedAt;
      this.updatedBy = capsule.updatedBy;
      this.state = capsule.state;
      this.lastJobData = capsule.lastJobData;
      this.sysLock = capsule.sysLock;
      this.dynamicProperties = capsule.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Capsule.
     *
     * @return the new Capsule instance
     */
    public Capsule build() {
      return new Capsule(this);
    }

    /**
     * Adds an jobTriggers to jobTriggers.
     *
     * @param jobTriggers the new jobTriggers
     * @return the Capsule builder
     */
    public Builder addJobTriggers(TriggerJob jobTriggers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(jobTriggers,
        "jobTriggers cannot be null");
      if (this.jobTriggers == null) {
        this.jobTriggers = new ArrayList<TriggerJob>();
      }
      this.jobTriggers.add(jobTriggers);
      return this;
    }

    /**
     * Adds an scheduledTriggers to scheduledTriggers.
     *
     * @param scheduledTriggers the new scheduledTriggers
     * @return the Capsule builder
     */
    public Builder addScheduledTriggers(TriggerScheduled scheduledTriggers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(scheduledTriggers,
        "scheduledTriggers cannot be null");
      if (this.scheduledTriggers == null) {
        this.scheduledTriggers = new ArrayList<TriggerScheduled>();
      }
      this.scheduledTriggers.add(scheduledTriggers);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Capsule builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an decisions to decisions.
     *
     * @param decisions the new decisions
     * @return the Capsule builder
     */
    public Builder addDecisions(ControlsDecision decisions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(decisions,
        "decisions cannot be null");
      if (this.decisions == null) {
        this.decisions = new ArrayList<ControlsDecision>();
      }
      this.decisions.add(decisions);
      return this;
    }

    /**
     * Adds an escalations to escalations.
     *
     * @param escalations the new escalations
     * @return the Capsule builder
     */
    public Builder addEscalations(ControlsEscalation escalations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(escalations,
        "escalations cannot be null");
      if (this.escalations == null) {
        this.escalations = new ArrayList<ControlsEscalation>();
      }
      this.escalations.add(escalations);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Capsule builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Capsule builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Capsule builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Capsule builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the xPackage.
     *
     * @param xPackage the xPackage
     * @return the Capsule builder
     */
    public Builder xPackage(String xPackage) {
      this.xPackage = xPackage;
      return this;
    }

    /**
     * Set the severity.
     *
     * @param severity the severity
     * @return the Capsule builder
     */
    public Builder severity(long severity) {
      this.severity = severity;
      return this;
    }

    /**
     * Set the inventory.
     *
     * @param inventory the inventory
     * @return the Capsule builder
     */
    public Builder inventory(String inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * Set the triggerRecordId.
     *
     * @param triggerRecordId the triggerRecordId
     * @return the Capsule builder
     */
    public Builder triggerRecordId(String triggerRecordId) {
      this.triggerRecordId = triggerRecordId;
      return this;
    }

    /**
     * Set the jobTriggers.
     * Existing jobTriggers will be replaced.
     *
     * @param jobTriggers the jobTriggers
     * @return the Capsule builder
     */
    public Builder jobTriggers(List<TriggerJob> jobTriggers) {
      this.jobTriggers = jobTriggers;
      return this;
    }

    /**
     * Set the scheduledTriggers.
     * Existing scheduledTriggers will be replaced.
     *
     * @param scheduledTriggers the scheduledTriggers
     * @return the Capsule builder
     */
    public Builder scheduledTriggers(List<TriggerScheduled> scheduledTriggers) {
      this.scheduledTriggers = scheduledTriggers;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Capsule builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the decisions.
     * Existing decisions will be replaced.
     *
     * @param decisions the decisions
     * @return the Capsule builder
     */
    public Builder decisions(List<ControlsDecision> decisions) {
      this.decisions = decisions;
      return this;
    }

    /**
     * Set the escalations.
     * Existing escalations will be replaced.
     *
     * @param escalations the escalations
     * @return the Capsule builder
     */
    public Builder escalations(List<ControlsEscalation> escalations) {
      this.escalations = escalations;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Capsule builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the Capsule builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the controlsId.
     *
     * @param controlsId the controlsId
     * @return the Capsule builder
     */
    public Builder controlsId(String controlsId) {
      this.controlsId = controlsId;
      return this;
    }

    /**
     * Set the controlsName.
     *
     * @param controlsName the controlsName
     * @return the Capsule builder
     */
    public Builder controlsName(String controlsName) {
      this.controlsName = controlsName;
      return this;
    }

    /**
     * Set the createdAt.
     *
     * @param createdAt the createdAt
     * @return the Capsule builder
     */
    public Builder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the Capsule builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the Capsule builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Set the updatedBy.
     *
     * @param updatedBy the updatedBy
     * @return the Capsule builder
     */
    public Builder updatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the Capsule builder
     */
    public Builder state(ControlsLiteState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the lastJobData.
     *
     * @param lastJobData the lastJobData
     * @return the Capsule builder
     */
    public Builder lastJobData(JobDataCapsule lastJobData) {
      this.lastJobData = lastJobData;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Capsule builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Capsule builder
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

  protected Capsule(Builder builder) {
    super(new TypeToken<Object>() { });
    name = builder.name;
    description = builder.description;
    type = builder.type;
    userState = builder.userState;
    xPackage = builder.xPackage;
    severity = builder.severity;
    inventory = builder.inventory;
    triggerRecordId = builder.triggerRecordId;
    jobTriggers = builder.jobTriggers;
    scheduledTriggers = builder.scheduledTriggers;
    inputs = builder.inputs;
    decisions = builder.decisions;
    escalations = builder.escalations;
    id = builder.id;
    status = builder.status;
    controlsId = builder.controlsId;
    controlsName = builder.controlsName;
    createdAt = builder.createdAt;
    createdBy = builder.createdBy;
    updatedAt = builder.updatedAt;
    updatedBy = builder.updatedBy;
    state = builder.state;
    lastJobData = builder.lastJobData;
    sysLock = builder.sysLock;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Capsule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the capsule.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets the description.
   *
   * Capsule description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the type.
   *
   * capsule type.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState getUserState() {
    return this.userState;
  }

  /**
   * Sets the userState.
   *
   * @param userState the new userState
   */
  public void setUserState(final UserState userState) {
    this.userState = userState;
  }

  /**
   * Gets the xPackage.
   *
   * Policy package path.
   *
   * @return the xPackage
   */
  public String getXPackage() {
    return this.xPackage;
  }

  /**
   * Sets the xPackage.
   *
   * @param xPackage the new xPackage
   */
  public void setXPackage(final String xPackage) {
    this.xPackage = xPackage;
  }

  /**
   * Gets the severity.
   *
   * Severity.
   *
   * @return the severity
   */
  public Long getSeverity() {
    return this.severity;
  }

  /**
   * Sets the severity.
   *
   * @param severity the new severity
   */
  public void setSeverity(final long severity) {
    this.severity = severity;
  }

  /**
   * Gets the inventory.
   *
   * Target inventory record ID, used to evaluate the policy.
   *
   * @return the inventory
   */
  public String getInventory() {
    return this.inventory;
  }

  /**
   * Sets the inventory.
   *
   * @param inventory the new inventory
   */
  public void setInventory(final String inventory) {
    this.inventory = inventory;
  }

  /**
   * Gets the triggerRecordId.
   *
   * Id to the Trigger.
   *
   * @return the triggerRecordId
   */
  public String getTriggerRecordId() {
    return this.triggerRecordId;
  }

  /**
   * Sets the triggerRecordId.
   *
   * @param triggerRecordId the new triggerRecordId
   */
  public void setTriggerRecordId(final String triggerRecordId) {
    this.triggerRecordId = triggerRecordId;
  }

  /**
   * Gets the jobTriggers.
   *
   * List of Job Triggers.
   *
   * @return the jobTriggers
   */
  public List<TriggerJob> getJobTriggers() {
    return this.jobTriggers;
  }

  /**
   * Sets the jobTriggers.
   *
   * @param jobTriggers the new jobTriggers
   */
  public void setJobTriggers(final List<TriggerJob> jobTriggers) {
    this.jobTriggers = jobTriggers;
  }

  /**
   * Gets the scheduledTriggers.
   *
   * List of Scheduled Triggers.
   *
   * @return the scheduledTriggers
   */
  public List<TriggerScheduled> getScheduledTriggers() {
    return this.scheduledTriggers;
  }

  /**
   * Sets the scheduledTriggers.
   *
   * @param scheduledTriggers the new scheduledTriggers
   */
  public void setScheduledTriggers(final List<TriggerScheduled> scheduledTriggers) {
    this.scheduledTriggers = scheduledTriggers;
  }

  /**
   * Gets the inputs.
   *
   * Input data for the capsule.
   *
   * @return the inputs
   */
  public List<VariableData> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<VariableData> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the decisions.
   *
   * List of decisions.
   *
   * @return the decisions
   */
  public List<ControlsDecision> getDecisions() {
    return this.decisions;
  }

  /**
   * Sets the decisions.
   *
   * @param decisions the new decisions
   */
  public void setDecisions(final List<ControlsDecision> decisions) {
    this.decisions = decisions;
  }

  /**
   * Gets the escalations.
   *
   * List of escalations.
   *
   * @return the escalations
   */
  public List<ControlsEscalation> getEscalations() {
    return this.escalations;
  }

  /**
   * Sets the escalations.
   *
   * @param escalations the new escalations
   */
  public void setEscalations(final List<ControlsEscalation> escalations) {
    this.escalations = escalations;
  }

  /**
   * Gets the id.
   *
   * Capsule Id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * Gets the status.
   *
   * Capsule status.
   *
   * @return the status
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(final String status) {
    this.status = status;
  }

  /**
   * Gets the controlsId.
   *
   * Controls Id.
   *
   * @return the controlsId
   */
  public String getControlsId() {
    return this.controlsId;
  }

  /**
   * Sets the controlsId.
   *
   * @param controlsId the new controlsId
   */
  public void setControlsId(final String controlsId) {
    this.controlsId = controlsId;
  }

  /**
   * Gets the controlsName.
   *
   * Controls name.
   *
   * @return the controlsName
   */
  public String getControlsName() {
    return this.controlsName;
  }

  /**
   * Sets the controlsName.
   *
   * @param controlsName the new controlsName
   */
  public void setControlsName(final String controlsName) {
    this.controlsName = controlsName;
  }

  /**
   * Gets the createdAt.
   *
   * Control policy creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Sets the createdAt.
   *
   * @param createdAt the new createdAt
   */
  public void setCreatedAt(final Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Name of user who created the control policy.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Sets the createdBy.
   *
   * @param createdBy the new createdBy
   */
  public void setCreatedBy(final String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Control policy updation time.
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

  /**
   * Gets the updatedBy.
   *
   * Name of user who updated the control policy.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Sets the updatedBy.
   *
   * @param updatedBy the new updatedBy
   */
  public void setUpdatedBy(final String updatedBy) {
    this.updatedBy = updatedBy;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Controls.
   *
   * @return the state
   */
  public ControlsLiteState getState() {
    return this.state;
  }

  /**
   * Sets the state.
   *
   * @param state the new state
   */
  public void setState(final ControlsLiteState state) {
    this.state = state;
  }

  /**
   * Gets the lastJobData.
   *
   * Capsule Job data.
   *
   * @return the lastJobData
   */
  public JobDataCapsule getLastJobData() {
    return this.lastJobData;
  }

  /**
   * Sets the lastJobData.
   *
   * @param lastJobData the new lastJobData
   */
  public void setLastJobData(final JobDataCapsule lastJobData) {
    this.lastJobData = lastJobData;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return this.sysLock;
  }

  /**
   * Sets the sysLock.
   *
   * @param sysLock the new sysLock
   */
  public void setSysLock(final SystemLock sysLock) {
    this.sysLock = sysLock;
  }
}
