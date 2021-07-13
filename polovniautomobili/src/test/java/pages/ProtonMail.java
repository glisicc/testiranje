package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class ProtonMail extends MainMethods {

    private final By login = By.xpath("//button[@id='login_btn']");
    private final By paMail = By.xpath("//span[contains(text(),'PolovniAutomobili')]");
    private final By paLink = By.xpath("//a[contains(text(),'www.polovniautomobili.com/aktivacija-naloga')]");

    public ProtonMail input(String id, String Value){
        type(By.xpath("//input[@id='"+id+"']"), Value);
        test.log(LogStatus.INFO, "["+Value.toString()+"] is entered" );
        return this;
    }
    public ProtonMail clickLogin() throws InterruptedException {
        click(login);
        test.log(LogStatus.INFO, "[Login] is clicked" );
        Thread.sleep(100);

        return this;

    }
    public ProtonMail verifyPotvrda() throws InterruptedException {
        verifyThatElementIsVisible(paMail);
        test.log(LogStatus.INFO, "[Mail] is visible" );

        return this;
    }
    public ProtonMail clickOnMail(){
        click(paMail);
        test.log(LogStatus.INFO, "[Mail] is clicked" );
        return this;
    }
    public ProfileSetting clickOnLink() throws InterruptedException {
        Thread.sleep(100);
        click(paLink);
        switchToTab(1);
        test.log(LogStatus.INFO, "[Link] is clicked" );
        return new ProfileSetting();
    }
}
