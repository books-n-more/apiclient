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
 * ReportInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T04:33:57.894Z[GMT]")
public class ReportInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("memberId")
  private String memberId = null;

  @SerializedName("startRecord")
  private Integer startRecord = null;

  @SerializedName("numRecords")
  private Integer numRecords = null;

  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  public ReportInput() {
  }
  public ReportInput authKey(String authKey) {
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

  public ReportInput startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(required = true, description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ReportInput endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(required = true, description = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ReportInput memberId(String memberId) {
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

  public ReportInput startRecord(Integer startRecord) {
    this.startRecord = startRecord;
    return this;
  }

   /**
   * Get startRecord
   * @return startRecord
  **/
  @Schema(description = "")
  public Integer getStartRecord() {
    return startRecord;
  }

  public void setStartRecord(Integer startRecord) {
    this.startRecord = startRecord;
  }

  public ReportInput numRecords(Integer numRecords) {
    this.numRecords = numRecords;
    return this;
  }

   /**
   * Get numRecords
   * @return numRecords
  **/
  @Schema(description = "")
  public Integer getNumRecords() {
    return numRecords;
  }

  public void setNumRecords(Integer numRecords) {
    this.numRecords = numRecords;
  }

  public ReportInput totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Get totalRecords
   * @return totalRecords
  **/
  @Schema(description = "")
  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInput reportInput = (ReportInput) o;
    return Objects.equals(this.authKey, reportInput.authKey) &&
        Objects.equals(this.startDate, reportInput.startDate) &&
        Objects.equals(this.endDate, reportInput.endDate) &&
        Objects.equals(this.memberId, reportInput.memberId) &&
        Objects.equals(this.startRecord, reportInput.startRecord) &&
        Objects.equals(this.numRecords, reportInput.numRecords) &&
        Objects.equals(this.totalRecords, reportInput.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, startDate, endDate, memberId, startRecord, numRecords, totalRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    startRecord: ").append(toIndentedString(startRecord)).append("\n");
    sb.append("    numRecords: ").append(toIndentedString(numRecords)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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
    out.writeValue(startDate);
    out.writeValue(endDate);
    out.writeValue(memberId);
    out.writeValue(startRecord);
    out.writeValue(numRecords);
    out.writeValue(totalRecords);
  }

  ReportInput(Parcel in) {
    authKey = (String)in.readValue(null);
    startDate = (String)in.readValue(null);
    endDate = (String)in.readValue(null);
    memberId = (String)in.readValue(null);
    startRecord = (Integer)in.readValue(null);
    numRecords = (Integer)in.readValue(null);
    totalRecords = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ReportInput> CREATOR = new Parcelable.Creator<ReportInput>() {
    public ReportInput createFromParcel(Parcel in) {
      return new ReportInput(in);
    }
    public ReportInput[] newArray(int size) {
      return new ReportInput[size];
    }
  };
}
