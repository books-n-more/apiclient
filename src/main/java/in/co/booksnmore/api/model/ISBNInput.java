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
 * ISBNInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T04:05:40.533Z[GMT]")
public class ISBNInput implements Parcelable {
  @SerializedName("isbn")
  private String isbn = null;

  @SerializedName("authKey")
  private String authKey = null;

  public ISBNInput() {
  }
  public ISBNInput isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

   /**
   * Get isbn
   * @return isbn
  **/
  @Schema(required = true, description = "")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public ISBNInput authKey(String authKey) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ISBNInput isBNInput = (ISBNInput) o;
    return Objects.equals(this.isbn, isBNInput.isbn) &&
        Objects.equals(this.authKey, isBNInput.authKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn, authKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ISBNInput {\n");
    
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
    out.writeValue(isbn);
    out.writeValue(authKey);
  }

  ISBNInput(Parcel in) {
    isbn = (String)in.readValue(null);
    authKey = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ISBNInput> CREATOR = new Parcelable.Creator<ISBNInput>() {
    public ISBNInput createFromParcel(Parcel in) {
      return new ISBNInput(in);
    }
    public ISBNInput[] newArray(int size) {
      return new ISBNInput[size];
    }
  };
}
