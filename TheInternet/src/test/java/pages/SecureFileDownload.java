package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class SecureFileDownload extends MainMethods {
    private final By downloadLink=By.xpath("//a[2]");

    public SecureFileDownload typeTextForUsernameAndPassword(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/download_secure");
        test.log(LogStatus.INFO, "Succesfully login on download secure.");
        return this;
    }
    public SecureFileDownload clickOnDownloadLike() throws InterruptedException{
        verifyThatElementIsVisible(downloadLink);
        click(downloadLink);
        Thread.sleep(1000);
       // getLastModifiedFileName("C://Users//stefan//Downloads");
        test.log(LogStatus.INFO, "Secure picture is downloaded.");
        return this;
    }
    public HomePage goingToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}
