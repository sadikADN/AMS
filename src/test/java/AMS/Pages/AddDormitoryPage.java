package AMS.Pages;

import AMS.BaseAMS;
import AMS.Utils.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class AddDormitoryPage extends BaseAMS {

    public AddDormitoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Select Employee')]")
    WebElement selectEmployee;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectEmployeeValue;

    @FindBy(xpath = "//p-dropdown[@placeholder='Select SBU']")
    WebElement selectSBU;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectSBUValue;

    @FindBy(xpath = "//span[contains(text(),'Select Cost Center')]")
    WebElement selectCostCenter;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectCostCenterValue;

    @FindBy(tagName = "p-calendar")
    WebElement selectDate;

    @FindBy(xpath = "//span[contains(text(),'20')]")
    WebElement selectDateValue;

    @FindBy(css = "#justification")
    WebElement justification;

    @FindBy(className = "card flex justify-content-center mt-2")
    WebElement uploadFile;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveBtn;

    public AddDormitoryPage getSelectEmployee() throws InterruptedException {
        selectEmployee.isDisplayed();
        selectEmployee.click();
        return this;
    }

    public AddDormitoryPage getSelectEmployeeValue() throws InterruptedException {
        selectEmployeeValue.isDisplayed();
        selectEmployeeValue.click();
        return this;
    }

    public AddDormitoryPage getSelectSBU() throws InterruptedException {
        selectSBU.isDisplayed();
        selectSBU.click();
        return this;
    }

    public AddDormitoryPage getSelectSBUValue() throws InterruptedException {
        selectSBUValue.isDisplayed();
        selectSBUValue.click();
        return this;
    }

    public AddDormitoryPage getSelectCostCenter() throws InterruptedException {
        selectCostCenter.isDisplayed();
        selectCostCenter.click();
        return this;
    }

    public AddDormitoryPage getSelectCostCenterValue() throws InterruptedException {
        selectCostCenterValue.isDisplayed();
        selectCostCenterValue.click();
        return this;
    }

    public AddDormitoryPage getSelectDate() throws InterruptedException {
        selectDate.isDisplayed();
        selectDate.click();
        return this;
    }

    public AddDormitoryPage getSelectDateValue() throws InterruptedException {
        selectDateValue.isDisplayed();
        selectDateValue.click();
        return this;
    }

    public AddDormitoryPage getJustification(String text) throws InterruptedException {
        justification.isDisplayed();
        justification.sendKeys(text);
        return this;
    }

    public AddDormitoryPage getUploadFile() throws InterruptedException, AWTException {
        uploadFile.isDisplayed();
        uploadFile.click();
        CommonMethod commonMethod = new CommonMethod();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddDormitoryPage getSaveBtn() throws InterruptedException {
        saveBtn.isDisplayed();
        saveBtn.click();
        return this;
    }
}

