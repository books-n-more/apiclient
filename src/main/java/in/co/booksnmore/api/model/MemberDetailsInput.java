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
import in.co.booksnmore.api.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * Member Details input 
 */
@Schema(description = "Member Details input ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-24T17:00:08.994Z[GMT]")
public class MemberDetailsInput implements Parcelable {
  @SerializedName("authKey")
  private String authKey = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("confirmPassword")
  private String confirmPassword = null;

  @SerializedName("planDuration")
  private String planDuration = null;

  @SerializedName("planSize")
  private String planSize = null;

  public MemberDetailsInput() {
  }
  public MemberDetailsInput authKey(String authKey) {
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

  public MemberDetailsInput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MemberDetailsInput name(String name) {
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

  public MemberDetailsInput phone(String phone) {
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

  public MemberDetailsInput email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MemberDetailsInput address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public MemberDetailsInput password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public MemberDetailsInput confirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }

   /**
   * Get confirmPassword
   * @return confirmPassword
  **/
  @Schema(description = "")
  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public MemberDetailsInput planDuration(String planDuration) {
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

  public MemberDetailsInput planSize(String planSize) {
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
    MemberDetailsInput memberDetailsInput = (MemberDetailsInput) o;
    return Objects.equals(this.authKey, memberDetailsInput.authKey) &&
        Objects.equals(this.id, memberDetailsInput.id) &&
        Objects.equals(this.name, memberDetailsInput.name) &&
        Objects.equals(this.phone, memberDetailsInput.phone) &&
        Objects.equals(this.email, memberDetailsInput.email) &&
        Objects.equals(this.address, memberDetailsInput.address) &&
        Objects.equals(this.password, memberDetailsInput.password) &&
        Objects.equals(this.confirmPassword, memberDetailsInput.confirmPassword) &&
        Objects.equals(this.planDuration, memberDetailsInput.planDuration) &&
        Objects.equals(this.planSize, memberDetailsInput.planSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, id, name, phone, email, address, password, confirmPassword, planDuration, planSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDetailsInput {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
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
    out.writeValue(id);
    out.writeValue(name);
    out.writeValue(phone);
    out.writeValue(email);
    out.writeValue(address);
    out.writeValue(password);
    out.writeValue(confirmPassword);
    out.writeValue(planDuration);
    out.writeValue(planSize);
  }

  MemberDetailsInput(Parcel in) {
    authKey = (String)in.readValue(null);
    id = (String)in.readValue(null);
    name = (String)in.readValue(null);
    phone = (String)in.readValue(null);
    email = (String)in.readValue(null);
    address = (Address)in.readValue(Address.class.getClassLoader());
    password = (String)in.readValue(null);
    confirmPassword = (String)in.readValue(null);
    planDuration = (String)in.readValue(null);
    planSize = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<MemberDetailsInput> CREATOR = new Parcelable.Creator<MemberDetailsInput>() {
    public MemberDetailsInput createFromParcel(Parcel in) {
      return new MemberDetailsInput(in);
    }
    public MemberDetailsInput[] newArray(int size) {
      return new MemberDetailsInput[size];
    }
  };
}
