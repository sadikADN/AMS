package AMS.Pages;

import AMS.BaseAMS;
import AMS.Utils.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class CourierRequestPage extends BaseAMS {

    public CourierRequestPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Choose Type')]")
    WebElement chooseType;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[1]/li[1]")
    WebElement chooseTypeValue;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[2]/li[1]/span[1]")
    WebElement chooseTypeValue1;

    @FindBy(xpath = "//span[contains(text(),'Choose City')]")
    WebElement chooseCity;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/p-dropdownitem[1]/li[1]")
    WebElement chooseCityValue;

    @FindBy(xpath = "//span[contains(text(),'Service Type')]")
    WebElement serviceType;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[1]/li[1]")
    WebElement serviceTypeValue;

    @FindBy(xpath = "//span[contains(text(),'Item Type')]")
    WebElement itemType;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[1]/li[1]")
    WebElement itemTypeValue;

    @FindBy(xpath = "//textarea[@placeholder=\"Add item description here...\"]")
    WebElement itemDescription;

    @FindBy(xpath = "//span[contains(text(),'Customer Brand')]")
    WebElement customerBrand;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/p-dropdownitem[1]/li[1]")
    WebElement customerBrandValue;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/courier-request-create-form/div/p-card/div/div/div[2]/form/div[2]/div[2]/p-dropdown/div/span")
    WebElement destinationCountry;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[2]")
    WebElement destinationCountryValue;

    @FindBy(xpath = "//span[contains(text(),'Choose season')]")
    WebElement chooseSeason;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement chooseSeasonValue;

    @FindBy(xpath = "//input[@placeholder=\"Example: 0.5 kg\"]")
    WebElement weight;

    @FindBy(xpath = "//input[@placeholder=\"OC Number\"]")
    WebElement ocNumber;

    @FindBy(xpath = "//input[@placeholder=\"No. of Cartons\"]")
    WebElement noOfCarton;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/p-autocomplete[1]/span[1]/input[1]")
    WebElement senderName;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]")
    WebElement senderDesignation;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/courier-request-create-form[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]")
    WebElement senderNo;

    @FindBy(xpath = "//p-calendar[@formcontrolname=\"proposedDeliveryDate\"]")
    WebElement proposedDeliveryDate;

    @FindBy(xpath = "//span[contains(text(),'22')]")
    WebElement proposedDeliveryDateValue;

    @FindBy(xpath = "//textarea[@formcontrolname=\"receiverAddress\"]")
    WebElement receiverAddress;

    @FindBy(xpath = "//textarea[@placeholder=\"Add remarks here...\"]")
    WebElement remarks;

    @FindBy(xpath = "//span[contains(text(),'Upload Invoice File')]")
    WebElement uploadInvoiceFile;

    @FindBy(xpath = "//span[contains(text(),'Upload AWB File')]")
    WebElement uploadAWBFile;

    @FindBy(xpath = "//span[contains(text(),'Preview')]")
    WebElement preview;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit;

//    public boolean isCourierRequest() {
//        return courierRequest.isDisplayed();
//    }

    public CourierRequestPage getChooseSBU() throws InterruptedException {
        chooseType.isDisplayed();
        chooseType.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseSBUvalue() throws InterruptedException {
        chooseTypeValue.isDisplayed();
        chooseTypeValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseSBUvalue1() throws InterruptedException {
        chooseTypeValue1.isDisplayed();
        chooseTypeValue1.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseCity() throws InterruptedException {
        chooseCity.isDisplayed();
        chooseCity.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseCityValue() throws InterruptedException {
        chooseCityValue.isDisplayed();
        chooseCityValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getSubmit() throws InterruptedException {
        submit.isDisplayed();
        submit.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getServiceType() throws InterruptedException {
        serviceType.isDisplayed();
        serviceType.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getServiceTypeValue() throws InterruptedException {
        serviceTypeValue.isDisplayed();
        serviceTypeValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getItemType() throws InterruptedException {
        itemType.isDisplayed();
        itemType.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getItemTypeValue() throws InterruptedException {
        itemTypeValue.isDisplayed();
        itemTypeValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getItemDescription(String describe) throws InterruptedException {
        itemDescription.isDisplayed();
        itemDescription.sendKeys(describe);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getCustomerBrand() throws InterruptedException {
        customerBrand.isDisplayed();
        customerBrand.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getCustomerBrandValue() throws InterruptedException {
        customerBrandValue.isDisplayed();
        customerBrandValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getDestinationCountry() throws InterruptedException {
        destinationCountry.isDisplayed();
        destinationCountry.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getDestinationCountryValue() throws InterruptedException {
        destinationCountryValue.isDisplayed();
        destinationCountryValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseSeason() throws InterruptedException {
        chooseSeason.isDisplayed();
        chooseSeason.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getChooseSeasonValue() throws InterruptedException {
        chooseSeasonValue.isDisplayed();
        chooseSeasonValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getWeight(String kg) throws InterruptedException {
        weight.isDisplayed();
        weight.sendKeys(kg);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getOcNumber(String ocnumber) throws InterruptedException {
        ocNumber.isDisplayed();
        ocNumber.sendKeys(ocnumber);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getNoOfCarton(String text) throws InterruptedException {
        noOfCarton.isDisplayed();
        noOfCarton.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getsenderName(String text) throws InterruptedException {
        senderName.isDisplayed();
        senderName.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getsenderDesignation(String text) throws InterruptedException {
        senderDesignation.isDisplayed();
        senderDesignation.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getsenderNo(String text) throws InterruptedException {
        senderNo.isDisplayed();
        senderNo.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getProposedDeliveryDate() throws InterruptedException {
        proposedDeliveryDate.isDisplayed();
        proposedDeliveryDate.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getProposedDeliveryDateValue() throws InterruptedException {
        proposedDeliveryDateValue.isDisplayed();
        proposedDeliveryDateValue.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getReceiverAddress(String text) throws InterruptedException {
        receiverAddress.isDisplayed();
        receiverAddress.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getRemarks(String text) throws InterruptedException {
        remarks.isDisplayed();
        remarks.sendKeys(text);
        Thread.sleep(1000);
        return this;
    }
CommonMethod commonMethod=new CommonMethod();
    public CourierRequestPage getuploadInvoiceFile() throws InterruptedException, AWTException {
        uploadInvoiceFile.isDisplayed();
        uploadInvoiceFile.click();
        String filePath=commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        return this;
    }

    public CourierRequestPage getuploadAWBFile() throws InterruptedException, AWTException {
        uploadAWBFile.isDisplayed();
        uploadAWBFile.click();
        String filePath=commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        return this;
    }

    public CourierRequestPage getPreview() throws InterruptedException {
        preview.isDisplayed();
        preview.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getSubmitButton() throws InterruptedException {
        submit.isDisplayed();
        submit.click();
        Thread.sleep(1000);
        return this;
    }
}
