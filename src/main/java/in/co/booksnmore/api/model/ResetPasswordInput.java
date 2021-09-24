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
 * ResetPasswordInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class ResetPasswordInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("password")
  private String password = null;

  public ResetPasswordInput() {
  }
  public ResetPasswordInput authKey(String authKey) {
    this.authKey = authKey;
    return this;
  }

   /**
   * Get authKey
   * @return authKey
  **/
  @Schema(required = true, description = "")
  public String getAuthKey() {
    return authKey;
  }

  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }

  public ResetPasswordInput token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(required = true, description = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ResetPasswordInput password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordInput resetPasswordInput = (ResetPasswordInput) o;
    return Objects.equals(this.authKey, resetPasswordInput.authKey) &&
        Objects.equals(this.token, resetPasswordInput.token) &&
        Objects.equals(this.password, resetPasswordInput.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, token, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    out.writeValue(token);
    out.writeValue(password);
  }

  ResetPasswordInput(Parcel in) {
    authKey = (String)in.readValue(null);
    token = (String)in.readValue(null);
    password = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ResetPasswordInput> CREATOR = new Parcelable.Creator<ResetPasswordInput>() {
    public ResetPasswordInput createFromParcel(Parcel in) {
      return new ResetPasswordInput(in);
    }
    public ResetPasswordInput[] newArray(int size) {
      return new ResetPasswordInput[size];
    }
  };
}
