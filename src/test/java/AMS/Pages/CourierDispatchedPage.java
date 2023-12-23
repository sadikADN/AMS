package AMS.Pages;

import AMS.BaseAMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CourierDispatchedPage extends BaseAMS {

    public CourierDispatchedPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-dispatched-list[1]/p-table[1]/div[1]/div[1]/div[1]/span[1]/p-dropdown[1]/div[1]/span[1]")
    WebElement dropDown;

    @FindBy(xpath = "//span[contains(text(),'Inbound')]")
    WebElement inbound;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/p-button[1]/button[1]")
    WebElement viewBtn;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-dispatched-list[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/input[1]")
    WebElement trackingNumber;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-dispatched-list[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[3]/div[2]/p-button[1]/button[1]")
    WebElement submitBtn;

    public CourierDispatchedPage getOutboundApprove (String number) throws InterruptedException {

        By inboundListSelector = By.xpath("/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-dispatched-list[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr");
        List<WebElement> outboundList = driver.findElements(inboundListSelector);

        // Get the size of the list of elements
        int listSize = outboundList.size();

        // Print the size to the console
        System.out.println("Outbound List Size: " + listSize);

        if (listSize == 0) {
            System.out.println("No data found");
        } else {
            viewBtn.click();
            trackingNumber.clear();
            trackingNumber.sendKeys(number);
            submitBtn.click();
        }

        Thread.sleep(2000);
        return this;
    }


    public CourierDispatchedPage getInboundApprove (String number) throws InterruptedException {

        dropDown.isDisplayed();
        dropDown.click();
        Thread.sleep(1000);

        inbound.isDisplayed();
        inbound.click();
        Thread.sleep(1000);

        By inboundListSelector = By.xpath("/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-dispatched-list[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr");
        List<WebElement> outboundList = driver.findElements(inboundListSelector);

        // Get the size of the list of elements
        int listSize = outboundList.size();

        // Print the size to the console
        System.out.println("Outbound List Size: " + listSize);

        if (listSize == 0) {
            System.out.println("No data found");
        } else {
            viewBtn.click();
            trackingNumber.clear();
            trackingNumber.sendKeys(number);
            submitBtn.click();
        }

        Thread.sleep(2000);
        return this;
    }
}
