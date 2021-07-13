package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class HomePage extends MainMethods {

    private final By postaviOglas = By.xpath("//a[text()='Postavi oglas']");

    public Login clickOnPostaviOglas(){
        click(postaviOglas);
        test.log(LogStatus.INFO, "[postaviOglas] is clicked" );
        return new Login();
    }


    public HomePage verifyElementsFromHomepageAreVisible(String text) {
        verifyThatElementIsVisible(By.xpath("//h5[text()='" + text + "']//ancestor::div[@class='card mt-4 top-card']"));
        test.log(LogStatus.INFO, "The following element is visible: " + text);
        return this;
    }




}
