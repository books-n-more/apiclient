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
 * PlanActionInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-03T18:39:46.830Z[GMT]")
public class PlanActionInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("planId")
  private String planId = null;

  @SerializedName("memberId")
  private String memberId = null;

  @SerializedName("planDuration")
  private String planDuration = null;

  @SerializedName("planSize")
  private String planSize = null;

  public PlanActionInput() {
  }
  public PlanActionInput authKey(String authKey) {
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

  public PlanActionInput planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @Schema(description = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public PlanActionInput memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @Schema(description = "")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public PlanActionInput planDuration(String planDuration) {
    this.planDuration = planDuration;
    return this;
  }

   /**
   * Get planDuration
   * @return planDuration
  **/
  @Schema(description = "")
  public String getPlanDuration() {
    return planDuration;
  }

  public void setPlanDuration(String planDuration) {
    this.planDuration = planDuration;
  }

  public PlanActionInput planSize(String planSize) {
    this.planSize = planSize;
    return this;
  }

   /**
   * Get planSize
   * @return planSize
  **/
  @Schema(description = "")
  public String getPlanSize() {
    return planSize;
  }

  public void setPlanSize(String planSize) {
    this.planSize = planSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanActionInput planActionInput = (PlanActionInput) o;
    return Objects.equals(this.authKey, planActionInput.authKey) &&
        Objects.equals(this.planId, planActionInput.planId) &&
        Objects.equals(this.memberId, planActionInput.memberId) &&
        Objects.equals(this.planDuration, planActionInput.planDuration) &&
        Objects.equals(this.planSize, planActionInput.planSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, planId, memberId, planDuration, planSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanActionInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    planDuration: ").append(toIndentedString(planDuration)).append("\n");
    sb.append("    planSize: ").append(toIndentedString(planSize)).append("\n");
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
    out.writeValue(planId);
    out.writeValue(memberId);
    out.writeValue(planDuration);
    out.writeValue(planSize);
  }

  PlanActionInput(Parcel in) {
    authKey = (String)in.readValue(null);
    planId = (String)in.readValue(null);
    memberId = (String)in.readValue(null);
    planDuration = (String)in.readValue(null);
    planSize = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlanActionInput> CREATOR = new Parcelable.Creator<PlanActionInput>() {
    public PlanActionInput createFromParcel(Parcel in) {
      return new PlanActionInput(in);
    }
    public PlanActionInput[] newArray(int size) {
      return new PlanActionInput[size];
    }
  };
}
