package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class AB_Testing extends MainMethods {

    private final By text=By.xpath("//p");

    public AB_Testing verifyThatTextIsVisible(){
        verifyThatElementIsVisible(text);
        test.log(LogStatus.INFO, "AB example text is visible ");

        return this;
    }
    public HomePage BackToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}
