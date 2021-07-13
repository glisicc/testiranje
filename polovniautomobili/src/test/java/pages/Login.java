package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Login extends MainMethods {


    private final By registrujSe = By.xpath("//a[text()='Registruj se']");

    public Register clickOnRegistrujSe(){
        click(registrujSe);
        test.log(LogStatus.INFO, "[registrujSe] is clicked" );
        return new Register();
    }

}
