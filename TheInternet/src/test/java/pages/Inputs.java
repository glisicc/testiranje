package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Inputs extends MainMethods {
    private final By INPUT =By.xpath("//input");
    public Inputs typeNumberInInputField(){
        type(INPUT,"5");
        for (int i=0; i<5; i++){
            getDriver().findElement(INPUT).sendKeys(Keys.ARROW_UP);
            String textFromINput =getDriver().findElement(INPUT).getText();
            System.out.println(""+textFromINput);
        }
        test.log(LogStatus.INFO, "Input number is typed.");
        return this;
    }
    public HomePage getBackToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}