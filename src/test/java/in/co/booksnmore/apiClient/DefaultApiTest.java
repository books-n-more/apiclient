package in.co.booksnmore.apiClient;

import in.co.booksnmore.api.ApiClient;
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
     * All books delivered
     */
    @Test
    public void postAdminAllDeliveredTest() {
        VerifyKeyBody verifyKeyBody = null;
        // BaseError response = api.postAdminAllDelivered(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a book by id
     */
    @Test
    public void postAdminBookByIdTest() {
        MemberActionInput memberActionInput = null;
        // AdminBookByIdData response = api.postAdminBookById(memberActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Create Plan
     */
    @Test
    public void postAdminCreatePlanTest() {
        PlanActionInput planActionInput = null;
        // api.postAdminCreatePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin delete plan
     */
    @Test
    public void postAdminDeletePlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postAdminDeletePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delivered a book
     */
    @Test
    public void postAdminDeliveredTest() {
        AdminActionInput adminActionInput = null;
        // BaseError response = api.postAdminDelivered(adminActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delivery failed for a book
     */
    @Test
    public void postAdminDeliveryFailedTest() {
        AdminActionInput adminActionInput = null;
        // BaseError response = api.postAdminDeliveryFailed(adminActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * edit a book
     */
    @Test
    public void postAdminEditBookByIdTest() {
        AdminEditBookByIdBody adminEditBookByIdBody = null;
        // BaseError response = api.postAdminEditBookById(adminEditBookByIdBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Book found 
     */
    @Test
    public void postAdminFoundTest() {
        AdminActionInput adminActionInput = null;
        // BaseError response = api.postAdminFound(adminActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get Books
     */
    @Test
    public void postAdminGetBooksTest() {
        BookListBody bookListBody = null;
        // AdminBookListData response = api.postAdminGetBooks(bookListBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * login as an admin
     */
    @Test
    public void postAdminLoginTest() {
        AdminLoginBody adminLoginBody = null;
        // BaseError response = api.postAdminLogin(adminLoginBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Generate Manifest
     */
    @Test
    public void postAdminManifestTest() {
        VerifyKeyBody verifyKeyBody = null;
        // ManifestData response = api.postAdminManifest(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Modify Plan
     */
    @Test
    public void postAdminModifyPlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postAdminModifyPlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Pickup Failed for a book
     */
    @Test
    public void postAdminPickupFailedTest() {
        AdminActionInput adminActionInput = null;
        // BaseError response = api.postAdminPickupFailed(adminActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Ready to dispatch books
     */
    @Test
    public void postAdminReadyToDispatchBooksTest() {
        VerifyKeyBody verifyKeyBody = null;
        // AdminBookListData response = api.postAdminReadyToDispatchBooks(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * List of ready to return books
     */
    @Test
    public void postAdminReadyToReturnTest() {
        VerifyKeyBody verifyKeyBody = null;
        // AdminBookListData response = api.postAdminReadyToReturn(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Reserved Books
     */
    @Test
    public void postAdminReservedBooksTest() {
        VerifyKeyBody verifyKeyBody = null;
        // AdminBookListData response = api.postAdminReservedBooks(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Book returned by Member
     */
    @Test
    public void postAdminReturnedTest() {
        AdminActionInput adminActionInput = null;
        // BaseError response = api.postAdminReturned(adminActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Revive Plan
     */
    @Test
    public void postAdminRevivePlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postAdminRevivePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Substitute Books
     */
    @Test
    public void postAdminSubstituteTest() {
        SubstituteBookData substituteBookData = null;
        // BaseError response = api.postAdminSubstitute(substituteBookData);

        // TODO: test validations
    }
    /**
     * 
     *
     * Admin Suspend Plan
     */
    @Test
    public void postAdminSuspendPlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postAdminSuspendPlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * verify an admin auth key
     */
    @Test
    public void postAdminVerifyKeyTest() {
        VerifyKeyBody verifyKeyBody = null;
        // BaseError response = api.postAdminVerifyKey(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * cacnels a request for ready to return book
     */
    @Test
    public void postCancelReadyToReturnBookTest() {
        MemberActionInput memberActionInput = null;
        // MemberAction response = api.postCancelReadyToReturnBook(memberActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * cancels a reservation
     */
    @Test
    public void postCancelReserveBookTest() {
        MemberActionInput memberActionInput = null;
        // MemberAction response = api.postCancelReserveBook(memberActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * create a new member
     */
    @Test
    public void postCreateMemberTest() {
        CreateMemberInput createMemberInput = null;
        // BaseError response = api.postCreateMember(createMemberInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * creates a plan
     */
    @Test
    public void postCreatePlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postCreatePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete Plan
     */
    @Test
    public void postDeletePlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postDeletePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * get hot books
     */
    @Test
    public void postGetHotBooksTest() {
        VerifyKeyBody verifyKeyBody = null;
        // InlineResponse200 response = api.postGetHotBooks(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * get data for home screen
     */
    @Test
    public void postGetMemberTest() {
        VerifyKeyBody verifyKeyBody = null;
        // User response = api.postGetMember(verifyKeyBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Login
     */
    @Test
    public void postLoginTest() {
        UserLoginBody userLoginBody = null;
        // BaseError response = api.postLogin(userLoginBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Modify Plan
     */
    @Test
    public void postModifyPlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postModifyPlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * marks a book as ready to return
     */
    @Test
    public void postReadyToReturnBookTest() {
        MemberActionInput memberActionInput = null;
        // MemberAction response = api.postReadyToReturnBook(memberActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * reserves a book
     */
    @Test
    public void postReserveBookTest() {
        MemberActionInput memberActionInput = null;
        // MemberAction response = api.postReserveBook(memberActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * Revive Plan
     */
    @Test
    public void postRevivePlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postRevivePlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * search
     */
    @Test
    public void postSearchTest() {
        SearchBody searchBody = null;
        // SearchData response = api.postSearch(searchBody);

        // TODO: test validations
    }
    /**
     * 
     *
     * Suspend Plan
     */
    @Test
    public void postSuspendPlanTest() {
        PlanActionInput planActionInput = null;
        // BaseError response = api.postSuspendPlan(planActionInput);

        // TODO: test validations
    }
    /**
     * 
     *
     * verify an auth key
     */
    @Test
    public void postVerifyKeyTest() {
        VerifyKeyBody verifyKeyBody = null;
        // BaseError response = api.postVerifyKey(verifyKeyBody);

        // TODO: test validations
    }
}
