package pages;

import main.MainMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class JS_Alerts extends MainMethods {
    private final By BUTTON_JSAlerts = By.xpath("//div[@class='example']//ul//li[1]//button");
    private final By CONFIMR_ALERT = By.xpath("//div[@class='example']//ul//li[2]//button");
    private final By PROMPT_ALERT = By.xpath("//div[@class='example']//ul//li[3]//button");
    private final By RESULT =By.xpath("//p[@id='result']");

    public JS_Alerts clickOnFirtsButtonAlerts(){
        click(BUTTON_JSAlerts);
        String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        getDriver().switchTo().alert().accept();
        return this;
    }
    public JS_Alerts verifyResultText(){
        verifyThatElementIsVisible(RESULT);
        String result=getDriver().findElement(RESULT).getText();
        System.out.println(result);
        return this;
    }
    public JS_Alerts clickOnConfirmButtonAlerts(){
        click(CONFIMR_ALERT);
        String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        getDriver().switchTo().alert().accept();
        return this;
    }
    public JS_Alerts clickOnPromptAlertButton(){
        click(PROMPT_ALERT);
        String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        Alert promptAlert  = getDriver().switchTo().alert();
        promptAlert.sendKeys("Stefan Glisic 038/2018");
        promptAlert.accept();
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}