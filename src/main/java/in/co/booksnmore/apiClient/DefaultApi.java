package in.co.booksnmore.apiClient;

import in.co.booksnmore.api.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import in.co.booksnmore.api.model.AdminActionInput;
import in.co.booksnmore.api.model.AdminBookByIdData;
import in.co.booksnmore.api.model.AdminBookListData;
import in.co.booksnmore.api.model.AdminEditBookByIdBody;
import in.co.booksnmore.api.model.AdminLoginBody;
import in.co.booksnmore.api.model.BaseError;
import in.co.booksnmore.api.model.BookListBody;
import in.co.booksnmore.api.model.CreateMemberInput;
import in.co.booksnmore.api.model.ErrorData;
import in.co.booksnmore.api.model.GetAuthKeyRespone;
import in.co.booksnmore.api.model.InlineResponse200;
import in.co.booksnmore.api.model.ManifestData;
import in.co.booksnmore.api.model.MemberAction;
import in.co.booksnmore.api.model.MemberActionInput;
import in.co.booksnmore.api.model.PlanActionInput;
import in.co.booksnmore.api.model.PlanInfo;
import in.co.booksnmore.api.model.SearchBody;
import in.co.booksnmore.api.model.SearchData;
import in.co.booksnmore.api.model.SubstituteBookData;
import in.co.booksnmore.api.model.User;
import in.co.booksnmore.api.model.UserLoginBody;
import in.co.booksnmore.api.model.VerifyKeyBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * Your GET endpoint
   * get an auth key (Admin version)
   * @return Call&lt;GetAuthKeyRespone&gt;
   */
  @GET("admin/getAuthKey")
  Call<GetAuthKeyRespone> getAdminGetAuthKey();
    

  /**
   * Your GET endpoint
   * Error codes to string mappper
   * @return Call&lt;ErrorData&gt;
   */
  @GET("errorToStrings")
  Call<ErrorData> getErrorToStrings();
    

  /**
   * Your GET endpoint
   * get an auth key
   * @return Call&lt;GetAuthKeyRespone&gt;
   */
  @GET("getAuthKey")
  Call<GetAuthKeyRespone> getGetAuthKey();
    

  /**
   * 
   * 
   * @return Call&lt;PlanInfo&gt;
   */
  @GET("getPlanTypes")
  Call<PlanInfo> getGetPlanTypes();
    

  /**
   * 
   * All books delivered
   * @param verifyKeyBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/allDelivered")
  Call<BaseError> postAdminAllDelivered(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * get a book by id
   * @param memberActionInput  (optional)
   * @return Call&lt;AdminBookByIdData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/bookById")
  Call<AdminBookByIdData> postAdminBookById(
    @retrofit2.http.Body MemberActionInput memberActionInput
  );

  /**
   * 
   * Admin Create Plan
   * @param planActionInput  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createPlan")
  Call<Void> postAdminCreatePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * Admin delete plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/deletePlan")
  Call<BaseError> postAdminDeletePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * Delivered a book
   * @param adminActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/delivered")
  Call<BaseError> postAdminDelivered(
    @retrofit2.http.Body AdminActionInput adminActionInput
  );

  /**
   * 
   * Delivery failed for a book
   * @param adminActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/deliveryFailed")
  Call<BaseError> postAdminDeliveryFailed(
    @retrofit2.http.Body AdminActionInput adminActionInput
  );

  /**
   * 
   * edit a book
   * @param adminEditBookByIdBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/editBookById")
  Call<BaseError> postAdminEditBookById(
    @retrofit2.http.Body AdminEditBookByIdBody adminEditBookByIdBody
  );

  /**
   * 
   * Book found 
   * @param adminActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/found")
  Call<BaseError> postAdminFound(
    @retrofit2.http.Body AdminActionInput adminActionInput
  );

  /**
   * 
   * Get Books
   * @param bookListBody  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/getBooks")
  Call<AdminBookListData> postAdminGetBooks(
    @retrofit2.http.Body BookListBody bookListBody
  );

  /**
   * 
   * login as an admin
   * @param adminLoginBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/login")
  Call<BaseError> postAdminLogin(
    @retrofit2.http.Body AdminLoginBody adminLoginBody
  );

  /**
   * 
   * Generate Manifest
   * @param verifyKeyBody  (optional)
   * @return Call&lt;ManifestData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/manifest")
  Call<ManifestData> postAdminManifest(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * Admin Modify Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/modifyPlan")
  Call<BaseError> postAdminModifyPlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * Pickup Failed for a book
   * @param adminActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/pickupFailed")
  Call<BaseError> postAdminPickupFailed(
    @retrofit2.http.Body AdminActionInput adminActionInput
  );

  /**
   * 
   * Admin Ready to dispatch books
   * @param verifyKeyBody  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/readyToDispatchBooks")
  Call<AdminBookListData> postAdminReadyToDispatchBooks(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * List of ready to return books
   * @param verifyKeyBody  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/readyToReturnBooks")
  Call<AdminBookListData> postAdminReadyToReturn(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * Admin Reserved Books
   * @param verifyKeyBody  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/reservedBooks")
  Call<AdminBookListData> postAdminReservedBooks(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * Book returned by Member
   * @param adminActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/returned")
  Call<BaseError> postAdminReturned(
    @retrofit2.http.Body AdminActionInput adminActionInput
  );

  /**
   * 
   * Admin Revive Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/revivePlan")
  Call<BaseError> postAdminRevivePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * Substitute Books
   * @param substituteBookData  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/substitute")
  Call<BaseError> postAdminSubstitute(
    @retrofit2.http.Body SubstituteBookData substituteBookData
  );

  /**
   * 
   * Admin Suspend Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/suspendPlan")
  Call<BaseError> postAdminSuspendPlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * verify an admin auth key
   * @param verifyKeyBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/verifyKey")
  Call<BaseError> postAdminVerifyKey(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * cacnels a request for ready to return book
   * @param memberActionInput  (optional)
   * @return Call&lt;MemberAction&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cancelReadyToReturnBook")
  Call<MemberAction> postCancelReadyToReturnBook(
    @retrofit2.http.Body MemberActionInput memberActionInput
  );

  /**
   * 
   * cancels a reservation
   * @param memberActionInput  (optional)
   * @return Call&lt;MemberAction&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cancelReserveBook")
  Call<MemberAction> postCancelReserveBook(
    @retrofit2.http.Body MemberActionInput memberActionInput
  );

  /**
   * 
   * create a new member
   * @param createMemberInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("createMember")
  Call<BaseError> postCreateMember(
    @retrofit2.http.Body CreateMemberInput createMemberInput
  );

  /**
   * 
   * creates a plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("createPlan")
  Call<BaseError> postCreatePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * Delete Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deletePlan")
  Call<BaseError> postDeletePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * get hot books
   * @param verifyKeyBody  (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getHotBooks")
  Call<InlineResponse200> postGetHotBooks(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * get data for home screen
   * @param verifyKeyBody  (optional)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getMember")
  Call<User> postGetMember(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

  /**
   * 
   * Login
   * @param userLoginBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("login")
  Call<BaseError> postLogin(
    @retrofit2.http.Body UserLoginBody userLoginBody
  );

  /**
   * 
   * Modify Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("modifyPlan")
  Call<BaseError> postModifyPlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * marks a book as ready to return
   * @param memberActionInput  (optional)
   * @return Call&lt;MemberAction&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("readyToReturnBook")
  Call<MemberAction> postReadyToReturnBook(
    @retrofit2.http.Body MemberActionInput memberActionInput
  );

  /**
   * 
   * reserves a book
   * @param memberActionInput  (optional)
   * @return Call&lt;MemberAction&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("reserveBook")
  Call<MemberAction> postReserveBook(
    @retrofit2.http.Body MemberActionInput memberActionInput
  );

  /**
   * 
   * Revive Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("revivePlan")
  Call<BaseError> postRevivePlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * search
   * @param searchBody  (optional)
   * @return Call&lt;SearchData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search")
  Call<SearchData> postSearch(
    @retrofit2.http.Body SearchBody searchBody
  );

  /**
   * 
   * Suspend Plan
   * @param planActionInput  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("suspendPlan")
  Call<BaseError> postSuspendPlan(
    @retrofit2.http.Body PlanActionInput planActionInput
  );

  /**
   * 
   * verify an auth key
   * @param verifyKeyBody  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("verifyKey")
  Call<BaseError> postVerifyKey(
    @retrofit2.http.Body VerifyKeyBody verifyKeyBody
  );

}
