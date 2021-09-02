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
 * SearchBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-02T02:43:51.720Z[GMT]")
public class SearchBody implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("search")
  private String search = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("numBooks")
  private Integer numBooks = null;

  public SearchBody() {
  }
  public SearchBody authKey(String authKey) {
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

  public SearchBody search(String search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @Schema(required = true, description = "")
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public SearchBody start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(required = true, description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public SearchBody numBooks(Integer numBooks) {
    this.numBooks = numBooks;
    return this;
  }

   /**
   * Get numBooks
   * @return numBooks
  **/
  @Schema(required = true, description = "")
  public Integer getNumBooks() {
    return numBooks;
  }

  public void setNumBooks(Integer numBooks) {
    this.numBooks = numBooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBody searchBody = (SearchBody) o;
    return Objects.equals(this.authKey, searchBody.authKey) &&
        Objects.equals(this.search, searchBody.search) &&
        Objects.equals(this.start, searchBody.start) &&
        Objects.equals(this.numBooks, searchBody.numBooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, search, start, numBooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBody {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    numBooks: ").append(toIndentedString(numBooks)).append("\n");
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
    out.writeValue(search);
    out.writeValue(start);
    out.writeValue(numBooks);
  }

  SearchBody(Parcel in) {
    authKey = (String)in.readValue(null);
    search = (String)in.readValue(null);
    start = (Integer)in.readValue(null);
    numBooks = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SearchBody> CREATOR = new Parcelable.Creator<SearchBody>() {
    public SearchBody createFromParcel(Parcel in) {
      return new SearchBody(in);
    }
    public SearchBody[] newArray(int size) {
      return new SearchBody[size];
    }
  };
}
