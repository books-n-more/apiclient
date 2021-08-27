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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * AdminBookListData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-27T05:47:21.813Z[GMT]")
public class AdminBookListData implements Parcelable {
  @SerializedName("errorCode")
  private BigDecimal errorCode = null;

  @SerializedName("books")
  private List<BookData> books = null;

  public AdminBookListData() {
  }
  public AdminBookListData errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public AdminBookListData books(List<BookData> books) {
    this.books = books;
    return this;
  }

  public AdminBookListData addBooksItem(BookData booksItem) {
    if (this.books == null) {
      this.books = new ArrayList<BookData>();
    }
    this.books.add(booksItem);
    return this;
  }

   /**
   * Get books
   * @return books
  **/
  @Schema(description = "")
  public List<BookData> getBooks() {
    return books;
  }

  public void setBooks(List<BookData> books) {
    this.books = books;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBookListData adminBookListData = (AdminBookListData) o;
    return Objects.equals(this.errorCode, adminBookListData.errorCode) &&
        Objects.equals(this.books, adminBookListData.books);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, books);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBookListData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
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
    out.writeValue(books);
  }

  AdminBookListData(Parcel in) {
    errorCode = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    books = (List<BookData>)in.readValue(BookData.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<AdminBookListData> CREATOR = new Parcelable.Creator<AdminBookListData>() {
    public AdminBookListData createFromParcel(Parcel in) {
      return new AdminBookListData(in);
    }
    public AdminBookListData[] newArray(int size) {
      return new AdminBookListData[size];
    }
  };
}
