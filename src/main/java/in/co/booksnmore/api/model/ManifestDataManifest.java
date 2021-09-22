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
import in.co.booksnmore.api.model.ManifestDataDispatch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * ManifestDataManifest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-22T05:00:00.161Z[GMT]")
public class ManifestDataManifest implements Parcelable {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("dispatch")
  private List<ManifestDataDispatch> dispatch = null;

  @SerializedName("memberId")
  private Integer memberId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("pickup")
  private List<ManifestDataDispatch> pickup = null;

  public ManifestDataManifest() {
  }
  public ManifestDataManifest address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @Schema(required = true, description = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public ManifestDataManifest address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @Schema(required = true, description = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public ManifestDataManifest dispatch(List<ManifestDataDispatch> dispatch) {
    this.dispatch = dispatch;
    return this;
  }

  public ManifestDataManifest addDispatchItem(ManifestDataDispatch dispatchItem) {
    if (this.dispatch == null) {
      this.dispatch = new ArrayList<ManifestDataDispatch>();
    }
    this.dispatch.add(dispatchItem);
    return this;
  }

   /**
   * Get dispatch
   * @return dispatch
  **/
  @Schema(description = "")
  public List<ManifestDataDispatch> getDispatch() {
    return dispatch;
  }

  public void setDispatch(List<ManifestDataDispatch> dispatch) {
    this.dispatch = dispatch;
  }

  public ManifestDataManifest memberId(Integer memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @Schema(required = true, description = "")
  public Integer getMemberId() {
    return memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  public ManifestDataManifest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ManifestDataManifest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(required = true, description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ManifestDataManifest pickup(List<ManifestDataDispatch> pickup) {
    this.pickup = pickup;
    return this;
  }

  public ManifestDataManifest addPickupItem(ManifestDataDispatch pickupItem) {
    if (this.pickup == null) {
      this.pickup = new ArrayList<ManifestDataDispatch>();
    }
    this.pickup.add(pickupItem);
    return this;
  }

   /**
   * Get pickup
   * @return pickup
  **/
  @Schema(description = "")
  public List<ManifestDataDispatch> getPickup() {
    return pickup;
  }

  public void setPickup(List<ManifestDataDispatch> pickup) {
    this.pickup = pickup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestDataManifest manifestDataManifest = (ManifestDataManifest) o;
    return Objects.equals(this.address1, manifestDataManifest.address1) &&
        Objects.equals(this.address2, manifestDataManifest.address2) &&
        Objects.equals(this.dispatch, manifestDataManifest.dispatch) &&
        Objects.equals(this.memberId, manifestDataManifest.memberId) &&
        Objects.equals(this.name, manifestDataManifest.name) &&
        Objects.equals(this.phone, manifestDataManifest.phone) &&
        Objects.equals(this.pickup, manifestDataManifest.pickup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, dispatch, memberId, name, phone, pickup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestDataManifest {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    dispatch: ").append(toIndentedString(dispatch)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
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
    out.writeValue(address1);
    out.writeValue(address2);
    out.writeValue(dispatch);
    out.writeValue(memberId);
    out.writeValue(name);
    out.writeValue(phone);
    out.writeValue(pickup);
  }

  ManifestDataManifest(Parcel in) {
    address1 = (String)in.readValue(null);
    address2 = (String)in.readValue(null);
    dispatch = (List<ManifestDataDispatch>)in.readValue(ManifestDataDispatch.class.getClassLoader());
    memberId = (Integer)in.readValue(null);
    name = (String)in.readValue(null);
    phone = (String)in.readValue(null);
    pickup = (List<ManifestDataDispatch>)in.readValue(ManifestDataDispatch.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ManifestDataManifest> CREATOR = new Parcelable.Creator<ManifestDataManifest>() {
    public ManifestDataManifest createFromParcel(Parcel in) {
      return new ManifestDataManifest(in);
    }
    public ManifestDataManifest[] newArray(int size) {
      return new ManifestDataManifest[size];
    }
  };
}
