package AMS.Pages;

import AMS.BaseAMS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierListPage extends BaseAMS {

    public SupplierListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/app-supplier-onboarding-list/div/div/div/div/button/span[1]")
    WebElement newBtn;

    public boolean isnewPage(){
        return newBtn.isDisplayed();
    }

    public AddSupplierPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        String text = newBtn.getText();
        System.out.println(text);
        newBtn.click();
        return new AddSupplierPage();
    }

/*    public SupplierListPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        Thread.sleep(2000);
        newBtn.click();
        Thread.sleep(2000);
        return this;
    }*/


}
