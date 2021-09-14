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
 * VerifyKeyReturn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T04:05:40.533Z[GMT]")
public class VerifyKeyReturn implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("authKey")
  private String authKey = null;

  public VerifyKeyReturn() {
  }
  public VerifyKeyReturn errorCode(Integer errorCode) {
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

  public VerifyKeyReturn authKey(String authKey) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyKeyReturn verifyKeyReturn = (VerifyKeyReturn) o;
    return Objects.equals(this.errorCode, verifyKeyReturn.errorCode) &&
        Objects.equals(this.authKey, verifyKeyReturn.authKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, authKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyKeyReturn {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
    out.writeValue(errorCode);
    out.writeValue(authKey);
  }

  VerifyKeyReturn(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    authKey = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<VerifyKeyReturn> CREATOR = new Parcelable.Creator<VerifyKeyReturn>() {
    public VerifyKeyReturn createFromParcel(Parcel in) {
      return new VerifyKeyReturn(in);
    }
    public VerifyKeyReturn[] newArray(int size) {
      return new VerifyKeyReturn[size];
    }
  };
}
