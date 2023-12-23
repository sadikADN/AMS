package AMS.TestCases;

import AMS.BaseAMS;
import AMS.Pages.CourierApprovalListPage;
import AMS.Pages.CourierDispatchedPage;
import AMS.Pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.annotations.Test;

public class CourierDispatchedTestCases extends BaseAMS {

    public CourierDispatchedTestCases(){
            super();
        }

    @Test(priority = 1)
    public void courierOutboundDispatchedListPageShouldBeDisplayed() throws InterruptedException {

        CourierDispatchedPage courierDispatchedPage = new LoginPage()
                .getEmail("commercial@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierDispatchedList()
                .getOutboundApprove(LoremIpsum.getInstance().getPhone());


    }

    @Test(priority = 2)
    public void courierInboundDispatchedListPageShouldBeDisplayed() throws InterruptedException {

        CourierDispatchedPage courierDispatchedPage = new LoginPage()
                .getEmail("commercial@courier.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierDispatchedList()
                .getInboundApprove(LoremIpsum.getInstance().getPhone());

    }

}
