package in.co.booksnmore.apiClient;

import in.co.booksnmore.api.ApiClient;
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
import in.co.booksnmore.api.model.ForgotPasswordInput;
import in.co.booksnmore.api.model.GetAuthKeyRespone;
import in.co.booksnmore.api.model.ISBNInput;
import in.co.booksnmore.api.model.InlineResponse200;
import in.co.booksnmore.api.model.ManifestData;
import in.co.booksnmore.api.model.MemberActionInput;
import in.co.booksnmore.api.model.MemberData;
import in.co.booksnmore.api.model.MemberDetailsInput;
import in.co.booksnmore.api.model.PasswordUpdateInput;
import in.co.booksnmore.api.model.PlanActionInput;
import in.co.booksnmore.api.model.PlanInfo;
import in.co.booksnmore.api.model.ReportInput;
import in.co.booksnmore.api.model.ResetPasswordInput;
import in.co.booksnmore.api.model.SearchBody;
import in.co.booksnmore.api.model.SearchData;
import in.co.booksnmore.api.model.SubstituteBookData;
import in.co.booksnmore.api.model.TransactionReport;
import in.co.booksnmore.api.model.UserLoginBody;
import in.co.booksnmore.api.model.VerifyKeyBody;
import in.co.booksnmore.api.model.VerifyKeyReturn;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }


    /**
     * Your GET endpoint
     *
     * get an auth key (Admin version)
     */
    @Test
    public void getAdminGetAuthKeyTest() {
        // GetAuthKeyRespone response = api.getAdminGetAuthKey();

        // TODO: test validations
    }

    /**
     * Your GET endpoint
     *
     * Error codes to string mappper
     */
    @Test
    public void getErrorToStringsTest() {
        // ErrorData response = api.getErrorToStrings();

        // TODO: test validations
    }

    /**
     * Your GET endpoint
     *
     * get an auth key
     */
    @Test
    public void getGetAuthKeyTest() {
        // GetAuthKeyRespone response = api.getGetAuthKey();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getGetPlanTypesTest() {
        // PlanInfo response = api.getGetPlanTypes();

        // TODO: test validations
    }

    /**
     * 
     *
     * Add Delivery
     */
    @Test
    public void postAddDeliveryTest() {
        VerifyKeyBody body = null;
        // Void response = api.postAddDelivery(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Add delivery
     */
    @Test
    public void postAdminAddDeliveryTest() {
        AdminMemberInput body = null;
        // MemberData response = api.postAdminAddDelivery(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * All books delivered
     */
    @Test
    public void postAdminAllDeliveredTest() {
        VerifyKeyBody body = null;
        // BaseError response = api.postAdminAllDelivered(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * get a book by id
     */
    @Test
    public void postAdminBookByIdTest() {
        MemberActionInput body = null;
        // AdminBookByIdData response = api.postAdminBookById(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Book Prefill
     */
    @Test
    public void postAdminBookPrefillTest() {
        ISBNInput body = null;
        // AdminBookByIdData response = api.postAdminBookPrefill(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Borrow
     */
    @Test
    public void postAdminBorrowTest() {
        AdminActionInput body = null;
        // MemberData response = api.postAdminBorrow(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Cancel Ready To Return Book
     */
    @Test
    public void postAdminCancelReadyToReturnBookTest() {
        AdminActionInput body = null;
        // MemberData response = api.postAdminCancelReadyToReturnBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Cancel Reservation
     */
    @Test
    public void postAdminCancelReserveBookTest() {
        AdminActionInput body = null;
        // MemberData response = api.postAdminCancelReserveBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Cash In
     */
    @Test
    public void postAdminCashTest() {
        CashInput body = null;
        // MemberData response = api.postAdminCash(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Correct Image
     */
    @Test
    public void postAdminCorrectImageTest() {
        MemberActionInput body = null;
        // AdminBookByIdData response = api.postAdminCorrectImage(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Create Book
     */
    @Test
    public void postAdminCreateBookTest() {
        AdminEditBookByIdBody body = null;
        // AdminBookByIdData response = api.postAdminCreateBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Create Member
     */
    @Test
    public void postAdminCreateMemberTest() {
        MemberDetailsInput body = null;
        // MemberData response = api.postAdminCreateMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Create Plan
     */
    @Test
    public void postAdminCreatePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postAdminCreatePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin delete plan
     */
    @Test
    public void postAdminDeletePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postAdminDeletePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Delivered a book
     */
    @Test
    public void postAdminDeliveredTest() {
        AdminActionInput body = null;
        // BaseError response = api.postAdminDelivered(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Delivery failed for a book
     */
    @Test
    public void postAdminDeliveryFailedTest() {
        AdminActionInput body = null;
        // BaseError response = api.postAdminDeliveryFailed(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * edit a book
     */
    @Test
    public void postAdminEditBookByIdTest() {
        AdminEditBookByIdBody body = null;
        // AdminBookByIdData response = api.postAdminEditBookById(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Edit Member
     */
    @Test
    public void postAdminEditMemberTest() {
        MemberDetailsInput body = null;
        // MemberData response = api.postAdminEditMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Book found 
     */
    @Test
    public void postAdminFoundTest() {
        AdminActionInput body = null;
        // BaseError response = api.postAdminFound(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Get Books
     */
    @Test
    public void postAdminGetBooksTest() {
        BookListBody body = null;
        // AdminBookListData response = api.postAdminGetBooks(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Get Delivery Cost
     */
    @Test
    public void postAdminGetDeliveryCostTest() {
        AddressInput body = null;
        // DeliveryCostData response = api.postAdminGetDeliveryCost(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Get Member
     */
    @Test
    public void postAdminGetMemberTest() {
        AdminMemberInput body = null;
        // MemberData response = api.postAdminGetMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Get Member Dues
     */
    @Test
    public void postAdminGetMemberDuesTest() {
        AdminMemberInput body = null;
        // BalanceDueData response = api.postAdminGetMemberDues(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * login as an admin
     */
    @Test
    public void postAdminLoginTest() {
        AdminLoginBody body = null;
        // BaseError response = api.postAdminLogin(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin logout
     */
    @Test
    public void postAdminLogoutTest() {
        VerifyKeyBody body = null;
        // BaseError response = api.postAdminLogout(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Generate Manifest
     */
    @Test
    public void postAdminManifestTest() {
        VerifyKeyBody body = null;
        // ManifestData response = api.postAdminManifest(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Modify Plan
     */
    @Test
    public void postAdminModifyPlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postAdminModifyPlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Next Book to Verify
     */
    @Test
    public void postAdminNextBookTest() {
        MemberActionInput body = null;
        // AdminBookByIdData response = api.postAdminNextBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Pickup Failed for a book
     */
    @Test
    public void postAdminPickupFailedTest() {
        AdminActionInput body = null;
        // BaseError response = api.postAdminPickupFailed(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Prev Book
     */
    @Test
    public void postAdminPrevBookTest() {
        MemberActionInput body = null;
        // AdminBookByIdData response = api.postAdminPrevBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Ready to dispatch books
     */
    @Test
    public void postAdminReadyToDispatchBooksTest() {
        VerifyKeyBody body = null;
        // AdminBookListData response = api.postAdminReadyToDispatchBooks(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * List of ready to return books
     */
    @Test
    public void postAdminReadyToReturnTest() {
        VerifyKeyBody body = null;
        // AdminBookListData response = api.postAdminReadyToReturn(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Reserved Books
     */
    @Test
    public void postAdminReservedBooksTest() {
        VerifyKeyBody body = null;
        // AdminBookListData response = api.postAdminReservedBooks(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Return
     */
    @Test
    public void postAdminReturnTest() {
        AdminActionInput body = null;
        // MemberData response = api.postAdminReturn(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Book returned by Member
     */
    @Test
    public void postAdminReturnedTest() {
        AdminActionInput body = null;
        // BaseError response = api.postAdminReturned(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Revive Plan
     */
    @Test
    public void postAdminRevivePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postAdminRevivePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Search
     */
    @Test
    public void postAdminSearchTest() {
        SearchBody body = null;
        // SearchData response = api.postAdminSearch(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Substitute Books
     */
    @Test
    public void postAdminSubstituteTest() {
        SubstituteBookData body = null;
        // BaseError response = api.postAdminSubstitute(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Suspend Plan
     */
    @Test
    public void postAdminSuspendPlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postAdminSuspendPlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Transaction Report
     */
    @Test
    public void postAdminTransactionReportTest() {
        ReportInput body = null;
        // TransactionReport response = api.postAdminTransactionReport(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Admin Update Password
     */
    @Test
    public void postAdminUpdatePasswordTest() {
        PasswordUpdateInput body = null;
        // BaseError response = api.postAdminUpdatePassword(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * verify an admin auth key
     */
    @Test
    public void postAdminVerifyKeyTest() {
        VerifyKeyBody body = null;
        // VerifyKeyReturn response = api.postAdminVerifyKey(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Wrong Image
     */
    @Test
    public void postAdminWrongImageTest() {
        MemberActionInput body = null;
        // AdminBookByIdData response = api.postAdminWrongImage(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Browse Library
     */
    @Test
    public void postBrowseLibraryTest() {
        VerifyKeyBody body = null;
        // CategoriesData response = api.postBrowseLibrary(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * cacnels a request for ready to return book
     */
    @Test
    public void postCancelReadyToReturnBookTest() {
        MemberActionInput body = null;
        // MemberData response = api.postCancelReadyToReturnBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * cancels a reservation
     */
    @Test
    public void postCancelReserveBookTest() {
        MemberActionInput body = null;
        // MemberData response = api.postCancelReserveBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * create a new member
     */
    @Test
    public void postCreateMemberTest() {
        MemberDetailsInput body = null;
        // MemberData response = api.postCreateMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * creates a plan
     */
    @Test
    public void postCreatePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postCreatePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Delete Plan
     */
    @Test
    public void postDeletePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postDeletePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Edit Member
     */
    @Test
    public void postEditMemberTest() {
        MemberDetailsInput body = null;
        // MemberData response = api.postEditMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Forgot password
     */
    @Test
    public void postForgotPasswordTest() {
        ForgotPasswordInput body = null;
        // BaseError response = api.postForgotPassword(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Get Delivery Cost
     */
    @Test
    public void postGetDeliveryCostTest() {
        AddressInput body = null;
        // DeliveryCostData response = api.postGetDeliveryCost(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * get hot books
     */
    @Test
    public void postGetHotBooksTest() {
        VerifyKeyBody body = null;
        // InlineResponse200 response = api.postGetHotBooks(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * get data for home screen
     */
    @Test
    public void postGetMemberTest() {
        VerifyKeyBody body = null;
        // MemberData response = api.postGetMember(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Get Member Dues
     */
    @Test
    public void postGetMemberDuesTest() {
        VerifyKeyBody body = null;
        // BalanceDueData response = api.postGetMemberDues(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Login
     */
    @Test
    public void postLoginTest() {
        UserLoginBody body = null;
        // BaseError response = api.postLogin(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Logout
     */
    @Test
    public void postLogoutTest() {
        VerifyKeyBody body = null;
        // BaseError response = api.postLogout(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Modify Plan
     */
    @Test
    public void postModifyPlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postModifyPlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * marks a book as ready to return
     */
    @Test
    public void postReadyToReturnBookTest() {
        MemberActionInput body = null;
        // MemberData response = api.postReadyToReturnBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * reserves a book
     */
    @Test
    public void postReserveBookTest() {
        MemberActionInput body = null;
        // MemberData response = api.postReserveBook(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Reset Password
     */
    @Test
    public void postResetPasswordTest() {
        ResetPasswordInput body = null;
        // BaseError response = api.postResetPassword(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Revive Plan
     */
    @Test
    public void postRevivePlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postRevivePlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * search
     */
    @Test
    public void postSearchTest() {
        SearchBody body = null;
        // SearchData response = api.postSearch(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Suspend Plan
     */
    @Test
    public void postSuspendPlanTest() {
        PlanActionInput body = null;
        // MemberData response = api.postSuspendPlan(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Update Password
     */
    @Test
    public void postUpdatePasswordTest() {
        PasswordUpdateInput body = null;
        // BaseError response = api.postUpdatePassword(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * verify an auth key
     */
    @Test
    public void postVerifyKeyTest() {
        VerifyKeyBody body = null;
        // VerifyKeyReturn response = api.postVerifyKey(body);

        // TODO: test validations
    }
}
