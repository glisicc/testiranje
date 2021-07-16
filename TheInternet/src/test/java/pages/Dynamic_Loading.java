package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Dynamic_Loading extends MainMethods {

    private final By EXAMPLE1 = By.xpath("//a[@href='/dynamic_loading/1']");
    private final By EXAMPLE2 = By.xpath("//a[@href='/dynamic_loading/2']");
    private final By START = By.xpath("//button");
    private final By AFTERSTART = By.xpath("//h4[text()='Hello World!']");

    public Dynamic_Loading clickOnButtonExample1(){
        click(EXAMPLE1);
        test.log(LogStatus.INFO, "Button example 1 is clicked.");
        return this;
    }
    public Dynamic_Loading verifyThatTittleHelloWorldIsNotPresenting(){
        verifyThatElementIsNotVisible(AFTERSTART);
        test.log(LogStatus.INFO, "Tittle [Hello world!] is not visible.");
        return this;
    }
    public Dynamic_Loading clickOnStartButton(){
        click(START);
        test.log(LogStatus.INFO, "Button [start] is clicked.");
        return this;
    }
    public Dynamic_Loading verifyTextAfterClickButtonStart() throws InterruptedException {
        Thread.sleep(5000);
        verifyThatElementIsVisible(AFTERSTART);
        test.log(LogStatus.INFO, "Tittle [Hello world!] is now visible.");
        return this;
    }
    public Dynamic_Loading getBackToPreviousPage(){
        getDriver().navigate().back();
        return this;
    }
    public Dynamic_Loading clickOnButtonExample2(){
        click(EXAMPLE2);
        test.log(LogStatus.INFO, "Button example 2 is clicked.");
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();}
}