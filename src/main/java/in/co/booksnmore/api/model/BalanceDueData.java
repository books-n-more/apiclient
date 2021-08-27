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
import java.math.BigDecimal;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * BalanceDueData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-27T05:47:21.813Z[GMT]")
public class BalanceDueData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("balanceDue")
  private BigDecimal balanceDue = null;

  @SerializedName("futureDue")
  private BigDecimal futureDue = null;

  public BalanceDueData() {
  }
  public BalanceDueData errorCode(Integer errorCode) {
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

  public BalanceDueData balanceDue(BigDecimal balanceDue) {
    this.balanceDue = balanceDue;
    return this;
  }

   /**
   * Get balanceDue
   * @return balanceDue
  **/
  @Schema(required = true, description = "")
  public BigDecimal getBalanceDue() {
    return balanceDue;
  }

  public void setBalanceDue(BigDecimal balanceDue) {
    this.balanceDue = balanceDue;
  }

  public BalanceDueData futureDue(BigDecimal futureDue) {
    this.futureDue = futureDue;
    return this;
  }

   /**
   * Get futureDue
   * @return futureDue
  **/
  @Schema(required = true, description = "")
  public BigDecimal getFutureDue() {
    return futureDue;
  }

  public void setFutureDue(BigDecimal futureDue) {
    this.futureDue = futureDue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDueData balanceDueData = (BalanceDueData) o;
    return Objects.equals(this.errorCode, balanceDueData.errorCode) &&
        Objects.equals(this.balanceDue, balanceDueData.balanceDue) &&
        Objects.equals(this.futureDue, balanceDueData.futureDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, balanceDue, futureDue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDueData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    balanceDue: ").append(toIndentedString(balanceDue)).append("\n");
    sb.append("    futureDue: ").append(toIndentedString(futureDue)).append("\n");
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
    out.writeValue(balanceDue);
    out.writeValue(futureDue);
  }

  BalanceDueData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    balanceDue = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    futureDue = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<BalanceDueData> CREATOR = new Parcelable.Creator<BalanceDueData>() {
    public BalanceDueData createFromParcel(Parcel in) {
      return new BalanceDueData(in);
    }
    public BalanceDueData[] newArray(int size) {
      return new BalanceDueData[size];
    }
  };
}