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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Policy ControlsDecision definition.
 */
public class ControlsDecision extends DynamicModel<Object> {

  /**
   * Pass value.
   */
  public interface PassValue {
    /** before. */
    String BEFORE = "before";
    /** after. */
    String AFTER = "after";
  }

  @SerializedName("rule")
  protected String rule;
  @SerializedName("pass_value")
  protected String passValue;
  @SerializedName("pass_expr")
  protected String passExpr;
  @SerializedName("evidence_found_in")
  protected String evidenceFoundIn;

  public ControlsDecision() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String rule;
    private String passValue;
    private String passExpr;
    private String evidenceFoundIn;
    private Map<String, Object> dynamicProperties;

    private Builder(ControlsDecision controlsDecision) {
      this.rule = controlsDecision.rule;
      this.passValue = controlsDecision.passValue;
      this.passExpr = controlsDecision.passExpr;
      this.evidenceFoundIn = controlsDecision.evidenceFoundIn;
      this.dynamicProperties = controlsDecision.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ControlsDecision.
     *
     * @return the new ControlsDecision instance
     */
    public ControlsDecision build() {
      return new ControlsDecision(this);
    }

    /**
     * Set the rule.
     *
     * @param rule the rule
     * @return the ControlsDecision builder
     */
    public Builder rule(String rule) {
      this.rule = rule;
      return this;
    }

    /**
     * Set the passValue.
     *
     * @param passValue the passValue
     * @return the ControlsDecision builder
     */
    public Builder passValue(String passValue) {
      this.passValue = passValue;
      return this;
    }

    /**
     * Set the passExpr.
     *
     * @param passExpr the passExpr
     * @return the ControlsDecision builder
     */
    public Builder passExpr(String passExpr) {
      this.passExpr = passExpr;
      return this;
    }

    /**
     * Set the evidenceFoundIn.
     *
     * @param evidenceFoundIn the evidenceFoundIn
     * @return the ControlsDecision builder
     */
    public Builder evidenceFoundIn(String evidenceFoundIn) {
      this.evidenceFoundIn = evidenceFoundIn;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ControlsDecision builder
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

  protected ControlsDecision(Builder builder) {
    super(new TypeToken<Object>() { });
    rule = builder.rule;
    passValue = builder.passValue;
    passExpr = builder.passExpr;
    evidenceFoundIn = builder.evidenceFoundIn;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ControlsDecision builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rule.
   *
   * ControlsDecision rules.
   *
   * @return the rule
   */
  public String getRule() {
    return this.rule;
  }

  /**
   * Sets the rule.
   *
   * @param rule the new rule
   */
  public void setRule(final String rule) {
    this.rule = rule;
  }

  /**
   * Gets the passValue.
   *
   * Pass value.
   *
   * @return the passValue
   */
  public String getPassValue() {
    return this.passValue;
  }

  /**
   * Sets the passValue.
   *
   * @param passValue the new passValue
   */
  public void setPassValue(final String passValue) {
    this.passValue = passValue;
  }

  /**
   * Gets the passExpr.
   *
   * Pass expression.
   *
   * @return the passExpr
   */
  public String getPassExpr() {
    return this.passExpr;
  }

  /**
   * Sets the passExpr.
   *
   * @param passExpr the new passExpr
   */
  public void setPassExpr(final String passExpr) {
    this.passExpr = passExpr;
  }

  /**
   * Gets the evidenceFoundIn.
   *
   * Evidence found in.
   *
   * @return the evidenceFoundIn
   */
  public String getEvidenceFoundIn() {
    return this.evidenceFoundIn;
  }

  /**
   * Sets the evidenceFoundIn.
   *
   * @param evidenceFoundIn the new evidenceFoundIn
   */
  public void setEvidenceFoundIn(final String evidenceFoundIn) {
    this.evidenceFoundIn = evidenceFoundIn;
  }
}
