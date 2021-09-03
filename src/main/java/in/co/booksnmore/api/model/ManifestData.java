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
import in.co.booksnmore.api.model.ManifestDataManifest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * ManifestData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-03T18:39:46.830Z[GMT]")
public class ManifestData implements Parcelable {
  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("manifest")
  private List<ManifestDataManifest> manifest = new ArrayList<ManifestDataManifest>();

  public ManifestData() {
  }
  public ManifestData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ManifestData manifest(List<ManifestDataManifest> manifest) {
    this.manifest = manifest;
    return this;
  }

  public ManifestData addManifestItem(ManifestDataManifest manifestItem) {
    this.manifest.add(manifestItem);
    return this;
  }

   /**
   * Get manifest
   * @return manifest
  **/
  @Schema(required = true, description = "")
  public List<ManifestDataManifest> getManifest() {
    return manifest;
  }

  public void setManifest(List<ManifestDataManifest> manifest) {
    this.manifest = manifest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestData manifestData = (ManifestData) o;
    return Objects.equals(this.errorCode, manifestData.errorCode) &&
        Objects.equals(this.manifest, manifestData.manifest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, manifest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
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
    out.writeValue(manifest);
  }

  ManifestData(Parcel in) {
    errorCode = (Integer)in.readValue(null);
    manifest = (List<ManifestDataManifest>)in.readValue(ManifestDataManifest.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ManifestData> CREATOR = new Parcelable.Creator<ManifestData>() {
    public ManifestData createFromParcel(Parcel in) {
      return new ManifestData(in);
    }
    public ManifestData[] newArray(int size) {
      return new ManifestData[size];
    }
  };
}
