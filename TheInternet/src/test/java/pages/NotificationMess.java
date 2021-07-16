package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class NotificationMess extends MainMethods {
    private final By buttonClickHere=By.xpath("//a[@href='/notification_message']");
    private final By div=By.xpath("//div[@class='flash notice']");
    public NotificationMess getMessageFromDiv(){
        verifyThatElementIsVisible(div);
        String text=getDriver().findElement(div).getText();
        System.out.println("Text before clicking on button" + text);
        click(buttonClickHere);
        String text1=getDriver().findElement(div).getText();
        if (text.equals(text1)){
            System.out.println("Text is same");
        }
        else{
            System.out.println("Text after clicking on button [click here is: "+ text1);
        }
        test.log(LogStatus.INFO, "Text from div is " + text1);
        return this;
    }
    public NotificationMess getBackToHomepageFromNotificationPage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return this;
    }
}
