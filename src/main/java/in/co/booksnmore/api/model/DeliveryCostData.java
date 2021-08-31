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
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * DeliveryCostData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T04:36:48.030Z[GMT]")
public class DeliveryCostData implements Parcelable {
  @SerializedName("cost")
  private List<List<BigDecimal>> cost = new ArrayList<List<BigDecimal>>();

  @SerializedName("numDeliveries")
  private Integer numDeliveries = null;

  public DeliveryCostData() {
  }
  public DeliveryCostData cost(List<List<BigDecimal>> cost) {
    this.cost = cost;
    return this;
  }

  public DeliveryCostData addCostItem(List<BigDecimal> costItem) {
    this.cost.add(costItem);
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(required = true, description = "")
  public List<List<BigDecimal>> getCost() {
    return cost;
  }

  public void setCost(List<List<BigDecimal>> cost) {
    this.cost = cost;
  }

  public DeliveryCostData numDeliveries(Integer numDeliveries) {
    this.numDeliveries = numDeliveries;
    return this;
  }

   /**
   * Get numDeliveries
   * @return numDeliveries
  **/
  @Schema(required = true, description = "")
  public Integer getNumDeliveries() {
    return numDeliveries;
  }

  public void setNumDeliveries(Integer numDeliveries) {
    this.numDeliveries = numDeliveries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryCostData deliveryCostData = (DeliveryCostData) o;
    return Objects.equals(this.cost, deliveryCostData.cost) &&
        Objects.equals(this.numDeliveries, deliveryCostData.numDeliveries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, numDeliveries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryCostData {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    numDeliveries: ").append(toIndentedString(numDeliveries)).append("\n");
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
    out.writeValue(numDeliveries);
  }

  DeliveryCostData(Parcel in) {
    cost = (List<List<BigDecimal>>)in.readValue(List.class.getClassLoader());
    numDeliveries = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<DeliveryCostData> CREATOR = new Parcelable.Creator<DeliveryCostData>() {
    public DeliveryCostData createFromParcel(Parcel in) {
      return new DeliveryCostData(in);
    }
    public DeliveryCostData[] newArray(int size) {
      return new DeliveryCostData[size];
    }
  };
}
