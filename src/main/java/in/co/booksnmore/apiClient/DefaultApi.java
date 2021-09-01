package in.co.booksnmore.apiClient;

import in.co.booksnmore.api.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import in.co.booksnmore.api.model.AddressInput;
import in.co.booksnmore.api.model.AdminActionInput;
import in.co.booksnmore.api.model.AdminBookByIdData;
import in.co.booksnmore.api.model.AdminBookListData;
import in.co.booksnmore.api.model.AdminEditBookByIdBody;
import in.co.booksnmore.api.model.AdminLoginBody;
import in.co.booksnmore.api.model.AdminMemberInput;
import in.co.booksnmore.api.model.BalanceDueData;
import in.co.booksnmore.api.model.BaseError;
import in.co.booksnmore.api.model.BookListBody;
import in.co.booksnmore.api.model.CashInput;
import in.co.booksnmore.api.model.CategoriesData;
import in.co.booksnmore.api.model.DeliveryCostData;
import in.co.booksnmore.api.model.ErrorData;
import in.co.booksnmore.api.model.GetAuthKeyRespone;
import in.co.booksnmore.api.model.InlineResponse200;
import in.co.booksnmore.api.model.ManifestData;
import in.co.booksnmore.api.model.MemberActionInput;
import in.co.booksnmore.api.model.MemberData;
import in.co.booksnmore.api.model.MemberDetailsInput;
import in.co.booksnmore.api.model.PasswordUpdateInput;
import in.co.booksnmore.api.model.PlanActionInput;
import in.co.booksnmore.api.model.PlanInfo;
import in.co.booksnmore.api.model.ReportInput;
import in.co.booksnmore.api.model.SearchBody;
import in.co.booksnmore.api.model.SearchData;
import in.co.booksnmore.api.model.SubstituteBookData;
import in.co.booksnmore.api.model.TransactionReport;
import in.co.booksnmore.api.model.UserLoginBody;
import in.co.booksnmore.api.model.VerifyKeyBody;
import in.co.booksnmore.api.model.VerifyKeyReturn;

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
   * Add Delivery
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("addDelivery")
  Call<Void> postAddDelivery(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Admin Add delivery
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/addDelivery")
  Call<MemberData> postAdminAddDelivery(
                    @retrofit2.http.Body AdminMemberInput body    
  );

  /**
   * 
   * All books delivered
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/allDelivered")
  Call<BaseError> postAdminAllDelivered(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * get a book by id
   * @param body  (optional)
   * @return Call&lt;AdminBookByIdData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/bookById")
  Call<AdminBookByIdData> postAdminBookById(
                    @retrofit2.http.Body MemberActionInput body    
  );

  /**
   * 
   * Admin Borrow
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/borrow")
  Call<MemberData> postAdminBorrow(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Admin Borrow
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/borrow")
  Call<MemberData> postAdminBorrow(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Admin Cash In
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/cash")
  Call<MemberData> postAdminCash(
                    @retrofit2.http.Body CashInput body    
  );

  /**
   * 
   * Create Book
   * @param body  (optional)
   * @return Call&lt;AdminBookByIdData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createBook")
  Call<AdminBookByIdData> postAdminCreateBook(
                    @retrofit2.http.Body AdminEditBookByIdBody body    
  );

  /**
   * 
   * Create Book
   * @param body  (optional)
   * @return Call&lt;AdminBookByIdData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createBook")
  Call<AdminBookByIdData> postAdminCreateBook(
                    @retrofit2.http.Body AdminEditBookByIdBody body    
  );

  /**
   * 
   * Admin Create Member
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createMember")
  Call<MemberData> postAdminCreateMember(
                    @retrofit2.http.Body MemberDetailsInput body    
  );

  /**
   * 
   * Admin Create Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createPlan")
  Call<MemberData> postAdminCreatePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Admin Create Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/createPlan")
  Call<MemberData> postAdminCreatePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Admin delete plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/deletePlan")
  Call<MemberData> postAdminDeletePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Delivered a book
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/delivered")
  Call<BaseError> postAdminDelivered(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Delivery failed for a book
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/deliveryFailed")
  Call<BaseError> postAdminDeliveryFailed(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * edit a book
   * @param body  (optional)
   * @return Call&lt;AdminBookByIdData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/editBookById")
  Call<AdminBookByIdData> postAdminEditBookById(
                    @retrofit2.http.Body AdminEditBookByIdBody body    
  );

  /**
   * 
   * Admin Edit Member
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/editMember")
  Call<MemberData> postAdminEditMember(
                    @retrofit2.http.Body MemberDetailsInput body    
  );

  /**
   * 
   * Book found 
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/found")
  Call<BaseError> postAdminFound(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Get Books
   * @param body  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/getBooks")
  Call<AdminBookListData> postAdminGetBooks(
                    @retrofit2.http.Body BookListBody body    
  );

  /**
   * 
   * Admin Get Delivery Cost
   * @param body  (optional)
   * @return Call&lt;DeliveryCostData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/getDeliveryCost")
  Call<DeliveryCostData> postAdminGetDeliveryCost(
                    @retrofit2.http.Body AddressInput body    
  );

  /**
   * 
   * Admin Get Member
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/getMember")
  Call<MemberData> postAdminGetMember(
                    @retrofit2.http.Body AdminMemberInput body    
  );

  /**
   * 
   * Admin Get Member Dues
   * @param body  (optional)
   * @return Call&lt;BalanceDueData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/getMemberDues")
  Call<BalanceDueData> postAdminGetMemberDues(
                    @retrofit2.http.Body AdminMemberInput body    
  );

  /**
   * 
   * login as an admin
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/login")
  Call<BaseError> postAdminLogin(
                    @retrofit2.http.Body AdminLoginBody body    
  );

  /**
   * 
   * Admin logout
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/logout")
  Call<BaseError> postAdminLogout(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Generate Manifest
   * @param body  (optional)
   * @return Call&lt;ManifestData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/manifest")
  Call<ManifestData> postAdminManifest(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Admin Modify Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/modifyPlan")
  Call<MemberData> postAdminModifyPlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Pickup Failed for a book
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/pickupFailed")
  Call<BaseError> postAdminPickupFailed(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Admin Ready to dispatch books
   * @param body  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/readyToDispatchBooks")
  Call<AdminBookListData> postAdminReadyToDispatchBooks(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * List of ready to return books
   * @param body  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/readyToReturnBooks")
  Call<AdminBookListData> postAdminReadyToReturn(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Admin Reserved Books
   * @param body  (optional)
   * @return Call&lt;AdminBookListData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/reservedBooks")
  Call<AdminBookListData> postAdminReservedBooks(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Admin Return
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/return")
  Call<MemberData> postAdminReturn(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Book returned by Member
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/returned")
  Call<BaseError> postAdminReturned(
                    @retrofit2.http.Body AdminActionInput body    
  );

  /**
   * 
   * Admin Revive Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/revivePlan")
  Call<MemberData> postAdminRevivePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Admin Search
   * @param body  (optional)
   * @return Call&lt;SearchData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/search")
  Call<SearchData> postAdminSearch(
                    @retrofit2.http.Body SearchBody body    
  );

  /**
   * 
   * Substitute Books
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/substitute")
  Call<BaseError> postAdminSubstitute(
                    @retrofit2.http.Body SubstituteBookData body    
  );

  /**
   * 
   * Admin Suspend Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/suspendPlan")
  Call<MemberData> postAdminSuspendPlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Admin Transaction Report
   * @param body  (optional)
   * @return Call&lt;TransactionReport&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/transactionReport")
  Call<TransactionReport> postAdminTransactionReport(
                    @retrofit2.http.Body ReportInput body    
  );

  /**
   * 
   * Admin Update Password
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/updatePassword")
  Call<BaseError> postAdminUpdatePassword(
                    @retrofit2.http.Body PasswordUpdateInput body    
  );

  /**
   * 
   * verify an admin auth key
   * @param body  (optional)
   * @return Call&lt;VerifyKeyReturn&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("admin/verifyKey")
  Call<VerifyKeyReturn> postAdminVerifyKey(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Browse Library
   * @param body  (optional)
   * @return Call&lt;CategoriesData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("browseLibrary")
  Call<CategoriesData> postBrowseLibrary(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * cacnels a request for ready to return book
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cancelReadyToReturnBook")
  Call<MemberData> postCancelReadyToReturnBook(
                    @retrofit2.http.Body MemberActionInput body    
  );

  /**
   * 
   * cancels a reservation
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cancelReserveBook")
  Call<MemberData> postCancelReserveBook(
                    @retrofit2.http.Body MemberActionInput body    
  );

  /**
   * 
   * create a new member
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("createMember")
  Call<MemberData> postCreateMember(
                    @retrofit2.http.Body MemberDetailsInput body    
  );

  /**
   * 
   * creates a plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("createPlan")
  Call<MemberData> postCreatePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Delete Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deletePlan")
  Call<MemberData> postDeletePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Edit Member
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("editMember")
  Call<MemberData> postEditMember(
                    @retrofit2.http.Body MemberDetailsInput body    
  );

  /**
   * 
   * Get Delivery Cost
   * @param body  (optional)
   * @return Call&lt;DeliveryCostData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getDeliveryCost")
  Call<DeliveryCostData> postGetDeliveryCost(
                    @retrofit2.http.Body AddressInput body    
  );

  /**
   * 
   * get hot books
   * @param body  (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getHotBooks")
  Call<InlineResponse200> postGetHotBooks(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * get data for home screen
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getMember")
  Call<MemberData> postGetMember(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Get Member Dues
   * @param body  (optional)
   * @return Call&lt;BalanceDueData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("getMemberDues")
  Call<BalanceDueData> postGetMemberDues(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Login
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("login")
  Call<BaseError> postLogin(
                    @retrofit2.http.Body UserLoginBody body    
  );

  /**
   * 
   * Logout
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("logout")
  Call<BaseError> postLogout(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

  /**
   * 
   * Modify Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("modifyPlan")
  Call<MemberData> postModifyPlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * marks a book as ready to return
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("readyToReturnBook")
  Call<MemberData> postReadyToReturnBook(
                    @retrofit2.http.Body MemberActionInput body    
  );

  /**
   * 
   * reserves a book
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("reserveBook")
  Call<MemberData> postReserveBook(
                    @retrofit2.http.Body MemberActionInput body    
  );

  /**
   * 
   * Revive Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("revivePlan")
  Call<MemberData> postRevivePlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * search
   * @param body  (optional)
   * @return Call&lt;SearchData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search")
  Call<SearchData> postSearch(
                    @retrofit2.http.Body SearchBody body    
  );

  /**
   * 
   * Suspend Plan
   * @param body  (optional)
   * @return Call&lt;MemberData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("suspendPlan")
  Call<MemberData> postSuspendPlan(
                    @retrofit2.http.Body PlanActionInput body    
  );

  /**
   * 
   * Update Password
   * @param body  (optional)
   * @return Call&lt;BaseError&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("updatePassword")
  Call<BaseError> postUpdatePassword(
                    @retrofit2.http.Body PasswordUpdateInput body    
  );

  /**
   * 
   * verify an auth key
   * @param body  (optional)
   * @return Call&lt;VerifyKeyReturn&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("verifyKey")
  Call<VerifyKeyReturn> postVerifyKey(
                    @retrofit2.http.Body VerifyKeyBody body    
  );

}
