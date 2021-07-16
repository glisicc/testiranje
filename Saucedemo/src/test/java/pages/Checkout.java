package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Checkout extends MainMethods  {

    private final By CONTINUE = By.xpath("//input[@id='continue']");
    private final By FINISH = By.xpath("//button[@id='finish']");
    private final By TOTAL = By.xpath("//div[contains(text(),'53.99')]");
    private final By THANKYOU = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");

    public Checkout enterCheckoutData(String id,String text) {
        waitForPageToBeLoaded();
        type(By.xpath("//input[@id='"+id+"']"), text);
        test.log(LogStatus.INFO, id + " je unet: " + text);
        return this;
    }
    public Checkout clickOnConitnue(){
        click(CONTINUE);
        test.log(LogStatus.INFO, "Continue is clicked");
        return this;
    }
    public Checkout verifyTotal(){
        verifyThatElementIsVisible(TOTAL);
        test.log(LogStatus.INFO, "Total is 53.99");
        return this;
    }
    public Checkout clickFinish(){
        click(FINISH);
        test.log(LogStatus.INFO, "Finish is clicked");
        return this;
    }
    public Checkout thankYou(){
        verifyThatElementIsVisible(THANKYOU);
        test.log(LogStatus.INFO, "Thank you");
        return this;
    }


}
