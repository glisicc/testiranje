package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_Content extends MainMethods {
    private final By CLICK_HERE = By.xpath("//a[text()='click here']");

    public Dynamic_Content clickOnClickHereButton(){
        click(CLICK_HERE);
        test.log(LogStatus.INFO, "Button [click here] is clicked.");
        return this;
    }
    public Dynamic_Content verifyThatImageIsChangeAfterRefresh() throws InterruptedException{

        WebElement totalInstallsElement = getDriver().findElement(By.xpath("//div[@id='content']//div[@class='row'][2]"));
        String textFromDiv2 = totalInstallsElement.getText();
        WebElement totalInstallsElement1 = getDriver().findElement(By.xpath("//div[@id='content']//div[@class='row'][3]"));
        String textFromDiv3 = totalInstallsElement1.getText();
        Thread.sleep(500);
        clickOnClickHereButton();
        Thread.sleep(500);
        WebElement totalInstallsElement12 = getDriver().findElement(By.xpath("//div[@id='content']//div[@class='row'][2]"));
        String textFromDiv2AfterClick = totalInstallsElement12.getText();
        WebElement totalInstallsElement13 = getDriver().findElement(By.xpath("//div[@id='content']//div[@class='row'][3]"));
        String textFromDiv3AfterClick = totalInstallsElement13.getText();

        if (textFromDiv2.equals(textFromDiv2AfterClick)){
            System.out.println("The expected heading is same as actual heading --- " );
        }
        else{
            System.out.println("Text ins't same on div 2 " + textFromDiv2AfterClick );
        }
        if (textFromDiv3.equals(textFromDiv3AfterClick)) {
            System.out.println("The expected heading is same as actual heading --- " );
        }
        else{
            System.out.println("Text isn't same on div 3"  + textFromDiv3AfterClick);

        }
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}