/*
 * bnm
 * Books N More's API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: samarthr1@outlook.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package in.co.booksnmore.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * GetAuthKeyRespone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-02T02:43:51.720Z[GMT]")
public class GetAuthKeyRespone implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("errorCode")
  private Integer errorCode = null;

  public GetAuthKeyRespone() {
  }
  public GetAuthKeyRespone authKey(String authKey) {
    this.authKey = authKey;
    return this;
  }

   /**
   * Get authKey
   * @return authKey
  **/
  @Schema(description = "")
  public String getAuthKey() {
    return authKey;
  }

  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }

  public GetAuthKeyRespone errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuthKeyRespone getAuthKeyRespone = (GetAuthKeyRespone) o;
    return Objects.equals(this.authKey, getAuthKeyRespone.authKey) &&
        Objects.equals(this.errorCode, getAuthKeyRespone.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthKeyRespone {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(authKey);
    out.writeValue(errorCode);
  }

  GetAuthKeyRespone(Parcel in) {
    authKey = (String)in.readValue(null);
    errorCode = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<GetAuthKeyRespone> CREATOR = new Parcelable.Creator<GetAuthKeyRespone>() {
    public GetAuthKeyRespone createFromParcel(Parcel in) {
      return new GetAuthKeyRespone(in);
    }
    public GetAuthKeyRespone[] newArray(int size) {
      return new GetAuthKeyRespone[size];
    }
  };
}
