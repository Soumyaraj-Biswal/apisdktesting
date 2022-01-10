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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * An user editable metadata for the variables.
 */
public class VariableMetadata extends DynamicModel<Object> {

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

  @SerializedName("type")
  protected String type;
  @SerializedName("aliases")
  protected List<String> aliases;
  @SerializedName("description")
  protected String description;
  @SerializedName("default_value")
  protected String defaultValue;
  @SerializedName("secure")
  protected Boolean secure;
  @SerializedName("immutable")
  protected Boolean immutable;
  @SerializedName("hidden")
  protected Boolean hidden;
  @SerializedName("options")
  protected List<String> options;
  @SerializedName("min_value")
  protected Long minValue;
  @SerializedName("max_value")
  protected Long maxValue;
  @SerializedName("min_length")
  protected Long minLength;
  @SerializedName("max_length")
  protected Long maxLength;
  @SerializedName("matches")
  protected String matches;
  @SerializedName("position")
  protected Long position;
  @SerializedName("group_by")
  protected String groupBy;
  @SerializedName("source")
  protected String source;

  public VariableMetadata() {
    super(new TypeToken<Object>() { });
  }

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
    private Map<String, Object> dynamicProperties;

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
      this.dynamicProperties = variableMetadata.getProperties();
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

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the VariableMetadata builder
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

  protected VariableMetadata(Builder builder) {
    super(new TypeToken<Object>() { });
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
    this.setProperties(builder.dynamicProperties);
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
   * Gets the aliases.
   *
   * The list of aliases for the variable name.
   *
   * @return the aliases
   */
  public List<String> getAliases() {
    return this.aliases;
  }

  /**
   * Sets the aliases.
   *
   * @param aliases the new aliases
   */
  public void setAliases(final List<String> aliases) {
    this.aliases = aliases;
  }

  /**
   * Gets the description.
   *
   * The description of the meta data.
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
   * Gets the defaultValue.
   *
   * Default value for the variable only if the override value is not specified.
   *
   * @return the defaultValue
   */
  public String getDefaultValue() {
    return this.defaultValue;
  }

  /**
   * Sets the defaultValue.
   *
   * @param defaultValue the new defaultValue
   */
  public void setDefaultValue(final String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Gets the secure.
   *
   * Is the variable secure or sensitive?.
   *
   * @return the secure
   */
  public Boolean isSecure() {
    return this.secure;
  }

  /**
   * Sets the secure.
   *
   * @param secure the new secure
   */
  public void setSecure(final Boolean secure) {
    this.secure = secure;
  }

  /**
   * Gets the immutable.
   *
   * Is the variable readonly?.
   *
   * @return the immutable
   */
  public Boolean isImmutable() {
    return this.immutable;
  }

  /**
   * Sets the immutable.
   *
   * @param immutable the new immutable
   */
  public void setImmutable(final Boolean immutable) {
    this.immutable = immutable;
  }

  /**
   * Gets the hidden.
   *
   * If **true**, the variable is not displayed on UI or Command line.
   *
   * @return the hidden
   */
  public Boolean isHidden() {
    return this.hidden;
  }

  /**
   * Sets the hidden.
   *
   * @param hidden the new hidden
   */
  public void setHidden(final Boolean hidden) {
    this.hidden = hidden;
  }

  /**
   * Gets the options.
   *
   * The list of possible values for this variable.  If type is **integer** or **date**, then the array of string is
   * converted to array of integers or date during the runtime.
   *
   * @return the options
   */
  public List<String> getOptions() {
    return this.options;
  }

  /**
   * Sets the options.
   *
   * @param options the new options
   */
  public void setOptions(final List<String> options) {
    this.options = options;
  }

  /**
   * Gets the minValue.
   *
   * The minimum value of the variable. Applicable for the integer type.
   *
   * @return the minValue
   */
  public Long getMinValue() {
    return this.minValue;
  }

  /**
   * Sets the minValue.
   *
   * @param minValue the new minValue
   */
  public void setMinValue(final long minValue) {
    this.minValue = minValue;
  }

  /**
   * Gets the maxValue.
   *
   * The maximum value of the variable. Applicable for the integer type.
   *
   * @return the maxValue
   */
  public Long getMaxValue() {
    return this.maxValue;
  }

  /**
   * Sets the maxValue.
   *
   * @param maxValue the new maxValue
   */
  public void setMaxValue(final long maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * Gets the minLength.
   *
   * The minimum length of the variable value. Applicable for the string type.
   *
   * @return the minLength
   */
  public Long getMinLength() {
    return this.minLength;
  }

  /**
   * Sets the minLength.
   *
   * @param minLength the new minLength
   */
  public void setMinLength(final long minLength) {
    this.minLength = minLength;
  }

  /**
   * Gets the maxLength.
   *
   * The maximum length of the variable value. Applicable for the string type.
   *
   * @return the maxLength
   */
  public Long getMaxLength() {
    return this.maxLength;
  }

  /**
   * Sets the maxLength.
   *
   * @param maxLength the new maxLength
   */
  public void setMaxLength(final long maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * Gets the matches.
   *
   * The regex for the variable value.
   *
   * @return the matches
   */
  public String getMatches() {
    return this.matches;
  }

  /**
   * Sets the matches.
   *
   * @param matches the new matches
   */
  public void setMatches(final String matches) {
    this.matches = matches;
  }

  /**
   * Gets the position.
   *
   * The relative position of this variable in a list.
   *
   * @return the position
   */
  public Long getPosition() {
    return this.position;
  }

  /**
   * Sets the position.
   *
   * @param position the new position
   */
  public void setPosition(final long position) {
    this.position = position;
  }

  /**
   * Gets the groupBy.
   *
   * The display name of the group this variable belongs to.
   *
   * @return the groupBy
   */
  public String getGroupBy() {
    return this.groupBy;
  }

  /**
   * Sets the groupBy.
   *
   * @param groupBy the new groupBy
   */
  public void setGroupBy(final String groupBy) {
    this.groupBy = groupBy;
  }

  /**
   * Gets the source.
   *
   * The source of this meta-data.
   *
   * @return the source
   */
  public String getSource() {
    return this.source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final String source) {
    this.source = source;
  }
}
