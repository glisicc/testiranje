package pages;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Horizontal_Slider extends MainMethods {
    private final By slider=By.xpath("//input");
    private final By result=By.xpath("//span[@id='range']");
    public Horizontal_Slider textFromSpanToCheckIfWeMoveSliderTo5() throws InterruptedException {
        Thread.sleep(400);
        WebElement span=getDriver().findElement(By.xpath("//span[@id='range']"));
        String text=span.getText();
        if (text.equals("5")){
            System.out.println("Progress bar is on 5");
        }else {
            System.out.println("It's not on 5");
        }
        return this;
    }
    private static final int Y_OFFSET = 0;

    public Horizontal_Slider moveSliderFromZeroToFive(final int stepSlider) {
        WebElement slider=getDriver().findElement(By.xpath("//input"));
        Actions actions=new Actions(getDriver());
        actions.moveToElement(slider, xOffset(stepSlider), Y_OFFSET).click().build().perform();
        return this;
    }
    private int xOffset(final int stepSlider) {
        WebElement slider=getDriver().findElement(By.xpath("//input"));
        return slider.getSize().width * stepSlider / 100;
    }
    public HomePage getBackToHomepage(){
        getDriver().navigate().back();
        return new HomePage();
    }
}