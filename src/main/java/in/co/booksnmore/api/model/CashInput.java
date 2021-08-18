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
 * CashInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T07:16:47.677Z[GMT]")
public class CashInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("memberId")
  private BigDecimal memberId = null;

  @SerializedName("cashIn")
  private BigDecimal cashIn = null;

  public CashInput() {
  }
  public CashInput authKey(String authKey) {
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

  public CashInput memberId(BigDecimal memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @Schema(description = "")
  public BigDecimal getMemberId() {
    return memberId;
  }

  public void setMemberId(BigDecimal memberId) {
    this.memberId = memberId;
  }

  public CashInput cashIn(BigDecimal cashIn) {
    this.cashIn = cashIn;
    return this;
  }

   /**
   * Get cashIn
   * @return cashIn
  **/
  @Schema(description = "")
  public BigDecimal getCashIn() {
    return cashIn;
  }

  public void setCashIn(BigDecimal cashIn) {
    this.cashIn = cashIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashInput cashInput = (CashInput) o;
    return Objects.equals(this.authKey, cashInput.authKey) &&
        Objects.equals(this.memberId, cashInput.memberId) &&
        Objects.equals(this.cashIn, cashInput.cashIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, memberId, cashIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    cashIn: ").append(toIndentedString(cashIn)).append("\n");
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
    out.writeValue(memberId);
    out.writeValue(cashIn);
  }

  CashInput(Parcel in) {
    authKey = (String)in.readValue(null);
    memberId = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    cashIn = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CashInput> CREATOR = new Parcelable.Creator<CashInput>() {
    public CashInput createFromParcel(Parcel in) {
      return new CashInput(in);
    }
    public CashInput[] newArray(int size) {
      return new CashInput[size];
    }
  };
}