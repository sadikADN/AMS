package AMS.TestCases;

import AMS.BaseAMS;
import AMS.Pages.AddDormitoryPage;
import AMS.Pages.LoginPage;
import org.testng.annotations.Test;

import java.awt.*;

public class AddDormitoryTestCases extends BaseAMS {

    public AddDormitoryTestCases() {
        super();
    }

    @Test
    public void addDormitoryPageShouldBeDisplayed() throws InterruptedException, AWTException {

        AddDormitoryPage addDormitoryPage = new LoginPage()
                .getEmail("requester@dormitory.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()
                .getAdministration()
                .getDormetory()
                .getAddDormetory()
                .getSelectEmployee()
                .getSelectEmployeeValue()
                .getSelectSBU()
                .getSelectSBUValue()
                .getSelectCostCenter()
                .getSelectCostCenterValue()
                .getSelectDate()
                .getSelectDateValue()
                .getJustification("string")
                .getUploadFile()
                .getSaveBtn();

    }
}


