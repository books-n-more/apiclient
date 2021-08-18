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
 * SearchData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T07:16:47.677Z[GMT]")
public class SearchData implements Parcelable {
  @SerializedName("startBook")
  private BigDecimal startBook = null;

  @SerializedName("booksMatched")
  private BigDecimal booksMatched = null;

  @SerializedName("endBook")
  private BigDecimal endBook = null;

  @SerializedName("errorCode")
  private BigDecimal errorCode = null;

  @SerializedName("books")
  private List<BookData> books = null;

  @SerializedName("borrowStatus")
  private String borrowStatus = null;

  public SearchData() {
  }
  public SearchData startBook(BigDecimal startBook) {
    this.startBook = startBook;
    return this;
  }

   /**
   * Get startBook
   * @return startBook
  **/
  @Schema(description = "")
  public BigDecimal getStartBook() {
    return startBook;
  }

  public void setStartBook(BigDecimal startBook) {
    this.startBook = startBook;
  }

  public SearchData booksMatched(BigDecimal booksMatched) {
    this.booksMatched = booksMatched;
    return this;
  }

   /**
   * Get booksMatched
   * @return booksMatched
  **/
  @Schema(description = "")
  public BigDecimal getBooksMatched() {
    return booksMatched;
  }

  public void setBooksMatched(BigDecimal booksMatched) {
    this.booksMatched = booksMatched;
  }

  public SearchData endBook(BigDecimal endBook) {
    this.endBook = endBook;
    return this;
  }

   /**
   * Get endBook
   * @return endBook
  **/
  @Schema(description = "")
  public BigDecimal getEndBook() {
    return endBook;
  }

  public void setEndBook(BigDecimal endBook) {
    this.endBook = endBook;
  }

  public SearchData errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public SearchData books(List<BookData> books) {
    this.books = books;
    return this;
  }

  public SearchData addBooksItem(BookData booksItem) {
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

  public SearchData borrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
    return this;
  }

   /**
   * Get borrowStatus
   * @return borrowStatus
  **/
  @Schema(description = "")
  public String getBorrowStatus() {
    return borrowStatus;
  }

  public void setBorrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchData searchData = (SearchData) o;
    return Objects.equals(this.startBook, searchData.startBook) &&
        Objects.equals(this.booksMatched, searchData.booksMatched) &&
        Objects.equals(this.endBook, searchData.endBook) &&
        Objects.equals(this.errorCode, searchData.errorCode) &&
        Objects.equals(this.books, searchData.books) &&
        Objects.equals(this.borrowStatus, searchData.borrowStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startBook, booksMatched, endBook, errorCode, books, borrowStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchData {\n");
    
    sb.append("    startBook: ").append(toIndentedString(startBook)).append("\n");
    sb.append("    booksMatched: ").append(toIndentedString(booksMatched)).append("\n");
    sb.append("    endBook: ").append(toIndentedString(endBook)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
    sb.append("    borrowStatus: ").append(toIndentedString(borrowStatus)).append("\n");
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
    out.writeValue(startBook);
    out.writeValue(booksMatched);
    out.writeValue(endBook);
    out.writeValue(errorCode);
    out.writeValue(books);
    out.writeValue(borrowStatus);
  }

  SearchData(Parcel in) {
    startBook = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    booksMatched = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    endBook = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    errorCode = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    books = (List<BookData>)in.readValue(BookData.class.getClassLoader());
    borrowStatus = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SearchData> CREATOR = new Parcelable.Creator<SearchData>() {
    public SearchData createFromParcel(Parcel in) {
      return new SearchData(in);
    }
    public SearchData[] newArray(int size) {
      return new SearchData[size];
    }
  };
}
