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
 * UserBooks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T11:17:49.897Z[GMT]")
public class UserBooks implements Parcelable {
  @SerializedName("borrowed")
  private List<BookData> borrowed = null;

  @SerializedName("reserved")
  private List<BookData> reserved = null;

  @SerializedName("readyToReturn")
  private List<BookData> readyToReturn = null;

  public UserBooks() {
  }
  public UserBooks borrowed(List<BookData> borrowed) {
    this.borrowed = borrowed;
    return this;
  }

  public UserBooks addBorrowedItem(BookData borrowedItem) {
    if (this.borrowed == null) {
      this.borrowed = new ArrayList<BookData>();
    }
    this.borrowed.add(borrowedItem);
    return this;
  }

   /**
   * Get borrowed
   * @return borrowed
  **/
  @Schema(description = "")
  public List<BookData> getBorrowed() {
    return borrowed;
  }

  public void setBorrowed(List<BookData> borrowed) {
    this.borrowed = borrowed;
  }

  public UserBooks reserved(List<BookData> reserved) {
    this.reserved = reserved;
    return this;
  }

  public UserBooks addReservedItem(BookData reservedItem) {
    if (this.reserved == null) {
      this.reserved = new ArrayList<BookData>();
    }
    this.reserved.add(reservedItem);
    return this;
  }

   /**
   * Get reserved
   * @return reserved
  **/
  @Schema(description = "")
  public List<BookData> getReserved() {
    return reserved;
  }

  public void setReserved(List<BookData> reserved) {
    this.reserved = reserved;
  }

  public UserBooks readyToReturn(List<BookData> readyToReturn) {
    this.readyToReturn = readyToReturn;
    return this;
  }

  public UserBooks addReadyToReturnItem(BookData readyToReturnItem) {
    if (this.readyToReturn == null) {
      this.readyToReturn = new ArrayList<BookData>();
    }
    this.readyToReturn.add(readyToReturnItem);
    return this;
  }

   /**
   * Get readyToReturn
   * @return readyToReturn
  **/
  @Schema(description = "")
  public List<BookData> getReadyToReturn() {
    return readyToReturn;
  }

  public void setReadyToReturn(List<BookData> readyToReturn) {
    this.readyToReturn = readyToReturn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBooks userBooks = (UserBooks) o;
    return Objects.equals(this.borrowed, userBooks.borrowed) &&
        Objects.equals(this.reserved, userBooks.reserved) &&
        Objects.equals(this.readyToReturn, userBooks.readyToReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borrowed, reserved, readyToReturn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBooks {\n");
    
    sb.append("    borrowed: ").append(toIndentedString(borrowed)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    readyToReturn: ").append(toIndentedString(readyToReturn)).append("\n");
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
    out.writeValue(borrowed);
    out.writeValue(reserved);
    out.writeValue(readyToReturn);
  }

  UserBooks(Parcel in) {
    borrowed = (List<BookData>)in.readValue(BookData.class.getClassLoader());
    reserved = (List<BookData>)in.readValue(BookData.class.getClassLoader());
    readyToReturn = (List<BookData>)in.readValue(BookData.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<UserBooks> CREATOR = new Parcelable.Creator<UserBooks>() {
    public UserBooks createFromParcel(Parcel in) {
      return new UserBooks(in);
    }
    public UserBooks[] newArray(int size) {
      return new UserBooks[size];
    }
  };
}
