/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerStateWaiting is a waiting state of a container.
 */
@ApiModel(description = "ContainerStateWaiting is a waiting state of a container.")

public class V1ContainerStateWaiting {
  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  public V1ContainerStateWaiting message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message regarding why the container is not yet running.
   * @return message
  **/
  @ApiModelProperty(value = "Message regarding why the container is not yet running.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ContainerStateWaiting reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason the container is not yet running.
   * @return reason
  **/
  @ApiModelProperty(value = "(brief) reason the container is not yet running.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateWaiting v1ContainerStateWaiting = (V1ContainerStateWaiting) o;
    return Objects.equals(this.message, v1ContainerStateWaiting.message) &&
        Objects.equals(this.reason, v1ContainerStateWaiting.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateWaiting {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

