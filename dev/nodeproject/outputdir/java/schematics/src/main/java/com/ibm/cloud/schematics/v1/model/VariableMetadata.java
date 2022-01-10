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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An user editable metadata for the variables.
 */
public class VariableMetadata extends GenericModel {

  /**
   * Type of the variable.
   */
  public interface Type {
    /** boolean. */
    String X_BOOLEAN = "boolean";
    /** string. */
    String STRING = "string";
    /** integer. */
    String INTEGER = "integer";
    /** date. */
    String DATE = "date";
    /** array. */
    String ARRAY = "array";
    /** list. */
    String LIST = "list";
    /** map. */
    String MAP = "map";
    /** complex. */
    String COMPLEX = "complex";
  }

  protected String type;
  protected List<String> aliases;
  protected String description;
  @SerializedName("default_value")
  protected String defaultValue;
  protected Boolean secure;
  protected Boolean immutable;
  protected Boolean hidden;
  protected List<String> options;
  @SerializedName("min_value")
  protected Long minValue;
  @SerializedName("max_value")
  protected Long maxValue;
  @SerializedName("min_length")
  protected Long minLength;
  @SerializedName("max_length")
  protected Long maxLength;
  protected String matches;
  protected Long position;
  @SerializedName("group_by")
  protected String groupBy;
  protected String source;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> aliases;
    private String description;
    private String defaultValue;
    private Boolean secure;
    private Boolean immutable;
    private Boolean hidden;
    private List<String> options;
    private Long minValue;
    private Long maxValue;
    private Long minLength;
    private Long maxLength;
    private String matches;
    private Long position;
    private String groupBy;
    private String source;

    private Builder(VariableMetadata variableMetadata) {
      this.type = variableMetadata.type;
      this.aliases = variableMetadata.aliases;
      this.description = variableMetadata.description;
      this.defaultValue = variableMetadata.defaultValue;
      this.secure = variableMetadata.secure;
      this.immutable = variableMetadata.immutable;
      this.hidden = variableMetadata.hidden;
      this.options = variableMetadata.options;
      this.minValue = variableMetadata.minValue;
      this.maxValue = variableMetadata.maxValue;
      this.minLength = variableMetadata.minLength;
      this.maxLength = variableMetadata.maxLength;
      this.matches = variableMetadata.matches;
      this.position = variableMetadata.position;
      this.groupBy = variableMetadata.groupBy;
      this.source = variableMetadata.source;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VariableMetadata.
     *
     * @return the new VariableMetadata instance
     */
    public VariableMetadata build() {
      return new VariableMetadata(this);
    }

    /**
     * Adds an aliases to aliases.
     *
     * @param aliases the new aliases
     * @return the VariableMetadata builder
     */
    public Builder addAliases(String aliases) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(aliases,
        "aliases cannot be null");
      if (this.aliases == null) {
        this.aliases = new ArrayList<String>();
      }
      this.aliases.add(aliases);
      return this;
    }

