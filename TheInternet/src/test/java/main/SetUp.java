package main;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class SetUp {

    public static WebDriver driver;

    public static ExtentReports report;
    public static ExtentTest test;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver createDriver() {

        try {
            if (getDriver() != null) {
                return getDriver();
            }
            String DRIVER_NAME_CHROME = "webdriver.chrome.driver";
            System.setProperty(DRIVER_NAME_CHROME, Paths.DRIVER_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            return driver = new ChromeDriver(options);
        } catch (SeleneseException e) {
            throw new SeleneseException("The driver is not created");
        }
    }

    public void quitDriver() {
        driver.quit();
        driver = null;
    }

    public void openApplication(String URL){
        getDriver().get(URL);
    }

    public void createReport(String testName) {

        report = new ExtentReports(Paths.FOLDER_REPORT_PATH, false);
        report.addSystemInfo("OS", "Windows 10");
        report.addSystemInfo("Browser", "Version 91.0.4472.77");
        report.addSystemInfo("Tester name", "Stefan Glisic");
        report.addSystemInfo("URL", "http://the-internet.herokuapp.com/");
        report.addSystemInfo("Date", "06.03.2021");
        test = report.startTest(testName);
    }

    @AfterMethod
    public void tearDown(ITestResult testResult) throws Exception {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            String path = Screenshot.takeScreenshot(getDriver(), Screenshot.generateFileName(testResult));
            String imgPath = test.addScreenCapture(path);
            test.log(LogStatus.FAIL, "The following test case FAILED: " + testResult.getName(), imgPath);
            test.log(LogStatus.FAIL, "The following method FAILED: " + testResult.getThrowable());
        } else if (testResult.getStatus() == ITestResult.SUCCESS) {
            test.log(LogStatus.PASS, "The following test case PASSED:" + testResult.getName());
        } else if (testResult.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.PASS, "The following test case SKIPPED: " + testResult.getName());
        }
        report.endTest(test);
        report.flush();
    }

}
