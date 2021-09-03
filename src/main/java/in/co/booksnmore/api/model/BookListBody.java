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
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * BookListBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-03T18:39:46.830Z[GMT]")
public class BookListBody implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("bookIds")
  private List<Integer> bookIds = null;

  public BookListBody() {
  }
  public BookListBody authKey(String authKey) {
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

  public BookListBody bookIds(List<Integer> bookIds) {
    this.bookIds = bookIds;
    return this;
  }

  public BookListBody addBookIdsItem(Integer bookIdsItem) {
    if (this.bookIds == null) {
      this.bookIds = new ArrayList<Integer>();
    }
    this.bookIds.add(bookIdsItem);
    return this;
  }

   /**
   * Get bookIds
   * @return bookIds
  **/
  @Schema(description = "")
  public List<Integer> getBookIds() {
    return bookIds;
  }

  public void setBookIds(List<Integer> bookIds) {
    this.bookIds = bookIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookListBody bookListBody = (BookListBody) o;
    return Objects.equals(this.authKey, bookListBody.authKey) &&
        Objects.equals(this.bookIds, bookListBody.bookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, bookIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookListBody {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    bookIds: ").append(toIndentedString(bookIds)).append("\n");
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
    out.writeValue(bookIds);
  }

  BookListBody(Parcel in) {
    authKey = (String)in.readValue(null);
    bookIds = (List<Integer>)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<BookListBody> CREATOR = new Parcelable.Creator<BookListBody>() {
    public BookListBody createFromParcel(Parcel in) {
      return new BookListBody(in);
    }
    public BookListBody[] newArray(int size) {
      return new BookListBody[size];
    }
  };
}
