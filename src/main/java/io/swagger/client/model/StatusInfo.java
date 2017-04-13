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
import io.swagger.client.model.StatusInfoParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents enough information about an error or other condition that can be shown to the user in a very descriptive localized message
 */
@ApiModel(description = "Represents enough information about an error or other condition that can be shown to the user in a very descriptive localized message")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:12:02.186Z")
public class StatusInfo {
  @SerializedName("errorMsg")
  private String errorMsg = null;

  @SerializedName("msgId")
  private String msgId = null;

  @SerializedName("parameters")
  private List<StatusInfoParameter> parameters = new ArrayList<StatusInfoParameter>();

  @SerializedName("solutionMsg")
  private String solutionMsg = null;

  public StatusInfo errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Get errorMsg
   * @return errorMsg
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public StatusInfo msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * An ID that can be used to look up a localized string
   * @return msgId
  **/
  @ApiModelProperty(example = "null", required = true, value = "An ID that can be used to look up a localized string")
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public StatusInfo parameters(List<StatusInfoParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public StatusInfo addParametersItem(StatusInfoParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Optional parameters that further clarfiy the information about the error
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "Optional parameters that further clarfiy the information about the error")
  public List<StatusInfoParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<StatusInfoParameter> parameters) {
    this.parameters = parameters;
  }

  public StatusInfo solutionMsg(String solutionMsg) {
    this.solutionMsg = solutionMsg;
    return this;
  }

   /**
   * Get solutionMsg
   * @return solutionMsg
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSolutionMsg() {
    return solutionMsg;
  }

  public void setSolutionMsg(String solutionMsg) {
    this.solutionMsg = solutionMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusInfo statusInfo = (StatusInfo) o;
    return Objects.equals(this.errorMsg, statusInfo.errorMsg) &&
        Objects.equals(this.msgId, statusInfo.msgId) &&
        Objects.equals(this.parameters, statusInfo.parameters) &&
        Objects.equals(this.solutionMsg, statusInfo.solutionMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMsg, msgId, parameters, solutionMsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfo {\n");
    
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    solutionMsg: ").append(toIndentedString(solutionMsg)).append("\n");
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

