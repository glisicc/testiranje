package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Dropdown extends MainMethods {

    private final By OPTIONS = By.xpath("//option[text()='Option 2']");
    private final By SELECT = By.xpath("//select[@id='dropdown']");
    private final By VERIFY =By.xpath("//select[@id='dropdown']//option[text()='Option 2']");

    public Dropdown clickOnSelect(){
        click(SELECT);
        test.log(LogStatus.INFO, "Dropdown is clicked.");
        return this;
    }
    public Dropdown clickOnOptionInDropdown(){
        click(OPTIONS);
        test.log(LogStatus.INFO, "Option from dropdown is clicked.");
        return this;
    }
    public Dropdown verifyThatYouSelectOption2InDropDown(){
        verifyThatElementIsVisible(VERIFY);
        test.log(LogStatus.INFO, "Option 2 from dropdown is visible.");
        getDriver().navigate().back();
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}