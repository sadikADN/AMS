package AMS.TestCases;

import AMS.BaseAMS;
import AMS.Pages.CourierApprovalListPage;
import AMS.Pages.CourierRequestPage;
import AMS.Pages.LoginPage;
import org.testng.annotations.Test;

public class CourierApprovalListTestCases extends BaseAMS {

    public CourierApprovalListTestCases() {
        super();
    }

    @Test(priority = 1)
    public void courierOutboundApprovalListPageShouldBeDisplayed() throws InterruptedException {

        CourierApprovalListPage courierApprovalListPage = new LoginPage()
                .getEmail("approver@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getApprovalList()
                .getOutboundApprove();

    }

    @Test(priority = 2)
    public void courierinboundApprovalListPageShouldBeDisplayed() throws InterruptedException {

        CourierApprovalListPage courierApprovalListPage = new LoginPage()
                .getEmail("approver@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getApprovalList()
                .getInboundApprove();

    }
}
