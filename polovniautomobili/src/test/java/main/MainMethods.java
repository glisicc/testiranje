package main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainMethods extends SetUp {
    Long index = null;
    String email;
    public String incrementNumberInFile() {

        File file = new File("C:/Users/stefan/IdeaProjects/polovniautomobili/target/file/indexOfEmail.txt");

        if (!file.exists()) {
            index = 1L;
        } else {
            try (BufferedReader bf = Files.newBufferedReader(file.toPath())) {
                index = Long.parseLong(bf.readLine());
            } catch (Exception e) {
                throw new SeleneseException(("Error while reading an index from the file"));
            }
        }
        try (FileWriter fileWriter = new FileWriter(file)) {
            index++;
            fileWriter.write(index.toString());
        } catch (Exception e) {
            throw new SeleneseException(("Error while writing a new index in the file"));
        }
        return index.toString();
    }


    public String createEmail() {
        incrementNumberInFile();
        String emailPrefix = "prefix";
        emailPrefix += index;
        email = "glisicc+" + emailPrefix + "@protonmail.com";
        return email;
    }

    public void verifyThatElementIsVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void verifyThatElementIsNotVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void type(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }

    public void clear(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).clear();
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void waitForPageToBeLoaded() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(webDriver -> ((JavascriptExecutor) getDriver()).executeScript("return document.readyState").equals("complete"));
    }

    public void switchToTab(int numberOfTab) {
        ArrayList<String> tabs2 = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(numberOfTab));
    }

    public void closeTabAndSwitchToMain(int closeTab, int switchTab) {
        Set<String> handlesSet = getDriver().getWindowHandles();
        List<String> handlesList = new ArrayList<>(handlesSet);
        getDriver().switchTo().window(handlesList.get(closeTab));
        getDriver().close();
        getDriver().switchTo().window(handlesList.get(switchTab));
    }


}
