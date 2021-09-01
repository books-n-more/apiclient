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
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * ErrorData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T11:17:49.897Z[GMT]")
public class ErrorData implements Parcelable {
  @SerializedName("errorStrings")
  private List<Object> errorStrings = new ArrayList<Object>();

  public ErrorData() {
  }
  public ErrorData errorStrings(List<Object> errorStrings) {
    this.errorStrings = errorStrings;
    return this;
  }

  public ErrorData addErrorStringsItem(Object errorStringsItem) {
    this.errorStrings.add(errorStringsItem);
    return this;
  }

   /**
   * Get errorStrings
   * @return errorStrings
  **/
  @Schema(required = true, description = "")
  public List<Object> getErrorStrings() {
    return errorStrings;
  }

  public void setErrorStrings(List<Object> errorStrings) {
    this.errorStrings = errorStrings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorData errorData = (ErrorData) o;
    return Objects.equals(this.errorStrings, errorData.errorStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorStrings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorData {\n");
    
    sb.append("    errorStrings: ").append(toIndentedString(errorStrings)).append("\n");
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
    out.writeValue(errorStrings);
  }

  ErrorData(Parcel in) {
    errorStrings = (List<Object>)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ErrorData> CREATOR = new Parcelable.Creator<ErrorData>() {
    public ErrorData createFromParcel(Parcel in) {
      return new ErrorData(in);
    }
    public ErrorData[] newArray(int size) {
      return new ErrorData[size];
    }
  };
}
