/*
 * Velocity-Sandbox
 * API to create a Velocity Sandbox
 *
 * OpenAPI spec version: 1.0.0
 * Contact: alay.vakil@veritas.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *  for transferring a single parameter related to an error or general status information
 */
@ApiModel(description = " for transferring a single parameter related to an error or general status information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:12:02.186Z")
public class StatusInfoParameter {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  public StatusInfoParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the parameter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusInfoParameter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the parameter. This controls how 'value' is interpreted when creating a user visible text representation of the status message
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the parameter. This controls how 'value' is interpreted when creating a user visible text representation of the status message")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StatusInfoParameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the parameter
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The value of the parameter")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusInfoParameter statusInfoParameter = (StatusInfoParameter) o;
    return Objects.equals(this.name, statusInfoParameter.name) &&
        Objects.equals(this.type, statusInfoParameter.type) &&
        Objects.equals(this.value, statusInfoParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfoParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

