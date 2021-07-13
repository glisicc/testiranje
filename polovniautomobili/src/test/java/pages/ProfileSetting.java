package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class ProfileSetting extends MainMethods {

    private final By clickCity = By.xpath("//a[contains(text(),'Kragujevac')]");
    private final By clickSacuvaj = By.xpath("//button[@id='submit']");
    private final By verifyUspesno = By.xpath("//div[contains(text(),'Uspešno si izmenio tvoje podatke')]");
    private final By clickReklama = By.xpath("//button[contains(text(),'U REDU')]");
    private final By clickMenu = By.xpath("//div[contains(text(),'MOJ PROFIL')]");
    private final By logOut = By.xpath("//ul[@class='uk-nav uk-nav-dropdown']//*[text()='Odjavi se']");
    private final By prijaviseButton=By.xpath("//div[@class='top-menu-profile position-relative']");
    private final By youAreLoged=By.xpath("//div[@class='uk-float-left']//span[@class='ym-hide-content' ]");






    public ProfileSetting clickReklama(){
        click(clickReklama);
        test.log(LogStatus.INFO, "[Reklama] is clicked" );
        return this;
    }

    public ProfileSetting insertData(String id, String value){
        waitForPageToBeLoaded();
        type(By.xpath("//input[@id='"+id+"']"), value);
        test.log(LogStatus.INFO, "["+value.toString()+"] is entered" );
        return this;
    }

    public ProfileSetting clickCity(){
        click(clickCity);
        test.log(LogStatus.INFO, "[City] is clicked" );
        return this;
    }
    public ProfileSetting clickSacuvaj(){
        click(clickSacuvaj);
        test.log(LogStatus.INFO, "[Sacuvaj] is clicked" );
        return this;
    }
    public ProfileSetting verifyUspesno(){

        verifyThatElementIsVisible(verifyUspesno);
        test.log(LogStatus.INFO, "[Uspesno] is visible" );
        return this;
    }
    public ProfileSetting clickMenu(){
        click(clickMenu);
        test.log(LogStatus.INFO, "[Padajuci] is clicked" );
        return this;
    }
    public ProfileSetting logout(){
        click(logOut);
        test.log(LogStatus.INFO, "[Odjavi se] is clicked" );
        return this;
    }
    public ProfileSetting clickOnLogin(){
        click(prijaviseButton);
        test.log(LogStatus.INFO, "[Login button] is clicked");
        return this;
    }
    public ProfileSetting verifyThatYouAreLogedIn(String username){
        verifyThatElementIsVisible(youAreLoged);
        test.log(LogStatus.INFO, "You are loged in" + username);
        return this;
    }
}
