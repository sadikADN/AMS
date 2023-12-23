package AMS.Pages;

import AMS.BaseAMS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseAMS {

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-body/div[1]/app-sidenav[1]/div[1]/div[1]/span[1]")
    WebElement expandMenu;

    @FindBy(xpath = "//div[contains(text(),'SQ Approvals')]")
    WebElement sqApprovals;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-sidenav/div/div[2]/ul/li[3]/a/span")
    WebElement administrative;

    @FindBy(xpath = "//span[contains(text(),'User Creation')]")
    WebElement userCreation;

    @FindBy(xpath = "//span[contains(text(),' Shipping & Logistics ')]")
    WebElement shippingLogistics;

    @FindBy(xpath = "//span[contains(text(),'Courier')]")
    WebElement courier;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-sidenav/div/div[2]/ul/li[4]/div/app-sublevel-menu/ul/li/div/app-sublevel-menu/ul/li[1]/a/span")
    WebElement courierRequest;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-sidenav/div/div[2]/ul/li[4]/div/app-sublevel-menu/ul/li/div/app-sublevel-menu/ul/li[3]/a/span")
    WebElement courierApprovalList;

    @FindBy(xpath = "//span[contains(text(),'Commercial List')]")
    WebElement courierCommercialList;

    @FindBy(xpath = "//span[contains(text(),'Dispatched List')]")
    WebElement courierDispatchedList;

    @FindBy(xpath = "//span[contains(text(),'Marketing - Supply Chain')]")
    WebElement marketingSupplyChain;

    @FindBy(xpath = "//span[contains(text(),'Supplier Onboarding')]")
    WebElement supplierOnboarding;

    @FindBy(xpath = "//span[contains(text(),'Add Suppliers')]")
    WebElement addSuppliers;

    @FindBy(xpath = "//span[contains(text(),'Non RM')]")
    WebElement nonRM;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-sidenav/div/div[2]/ul/li[4]/div/app-sublevel-menu/ul/li[2]/div/app-sublevel-menu/ul/li[1]/a/span")
    WebElement createNonRMRequest;

    @FindBy(xpath = "//span[contains(text(),'Administration')]")
    WebElement administration;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-sidenav/div/div[2]/ul/li[2]/div/app-sublevel-menu/ul/li[1]/a/span")
    WebElement dormetory;

    @FindBy(xpath = "(//span[contains(text(),' Create ')])[1]")
    WebElement addDormetory;

    @FindBy(className = "sublevel-link-text ng-tns-c1695450584-84 ng-trigger ng-trigger-fadeInOut ng-star-inserted")
    WebElement visitor;

    @FindBy(xpath = "//span[contains(text(),'New Request')]")
    WebElement newRequest;

    public DashboardPage expandMenu() throws InterruptedException {
        expandMenu.isDisplayed();
        expandMenu.click();
        Thread.sleep(2000);
        return this;
    }

  /*  public DashboardPage getSQApprovals() {
        sqApprovals.isDisplayed();
        return this;
    }*/

    public boolean isSQApprovals() {
        return sqApprovals.isDisplayed();
    }

    public DashboardPage getAdmin() {
        administrative.isDisplayed();
        administrative.click();
        return this;
    }

    public UserCreationPage getUserCreation() {
        userCreation.isDisplayed();
        userCreation.click();
        return new UserCreationPage();
    }

    public DashboardPage getShippingLogistics() {
        shippingLogistics.isDisplayed();
        shippingLogistics.click();
        return this;
    }

    public DashboardPage getCourier() throws InterruptedException {
        courier.isDisplayed();
        courier.click();
        Thread.sleep(1000);
        return this;
    }

    public CourierRequestPage getCourierRequest() throws InterruptedException {
        courierRequest.isDisplayed();
        courierRequest.click();
        Thread.sleep(1000);
        return new CourierRequestPage();
    }

    public CourierApprovalListPage getApprovalList() throws InterruptedException {
        courierApprovalList.isDisplayed();
        courierApprovalList.click();
        Thread.sleep(1000);
        return new CourierApprovalListPage();
    }

    public CourierCommercialPage getCourierCommercialList() throws InterruptedException {
        courierCommercialList.isDisplayed();
        courierCommercialList.click();
        Thread.sleep(1000);
        return new CourierCommercialPage();
    }

    public CourierDispatchedPage getCourierDispatchedList() throws InterruptedException {
        courierDispatchedList.isDisplayed();
        courierDispatchedList.click();
        Thread.sleep(1000);
        return new CourierDispatchedPage();
    }

    public DashboardPage getMarketingSupplyChain() {
        marketingSupplyChain.isDisplayed();
        marketingSupplyChain.click();
        return this;
    }

    public DashboardPage getSupplierOnboarding() {
        supplierOnboarding.isDisplayed();
        supplierOnboarding.click();
        return this;
    }

    public SupplierListPage getAddSuppliers() {
        addSuppliers.isDisplayed();
        addSuppliers.click();
        return new SupplierListPage();
    }

   /* @FindBy(xpath = "//span[contains(text(),'New')]")
    WebElement newBtn;

    public AddSupplierPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        newBtn.click();
        return new AddSupplierPage();

    }*/

    public DashboardPage getNonRM() {
        nonRM.isDisplayed();
        nonRM.click();
        return this;
    }

    public NonRMRequestPage getCreateNonRMRequest() {
        createNonRMRequest.isDisplayed();
        createNonRMRequest.click();
        return new NonRMRequestPage();
    }

    public DashboardPage getAdministration() {
        administration.isDisplayed();
        administration.click();
        return this;
    }

    public DashboardPage getDormetory() {
        dormetory.isDisplayed();
        dormetory.click();
        return this;
    }

    public AddDormitoryPage getAddDormetory() throws InterruptedException {
        addDormetory.isDisplayed();
        addDormetory.click();
        Thread.sleep(5000);
        return new AddDormitoryPage();
    }

    public DashboardPage getVisitor() {
        visitor.isDisplayed();
        visitor.click();
        return this;
    }

    public VisitorRequestPage getNewRequest() {
        newRequest.isDisplayed();
        newRequest.click();
        return new VisitorRequestPage();
    }


}


