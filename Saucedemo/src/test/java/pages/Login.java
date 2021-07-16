package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Login extends MainMethods {

    private final By ELEMENTS = By.xpath("//input[@type='submit']");

    public Login refreshLoginPage(){
        refreshPage();
        return this;
    }
    public Login enterLoginData(String id, String text) {
        type(By.xpath("//input[@id='"+id+"']"), text);
        test.log(LogStatus.INFO, id + " je unet: " + text);
        return this;
    }

    public Login clickOnLogin(){
        click(ELEMENTS);
        test.log(LogStatus.INFO, "Login is clicked" );
        return this;
    }
    public Login verifyThatElementsTitleIsVisible(String text){
        verifyThatElementIsVisible(By.xpath("//h3[contains(text(),'" + text + "')]"));
        test.log(LogStatus.INFO, "The" +text+ " title is visible");
        return this;
    }


}
