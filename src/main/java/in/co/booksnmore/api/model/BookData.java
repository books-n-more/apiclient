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
 * BookData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class BookData implements Parcelable {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("borrowedOn")
  private String borrowedOn = null;

  @SerializedName("canCancel")
  private Boolean canCancel = null;

  @SerializedName("shelfCode")
  private String shelfCode = null;

  @SerializedName("borrowerId")
  private Integer borrowerId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("isAvailable")
  private Boolean isAvailable = null;

  @SerializedName("ISBN")
  private String ISBN = null;

  @SerializedName("image")
  private String image = null;

  public BookData() {
  }
  public BookData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BookData title(String title) {
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

  public BookData author(String author) {
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

  public BookData borrowedOn(String borrowedOn) {
    this.borrowedOn = borrowedOn;
    return this;
  }

   /**
   * Get borrowedOn
   * @return borrowedOn
  **/
  @Schema(description = "")
  public String getBorrowedOn() {
    return borrowedOn;
  }

  public void setBorrowedOn(String borrowedOn) {
    this.borrowedOn = borrowedOn;
  }

  public BookData canCancel(Boolean canCancel) {
    this.canCancel = canCancel;
    return this;
  }

   /**
   * Get canCancel
   * @return canCancel
  **/
  @Schema(description = "")
  public Boolean isCanCancel() {
    return canCancel;
  }

  public void setCanCancel(Boolean canCancel) {
    this.canCancel = canCancel;
  }

  public BookData shelfCode(String shelfCode) {
    this.shelfCode = shelfCode;
    return this;
  }

   /**
   * Get shelfCode
   * @return shelfCode
  **/
  @Schema(description = "")
  public String getShelfCode() {
    return shelfCode;
  }

  public void setShelfCode(String shelfCode) {
    this.shelfCode = shelfCode;
  }

  public BookData borrowerId(Integer borrowerId) {
    this.borrowerId = borrowerId;
    return this;
  }

   /**
   * Get borrowerId
   * @return borrowerId
  **/
  @Schema(description = "")
  public Integer getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(Integer borrowerId) {
    this.borrowerId = borrowerId;
  }

  public BookData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BookData isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Get isAvailable
   * @return isAvailable
  **/
  @Schema(description = "")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public BookData ISBN(String ISBN) {
    this.ISBN = ISBN;
    return this;
  }

   /**
   * Get ISBN
   * @return ISBN
  **/
  @Schema(description = "")
  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public BookData image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookData bookData = (BookData) o;
    return Objects.equals(this.id, bookData.id) &&
        Objects.equals(this.title, bookData.title) &&
        Objects.equals(this.author, bookData.author) &&
        Objects.equals(this.borrowedOn, bookData.borrowedOn) &&
        Objects.equals(this.canCancel, bookData.canCancel) &&
        Objects.equals(this.shelfCode, bookData.shelfCode) &&
        Objects.equals(this.borrowerId, bookData.borrowerId) &&
        Objects.equals(this.status, bookData.status) &&
        Objects.equals(this.isAvailable, bookData.isAvailable) &&
        Objects.equals(this.ISBN, bookData.ISBN) &&
        Objects.equals(this.image, bookData.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, author, borrowedOn, canCancel, shelfCode, borrowerId, status, isAvailable, ISBN, image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    borrowedOn: ").append(toIndentedString(borrowedOn)).append("\n");
    sb.append("    canCancel: ").append(toIndentedString(canCancel)).append("\n");
    sb.append("    shelfCode: ").append(toIndentedString(shelfCode)).append("\n");
    sb.append("    borrowerId: ").append(toIndentedString(borrowerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    ISBN: ").append(toIndentedString(ISBN)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    out.writeValue(id);
    out.writeValue(title);
    out.writeValue(author);
    out.writeValue(borrowedOn);
    out.writeValue(canCancel);
    out.writeValue(shelfCode);
    out.writeValue(borrowerId);
    out.writeValue(status);
    out.writeValue(isAvailable);
    out.writeValue(ISBN);
    out.writeValue(image);
  }

  BookData(Parcel in) {
    id = (Integer)in.readValue(null);
    title = (String)in.readValue(null);
    author = (String)in.readValue(null);
    borrowedOn = (String)in.readValue(null);
    canCancel = (Boolean)in.readValue(null);
    shelfCode = (String)in.readValue(null);
    borrowerId = (Integer)in.readValue(null);
    status = (String)in.readValue(null);
    isAvailable = (Boolean)in.readValue(null);
    ISBN = (String)in.readValue(null);
    image = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<BookData> CREATOR = new Parcelable.Creator<BookData>() {
    public BookData createFromParcel(Parcel in) {
      return new BookData(in);
    }
    public BookData[] newArray(int size) {
      return new BookData[size];
    }
  };
}