    /**
     * Adds an options to options.
     *
     * @param options the new options
     * @return the VariableMetadata builder
     */
    public Builder addOptions(String options) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(options,
        "options cannot be null");
      if (this.options == null) {
        this.options = new ArrayList<String>();
      }
      this.options.add(options);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VariableMetadata builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the aliases.
     * Existing aliases will be replaced.
     *
     * @param aliases the aliases
     * @return the VariableMetadata builder
     */
    public Builder aliases(List<String> aliases) {
      this.aliases = aliases;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the VariableMetadata builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the defaultValue.
     *
     * @param defaultValue the defaultValue
     * @return the VariableMetadata builder
     */
    public Builder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     * Set the secure.
     *
     * @param secure the secure
     * @return the VariableMetadata builder
     */
    public Builder secure(Boolean secure) {
      this.secure = secure;
      return this;
    }

    /**
     * Set the immutable.
     *
     * @param immutable the immutable
     * @return the VariableMetadata builder
     */
    public Builder immutable(Boolean immutable) {
      this.immutable = immutable;
      return this;
    }

    /**
     * Set the hidden.
     *
     * @param hidden the hidden
     * @return the VariableMetadata builder
     */
    public Builder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    /**
     * Set the options.
     * Existing options will be replaced.
     *
     * @param options the options
     * @return the VariableMetadata builder
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * Set the minValue.
     *
     * @param minValue the minValue
     * @return the VariableMetadata builder
     */
    public Builder minValue(long minValue) {
      this.minValue = minValue;
      return this;
    }

    /**
     * Set the maxValue.
     *
     * @param maxValue the maxValue
     * @return the VariableMetadata builder
     */
    public Builder maxValue(long maxValue) {
      this.maxValue = maxValue;
      return this;
    }

    /**
     * Set the minLength.
     *
     * @param minLength the minLength
     * @return the VariableMetadata builder
     */
    public Builder minLength(long minLength) {
      this.minLength = minLength;
      return this;
    }

    /**
     * Set the maxLength.
     *
     * @param maxLength the maxLength
     * @return the VariableMetadata builder
     */
    public Builder maxLength(long maxLength) {
      this.maxLength = maxLength;
      return this;
    }

    /**
     * Set the matches.
     *
     * @param matches the matches
     * @return the VariableMetadata builder
     */
    public Builder matches(String matches) {
      this.matches = matches;
      return this;
    }

    /**
     * Set the position.
     *
     * @param position the position
     * @return the VariableMetadata builder
     */
    public Builder position(long position) {
      this.position = position;
      return this;
    }

    /**
     * Set the groupBy.
     *
     * @param groupBy the groupBy
     * @return the VariableMetadata builder
     */
    public Builder groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the VariableMetadata builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }
  }

  protected VariableMetadata(Builder builder) {
    type = builder.type;
    aliases = builder.aliases;
    description = builder.description;
    defaultValue = builder.defaultValue;
    secure = builder.secure;
    immutable = builder.immutable;
    hidden = builder.hidden;
    options = builder.options;
    minValue = builder.minValue;
    maxValue = builder.maxValue;
    minLength = builder.minLength;
    maxLength = builder.maxLength;
    matches = builder.matches;
    position = builder.position;
    groupBy = builder.groupBy;
    source = builder.source;
  }

  /**
   * New builder.
   *
   * @return a VariableMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of the variable.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the aliases.
   *
   * The list of aliases for the variable name.
   *
   * @return the aliases
   */
  public List<String> aliases() {
    return aliases;
  }

  /**
   * Gets the description.
   *
   * The description of the meta data.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the defaultValue.
   *
   * Default value for the variable only if the override value is not specified.
   *
   * @return the defaultValue
   */
  public String defaultValue() {
    return defaultValue;
  }

  /**
   * Gets the secure.
   *
   * Is the variable secure or sensitive ?.
   *
   * @return the secure
   */
  public Boolean secure() {
    return secure;
  }

  /**
   * Gets the immutable.
   *
   * Is the variable readonly ?.
   *
   * @return the immutable
   */
  public Boolean immutable() {
    return immutable;
  }

  /**
   * Gets the hidden.
   *
   * If **true**, the variable is not displayed on UI or Command line.
   *
   * @return the hidden
   */
  public Boolean hidden() {
    return hidden;
  }

  /**
   * Gets the options.
   *
   * The list of possible values for this variable.  If type is **integer** or **date**, then the array of string is
   * converted to array of integers or date during the runtime.
   *
   * @return the options
   */
  public List<String> options() {
    return options;
  }

  /**
   * Gets the minValue.
   *
   * The minimum value of the variable. Applicable for the integer type.
   *
   * @return the minValue
   */
  public Long minValue() {
    return minValue;
  }

  /**
   * Gets the maxValue.
   *
   * The maximum value of the variable. Applicable for the integer type.
   *
   * @return the maxValue
   */
  public Long maxValue() {
    return maxValue;
  }

  /**
   * Gets the minLength.
   *
   * The minimum length of the variable value. Applicable for the string type.
   *
   * @return the minLength
   */
  public Long minLength() {
    return minLength;
  }

  /**
   * Gets the maxLength.
   *
   * The maximum length of the variable value. Applicable for the string type.
   *
   * @return the maxLength
   */
  public Long maxLength() {
    return maxLength;
  }

  /**
   * Gets the matches.
   *
   * The regex for the variable value.
   *
   * @return the matches
   */
  public String matches() {
    return matches;
  }

  /**
   * Gets the position.
   *
   * The relative position of this variable in a list.
   *
   * @return the position
   */
  public Long position() {
    return position;
  }

  /**
   * Gets the groupBy.
   *
   * The display name of the group this variable belongs to.
   *
   * @return the groupBy
   */
  public String groupBy() {
    return groupBy;
  }

  /**
   * Gets the source.
   *
   * The source of this meta-data.
   *
   * @return the source
   */
  public String source() {
    return source;
  }
}

