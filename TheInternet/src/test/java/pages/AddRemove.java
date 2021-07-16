package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class AddRemove extends MainMethods {

    private final By CLICKBUTTON =By.xpath("//button");
    private final By DELETEBUTTON =By.xpath("//button[@class='added-manually']");

    public AddRemove clickOnAddElementButton(){
        click(CLICKBUTTON);
        test.log(LogStatus.INFO, "Button [Add elements] is clicked.");
        return this;
    }
    public AddRemove verifyThatNewElementIsVisible(){
        verifyThatElementIsVisible(DELETEBUTTON);
        test.log(LogStatus.INFO, "Button [Delete] is visible.");
        return this;
    }
    public AddRemove clickOnDeleteElementButton(){
        click(DELETEBUTTON);
        test.log(LogStatus.INFO, "Button [Add elements] is clicked.");
        return this;
    }
    public AddRemove verifyThatNewElementIsNotVisibleAnymore(){
        verifyThatElementIsNotVisible(DELETEBUTTON);
        test.log(LogStatus.INFO, "Button [Delete] is not visible.");
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}
