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
 * UserInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T04:05:40.533Z[GMT]")
public class UserInfo implements Parcelable {
  @SerializedName("userType")
  private Integer userType = null;

  @SerializedName("numDeliveries")
  private Integer numDeliveries = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sex")
  private String sex = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("borrowStatus")
  private String borrowStatus = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("balanceDue")
  private Integer balanceDue = null;

  @SerializedName("deposit")
  private Integer deposit = null;

  @SerializedName("numBooks")
  private String numBooks = null;

  public UserInfo() {
  }
  public UserInfo userType(Integer userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @Schema(required = true, description = "")
  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public UserInfo numDeliveries(Integer numDeliveries) {
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

  public UserInfo name(String name) {
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

  public UserInfo sex(String sex) {
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @Schema(description = "")
  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public UserInfo phone(String phone) {
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

  public UserInfo email(String email) {
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

  public UserInfo address(Address address) {
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

  public UserInfo borrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
    return this;
  }

   /**
   * Get borrowStatus
   * @return borrowStatus
  **/
  @Schema(description = "")
  public String getBorrowStatus() {
    return borrowStatus;
  }

  public void setBorrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
  }

  public UserInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserInfo balanceDue(Integer balanceDue) {
    this.balanceDue = balanceDue;
    return this;
  }

   /**
   * Get balanceDue
   * @return balanceDue
  **/
  @Schema(description = "")
  public Integer getBalanceDue() {
    return balanceDue;
  }

  public void setBalanceDue(Integer balanceDue) {
    this.balanceDue = balanceDue;
  }

  public UserInfo deposit(Integer deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @Schema(description = "")
  public Integer getDeposit() {
    return deposit;
  }

  public void setDeposit(Integer deposit) {
    this.deposit = deposit;
  }

  public UserInfo numBooks(String numBooks) {
    this.numBooks = numBooks;
    return this;
  }

   /**
   * Get numBooks
   * @return numBooks
  **/
  @Schema(description = "")
  public String getNumBooks() {
    return numBooks;
  }

  public void setNumBooks(String numBooks) {
    this.numBooks = numBooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.userType, userInfo.userType) &&
        Objects.equals(this.numDeliveries, userInfo.numDeliveries) &&
        Objects.equals(this.name, userInfo.name) &&
        Objects.equals(this.sex, userInfo.sex) &&
        Objects.equals(this.phone, userInfo.phone) &&
        Objects.equals(this.email, userInfo.email) &&
        Objects.equals(this.address, userInfo.address) &&
        Objects.equals(this.borrowStatus, userInfo.borrowStatus) &&
        Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.balanceDue, userInfo.balanceDue) &&
        Objects.equals(this.deposit, userInfo.deposit) &&
        Objects.equals(this.numBooks, userInfo.numBooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, numDeliveries, name, sex, phone, email, address, borrowStatus, id, balanceDue, deposit, numBooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    numDeliveries: ").append(toIndentedString(numDeliveries)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    borrowStatus: ").append(toIndentedString(borrowStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balanceDue: ").append(toIndentedString(balanceDue)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    numBooks: ").append(toIndentedString(numBooks)).append("\n");
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
    out.writeValue(userType);
    out.writeValue(numDeliveries);
    out.writeValue(name);
    out.writeValue(sex);
    out.writeValue(phone);
    out.writeValue(email);
    out.writeValue(address);
    out.writeValue(borrowStatus);
    out.writeValue(id);
    out.writeValue(balanceDue);
    out.writeValue(deposit);
    out.writeValue(numBooks);
  }

  UserInfo(Parcel in) {
    userType = (Integer)in.readValue(null);
    numDeliveries = (Integer)in.readValue(null);
    name = (String)in.readValue(null);
    sex = (String)in.readValue(null);
    phone = (String)in.readValue(null);
    email = (String)in.readValue(null);
    address = (Address)in.readValue(Address.class.getClassLoader());
    borrowStatus = (String)in.readValue(null);
    id = (Integer)in.readValue(null);
    balanceDue = (Integer)in.readValue(null);
    deposit = (Integer)in.readValue(null);
    numBooks = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
    public UserInfo createFromParcel(Parcel in) {
      return new UserInfo(in);
    }
    public UserInfo[] newArray(int size) {
      return new UserInfo[size];
    }
  };
}
