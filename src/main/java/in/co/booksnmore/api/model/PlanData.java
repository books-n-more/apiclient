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
 * PlanData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-20T08:57:53.959Z[GMT]")
public class PlanData implements Parcelable {
  @SerializedName("duration")
  private String duration = null;

  @SerializedName("nextRenewal")
  private String nextRenewal = null;

  @SerializedName("planId")
  private Integer planId = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("warnRenew")
  private Boolean warnRenew = null;

  public PlanData() {
  }
  public PlanData duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(required = true, description = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public PlanData nextRenewal(String nextRenewal) {
    this.nextRenewal = nextRenewal;
    return this;
  }

   /**
   * Get nextRenewal
   * @return nextRenewal
  **/
  @Schema(required = true, description = "")
  public String getNextRenewal() {
    return nextRenewal;
  }

  public void setNextRenewal(String nextRenewal) {
    this.nextRenewal = nextRenewal;
  }

  public PlanData planId(Integer planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @Schema(required = true, description = "")
  public Integer getPlanId() {
    return planId;
  }

  public void setPlanId(Integer planId) {
    this.planId = planId;
  }

  public PlanData size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(required = true, description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public PlanData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PlanData warnRenew(Boolean warnRenew) {
    this.warnRenew = warnRenew;
    return this;
  }

   /**
   * Get warnRenew
   * @return warnRenew
  **/
  @Schema(description = "")
  public Boolean isWarnRenew() {
    return warnRenew;
  }

  public void setWarnRenew(Boolean warnRenew) {
    this.warnRenew = warnRenew;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanData planData = (PlanData) o;
    return Objects.equals(this.duration, planData.duration) &&
        Objects.equals(this.nextRenewal, planData.nextRenewal) &&
        Objects.equals(this.planId, planData.planId) &&
        Objects.equals(this.size, planData.size) &&
        Objects.equals(this.status, planData.status) &&
        Objects.equals(this.warnRenew, planData.warnRenew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, nextRenewal, planId, size, status, warnRenew);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanData {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    nextRenewal: ").append(toIndentedString(nextRenewal)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnRenew: ").append(toIndentedString(warnRenew)).append("\n");
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
    out.writeValue(duration);
    out.writeValue(nextRenewal);
    out.writeValue(planId);
    out.writeValue(size);
    out.writeValue(status);
    out.writeValue(warnRenew);
  }

  PlanData(Parcel in) {
    duration = (String)in.readValue(null);
    nextRenewal = (String)in.readValue(null);
    planId = (Integer)in.readValue(null);
    size = (String)in.readValue(null);
    status = (String)in.readValue(null);
    warnRenew = (Boolean)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlanData> CREATOR = new Parcelable.Creator<PlanData>() {
    public PlanData createFromParcel(Parcel in) {
      return new PlanData(in);
    }
    public PlanData[] newArray(int size) {
      return new PlanData[size];
    }
  };
}
