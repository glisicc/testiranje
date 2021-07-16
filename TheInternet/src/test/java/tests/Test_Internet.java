package tests;

import main.MainMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.awt.*;

public class Test_Internet extends MainMethods {

    HomePage homePage = new HomePage();

    @BeforeClass
    public void setUp(){
        createDriver();
        openApplication("http://the-internet.herokuapp.com/");
    }

    @Test
    public void test01AddAndRemoveElements(){
        createReport("Add/Remove Elements");
        homePage.clickOnAddRemoveElementsLink()
                .clickOnAddElementButton()
                .verifyThatNewElementIsVisible()
                .clickOnDeleteElementButton()
                .verifyThatNewElementIsNotVisibleAnymore()
                .backToHomepage() ;
    }

    @Test
    public void test02TryToLoginOnBasicAuth(){
        createReport("Login on basic auth");
        homePage.clickOnAddRemoveElementsLink()
                .clickOnAddElementButton()
                .verifyThatNewElementIsVisible()
                .clickOnDeleteElementButton()
                .verifyThatNewElementIsNotVisibleAnymore()
                .backToHomepage();
    }
    @Test
    public void test03TryToClickOnCheckboxes(){
        createReport("Checkboxes test");
        homePage.clickOnCheckboxesLink()
                .clickOnCB1()
                .clickOnCB2()
                .verifyThathCB1IsChecked()
                .verifyThatCB2IsUnChecked()
                .backToHomepage();
    }
    @Test
    public void test04ABTestingPageTest(){
        createReport("A/B Test Control");
        homePage.clickOnABExample()
                .verifyThatTextIsVisible()
                .BackToHomepage();
    }
    @Test
    public void test05RightClickOnDivAndAcceptingAlert() {
        createReport("Context Menu test withright click");
        homePage.clickOnContestMenuLink()
                .rightClickOnDiv()
                .swicthToAlert()
                .backToHomepage();
    }
    @Test
    public void test06ClickOnOptionInDropDownMenu() {
        createReport("Dropdown List select");
        homePage.clickOnDropDownLink()
                .clickOnSelect()
                .clickOnOptionInDropdown()
                .verifyThatYouSelectOption2InDropDown()
                .backToHomepage();
    }
    @Test
    public void test07DynamicWebPageTest() throws InterruptedException{
        createReport("Dynamic elements");
        homePage.clickOnDynamicContentLink()
                .clickOnClickHereButton()
                .verifyThatImageIsChangeAfterRefresh()
                .backToHomepage();
    }

    @Test
    public void test08DynamicControlsOnWebPage() throws InterruptedException{
        createReport("Dynamic controls test");
        homePage.clickOnDynamicControlsLink()
                .clickOnCheckBox()
                .clickOnRemoveButton()
                .verifyThatYouRemoveCheckbox()
                .verifyParagraphSuccessfully()
                .verifyThatInputFieldIsDisabled()
                .clickOnEnableButton()
                .verifYThatInputFieldIsNowEnabled()
                .typeInInputField()
                .backToHomepage();
    }
    @Test
    public void test09DynamicLoadingOnWebPage() throws InterruptedException{
        createReport("Dynamic loading test");
        homePage.clickOnDynamicLoadingLink()
                .clickOnButtonExample1()
                .verifyThatTittleHelloWorldIsNotPresenting()
                .clickOnStartButton()
                .verifyTextAfterClickButtonStart()
                .getBackToPreviousPage()
                .clickOnButtonExample2()
                .backToHomepage();
    }
    @Test
    public void test10EntryAdPage() {
        createReport("Entry AD test");
        homePage.clickOnEntryAdLink()
                .clickOnClose()
                .verifyTitle()
                .backToHomepage();
    }
    @Test
    public void test11DownloadFilePage() {
        createReport("Download file");
        homePage.clickOnFileDownloadLink()
                .clickOnFileTxtToDownload()
                .getTextFromTxtFile()
                .backToHomepage();
    }
    @Test
    public void test12FormAuthenticationPage() throws InterruptedException{
        createReport("Form Authentication");
        homePage.clickOnFormAuthenticationLink()
                .typeUsernameInInputField()
                .clickOnLoginButton()
                .verifyTextWelcometoSecureArea()
                .clickOnLogoutButton()
                .verifyTextLoginPage()
                .getBackToHomepage();
    }
    @Test
    public void test13HorizontalSliderPage() throws InterruptedException {
        createReport("Horizontal slider test");
        homePage.clickOnHorizontalSliderLink()
                .moveSliderFromZeroToFive(50)
                .textFromSpanToCheckIfWeMoveSliderTo5().
                getBackToHomepage();
    }
    @Test
    public void test14HoversOverPageTest(){
        createReport("Testing image hover over");
        homePage.clickOnHoversLink()
                .hoverOnImageOne()
                .hoverOnImageTwo()
                .hoverOnImageThree()
                .getBackToHome();
    }
    @Test
    public void test15InfiniteScrollTest() {
        createReport("Infinite scroll test");
        homePage.clickOnInfiniteScrollLink()
                .scrollToTheEndOfPage()
                .getBackToHomepage();
    }
    @Test
    public void test16InputNumbersTest(){
        createReport("Type number in input field");
        homePage.clickOnNumberInputsLink()
                .typeNumberInInputField()
                .getBackToHomepage();
    }
    @Test
    public void test17JSAlertsPageTest(){
        createReport("Click on alerts and get text from alert");
        homePage.clickOnJsAlertsLink()
                .clickOnFirtsButtonAlerts()
                .verifyResultText()
                .clickOnConfirmButtonAlerts()
                .verifyResultText()
                .clickOnPromptAlertButton()
                .verifyResultText()
                .backToHomepage();
    }
    @Test
    public void test18KeyPressesTest() {
        createReport("Key presses ");
        homePage.clickOnKeyPressesLink()
                .typeLetterInInputField()
                .getBackToHomepage();
    }
    @Test
    public void test19LargeAndDeepDOmTest()  {
        createReport("Large and Deep DOM ");
        homePage.clickOnLargeAndDeepDOMLink()
                .verifyThatAllElementsFromDivIsVisible()
                .getBackToHomepage();
    }
    @Test
    public void test20MultipleWindowsPage(){
        createReport("Multiple windows test");
        homePage.clikcOnMultipleWindowsLink()
                .clickOnButtonNewWindows()
                .verifytextOnNewTab()
                .closeTabAndGetBackToHomepage();
    }
    @Test
    public void test22NotificationMessagePageTest(){
        createReport("Notification message test");
        homePage.clickOnNotificatioLink()
                .getMessageFromDiv()
                .getBackToHomepageFromNotificationPage();
    }
    @Test
    public void test23SecureFileDownLoadTest() throws InterruptedException{
        createReport("Secure file download test");
        homePage.clickOnSecureFileDownloadLink()
                .typeTextForUsernameAndPassword()
                .clickOnDownloadLike().goingToHomepage();
    }
    @Test
    public void test24TyposPageTest(){
        createReport("Verify that typos is visible");
        homePage.clickOnTyposLink().verifyThatTypoIsVisible().getBackToHomepage(); }



    @AfterClass
    public void close(){
        quitDriver();
    }

}
