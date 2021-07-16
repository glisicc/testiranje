package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers extends MainMethods {
    private final By IMAGE1_TEXT =By.xpath("//div[@class='figcaption']//h5[text()='name: user1']");
    private final By IMAGE2_TEXT =By.xpath("//div[@class='figcaption']//h5[text()='name: user2']");
    private final By IMAGE3_TEXT =By.xpath("//div[@class='figcaption']//h5[text()='name: user3']");
    Actions hoverAction = new Actions(getDriver());

    public Hovers hoverOnImageOne(){
        WebElement picOne=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][1]"));
        hoverAction.moveToElement(picOne).build().perform();
        verifyThatElementIsVisible(IMAGE1_TEXT);
        test.log(LogStatus.INFO, "Image one is hover over.");
        return this;
    }
    public Hovers hoverOnImageTwo(){
        WebElement picTwo=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][2]"));
        hoverAction.moveToElement(picTwo).build().perform();
        verifyThatElementIsVisible(IMAGE2_TEXT);
        test.log(LogStatus.INFO, "Image two is hover over.");
        return this;
    }
    public Hovers hoverOnImageThree(){
        WebElement picThree=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][3]"));
        hoverAction.moveToElement(picThree).build().perform();
        verifyThatElementIsVisible(IMAGE3_TEXT);
        test.log(LogStatus.INFO, "Image three is hover over.");
        return this;
    }
    public HomePage getBackToHome(){
        getDriver().navigate().back();
        return new HomePage();
    }
}