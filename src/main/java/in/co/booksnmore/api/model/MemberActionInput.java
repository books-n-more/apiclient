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
 * MemberActionInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T04:05:40.533Z[GMT]")
public class MemberActionInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("bookId")
  private String bookId = null;

  public MemberActionInput() {
  }
  public MemberActionInput authKey(String authKey) {
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

  public MemberActionInput bookId(String bookId) {
    this.bookId = bookId;
    return this;
  }

   /**
   * Get bookId
   * @return bookId
  **/
  @Schema(required = true, description = "")
  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberActionInput memberActionInput = (MemberActionInput) o;
    return Objects.equals(this.authKey, memberActionInput.authKey) &&
        Objects.equals(this.bookId, memberActionInput.bookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, bookId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberActionInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
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
    out.writeValue(bookId);
  }

  MemberActionInput(Parcel in) {
    authKey = (String)in.readValue(null);
    bookId = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<MemberActionInput> CREATOR = new Parcelable.Creator<MemberActionInput>() {
    public MemberActionInput createFromParcel(Parcel in) {
      return new MemberActionInput(in);
    }
    public MemberActionInput[] newArray(int size) {
      return new MemberActionInput[size];
    }
  };
}
