package AMS.TestCases;

import AMS.BaseAMS;
import AMS.Pages.CourierRequestPage;
import AMS.Pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.annotations.Test;

import java.awt.*;

public class CourierRequestTestCases extends BaseAMS {

    public CourierRequestTestCases() {
        super();
    }

    @Test
    public void courierRequestShouldnSuccess() throws InterruptedException, AWTException {
        CourierRequestPage courierRequestPage = new LoginPage()
                .getEmail("tosirul.alam@sqgc.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierRequest()
//        Assert.assertTrue(courierRequestPage.isCourierRequest());
//        CourierRequestPage courierRequestPage1 = new CourierRequestPage()
                .getChooseSBU()
                .getChooseSBUvalue()
                .getServiceType()
                .getServiceTypeValue()
                .getItemType()
                .getItemTypeValue()
                .getItemDescription(LoremIpsum.getInstance().getWords(10))
                .getCustomerBrand()
                .getCustomerBrandValue()
                .getDestinationCountry()
                .getDestinationCountryValue()
                .getChooseSeason()
                .getChooseSeasonValue()
                .getWeight("12")
                .getOcNumber(LoremIpsum.getInstance().getWords(2))
                .getNoOfCarton("12")
                .getsenderName(LoremIpsum.getInstance().getNameMale())
                .getsenderDesignation(LoremIpsum.getInstance().getWords(2))
                .getsenderNo(LoremIpsum.getInstance().getPhone())
                .getProposedDeliveryDate()
                .getProposedDeliveryDateValue()
                .getRemarks(LoremIpsum.getInstance().getWords(5))
                .getuploadInvoiceFile()
                .getuploadAWBFile()
                .getPreview()
                .getSubmitButton();



    }

    @Test
    public void courierRequestShouldnSuccess2() throws InterruptedException, AWTException {
        CourierRequestPage dashboardPage = new LoginPage()
                .getEmail("tosirul.alam@sqgc.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()

//        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierRequest()
//        Assert.assertTrue(courierRequestPage.isCourierRequest());
//        CourierRequestPage courierRequestPage1 = new CourierRequestPage()
                .getChooseSBU()
                .getChooseSBUvalue1()
                .getServiceType()
                .getServiceTypeValue()
                .getItemType()
                .getItemTypeValue()
                .getItemDescription(LoremIpsum.getInstance().getWords(10))
                .getCustomerBrand()
                .getCustomerBrandValue()
                .getDestinationCountry()
                .getDestinationCountryValue()
                .getChooseCity()
                .getChooseCityValue()
                .getChooseSeason()
                .getChooseSeasonValue()
                .getWeight("12")
                .getOcNumber(LoremIpsum.getInstance().getWords(2))
                .getNoOfCarton("12")
                .getsenderName(LoremIpsum.getInstance().getNameMale())
                .getsenderDesignation(LoremIpsum.getInstance().getWords(2))
                .getProposedDeliveryDate()
                .getProposedDeliveryDateValue()
                .getReceiverAddress(LoremIpsum.getInstance().getWords(5))
                .getRemarks(LoremIpsum.getInstance().getWords(5))
                .getuploadInvoiceFile()
                .getuploadAWBFile()
                .getPreview()
                .getSubmitButton();



    }

}
