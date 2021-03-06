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
 * PlanInfoItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class PlanInfoItem implements Parcelable {
  @SerializedName("cost")
  private Integer cost = null;

  @SerializedName("deposit")
  private Integer deposit = null;

  @SerializedName("displayString")
  private String displayString = null;

  @SerializedName("numBooks")
  private Integer numBooks = null;

  @SerializedName("planDuration")
  private String planDuration = null;

  @SerializedName("planSize")
  private String planSize = null;

  @SerializedName("numMonths")
  private Integer numMonths = null;

  public PlanInfoItem() {
  }
  public PlanInfoItem cost(Integer cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(required = true, description = "")
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public PlanInfoItem deposit(Integer deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @Schema(required = true, description = "")
  public Integer getDeposit() {
    return deposit;
  }

  public void setDeposit(Integer deposit) {
    this.deposit = deposit;
  }

  public PlanInfoItem displayString(String displayString) {
    this.displayString = displayString;
    return this;
  }

   /**
   * Get displayString
   * @return displayString
  **/
  @Schema(required = true, description = "")
  public String getDisplayString() {
    return displayString;
  }

  public void setDisplayString(String displayString) {
    this.displayString = displayString;
  }

  public PlanInfoItem numBooks(Integer numBooks) {
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

  public PlanInfoItem planDuration(String planDuration) {
    this.planDuration = planDuration;
    return this;
  }

   /**
   * Get planDuration
   * @return planDuration
  **/
  @Schema(required = true, description = "")
  public String getPlanDuration() {
    return planDuration;
  }

  public void setPlanDuration(String planDuration) {
    this.planDuration = planDuration;
  }

  public PlanInfoItem planSize(String planSize) {
    this.planSize = planSize;
    return this;
  }

   /**
   * Get planSize
   * @return planSize
  **/
  @Schema(required = true, description = "")
  public String getPlanSize() {
    return planSize;
  }

  public void setPlanSize(String planSize) {
    this.planSize = planSize;
  }

  public PlanInfoItem numMonths(Integer numMonths) {
    this.numMonths = numMonths;
    return this;
  }

   /**
   * Get numMonths
   * @return numMonths
  **/
  @Schema(required = true, description = "")
  public Integer getNumMonths() {
    return numMonths;
  }

  public void setNumMonths(Integer numMonths) {
    this.numMonths = numMonths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanInfoItem planInfoItem = (PlanInfoItem) o;
    return Objects.equals(this.cost, planInfoItem.cost) &&
        Objects.equals(this.deposit, planInfoItem.deposit) &&
        Objects.equals(this.displayString, planInfoItem.displayString) &&
        Objects.equals(this.numBooks, planInfoItem.numBooks) &&
        Objects.equals(this.planDuration, planInfoItem.planDuration) &&
        Objects.equals(this.planSize, planInfoItem.planSize) &&
        Objects.equals(this.numMonths, planInfoItem.numMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, deposit, displayString, numBooks, planDuration, planSize, numMonths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInfoItem {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    displayString: ").append(toIndentedString(displayString)).append("\n");
    sb.append("    numBooks: ").append(toIndentedString(numBooks)).append("\n");
    sb.append("    planDuration: ").append(toIndentedString(planDuration)).append("\n");
    sb.append("    planSize: ").append(toIndentedString(planSize)).append("\n");
    sb.append("    numMonths: ").append(toIndentedString(numMonths)).append("\n");
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
    out.writeValue(cost);
    out.writeValue(deposit);
    out.writeValue(displayString);
    out.writeValue(numBooks);
    out.writeValue(planDuration);
    out.writeValue(planSize);
    out.writeValue(numMonths);
  }

  PlanInfoItem(Parcel in) {
    cost = (Integer)in.readValue(null);
    deposit = (Integer)in.readValue(null);
    displayString = (String)in.readValue(null);
    numBooks = (Integer)in.readValue(null);
    planDuration = (String)in.readValue(null);
    planSize = (String)in.readValue(null);
    numMonths = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlanInfoItem> CREATOR = new Parcelable.Creator<PlanInfoItem>() {
    public PlanInfoItem createFromParcel(Parcel in) {
      return new PlanInfoItem(in);
    }
    public PlanInfoItem[] newArray(int size) {
      return new PlanInfoItem[size];
    }
  };
}
