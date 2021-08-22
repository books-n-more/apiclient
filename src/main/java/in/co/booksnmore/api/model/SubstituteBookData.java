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
 * SubstituteBookData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-22T12:51:29.524Z[GMT]")
public class SubstituteBookData implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("bookId")
  private String bookId = null;

  @SerializedName("newBookId")
  private String newBookId = null;

  public SubstituteBookData() {
  }
  public SubstituteBookData authKey(String authKey) {
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

  public SubstituteBookData bookId(String bookId) {
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

  public SubstituteBookData newBookId(String newBookId) {
    this.newBookId = newBookId;
    return this;
  }

   /**
   * Get newBookId
   * @return newBookId
  **/
  @Schema(required = true, description = "")
  public String getNewBookId() {
    return newBookId;
  }

  public void setNewBookId(String newBookId) {
    this.newBookId = newBookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstituteBookData substituteBookData = (SubstituteBookData) o;
    return Objects.equals(this.authKey, substituteBookData.authKey) &&
        Objects.equals(this.bookId, substituteBookData.bookId) &&
        Objects.equals(this.newBookId, substituteBookData.newBookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, bookId, newBookId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstituteBookData {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    newBookId: ").append(toIndentedString(newBookId)).append("\n");
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
    out.writeValue(newBookId);
  }

  SubstituteBookData(Parcel in) {
    authKey = (String)in.readValue(null);
    bookId = (String)in.readValue(null);
    newBookId = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SubstituteBookData> CREATOR = new Parcelable.Creator<SubstituteBookData>() {
    public SubstituteBookData createFromParcel(Parcel in) {
      return new SubstituteBookData(in);
    }
    public SubstituteBookData[] newArray(int size) {
      return new SubstituteBookData[size];
    }
  };
}
