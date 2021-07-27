/*
 * bnm
 * Books N More's API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: samarthr1@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
import in.co.booksnmore.api.model.UserInfoAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * UserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-27T18:09:10.466+05:30[Asia/Kolkata]")
public class UserInfo implements Parcelable {
  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private BigDecimal userType;

  public static final String SERIALIZED_NAME_NUM_DELIVERIES = "numDeliveries";
  @SerializedName(SERIALIZED_NAME_NUM_DELIVERIES)
  private BigDecimal numDeliveries;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEX = "sex";
  @SerializedName(SERIALIZED_NAME_SEX)
  private String sex;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UserInfoAddress address;

  public static final String SERIALIZED_NAME_BORROW_STATUS = "borrowStatus";
  @SerializedName(SERIALIZED_NAME_BORROW_STATUS)
  private String borrowStatus;

  public UserInfo() {
  }

  public UserInfo userType(BigDecimal userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getUserType() {
    return userType;
  }


  public void setUserType(BigDecimal userType) {
    this.userType = userType;
  }


  public UserInfo numDeliveries(BigDecimal numDeliveries) {
    
    this.numDeliveries = numDeliveries;
    return this;
  }

   /**
   * Get numDeliveries
   * @return numDeliveries
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getNumDeliveries() {
    return numDeliveries;
  }


  public void setNumDeliveries(BigDecimal numDeliveries) {
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
  @ApiModelProperty(required = true, value = "")

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
  @ApiModelProperty(required = true, value = "")

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
  @ApiModelProperty(required = true, value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public UserInfo address(UserInfoAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public UserInfoAddress getAddress() {
    return address;
  }


  public void setAddress(UserInfoAddress address) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBorrowStatus() {
    return borrowStatus;
  }


  public void setBorrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.address, userInfo.address) &&
        Objects.equals(this.borrowStatus, userInfo.borrowStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, numDeliveries, name, sex, phone, address, borrowStatus);
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
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    borrowStatus: ").append(toIndentedString(borrowStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
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
    out.writeValue(address);
    out.writeValue(borrowStatus);
  }

  UserInfo(Parcel in) {
    userType = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    numDeliveries = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    name = (String)in.readValue(null);
    sex = (String)in.readValue(null);
    phone = (String)in.readValue(null);
    address = (UserInfoAddress)in.readValue(UserInfoAddress.class.getClassLoader());
    borrowStatus = (String)in.readValue(null);
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
