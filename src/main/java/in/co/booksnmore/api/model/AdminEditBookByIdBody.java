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
 * AdminEditBookByIdBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-22T05:00:00.161Z[GMT]")
public class AdminEditBookByIdBody implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("book")
  private BookData book = null;

  public AdminEditBookByIdBody() {
  }
  public AdminEditBookByIdBody authKey(String authKey) {
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

  public AdminEditBookByIdBody book(BookData book) {
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
    AdminEditBookByIdBody adminEditBookByIdBody = (AdminEditBookByIdBody) o;
    return Objects.equals(this.authKey, adminEditBookByIdBody.authKey) &&
        Objects.equals(this.book, adminEditBookByIdBody.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, book);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminEditBookByIdBody {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
    out.writeValue(authKey);
    out.writeValue(book);
  }

  AdminEditBookByIdBody(Parcel in) {
    authKey = (String)in.readValue(null);
    book = (BookData)in.readValue(BookData.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<AdminEditBookByIdBody> CREATOR = new Parcelable.Creator<AdminEditBookByIdBody>() {
    public AdminEditBookByIdBody createFromParcel(Parcel in) {
      return new AdminEditBookByIdBody(in);
    }
    public AdminEditBookByIdBody[] newArray(int size) {
      return new AdminEditBookByIdBody[size];
    }
  };
}
