package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Shop extends MainMethods {

    private final By POTVRDA = By.xpath("//span[@class='shopping_cart_badge']");
    private final By CART = By.xpath("//a[@class='shopping_cart_link']");
    private final By CHECKOUT = By.xpath("//button[@id='checkout']");
    private final By ONEITEM = By.xpath("//span[contains(text(),'1')]");
    private final By ADD = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");


    public Shop verifyThatElementsTitleIsVisible(String text){
        verifyThatElementIsVisible(By.xpath("//div[contains(text(),'" + text + "')]"));
        test.log(LogStatus.INFO, "The" +text+ " title is visible");
        return this;
    }
    public Shop verifyThatShoppingCartIsEmpty(){
        verifyThatElementIsNotVisible(POTVRDA);
        test.log(LogStatus.INFO, "The shopping cart is empty");
        return this;
    }
    public Shop clickOnAdd(){
        click(ADD);
        test.log(LogStatus.INFO, "Item is added");
        return this;
    }
    public Shop oneItemIsAdded(){
        verifyThatElementIsVisible(ONEITEM);
        test.log(LogStatus.INFO, "The one item is added");
        return this;
    }
    public Shop clickOnCart(){
        click(CART);
        test.log(LogStatus.INFO, "Cart is clicked");
        return this;
    }
    public Checkout clickOnChekout(){
        click(CHECKOUT);
        test.log(LogStatus.INFO, "Checkout is clicked");
        return new Checkout();
    }


}
