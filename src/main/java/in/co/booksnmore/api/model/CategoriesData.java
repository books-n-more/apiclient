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
import in.co.booksnmore.api.model.CategoryItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * CategoriesData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T04:33:57.894Z[GMT]")
public class CategoriesData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("borrowStatus")
  private String borrowStatus = null;

  @SerializedName("categories")
  private List<CategoryItem> categories = null;

  public CategoriesData() {
  }
  public CategoriesData errorCode(Integer errorCode) {
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

  public CategoriesData borrowStatus(String borrowStatus) {
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

  public CategoriesData categories(List<CategoryItem> categories) {
    this.categories = categories;
    return this;
  }

  public CategoriesData addCategoriesItem(CategoryItem categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoryItem>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @Schema(description = "")
  public List<CategoryItem> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryItem> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoriesData categoriesData = (CategoriesData) o;
    return Objects.equals(this.errorCode, categoriesData.errorCode) &&
        Objects.equals(this.borrowStatus, categoriesData.borrowStatus) &&
        Objects.equals(this.categories, categoriesData.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, borrowStatus, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    borrowStatus: ").append(toIndentedString(borrowStatus)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    out.writeValue(borrowStatus);
    out.writeValue(categories);
  }

  CategoriesData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    borrowStatus = (String)in.readValue(null);
    categories = (List<CategoryItem>)in.readValue(CategoryItem.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CategoriesData> CREATOR = new Parcelable.Creator<CategoriesData>() {
    public CategoriesData createFromParcel(Parcel in) {
      return new CategoriesData(in);
    }
    public CategoriesData[] newArray(int size) {
      return new CategoriesData[size];
    }
  };
}
