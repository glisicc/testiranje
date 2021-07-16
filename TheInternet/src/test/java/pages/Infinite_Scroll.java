package pages;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Infinite_Scroll extends MainMethods {
    private final By TEXT = By.className("jscroll-added");

    public Infinite_Scroll scrollToTheEndOfPage() {
        int index=50;
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParagraphsPresent() < index) {
            ((JavascriptExecutor) getDriver()).executeScript(script);
        }
        return this;
    }
    private int getNumberOfParagraphsPresent(){
        return getDriver().findElements(TEXT).size();
    }
    public HomePage getBackToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}
