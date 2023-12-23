package AMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AMS.BaseAMS.driver;


public class VisitorRequestPage {

    public VisitorRequestPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Choose SBU')]")
    WebElement chooseSBU;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement chooseSBUValue;

    @FindBy(xpath = "//span[contains(text(),'Location')]")
    WebElement location;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement locationValue;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/visitor-request-create[1]/p-card[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/p-calendar[1]")
    WebElement date;

    @FindBy(xpath = "//span[contains(text(),'24')]")
    WebElement dateValue;

    @FindBy(xpath = "//span[contains(text(),'Visit Purpose')]")
    WebElement visitPurpose;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement visitPurposeValue;

    @FindBy(xpath = "//input[@placeholder='Total Visitors']")
    WebElement totalVisitors;

    @FindBy(xpath = "//input[@placeholder='Visitor Company Name']")
    WebElement visitorCompanyName;

    @FindBy(xpath = "//span[contains(text(),'Add Visitor')]")
    WebElement addVisitor;
}
