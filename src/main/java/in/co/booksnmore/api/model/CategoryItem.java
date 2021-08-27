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
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * CategoryItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-27T05:47:21.813Z[GMT]")
public class CategoryItem implements Parcelable {
  @SerializedName("category")
  private String category = null;

  @SerializedName("books")
  private List<BookData> books = new ArrayList<BookData>();

  public CategoryItem() {
  }
  public CategoryItem category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(required = true, description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CategoryItem books(List<BookData> books) {
    this.books = books;
    return this;
  }

  public CategoryItem addBooksItem(BookData booksItem) {
    this.books.add(booksItem);
    return this;
  }

   /**
   * Get books
   * @return books
  **/
  @Schema(required = true, description = "")
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
    CategoryItem categoryItem = (CategoryItem) o;
    return Objects.equals(this.category, categoryItem.category) &&
        Objects.equals(this.books, categoryItem.books);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, books);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryItem {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    out.writeValue(category);
    out.writeValue(books);
  }

  CategoryItem(Parcel in) {
    category = (String)in.readValue(null);
    books = (List<BookData>)in.readValue(BookData.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CategoryItem> CREATOR = new Parcelable.Creator<CategoryItem>() {
    public CategoryItem createFromParcel(Parcel in) {
      return new CategoryItem(in);
    }
    public CategoryItem[] newArray(int size) {
      return new CategoryItem[size];
    }
  };
}
