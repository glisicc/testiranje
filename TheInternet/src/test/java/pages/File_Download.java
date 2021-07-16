package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Download extends MainMethods {
    private final By FILE = By.xpath("//a[2]");

    public File_Download clickOnFileTxtToDownload() {
        click(FILE);
        test.log(LogStatus.INFO, "File is clicked.");
        return this;
    }
    private static final String FILENAME = "C://Users//stefan//Downloads";
    BufferedReader br = null;
    FileReader fr = null;
    public File_Download getTextFromTxtFile() {
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                test.log(LogStatus.INFO, "" + sCurrentLine);
            }
        } catch (  IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return this;
    }
    public HomePage backToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new HomePage();
    }
}
