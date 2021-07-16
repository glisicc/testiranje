package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class CheckBoxes extends MainMethods {

    private final By CB1 =By.xpath("//input[@type='checkbox'][1]");
    private final By CB2 =By.xpath("//input[@type='checkbox'][2]");
    private final By CB_CHECKED =By.xpath("//input[@type='checkbox' and @checked='']");

    public CheckBoxes clickOnCB1()
    {
        click(CB1);
        test.log(LogStatus.INFO, "[checkbox 1] is checked.");
        return this;
    }
    public CheckBoxes clickOnCB2()
    {
        click(CB2);
        test.log(LogStatus.INFO, "[checkbox 2] is checked.");
        return this;
    }
    public CheckBoxes verifyThathCB1IsChecked(){
        verifyThatElementIsVisible(CB_CHECKED);
        test.log(LogStatus.INFO, "[checkbox 1] is checked.");
        return this;
    }
    public CheckBoxes verifyThatCB2IsUnChecked(){
        verifyThatElementIsVisible(CB2);
        test.log(LogStatus.INFO, "[checkbox 2] is unchecked.");
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}
