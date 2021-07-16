package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Dynamic_Controls extends MainMethods {

    private final By CHECKBOX = By.xpath("//input[@type='checkbox']");
    private final By REMOVE = By.xpath("//button[text()='Remove']");
    private final By AFTER_REMOVE = By.xpath("//p[@id='message']");
    private final By DISABLED = By.xpath("//input[@disabled]");
    private final By ENABLE = By.xpath("//button[text()='Enable']");
    private final By ENABLED_INPUT = By.xpath("//input[@type='text']");

    public Dynamic_Controls clickOnCheckBox(){
        click(CHECKBOX);
        test.log(LogStatus.INFO, "Button [checkbox] is clicked.");
        return this;
    }
    public Dynamic_Controls clickOnRemoveButton(){
        click(REMOVE);
        test.log(LogStatus.INFO, "Button [Remove] is clicked.");
        return this;
    }
    public Dynamic_Controls verifyThatYouRemoveCheckbox() throws InterruptedException {
        Thread.sleep(4000);
        verifyThatElementIsNotVisible(CHECKBOX);
        test.log(LogStatus.INFO, "Button [checkbox] is not visible anymore.");
        return this;
    }
    public Dynamic_Controls verifyParagraphSuccessfully(){
        verifyThatElementIsVisible(AFTER_REMOVE);
        test.log(LogStatus.INFO, "Paragraph [it's gone] is now visible.");
        return this;
    }
    public Dynamic_Controls verifyThatInputFieldIsDisabled(){
        verifyThatElementIsVisible(DISABLED);
        test.log(LogStatus.INFO, "Input field is disabled.");
        return this;
    }
    public Dynamic_Controls clickOnEnableButton(){
        click(ENABLE);
        test.log(LogStatus.INFO, "Button [Enable] is clicked.");
        return this;
    }
    public Dynamic_Controls verifYThatInputFieldIsNowEnabled() throws InterruptedException{
        Thread.sleep(4000);
        verifyThatElementIsVisible(ENABLED_INPUT);
        test.log(LogStatus.INFO, "Input field is now enabled.");
        return this;
    }
    public Dynamic_Controls typeInInputField(){
        type(ENABLED_INPUT,"Stefan Glisic 038/2018");
        test.log(LogStatus.INFO, "[Stefan Glisic 038/2018] is typed in input field.");
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}
