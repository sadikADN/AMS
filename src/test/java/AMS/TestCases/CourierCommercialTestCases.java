package AMS.TestCases;

import AMS.BaseAMS;
import AMS.Pages.CourierApprovalListPage;
import AMS.Pages.CourierCommercialPage;
import AMS.Pages.LoginPage;
import org.testng.annotations.Test;

public class CourierCommercialTestCases extends BaseAMS {

    public CourierCommercialTestCases(){
        super();
    }

    @Test(priority = 1)
    public void courierOutboundApprovalListPageShouldBeDisplayed() throws InterruptedException {
        CourierCommercialPage courierCommercialPage= new LoginPage()
                .getEmail("commercial@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierCommercialList()
                .getOutboundApprove();
    }

    @Test(priority = 2)
    public void courierInboundApprovalListPageShouldBeDisplayed() throws InterruptedException {
        CourierCommercialPage courierCommercialPage= new LoginPage()
                .getEmail("commercial@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierCommercialList()
                .getInboundApprove();
    }
}
