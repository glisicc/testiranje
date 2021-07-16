package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Entry_Ad extends MainMethods {

    private final By CLOSE = By.xpath("//p[text()='Close']");
    private final By TEXT = By.xpath("//p[text()='If closed, it will not appear on subsequent page loads.']");

    public Entry_Ad clickOnClose(){

        click(CLOSE);
        test.log(LogStatus.INFO, "Drag [column a] and drop to [column b].");
        return this;
    }
    public Entry_Ad verifyTitle(){
        verifyThatElementIsVisible(TEXT);
        test.log(LogStatus.INFO, "Drag [column a] and drop to [column b].");
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}