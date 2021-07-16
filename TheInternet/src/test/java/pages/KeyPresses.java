package pages;

import main.MainMethods;
import org.openqa.selenium.By;

public class KeyPresses extends MainMethods {
    private final By INPUT = By.xpath("//input");
    private final By RESULT = By.xpath("//p[@id='result']");

    public KeyPresses typeLetterInInputField(){
        getDriver().findElement(INPUT).sendKeys("P");
        String text=getDriver().findElement(RESULT).getText();

        if(text.equals("You entered: P")){
            System.out.println("test passed easy");
        }else {
            System.out.println("not passed");
        }
        return this;
    }
    public HomePage getBackToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}
