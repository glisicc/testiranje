package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Context_Menu extends MainMethods {
    private final By CONTEXT = By.xpath("//div[@id='hot-spot']");

    public Context_Menu rightClickOnDiv(){
        Actions action = new Actions(getDriver());
        WebElement link = getDriver().findElement(CONTEXT);
        action.contextClick(link).perform();
        return this;
    }

    public Context_Menu swicthToAlert(){
        String alertMessage=getDriver().switchTo().alert().getText();
        test.log(LogStatus.INFO, "[You selected yes] is visible" + alertMessage);
        getDriver().switchTo().alert().accept();
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}