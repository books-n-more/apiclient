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
import in.co.booksnmore.api.model.UserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * SearchMemberData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class SearchMemberData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("members")
  private List<UserInfo> members = null;

  public SearchMemberData() {
  }
  public SearchMemberData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public SearchMemberData members(List<UserInfo> members) {
    this.members = members;
    return this;
  }

  public SearchMemberData addMembersItem(UserInfo membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<UserInfo>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @Schema(description = "")
  public List<UserInfo> getMembers() {
    return members;
  }

  public void setMembers(List<UserInfo> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMemberData searchMemberData = (SearchMemberData) o;
    return Objects.equals(this.errorCode, searchMemberData.errorCode) &&
        Objects.equals(this.members, searchMemberData.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchMemberData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    out.writeValue(members);
  }

  SearchMemberData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    members = (List<UserInfo>)in.readValue(UserInfo.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SearchMemberData> CREATOR = new Parcelable.Creator<SearchMemberData>() {
    public SearchMemberData createFromParcel(Parcel in) {
      return new SearchMemberData(in);
    }
    public SearchMemberData[] newArray(int size) {
      return new SearchMemberData[size];
    }
  };
}
