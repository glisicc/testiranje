package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Register extends MainMethods {

    private final By registrujSe = By.xpath("//button[text()='Registruj se']");
    private final By potvrda = By.xpath("//p[contains(text(),'Hvala na registraciji')]");
    private final By proba = By.xpath("//a[contains(text(),'Uloguj se')]");


    public Register verifyEmail(){

        verifyThatElementIsVisible(proba);
        test.log(LogStatus.INFO, "[Obavestenje] is visible" );
        return this;
    }

    public Register typeEmail(String id) throws Exception {
        Thread.sleep(500);
        type(By.xpath("//input[@id='"+id+"']"), createEmail());
        test.log(LogStatus.INFO, "["+createEmail().toString()+"] is entered" );
        return this;
    }
    public Register typePassword(String id, String Password){
        waitForPageToBeLoaded();
        type(By.xpath("//input[@id='"+id+"']"), Password);
        test.log(LogStatus.INFO, "["+Password.toString()+"] is entered" );
        return this;
    }
    public Register clickCheckBox(String id){
        click(By.xpath("//input[@id='"+id+"']"));
        test.log(LogStatus.INFO, "CheckBox["+id.toString()+"] is entered" );
        return this;
    }
    public Register clickRegistrujSe(){
        click(registrujSe);
        test.log(LogStatus.INFO, "[Registruj se] is clicked" );
        return this;
    }
    public Register verifyPotvrda(){
        waitForPageToBeLoaded();
        verifyThatElementIsVisible(potvrda);
        test.log(LogStatus.INFO, "[Obavestenje] is visible" );
        return this;
    }



}
