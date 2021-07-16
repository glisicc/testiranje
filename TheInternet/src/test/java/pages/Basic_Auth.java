package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Basic_Auth extends MainMethods {
    private final By CONGR_TEXT=By.xpath("//p");

    public Basic_Auth typeTextInInput(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        verifyThatElementIsVisible(CONGR_TEXT);
        test.log(LogStatus.INFO, "Successfully login.");
        return this;
    }

    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}
