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
import in.co.booksnmore.api.model.PlanInfoItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * PlanInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T07:16:47.677Z[GMT]")
public class PlanInfo implements Parcelable {
  @SerializedName("errorCode")
  private BigDecimal errorCode = null;

  @SerializedName("joiningFee")
  private BigDecimal joiningFee = null;

  @SerializedName("plans")
  private List<PlanInfoItem> plans = new ArrayList<PlanInfoItem>();

  public PlanInfo() {
  }
  public PlanInfo errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public PlanInfo joiningFee(BigDecimal joiningFee) {
    this.joiningFee = joiningFee;
    return this;
  }

   /**
   * Get joiningFee
   * @return joiningFee
  **/
  @Schema(required = true, description = "")
  public BigDecimal getJoiningFee() {
    return joiningFee;
  }

  public void setJoiningFee(BigDecimal joiningFee) {
    this.joiningFee = joiningFee;
  }

  public PlanInfo plans(List<PlanInfoItem> plans) {
    this.plans = plans;
    return this;
  }

  public PlanInfo addPlansItem(PlanInfoItem plansItem) {
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @Schema(required = true, description = "")
  public List<PlanInfoItem> getPlans() {
    return plans;
  }

  public void setPlans(List<PlanInfoItem> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanInfo planInfo = (PlanInfo) o;
    return Objects.equals(this.errorCode, planInfo.errorCode) &&
        Objects.equals(this.joiningFee, planInfo.joiningFee) &&
        Objects.equals(this.plans, planInfo.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, joiningFee, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInfo {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    joiningFee: ").append(toIndentedString(joiningFee)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
    out.writeValue(joiningFee);
    out.writeValue(plans);
  }

  PlanInfo(Parcel in) {
    errorCode = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    joiningFee = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    plans = (List<PlanInfoItem>)in.readValue(PlanInfoItem.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlanInfo> CREATOR = new Parcelable.Creator<PlanInfo>() {
    public PlanInfo createFromParcel(Parcel in) {
      return new PlanInfo(in);
    }
    public PlanInfo[] newArray(int size) {
      return new PlanInfo[size];
    }
  };
}
