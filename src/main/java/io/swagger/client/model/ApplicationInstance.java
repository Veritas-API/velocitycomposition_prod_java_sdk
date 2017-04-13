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
import io.swagger.client.model.OracleInstance;
import io.swagger.client.model.StatusInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Object representing application instance
 */
@ApiModel(description = "Object representing application instance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:12:02.186Z")
public class ApplicationInstance {
  @SerializedName("asmDiskgroupName")
  private String asmDiskgroupName = null;

  @SerializedName("dbName")
  private String dbName = null;

  @SerializedName("instances")
  private List<OracleInstance> instances = new ArrayList<OracleInstance>();

  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("statusInfo")
  private StatusInfo statusInfo = null;

  @SerializedName("uri")
  private String uri = null;

  public ApplicationInstance asmDiskgroupName(String asmDiskgroupName) {
    this.asmDiskgroupName = asmDiskgroupName;
    return this;
  }

   /**
   * Get asmDiskgroupName
   * @return asmDiskgroupName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAsmDiskgroupName() {
    return asmDiskgroupName;
  }

  public void setAsmDiskgroupName(String asmDiskgroupName) {
    this.asmDiskgroupName = asmDiskgroupName;
  }

  public ApplicationInstance dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public ApplicationInstance instances(List<OracleInstance> instances) {
    this.instances = instances;
    return this;
  }

  public ApplicationInstance addInstancesItem(OracleInstance instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OracleInstance> getInstances() {
    return instances;
  }

  public void setInstances(List<OracleInstance> instances) {
    this.instances = instances;
  }

  public ApplicationInstance statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ApplicationInstance statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

   /**
   * Get statusInfo
   * @return statusInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public ApplicationInstance uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInstance applicationInstance = (ApplicationInstance) o;
    return Objects.equals(this.asmDiskgroupName, applicationInstance.asmDiskgroupName) &&
        Objects.equals(this.dbName, applicationInstance.dbName) &&
        Objects.equals(this.instances, applicationInstance.instances) &&
        Objects.equals(this.statusCode, applicationInstance.statusCode) &&
        Objects.equals(this.statusInfo, applicationInstance.statusInfo) &&
        Objects.equals(this.uri, applicationInstance.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asmDiskgroupName, dbName, instances, statusCode, statusInfo, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInstance {\n");
    
    sb.append("    asmDiskgroupName: ").append(toIndentedString(asmDiskgroupName)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

