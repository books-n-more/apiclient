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
 * ManifestDataDispatch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class ManifestDataDispatch implements Parcelable {
  @SerializedName("author")
  private String author = null;

  @SerializedName("bookId")
  private Integer bookId = null;

  @SerializedName("title")
  private String title = null;

  public ManifestDataDispatch() {
  }
  public ManifestDataDispatch author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(required = true, description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ManifestDataDispatch bookId(Integer bookId) {
    this.bookId = bookId;
    return this;
  }

   /**
   * Get bookId
   * @return bookId
  **/
  @Schema(required = true, description = "")
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public ManifestDataDispatch title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestDataDispatch manifestDataDispatch = (ManifestDataDispatch) o;
    return Objects.equals(this.author, manifestDataDispatch.author) &&
        Objects.equals(this.bookId, manifestDataDispatch.bookId) &&
        Objects.equals(this.title, manifestDataDispatch.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, bookId, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestDataDispatch {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    out.writeValue(author);
    out.writeValue(bookId);
    out.writeValue(title);
  }

  ManifestDataDispatch(Parcel in) {
    author = (String)in.readValue(null);
    bookId = (Integer)in.readValue(null);
    title = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ManifestDataDispatch> CREATOR = new Parcelable.Creator<ManifestDataDispatch>() {
    public ManifestDataDispatch createFromParcel(Parcel in) {
      return new ManifestDataDispatch(in);
    }
    public ManifestDataDispatch[] newArray(int size) {
      return new ManifestDataDispatch[size];
    }
  };
}
