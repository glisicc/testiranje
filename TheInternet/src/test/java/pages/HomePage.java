package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class HomePage extends MainMethods {

    private final By AB_LINK =By.xpath("//a[@href='/abtest']");
    private final By ADD_REMOVE =By.xpath("//a[@href='/add_remove_elements/']");
    private final By BASIC_AUTH =By.xpath("//a[@href='/basic_auth']");
    private final By CHECKBOXES =By.xpath("//a[@href='/checkboxes']");
    private final By CONTEXT_MENU =By.xpath("//a[@href='/context_menu']");
    private final By DIGESTAUTH =By.xpath("//a[@href='/digest_auth']");
    private final By DISA_ELEMENT =By.xpath("//a[@href='/disappearing_elements']");
    private final By h1Text=By.xpath("//h1");
    private final By DRAG_DROP =By.xpath("//a[@href='/drag_and_drop']");
    private final By DROPDOWN =By.xpath("//a[@href='/dropdown']");
    private final By DY_CONTENT =By.xpath("//a[@href='/dynamic_content']");
    private final By DY_CONTROLS =By.xpath("//a[@href='/dynamic_controls']");
    private final By DY_LOADING =By.xpath("//a[@href='/dynamic_loading']");
    private final By ENTRY_AD =By.xpath("//a[@href='/entry_ad']");
    private final By EXIT_INTENT =By.xpath("//a[@href='/exit_intent']");
    private final By FILE_DOWN =By.xpath("//a[@href='/download']");
    private final By UPLOAD_FILE =By.xpath("//a[@href='/upload']");
    private final By FORM_AUTH =By.xpath("//a[@href='/login']");
    private final By FRAMES =By.xpath("//a[@href='/frames']");
    private final By HORIZONTAL_SLIDER =By.xpath("//a[@href='/horizontal_slider']");
    private final By MULTIPLE_WINDOWS =By.xpath("//a[@href='/windows']");
    private final By NOTI_MESSAGE =By.xpath("//a[@href='/notification_message']");
    private final By ALERT =By.xpath("//a[@href='/javascript_alerts']");
    private final By DOWNLOAD =By.xpath("//a[@href='/download_secure']");
    private final By SHIFTING =By.xpath("//a[@href='/shifting_content']");
    private final By REDIRECTION =By.xpath("//a[@href='/redirector']");
    private final By HOVERS =By.xpath("//a[@href='/hovers']");
    private final By TABLES =By.xpath("//a[@href='/tables']");
    private final By INPUTS =By.xpath("//a[@href='/inputs']");
    private final By UI_MENUS =By.xpath("//a[@href='/jqueryui/menu']");
    private final By LARGE_DOM =By.xpath("//a[@href='/large']");
    private final By SCROLL =By.xpath("//a[@href='/infinite_scroll']");
    private final By KEY_PRESSED =By.xpath("//a[@href='/key_presses']");
    private final By TYPOS =By.xpath("//a[@href='/typos']");
    private final By EDITOR =By.xpath("//a[@href='/tinymce']");


    public AB_Testing clickOnABExample(){
        click(AB_LINK);
        test.log(LogStatus.INFO, "[AbTesting] link is clicked");
        return new AB_Testing();
    }

    public AddRemove clickOnAddRemoveElementsLink(){
        click(ADD_REMOVE);
        test.log(LogStatus.INFO, "[Add/Remove elements] link is clicked.");
        return new AddRemove();
    }

    public Basic_Auth clickOnBasicAuthLink(){
        click(BASIC_AUTH);
        test.log(LogStatus.INFO, "[Basic Auth] link is clicked.");
        return new Basic_Auth();
    }

    public CheckBoxes clickOnCheckboxesLink(){
        click(CHECKBOXES);
        test.log(LogStatus.INFO, "[Checkboxes] link is clicked.");
        return new CheckBoxes();
    }

    public Context_Menu clickOnContestMenuLink(){
        click(CONTEXT_MENU);
        test.log(LogStatus.INFO, "[Contest menu] link is clicked.");
        return new Context_Menu();
    }

    public Digest_Auth clickOnDigestAuthLink(){
        click(DIGESTAUTH);
        test.log(LogStatus.INFO, "[digest auth] link is clicked.");
        return new Digest_Auth();
    }



    public Dropdown clickOnDropDownLink(){
        click(DROPDOWN);
        test.log(LogStatus.INFO, " [dropdown] link is clicked.");
        return new Dropdown();
    }

    public Dynamic_Content clickOnDynamicContentLink(){
        click(DY_CONTENT);
        test.log(LogStatus.INFO, " [dynamic content] link is clicked.");
        return new Dynamic_Content();
    }

    public Dynamic_Controls clickOnDynamicControlsLink(){
        click(DY_CONTROLS);
        test.log(LogStatus.INFO, " [dynamic controls] link is clicked.");
        return new Dynamic_Controls();
    }

    public Dynamic_Loading clickOnDynamicLoadingLink(){
        click(DY_LOADING);
        test.log(LogStatus.INFO, " [dynamic loading] link is clicked.");
        return new Dynamic_Loading();
    }

    public Entry_Ad clickOnEntryAdLink(){
        click(ENTRY_AD);
        test.log(LogStatus.INFO, "Page [Entry Ad] is clicked.");
        return new Entry_Ad();
    }



    public File_Download clickOnFileDownloadLink(){
        click(FILE_DOWN);
        test.log(LogStatus.INFO, " [File download] link is clicked.");
        return new File_Download();
    }


    public Form_Authentication clickOnFormAuthenticationLink(){
        click(FORM_AUTH);
        test.log(LogStatus.INFO, " [Form Authentication] link is clicked.");
        return new Form_Authentication();
    }



    public Horizontal_Slider clickOnHorizontalSliderLink(){
        click(HORIZONTAL_SLIDER);
        test.log(LogStatus.INFO, " [Horizontal slider] link is clicked.");
        return new Horizontal_Slider();
    }

    public Hovers clickOnHoversLink(){
        click(HOVERS);
        test.log(LogStatus.INFO, " [hovers] link is clicked.");
        return new Hovers();
    }

    public Infinite_Scroll clickOnInfiniteScrollLink(){
        click(SCROLL);
        test.log(LogStatus.INFO, " [infinite scroll] link is clicked.");
        return new Infinite_Scroll();
    }

    public Inputs clickOnNumberInputsLink(){
        click(INPUTS);
        test.log(LogStatus.INFO, " [inputs]link is clicked.");
        return new Inputs();
    }


    public JS_Alerts clickOnJsAlertsLink(){
        click(ALERT);
        test.log(LogStatus.INFO, " [JS alerts] link is clicked.");
        return new JS_Alerts();
    }

    public KeyPresses clickOnKeyPressesLink(){
        click(KEY_PRESSED);
        test.log(LogStatus.INFO, " [key presses] link is clicked.");
        return new KeyPresses();
    }

    public LargeAndDeepDOM clickOnLargeAndDeepDOMLink(){
        click(LARGE_DOM);
        test.log(LogStatus.INFO, " [Large and deep dom] link is clicked.");
        return new LargeAndDeepDOM();
    }

    public Multi_Windows clikcOnMultipleWindowsLink(){
        click(MULTIPLE_WINDOWS);
        test.log(LogStatus.INFO, " [Multiple windows] link is clicked.");
        return new Multi_Windows();
    }

    public NotificationMess clickOnNotificatioLink(){
        click(NOTI_MESSAGE);
        test.log(LogStatus.INFO, " [Notification message]link is clicked.");
        return new NotificationMess();
    }



    public SecureFileDownload clickOnSecureFileDownloadLink(){
        click(DOWNLOAD);
        test.log(LogStatus.INFO, " [Secure file download] link is clicked.");
        return new SecureFileDownload();
    }
    
    public Typos clickOnTyposLink(){
        click(TYPOS);
        test.log(LogStatus.INFO, " [Typos] link is clicked.");
        return new Typos();
    }


}
