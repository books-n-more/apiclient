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
import in.co.booksnmore.api.model.BookData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * AdminBookByIdData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-27T05:47:21.813Z[GMT]")
public class AdminBookByIdData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("book")
  private BookData book = null;

  public AdminBookByIdData() {
  }
  public AdminBookByIdData errorCode(Integer errorCode) {
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

  public AdminBookByIdData book(BookData book) {
    this.book = book;
    return this;
  }

   /**
   * Get book
   * @return book
  **/
  @Schema(description = "")
  public BookData getBook() {
    return book;
  }

  public void setBook(BookData book) {
    this.book = book;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBookByIdData adminBookByIdData = (AdminBookByIdData) o;
    return Objects.equals(this.errorCode, adminBookByIdData.errorCode) &&
        Objects.equals(this.book, adminBookByIdData.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, book);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBookByIdData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
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
    out.writeValue(book);
  }

  AdminBookByIdData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    book = (BookData)in.readValue(BookData.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<AdminBookByIdData> CREATOR = new Parcelable.Creator<AdminBookByIdData>() {
    public AdminBookByIdData createFromParcel(Parcel in) {
      return new AdminBookByIdData(in);
    }
    public AdminBookByIdData[] newArray(int size) {
      return new AdminBookByIdData[size];
    }
  };
}
