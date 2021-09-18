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
import in.co.booksnmore.api.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * MemberData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-18T20:12:33.529Z[GMT]")
public class MemberData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("memberData")
  private User memberData = null;

  public MemberData() {
  }
  public MemberData errorCode(Integer errorCode) {
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

  public MemberData memberData(User memberData) {
    this.memberData = memberData;
    return this;
  }

   /**
   * Get memberData
   * @return memberData
  **/
  @Schema(description = "")
  public User getMemberData() {
    return memberData;
  }

  public void setMemberData(User memberData) {
    this.memberData = memberData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberData memberData = (MemberData) o;
    return Objects.equals(this.errorCode, memberData.errorCode) &&
        Objects.equals(this.memberData, memberData.memberData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, memberData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    memberData: ").append(toIndentedString(memberData)).append("\n");
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
    out.writeValue(memberData);
  }

  MemberData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    memberData = (User)in.readValue(User.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<MemberData> CREATOR = new Parcelable.Creator<MemberData>() {
    public MemberData createFromParcel(Parcel in) {
      return new MemberData(in);
    }
    public MemberData[] newArray(int size) {
      return new MemberData[size];
    }
  };
}
