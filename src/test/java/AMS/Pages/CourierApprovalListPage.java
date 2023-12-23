package AMS.Pages;

import AMS.BaseAMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CourierApprovalListPage extends BaseAMS {

    public CourierApprovalListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-approver-request-list[1]/p-table[1]/div[1]/div[1]/div[1]/span[1]/p-dropdown[1]")
    WebElement dropDown;

    @FindBy(xpath = "//span[contains(text(),'Inbound')]")
    WebElement inbound;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/p-button[1]/button[1]/span[1]")
    WebElement viewBtn;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/p-button[1]/button[1]")
    WebElement inBoundViewBtn;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-approver-request-list[1]/courier-details-view[1]/div[1]/p-card[1]/div[1]/div[2]/div[2]/div[2]/p-button[1]/button[1]/span[2]")
    WebElement approveBtn;

    public CourierApprovalListPage getOutboundApprove () throws InterruptedException {

        By inboundListSelector = By.xpath("/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-approver-request-list[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr");
        List<WebElement> outboundList = driver.findElements(inboundListSelector);

        // Get the size of the list of elements
        int listSize = outboundList.size();

        // Print the size to the console
        System.out.println("Outbound List Size: " + listSize);

        if (listSize == 1) {
            System.out.println("No data found");
        } else {
            viewBtn.click();
            approveBtn.click();
        }

        Thread.sleep(2000);
        return this;
    }

    public CourierApprovalListPage getInboundApprove () throws InterruptedException {

        dropDown.isDisplayed();
        dropDown.click();
        Thread.sleep(1000);

        inbound.isDisplayed();
        inbound.click();
        Thread.sleep(1000);

//        By inboundListSelector = By.xpath("/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/courier-approver-request-list[1]/p-table[1]/div[1]/div[2]/table[1]/tbody");
        By inboundListSelector = By.tagName("tr");
        List<WebElement> inboundList = driver.findElements(inboundListSelector);

        System.out.println(inboundList);
        // Get the size of the list of elements
        int listSize = inboundList.size();

        // Print the size to the console
        System.out.println("Inbound List Size: " + listSize);

        if (listSize == 1) {
            System.out.println("No data found");
        } else {
            inBoundViewBtn.click();
            approveBtn.click();
        }

        Thread.sleep(2000);
        return this;
    }
}
