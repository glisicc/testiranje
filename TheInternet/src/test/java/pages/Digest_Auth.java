package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Digest_Auth extends MainMethods {
    private final By PARAGRAPH = By.xpath("//p");

    public Digest_Auth typeTextInInput(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        verifyThatElementIsVisible(PARAGRAPH);
        test.log(LogStatus.INFO, "Successfully login on Digest Authorisation.");
        return this;
    }
    public HomePage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}